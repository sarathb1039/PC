/**
 * @ClassPurpose This Class used for the Verify History
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 06/06/2017
 */
package com.pc.screen;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

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
import java.text.SimpleDateFormat;


public class EditChargeHoldStatus_BC {
	public  XlsxReader sXL;
	public static String sheetname = "EditChargeHoldStatus_BC";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCREditChargeHoldStatus_BC () throws Exception{

					Boolean status = true;
					
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
	/**
	 * @function This function use to verify types of policies displayed and by clicking on validate policie detailes 
	 * @param value(LOB & System)
	 * @return status
	 * @throws Exception
	 */
	public boolean VerifyInHistoryTableforUpdateddata(String value) throws Exception 
	{
		boolean status = false;
	    
	    
		String invoicenumber = common.GetTextFromTable(Common.o.getObject("eleInvoicetable"), 0, 3);
		
		String Expecteddata = value +invoicenumber;
		
		
		ManagerDriver.getInstance().getWebDriver().findElement(By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailHistory")).click();
		
		Thread.sleep(10);
		
		status = common.VerifyDataDisplayedColumn(Common.o.getObject("eleHistoryTable_BC"), 3, Expecteddata);
		
		if(status==true)
		 {
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+Expecteddata+"Verify Data displayed", ""+Expecteddata+" Expected data displayed", "PASS");
			
		 }	
		 else
		 {
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+Expecteddata+"Verify Data displayed", ""+Expecteddata+" Expected data not displayed", "Fail");
			
		 }
	
		return status;
		
	}
	
	public boolean SelectCheckboxinChargestable(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		int Rowindex = Integer.parseInt(sValue[0]);
		int Colindex = Integer.parseInt(sValue[1]);
		String SendSpace = sValue[2];
		
         status = common.SelectCheckBoxOnTableBasedonRowColIndex(Common.o.getObject("eleChargesTable_BC"), SendSpace,Rowindex, Colindex);
		
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
	
	
	public boolean ChangeChargeHoldsStatus(String value) throws Exception 
	{
		boolean status = false;
		
		String[] sValue = value.split(":::");
		int Rowindex = Integer.parseInt(sValue[0]);
		int Colindex = Integer.parseInt(sValue[1]);
		
		try
		{
			status = common.ClickOnCellByDependsOnRowColumnIndex(Common.o.getObject("eleChargesHoldTable_BC"),Rowindex,Colindex);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	
	
	/**
	 * @function This function use to Enter Premium based on param
	 * @param value(LOB & System)
	 * @return status
	 * @throws Exception
	 */
	public boolean VerifyAddPayerFunctionality(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		int Colindex = Integer.parseInt(sValue[0]);
		
		
		try
		{
			status = common.VerifyOnlyExpectedDataDisplayedColumn(Common.o.getObject("eleInvoiceItemsTable_BC"), Colindex,sValue[1]);
			Thread.sleep(20);
			if (status == true)
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System displayed Account Summary Page" , "PASS");	
			}
			else
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System not displayed Account Summary Page", "FAIL");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public boolean EnterAccountNumberfromotherTC(String value) throws Exception
	  {
		boolean status =  false; 
		String accountnumber1 = null;
		sXL = XlsxReader.getInstance();
		int rowcount = sXL.getRowCount("SearchAccount_BC");
	for(int i = 2; i <= rowcount; i++)
	{
		if(sXL.getCellData("SearchAccount_BC", "ID", i).equals(value))  
		{
			accountnumber1 = sXL.getCellData("SearchAccount_BC", "edtaccountNumber_BC", i);
			status= common.SafeAction(Common.o.getObject("edtNewPayer_BC"), accountnumber1, "edt");
			status =  true;
			break;
		}
	}
	
	return status;
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
	
	
	public boolean DefaultTommorrowDate() throws Exception
	{
		boolean status = false;
		String strDate;
		String strformatedDate  = null;
		Calendar Date = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf);
		Date.add(Calendar.DATE,+1);
		strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
		
		status = common.SafeAction(Common.o.getObject("edtChargeHoldRdate"), strDate, "edt");
		if (status == true)
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +strDate, "PASS");	
		}
		else
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+strDate, "FAIL");
		}
		
		return status;
		
		
	}
	
	
	
	
	
	
	
	
	private String Asc(String substring) {
		// TODO Auto-generated method stub
		return null;
	}
	
}