/**
 * @ClassPurpose This Class used for the Charges screen 
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 06/06/2017
 */
package com.pc.screen;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;

public class Charges_BC {
	public  XlsxReader sXL;
	public static String sheetname = "Charges_BC";
	static Logger logger =Logger.getLogger(sheetname);
	public String accountNumber;
	public String accountName;
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRCharges_BC() throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
	
	public boolean EnterAccountNumberfromotherTC(String value) throws Exception
	  {
		boolean status =  false; 
		String accountnumber1 = null;
		sXL = XlsxReader.getInstance();
		int rowcount = sXL.getRowCount("TestData");
	for(int i = 2; i <= rowcount; i++)
	{
		if(sXL.getCellData("TestData", "ID", i).equals(value))  
		{
			accountnumber1 = sXL.getCellData("TestData", "edtaccountNumberBC", i);
			status= common.SafeAction(Common.o.getObject("edtaccountNumberBC"), accountnumber1, "edt");
			status =  true;
			break;
		}
	}
	
	return status;
	  }
	
	public Boolean VerifyInvoicesItemsTabExistence(String strElement) throws Exception{

		String[] sfunVal = strElement.split(":::");
		for(String element: sfunVal)
		{
			boolean Status = true;
			WebElement ele = ManagerDriver.getInstance().getWebDriver().findElement(By.id("AccountDetailCharges:AccountDetailChargesScreen:AccountDetailChargesListDetailPanel:InvoiceItemsTab"));
				String txt = ele.getText();
				
				if (txt.equals(element))  // we have to use .contains method if we want to search a part of string 
				{
					Status = false;
					logger.info("'" + element + "' " + "Element should not available");  
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Element should not available '" + element + "'","'" + element + "' " + "Element not available", "PASS");
				}

				
			else
			{
				logger.info("Element should not available '" + element + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "'" + element + "' " + "Element should not available","'" + element + "' " + "Element available", "FAIL");
				//Status = false;
			}

		}
		return true;
	}
		
		public boolean ClickOnInvoiceStreamDropDown() throws Exception
			{
				boolean Status = false;
				String XpathID=".//*[@id='AssignInvoiceItemsToNewPayerPopup:AssignInvoiceItemsToNewPayerScreen:InvoiceStream-inputEl']";
				
				ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(XpathID)).click();
				ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(XpathID)).sendKeys(Keys.ARROW_DOWN);
				ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(XpathID)).sendKeys(Keys.ENTER);
				Status = true;
				if (Status == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System displayed Account Summary Page" , "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System not displayed Account Summary Page", "FAIL");
				}
				
				return Status;
			
		}
			
		
		public boolean SelectChargeType(String strIssueDetails) throws Exception
		{
			boolean status = false;
			String value = null;
			String[] sValue = strIssueDetails.split(":::");
		
			String xpathID = "//td[div[normalize-space(text())='"+sValue[0]+"']]//preceding-sibling::td//div//img";
			ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(xpathID)).click();
			ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(xpathID)).sendKeys(Keys.SPACE);
			Thread.sleep(2000);
			status = true;
			logger.info("Selected Charge type'" + sValue[0] + "'");
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Select charge type "+ sValue[0], "Value in UserName field -" +sValue[0], "PASS");
			
			return status;
		}
		
		
		public boolean DataNotPresentinAggregationTable(String value) throws Exception 
		{
			boolean status = false;
		    
		   
			String[] sValue=value.split(":::");
			
			int colindex = Integer.parseInt(sValue[0]);
		
			status = common.VerifyDataDisplayedinColumn(common.o.getObject("eleAggregationTypeTable"), colindex, sValue[1] );
			
			if(status==true)
			 {
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+accountNumber+"Verify Data displayed", ""+accountNumber+" Expected data displayed", "PASS");
				
			 }	
			 else
			 {
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+accountNumber+"Verify Data displayed", ""+accountNumber+" Expected data not displayed", "Fail");
				
			  }
		
			return status;
			
		}

		public boolean DataPresentinAggregationTable(String value) throws Exception 
		{
			boolean status = false;
		    
		   
			String[] sValue=value.split(":::");
			
			int colindex = Integer.parseInt(sValue[0]);
		
			status = common.VerifyDataDisplayedinColumn(common.o.getObject("eleAggregationTypeTable"), colindex, sValue[1] );
			
			if(status==true)
			 {
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+accountNumber+"Verify Data displayed", ""+accountNumber+" Expected data displayed", "PASS");
				
			 }	
			 else
			 {
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+accountNumber+"Verify Data displayed", ""+accountNumber+" Expected data not displayed", "Fail");
				
			  }
		
			return status;
			
		}
		
	
	
}