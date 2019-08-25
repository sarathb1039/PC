/**
 * @ClassPurpose This Class used for the Add Policy 
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 06/06/2017
 */
package com.pc.screen;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.ss.formula.functions.Today;

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
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Payment_BC {
	
	public static String sheetname = "Payment_BC";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRPayment_BC () throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}

public boolean ToAdditem(String value) throws Exception 
{
	boolean status = false;
	 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	 
	 //get current date time with Date()
	 Date date = new Date();
	 
	 // Now format the date
	 String date1= dateFormat.format(date);
	
	if(value.equals("TODAY"))
	{
		value = date1.toString();
		System.out.println(value);
	}
	
	String[] sValue = value.split(":::");
	try
	{
		status = common.ActionOnTable(Common.o.getObject("eleAdditemList"), 7,0, value,"img");
		if (status == true)
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Action on cell", "Value in field -" +value, "PASS");	
		}
		else
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Action on cell", "Value in field -"+value, "FAIL");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return status;
}

public boolean PaymentOption(String value) throws Exception 
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
public boolean ClickInvoiceStreamDropDown() throws Exception
{
	boolean Status = false;
	String XpathID=".//*[@id='NewDirectBillPayment:EditDBPaymentScreen:PaymentDetailsDV:UnappliedFunds-inputEl']";
	
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

public boolean VerifyAmount() throws Exception{
	{
		boolean Status = false;
		String XpathID=".//*[@id='ModifyDirectBillPaymentPopup:EditDBPaymentScreen:PaymentDetailsDV:Amount-bodyEl']";
		
		
		ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(XpathID)).click();
		
		Status = true;
		if (Status == false)
		{
				
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Amount can not be edited  ","Amount can  be edited   " , "FAIL");
		}
		else
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Amount can not be edited   ","Amount can not be edited  ", "PASS");
		}
		
	
	

	return Status;

	}
}

public boolean ClickOnInvoicePayment() throws Exception
{
	boolean Status = false;
	
	String XpathID=".//div[@id='DirectBillAddInvoiceItemsPopup:InvoiceItemSearchPanelSet:InvoiceItemsLV-body']/div/div/table[1]/tbody/tr/td[1]";
	//span[contains(@class,'page-last')]
	//div[@id ='DirectBillAddInvoiceItemsPopup:InvoiceItemSearchPanelSet:InvoiceItemsLV-body']/div/div/table[1]/tbody/tr/td/div[1]/img
	
	ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(XpathID)).click();
	//ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(XpathID)).sendKeys(Keys.ARROW_DOWN);
	ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(XpathID)).sendKeys();
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
public boolean ValidatePaymentInstrument(String value) throws Exception 
{
	boolean status = false;

	String[] sValue = value.split(":::");

	try
	{

		status = common.VerifyTextFromTable(Common.o.getObject("elePaymentsTT_BC"), Integer.parseInt(sValue[0]),Integer.parseInt(sValue[1]),sValue[2]);

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return status;
}
public boolean ClickInvoiceStream() throws Exception
{
	boolean Status = false;
	String XpathID=".//*[@id='MoveDirectBillPayment:EditDBPaymentScreen:PaymentDetailsDV:UnappliedFunds-inputEl']";
	//String XpathID=".//input[contains(@id='UnappliedFunds-inputEl')]";
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

/**
 * this fun is useful for sending the amount to the Distibution amount table to select and data syntax has to be numofinvoice:::rowNum:::columnNum:::amount
 * 
 * @param inputString
 * @return
 * @throws Exception 
 */

public boolean  DistributionAmountTableInput(String inputString) throws Exception{
	boolean status=false;
	String[] sValue=inputString.split(":::");
	int rowNum=Integer.parseInt(sValue[1]);
	int inputColumnNum=Integer.parseInt(sValue[2]);
	String xpathId=".//div[contains(@id,'DistributionAmountsLV-body')]//table["+sValue[0]+"]";
	WebElement mytable = ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(xpathId));
	List<WebElement> allrows = mytable.findElements(By.tagName("tr"));
	List<WebElement> Cells = allrows.get(rowNum).findElements(By.tagName("td"));
	Cells.get(inputColumnNum).click();
	Thread.sleep(2000);
	Cells.get(inputColumnNum).sendKeys(sValue[3]);
	
	status=true;
	if (status == true)
	{
		HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System displayed Account Summary Page" , "PASS");	
	}
	else
	{
		HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System not displayed Account Summary Page", "FAIL");
	}
	
	
	
	return status;
	
	
	
}
public boolean ClickCreditInvoiceStream() throws Exception
{
	boolean Status = false;
	String XpathID=".//*[@id='NewDirectBillCreditDistribution:EditDBPaymentScreen:PaymentDetailsDV:UnappliedFunds-inputEl']";
	//String XpathID=".//input[contains(@id='UnappliedFunds-inputEl')]";
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
public boolean SelectCheckboxinDistributionTable(String value) throws Exception 
{
	boolean status = false;
	String[] sValue = value.split(":::");
	int Rowindex = Integer.parseInt(sValue[0]);
	int Colindex = Integer.parseInt(sValue[1]);
	String SendSpace = sValue[2];
	
     status = common.SelectCheckBoxOnTableBasedonRowColIndex(Common.o.getObject("eleInvoiceTT_BC"), SendSpace,Rowindex, Colindex);
	
	if(status==true)
	 {
		HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify checkbox Selected", "Checkbox selected", "PASS");
		
	 }	
	 else
	 {
		HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify checkbox Selected", "Checkbox selected", "Fail");
		
	  }

	return status;
}



}