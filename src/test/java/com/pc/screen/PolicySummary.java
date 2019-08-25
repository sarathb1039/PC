package com.pc.screen;

import org.apache.log4j.Logger;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;

public class PolicySummary {
	
	public static String sheetname = "PolicySummary";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	public Boolean SCRPolicySummary() throws Exception
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