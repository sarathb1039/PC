
package com.pc.screen;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;

public class MMClassification {
	
	public static String sheetname = "MMClassification";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	public Boolean SCRMMClassification() throws Exception
	{
			Boolean status = true;
			status = common.ClassComponent(sheetname,Common.o);
			if(!status)
			{
				status = false;
			}
			return status;
	}
	
	public boolean VerifyResults(String funValue) throws Exception
	{
		boolean status = false;
		logger.info("Verify the Results");
		String[] sValue = funValue.split(":::");
		String value = null;
		
			switch (sValue[0].toUpperCase())
			{				
				case "VERIFYERRORMESSAGE":
					logger.info("Validation started for the case '"+sValue[0]);
					value = common.ReadElement(Common.o.getObject(sValue[1]), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
					status = common.CompareStringResult("Verify Error message", sValue[2], value);
					break;
			}
			if(!status)
			{
				logger.info(""+sValue[0]+" Fails" );
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+sValue[0]+" case should PASS",""+sValue[0]+" case should not fail", "FAIL");
				status = true;
			}
		return status;
	}

}