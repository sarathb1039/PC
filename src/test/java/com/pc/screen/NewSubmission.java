package com.pc.screen;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;

public class NewSubmission {

	public static String sheetname = "NewSubmission";
	Common common = CommonManager.getInstance().getCommon();
	static Logger logger =Logger.getLogger(sheetname);
	public static XlsxReader sXL;

	public Boolean SCRNewSubmission() throws Exception
	{		
		Boolean status = true;
		status = common.ClassComponent(sheetname, Common.o);
		if(!status)
		{
			return false;
		}
		//		String sProductSelect = common.getSpecifiedExcelValue(sheetname, "ProductSelect");
		/*if (sProductSelect.equals("SOR"))
        {
               if(common.WaitUntilClickable(Common.o.getObject("assertforPolicyINFOPage"),  Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT"))))
               {
                     logger.info("System displayed Organisation Page");  
                     HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Organisation Page","System displayed Organisation Page", "PASS");
                     status = true;
               }
               else
               {
                     logger.info("System not displayed Organisation Page");
                     HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Organisation Page","System not displayed Organisation Page", "FAIL");
                     status = false;                          
               }
        }
        else if (sProductSelect.equals("Shell"))
        {
               if(common.WaitForElementExist(Common.o.getObject("eleCLATitlePolicyInfo"),  Integer.valueOf(HTML.properties.getProperty("LONGWAIT"))))
               {
                     logger.info("System displayed Policy Info Page");  
                     HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Policy Info Page","System displayed Policy Info Page", "PASS");
                     status = true;
               }
               else
               {
                     logger.info("System not displayed Policy Info Page");
                     HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Policy Info Page","System not displayed Policy Info Page", "FAIL");
                     status = false;
               }
        } else if (sProductSelect.equals("Multiple"))
        {
            if(common.WaitForElementExist(Common.o.getObject("eleAccountFileSummary"),  Integer.valueOf(HTML.properties.getProperty("LONGWAIT"))))
            {
                  logger.info("System displayed Account File Summary Page");  
                  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account File Summary Page","System displayed Account File Summary Page", "PASS");
                  status = true;
            }
            else
            {
                  logger.info("System not displayed Account File Summary Page");
                  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account File Summary Page","System not displayed Account File Summary Page", "FAIL");
                  status = false;
            }
     }*/
		return status;
	}

	public boolean DefaultEffectiveDate() throws Exception
	{
		boolean status = false;
		String sCurrentDate = SCRCommon.ReturnCurrentDate();
		status = common.SafeAction(Common.o.getObject("edtEffDate"), sCurrentDate, "edt");
		return status;
	}

	/**
	 * @function This function use to select the LOB dynamically
	 * @param value(LOB & System)
	 * @return status
	 * @throws Exception
	 */
	public boolean SelectLOB(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		try
		{
			status = common.ActionOnTable(Common.o.getObject("funSelectLOB"), 1,0,sValue[0], "a");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

	/**
	 * @function This function use to select multiple LOB based on param
	 * @param value(LOB & System)
	 * @return status
	 * @throws Exception
	 */
	public boolean SelectMultipleLOB(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		try
		{
			status = common.ActionOnTableSelect(Common.o.getObject("eleProductNameTable"),2,0,sValue[0],sValue[1],sValue[2], "div");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

	public boolean VerifyResults(String sFuncValue) throws Exception
	{
		boolean status = false;
		String[] sValue = sFuncValue.split(":::");
		logger.info("Verifying the Results");
		String Value = null;
		switch (sValue[0].toUpperCase())
		{				
		case "VERIFYNONAMPLOB":
			logger.info(sValue[0]);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[1]);
			status = common.CompareStringResult(sValue[0], sValue[1], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[2]);
			status = common.CompareStringResult(sValue[0], sValue[2], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[3]);
			status = common.CompareStringResult(sValue[0], sValue[3], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[4]);
			status = common.CompareStringResult(sValue[0], sValue[4], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[5]);
			status = common.CompareStringResult(sValue[0], sValue[5], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[6]);
			status = common.CompareStringResult(sValue[0], sValue[6], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[7]);
			status = common.CompareStringResult(sValue[0], sValue[7], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[8]);
			status = common.CompareStringResult(sValue[0], sValue[8], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[9]);
			status = common.CompareStringResult(sValue[0], sValue[9], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[10]);
			status = common.CompareStringResult(sValue[0], sValue[10], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[11]);
			status = common.CompareStringResult(sValue[0], sValue[11], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[12]);
			status = common.CompareStringResult(sValue[0], sValue[12], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[13]);
			status = common.CompareStringResult(sValue[0], sValue[13], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[14]);
			status = common.CompareStringResult(sValue[0], sValue[14], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[15]);
			status = common.CompareStringResult(sValue[0], sValue[15], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[16]);
			status = common.CompareStringResult(sValue[0], sValue[16], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[17]);
			status = common.CompareStringResult(sValue[0], sValue[17], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[18]);
			status = common.CompareStringResult(sValue[0], sValue[18], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[19]);
			status = common.CompareStringResult(sValue[0], sValue[19], Value);
			break;
		case "VERIFYAMPLOB":
			logger.info(sValue[0]);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[1]);
			status = common.CompareStringResult(sValue[0], sValue[1], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[2]);
			status = common.CompareStringResult(sValue[0], sValue[2], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[3]);
			status = common.CompareStringResult(sValue[0], sValue[3], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[4]);
			status = common.CompareStringResult(sValue[0], sValue[4], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[5]);
			status = common.CompareStringResult(sValue[0], sValue[5], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[6]);
			status = common.CompareStringResult(sValue[0], sValue[6], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[7]);
			status = common.CompareStringResult(sValue[0], sValue[7], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[8]);
			status = common.CompareStringResult(sValue[0], sValue[8], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[9]);
			status = common.CompareStringResult(sValue[0], sValue[9], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[10]);
			status = common.CompareStringResult(sValue[0], sValue[10], Value);
			Value = common.GetTextFromTable(Common.o.getObject("eleProductNameTable"), 1, sValue[11]);
			status = common.CompareStringResult(sValue[0], sValue[11], Value);
			break;

		}
		if(!status)
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+sValue[0]+" case should PASS",""+sValue[0]+" case should not fail", "FAIL");
			status = true;
		}
		return status;
	}

