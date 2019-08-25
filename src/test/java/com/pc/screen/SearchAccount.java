package com.pc.screen;

import org.apache.log4j.Logger;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.PCThreadCache;

public class SearchAccount {

	public static String sheetname = "SearchAccount";
	Common common = CommonManager.getInstance().getCommon();
	static Logger logger =Logger.getLogger(sheetname);
	
	public Boolean SCRSearchAccount() throws Exception{

		Boolean status = true;
		status = common.ClassComponent(sheetname, Common.o);
		if(!status)
		{
			return false;
		}
		if(common.WaitUntilClickable(Common.o.getObject("eleCreateNewAccountNumber"),  Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT"))))
		{
			logger.info("System displayed Account Summary Page");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System displayed Account Summary Page", "PASS");
			status = true;
		}
		else
		{
			logger.info("System not displayed Account Summary Page");
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System not displayed Account Summary Page", "FAIL");
			status = false;
		}
	return status;
	}
}

