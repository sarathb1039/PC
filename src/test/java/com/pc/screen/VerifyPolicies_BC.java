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


public class VerifyPolicies_BC {
	
	public static String sheetname = "VerifyPolicies_BC";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRVerifyPolicies_BC () throws Exception{

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
	public boolean OpenPolicyAndValidateTheData(String value) throws Exception 
	{
		boolean status = false;
	    
	
		String[] Values = value.split(":::");
		
		String xpathID = ".//a[text()='" + Values[0] + "-1']";
		
		
		ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(xpathID)).click();
		Thread.sleep(10);
		
		String PolicyValue = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("elePolicyValue_BC")).getText();
		
		
		if( PolicyValue.contains(Values[1]))
		 {
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+PolicyValue+": "+Values[1]+" should match", ""+PolicyValue+": "+Values[1]+" is matching", "PASS");
			status = true;
		 }	
		 else
		 {
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+PolicyValue+": "+Values[1]+" should match", ""+PolicyValue+": "+Values[1]+" is not matching", "FAIL");
			
		  }
		
		return status;
	}
	private String Asc(String substring) {
		// TODO Auto-generated method stub
		return null;
	}
	
}