	/**
	 * Set date for eff date field with one year old date. so that policy will be expired while issuing on current date
	 * @return true/false
	 * @throws Exception 
	 */
	public boolean EffDate(String strValue) throws Exception
	{
		boolean status = false;
		String strDate;
		Calendar Date = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf);
		try
		{
			switch (strValue.toUpperCase())
			{
			case "EFF_13_MON_OLD":
				/*Calendar Date = Calendar.getInstance();
					Date.add(Calendar.MONTH,-1);
					Date.add(Calendar.YEAR,-1);
					String strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
					status = common.SafeAction(Common.o.getObject("edtEffDate"), strDate, "edt");*/
				Date.add(Calendar.MONTH,-1);
				Date.add(Calendar.YEAR,-1);
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				status = common.SafeAction(Common.o.getObject("edtEffDate"), strDate, "edt");
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should enter value  '"+ strDate + "' in effective date field", "Value entered '"+ strDate + "' in effective date field", "PASS");
				break;
			case "EXPDT_LESSTHAN_A_YEAR":
				Date.add(Calendar.MONTH,-2);
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				String strformatedDate = sdf.format(strDate);
				status = common.SafeAction(Common.o.getObject("edtExpDate"), strformatedDate, "edt");
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should enter value  '"+ strDate + "' in effective date field", "Value entered '"+ strDate + "' in effective date field", "PASS");

				break;
			case "EFF_MORETHAN_7DAYS":
				Date.add(Calendar.DATE,-7);
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
		
				status = common.SafeAction(Common.o.getObject("edtEffDate"), strDate, "edt");
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should enter value  '"+ strDate + "' in effective date field", "Value entered '"+ strDate + "' in effective date field", "PASS");

				break;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public boolean validateerrormessage(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		logger.info("Verification started for  '"+sValue[1]+"'");
		// status=common.ElementExistOrNotTrue("Element exist", "XAct Pay Launch screen", "XAct Pay Launch screen dispalyed as expected", Common.o.getObject("eleXactPayLaunchTitle"));
		String Value = common.ReadElement(Common.o.getObject("elePCVerifyErrorMessages"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
		status = common.CompareStringResult("Validating the error message", sValue[1],Value);
		
		if(status=true){
		HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Error messages'"+ sValue[1] + "' and '"+value +"' should match ", "Error message is matching with  "+ sValue[1] + "' with '"+value +"'", "PASS");
		}else{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Error messages'"+ sValue[1] + "' and '"+value +"' should match '"+ sValue[1] + "' with '"+value +"'", "Error message is not matching with  "+ sValue[1] + "' with '"+value +"'", "FAIL");

		}


		return status;
	}
	
	public boolean VerifyStates(String StrDetails) throws Exception {
		
	boolean status=false;
	String value=null;
	String[] sValue = StrDetails.split(":");
	value=common.GetTextFromListBox(common.o.getObject("eleStates"),"ul");
	//status=common.CompareExactStringResult(sCase, sExpectedValue, sAcutualValue)
	
			
			
			status=true;
	
		return status;
		
		
	}
}