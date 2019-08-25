/**
 * @ClassPurpose This Class used for the Desktop usecase
 * @Scriptor Rathish Kuppusamy
 * @ReviewedBy
 * @ModifiedBy
 * @LastDateModified 04/06/2017
 */
package com.pc.screen;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;

public class FetchInvoiceNumber {
	
	public static String sheetname = "FetchInvoiceNumber";
	Common common = CommonManager.getInstance().getCommon();
	static Logger logger =Logger.getLogger(sheetname);
	private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
	
	public Boolean SCRFetchInvoiceNumber() throws Exception
	{
			Boolean status = true;
			status = common.ClassComponent(sheetname,Common.o);

			if(!status)
			{
				status = false;
			}
			return status;
	}
	public boolean Fetchinvoice() throws Exception
	{
		boolean Status = false;
		XlsxReader sXL = XlsxReader.getInstance();
		String XpathID=".//*[@id='AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:InvoiceStreamsLV-body']";
		//String XpathID=".//input[contains(@id='UnappliedFunds-inputEl')]";
		WebElement mytable = ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(XpathID));
		List<WebElement> allrows = mytable.findElements(By.tagName("div"));
		HashMap<String,Object> updateColumnNameValues = new HashMap<String,Object>();
		HashMap<String,Object> whereConstraint = new HashMap<String,Object>();
		for(int i = 0; i <= allrows.size()-1; i++)
		{
			String Cells = allrows.get(i).getText();
			String invoice = "PCConstants.Invoice" + i + 1;
			updateColumnNameValues.put(invoice, Cells);
			whereConstraint.put(PCConstants.ID, PCThreadCache.getInstance().getProperty("TCID"));
			Status = sXL.executeUpdateQuery(PCConstants.SHEET_TestData, updateColumnNameValues, whereConstraint);
		
		}
		
		
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
	
}
	
	