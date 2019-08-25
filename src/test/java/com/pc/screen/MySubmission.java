/**
 * @ClassPurpose This Class used for the Desktop usecase
 * @Scriptor Rathish Kuppusamy
 * @ReviewedBy
 * @ModifiedBy
 * @LastDateModified 04/06/2017
 */
package com.pc.screen;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;

public class MySubmission {
	
	public static String sheetname = "MySubmission";
	Common common = CommonManager.getInstance().getCommon();
	static Logger logger =Logger.getLogger(sheetname);
	private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
	
	public Boolean SCRMySubmission() throws Exception
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
	   		String[] sValue = funValue.split(":::");
	   		String Value = null;
	   			switch (sValue[0].toUpperCase())
	   			{	
	   				case "CHECKSTATUS":
						Value = common.GetTextFromTable(Common.o.getObject("eleMySubmissionBody"), 5, sValue[1]);
						status = common.CompareStringResult(sValue[0], sValue[1], Value);
						break;
	   				case "CHECKTYPE":
						Value = common.GetTextFromTable(Common.o.getObject("eleMySubmissionBody"), 4, sValue[1]);
						status = common.CompareStringResult(sValue[0], sValue[1], Value);
						break;
	   				}
	   			if(!status)
	   			{
	   				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+sValue[0]+" case should PASS",""+sValue[0]+" case should not fail", "FAIL");
	   				status = true;
	   			}
	   		return status;
	   	}
}
	
	