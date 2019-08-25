package com.pc.screen;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;

public class Contacts_BC {
	
	public static String sheetname = "Contacts_BC";
	Common common = CommonManager.getInstance().getCommon();
	static Logger logger =Logger.getLogger(sheetname);
	private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
	
	public Boolean SCRContacts_BC() throws Exception
	{
			Boolean status = true;
			status = common.ClassComponent(sheetname,Common.o);

			if(!status)
			{
				status = false;
			}
			return status;
	}
	
}
	
	