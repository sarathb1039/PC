/* @ClassPurpose This Class used for the HeldCharges 
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 07/19/2017
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
import java.util.Calendar;


public class VerifyHeldCharegs_BC {
	
	public static String sheetname = "VerifyHeldCharegs_BC";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRVerifyHeldCharegs_BC () throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
	
	
	public boolean VerifyDataInHeldChargesTable(String value) throws Exception 
	{
		boolean status = false;
	    
	   
		String accountNumber = PCThreadCache.getInstance().getProperty(PCConstants.CACHE_ACCOUNT_NUMBER);
		int colindex = Integer.parseInt(value);
	
		status = common.VerifyDataDisplayedinColumn(common.o.getObject("eleChargesHeldTable_BC"), colindex, accountNumber);
		
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