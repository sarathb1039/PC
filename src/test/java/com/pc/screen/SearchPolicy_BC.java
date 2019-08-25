package com.pc.screen;

import org.apache.log4j.Logger;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;

public class SearchPolicy_BC {
	public  XlsxReader sXL;
	public static String sheetname = "SearchPolicy_BC";
	Common common = CommonManager.getInstance().getCommon();
	static Logger logger =Logger.getLogger(sheetname);
	
	public Boolean SCRSearchPolicy_BC() throws Exception{
		
		Boolean status = true;
		status = common.ClassComponent(sheetname, Common.o);
		if (status == true)
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System displayed Account Summary Page" , "PASS");	
		}
		else
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System not displayed Account Summary Page", "FAIL");
		}
//		if(common.WaitUntilClickable(Common.o.getObject("eleAccountSummary_BC"),  Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT"))))
//		{
//			logger.info("System displayed Account Summary Page");  
//			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System displayed Account Summary Page", "PASS");
//			status = true;
//		}
//		else
//		{
//			logger.info("System not displayed Account Summary Page");
//			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System not displayed Account Summary Page", "FAIL");
//			status = false;
//		}
	return status;
	}
	
	
	
	
	public boolean EnterPolicyNumberfromotherTC(String value) throws Exception
	  {
		boolean status =  false; 
		String Policynumber1 = null;
		XlsxReader sXL = XlsxReader.getInstance();
		int rowcount = sXL.getRowCount("Login");
	for(int i = 2; i <= rowcount; i++)
	{
		if(sXL.getCellData("TestData", "ID", i).equals(value))  
		{
			Policynumber1 = sXL.getCellData("TestData", "edtPolicyNumber_BC", i);
			status=common.SafeAction(Common.o.getObject("edtPolicySearchNumber_BC"), Policynumber1, "edt");
			status =  true;
			break;
		}
	}
	
	return status;
	  }
	
}


