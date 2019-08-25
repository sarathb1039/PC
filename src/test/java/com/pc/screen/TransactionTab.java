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
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;

public class TransactionTab {
	
	public static String sheetname = "TransactionTab";
	static Logger logger =Logger.getLogger(sheetname);
	public String accountNumber;
	public String accountName;
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRTransactionTab() throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
	
	public boolean ValidateTransaction(String value) throws Exception 
	{
		boolean status = false;

		String[] sValue = value.split(":::");

		try
		{

			status = common.VerifyTextFromTable(Common.o.getObject("eleTransactionTable"), Integer.parseInt(sValue[0]),Integer.parseInt(sValue[1]),sValue[2]);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
}
	
	
	
}