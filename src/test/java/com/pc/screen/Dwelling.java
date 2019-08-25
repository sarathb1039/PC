
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

public class Dwelling{
	
		public static String sheetname = "Dwelling";
		static Logger logger =Logger.getLogger(sheetname);
		Common common = CommonManager.getInstance().getCommon();
		private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
		public Boolean SCRDwelling() throws Exception{
						Boolean status = true;
			status = common.ClassComponent(sheetname, Common.o);
			if(!status)
			{
				status = false;
			}
			return status;
	}
		
		public boolean AddressStandardizeDwelling() throws Exception {

			boolean status =false;
			Common common = CommonManager.getInstance().getCommon();
			
			
				status = common.SafeAction(Common.o.getObject("btnLocStandardize"),"btnLocStandardize","btn");
				WebElement selectStandAdd = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("btnSelectStandardizeAddr"));
			//	WebElement selectCityCounty = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("btnSelectCityCounty"));
				WebElement Override = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("btnOverrideAddress"));


				if (selectStandAdd.isDisplayed())
				{
					status = common.SafeAction(Common.o.getObject("btnSelectStandardizeAddr"),"btnSelectStandardizeAddr","btn");

					if(ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("btnSelectCityCounty"))==null){
						
						status =common.SafeAction(Common.o.getObject("btnSelectCityCounty"),"btnSelectCityCounty","btn");
					}

				}else{
					status=common.SafeAction(Common.o.getObject("btnOverrideAddress"),"btnOverrideAddress","btn");
				}

			 
			//	if(selectStandAdd.isDisplayed()){
			//
			//		selectStandAdd.click();
			//
			//		//			if(selectCityCounty.isDisplayed()){
			//		//				selectCityCounty.click();
			//		//			}else{
			//		//				
			//		//			}
			//
			//	}else{
			//		Override.click();
			//
			//	}

			return status;
	}


		/**
		 * @function This function use to Enter Description to Additional Interest Table based on param
		 * @param value(LOB & System)
		 * @return status
		 * @throws Exception
		 */
		public boolean AddDescriptionToAITable(String value) throws Exception 
		{
			boolean status = false;
			String value1 = null;
			if(value.contains("Blank"))
			{
				value1 = "";
			}
			else
			{
				value1 = value;
			}
			//String[] sValue = value.split(":::");
			
			try
			{
				status = common.ActionOnTable(Common.o.getObject("eleAdditionalInterestTable"), 1,4,value1, "div");
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return status;
		}

}