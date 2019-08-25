package com.pc.screen;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;

public class SCRCommon {

	public static String sheetname = "SCRCommon";
	static Logger logger =Logger.getLogger(sheetname);
	public static String Path;
	public boolean statuss=false;
	Common common = CommonManager.getInstance().getCommon();
	public boolean Wait() throws Exception
	{
		Common common = CommonManager.getInstance().getCommon();
		boolean status = common.WaitForElementExist(Common.o.getObject("eleAddSuccessMsg"), 20);		
		return status;
	}

	/**
	 * @function it helps to handle the create account new button for dynamic	 
	 * @return 
	 * @throws Exception 
	 */
	public boolean CheckPopUpAlert() throws Exception
	{
		Common common = CommonManager.getInstance().getCommon();
		boolean status = false;
		boolean popUpExist = common.ElementSize(Common.o.getObject("eleAlertPopUp"))!=0;
		if(popUpExist == true)
		{
			common.SafeAction(Common.o.getObject("eleAlertPopUp"), "eleAlertPopUp","ele" );
			status = true;
		}
		return status;
	}

	/**
	 * @function This function is used to fill the data's in all the webtable
	 * @param id, sRow, sCol
	 * @param strReadString
	 * @return status
	 * @throws Exception
	 */
	/*public static boolean DataWebTable(By id, int sRow, int sCol, String strReadString, String ActionClick) throws Exception 
	{	 
		Common common = CommonManager.getInstance().getCommon();
		boolean SearchString= false;
		boolean Status = false;
		Actions objActions = new Actions(ManagerDriver.getInstance().getWebDriver());
		WebElement  mytable = common.returnObject(id);
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		sRow--;
		List<WebElement> Columns_row = rows_table.get(sRow).findElements(By.tagName("td"));
		String celtext = Columns_row.get(sCol).getText();
		if (celtext.contains(strReadString))
		{
  			  SearchString = true;
  			  List<WebElement> CellElements = Columns_row.get(sCol).findElements(By.tagName("div"));
  	          for(WebElement element: CellElements)
  	          {
  	        		  	switch(ActionClick)
  	        		  	{
  	        		  		case "single":
  	        		  			element.click();
  	        		  			Status = true;
  	        		  		break;	
  	        		  		case "double":
  	        		  			objActions.doubleClick(element).build().perform();
  	        		  			Status = true;
  	        		  		break;
  	        		  	}
  	        		  	break;
  	          }
  	     }
		 if(SearchString)
		 {
			  	logger.info("Search String available in the table. '" + strReadString + "'");  
			  	HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System searched string in table and search string is  '" + strReadString + "'", "PASS");
		 }
		 else
		 {
			  	logger.info("Search String not available in the table. '" + strReadString + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System not searched string in table and search string is  '" + strReadString + "'", "FAIL");
				Status = false;
		 }
		 return Status;
	}*/

	public static boolean DataWebTable(By id, int sRow, int sCol, String strReadString, String ActionClick , String sTagName) throws Exception 
	{      
		Common common = CommonManager.getInstance().getCommon();
		boolean SearchString= false;
		boolean Status = false;
		Actions objActions = new Actions(ManagerDriver.getInstance().getWebDriver());
		WebElement  mytable = common.returnObject(id);
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		sRow--;
		List<WebElement> Columns_row = rows_table.get(sRow).findElements(By.tagName("td"));
		String celtext = Columns_row.get(sCol).getText();
		if (celtext.contains(strReadString))
		{
			SearchString = true;
			List<WebElement> CellElements = Columns_row.get(sCol).findElements(By.tagName(sTagName));
			for(WebElement element: CellElements)
			{
				switch(ActionClick)
				{
				case "single":
					element.click();
					Status = true;
					break; 
				case "double":
					objActions.doubleClick(element).build().perform();
					Status = true;
					break;
				}
				break;
			}
		}
		if(SearchString)
		{
			logger.info("Search String available in the table. '" + strReadString + "'");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System searched string in table and search string is  '" + strReadString + "'", "PASS");
		}
		else
		{
			logger.info("Search String not available in the table. '" + strReadString + "'");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System not searched string in table and search string is  '" + strReadString + "'", "FAIL");
			Status = false;
		}
		return Status;
	}


