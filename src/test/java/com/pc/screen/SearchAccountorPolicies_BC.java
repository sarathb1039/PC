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


public class SearchAccountorPolicies_BC {
	
	public static String sheetname = "SearchAccountorPolicies_BC";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRSearchAccountorPolicies_BC () throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
	/**
	 * @function This function use to Enter Premium based on param
	 * @param value(LOB & System)
	 * @return status
	 * @throws Exception
	 */
	public boolean OpenPolicyorAccount(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		int ColumnNum = Integer.parseInt(sValue[0]);
		int ColumnNum1 = Integer.parseInt(sValue[1]);
		
		try
		{
			status = common.ActionOnTable(Common.o.getObject("eleSearchTbl_BC"), ColumnNum,ColumnNum1,sValue[2], "div");
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
	
}