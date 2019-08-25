/**
 * @ClassPurpose This Class used for the Administration 
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Administration_BC {
	
	public static String sheetname = "Administration_BC";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRAdministration_BC() throws Exception{

		Boolean status = true;
		status = common.ClassComponent(sheetname, Common.o);
		if(!status)
		{
			status = false;
		}
		return status;
	}
	
	/*  public boolean VerifyRowdata(String Values) throws Exception
	  {
		  boolean IsdataMatched = false;
		  String[] argList = null;
		  argList = Values.split(",");
		  
		   Thread.sleep(3000);
		   
		   try
		   {
			   IsdataMatched = common.VerifyTextInRow(Common.o.getObject(argList[0]),argList[1]);
			   if (IsdataMatched == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +argList[1], "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+argList[1], "FAIL");
				}
			   
		   }
		   catch (Exception e)
		   {
			e.printStackTrace();
		   }	
		  
		   return IsdataMatched;
	  }  */
	  
	  public boolean PaymentPlanTable(String value) throws Exception 
		{
			boolean status = false;
			
			String[] sValue = value.split(":::");
			int Rowindex = Integer.parseInt(sValue[0]);
			int Colindex = Integer.parseInt(sValue[1]);
			
			try
			{
				status = common.ClickOnCellByDependsOnRowColumnIndex(Common.o.getObject("elePaymentAlTable"),Rowindex,Colindex);
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return status;
		}
	   public boolean VerifyRowdata(String Values) throws Exception
	  {
		  boolean IsdataMatched = false;
		  String[] argList = null;
		  argList = Values.split(",");
		  
		   Thread.sleep(3000);
		   
		   try
		   {
			   IsdataMatched = common.VerifyTextInRow(Common.o.getObject(argList[0]),argList[1]);
			   if (IsdataMatched == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +argList[1], "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+argList[1], "FAIL");
				}
			   
		   }
		   catch (Exception e)
		   {
			e.printStackTrace();
		   }	
		  
		   return IsdataMatched;
	  }
	 
     }
