/**
 * @ClassPurpose This Class used to suspense payment
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SuspensePayment {
	
	public static String sheetname = "SuspensePayment";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRSuspensePayment () throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
	
	
	public boolean SelectCheckboxinSuspensePayment(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		int Rowindex = Integer.parseInt(sValue[0]);
		int Colindex = Integer.parseInt(sValue[1]);
		String SendSpace = sValue[2];
		
	     status = common.SelectCheckBoxOnTableBasedonRowColIndex(Common.o.getObject("eleSuspensePay"), SendSpace,Rowindex, Colindex);
		
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
	
	public boolean SelectEditboxinSuspensePayment(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		int Rowindex = Integer.parseInt(sValue[0]);
		int Colindex = Integer.parseInt(sValue[1]);
		status = common.SelectEditBoxInTableBasedonRowColIndex(Common.o.getObject("eleSuspensePay"), Rowindex, Colindex);
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
	public boolean ValidateSuspensePayment(String value) throws Exception 
	{
		boolean status = false;

		String[] sValue = value.split(":::");

		try
		{

			status = common.VerifyTextFromTable(Common.o.getObject("eleSuspensePay"), Integer.parseInt(sValue[0]),Integer.parseInt(sValue[1]),sValue[2]);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
}
	}

