/* @ClassPurpose This Class used for the HeldCharges 
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 07/19/2017
 */
package com.pc.screen;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class TransferPolicy_BC {
	public  XlsxReader sXL;
	public static String sheetname = "TransferPolicy_BC";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRTransferPolicy_BC () throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
	
	
	public boolean SelectCheckboxinTransfertable(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		int Rowindex = Integer.parseInt(sValue[0]);
		int Colindex = Integer.parseInt(sValue[1]);
		String SendSpace = (sValue[2]);
		
         status = common.SelectCheckBoxInTableBasedonRowColIndex(Common.o.getObject("eleTransferPoliciesTable_BC"),SendSpace, Rowindex, Colindex);
		
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
	public boolean EnterAccountNumberfromotherTC(String value) throws Exception
	  {
		boolean status =  false; 
		String accountnumber1 = null;
		sXL = XlsxReader.getInstance();
		int rowcount = sXL.getRowCount("SearchAccount_BC");
	for(int i = 2; i <= rowcount; i++)
	{
		if(sXL.getCellData("SearchAccount_BC", "ID", i).equals(value))  
		{
			accountnumber1 = sXL.getCellData("SearchAccount_BC", "edtaccountNumber_BC", i);
			status= common.SafeAction(Common.o.getObject("edtAccountnumField_BC"), accountnumber1, "edt");
			status =  true;
			break;
		}
	}
	
	return status;
	  }
	
}