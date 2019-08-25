/**
 * @ClassPurpose This Class used to check payment 
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


public class FundsTracking_BC {
	
	public static String sheetname = "FundsTracking_BC";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRFundsTracking_BC () throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}

public boolean ClickOnUnappliedFund() throws Exception
{
	boolean Status = false;
	String XpathID=".//*[@id='AccountDetailFundsTracking:AccountDetailFundsTrackingScreen:FundsSources:FundsTrackerLV:UnappliedFilter']";
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



public boolean ClickOnUnappliedFundUses() throws Exception
{
	boolean Status = false;
	String XpathID=".//*[@id='AccountDetailFundsTracking:AccountDetailFundsTrackingScreen:FundsUses:FundsTrackerLV:UnappliedFilter']";
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


}