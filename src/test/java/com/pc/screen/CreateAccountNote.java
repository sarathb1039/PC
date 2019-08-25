package com.pc.screen;

import org.apache.log4j.Logger;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.PCThreadCache;

public class CreateAccountNote {
	
	public static String sheetname = "CreateAccountNote";
	Common common = CommonManager.getInstance().getCommon();
	static Logger logger =Logger.getLogger(sheetname);
	
	public Boolean SCRCreateAccountNote() throws Exception{

		Boolean status = true;
		status = common.ClassComponent(sheetname,Common.o);
		if(!status)
		{
			return status;
		}
		if(common.WaitUntilClickable(Common.o.getObject("eleCreateNewAccountNumber"),  Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT"))))
		{
			logger.info("Account Notes created and System displayed Account File Summary");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account File Summary page","System displayed Account File Summary page", "PASS");
			status = true;
		}
		else
		{
			logger.info("Account Notes not created and System not displayed Account File Summary");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account File Summary page","System not displayed Account File Summary page", "PASS");
			status = false;
		}
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

}
