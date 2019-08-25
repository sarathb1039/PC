/**
 * @ClassPurpose This Class used for the Charges screen 
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 06/06/2017
 */
package com.pc.screen;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;

public class PaymentSchedule {
	public  XlsxReader sXL;
	public static String sheetname = "PaymentSchedule";
	static Logger logger =Logger.getLogger(sheetname);
	public String accountNumber;
	public String accountName;
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRPaymentSchedule() throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}

 public boolean GetNoOfInvocies(String noOfRows)throws Exception{
	 	boolean status = false;
	 	Integer numRows=Integer.parseInt(noOfRows);
	 	WebElement Table = ManagerDriver.getInstance().getWebDriver().findElement(By.id("PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body"));
	 	//("PolicyDetailPayments:PolicyDetailPaymentsScreen:ScheduledPaymentsCardTab:panelId-table"));
	 	//PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body
		List<WebElement> rows=Table.findElements(By.tagName("table"));
		int rowSize=rows.size();
		System.out.println(rowSize);
		if(rowSize==numRows){
			status = true;
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Numbers of rows for the table should be equal to"+noOfRows+"","Number of rows for the table is equal to "+noOfRows+"", "PASS");

			
		}else{
			status=false;
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Numbers of rows for the table should be equal to"+noOfRows+"","Number of rows for the table is NOT equal to "+noOfRows+"", "FAIL");

		}
			
		return status;
		
			
				
			

	 	
		
 }
}

