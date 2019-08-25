/**
 * @ClassPurpose This Class used for the Create Accounts
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 06/06/2017
 */
package com.pc.screen;

import java.util.HashMap;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;

public class NewAccount_BC {
	
	public static String sheetname = "NewAccount_BC";
	static Logger logger =Logger.getLogger(sheetname);
	public String accountNumber;
	public String anotherPolicyNum;
	public String accountName;
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRNewAccount_BC() throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
	
	
	
	
	public boolean AddPlans_BC(String strPaymentPlans) throws Exception
	{
		boolean status = false;
		//String value = null;
		//String[] sValue = strPaymentPlans.split(":::");
		//status = common.ActionOnTable(Common.o.getObject("eleAddPlans_BC"), 8,0, sValue[0],"img");
	
		String xpathID = "//td[div/a[normalize-space(text())='"+strPaymentPlans+"']]//preceding-sibling::td//div//img";
		ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(xpathID)).click();
		ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(xpathID)).sendKeys(Keys.SPACE);
		status = true;
		HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "AddPlans_BC"+ strPaymentPlans, "Value in UserName field -" +strPaymentPlans, "PASS");
		
		return status;
	}
	
	
	public boolean ClickOnCloseAccount() throws Exception{
		{
			boolean Status = false;
			String XpathID=".//*[@id='AccountSummary:AccountSummaryScreen:CloseAccountButton-btnEl']";
			
			
			ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(XpathID)).click();
			
			Status = true;
			if (Status == false)
			{
					
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Account Can Not Be Closed  ","Account Can Be Closed " , "FAIL");
			}
			else
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Account Can Not Be Closed ","Account Can Not Be Closed ", "PASS");
			}
			
		
		
	
		return Status;
	
		}
	}
	
	/*public void Standardize(){
		logger.info("Account Address is going to be standardized");
		
	}*/
	
	/**
	 * @function Use to update the account number
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean UpdateAccountNumber() throws Exception{
		HashMap<String,Object> updateColumnNameValues = new HashMap<String,Object>();
		HashMap<String,Object> whereConstraint = new HashMap<String,Object>();
		try{
			Boolean status = true;
			if(common.WaitUntilClickable(Common.o.getObject("eleAccountNumberBC"),  Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT"))))
			{
				XlsxReader sXL = XlsxReader.getInstance();
				accountNumber = common.ReadElement(Common.o.getObject("eleAccountNumberBC"), 30);
				accountNumber = accountNumber.substring(9);
//				 anotherPolicyNum="3".concat(accountNumber.substring(1));
//				System.out.println(anotherPolicyNum);
				
				//System.out.println(accountNumber);
				PCThreadCache.getInstance().setProperty(PCConstants.CACHE_ACCOUNT_NUMBER, accountNumber);
				updateColumnNameValues.put(PCConstants.AccountNumber, accountNumber);
				whereConstraint.put(PCConstants.ID, PCThreadCache.getInstance().getProperty("TCID"));
				status = sXL.executeUpdateQuery(PCConstants.SHEET_NEWACCOUNT_BC, updateColumnNameValues, whereConstraint);
				
				updateColumnNameValues.clear();
				whereConstraint.clear();
				updateColumnNameValues.put(PCConstants.PolicyNumber_BC, accountNumber);
				whereConstraint.put(PCConstants.ID, PCThreadCache.getInstance().getProperty("TCID"));
				status = sXL.executeUpdateQuery(PCConstants.SHEET_ADDPOLICY,  updateColumnNameValues,  whereConstraint);
			
				updateColumnNameValues.clear();
				whereConstraint.clear();
				updateColumnNameValues.put(PCConstants.AccountNumber_BC, accountNumber);
				whereConstraint.put(PCConstants.ID, PCThreadCache.getInstance().getProperty("TCID"));
				status = sXL.executeUpdateQuery(PCConstants.SHEET_SEARCHACCOUNT_BC,  updateColumnNameValues,  whereConstraint);
				
				updateColumnNameValues.clear();
				whereConstraint.clear();
				updateColumnNameValues.put(PCConstants.AccountNumber_BC, accountNumber);
				whereConstraint.put(PCConstants.ID, PCThreadCache.getInstance().getProperty("TCID"));
				status = sXL.executeUpdateQuery(PCConstants.SHEET_TestData,  updateColumnNameValues,  whereConstraint);
				
				updateColumnNameValues.clear();
				whereConstraint.clear();
				updateColumnNameValues.put(PCConstants.PolicyNumber_BC, accountNumber);
				whereConstraint.put(PCConstants.ID, PCThreadCache.getInstance().getProperty("TCID"));
				status = sXL.executeUpdateQuery(PCConstants.SHEET_TestData,  updateColumnNameValues,  whereConstraint);
			
				updateColumnNameValues.clear();
				whereConstraint.clear();
				updateColumnNameValues.put(PCConstants.OpenPolicyNumber, accountNumber);
				whereConstraint.put(PCConstants.ID, PCThreadCache.getInstance().getProperty("TCID"));
				status = sXL.executeUpdateQuery(PCConstants.VerifyPolicies_BC,  updateColumnNameValues,  whereConstraint);
			
				//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update CreateAccount Set AccountNumber = '"+accountNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
				logger.info("System displayed Account Summary Page with Account Number: " + accountNumber);  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page with Account Number","System displayed Account Summary Page with Account Number: '" + accountNumber + "'", "PASS");
				status = true;
			}
			else
			{
				logger.info("System not displayed Account Summary Page");
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page with Account Number","System not displayed Account Summary Page", "FAIL");
				status = false;
			}
			return status;
		}finally
		{
			updateColumnNameValues = null;
			whereConstraint = null;
		}
		
	}
}