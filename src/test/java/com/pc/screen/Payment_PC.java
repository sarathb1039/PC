/**
 * @ClassPurpose This Class used for the Create Accounts
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 3/24/2017
 */
package com.pc.screen;

import java.util.HashMap;
import org.apache.log4j.Logger;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;

public class Payment_PC {
	public  XlsxReader sXL; // Excel Read Object
	public static String sheetname = "Payment_PC";
	static Logger logger =Logger.getLogger(sheetname);
	public String accountNumber;
	public String accountName;
	public String policynumber;
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRPayment_PC() throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
	public boolean ApproveUWIssue(String strIssueDetails) throws Exception
	{
		boolean status = false;
		String value = null;
		String[] sValue = strIssueDetails.split(":::");
		
		status = common.SafeAction(Common.o.getObject("eleRiskAnalysispage"), "YES", "ele");
		status = common.ActionOnTable(Common.o.getObject("eleIssuesTable"), 1,0, sValue[0],"img");
		status = common.SafeAction(Common.o.getObject("eleUWApprove"), "YES", "ele");
		status = common.SafeAction(Common.o.getObject("eleCommonOK"), "YES", "ele");
		
		
		
		HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate UserName field value", "Value in UserName field -" +value, "PASS");
		
		return status;
	}
	
	public boolean UpdatePolicyNumber() throws Exception
	{
		HashMap<String,Object> updateColumnNameValues = new HashMap<String,Object>();
		HashMap<String,Object> whereConstraint = new HashMap<String,Object>();
		XlsxReader sXL = XlsxReader.getInstance();
		common.WaitForElementExist(Common.o.getObject("elePolicyNumberText"), Integer.valueOf(HTML.properties.getProperty("SHORTWAIT")));
		policynumber = common.ReadElement(Common.o.getObject("elePolicyNumberText"), Integer.valueOf(HTML.properties.getProperty("SHORTWAIT")));
		policynumber = policynumber.substring(19, 31);
		logger.info("Submission Created ::Submission Number '" +policynumber+ "'");
		PCThreadCache.getInstance().setProperty(PCConstants.CACHE_POLICY_NUMBER, policynumber);
		updateColumnNameValues.put(PCConstants.PolicyNumber, policynumber);
		whereConstraint.put(PCConstants.ID, PCThreadCache.getInstance().getProperty("TCID"));
		sXL.executeUpdateQuery(PCConstants.SHEET_TestData,  updateColumnNameValues,  whereConstraint );
		//Marking objects for Garbage collection
		HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Update the PolicyNumber in Test Dat sheet", "Update the PolicyNumber-" +policynumber, "PASS");
		whereConstraint = null;
		updateColumnNameValues = null;
		common.SafeAction(Common.o.getObject("elePolicyNumberText"), "elePolicyNumberText", "ele");
		return true;
	}
	
	public boolean SelectPaymentPlan(String strIssueDetails) throws Exception
	{
		boolean status = false;
		String value = null;
		String[] sValue = strIssueDetails.split(":::");
	
		String xpathID = "//td[div[normalize-space(text())='" +sValue[0]+ "']]//preceding-sibling::td//div//div";
		ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(xpathID)).sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		status = true;
		logger.info("Selected Payment Plan'" + sValue[0] + "'");
		HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Select Payment Plan"+ sValue[0], "Value in UserName field -" +sValue[0], "PASS");
		
