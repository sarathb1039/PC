/**
 * @ClassPurpose This Class used for the Create Accounts
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 06/06/2017
 */
package com.pc.screen;

import java.util.HashMap;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;

public class InsuranceScore {
	
	public static String sheetname = "InsuranceScore";
	static Logger logger =Logger.getLogger(sheetname);

	Common common = CommonManager.getInstance().getCommon();
	
	private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
	
	
	public Boolean SCRInsuranceScore() throws Exception{
					Boolean status = true;
		status = common.ClassComponent(sheetname, Common.o);
		if(!status)
		{
			status = false;
		}
		return status;
}
	
	/**
	 * @function This function use to Enter Premium based on param
	 * @param value(LOB & System)
	 * @return status
	 * @throws Exception
	 */
	public boolean VerifytextinColumn(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		int Colindex = Integer.parseInt(sValue[1]);
		
		
		try
		{
			status = common.VerifyOnlyExpectedDataDisplayedColumn(Common.o.getObject(sValue[0]), Colindex,sValue[2]);
			//Thread.sleep(20);
			if (status == true)
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System displayed Account Summary Page" , "PASS");	
			}
			else
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System not displayed Account Summary Page", "FAIL");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	 public boolean VerifyRowdata(String Values) throws Exception
	  {
		  boolean IsdataMatched = false;
		  String[] argList = null;
		  argList = Values.split(",");
		  
		   Thread.sleep(3000);
		   
		   try
		   {
			   IsdataMatched = common.VerifyTextForOneRow(Common.o.getObject(argList[0]),argList[1]);
			   if (IsdataMatched == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +argList[1], "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+argList[1], "FAIL");
				}
			   
		   }
		   catch (Exception e)
		   {
			e.printStackTrace();
		   }	
		  
		   return IsdataMatched;
	  }
	 
}
	