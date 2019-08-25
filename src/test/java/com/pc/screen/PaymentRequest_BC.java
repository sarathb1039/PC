package com.pc.screen;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;

public class PaymentRequest_BC {
	
	public static String sheetname = "PaymentRequest_BC";
	Common common = CommonManager.getInstance().getCommon();
	static Logger logger =Logger.getLogger(sheetname);
	private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
	
	public Boolean SCRPaymentRequest_BC() throws Exception
	{
			Boolean status = true;
			status = common.ClassComponent(sheetname,Common.o);

			if(!status)
			{
				status = false;
			}
			return status;
	}
	
	
	public boolean SelectCheckboxinCustomExporttable(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		int Rowindex = Integer.parseInt(sValue[0]);
		int Colindex = Integer.parseInt(sValue[1]);
		String SendSpace = sValue[2];
		
         status = common.SelectCheckBoxOnTableBasedonRowColIndex(Common.o.getObject("eleCustomSelect"), SendSpace,Rowindex, Colindex);
		
		if(status==true)
		 {
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify checkbox Selected", "Checkbox selected", "PASS");
			
		 }	
		 else
		 {
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify checkbox Selected", "Checkbox selected", "Fail");
			
		  }
	
		return status;
	}
}
	
	