		return status;
	}
	
	public boolean ChangePolicyIssuance() throws Exception
	{
		boolean status = false;
		System.out.println("Policy Issuance");
		
		try {
			Thread.sleep(2000);
		status = common.SafeAction(Common.o.getObject("elePaymentPC"), "elePaymentPC", "elePaymentPC");
		
		Thread.sleep(3000);
		
		if(ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("eleCPAddRemarks")).isDisplayed()==true)
		{
		status = common.SafeAction(Common.o.getObject("eleCPAddRemarks"), "eleCPAddRemarks", "eleCPAddRemarks");
		ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("edtCPAddRemarksInput")).sendKeys("Automation Policy Change");
		status = common.SafeAction(Common.o.getObject("eleCommonUpdate"), "eleCommonUpdate", "eleCommonUpdate");
		}
		
		status = common.SafeAction(Common.o.getObject("eleCPIssuePolicy"), "eleCPIssuePolicy", "eleCPIssuePolicy");
		status = common.SafeAction(Common.o.getObject("eleCommonOK"), "eleCommonOK", "eleCommonOK");
		Thread.sleep(2000);
		
		Thread.sleep(5000);
		for(int i = 0; i <= 100; i++)
		{
			status = PaymentOptions("Change","Change", "Change");
			
		
			if (ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("eleDetails")).isDisplayed()==true)
			{
				System.out.println("clicked on detail" + i);
				Thread.sleep(5000);
				status = common.SafeAction(Common.o.getObject("eleDetails"), "YES", "ele");
				status = common.ApproveUWIssueTable("IssueTable");
				Thread.sleep(3000);
				status = common.SafeAction(Common.o.getObject("elePaymentPC"), "YES", "ele");
				
				Thread.sleep(5000);
				status = common.SafeAction(Common.o.getObject("eleCPIssuePolicy"), "eleCPIssuePolicy", "eleCPIssuePolicy");
				status = common.SafeAction(Common.o.getObject("eleCommonOK"), "eleCommonOK", "eleCommonOK");
				if (ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("eleCPIssuePolicy")).isDisplayed()	==true)
				{
					status = common.SafeAction(Common.o.getObject("eleCPIssuePolicy"), "eleCPIssuePolicy", "eleCPIssuePolicy");
					status = common.SafeAction(Common.o.getObject("eleCommonOK"), "eleCommonOK", "eleCommonOK");
				}
				
				break;
			}
			 
		}	
		}
		catch (Exception e) {
		//status = common.SafeAction(Common.o.getObject("elePolicyNumberText"), "YES", "ele");
		status=true;
		
		}
		if (status==true)
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Successfully clicked Bind Only", "Successfully clicked Bind Only", "PASS");			
		}
		else
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Failed to click Bind Only", "Failed to click Bind Only", "FAIL");			
		}
		
		
		return true;
	}
	
	public boolean PolicyIssuance(String strBind1) throws Exception
	{
		boolean status = false;
		String TransactionType = null;
		
		String[] strBind = strBind1.split(":::");
		TransactionType = common.ReadElement(Common.o.getObject("eleSubmissionNumberQuote"), Integer.valueOf(HTML.properties.getProperty("SHORTWAIT")));
		System.out.println(TransactionType);
		
		status = common.SafeAction(Common.o.getObject("elePaymentPC"), "elePaymentPC", "elePaymentPC");
		Thread.sleep(10000);
		status = common.SafeAction(Common.o.getObject("elePaymentBindOptions"), "elePaymentBindOptions", "elePaymentBindOptions");
		
		
		System.out.println(TransactionType);
		if (TransactionType.contains("Renewal"))
		{
			status = common.SafeAction(Common.o.getObject("ele"+strBind[0]), "ele"+strBind[0], "ele"+strBind[0]);
			Thread.sleep(3000);
			System.out.println("ok button is available");
			status = common.SafeAction(Common.o.getObject("eleCommonOK"), "eleCommonOK", "eleCommonOK");
		}
		else
		{
			status = common.SafeAction(Common.o.getObject("elj"+strBind[0]), "elj"+strBind[0], "elj"+strBind[0]);
		}
		//status = common.SafeAction(Common.o.getObject("eleCommonOK"), "elePaymentPC", "ele");
		System.out.println(status);
		Thread.sleep(5000);
		
			for(int i = 0; i<10; i++)
			{
				System.out.println("Check " + i);
				
				status = PaymentOptions(strBind[0],TransactionType, "NotChange");
				try
				{
				if (ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("eleDetails")).isDisplayed()	==true) 
				{
					System.out.println("details button is displayed");
					Thread.sleep(5000);
					
					status = common.SafeAction(Common.o.getObject("eleRiskAnalysispage"), "eleRiskAnalysispage", "eleRiskAnalysispage");
					status = common.ApproveUWIssueTable("IssueTable");
					status = common.SafeAction(Common.o.getObject("elePaymentPC"), "elePaymentPC", "ele");
					Thread.sleep(5000);
					status = common.SafeAction(Common.o.getObject("elePaymentBindOptions"), "elePaymentBindOptions", "ele");
					System.out.println(strBind1);
					
					//status = common.SafeAction(Common.o.getObject("eleCommonOK"), "YES", "ele");
					System.out.println(TransactionType);
					if (TransactionType.contains("Renewal"))
					{
						status = common.SafeAction(Common.o.getObject("ele"+strBind[0]), "ele"+strBind[0], "ele"+strBind[0]);
						Thread.sleep(3000);
						System.out.println("ok button is available");
						status = common.SafeAction(Common.o.getObject("eleCommonOK"), "eleCommonOK", "eleCommonOK");
					}
					else
					{
						status = common.SafeAction(Common.o.getObject("elj"+strBind[0]), "elj"+strBind[0], "elj"+strBind[0]);
					}
					System.out.println("UWI issues completed");
				}
				else if(ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("elePolicyNumberText")).isDisplayed()==true)
				{
					status = true;
					System.out.println("Status " +status+ "End");
					break;
				}
				} catch (Exception e) {
					//status = common.SafeAction(Common.o.getObject("elePolicyNumberText"), "YES", "ele");
					System.out.println(e);
					
					return true;
					
				}
				
			}
		
		
		
		//status = common.SafeAction(Common.o.getObject("elePolicyNumberText"), "elePolicyNumberText", "ele");
		
		
		if (status==true)
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Successfully clicked Bind Only", "Successfully clicked Bind Only", "PASS");			
		}
		else
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Failed to click Bind Only", "Failed to click Bind Only", "FAIL");			
		}
		
		return status;
	}
	
