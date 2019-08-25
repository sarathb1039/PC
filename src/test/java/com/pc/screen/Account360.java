package com.pc.screen;

import org.apache.log4j.Logger;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;

public class Account360 {
	
	public static String sheetname = "Account360";
	Common common = CommonManager.getInstance().getCommon();
	static Logger logger =Logger.getLogger(sheetname);
	
	public Boolean SCRAccount360() throws Exception{

		Boolean status = true;
		status = common.ClassComponent(sheetname, Common.o);
		if(!status)
		{
			status = false;
		}
//		common.Terminate();
		return status;
	}
	
	public boolean ValidatePayment(String value) throws Exception 
	{
		boolean status = false;
		
		status = common.VerifyTextFromTable(Common.o.getObject("eleAccount360SummaryTable"), 2,1, value);
		
		return status;
	}
	
}
