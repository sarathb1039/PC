/**
 * @ClassPurpose This Class used for the Add Policy 
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 06/06/2017
 */
package com.pc.screen;

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


public class BatchRun {
	
	public static String sheetname = "BatchRun";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRBatchRun () throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
	
	public boolean BatchProcess(String value) throws Exception 
	{
		boolean status = false;
		
		
		Thread.sleep(3000);
		String[] sValue = value.split(":::");
		try
		{
			status = common.ActionOnCell(Common.o.getObject("eleBatchProcess"), 2,sValue[0], sValue[1],"a");
			Thread.sleep(3000);
			if (status == true)
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Action on cell", "Value in field -" +sValue[1], "PASS");	
			}
			else
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Action on cell", "Value in field -"+sValue[1], "FAIL");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public boolean NavigatetoBatchProcess(String value) throws Exception 
	{
		boolean status = false;
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_SHIFT);	
		robot.keyPress(KeyEvent.VK_T);
		//ManagerDriver.getInstance().getWebDriver().findElement(By.tagName("html")).sendKeys("t");
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		status = true;
		return status;
		
	}
	
}