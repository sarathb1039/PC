/**
 * @ClassPurpose This Class used for the Add Policy 
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 06/06/2017
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


public class Invoices {
	
	public static String sheetname = "Invoices";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRInvoices () throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}

	public boolean ValidateInvoiceContent(String value) throws Exception 
	{
		boolean status = false;


		String strDate;
		Date myDate;
		Calendar Date = Calendar.getInstance();
		//SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		//System.out.println(sdf);
		


		try
		{
			switch (value.toUpperCase())
			{
			case "BILLDATE_TODAY": //this is  for validating BILL date when effective date less than 22 days

				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				
				 myDate = new Date(strDate);
				 strDate = new SimpleDateFormat("MM/dd/yyyy").format(myDate);
				status = common.VerifyTextFromTable(Common.o.getObject("eleInvoicetable"), 0,1, strDate);
				break;


			case "BILLDATE_MORETHAN_1DAY": //this is  for validating BILL date when effective date greater than 21 days

				Date.add(Calendar.DATE, +1);
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				 myDate = new Date(strDate);
				 strDate = new SimpleDateFormat("MM/dd/yyyy").format(myDate);
				status = common.VerifyTextFromTable(Common.o.getObject("eleInvoicetable"), 0,1, strDate);
				break;

			case "DUEDATE_TODAY": //this is  for validating DUE date when effective date less than 22 days

				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				myDate = new Date(strDate);
				strDate = new SimpleDateFormat("MM/dd/yyyy").format(myDate);
				status = common.VerifyTextFromTable(Common.o.getObject("eleInvoicetable"), 0,2, strDate);
				break;
			
			case "DUEDATE_1YEAR": //this is  for validating DUE date when effective date less than 22 days
				Date.add(Calendar.YEAR,+1); 
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				myDate = new Date(strDate);
				strDate = new SimpleDateFormat("MM/dd/yyyy").format(myDate);
				status = common.VerifyTextFromTable(Common.o.getObject("eleInvoicetable"), 0,2, strDate);
				break;

			case "DUEDATE_EFFECTIVE_DATE": //this is  for validating due date when effective date greater than 21 days


				Date.add(Calendar.DATE, +22);
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				myDate = new Date(strDate);
				strDate = new SimpleDateFormat("MM/dd/yyyy").format(myDate);
				status = common.VerifyTextFromTable(Common.o.getObject("eleInvoicetable"), 0,2, strDate);
				break;

			case "VALIDATE_BACKDATED_PREMIUM":	

				status = common.VerifyTextFromTable(Common.o.getObject("eleInvoicetable"), 0, 7, value);
				break;

			case "VALIDATE_INVOICE_STATUS":
				status = common.VerifyTextFromTable(Common.o.getObject("eleInvoicetable"), 0, 6, value);

				break;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

	public boolean ValidateInvoice(String value) throws Exception 
	{
		boolean status = false;

		String[] sValue = value.split(":::");

		try
		{

			status = common.VerifyTextFromTable(Common.o.getObject("eleInvoicetable"), Integer.parseInt(sValue[0]),Integer.parseInt(sValue[1]),sValue[2]);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public boolean ToEnterBillDateAndDueDate(String strValue) throws Exception
	{
		boolean status = false;
		String strDate;
		Date myDate;
		Calendar Date = Calendar.getInstance();
		
		try
		{
			switch (strValue.toUpperCase())
			{
              case "BILLDATE_TODAY":
				
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				myDate = new Date(strDate);
				strDate = new SimpleDateFormat("MM/dd/yyyy").format(myDate);
				status = common.SafeAction(Common.o.getObject("eleBilldate_BC"), strDate, "edt");
				if (status == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +strDate, "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+strDate, "FAIL");
				}
				break;
			case "DUEDATE_1YEARGREATER":
				Date.add(Calendar.YEAR,+1);
				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				myDate = new Date(strDate);
				strDate = new SimpleDateFormat("MM/dd/yyyy").format(myDate);
				status = common.SafeAction(Common.o.getObject("eleDueDate_BC"), strDate, "edt");
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
	public boolean FetchDataIntoTempData(String value) throws Exception 
	{
		boolean status = false;
		String Tempdata = common.GetTextFromTable(common.o.getObject("eleInvoicetable"), 0, 3);
		HashMap<String,Object> updateColumnNameValues = new HashMap<String,Object>();
		HashMap<String,Object> whereConstraint = new HashMap<String,Object>();
		PCThreadCache.getInstance().setProperty(PCConstants.CACHE_TEMPDATA, Tempdata);
		
		
		
		updateColumnNameValues = null;
		whereConstraint = null;
		return status;
	}

	}
