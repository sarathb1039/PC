/**
 * @ClassPurpose This Class used for the Verify History
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 06/06/2017
 */
package com.pc.screen;

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


public class VerifyHistory_BC {
	
	public static String sheetname = "VerifyHistory_BC";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRVerifyHistory_BC () throws Exception{

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
	    
	    
		String invoicenumber = common.GetTextFromTable(common.o.getObject("eleInvoicetable"), 0, 3);
		
		String Expecteddata = value +invoicenumber;
		
		
		ManagerDriver.getInstance().getWebDriver().findElement(By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailHistory")).click();
		Thread.sleep(10);
		
		status = common.VerifyDataDisplayedColumn(common.o.getObject("eleHistoryTable_BC"), 3, Expecteddata);
		
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
	public boolean VerifyInHistoryTableforData(String value) throws Exception 
	{
		boolean status = false;
	    
	    String[] sValue = value.split(":::");
		String Expecteddata = sValue[0];
		int ColumIndex = Integer.parseInt(sValue[1]);
		
	
		status = common.VerifyDataDisplayedColumn(common.o.getObject("eleHistoryTable_BC"), ColumIndex, Expecteddata);
		
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
	private String Asc(String substring) {
		// TODO Auto-generated method stub
		return null;
	}
	
}