	/**
	 * @function This function use to fill the dependent test data in corresponding component
	 * @param sValue
	 * @return
	 * @throws Exception
	 */
	public boolean TestDataFill(String sValue) throws Exception
	{
		System.out.println("SCRCommon.testDataFill log start = " +Runtime.getRuntime().totalMemory());
		Common common = CommonManager.getInstance().getCommon();
		HashMap<String,Object> updateColumnNameValues = new HashMap<String,Object>();
		HashMap<String,Object> whereConstraint = new HashMap<String,Object>();
		String accountNumber = PCThreadCache.getInstance().getProperty(PCConstants.CACHE_ACCOUNT_NUMBER);
		String tcID = PCThreadCache.getInstance().getProperty("TCID");
		String policyNumber = PCThreadCache.getInstance().getProperty(PCConstants.CACHE_POLICY_NUMBER);
		String policyNumberSearch = PCThreadCache.getInstance().getProperty(PCConstants.CACHE_POLICY_NUMBER_SEARCH);
		String submissionNumber = PCThreadCache.getInstance().getProperty(PCConstants.CACHE_SUBMISSION_NUMBER);
		String PolicyeffDate = PCThreadCache.getInstance().getProperty(PCConstants.CACHE_POLICY_EFF_DATE);
		String PolicyexpDate = PCThreadCache.getInstance().getProperty(PCConstants.CACHE_POLICY_EXP_DATE);

		System.out.println(Runtime.getRuntime().freeMemory()); 
		boolean status = false;
		String[] sfunValue = sValue.split(":::");
		//		int funValueSize = sfunValue.length;
		XlsxReader sXL = XlsxReader.getInstance();
		//		int rowcount = sXL.getRowCount(sfunValue[1]);
		int rowcount = sXL.getRowCount(sfunValue[0]);
		for(int i=1;i<=rowcount;i++)
		{
			//			String value = sXL.getCellData(sfunValue[1], 0, i);
			String value = sXL.getCellData(sfunValue[0], 0, i);
			//			String sheetName = sXL.getCellData("TestData", 1, i);
			if(!value.isEmpty())
			{
				if(PCThreadCache.getInstance().getProperty("TCID").equals(value))
				{		
					switch (sfunValue[1].toUpperCase())
					{
					case "ACCOUNTNUMBER":
						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.AccountNumber, accountNumber);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(sfunValue[2],  updateColumnNameValues,  whereConstraint );
						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.edtaccountNumber, accountNumber);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(PCConstants.SHEET_SEARCHACCOUNT,  updateColumnNameValues,  whereConstraint );
						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update "+sfunValue[2]+" Set AccountNumber = '"+accountNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update SearchAccount Set edtaccountNumber = '"+accountNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");					
						status = true;
						break;
					case "POLICYNUMBER":
						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.AccountNumber, accountNumber);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(sfunValue[2],  updateColumnNameValues,  whereConstraint );

						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.edtaccountNumber, accountNumber);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(PCConstants.SHEET_SEARCHACCOUNT,  updateColumnNameValues,  whereConstraint );

						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.edtPolicyNumber, policyNumberSearch);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(PCConstants.SHEET_SEARCHPOLICY,  updateColumnNameValues,  whereConstraint );

						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.PolicyNumber, policyNumber);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(sfunValue[2],  updateColumnNameValues,  whereConstraint );

						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update "+sfunValue[2]+" Set AccountNumber = '"+accountNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update SearchAccount Set edtaccountNumber = '"+accountNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");	
						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update SearchPolicy Set edtPolicyNumber = '"+Payment.PolicyNumberSearch+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update "+sfunValue[2]+" Set PolicyNumber = '"+Payment.PolicyNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						status = true;
						break;
					case "SUBMISSIONNUMBER":

						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.AccountNumber, accountNumber);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(sfunValue[2],  updateColumnNameValues,  whereConstraint );

						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.edtaccountNumber, accountNumber);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(PCConstants.SHEET_SEARCHACCOUNT,  updateColumnNameValues,  whereConstraint );

						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.edtPolicyNumber, policyNumberSearch);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(PCConstants.SHEET_SEARCHPOLICY,  updateColumnNameValues,  whereConstraint );

						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.PolicyNumber, policyNumber);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(sfunValue[2],  updateColumnNameValues,  whereConstraint );


						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.SubmissionNumber, submissionNumber);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(sfunValue[2],  updateColumnNameValues,  whereConstraint );

						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update "+sfunValue[2]+" Set AccountNumber = '"+accountNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update SearchAccount Set edtaccountNumber = '"+accountNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");	
						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update SearchPolicy Set edtPolicyNumber = '"+Payment.PolicyNumberSearch+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update "+sfunValue[2]+" Set PolicyNumber = '"+Payment.PolicyNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update "+sfunValue[2]+" Set SubmissionNumber = '"+Payment.SubmissionNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						status = true;
						break;	
					case "POLICYNUMBERONLY":	

						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.PolicyNumber, policyNumber);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(sfunValue[2],  updateColumnNameValues,  whereConstraint );

						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.edtPolicyNumber, policyNumberSearch);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(PCConstants.SHEET_SEARCHPOLICY,  updateColumnNameValues,  whereConstraint );

						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update "+sfunValue[2]+" Set PolicyNumber = '"+Payment.PolicyNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update SearchPolicy Set edtPolicyNumber = '"+Payment.PolicyNumberSearch+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						status = true;
						break;
					case "CLAPOLICYNUMBERONLY":	

						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.CLAPolicyNumber, policyNumber);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(sfunValue[2],  updateColumnNameValues,  whereConstraint );

						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.edtPolicyNumber, policyNumberSearch);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(PCConstants.SHEET_SEARCHPOLICY,  updateColumnNameValues,  whereConstraint );

						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update "+sfunValue[2]+" Set CLAPolicyNumber = '"+Payment.PolicyNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update SearchPolicy Set edtPolicyNumber = '"+Payment.PolicyNumberSearch+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						status = true;
						break;
					case "ACCOUNTCLAPOLICYNUMBER":  
						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.AccountNumber, accountNumber);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(sfunValue[2],  updateColumnNameValues,  whereConstraint );

						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.CLAPolicyNumber, policyNumber);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(sfunValue[2],  updateColumnNameValues,  whereConstraint );

						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.edtPolicyNumber, policyNumberSearch);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(PCConstants.SHEET_SEARCHPOLICY,  updateColumnNameValues,  whereConstraint );

						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.edtaccountNumber, accountNumber);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(PCConstants.SHEET_SEARCHACCOUNT,  updateColumnNameValues,  whereConstraint );

						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update "+sfunValue[2]+" Set AccountNumber = '"+accountNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update "+sfunValue[2]+" Set CLAPolicyNumber = '"+Payment.PolicyNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update SearchPolicy Set edtPolicyNumber = '"+Payment.PolicyNumberSearch+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update SearchAccount Set edtaccountNumber = '"+accountNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						status = true;
						break;

					case "POLICYEFFDATE": 
						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.CLAPolicyEffDate,PolicyeffDate);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(sfunValue[2],  updateColumnNameValues,  whereConstraint );

						updateColumnNameValues.clear();
						whereConstraint.clear();
						updateColumnNameValues.put(PCConstants.CLAPolicyExpDate, PolicyexpDate);
						whereConstraint.put(PCConstants.ID, tcID);
						status = sXL.executeUpdateQuery(sfunValue[2],  updateColumnNameValues,  whereConstraint );

						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update "+sfunValue[2]+" Set PolicyNumber = '"+Payment.PolicyNumber+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						//status = common.UpdateQuery(HTML.properties.getProperty("DataSheetName"), "Update SearchPolicy Set edtPolicyNumber = '"+Payment.PolicyNumberSearch+"' where ID='"+PCThreadCache.getInstance().getProperty("TCID")+"'");
						status = true;
						break;	
					}	
				}
			}
		}	
		System.out.println("SCRCommon.testDataFill log End = " +Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory()); 
		return status;
	}

	/**
	 * @function This will use to take the current date
	 * @return Current Effective Date
	 */
	public static String ReturnCurrentDate() 
	{
		String status = null;
		try
		{
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			String strDate = sdf.format(date);
			status = strDate;
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			logger.error("Thread ID = " + Thread.currentThread().getId() + " Error Occured =" +e.getMessage(), e);
		}
		return status;
	}

	/**
	 * @function This will use to take the current date
	 * @return Current Effective Date
	 */
	public static boolean ReturnCurrentDate(String sFuncValue) 
	{
		Common common = CommonManager.getInstance().getCommon();
		boolean status = false;
		String edt = "edt" + sFuncValue;
		try
		{
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			String strDate = sdf.format(date);
			status = common.SafeAction(Common.o.getObject(edt), strDate, "edt");
		}
		catch(Exception e)
		{
			e.printStackTrace();      
			logger.error("Thread ID = " + Thread.currentThread().getId() + " Error Occured =" +e.getMessage(), e);
		}
		return status;
	}

	/**
	 * @function This will use to take the current date
	 * @return Current Effective Date
	 */
	public static boolean ReturnOneYearFutureDate(String sFuncValue) 
	{
		boolean status = false;
		Common common = CommonManager.getInstance().getCommon();
		String edt = "edt" + sFuncValue;
		try
		{
			Calendar Date = Calendar.getInstance();  
			Date.add(Calendar.YEAR,1);
			String End_Date =  (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
			status = common.SafeAction(Common.o.getObject(edt), End_Date, "edt");
		}
		catch(Exception e)
		{
			e.printStackTrace();  
			logger.error("Thread ID = " + Thread.currentThread().getId() + " Error Occured =" +e.getMessage(), e);
		}
		return status;
	}

	/**
	 * @function used to count the number of row count in the table
	 * @param locator
	 * @return sRowCount(row count)
	 */
	public static int TableRowCount(By locator)
	{
		Common common = CommonManager.getInstance().getCommon();
		WebElement  table = common.returnObject(locator);
		List<WebElement> rows_table = table.findElements(By.tagName("tr"));
		int sRowCount = rows_table.size();
		return sRowCount; 
	}

	/**
	 * @function use to return the 1 year date from current date
	 * @return 1 year from Effective Date
	 */
	public static String ReturnOneYearFromDate() 
	{
		String status = null;
		try
		{
			Calendar Date = Calendar.getInstance();  
			Date.add(Calendar.YEAR,1);
			String End_Date =  (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
			status = End_Date;
		}
		catch(Exception e)
		{
			e.printStackTrace();  
			logger.error("Thread ID = " + Thread.currentThread().getId() + " Error Occured =" +e.getMessage(), e);
		}
		return status;
	}

	public static boolean CommonWait(String sFuncValue) throws Exception
	{
		boolean status = true;
		Common common = CommonManager.getInstance().getCommon();
		String[] sValue = sFuncValue.split(":::");
		common.WaitForPageToBeReady();
		status = common.WaitUntilClickable(Common.o.getObject(""+sValue[0]+""),  Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
		if(status == false)
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Object "+sValue[0]+" is not ready to click","Object "+sValue[0]+" should ready to click", "FAIL");
		}
		return status;	
	}

	/**
	 * @function used to wait for specified time before executing ODS Component
	 * @return True
	 */
	public static Boolean ODSWait(int odswait1) throws Exception
	{
		Thread.sleep(odswait1);
		return true;
	}

	/**
	 * @function used to wait for specified time before executing MDM Component
	 * @return True
	 */
	public static Boolean MDMWait() throws Exception
	{
		Thread.sleep(Integer.valueOf(HTML.properties.getProperty("MDMWAIT")));              
		return true;
	}

	/**
	 * @Function to verify whether banner message is displayed or not
	 * @param strValue
	 * @return
	 * @throws Exception
	 */
	public static boolean VerifyBannerMsg(String strValue) throws Exception
	{
		Common common = CommonManager.getInstance().getCommon();
		String strObjName = "";
		String[] arrValue = strValue.split(":::");
		switch (arrValue[0].toUpperCase())
		{
		case "SUBMISSIONMANAGER" :
			strObjName = "eleASMBannerMessage";
		case "POLICYTRANSACTION" : 

		}
		boolean status = ManagerDriver.getInstance().getWebDriver().findElements(Common.o.getObject(strObjName)).size()!=0;
		String strErrorMsg = common.ReadElement(Common.o.getObject(strObjName), Integer.valueOf(HTML.properties.getProperty("LONGWAIT")));
		if(status == true)
		{

			if (strErrorMsg.toUpperCase().equalsIgnoreCase(arrValue[1]))
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify whether banner message is displayed as expected","Expected banner message '"+arrValue[1]+"'  is matching with Actual : '"+strErrorMsg+"'", "PASS");
				status = true;                      
			}
			else
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify whether banner message is displayed as expected","Expected banner message '"+arrValue[1]+"' is not matching with Actual : '"+strErrorMsg+"'", "FAIL");
				status = false;
			}
		}
		else{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify whether banner message is displayed or not","Banner message is not displayed : '"+strErrorMsg+"'", "FAIL");
			status = false;                   
		}

		return status;
	}


	/**
	 * @function This function use to fill the dependent test data in corresponding component
	 * @param sValue
	 * @return
	 * @throws IOException 
	 * @throws Exception
	 */
	public static boolean VerifyErrorMessages(String sValue) throws IOException
	{
		boolean Status = true;
		String expectedText = null;
		String[] sfunVal = sValue.split(":::::");
		String[] sfunValue = sfunVal[1].split(":::");
		String ele = "ele" + sfunVal[0];
		List<WebElement> CellElements = ManagerDriver.getInstance().getWebDriver().findElements(Common.o.getObject(ele));
		for(WebElement element: CellElements)
		{
			boolean matchStatus = false;
			String errorText = element.getText();
			System.out.println(errorText);
			for(String expText: sfunValue)
			{
				expectedText = expText.toString();
				
				if (errorText.contains(expectedText))
				{
					matchStatus = true;
					logger.info("Expected error text is matching with actual text '" + expectedText + "'");  
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Expected error text should matching with actual text '" + expectedText + "'","Expected error text is matching with actual text '" + expectedText + "'", "PASS");
					break;
				}
			}
			if(matchStatus == false)
			{
				logger.info("Expected error text is not matching with actual text '" + expectedText + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Expected error text should matching with actual text '" + expectedText + "'","Expected error text is not matching with actual text '" + expectedText + "'", "FAIL");
				//Status = false;
			}
		}
		return Status;
	}

	/**
	 * @function Verify Page Assert
	 * @param strPageName
	 * @return boolean
	 * @throws Exception
	 */
	public static Boolean PageVerify(String strPageName) throws Exception
	{    
		Common common = CommonManager.getInstance().getCommon();
		String ele = "ele" + strPageName;
		Boolean status = true;
		if(common.WaitUntilClickable(Common.o.getObject(ele),  Integer.valueOf(HTML.properties.getProperty("LONGESTWAIT"))))
		{
			logger.info("System displayed '" + strPageName + "'");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + strPageName + "'","System displayed '" + strPageName + "'", "PASS");
			status = true;
		}
		else
		{
			logger.info("System not displayed '" + strPageName + "'");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + strPageName + "'","System not displayed '" + strPageName + "'", "FAIL");
			status = false;
		}
		return status;
	}
	/**
	 * @function Verify Ptext
	 * @param strPageName
	 * @return boolean
	 * @throws Exception
	 */
	public static Boolean VerifyText(String TextDetails) throws Exception
	{    
		Common common = CommonManager.getInstance().getCommon();
		String xpathtext = ".//div[contains(text(),'"+TextDetails+"')]";
		By eleText = By.xpath(xpathtext);
		Boolean status = true;
		if(ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(xpathtext)).isDisplayed())
		{
			logger.info("System displayed '" + TextDetails + "'");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + TextDetails + "'","System displayed '" + TextDetails + "'", "PASS");
			status = true;
		}
		else
		{
			logger.info("System not displayed '" + TextDetails + "'");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + TextDetails + "'","System not displayed '" + TextDetails + "'", "FAIL");
			status = false;
		}
		return status;
	}
	/**
	 * @function Verify value in field
	 * @param strPageName
	 * @return boolean
	 * @throws Exception
	 */
	public static Boolean VerifyFieldValue(String TextDetails) throws Exception
	{    
		Common common = CommonManager.getInstance().getCommon();
		String xpathtext = ".//input[contains(@value,'"+TextDetails+"')]";
		By eleText = By.xpath(xpathtext);
		Boolean status = true;
		if(ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(xpathtext)).isDisplayed())
		{
			logger.info("System displayed '" + TextDetails + "'");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + TextDetails + "'","System displayed '" + TextDetails + "'", "PASS");
			status = true;
		}
		else
		{
			logger.info("System not displayed '" + TextDetails + "'");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + TextDetails + "'","System not displayed '" + TextDetails + "'", "FAIL");
			status = false;
		}
		return status;
	}
	/**
	 * @function Verify Exist or not
	 * @param strPageName
	 * @return boolean
	 * @throws Exception
	 */
	public Boolean VerifyElements(String strPageName) throws Exception{
		Common common = CommonManager.getInstance().getCommon();
		boolean Status = true;
		String[] sfunVal = strPageName.split(":::::");
		for(String element: sfunVal)
		{
			String[] sfunValue = element.split(":::");
			String ele = "ele" + sfunValue[1];
			switch (sfunValue[0].toUpperCase())
			{
			case "VISIBLETRUE":
				boolean popUpExist = common.ElementSize(Common.o.getObject(ele))!=0;
				if(popUpExist == true)
				{
					//if(Common.WaitUntilClickable(Common.o.getObject(ele),  Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT"))))
					//{
					logger.info("System displayed '" + strPageName + "'");  
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + strPageName + "'","System displayed '" + strPageName + "'", "PASS");
					//Status = true;
				}
				else
				{
					logger.info("System not displayed '" + strPageName + "'");  
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + strPageName + "'","System not displayed '" + strPageName + "'", "FAIL");
					//Status = false;
				}
				break;
			case "VISIBLEFALSE":
				boolean popUpExist1 = common.ElementSize(Common.o.getObject(ele))!=0;
				if(popUpExist1 == true)
				{
					logger.info("System not displayed '" + strPageName + "'");  
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should not display '" + strPageName + "'","System displayed '" + strPageName + "'", "FAIL");
					//Status = true;
				}
				else
				{
					logger.info("System displayed '" + strPageName + "'");  
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should not display '" + strPageName + "'","System not displayed '" + strPageName + "'", "PASS");
					//Status = false;
				}
			}
		}
		return Status;
	}

	/**
	 * @function Use to click the 
	 * @param strPageName
	 * @return
	 * @throws Exception
	 */
	public Boolean PageLeftPane1(String strPageName) throws Exception
	{    
		Common common = CommonManager.getInstance().getCommon();
		String strReadString="";
		String actionObjetName="";
		String LeftPanelActionsLinksLevel = "";

		boolean SearchString=false;
		boolean ActionObject=false;

		String LeftPanelLinks="";
		String LeftPanelActions = "";
		int readCol = 0;
		boolean Status = true;
		String[] sfunVal = strPageName.split("::");

		switch (sfunVal[0].toUpperCase())
		{
		case "DESKTOP":
			LeftPanelLinks = "eleDeskTopLeftPanelLinks";
			LeftPanelActions = "eleDeskTopLeftPanelActions";
			break;
		case "ACCOUNT":
			LeftPanelLinks = "eleAccountLeftPanelLinks";
			LeftPanelActions = "eleAccountLeftPanelActions";
			break;
		case "POLICY":
			LeftPanelLinks = "elePolicyLeftPanelLinks";
			LeftPanelActions = "elePolicyLeftPanelActions";
			break;
		}

		String[] sLnkAct = sfunVal[1].split("--");
		switch (sLnkAct[0].toUpperCase())
		{
		case "LINKS":
			WebElement  mytable = common.returnObject(Common.o.getObject(LeftPanelLinks));
			List<WebElement> allrows = mytable.findElements(By.tagName("tr"));
			for(int i = 0; i <= allrows.size()-1; i++)
			{
				List<WebElement> Cells = allrows.get(i).findElements(By.tagName("td"));
				String readText = Cells.get(readCol).getText();
				strReadString = sLnkAct[1];
				actionObjetName = sLnkAct[1];
				if (readText.contains(sLnkAct[1]))
				{
					SearchString = true;
					List<WebElement> CellElements = Cells.get(readCol).findElements(By.tagName("div"));
					for(WebElement element: CellElements)
					{
						String objName = element.getText();
						if(objName.contains(sLnkAct[1]))
						{
							Status = true;
							ActionObject = true;
							element.click();
							break;
						}
					}
				}
				if(ActionObject == true)
				{
					break;
				}
			}
			if(SearchString)
			{
				logger.info("Search String available in the table. '" + strReadString + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System searched string in table and srarch string is  '" + actionObjetName + "'", "PASS");
				if(ActionObject)
				{
					logger.info("Search and click on object in the table cell and object name is '" + actionObjetName + "'");  
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search object in the table cell and click on object. Object name is '" + actionObjetName + "'","System searched object in the table and clicked on object. object name is '" + actionObjetName + "'", "PASS");
					Status = true;                                    
				}
				else
				{
					logger.info("Search and click on object in the table cell and object name is '" + actionObjetName + "'");  
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search object in the table cell and click on object. Object name is '" + actionObjetName + "'","System searched object in the table and clicked on object. object name is '" + actionObjetName + "'", "FAIL");
					Status = false;
				}
			}
			else
			{
				logger.info("Search String not available in the table. '" + strReadString + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System searched string in table and srarch string is  '" + actionObjetName + "'", "FAIL");
				Status = false;
			}
			break;
		case "ACTIONS":
			Status = common.SafeAction(Common.o.getObject(LeftPanelActions), "", LeftPanelActions);
			String[] sActs = sLnkAct[1].split("&&");
			for(String str: sActs)
			{
				LeftPanelActionsLinksLevel = "x-menu-item-text";
				//String[] sLinkAction  = str.split(":&");
				List<WebElement> allrows1 = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("span"));
				for(WebElement ele: allrows1)
				{
					ActionObject = false;
					Status = false;
					String readAttri = ele.getAttribute("class");

					strReadString = str;
					actionObjetName = str;
					if (readAttri.contains(LeftPanelActionsLinksLevel))
					{
						//logger.info(readAttri);
						String readText = ele.getText();
						if (readText.contains(str))
						{
							SearchString = true;
							String readAttriID = ele.getAttribute("id");
							WebElement  elem = common.returnObject(By.id(readAttriID));
							Status = true;
							ActionObject = true;
							common.highlightElement(By.id(readAttriID));
							elem.click();
							common.WaitForPageToBeReady();
							break;
						}
					}
					if(ActionObject == true)
					{
						break;
					}
				}
				if(SearchString)
				{
					logger.info("Search String available in the table. '" + strReadString + "'");  
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System searched string in table and srarch string is  '" + actionObjetName + "'", "PASS");
					if(ActionObject)
					{
						logger.info("Search and click on object in the table cell and object name is '" + actionObjetName + "'");  
						HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search object in the table cell and click on object. Object name is '" + actionObjetName + "'","System searched object in the table and clicked on object. object name is '" + actionObjetName + "'", "PASS");
						Status = true;                                    
					}
					else
					{
						logger.info("Search and click on object in the table cell and object name is '" + actionObjetName + "'");  
						HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search object in the table cell and click on object. Object name is '" + actionObjetName + "'","System searched object in the table and clicked on object. object name is '" + actionObjetName + "'", "FAIL");
						Status = false;
					}
				}
				else
				{
					logger.info("Search String not available in the table. '" + strReadString + "'");  
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System searched string in table and srarch string is  '" + actionObjetName + "'", "FAIL");
					Status = false;
				}
			}
		}
		return Status;
	}

	/**
	 * @function Use to select the policy number in the account summary
	 * @param sFuncValue
	 * @return
	 * @throws Exception
	 */
	public boolean SelectPolicyNumber(String sFuncValue) throws Exception
	{
		boolean status = false;
		Common common = CommonManager.getInstance().getCommon();
		String[] sValue = sFuncValue.split(":::");
		status = common.ActionOnTable(Common.o.getObject("eleAccountSummary_PolicyTermsTbl"), 1, 1, sValue[0], sValue[0], "a");
		return status;
	}

	/**
	 * @function This function use to verify the CLA policy info status
	 * @param sValue
	 * @return
	 * @throws Exception
	 */
	public static boolean VerifyPolicyStatus(String sValue) throws Exception
	{
		boolean status = false;
		Common common = CommonManager.getInstance().getCommon();
		//  	Thread.sleep(8000);
		String strPolicyStatus = common.ReadElement(Common.o.getObject("eleCLAPolicyStatus"), Integer.valueOf(HTML.properties.getProperty("LONGWAIT")));
		if(strPolicyStatus.equalsIgnoreCase(sValue))
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify the policy status","Application policy status is matching with expected status: '"+strPolicyStatus+"'", "PASS");
			status = true;
		}
		else
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify the policy status","Application policy status is not matching with expected status: '"+strPolicyStatus+"'", "FAIL");
			status = false;			
		}
		return status;
	}

	/**
	 * @function This function verify Messages
	 * @param value (Success Messages)
	 * @return status
	 * @throws Exception
	 */
	public boolean VerifyStandardizationMessages(String strFunValue) throws Exception 
	{
		boolean status = false;
		Common common = CommonManager.getInstance().getCommon();
		String sApplnValue = "";
		String[] sValue = strFunValue.split(":::");
		try
		{
			switch (sValue[0])
			{
			case "AccountLocation":
				sApplnValue =common.ReadElement(Common.o.getObject("eleLocationInfoMsg"), Integer.valueOf(HTML.properties.getProperty("LONGWAIT")));
				break;
			case "AccountContact":
				sApplnValue =common.ReadElement(Common.o.getObject("eleAccount_Message"), Integer.valueOf(HTML.properties.getProperty("LONGWAIT")));
				break;
			case "CreateAccount":
				sApplnValue =common.ReadElement(Common.o.getObject("eleAddSuccessMsg"), Integer.valueOf(HTML.properties.getProperty("LONGWAIT")));
				break;
			}
			if (sApplnValue.equals(sValue[1]))
			{
				status = true;
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display expected standardized message","System displayed" +sApplnValue+ "message as expected", "PASS");
			}
			else
			{
				status = false;
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display expected standardized message","System did not display" +sApplnValue+ "message as expected", "FAIL");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("Thread ID = " + Thread.currentThread().getId() + " Error Occured =" +e.getMessage(), e);
		}
		return status;
	}

	/**
	 * @function it helps to handle the create account new button for dynamic	 
	 * @return 
	 * @throws Exception 
	 */
	public boolean CreateAccountOK() throws Exception
	{
		boolean status = true;
		Common common = CommonManager.getInstance().getCommon();
		boolean popUpExist = common.ElementSize(Common.o.getObject("eleCreateAccountOK"))!=0;
		if(popUpExist == true)
		{
			common.SafeAction(Common.o.getObject("eleCreateAccountOK"), "eleCreateAccountOK", "eleCreateAccountOK");
			status = true;
		}
		return status;
	}

	/**
	 * @function it helps to handle the create account new button for dynamic	 
	 * @return 
	 * @throws Exception 
	 */
	public boolean CreateAccountCancel() throws Exception
	{
		boolean status = true;
		Common common = CommonManager.getInstance().getCommon();
		boolean popUpExist = common.ElementSize(Common.o.getObject("eleCreateAccountCancel"))!=0;
		if(popUpExist == true)
		{
			common.SafeAction(Common.o.getObject("eleCreateAccountCancel"), "eleCreateAccountCancel", "eleCreateAccountCancel");
			status = true;
		}
		return status;
	}
	public static Boolean VerifyElementText1(String strPageName) throws Exception{
		boolean Status = true;
		Common common = CommonManager.getInstance().getCommon();
		String[] sfunVal = strPageName.split(":::");
		common.WaitUntilClickable(Common.o.getObject(sfunVal[0]), 30);		
		WebElement element1 = ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject(sfunVal[0]));
		String txt =  element1.getText();
		if (txt.equals(sfunVal[1]))
		{
			logger.info("System displayed '" + sfunVal[1] + "'");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + sfunVal[1] + "'","System displayed '" + sfunVal[1] + "'", "PASS");
			Status = true;
		}
		else
		{
			logger.info("System not displayed '" + sfunVal[1] + "'");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + sfunVal[1] + "'","System not displayed '" + sfunVal[1] + "'", "FAIL");
			Status = false;
		}
	
	return Status;
}

	

	public static Boolean VerifyElementText(String strPageName) throws Exception{

		boolean Status = true;
		Common common = CommonManager.getInstance().getCommon();
		String[] sfunVal = strPageName.split(":::::");
	
		for(String element: sfunVal)
		{
			String[] sfunValue = element.split(":::");
			String ele = "ele" + sfunValue[0];

			//String txt = Common.ReadElement(Common.o.getObject(ele), 30);

			common.WaitUntilClickable(Common.o.getObject(ele), 30);		
			WebElement element1 = ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject(ele));
			String txt =  element1.getText();
			//String txt =  element1.getAttribute("value");
			if (txt.contentEquals(sfunValue[1].toUpperCase()))
			{
				logger.info("System displayed '" + sfunValue[1] + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + sfunValue[1] + "'","System displayed '" + sfunValue[1] + "'", "PASS");
				//Status = true;
			}
			else
			{
				logger.info("System not displayed '" + sfunValue[1] + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + sfunValue[1] + "'","System not displayed '" + sfunValue[1] + "'", "FAIL");
				//Status = false;
			}
		}
		return Status;
	}

	public Boolean VerifyEditBoxText(String strPageName) throws Exception{

		boolean Status = true;
		Common common = CommonManager.getInstance().getCommon();
		String[] sfunVal = strPageName.split(":::::");

		for(String element: sfunVal)
		{
			String[] sfunValue = element.split(":::");
			String ele = "edt" + sfunValue[0];

			//String txt = Common.ReadElement(Common.o.getObject(ele), 30);

			common.WaitUntilClickable(Common.o.getObject(ele), 30);		
			WebElement element1 = ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject(ele));
			//String txt =  element1.getText();
			String txt =  element1.getAttribute("value");
			if (txt.equalsIgnoreCase(sfunValue[1].toUpperCase()))
			{
				logger.info("System displayed '" + sfunValue[1] + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + sfunValue[1] + "'","System displayed '" + sfunValue[1] + "'", "PASS");
				//Status = true;
			}
			else
			{
				logger.info("System not displayed '" + sfunValue[1] + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + sfunValue[1] + "'","System not displayed '" + sfunValue[1] + "'", "FAIL");
				//Status = false;
			}
		}
		return Status;
	}

	public Boolean VerifyElementNotExistence(String strElement) throws Exception{

		String[] sfunVal = strElement.split(":::");
		for(String element: sfunVal)
		{
			boolean Status = true;
			List<WebElement> ele = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("label"));
			for(WebElement e: ele)
			{
				String txt = e.getText();
				
				if (txt.equals(element))  // we have to use .contains method if we want to search a part of string 
				{
					Status = false;
				}

			}
			if(Status)
			{
				logger.info("'" + element + "' " + "Element should not available");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Element should not available '" + element + "'","'" + element + "' " + "Element not available", "PASS");
				//Status = true;					  
			}
			else
			{
				logger.info("Element should not available '" + element + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "'" + element + "' " + "Element should not available","'" + element + "' " + "Element available", "FAIL");
				//Status = false;
			}

		}
		return true;
	}
	
	public Boolean VerifyElementExistence(String strElement) throws Exception{

		String[] sfunVal = strElement.split(":::");
		for(String element: sfunVal)
		{
			boolean Status = true;
			List<WebElement> ele = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("label"));
			for(WebElement e: ele)
			{
				String txt = e.getText();
				System.out.println(txt);
				if (txt.equals(element))  // we have to use .contains method if we want to search a part of string 
				{
					Status = true;
				}

			}
			if(Status)
			{
				logger.info("'" + element + "' " + "Element should not available");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Element should available '" + element + "'","'" + element + "' " + "Element is available", "PASS");
				//Status = true;					  
			}
			else
			{
				logger.info("Element should not available '" + element + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "'" + element + "' " + "Element should available","'" + element + "' " + "Element is not available", "FAIL");
				//Status = false;
			}

		}
		return true;
	}

	/**
	 * @function Use to click the left pane of the PC and also click menus
	 * @param strPageName
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean PageLeftPane(String strPageName) throws Exception{

		Common common = CommonManager.getInstance().getCommon();
		String strReadString="";
		String actionObjetName="";
		String LeftPanelActionsLinksLevel = "";
		boolean SearchString=false;
		boolean ActionObject=false;
		String LeftPanelLinks="";
		String LeftPanelActions = "";
		int readCol = 0;
		boolean Status = true;
		String[] sfunVal = strPageName.split("::");

		switch (sfunVal[0].toUpperCase())
		{
		case "DESKTOP":
			LeftPanelLinks = "eleDeskTopLeftPanelLinks";
			LeftPanelActions = "eleDeskTopLeftPanelActions";
			LeftPanelActionsLinksLevel = "x-menu-item-text";
			break;
		case "ACCOUNT":
			LeftPanelLinks = "eleAccountLeftPanelLinks";
			LeftPanelActions = "eleAccountLeftPanelActions";
			LeftPanelActionsLinksLevel = "x-tree-node-text ";
			break;
		case "POLICY":
			LeftPanelLinks = "elePolicyLeftPanelLinks";
			LeftPanelActions = "elePolicyLeftPanelActions";
			LeftPanelActionsLinksLevel = "x-tree-node-text ";
			break;
		case "ADMIN":
			LeftPanelLinks = "eleAdminLeftPanelLinks";
			//LeftPanelActions = "elePolicyLeftPanelActions";
			LeftPanelActionsLinksLevel = "x-tree-node-text ";
			break;

		}

		String[] sLnkAct = sfunVal[1].split("--");
		switch (sLnkAct[0].toUpperCase())
		{
		case "LINKS":

			WebElement  mytable = common.returnObject(Common.o.getObject(LeftPanelLinks));
			List<WebElement> allrows = mytable.findElements(By.tagName("tr"));
			for(int i = 0; i <= allrows.size()-1; i++)
			{
				List<WebElement> Cells = allrows.get(i).findElements(By.tagName("td"));
				String readText = Cells.get(readCol).getText();
				strReadString = sLnkAct[1];
				actionObjetName = sLnkAct[1];
				if (readText.contains(sLnkAct[1]))
				{
					SearchString = true;
					List<WebElement> CellElements = Cells.get(readCol).findElements(By.tagName("div"));
					for(WebElement element: CellElements)
					{
						String objName = element.getText();
						if(objName.contains(sLnkAct[1]))
						{
							Status = true;
							ActionObject = true;
							element.click();
							break;
						}
					}
				}
				if(ActionObject == true)
				{
					break;
				}
			}
			if(SearchString)
			{
				logger.info("Search String available in the table. '" + strReadString + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System searched string in table and srarch string is  '" + actionObjetName + "'", "PASS");
				if(ActionObject)
				{
					logger.info("Search and click on object in the table cell and object name is '" + actionObjetName + "'");  
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search object in the table cell and click on object. Object name is '" + actionObjetName + "'","System searched object in the table and clicked on object. object name is '" + actionObjetName + "'", "PASS");
					Status = true;					  
				}
				else
				{
					logger.info("Search and click on object in the table cell and object name is '" + actionObjetName + "'");  
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search object in the table cell and click on object. Object name is '" + actionObjetName + "'","System searched object in the table and clicked on object. object name is '" + actionObjetName + "'", "FAIL");
					Status = false;
				}
			}
			else
			{
				logger.info("Search String not available in the table. '" + strReadString + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System searched string in table and srarch string is  '" + actionObjetName + "'", "FAIL");
				Status = false;
			}
			break;
		case "ACTIONS":
			Status = common.SafeAction(Common.o.getObject(LeftPanelActions), "", LeftPanelActions);
			String[] sActs = sLnkAct[1].split("&&");
			for(String str: sActs)
			{
				LeftPanelActionsLinksLevel = "x-menu-item-text";
				//String[] sLinkAction = str.split(":&");
				List<WebElement> allrows1 = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("span"));
				for(WebElement ele: allrows1)
				{
					ActionObject = false;
					Status = false;
					String readAttri = ele.getAttribute("class");

					strReadString = str;
					actionObjetName = str;
					if (readAttri.contains(LeftPanelActionsLinksLevel))
					{
						//logger.info(readAttri);
						String readText = ele.getText();
						if (readText.contains(str))
						{
							SearchString = true;
							String readAttriID = ele.getAttribute("id");
							WebElement  elem = common.returnObject(By.id(readAttriID));
							Status = true;
							ActionObject = true;
							common.highlightElement(By.id(readAttriID));
							elem.click();
							common.WaitForPageToBeReady();
							break;
						}
					}
					if(ActionObject == true)
					{
						break;
					}
				}
				if(SearchString)
				{
					logger.info("Search String available in the table. '" + strReadString + "'");  
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System searched string in table and srarch string is  '" + actionObjetName + "'", "PASS");
					if(ActionObject)
					{
						logger.info("Search and click on object in the table cell and object name is '" + actionObjetName + "'");  
						HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search object in the table cell and click on object. Object name is '" + actionObjetName + "'","System searched object in the table and clicked on object. object name is '" + actionObjetName + "'", "PASS");
						Status = true;					  
					}
					else
					{
						logger.info("Search and click on object in the table cell and object name is '" + actionObjetName + "'");  
						HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search object in the table cell and click on object. Object name is '" + actionObjetName + "'","System searched object in the table and clicked on object. object name is '" + actionObjetName + "'", "FAIL");
						Status = false;
					}
				}
				else
				{
					logger.info("Search String not available in the table. '" + strReadString + "'");  
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System searched string in table and srarch string is  '" + actionObjetName + "'", "FAIL");
					Status = false;
				}
			}
		}
		return Status;
	}

	/**
	 * @function Wait until the browser state is ready
	 * @return status
	 */
	public boolean WaitToPageToReady()
	{
		Common common = CommonManager.getInstance().getCommon();
		boolean status = true;
		common.WaitForPageToBeReady();
		return status;
	}

	/**
	 * @function This function used to take the SS where its required
	 * @throws IOException
	 */
	public static String PageScreenShot() throws IOException
	{       
		//		   File directory = new File (".");
		File reportFile;          
		Date d = new Date();          
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy");
		String date = dateFormat.format(d);
		File dir = new File("C:\\Selenium\\WorkSpace\\PC\\Reports\\HTMLReports\\"+PCThreadCache.getInstance().getProperty("testcasename")+"_"+ date);
		//           String FolderName = "C:\\Selenium\\WorkSpace\\PC\\Reports\\HTMLReports\\"+PCThreadCache.getInstance().getProperty("testcasename")+"_"+ date;
		if (!dir.exists()) {
			dir.mkdir();
		}		
		do {

			//reportFile = new File(directory.getCanonicalPath() +"\\Reports\\HTMLReports\\"+PCThreadCache.getInstance().getProperty("testcasename")+"_"+ date+"_"+ d.getHours() +d.getMinutes()+d.getSeconds()+ ".png");
			reportFile = new File(dir.getCanonicalPath()+"\\"+PCThreadCache.getInstance().getProperty("testcasename")+"_"+ date+"_"+ d.getHours() +d.getMinutes()+d.getSeconds()+ ".png");
			Path = dir.getCanonicalPath();

		} 
		while (reportFile.exists());
		File screenshot = ((TakesScreenshot) ManagerDriver.getInstance().getWebDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, reportFile);
		return Path;
	}

	public static boolean ZipFolder() throws Exception {

		zipFolder(SCRCommon.Path, SCRCommon.Path+".zip");
		return true;

	}
	
	static public void zipFolder(String srcFolder, String destZipFile) throws Exception {
		ZipOutputStream zip = null;
		FileOutputStream fileWriter = null;

		fileWriter = new FileOutputStream(destZipFile);
		zip = new ZipOutputStream(fileWriter);

		addFolderToZip("", srcFolder, zip);
		zip.flush();
		zip.close();
	}

	static private void addFileToZip(String path, String srcFile, ZipOutputStream zip)
			throws Exception {

		File folder = new File(srcFile);
		if (folder.isDirectory()) {
			addFolderToZip(path, srcFile, zip);
		} else {
			byte[] buf = new byte[1024];
			int len;
			FileInputStream in = new FileInputStream(srcFile);
			zip.putNextEntry(new ZipEntry(path + "/" + folder.getName()));
			while ((len = in.read(buf)) > 0) {
				zip.write(buf, 0, len);
			}
		}
	}

	static private void addFolderToZip(String path, String srcFolder, ZipOutputStream zip)
			throws Exception {
		File folder = new File(srcFolder);

		for (String fileName : folder.list()) {
			if (path.equals("")) {
				addFileToZip(folder.getName(), srcFolder + "/" + fileName, zip);
			} else {
				addFileToZip(path + "/" + folder.getName(), srcFolder + "/" + fileName, zip);
			}
		}
	}

	public Boolean WaitForObjectToBeReady(String sFuncValue) throws Exception, Exception
	{
		Boolean status = false;
		Common common = CommonManager.getInstance().getCommon();
		status = common.WaitUntilClickable(Common.o.getObject("ele"+sFuncValue+""), Integer.valueOf(HTML.properties.getProperty("LONGESTWAIT")));
		return status;
	}

	public Boolean QPBOtherPremiumEdit(String strParam) throws Exception
	{
		Common common = CommonManager.getInstance().getCommon();
		Boolean status = true;
		String[] sHeader = strParam.split("###");
		String[] strParams = sHeader[1].split(":::::");
		for(int i=0; i<(strParams.length);i++)
		{
			String strParams1[] = strParams[i].split(":::");
			String cla = "x-form-item-label x-unselectable x-form-item-label-top";
			List<WebElement> CellElements = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("label"));
			for(WebElement element: CellElements)
			{
				String objName = element.getText();
				String clas = element.getAttribute("class");
				if(objName.contains(strParams1[0]) )
				{
					if(cla.contains(clas))
					{
						String readAttriID1 = element.getAttribute("id");
						String[] sID = readAttriID1.split("DV:");
						String[] sID1 = sID[1].split(":");
						int value2 = Integer.parseInt(sID1[0])+1;
						String SD3 = sID[0].concat("DV:")+value2+":QPBModalQuestion_ExtInputSet:IntegerFieldInput-inputEl";					        		
						WebElement  elem = common.returnObject(By.id(SD3));
						elem.click();
						elem.sendKeys(strParams1[1]);
						elem.sendKeys(Keys.TAB);
						//				        		  	Common.WaitForPageToBeReady();
						Thread.sleep(4000);
						break;
					}	
				}
			}
			if(status)
			{
				logger.info(""+strParams1[0]+" TestArea has been Filled");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" TestArea should filled",""+strParams1[0]+" TestArea is filled","PASS");
			}
			else
			{
				logger.info(""+strParams1[0]+" TestArea has not been Filled");
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" TestArea should filled",""+strParams1[0]+" TestArea is not filled","FAIL");
				status = false;
			}
		}
		return status;
	}

	public Boolean QPBEdit(String strParam) throws Exception
	{
		Common common = CommonManager.getInstance().getCommon();
		Boolean status = false;
		String[] sHeader = strParam.split("###");
		String[] strParams = sHeader[1].split(":::::");
		//		String[] strParams = strParam.split(":::::");
		for(int i=0; i<(strParams.length);i++)
		{
			String strParams1[] = strParams[i].split(":::");
			//		         for(String str: strParams)
			//		         {
			String cla = "x-form-item-label x-unselectable x-form-item-label-top";
			List<WebElement> CellElements = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("label"));
			for(WebElement element: CellElements)
			{
				String objName = element.getText();
				String clas = element.getAttribute("class");
				if(objName.contains(strParams1[0]) )
				{
					if(cla.contains(clas))
					{
						String readAttriID1 = element.getAttribute("id");
						String[] sID = readAttriID1.split("-");
						String sID1 = sID[0].concat("-inputEl");
						WebElement  elem = common.returnObject(By.id(sID1));
						elem.click();
						common.WaitForPageToBeReady();
						elem.sendKeys(strParams1[1]);
						status = false;
						break;
					}	
				}

			}
			//		         }
			if(status)
			{
				logger.info(""+strParams1[0]+" TestArea has been Filled");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" TestArea should filled",""+strParams1[0]+" TestArea is filled","PASS");
			}
			else
			{
				logger.info(""+strParams1[0]+" TestArea has not been Filled");
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" TestArea should filled",""+strParams1[0]+" TestArea is not filled","FAIL");
				status = false;
			}
		}
		return status;
	}

	public Boolean QPBEditWait(String strParam) throws Exception
	{
		Common common = CommonManager.getInstance().getCommon();
		Boolean status = false;
		String[] sHeader = strParam.split("###");
		String[] strParams = sHeader[1].split(":::::");
		//		String[] strParams = strParam.split(":::::");
		for(int i=0; i<(strParams.length);i++)
		{
			String strParams1[] = strParams[i].split(":::");
			//		         for(String str: strParams)
			//		         {
			String cla = "x-form-item-label x-unselectable x-form-item-label-left";
			List<WebElement> CellElements = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("label"));
			for(WebElement element: CellElements)
			{
				String objName = element.getText();
				String clas = element.getAttribute("class");
				if(objName.contains(strParams1[0]) )
				{
					if(cla.contains(clas))
					{
						String readAttriID1 = element.getAttribute("id");
						String[] sID = readAttriID1.split("-");
						String sID1 = sID[0].concat("-inputEl");
						WebElement  elem = common.returnObject(By.id(sID1));
						elem.click();
						elem.sendKeys(strParams1[1]);
						elem.sendKeys(Keys.TAB);
						Thread.sleep(4000);
						status = true;
						break;
					}	
				}  
			}
			//		         }
			if(status)
			{
				logger.info(""+strParams1[0]+" TestArea has been Filled");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" TestArea should filled",""+strParams1[0]+" TestArea is filled","PASS");
			}
			else
			{
				logger.info(""+strParams1[0]+" TestArea has not been Filled");
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" TestArea should filled",""+strParams1[0]+" TestArea is not filled","FAIL");
				status = false;
			}
		}
		return status;
	}

	public Boolean QPBCoverageMarketingFlyers(String strParam) throws Exception
	{
		Common common = CommonManager.getInstance().getCommon();
		Boolean status = false;
		String[] sHeader = strParam.split("###");
		String[] strParams = sHeader[1].split(":::::");
		//		String[] strParams = strParam.split(":::::");
		for(int i=0; i<(strParams.length);i++)
		{
			String strParams1[] = strParams[i].split(":::");
			//				for(String str: strParams1)
			//		         {
			List<WebElement> CellElements = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("a"));
			for(WebElement element: CellElements)
			{
				String objName = element.getText();
				{
					if(objName.contains(strParams1[0]))
					{
						String readAttriID1 = element.getAttribute("id");
						String[] sID = readAttriID1.split("_ExtInputSet");
						String sID1 = sID[0].concat("_ExtInputSet:choicea:choicea_Arg-inputEl");
						WebElement  sElement = common.returnObject(By.id(sID1));
						sElement.click();
						sElement.clear();
						sElement.sendKeys(strParams1[1]);
						sElement.sendKeys(Keys.TAB);
						common.WaitForPageToBeReady();
						Thread.sleep(3000);
						status = true;
						break;
					}	
				}
			}
			//		         }
			if(status)
			{
				logger.info(""+strParams1[0]+" Flyer has been Filled");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" should filled",""+strParams1[0]+" is filled","PASS");
			}
			else
			{
				logger.info(""+strParams1[0]+" Flyer has not been Filled");
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" should filled",""+strParams1[0]+" is not filled","FAIL");
				status = false;
			}
		}
		return status;
	}

	public Boolean QPBCheckBox(String strParam) throws Exception
	{
		Common common = CommonManager.getInstance().getCommon();
		Boolean status = false;
		String[] sHeader = strParam.split("###");
		String[] strParams = sHeader[1].split(":::");
		//		String[] strParams = strParam.split(":::");
		for(String str: strParams)
		{
			String cla = "x-form-cb-label x-form-cb-label-after";
			List<WebElement> CellElements = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("label"));
			for(WebElement element: CellElements)
			{
				String objName = element.getText();
				String clas = element.getAttribute("class");
				if(objName.contains(str) )
				{
					if(cla.contains(clas))
					{
						String readAttriID1 = element.getAttribute("id");
						WebElement  elem = common.returnObject(By.id(readAttriID1));
						elem.click();
						//				        		  Common.WaitForPageToBeReady();
						//				        		  waitForAjax();
						//				        		  Common.getResponseCode();
						//				        		  Common.checkHttpResponseCode();
						//				        		  Common.getStatusCode();
						//				        		  Common.linkExists();
						//				        		  Common.getStatusCode();
						status = true;
						break;
					}	
				}
			}
			if(status)
			{
				logger.info(""+str+" Check Box has been Selected");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+str+" should filled",""+str+" is Selected","PASS");					  
			}
			else
			{
				logger.info(""+str+" Check Box has not been Selected");
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+str+" should filled",""+str+" is not Selected","FAIL");
				status = false;
			}
		}
		return status;
	}

	public Boolean QPBVerifyElement(String strParam) throws Exception
	{
		Common common = CommonManager.getInstance().getCommon();
		Boolean status = false;
		Boolean sVerifyElementAssert = true;
		String[] sHeader = strParam.split("###");
		String[] strParams = sHeader[1].split(":::");
		//		String[] strParams = strParam.split(":::");
		for(String str: strParams)
		{
			String cla = "x-form-cb-label x-form-cb-label-after";
			List<WebElement> CellElements = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("label"));
			for(WebElement element: CellElements)
			{
				String objName = element.getText();
				String clas = element.getAttribute("class");
				if(objName.contains(str))
				{
					if(cla.contains(clas))
					{
						String readAttriID1 = element.getAttribute("id");
						WebElement  elem = common.returnObject(By.id(readAttriID1));
						//Common.highlightElement(By.id(readAttriID1));
						elem.click();
						status = true;
						sVerifyElementAssert = SCRCommon.PageVerify(strParams[1]);
						break;
						//				        		  Common.WaitForPageToBeReady();
					}	
				}
			}
			if(status)
			{
				logger.info(""+str+" Check Box has been Selected and Verified the Element");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+str+" should filled",""+str+" is Selected","PASS");
				if(sVerifyElementAssert)
				{
					logger.info(""+strParams[1]+" Verified the Element");  
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams[1]+" should filled",""+strParams[1]+" is Selected","PASS");
				}
				else
				{
					logger.info(""+str+" Element does not exist");
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams[1]+" should filled",""+strParams[1]+" is not Selected","FAIL");
					status = false;
				}
			}
			else
			{
				logger.info(""+str+" Check Box has not been Selected");
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+str+" should filled",""+str+" is not Selected","FAIL");
				status = false;
			}
		}
		return status;
	}

	public static String ReturnSixtyDaysFromDate() 
	{
		String status = null;
		try
		{
			Calendar Date = Calendar.getInstance();  
			Date.add(Calendar.DATE,60);
			String End_Date =  (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
			status = End_Date;
		}
		catch(Exception e)
		{
			e.printStackTrace();  
			logger.error("Thread ID = " + Thread.currentThread().getId() + " Error Occured =" +e.getMessage(), e);
		}
		return status;
	}

	public static String ReturnDate(int dateValue) 
	{
		String sDate = null;
		try
		{
			/*Calendar Date = Calendar.getInstance();
   			   	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        	   	Date.add(Calendar.DATE,5);
        	   	String sFormat= (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
        	   	status = sdf.parse(sFormat, new ParsePosition(5));*/   
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			Calendar c = Calendar.getInstance();
			c.add(Calendar.DATE, dateValue);
			sDate = sdf.format(c.getTime());
		}
		catch(Exception e)
		{
			e.printStackTrace();  
			logger.error("Thread ID = " + Thread.currentThread().getId() + " Error Occured =" +e.getMessage(), e);
		}
		return sDate;
	}

	public static String ReturnHundredAndEightyDaysFromDate() 
	{
		String status = null;
		try
		{
			Calendar Date = Calendar.getInstance();  
			Date.add(Calendar.DATE,180);
			String End_Date =  (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
			status = End_Date;
		}
		catch(Exception e)
		{
			e.printStackTrace();      
			logger.error("Thread ID = " + Thread.currentThread().getId() + " Error Occured =" +e.getMessage(), e);
		}
		return status;
	} 

	/**
	 * @function it helps to Mouseover the Object	 
	 * @return 
	 * @throws Exception 
	 */
	public boolean MouseOverActionMainAndSubMenu(String strValue) throws Exception
	{
		Common common = CommonManager.getInstance().getCommon();
		boolean status = false;		
		String[] strOject = strValue.split(":::");
		status = common.MouseHoverAction(Common.o.getObject(strOject[0]), Common.o.getObject(strOject[1]));		
		return status;
	}


	/**
	 * @function it helps to Mouseover the Object	 
	 * @return true/false
	 * @throws Exception 
	 */
	public boolean VerifySubMenu(String strObject) throws Exception
	{
		boolean status = false;	
		boolean blnMenu = false;

		String strElement = strObject.split(":::")[0];
		String[] strMenu = strObject.split(":::")[1].split("::");
		String[] strActMenu = ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject(strElement)).getText().split("\n");

		for(int i=0;i<=strMenu.length-1;i++){
			for(int j=0;j<=strActMenu.length-1;j++){
				if(strMenu[i].equalsIgnoreCase(strActMenu[j])){
					blnMenu = true;
				}
			}
			if(blnMenu){
				logger.info("Search String available in the Menu. '" + strMenu[i] + "'");
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in Menu and Search string is '" + strMenu[i] + "'","System searched string in Menu and search string is  '" + strMenu[i] + "'", "PASS");
				blnMenu = false;
				status = true;
			}
			else{
				logger.info("Search String not available in the Menu. '" + strMenu[i] + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in Menu and Search string is '" + strMenu[i] + "'","System not searched string in Menu and search string is  '" + strMenu[i] + "'", "FAIL");
				status = false;
			}	
		}
		//		System.out.println(driver.findElement(By.cssSelector(".x-panel.x-layer.x-panel-default.x-menu.x-border-box:not([style*='hidden'])")).getText());		
		return status;
	}

	public static Boolean QPBCommon(String strParam) throws Exception 
	{
		Common common = CommonManager.getInstance().getCommon();
		Boolean status = false;
		String sClassName = null;
		List<WebElement> CellElements = null;
		JavascriptExecutor js = (JavascriptExecutor) ManagerDriver.getInstance().getWebDriver();
		String[] sHeader= strParam.split("#####");
		logger.info("Starting the Additional Coverage"  + sHeader[0]);
		for(int i=1; i<=(sHeader.length)-1;i++)
		{
			status = false;
			String[] sFields = sHeader[i].split("~~");
			String sSameLabelIdentity = sFields[1].substring(0, 3);
			switch (sFields[2].toUpperCase())
			{
			case "CHK":
				if(sFields[3].equals("YES"))
				{
					sClassName = "x-form-cb-label x-form-cb-label-after";
					//added log statement
					logger.info("str 1 =" + sFields[1]);
					CellElements = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("label"));
					for (WebElement element : CellElements) 
					{
						String objName = element.getText();
						String sFieldClass = element.getAttribute("class");
						if (objName.contains(sFields[1]))
						{
							//added log statement
							logger.info("str 2 =" + sFields[1]);
							if (sClassName.contains(sFieldClass)) 
							{
								String readAttriID1 = element.getAttribute("id");
								WebElement sElement = common.returnObject(By.id(readAttriID1));
								//										                                   sElement.click();
								status = common.SafeAction(By.id(readAttriID1), "ele", "ele");
								status = true;
								break;
							}
						}
					}
				}else
				{
					status = true;
				}
				break; 
			case "EDT":
				if(sFields[3].equals("YES"))
				{
					sClassName = "x-form-item-label x-unselectable x-form-item-label-left";
					//added log statement
					logger.info("str 1 =" + sFields[1]);
					CellElements = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("label"));
					for(WebElement element: CellElements)
					{
						String objName = element.getText();
						String sFieldClass = element.getAttribute("class");
						if(objName.contains(sFields[1]) )
						{
							if(sClassName.contains(sFieldClass))
							{
								String readAttriID1 = element.getAttribute("id");
								String[] sID = readAttriID1.split("-");
								String sID1 = sID[0].concat("-inputEl");
								WebElement  sElement = common.returnObject(By.id(sID1));
								//																        			sElement.click();
								sElement.clear();
								sElement.sendKeys(sFields[4]);
								sElement.sendKeys(Keys.TAB);
								//																        		  	status = Common.JavaScriptWait(sElement, js);
								status = true;
								break;
							}	
						}  
					}
				}else{
					status = true;
				}
				break;
			case "TXA":
				if(sFields[3].equals("YES"))
				{
					if(!sSameLabelIdentity.equals("OC1") && !sSameLabelIdentity.equals("OC2") && !sSameLabelIdentity.equals("OC3") &&
							!sSameLabelIdentity.equals("ALD") && !sSameLabelIdentity.equals("GMS") && !sSameLabelIdentity.equals("NFP") && !sSameLabelIdentity.equals("APP")
							&& !sSameLabelIdentity.equals("OC3"))
					{
						sClassName = "x-form-item-label x-unselectable x-form-item-label-top";
						//added log statement
						logger.info("str 1 =" + sFields[1]);
						CellElements = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("label"));
						for(WebElement element: CellElements)
						{
							String objName = element.getText();
							String sFieldClass = element.getAttribute("class");
							if(objName.contains(sFields[1]) )
							{
								if(sClassName.contains(sFieldClass))
								{
									String readAttriID1 = element.getAttribute("id");
									String[] sID = readAttriID1.split("-");
									String sID1 = sID[0].concat("-inputEl");
									WebElement  sElement = common.returnObject(By.id(sID1));
									//																			        			sElement.click();
									//																			        			sElement.clear();
									//																			        			sElement.sendKeys(sFields[4]);
									status = common.SafeAction(By.id(sID1), sFields[4], "edt");
									sElement.sendKeys(Keys.TAB);
									//															        		  	status = Common.JavaScriptWait(sElement, js);
									status = true;
									break;
								}	
							}  
						}
					}
					else
					{
						String[] sEdtLabelValue = sFields[1].split("---");
						String cla = null;
						logger.info("str 1 =" + sFields[1]);
						//This is to check whether the concatenate object is an edt label or txtarea label or chk label
						if(sSameLabelIdentity.equals("ALD") || sSameLabelIdentity.equals("GMS"))
						{
							cla = "x-form-item-label x-unselectable x-form-item-label-left";
						}
						else if(sSameLabelIdentity.equals("OC1") || sSameLabelIdentity.equals("OC2") ||sSameLabelIdentity.equals("OC3") )
						{
							cla = "x-form-item-label x-unselectable x-form-item-label-top";
						}
						/*else if(sSameLabelIdentity.equals("CDS"))
						        									{
						        										cla = "x-component x-component-default";
						        									}*/
						else
						{
							cla = "x-form-cb-label x-form-cb-label-after";
						}
						CellElements = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("label"));
						for(WebElement element: CellElements)
						{
							String objName = element.getText();
							String clas = element.getAttribute("class");
							if(objName.contains(sEdtLabelValue[1]) )
							{
								if(cla.contains(clas))
								{
									String readAttriID1 = element.getAttribute("id");
									String[] sID = readAttriID1.split("DV:");
									String[] sID1 = sID[1].split(":");
									int value = 0;
									if(sSameLabelIdentity.equals("APP") || sSameLabelIdentity.equals("NFP") || sSameLabelIdentity.equals("CDS"))
									{
										value = Integer.parseInt(sID1[0])+1;
									}else
									{
										value = Integer.parseInt(sID1[0])+2;
									}
									String SD3 = sID[0].concat("DV:")+value+":QPBModalQuestion_ExtInputSet:Stringrtextarea1-inputEl";
									WebElement  sElement = common.returnObject(By.id(SD3));
									//						        									        			sElement.click();
									//						        									        			sElement.sendKeys(sFields[4]);
									status = common.SafeAction(By.id(SD3), sFields[4], "edt");
									sElement.sendKeys(Keys.TAB);
									//						        									        		  	status = Common.JavaScriptWait(sElement, js);
									status = true;
									break;
								}	
							}
						}
					}
				}
				else
				{
					status = true;
				}
				break;
			case "CHKJ":
				if(sFields[3].equals("YES"))
				{
					if(!sFields[1].equals("ADSOther") && !sFields[1].equals("SUBOther")  &&!sFields[1].equals("OPFOther"))
					{
						sClassName = "x-form-cb-label x-form-cb-label-after";
						//added log statement
						logger.info("str 1 =" + sFields[1]);
						CellElements = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("label"));
						for (WebElement element : CellElements) 
						{
							String objName = element.getText();
							String sFieldClass = element.getAttribute("class");
							if (objName.contains(sFields[1]))
							{
								//added log statement
								logger.info("str 2 =" + sFields[1]);
								if (sClassName.contains(sFieldClass)) 
								{
									String readAttriID1 = element.getAttribute("id");
									//												                                   WebDriver driver = Common.dr();
									//												                                   JavascriptExecutor js1 = (JavascriptExecutor) driver;
									WebElement sElement = common.returnObject(By.id(readAttriID1));
									//												                                   status = Common.SafeAction(By.id(readAttriID1), "scl", "scl");
									status = common.SafeAction(By.id(readAttriID1), "ele", "ele");
									//												                                   sElement.click(); //here we are clicking the checkbox which is making the ajax call
									status = SCRCommon.JavaScriptWait(sElement, js);
									status = true;
									break;
								}
							}
						}
					}else
					{
						String sObject = "eleQPB"+sFields[1]+"";
						status = common.SafeAction(Common.o.getObject(sObject), "", sObject);
						///status = SCRCommon.JavaScriptWait(Common.ele, js); Krishna Commented this line
					}
				}else
				{
					status = true;
				}
				break; 
			case "EDTJ":
				if(sFields[3].equals("YES"))
				{
					if(!sSameLabelIdentity.equals("OC1") && !sSameLabelIdentity.equals("OC2") && !sSameLabelIdentity.equals("OC3"))
					{
						sClassName = "x-form-item-label x-unselectable x-form-item-label-left";
						//added log statement
						logger.info("str 1 =" + sFields[1]);
						CellElements = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("label"));
						for(WebElement element: CellElements)
						{
							String objName = element.getText();
							String sFieldClass = element.getAttribute("class");
							if(objName.contains(sFields[1]) )
							{
								if(sClassName.contains(sFieldClass))
								{
									String readAttriID1 = element.getAttribute("id");
									String[] sID = readAttriID1.split("-");
									String sID1 = sID[0].concat("-inputEl");
									WebElement  sElement = common.returnObject(By.id(sID1));
									//																			        			sElement.click();
									//																			        			sElement.clear();
									//																			        			sElement.sendKeys(sFields[4]);
									status = common.SafeAction(By.id(sID1), sFields[4], "edt");
									sElement.sendKeys(Keys.TAB);
									status = SCRCommon.JavaScriptWait(sElement, js);
									status = true;
									break;
								}	
							}  
						}
					}
					else
					{
						logger.info("str 1 =" + sFields[1]);
						String[] sEdtLabelValue = sFields[1].split("---");
						String cla = "x-form-item-label x-unselectable x-form-item-label-top";
						CellElements = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("label"));
						for(WebElement element: CellElements)
						{
							String objName = element.getText();
							String clas = element.getAttribute("class");
							if(objName.contains(sEdtLabelValue[1]) )
							{
								if(cla.contains(clas))
								{
									String readAttriID1 = element.getAttribute("id");
									String[] sID = readAttriID1.split("DV:");
									String[] sID1 = sID[1].split(":");
									int value2 = Integer.parseInt(sID1[0])+1;
									String SD3 = sID[0].concat("DV:")+value2+":QPBModalQuestion_ExtInputSet:IntegerFieldInput-inputEl";					        		
									WebElement  sElement = common.returnObject(By.id(SD3));
									//						        									        			sElement.click();
									//						        									        			sElement.sendKeys(sFields[4]);
									status = common.SafeAction(By.id(SD3), sFields[4], "edt");
									sElement.sendKeys(Keys.TAB);
									status = SCRCommon.JavaScriptWait(sElement, js);
									status = true;
									break;
								}	
							}
						}
					}
				}
				break;
			case"LSTJ":
				if(sFields[3].equals("YES"))
				{
					CellElements = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("a"));
					for(WebElement element: CellElements)
					{
						String objName = element.getText();
						{
							if(objName.contains(sFields[1]))
							{
								String readAttriID1 = element.getAttribute("id");
								String[] sID = readAttriID1.split("_ExtInputSet");
								String sID1 = sID[0].concat("_ExtInputSet:choicea:choicea_Arg-inputEl");
								WebElement  sElement = common.returnObject(By.id(sID1));
								//												 				        			sElement.click();
								//												 				        			sElement.clear();
								//												 				        			sElement.sendKeys(sFields[4]);
								//												 				        			sElement.sendKeys(Keys.TAB);
								status = common.SafeAction(By.id(sID1), sFields[4], "lst");
								status = SCRCommon.JavaScriptWait(sElement, js);
								break;
							}	
						}
					}
				}
				break;
			case"LSSJ":
				if(sFields[3].equals("YES"))
				{
					CellElements = ManagerDriver.getInstance().getWebDriver().findElements(By.tagName("span"));
					for(WebElement element: CellElements)
					{
						String objName = element.getText();
						{
							if(objName.contains(sFields[1]))
							{
								String readAttriID1 = element.getAttribute("id");
								String[] sID = readAttriID1.split("_ExtInputSet");
								String sID1 = sID[0].concat("_ExtInputSet:choicea:choicea_Arg-inputEl");
								WebElement  sElement = common.returnObject(By.id(sID1));
								//												 				        			sElement.click();
								//												 				        			sElement.clear();
								//												 				        			sElement.sendKeys(sFields[4]);
								//												 				        			sElement.sendKeys(Keys.TAB);
								status = common.SafeAction(By.id(sID1), sFields[4], "lst");
								status = SCRCommon.JavaScriptWait(sElement, js);
								break;
							}	
						}
					}
				}
				break;
			}
			if(status)
			{
				if(sFields[3].contains("YES"))
				{
					if(sFields[2].contains("CHK") || sFields[2].contains("CHKJ"))
					{
						logger.info("System clicked "+sFields[1]+" Check Box");  
						HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should click '"+sFields[1]+"' Check box", "System clicked '"+sFields[1]+"' check box","PASS");				
					}
					else if(sFields[2].contains("EDT") || sFields[2].contains("EDTJ"))
					{
						logger.info("System entered '"+sFields[4]+"' value for "+sFields[1]+" Edit box");  
						HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should enter value '"+sFields[4]+"' for '"+sFields[1]+"' Edit Box", "System entered value for '"+sFields[4]+"' '"+sFields[1]+"' Edit Box","PASS");
					}
					else if(sFields[2].contains("TXT"))
					{
						logger.info("System entered '"+sFields[4]+"' value for "+sFields[1]+" TexArea Box"); 
						HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should enter value '"+sFields[4]+"' for '"+sFields[1]+"' TextArea Box", "System entered value for '"+sFields[4]+"' '"+sFields[1]+"' TextArea Box","PASS");	        	 				
					}
					else
					{
						logger.info("System entered '"+sFields[4]+"' value for "+sFields[1]+" List Box");   
						HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should enter value '"+sFields[4]+"' for '"+sFields[1]+"' List Box", "System entered value for '"+sFields[4]+"' '"+sFields[1]+"' List Box","PASS");	        	 				
					}

				}else
				{
					status = true;	
				}
			}else
			{
				if(sFields[3].contains("YES"))
				{
					if(sFields[2].contains("CHK") || sFields[2].contains("CHKJ"))
					{
						logger.info(""+sFields[1]+" check box is not clicked "); 
						HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should click '"+sFields[1]+"' check box","System not clicked '"+sFields[1]+"' check box","FAIL");
						status = false; 
					}
					else if(sFields[2].contains("EDT") || sFields[2].contains("EDTJ"))
					{
						logger.info("System not entered '"+sFields[4]+"' value for "+sFields[1]+" Edit box"); 
						HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should enter value '"+sFields[4]+"' for '"+sFields[1]+"' Edit Box", "System not entered value for '"+sFields[4]+"' '"+sFields[1]+"' Edit Box", "FAIL");
						status = false;
					}
					else if(sFields[2].contains("TXA"))
					{
						logger.info("System not entered '"+sFields[4]+"' value for "+sFields[1]+" TexArea Box"); 
						HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should enter value '"+sFields[4]+"' for '"+sFields[1]+"' TextArea Box", "System not entered value for '"+sFields[4]+"' '"+sFields[1]+"' TextArea Box","FAIL");
						status = false;
					}
					else{
						logger.info("System not entered '"+sFields[4]+"' value for "+sFields[1]+" List Box");  
						HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should enter value '"+sFields[4]+"' for '"+sFields[1]+"' List Box", "System not entered value for '"+sFields[4]+"' '"+sFields[1]+"' List Box", "FAIL");
						status = false;
					}
				}else
				{
					status = false;
				}
			}	        	 			
		}

		return status;
	}

	public  static boolean JavaScriptWait1(WebElement element, JavascriptExecutor js) throws Exception
	{
		boolean status = false;
		for (int i = 1; i <= Integer.parseInt(HTML.properties.getProperty("VERYLONGWAIT")); i++) 
		{
			logger.info("Document Ajax State = "
					+ js.executeScript(
							"return Ext.Ajax.isLoading();")
					.toString());
			Boolean isAjaxRunning = Boolean.valueOf(js
					.executeScript(
							"return Ext.Ajax.isLoading();") //returns true if ajax call is currently in progress
					.toString());
			if (!isAjaxRunning.booleanValue()) 
			{
				status = true;
				break;
			}
			Thread.sleep(1000);//wait for one secnod then check if ajax is completed
		}
		//only remove this print statements after this has been tested
		logger.info("Entering Wait....");
		logger.info("Document window.getComputedStyle(document.body).cursor = "
				+ js.executeScript(
						"return window.getComputedStyle(document.body).cursor;")
				.toString());
		//After ajax call is over, page is not displaying fields(elements) in UI so we are calling below code to display fields in UI
		//status = Common.SafeAction(Common.o.getObject("eleAccountNumber"), "","eleQPBAccountNo");
		//only remove this print statements after this has been tested
		logger.info("End Wait....1");
		//we are waiting to load the elements into page
		WebDriverWait wait = new WebDriverWait(ManagerDriver.getInstance().getWebDriver(),
				Integer.parseInt(HTML.properties
						.getProperty("VERYLONGWAIT")));
		wait.until(ExpectedConditions.stalenessOf(element));// (By.id(readAttriID1)));
		logger.info("End Wait....2");	
		status = true;
		return status; 
	}

	public static boolean JavaScriptWait(WebElement element, JavascriptExecutor js) throws Exception
	{
		boolean status = false;
		Common common = CommonManager.getInstance().getCommon();
		//		Actions clickTriangle= new Actions(driver);
		for (int i = 1; i <= Integer.parseInt(HTML.properties.getProperty("VERYLONGWAIT")); i++) 
		{
			logger.info("Document Ajax State = "+ js.executeScript("return Ext.Ajax.isLoading();").toString());
			Boolean isAjaxRunning = Boolean.valueOf(js.executeScript("return Ext.Ajax.isLoading();").toString()); //returns true if ajax call is currently in progress
			//	             Boolean isAjaxRun = Boolean .valueOf(js.executeScript("return((window.jQuery != null) && (jQuery.active === 0))").toString());
			if (!isAjaxRunning.booleanValue()) 
			{
				status = true;
				break;
			}
			Thread.sleep(1000);//wait for one secnod then check if ajax is completed
		}
		//only remove this print statements after this has been tested
		logger.info("Entering Wait....");
		logger.info("Document window.getComputedStyle(document.body).cursor = "+ js.executeScript("return window.getComputedStyle(document.body).cursor;").toString());
		//After ajax call is over, page is not displaying fields(elements) in UI so we are calling below code to display fields in UI
		status = common.SafeAction(Common.o.getObject("eleQPBAccountNo"), "eleQPBAccountNo","eleQPBAccountNo");
		//only remove this print statements after this has been tested
		logger.info("End Wait....1");
		//	      //we are waiting to load the elements into page
		WebDriverWait wait = new WebDriverWait(ManagerDriver.getInstance().getWebDriver(),Integer.parseInt(HTML.properties.getProperty("VERYLONGWAIT")));
		wait.until(ExpectedConditions.stalenessOf(element));// (By.id(readAttriID1)));
		//	      js.executeScript("arguments[0].scrollIntoView();",element);
		//	      clickTriangle.moveToElement(element);
		logger.info("End Wait....2");		
		return status; 
	}

	public static boolean JavaScriptDynamicWait(WebElement sElement, JavascriptExecutor js) throws Exception
	{
		boolean status = false;
		for (int i = 1; i <= Integer.parseInt(HTML.properties.getProperty("VERYLONGWAIT")); i++) {
			logger.info("Document Ajax State = "
					+ js.executeScript(
							"return Ext.Ajax.isLoading();")
					.toString());
			Boolean isAjaxRunning = Boolean.valueOf(js
					.executeScript(
							"return Ext.Ajax.isLoading();") //returns true if ajax call is currently in progress
					.toString());
			if (!isAjaxRunning.booleanValue()) {
				status = true;
				break;
			}
			Thread.sleep(1000);//wait for one secnod then check if ajax is completed
		}
		WebDriverWait wait = new WebDriverWait(ManagerDriver.getInstance().getWebDriver(),
				Integer.parseInt(HTML.properties
						.getProperty("VERYLONGWAIT")));
		wait.until(ExpectedConditions.stalenessOf(sElement));// (By.id(readAttriID1)));
		//	     logger.info("End Wait....2");
		return status;
	}

	public static boolean waitForJQueryProcessing(int timeOutInSeconds) {
		boolean jQcondition = false;
		try {
			new WebDriverWait(ManagerDriver.getInstance().getWebDriver(), timeOutInSeconds) {
			}.until(new ExpectedCondition<Boolean>() {

				@Override
				public Boolean apply(WebDriver driverObject) {
					return (Boolean) ((JavascriptExecutor) driverObject)
							.executeScript("return !!window.jQuery && window.jQuery.active == 0");
				}
			});
			jQcondition = (Boolean) ((JavascriptExecutor) ManagerDriver.getInstance().getWebDriver())
					.executeScript("return window.jQuery != undefined && jQuery.active === 0");
			return jQcondition;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Thread ID = " + Thread.currentThread().getId() + " Error Occured =" +e.getMessage(), e);
		}
		return jQcondition;
	}

	/**
	 * @function VerifyCalendarControlExistence 
	 * @param ObjDatepicker
	 * @return
	 * @throws Exception
	 */
	public static Boolean VerifyCalendarControlExistence(String ObjDatepicker) throws Exception
	{
		Common common = CommonManager.getInstance().getCommon();
		boolean status =false;
		String sObject = "ele"+ObjDatepicker+"";
		status=common.SafeAction(Common.o.getObject(sObject),"ele","ele"); //eleMailDateDtepicker
		List<WebElement> sTable = ManagerDriver.getInstance().getWebDriver().findElements(Common.o.getObject("eleDatepickrControl"));
		for(WebElement ele : sTable)
		{
			logger.info(sTable.size());
			String roleValue=ele.getAttribute("role");
			//			String readText = ele.getText();
			String sLabelId = ele.getAttribute("id");
			if (sLabelId.contains("datepicker") && roleValue.contains("grid") ) 
			{
				logger.info(sLabelId);
				int i=common.ElementSize(By.id(sLabelId));
				status=common.ElementDisplayed(By.id(sLabelId));
				if(status && i==1)
				{
					logger.info("Calendar control is displayed in UI - " + sLabelId);
					HTML.fnInsertResult(HTML.properties.getProperty("testcasename"), HTML.properties.getProperty("methodName"), "Calendar Control should be displayed in UI","Calendar control dispalyed", "PASS");
					status=common.SafeAction(Common.o.getObject("eleTodayDtepickerBtn"),"ele","ele");
					//String ActValue=Common.ReadElementGetAttribute(Common.o.getObject("edtMailDate"),"value");
					String ActValue=common.ReadElementFromListEditBox(Common.o.getObject("edtMailDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
					status = common.CompareStringResult("Mail Date  - Canadian Policy", SCRCommon.ReturnCurrentDate(), ActValue);
				}
				else
				{
					logger.info("NO Calendar control is displayed in UI");
					HTML.fnInsertResult(HTML.properties.getProperty("testcasename"), HTML.properties.getProperty("methodName"), "Calendar Control should be displayed in UI","No calendar control dispalyed", "FAIL");
				}
			}
			else
			{
				logger.info("No element matches with Datepicker criteria in UI");
				HTML.fnInsertResult(HTML.properties.getProperty("testcasename"), HTML.properties.getProperty("methodName"), "Calendar Control should be displayed in UI","No elements foudn with Datepicker properties", "FAIL");
			}
		}
		return status;		
	}

	/**
	 * /**
	 * @function use to click the radio button according the text given in the application
	 * @param obj
	 * @param readCol
	 * @param actionCol
	 * @param strReadString
	 * @param actionObjetName(true/false)
	 * @param sTagName
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean radioButtonClickAction(By obj, int readCol, int actionCol, String strReadString, String actionObjetName, String sTagName) throws Exception
	{	
		boolean Status=false;
		boolean SearchString=false;
		boolean ActionObject=false;
		JavascriptExecutor js = (JavascriptExecutor) ManagerDriver.getInstance().getWebDriver();
		WebElement mytable = ManagerDriver.getInstance().getWebDriver().findElement(obj);
		List<WebElement> allrows = mytable.findElements(By.tagName("tr"));
		for(int i = 0; i <= allrows.size()-1; i++)
		{
			List<WebElement> Cells = allrows.get(i).findElements(By.tagName("td"));
			String readText = Cells.get(readCol).getText();
			if (readText.contains(strReadString))
			{
				SearchString = true;
				List<WebElement> CellElements = Cells.get(actionCol).findElements(By.tagName(sTagName));
				for(WebElement element: CellElements)
				{
					String objName = element.getAttribute("inputvalue");
					if(objName.contains(actionObjetName))
					{
						Status = true;
						ActionObject = true;
						element.click();
						JavaScriptDynamicWait(element, js);
						break;
					}
				}
			}
			if(ActionObject == true)
			{
				break;
			}
		}
		if(SearchString)
		{
			logger.info("Search String available in the table. '" + strReadString + "'");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System searched string in table and srarch string is  '" + actionObjetName + "'", "PASS");
			if(ActionObject)
			{
				logger.info("Search and click on object in the table cell and object name is '" + actionObjetName + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search object in the table cell and click on object. Object name is '" + actionObjetName + "'","System searched object in the table and clicked on object. object name is '" + actionObjetName + "'", "PASS");
				Status = true;					  
			}
			else
			{
				logger.info("Search and click on object in the table cell and object name is '" + actionObjetName + "'");  
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search object in the table cell and click on object. Object name is '" + actionObjetName + "'","System searched object in the table and clicked on object. object name is '" + actionObjetName + "'", "FAIL");
				Status = false;
			}
		}
		else
		{
			logger.info("Search String not available in the table. '" + strReadString + "'");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System searched string in table and srarch string is  '" + actionObjetName + "'", "FAIL");
			Status = false;
		}
		return Status;
	}

	/**
	 * This function to verify billing method in policy/ acc summary page under pending transaction table
	 * In data table first parameter is table element, 2nd is billing method to verify, third one is whether its anchor tag or div/span 
	 * @param funValue
	 * @return
	 */
	public Boolean VerifyPendingTransTable(String funValue)
	{

		Common common = CommonManager.getInstance().getCommon();
		Boolean status = false;
		String value = null;
		String[] sValue = funValue.split(":::"); //element:::StrSearch:::readString
		logger.info(sValue[0]);

		try
		{

			value = common.GetTextFromTable(Common.o.getObject(sValue[0]), 5,5,sValue[1]);
			status = common.CompareStringResult("verify display of biling Number", sValue[1], value);
			if (sValue[2].toUpperCase().equalsIgnoreCase("SPAN") || sValue[2].toUpperCase().equalsIgnoreCase("DIV"))
			{
				status = common.ActionOnTable(Common.o.getObject(sValue[0]), 5, 5, sValue[1], sValue[2].toLowerCase());
				if (status)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Billing method '"+sValue[1]+"' should display without hyperlink","'"+sValue[1]+"' displayed without hyperlink", "PASS");
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Billing method '"+sValue[1]+"' should display without hyperlink","'"+sValue[1]+"' NOT displayed without hyperlink", "FAIL");
				}
			}
			else if (sValue[2].toUpperCase().equalsIgnoreCase("LINK"))
			{
				status = common.ActionOnTable(Common.o.getObject(sValue[0]), 5,5, sValue[1], "a");
				if (status)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Billing method '"+sValue[1]+"' should display with hyperlink","'"+sValue[1]+"' displayed with hyperlink", "PASS");
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Billing method '"+sValue[1]+"' should display with hyperlink","'"+sValue[1]+"' NOT displayed with hyperlink", "FAIL");
				}
			}
			else
			{
				status = false;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return status;

	}
	public static boolean AddressStandardize() throws Exception {

		boolean status =false;
		Common common = CommonManager.getInstance().getCommon();


		status = common.SafeAction(Common.o.getObject("btnCommonStandardize"),"btnCommonStandardize","btn");


		//WebElement selectStandAdd = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("btnCommonSelectStandardizeAddress"));


		//	WebElement selectCityCounty = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("btnSelectCityCounty"));
		//WebElement Override = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("btnOverrideAddress"));


		try {
			status = true;
			
			if (ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("btnSelectStandardizeAddr")).isDisplayed()== true)
			{
				status = common.SafeAction(Common.o.getObject("btnSelectStandardizeAddr"),"btnSelectStandardizeAddr","btn");
			}
				if(ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("btnSelectCityCounty")).isDisplayed())
				{
	
					status =common.SafeAction(Common.o.getObject("btnSelectCityCounty"),"btnSelectCityCounty","btn");
				}
		else if(ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("btnOverrideAddress")).isDisplayed()) {
				//WebElement selectOverride = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("btnOverrideAddress"));
				status=common.SafeAction(common.o.getObject("btnOverrideAddress"),"btnOverrideAddress","btn");
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			//WebElement selectOverride = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("btnOverrideAddress"));
			//status=common.SafeAction(common.o.getObject("btnOverrideAddress"),"btnOverrideAddress","btn");
//		}
		 
		}
		return status;
	}

			/*try {
							if(ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("btnSelectCityCounty")).isDisplayed() == true){
								// TODO Auto-generated method stub

								status =common.SafeAction(Common.o.getObject("btnSelectCityCounty"),"btnSelectCityCounty","btn");
								}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();*/
		

		



		/*if(ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("btnSelectCityCounty"))==null)
					{

						status =common.SafeAction(Common.o.getObject("btnSelectCityCounty"),"btnSelectCityCounty","btn");
					}*/

	


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

	
/*public boolean visible() throws Exception {
		boolean result=false;
			try {
				ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("btnSelectCityCounty"));
			} catch (Exception e) {
				return true;
			}
			return result;

		}*/
	
	public boolean MaskedField() throws Exception{
		boolean status=false;
		Common common = CommonManager.getInstance().getCommon();
		WebElement element = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("edtCommonSSN"));
		status=common.SafeAction(common.o.getObject("edtCommonSSN"), "edtCommonSSN", "ele");
		String elementValue= element.getAttribute("value");
		if(elementValue.contains("***-**")){
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "The SSN  field value should have to masked as'"+elementValue+"'", "The SSN field value is masked as '"+elementValue+"", "PASS");
		}else{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "The SSN  field value should have to masked as'"+elementValue+"'", "The SSN field value is masked as '"+elementValue+"", "PASS");

		}
		
		
		
		return status;
		
	}
	/**
	 * @function This function use to enter the data from the table and click the element accordingly
	 * @param obj,readCol,actionCol,strReadString,actionObjetName
	 * @return status
	 * @throws Exception
	 */
	public Boolean EditOnCellByDependsOnRowColumnIndex(String inputdata) throws Exception
	{      
		boolean Status=false;
		String[] entervalue =inputdata.split(":::") ;
		
		 WebElement mytable = ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject(entervalue[0]));
		 List<WebElement> allrows = mytable.findElements(By.tagName("tr"));
		 List<WebElement> Cells = allrows.get(Integer.parseInt(entervalue[1])).findElements(By.tagName("td"));
		 Cells.get(Integer.parseInt(entervalue[2])).click();
		 
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_SHIFT);	
			robot.keyPress(KeyEvent.VK_T);
			ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(".//input[contains(@name,'"+ entervalue[3] + "')]")).sendKeys(entervalue[4]);
			robot.keyRelease(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_ALT);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		
		
		 Status = true;
		return Status;
	}
	
	
	public boolean EditOnCellByDependsOnRowColumnIndex1(String inputdata) throws Exception
	{      
		
		boolean Status=false;
		String[] entervalue =inputdata.split(":::") ;
		WebDriver driver = ManagerDriver.getInstance().getWebDriver();
		Common common = CommonManager.getInstance().getCommon();
		 WebElement mytable = ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject(entervalue[0]));
		 List<WebElement> allrows = mytable.findElements(By.tagName("tr"));
		 int rowSize=allrows.size();
		 List<WebElement> Cells = allrows.get(Integer.parseInt(entervalue[1])).findElements(By.tagName("td"));
		// System.out.println("print"+Cells.get(Integer.parseInt(entervalue[2])).getText()+"end");
		// Cells.get(Integer.parseInt(entervalue[2])).findElement(By.tagName("div")).click();
		 Cells.get(Integer.parseInt(entervalue[2])).sendKeys(Keys.PAGE_DOWN);
		 Cells.get(Integer.parseInt(entervalue[2])).click();
		 
