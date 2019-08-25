package com.pc.screen;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;

public class AddAndReconcileDriver{
	
		public static String sheetname = "AddAndReconcileDriver";
		static Logger logger =Logger.getLogger(sheetname);
		Common common = CommonManager.getInstance().getCommon();
		private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
		public Boolean SCRAddAndReconcileDriver() throws Exception{
						Boolean status = true;
			status = common.ClassComponent(sheetname, Common.o);
			if(!status)
			{
				status = false;
			}
			return status;
	}

		public boolean VerifyTextfromVehiclesTable(String searchStrng) throws Exception{
			boolean status=false;
			String Value = null;
			String[] sValue=searchStrng.split(":::");
			
			status=common.VerifyDataDisplayedinColumn(common.o.getObject("eleVehiclesTable"), Integer.parseInt(sValue[0]),sValue[1]);
			 
			 return status;
			 
		}
		
		public boolean SelectCheckboxinTitleHoldertable(String value) throws Exception 
		{
			boolean status = false;
			String[] sValue = value.split(":::");
			int Rowindex = Integer.parseInt(sValue[1]);
			int Colindex = Integer.parseInt(sValue[2]);
			String SendSpace = sValue[3];
			
	         status = common.SelectCheckBoxOnTableBasedonRowColIndex(Common.o.getObject(sValue[0]), SendSpace,Rowindex, Colindex);
			
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