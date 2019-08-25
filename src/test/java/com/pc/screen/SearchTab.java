package com.pc.screen;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;

public class SearchTab {
	public  XlsxReader sXL;
	public static String sheetname = "SearchTab";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
	
	public Boolean SCRSearchTab() throws Exception
	{		
		Boolean status = true;
		status = common.ClassComponent(sheetname, Common.o);
		if(!status)
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Search User Should be Successful","Search User was not successfully executed", "FAIL");
			return false;
		}
		else
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Search User Should be Successful","Search User was successfully executed", "PASS");
		}
		
		return status;
	}
	
	public boolean SearchTabAccountNum(String value) throws Exception
	  {
		boolean status =  false; 
		String Policynumber1 = null;
		XlsxReader sXL = XlsxReader.getInstance();
		int rowcount = sXL.getRowCount("TestData");
	for(int i = 2; i <= rowcount; i++)
	{
		if(sXL.getCellData("TestData", "ID", i).equals(value))  
		{
			Policynumber1 = sXL.getCellData("TestData", "AccountNumber", i);
			status=common.SafeAction(Common.o.getObject("edtSearchTabAccountNum"), Policynumber1, "edt");
			status =  true;
			break;
		}
	}
	sXL = null;
	return status;
	  }
	public boolean SearchTabPolicyNum(String value) throws Exception
	  {
		boolean status =  false; 
		String Policynumber2 = null;
		XlsxReader sXL = XlsxReader.getInstance();
		int rowcount = sXL.getRowCount("TestData");
	for(int i = 2; i <= rowcount; i++)
	{
		if(sXL.getCellData("TestData", "ID", i).equals(value))  
		{
			Policynumber2 = sXL.getCellData("TestData", "PolicyNumber", i);
			status=common.SafeAction(Common.o.getObject("edtSearchTabPolicyNum"), Policynumber2, "edt");
			status =  true;
			break;
		}
	}
	
	return status;
	  }
	
	
		
}
	
