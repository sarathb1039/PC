package com.pc.screen;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;

public class DeletePolicyNote {
	
	public static String sheetname = "DeletePolicyNote";
	Common common = CommonManager.getInstance().getCommon();
	private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
	static Logger logger =Logger.getLogger(sheetname);
	
	public Boolean SCRDeletePolicyNote() throws Exception{

		Boolean status = true;
		status = common.ClassComponent(sheetname, Common.o);
		if(!status)
		{
			return false;
		}
		/*if(common.WaitUntilClickable(Common.o.getObject("elePolicyNotePage"),  Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT"))))
		{
			logger.info("System displayed Policy Notes search Page");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Policy Notes search Page","System displayed Policy Notes search Page", "PASS");
			status = true;
		}
		else
		{
			logger.info("System not displayed Policy Notes search Page");
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Policy Notes search Page","System not displayed Policy Notes search Page", "FAIL");
			status = false;
		}*/
		return status;
	}
	public boolean Wait(String value) throws Exception
	{
		if (value.contains("Long"))
		{
			common.WaitUntilClickable(Common.o.getObject("edtOrganizationName"),  Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
			//Thread.sleep(5000);
		}
		return true;
		
	}
	
	public boolean CheckUpdate() throws Exception
    {
           boolean sStatus = true;
           //String st = driver.findElement(Common.o.getObject("eleUpdate")).getAttribute("");
           boolean status = common.WaitUntilClickable(Common.o.getObject("eleUpdate"),  Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
           if(!status)
           {
                  status = common.SafeAction(Common.o.getObject("eleWorkeComp"), "value","eleWorkeComp");
                        
           }
           if(!status)
           {
                  sStatus =  false;
           }
           return sStatus;
    }
	public boolean Verify(String value) throws Exception
    {
		Thread.sleep(5000);
		String[] sValue = value.split(":::");
           boolean sStatus = false;
           String sstrVal;
           switch (sValue[0])
			{
				case "VerifySearchAccountNotesName":
			           sstrVal = driver.findElement(Common.o.getObject("funAccountNotesVerify")).getText();
			          if(sstrVal.contains(sValue[1]))
			          {
							logger.info("System displayed Account Notes Results - Account Note Name - " + sstrVal);  
							HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Notes Results","System displayed Account notes results - Account Notes Name -" + sstrVal , "PASS");
							sStatus = true;
						}
						else
						{
							logger.info("System not displayed Account Notes Results");  
							HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Notes Results","System not displayed Account notes results", "FAIL");
							sStatus = false;
						}
			          break;
				case "VerifySearchPolicyNotesName":
			           sstrVal = driver.findElement(Common.o.getObject("funPolicyNotesVerify1")).getText();
			          if(sstrVal.contains(sValue[1]))
			          {
							logger.info("System displayed Policy Notes Results - Account Note Name - " + sstrVal);  
							HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Policy Notes Results","System displayed Policy notes results - Account Notes Name -" + sstrVal , "PASS");
							sStatus = true;
						}
						else
						{
							logger.info("System not displayed Policy Notes Results");  
							HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Policy Notes Results","System not displayed Policy notes results", "FAIL");
							sStatus = false;
						}
			          break;
				case "VerifySearchShellPolicyNotesName":
			           sstrVal = driver.findElement(Common.o.getObject("eleShellPolicyNoteName")).getText();
			          if(sstrVal.contains(sValue[1]))
			          {
							logger.info("System displayed Policy Notes Results - Account Note Name - " + sstrVal);  
							HTML.fnInsertResult(HTML.properties.getProperty("testcasename"), HTML.properties.getProperty("methodName"), "System should display Policy Notes Results","System displayed Policy notes results - Account Notes Name -" + sstrVal , "PASS");
							sStatus = true;
						}
						else
						{
							logger.info("System not displayed Policy Notes Results");  
							HTML.fnInsertResult(HTML.properties.getProperty("testcasename"), HTML.properties.getProperty("methodName"), "System should display Policy Notes Results","System not displayed Policy notes results", "FAIL");
							sStatus = false;
						}
			          break;
			}
           return sStatus;
    }
}
