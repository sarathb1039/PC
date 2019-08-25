package com.pc.screen;

import org.apache.log4j.Logger;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.PCThreadCache;

public class StateCoverage {
	
		public static String sheetname = "StateCoverage";
		static Logger logger =Logger.getLogger(sheetname);
		Common common = CommonManager.getInstance().getCommon();
		
		public Boolean SCRStateCoverage() throws Exception{

			Boolean status = true;
			status = common.ClassComponent(sheetname,Common.o);
			if(!status)
			{
				status = false;
			}			  
			return status;
	}

	public boolean AddClass(String sFunctionValue) throws Throwable
	{
		boolean status = false;
		String[] sValue = sFunctionValue.split(":::");
		int sRowCount = SCRCommon.TableRowCount(Common.o.getObject("eletableRowXpath"));    	
		try
		{
    		status = SCRCommon.DataWebTable(Common.o.getObject("eletableRowXpath"), sRowCount, 1, "State Act", "single", "div");
    		status = common.SafeAction(Common.o.getObject("edtStateAct"), sValue[0], "lst");
    		status = common.SafeAction(Common.o.getObject("edtAddressCode"), sValue[1], "lst");
    		status = common.SafeAction(Common.o.getObject("eleStateCoverageLookUp"), "eleStateCoverageLookUp", "ele");
    		status = common.SafeAction(Common.o.getObject("edtEnterClassCode"), sValue[2], "edt");
    		status = common.SafeAction(Common.o.getObject("eleClassCodeButton"), "eleClassCodeButton", "ele");
    		status = common.SafeAction(Common.o.getObject("eleSelectInput"), "eleSelectInput", "ele");
    		status = SCRCommon.DataWebTable(Common.o.getObject("eletableRowXpath"), sRowCount, 7, "", "single", "div");
    		status = common.SafeAction(Common.o.getObject("lstAnualPremiumEditClick"), sValue[3], "lstAnualPremiumEditClick");
    	}
		catch(Throwable e)
		{
			e.printStackTrace();
			if(status == false)
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should complete performing the add class","System not completed performing the add class", "FAIL");
			}
		}
		return status;
	}
	
	public boolean VerifyResults(String sFuncValue) throws Exception
	{
		boolean status = false;
		String[] sValue = sFuncValue.split(":::");
		logger.info("Verifying the Results of QPB SHOULD NOT AFFECT THE POLICY DATA");
		String Value = null;
			switch (sValue[0].toUpperCase())
			{
				case "VERIFYQPBSAVING":
					status = common.SafeAction(Common.o.getObject("eleStateCoverages"), "ele", "ele");
					Value = common.ReadElement(Common.o.getObject("eleUWCompany"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
					status = common.CompareStringResult(sValue[0], sValue[1], Value);
					break;
			}
			if(!status)
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+sValue[0]+" case should PASS",""+sValue[0]+" case fail", "FAIL");
				status = true;
			}
		return status;
	}
			
}

