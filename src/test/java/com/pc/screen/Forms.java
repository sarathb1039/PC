package com.pc.screen;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;

public class Forms {
	
	public static String sheetname = "Forms";
	Common common = CommonManager.getInstance().getCommon();
	static Logger logger =Logger.getLogger(sheetname);
	private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
	
	public Boolean SCRForms() throws Exception
	{
			Boolean status = true;
			status = common.ClassComponent(sheetname,Common.o);

			if(!status)
			{
				status = false;
			}
			return status;
	}
	
	public boolean ValidateFormsTableValue(String value) throws Exception 
	{
		boolean status = false;

		String[] sValue = value.split(":::");

		try
		{

			status = common.VerifyTextFromTable(Common.o.getObject("eleFormsTable"), Integer.parseInt(sValue[0]),Integer.parseInt(sValue[1]),sValue[2]);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

	/*public void Standardize(){
		logger.info("Account Address is going to be standardized");
		
	}*/
	
	/**
	 * @function Use to update the account number
	 * @return true/false
	 * @throws Exception
	 */
	
}