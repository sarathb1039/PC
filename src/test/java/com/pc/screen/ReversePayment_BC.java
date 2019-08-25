/**
 * @ClassPurpose This Class used for the Create Accounts
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 06/06/2017
 */
package com.pc.screen;

import java.util.Date;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.apache.poi.util.SystemOutLogger;

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


public class ReversePayment_BC {
	
	public static String sheetname = "ReversePayment_BC";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRReversePayment_BC () throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
	
	public boolean ReversPayment(String value) throws Exception 
	{
		boolean status = false;
		String date = null;
		
		Thread.sleep(3000);
		String[] sValue = value.split(":::");
		
		switch (sValue[0])
		  {
		    case "Today":		    	
		          Date currDate = new Date();
		          SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		          date = dateFormat.format(currDate);
		          System.out.println(date);
		  }     
		
		try
		{
			status = common.ActionOnCell(Common.o.getObject("elePaymentReverseTbl"), 0,date, sValue[1],"a");
			if (status == true)
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Action on cell", "Value in field -" +date, "PASS");	
			}
			else
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Action on cell", "Value in field -"+date, "FAIL");
			}
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
}