public boolean PaymentOptions(String strBind1, String TransType, String Type)throws Exception
{
	System.out.println("calling paymentoptions temp function");
	boolean status = false;
	try
	{
		if(ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("elePolicyNumberText")).isDisplayed()==true)
		{
			status = true;
			System.out.println("Status " +status+ "End");
			return true;
		}
		
	}
	catch (Exception e) {
		//status = common.SafeAction(Common.o.getObject("elePolicyNumberText"), "YES", "ele");
		System.out.println(e);
		
		
		
	}
	switch (Type)
	{
	case "NotChange":
	try
	{
	//while(ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("elePaymentBindOptions")).isDisplayed())
		if(ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("elePaymentBindOptions")).isDisplayed()==true)
	{
		status = common.SafeAction(Common.o.getObject("elePaymentPC"), "elePaymentPC", "elePaymentPC");
		Thread.sleep(5000);
		status = common.SafeAction(Common.o.getObject("elePaymentBindOptions"), "elePaymentBindOptions", "elePaymentPC");
		//status = common.SafeAction(Common.o.getObject("elj"+strBind1), "elj"+strBind1, "elj"+strBind1);
		if (TransType.contains("Renewal"))
		{
			status = common.SafeAction(Common.o.getObject("ele"+strBind1), "ele"+strBind1, "ele"+strBind1);
			Thread.sleep(3000);
			System.out.println("ok button is available");
			status = common.SafeAction(Common.o.getObject("eleCommonOK"), "eleCommonOK", "eleCommonOK");
		}
		else
		{
			status = common.SafeAction(Common.o.getObject("elj"+strBind1), "elj"+strBind1, "elj"+strBind1);
		}
	}
	} catch (Exception e) {
		//status = common.SafeAction(Common.o.getObject("elePolicyNumberText"), "YES", "ele");
		System.out.println(e);
		
		return true;
		
	}
	break;
	case "Change":
		try
		{
		if (ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("eleCPIssuePolicy")).isDisplayed()==true)
		{
			status = common.SafeAction(Common.o.getObject("eleCPIssuePolicy"), "eleCPIssuePolicy", "eleCPIssuePolicy");
			status = common.SafeAction(Common.o.getObject("eleCommonOK"), "eleCommonOK", "eleCommonOK");
		}
		} catch (Exception e) {
			//status = common.SafeAction(Common.o.getObject("elePolicyNumberText"), "YES", "ele");
			System.out.println(e);
			
			return true;
			
		}
	case "Details":
		//build it in future
	}
	
return true;

}
	
}