//	 Actions builder=new Actions(driver);
//	 Action serioesofActions=builder
//			 .moveToElement(Cells.get(Integer.parseInt(entervalue[2])))
//			 .click()
//		     .sendKeys(entervalue[3])
//	         .doubleClick()
//	         .contextClick()
//	         .build();
	 // Cells.get(Integer.parseInt(entervalue[2])).sendKeys(entervalue[3]);

			/*Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_SHIFT);	
			robot.keyPress(KeyEvent.VK_T);*/ 
		ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(".//input[contains(@name,'"+entervalue[3]+"')]")).sendKeys(entervalue[4]);
		Cells.get(Integer.parseInt(entervalue[2])).sendKeys(Keys.TAB);
		//System.out.println("print"+Cells.get(Integer.parseInt(entervalue[2])).getText());
			/*robot.keyRelease(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_ALT);
			robot.keyRelease(KeyEvent.VK_SHIFT);*/
		
		
		 Status = true;
		return Status;
	}
	
	
	
	public boolean VerifyWhetherFieldIsDefaulted(String obj) throws Exception{
		boolean status=false;
		String[] sObj=obj.split(":::");
		Common common = CommonManager.getInstance().getCommon();
		WebElement element = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject(sObj[0]));
		//status=common.SafeAction(common.o.getObject(sObj[0]), sObj[0], "ele");
		String elementValue= element.getAttribute("value");
		
		if(elementValue.contains(sObj[1])){
			
			
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "The Element should be defaulted to'"+elementValue+"'", "The Element is defaulted to '"+elementValue+"", "PASS");
			status=true;
		}else{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "The Element should be defaulted to'"+elementValue+"'", "The Element is not defaulted to '"+elementValue+"", "FAIL");
			status=false;
		}
		
		return status;
		
	}
	
	public boolean VerifyRadioButtonFieldIsDefaulted(String obj) throws Exception{
		boolean status=false;
		
		Common common = CommonManager.getInstance().getCommon();
		WebElement element = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject(obj));
		
		//status=common.SafeAction(common.o.getObject(obj), obj, "ele");
		if(element.isSelected()){
			status=true;
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "The Element should default to YES'", "The Element is defaulted to YES", "PASS");
		}else{
			status=false;
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "The Element should default to YES", "The Element is not defaulted to YES", "FAIL");

		}
		
		return status;
		
	}
	
	public boolean ReadElementText() throws NumberFormatException, Exception{
		boolean status=false;
		Common common = CommonManager.getInstance().getCommon();
		String ActValue=common.ReadElementFromListEditBox(Common.o.getObject("eleAssignedDriverList"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
		 System.out.println(ActValue);
		return status;
		
	}
	
	
	public boolean SelectCheckboxintable(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		int Rowindex = Integer.parseInt(sValue[1]);
		int Colindex = Integer.parseInt(sValue[2]);
		String SendSpace = (sValue[3]);
		Common common = CommonManager.getInstance().getCommon();
		
         status = common.SelectCheckBoxOnTableBasedonRowColIndex(Common.o.getObject(sValue[0]),SendSpace, Rowindex, Colindex);
		
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
	
	
	public boolean VerifyElementNotDisplayed(String strElement) throws Exception{
		boolean status=false;
		String[] sfunVal = strElement.split(":::");
		Common common = CommonManager.getInstance().getCommon();
		try {
			if(!ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject(sfunVal[0])).isDisplayed()){
				status =false;
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Invoice table should not be displayed ", "Invoices table is not displayed", "PASS");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			status=true;
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Invoice table should not be displayed ", "Invoices table is displayed", "FAIL");

		}
		
		
		return status;
		
	}
	
	public boolean VerifyElementNotdisplayed1(String strElement) throws Exception{
		boolean status=false;
		String[] sfunVal = strElement.split(":::");
		Common common = CommonManager.getInstance().getCommon();
		try {
			if(ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject(sfunVal[0])).isDisplayed()){
				status=false;
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Element should not be displayed ", "Element is not displayed", "PASS");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			status=true;
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Element should not be displayed ", "Element is displayed", "FAIL");

		}
		
		
		return status;
		
	}
	
	public boolean ComomnBatchProcess(String value) throws Exception 
	{
		boolean status = false;
		Common common = CommonManager.getInstance().getCommon();
		try{
			
			ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("edtCommandfield")).sendKeys(value);
			Thread.sleep(2000);
			ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("edtCommandfield")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			status = true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();   
			logger.error("Thread ID = " + Thread.currentThread().getId() + " Error Occured =" +e.getMessage(), e);
		}
		
		
		return status;
		
	}
	
	/**
	 * @function This function use to enter the data from the table and click the element accordingly
	 * @param obj,readCol,actionCol,strReadString,actionObjetName
	 * @return status
	 * @throws Exception
	 */
	public Boolean EditOnCellByDependsOnTable(String inputdata) throws Exception
	{      
		boolean Status=false;
		String[] entervalue =inputdata.split(":::") ;
		
		 WebElement mytable = ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject(entervalue[0]));
		 List<WebElement> allrows = mytable.findElements(By.tagName("tr"));
		 List<WebElement> Cells = allrows.get(Integer.parseInt(entervalue[1])).findElements(By.tagName("td"));
		 System.out.println(Cells.size());
		 Integer col = Integer.parseInt(entervalue[2]);
		 Cells.get(col).click();
		 
		 ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(".//input[contains(@name,'"+ entervalue[3] + "')]")).clear();
		 
		ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(".//input[contains(@name,'"+ entervalue[3] + "')]")).sendKeys(entervalue[4]);
		ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(".//input[contains(@name,'"+ entervalue[3] + "')]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

			
		
		 Status = true;
		return Status;
	}
	
	public boolean ClickOnInvoiceStreamDropDown() throws Exception
	{
		boolean Status = false;
		String XpathID=".//*[@id='AssignInvoiceItemsToNewPayerPopup:AssignInvoiceItemsToNewPayerScreen:InvoiceStream-inputEl']";
		
		ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(XpathID)).click();
		ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(XpathID)).sendKeys(Keys.ARROW_DOWN);
		ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(XpathID)).sendKeys(Keys.ENTER);
		Status = true;
		if (Status == true)
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System displayed Account Summary Page" , "PASS");	
		}
		else
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System not displayed Account Summary Page", "FAIL");
		}
		
		return Status;
	
}

	public boolean ApproveUWIssueTable(String sTagName) throws Exception{
		boolean status = false;
		boolean checkpoint = false;

		try {
			status = true;
			//List<WebElement> TableElements = ManagerDriver.getInstance().getWebDriver().findElements(By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:0-body"));
			if(ManagerDriver.getInstance().getWebDriver().findElement(By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:0-body")).isDisplayed()){

				WebElement mytable = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("eleIssuesTable"));
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Searched UWIssue Table should be available","Searched UW Issue Table is available'", "PASS");

				List<WebElement> allrows = mytable.findElements(By.tagName("table"));
				System.out.println(allrows.size());
				for(int i = 1; i <= allrows.size(); i++)
				{
					List<WebElement> allrows1 = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("eleIssuesTable")).findElements(By.tagName("table"));
					//			String approve = allrows.get(i).getText();
					//			if (approve.contains("Special Approve"))
					//			{
					//				WebElement chkboxes = allrows.get(i).findElement(By.tagName(sTagName));
					//				chkboxes.click();
					//				chkboxes.sendKeys(Keys.SPACE);
					System.out.println(allrows1.get(1).getText());
					if (allrows1.get(1).getText().contains("Approve"))
					{
						List<WebElement> RowElements = allrows1.get(1).findElements(By.tagName("a"));
						for(WebElement element: RowElements){
						{
							String objName = element.getText();
							if(objName.equals("Special Approve"))
							{
								WebElement chkboxes = allrows1.get(1).findElement(By.tagName(sTagName));
								chkboxes.click();
								chkboxes.sendKeys(Keys.SPACE);
								element.click();
								checkpoint = common.SafeAction(common.o.getObject("eleCommonOK"), "YES", "ele");
								HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System Should be able to click on '"+objName+"'","System to clicked on '"+objName+"'", "PASS");

							}
							else if(objName.equals("Approve"))
							{
								WebElement chkboxes = allrows1.get(1).findElement(By.tagName(sTagName));
								chkboxes.click();
								chkboxes.sendKeys(Keys.SPACE);
								element.click();
								checkpoint = true;
								HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System Should be able to click on '"+objName+"'","System to clicked on '"+objName+"'","PASS");

							}
							if (checkpoint == true)
							{
								status = common.SafeAction(common.o.getObject("eleCommonOK"), "YES", "ele");
								checkpoint = false;
								break;
							}
						}	


					}

					//		WebElement chkboxes = allrows.get(i).findElement(By.tagName(sTagName));
					//		
					//					
					//				try {
					//					if (chkboxes.isDisplayed())
					//					 {
					//						chkboxes.click();
					//
					//						chkboxes.sendKeys(Keys.SPACE);
					//
					//						
					//					 }
					//				} catch (Exception e) {
					//					// TODO Auto-generated catch block
					//					e.printStackTrace();
					//				}


				}


			}
			}
		} catch (NoSuchElementException e) {


			status = false;
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Searched UWIssue Table should be  available","Searched UW Issue Table is not available'", "FAIL");

		}
		return status;
	}

	public boolean captureScreenshot(String imagePath) throws IOException{
		boolean status=false;
		Calendar Date = Calendar.getInstance();

		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	 WebDriver driver = ManagerDriver.getInstance().getWebDriver();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(imagePath+timeStamp+".png"));
		status = true;
		
		return status;
	}
}

