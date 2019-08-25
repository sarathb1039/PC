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


public class ScheduledPersonalProperty {
	
	public static String sheetname = "ScheduledPersonalProperty";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRScheduledPersonalProperty () throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
	
	
	public boolean SelectSPPCoverage(String elementToSelect) throws Exception 
	{
		boolean status = false;
		String[] sValue=elementToSelect.split(":::");
		String xpath=".//span[contains(text(),'"+sValue[0]+"')]";
		String xpath2=".//span[text()='"+sValue[1]+"']";
		
		
		try
		{
			ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("btnSPPAdd")).click();
			ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(xpath)).click();
			ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(xpath)).sendKeys(Keys.RIGHT);
			ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(xpath2)).click();
			Thread.sleep(1000);
			status = true;
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
		return status;
	}
}