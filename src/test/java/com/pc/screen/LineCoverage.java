package com.pc.screen;

import org.apache.log4j.Logger;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;

public class LineCoverage {
	
		public static String sheetname = "LineCoverage";
		Common common = CommonManager.getInstance().getCommon();
		static Logger logger =Logger.getLogger(sheetname);
		
		public Boolean SCRLineCoverage() throws Exception{
			
			Boolean status = true;
			status = common.ClassComponent(sheetname, Common.o);
			if(!status)
			{
				status = false;
			}
			return status;
	}
}