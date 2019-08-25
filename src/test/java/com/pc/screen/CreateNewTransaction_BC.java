package com.pc.screen;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class CreateNewTransaction_BC {
	
	public static String sheetname = "CreateNewTransaction_BC";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRCreateNewTransaction_BC () throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
	
	public boolean DefaultEffectiveDate() throws Exception
	{
		boolean status = false;
		String sCurrentDate = SCRCommon.ReturnCurrentDate();
		status = common.SafeAction(Common.o.getObject("edtDisbursementDueDate"), sCurrentDate, "edt");
		return status;
	}

	
	public boolean TransactionOption(String value) throws Exception 
	{
		boolean status = false;
		
		
		
		
		try
		{
			ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject(value)).click();
			ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject(value)).sendKeys(Keys.RIGHT);
			status = true;
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
		return status;
	}
	public boolean ClickOnInvoiceStreamDropDown() throws Exception
	{
		boolean Status = false;
		
		//String XpathID=".//*[@id='UnappliedFunds-inputEl']";
		String XpathID=".//input[contains(@id,'UnappliedFunds-inputEl')]";
		//hm.put("edtCommonPrefix", By.xpath(".//input[contains(@id,'Prefix-inputEl')]"));
		//span[contains(@class,'page-last')]
		
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
	
	public boolean ClickCreditInvoiceStream() throws Exception
	{
		boolean Status = false;
		String  xpathID="AccountNewCreditWizard:CreditDetailsScreen:DesignatedUnapplieds-inputEl";
		//String XpathID=".//input[contains(@id='UnappliedFunds-inputEl')]";
		ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(xpathID)).click();
		ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(xpathID)).sendKeys(Keys.ARROW_DOWN);
		ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(xpathID)).sendKeys(Keys.ENTER);
		Status = true;
		if (Status == true)
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should click on invoice number","System should click on invoice number", "PASS");	
		}
		else
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should click on invoice number","System not	 clicked on invoice number", "FAIL");
		}
		
		return Status;

	}
	public boolean SelectOnTable(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		int Rowindex = Integer.parseInt(sValue[0]);
		int Colindex = Integer.parseInt(sValue[1]);
		status = common.SelectEditBoxInTableBasedonRowColIndex(Common.o.getObject("eleTransferDetails"), Rowindex, Colindex);
		if(status==true)
		 {
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify editbox Selected", "editbox selected", "PASS");
			
		 }	
		 else
		 {
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify editbox not Selected", "editbox selected", "Fail");
			
		  }


		return status;
	}
	public boolean ClickOnInvoiceStreamRecapture() throws Exception
	{
		boolean Status = false;
		
		String XpathID=".//*[@id='AccountNewRecaptureWizard:RecaptureDetailsScreen:UnappliedFund-inputEl']";
		//span[contains(@class,'page-last')]
		
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
	public boolean EnterAccountNumberfromotherTC(String value) throws Exception
	  {
		boolean status =  false; 
		String accountnumber1 = null;
		XlsxReader sXL = XlsxReader.getInstance();
		int rowcount = sXL.getRowCount("Login");
	for(int i = 2; i <= rowcount; i++)
	{
		if(sXL.getCellData("TestData", "ID", i).equals(value))  
		{
			accountnumber1 = sXL.getCellData("TestData", "edtaccountNumberBC", i);
			status=common.SafeAction(Common.o.getObject("edtaccountNumberBC"), accountnumber1, "edt");
			status =  true;
			break;
		}
	}
	
	return status;
	  }
}