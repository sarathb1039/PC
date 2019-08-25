/**
* @ClassPurpose This Class used for the InvoicesStream_BC
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 06/06/2017
 */
package com.pc.screen;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
import org.openqa.selenium.By;

public class InvoiceStreams_BC {
	
	public static String sheetname = "InvoiceStreams_BC";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRInvoiceStreams_BC() throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
	public boolean VerifyColumndata(String Values) throws Exception
	  {
		  boolean IsdataMatched = false;
		  String[] argList = null;
		  argList = Values.split(":::");
		  int Colnum = Integer.parseInt(argList[1]);
		  int expValue = Integer.parseInt(argList[2]);
		  
		   Thread.sleep(3000);
		   
		   try
		   {
			   IsdataMatched = common.VerifyTextInColumn(Common.o.getObject(argList[0]),Colnum,expValue); 
				if (IsdataMatched == true)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -" +expValue, "PASS");	
				}
				else
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Validate date in first row", "Value in field -"+expValue, "FAIL");
				}
			   
		   }
		   catch (Exception e)
		   {
			e.printStackTrace();
		   }	
		  
		   return IsdataMatched;
	  }
	
	 public boolean NOfVerifyInvoiceStreams(String value) throws Exception
	  {
		  boolean IsNofRowsMatched = false;
		  
		  int Rowcnt = Integer.parseInt(value);
		  
		   WebElement mytable =  ManagerDriver.getInstance().getWebDriver().findElement(By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:InvoiceStreamsLV-body"));
		   List<WebElement> allrows = mytable.findElements(By.tagName("tr")); 
		  
		   if (Rowcnt == allrows.size())
		      {
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify no.of Invoicestreams", "No.of invoicestreams count matched", "PASS");
				IsNofRowsMatched = true;
			 }	
			 else
			 {
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify no.of Invoicestreams", "No.of invoicestreams count not matched", "Fail");
				
			  }
		   
		  
		   return IsNofRowsMatched;
	  }
}