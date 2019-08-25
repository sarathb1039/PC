/**
 * @ClassPurpose This Class used for the Add Policy 
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 06/06/2017
 */
package com.pc.screen;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import org.apache.log4j.Logger;
import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class AddPolicy {
	
	public static String sheetname = "AddPolicy";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRAddPolicy() throws Exception{

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
	public boolean AddPremium(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		try
		{
			status = common.ActionOnTable(Common.o.getObject("elePremiumTable"), 1,5,sValue[0], "div");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	/**
	 * @function This function use to Enter Premium based on param
	 * @param value(LOB & System)
	 * @return status
	 * @throws Exception
	 */
	public boolean AddPolicyType(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		try
		{
			status = common.ActionOnTable(Common.o.getObject("elePremiumTable"), 1,1,sValue[0], "div");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public boolean EffDate(String strValue) throws Exception
	{
		boolean status = false;
		String strDate;
		String strformatedDate  = null;
		Calendar Date = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf);
		try
		{
			switch (strValue.toUpperCase())
			{
			case "EXP_1YEARGREATER":
				Date.add(Calendar.YEAR,+1);
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				
				status = common.SafeAction(Common.o.getObject("eleExpirationDateBC"), strDate, "edt");
				if (status == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +strDate, "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+strDate, "FAIL");
				}
				break;
			
			case "EFF_BACKDATED_2MONTHS":
				Date.add(Calendar.MONTH,-2);
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				
				status = common.SafeAction(Common.o.getObject("edtEffectiveDateBC"), strDate, "edt");
				if (status == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +strDate, "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+strDate, "FAIL");
				}
				break;
			
			case "EXP_6MONTHSGREATER":
				Date.add(Calendar.MONTH,+6);
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				
				status = common.SafeAction(Common.o.getObject("eleExpirationDateBC"), strDate, "edt");
				if (status == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +strDate, "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+strDate, "FAIL");
				}
				break;
			
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
				if (status == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +strDate, "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+strDate, "FAIL");
				}
				break;
			case "EXPDT_LESSTHAN_A_YEAR":
				Date.add(Calendar.MONTH,-2);
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				 strformatedDate = sdf.format(strDate);
				status = common.SafeAction(Common.o.getObject("edtExpDate"), strformatedDate, "edt");
				if (status == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +strDate, "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+strDate, "FAIL");
				}
				break;
			case "EFF_MORETHAN_7DAYS":
				Date.add(Calendar.DATE,-29);
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
		
				status = common.SafeAction(Common.o.getObject("edtEffDate"), strDate, "edt");
				if (status == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +strDate, "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+strDate, "FAIL");
				}
				break;
				
			case "EFF_TODAY":
				
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				status = common.SafeAction(Common.o.getObject("edtEffectiveDateBC"), strDate, "edt");
				if (status == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +strDate, "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+strDate, "FAIL");
				}
				break;
				
			case "EFF_LESSTHAN_22DAYS": // this is for providing effective date as Less than 22 days in Future
				Date.add(Calendar.DATE, +21);	
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				status = common.SafeAction(Common.o.getObject("edtEffectiveDateBC"), strDate, "edt");
				if (status == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +strDate, "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+strDate, "FAIL");
				}
				break;
			
				
 
			case "EFF_GREATERTHAN_21DAYS": // this is for providing effective date as Greater than 22 days in Future
				Date.add(Calendar.DATE, +22);	
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				status = common.SafeAction(Common.o.getObject("edtEffectiveDateBC"), strDate, "edt");
				if (status == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +strDate, "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+strDate, "FAIL");
				}
				break;	
				
			case "EXP_LESSTHAN_22DAYS_PA": // this is for providing Expiration date as 1 year+21 days more than effective date
				Date.add(Calendar.DATE, +21);	
				Date.add(Calendar.YEAR, +1);
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				status = common.SafeAction(Common.o.getObject("eleExpirationDateBC"), strDate, "edt");
				if (status == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +strDate, "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+strDate, "FAIL");
				}
				break;	
				
			case "EXP_GREATERTHAN_21DAYS_PA": // this is for providing Expiration date as 6 Months+22 days more than effective date
				Date.add(Calendar.DATE, +22);	
				Date.add(Calendar.MONTH, +6);
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				status = common.SafeAction(Common.o.getObject("eleExpirationDateBC"), strDate, "edt");
				if (status == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +strDate, "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+strDate, "FAIL");
				}
				break;		
				
			case "EXP_GREATERTHAN_21DAYS_HO": // this is for providing Expiration date as 6 Months+22 days more than effective date
				Date.add(Calendar.DATE, +22);	
				Date.add(Calendar.MONTH, +6);
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				status = common.SafeAction(Common.o.getObject("eleExpirationDateBC"), strDate, "edt");
				if (status == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +strDate, "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+strDate, "FAIL");
				}
				break;	
			case "EXP_LESSTHAN_22DAYS_HO":
				Date.add(Calendar.DATE, +21);	
				Date.add(Calendar.YEAR, +1);
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				status = common.SafeAction(Common.o.getObject("eleExpirationDateBC"), strDate, "edt");
				if (status == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +strDate, "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+strDate, "FAIL");
				}
				break;		
				
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

}