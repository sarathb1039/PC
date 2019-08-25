/**
 * @ClassPurpose This Class used for the Create Accounts
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;

public class Reports {
	
	public static String sheetname = "Reports";
	static Logger logger =Logger.getLogger(sheetname);

	Common common = CommonManager.getInstance().getCommon();
	
	private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
	
	
	public Boolean SCRReports() throws Exception{
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
	public boolean VerifytextinColumn(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		int Colindex = Integer.parseInt(sValue[1]);
		
		
		try
		{
			status = common.VerifyOnlyExpectedDataDisplayedColumn(Common.o.getObject(sValue[0]), Colindex,sValue[2]);
			//Thread.sleep(20);
			if (status == true)
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System displayed Account Summary Page" , "PASS");	
			}
			else
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display Account Summary Page","System not displayed Account Summary Page", "FAIL");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public boolean updaterecords(String value) throws Exception 
	{
		WebDriverWait wait = new WebDriverWait(driver, 15);
		boolean status = false;
		String[] sValue = value.split(":::");
		
		try
		{
			Thread.sleep(2000);
			
			/*if(value.contains("Personal Auto"))
			{
			status=common.SelectCheckBoxOnTableBasedonRowColIndex(By.xpath(".//div[contains(@id,'MVRReportLV-body')]")," ",0,0);
			}*/
			
			if(value.contains("Homeowners"))
			{
				wait.until(ExpectedConditions.visibilityOfElementLocated(common.o.getObject("eljOrderHomeLossHist")));
			}
			else
			{
				wait.until(ExpectedConditions.visibilityOfElementLocated(common.o.getObject("eljOrderAutoLossHist")));
			}
			
			//status = common.SafeAction(Common.o.getObject("eljOrderAutoLossHist"), "eljOrderAutoLossHist", "elj");
			if(value.contains("Homeowners"))
			{
				if(driver.findElement(common.o.getObject("eljOrderHomeLossHist")).isDisplayed()==true && driver.findElement(common.o.getObject("eljOrderHomeLossHist")).isEnabled()==true )
				{
					status = common.SafeAction(Common.o.getObject("eljOrderHomeLossHist"), "eljOrderHomeLossHist", "elj");
				}
				else
				{
					wait.until(ExpectedConditions.visibilityOfElementLocated(common.o.getObject("eljOrderHomeLossHist")));
					status = common.SafeAction(Common.o.getObject("eljOrderHomeLossHist"), "eljOrderHomeLossHist", "elj");
				}
						
			}
			else{
				status = common.SafeAction(Common.o.getObject("eleOrderAutoLossHist"), "eleOrderAutoLossHist", "ele");
				status = common.SafeAction(Common.o.getObject("eljOrderAutoLossHist"), "eljOrderAutoLossHist", "elj");
				//status = common.SafeAction(Common.o.getObject("eleSelectallMVR"), "eleSelectallMVR", "ele");
				int pageindex=0;
				status = common.SafeAction(Common.o.getObject("eleSelectallMVR"), "eleSelectallMVR", "ele");
				while(!driver.findElement(common.o.getObject("eleSelectallMVR")).getAttribute("class").contains("checkcolumn-checked") || pageindex==5)
				{
					driver.findElement(common.o.getObject("eleSelectallMVR")).sendKeys(Keys.PAGE_DOWN);
					status = common.SafeAction(Common.o.getObject("eleSelectallMVR"), "eleSelectallMVR", "ele");
					pageindex++;
				}
				
				status = common.SafeAction(Common.o.getObject("eljOrder/RetrieveMVR"), "eljOrder/RetrieveMVR", "elj");
			}
			
			//Thread.sleep(20);
			if (status == true)
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should load default records","System loaded default records" , "PASS");	
			}
			else
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should load default records","System not loaded default records", "FAIL");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public boolean Overridepremier(String Premier) throws Exception
	{
		WebElement Insurancescoretable = driver.findElement(By.xpath(".//div[contains(@id,'InsuranceScoreDetailsLV-body')]"));
		List<WebElement> Cells = Insurancescoretable.findElements(By.tagName("td"));
		Cells.get(8).click();
		System.out.println("clicked on check box");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//div[contains(@id,'InsuranceScoreDetailsLV-body')]//td[8]")).click();
		driver.findElement(By.xpath(".//div[contains(@id,'InsuranceScoreDetailsLV-body')]//td[8]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//input[contains(@name,'AdjustedPremierIndicator')]")).click();
		driver.findElement(By.xpath(".//input[contains(@name,'AdjustedPremierIndicator')]")).clear();
		driver.findElement(By.xpath(".//input[contains(@name,'AdjustedPremierIndicator')]")).sendKeys(Premier);
		driver.findElement(By.xpath(".//input[contains(@name,'AdjustedPremierIndicator')]")).sendKeys(Keys.TAB);
		System.out.println(Premier);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//div[contains(@id,'InsuranceScoreDetailsLV-body')]//td[8]")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath(".//div[contains(@id,'InsuranceScoreDetailsLV-body')]//td[8]")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath(".//div[contains(@id,'InsuranceScoreDetailsLV-body')]//td[8]")).sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath(".//div[contains(@id,'InsuranceScoreDetailsLV-body')]//td[11]")).click();
		//driver.findElement(By.xpath(".//div[contains(@id,'InsuranceScoreDetailsLV-body')]//td[11]")).sendKeys(Keys.ENTER);
		System.out.println("clicked on check box");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//div[contains(@id,'InsuranceScoreDetailsLV-body')]//td[10]")).click();
		driver.findElement(By.xpath(".//div[contains(@id,'InsuranceScoreDetailsLV-body')]//td[10]")).click();
		driver.findElement(By.xpath(".//div[contains(@id,'InsuranceScoreDetailsLV-body')]//td[10]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//input[contains(@name,'UltimatePremierIndicator')]")).click();
		driver.findElement(By.xpath(".//input[contains(@name,'UltimatePremierIndicator')]")).clear();
		driver.findElement(By.xpath(".//input[contains(@name,'UltimatePremierIndicator')]")).sendKeys(Premier);
		driver.findElement(By.xpath(".//input[contains(@name,'UltimatePremierIndicator')]")).sendKeys(Keys.TAB);
		System.out.println(Premier);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//div[contains(@id,'InsuranceScoreDetailsLV-body')]//td[12]")).click();
		driver.findElement(By.xpath(".//div[contains(@id,'InsuranceScoreDetailsLV-body')]//td[12]")).click();
		driver.findElement(By.xpath(".//div[contains(@id,'InsuranceScoreDetailsLV-body')]//td[12]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//input[contains(@name,'ReasonCode1')]")).click();
		driver.findElement(By.xpath(".//input[contains(@name,'ReasonCode1')]")).clear();
		driver.findElement(By.xpath(".//input[contains(@name,'ReasonCode1')]")).sendKeys("D00");
		driver.findElement(By.xpath(".//input[contains(@name,'ReasonCode1')]")).sendKeys(Keys.TAB);
		System.out.println("D00");
//		Cells.get(7).click();
//		System.out.println("clicked on premier cell");
//		Cells.get(7).click();
//		System.out.println("clicked on premier cell1");
//		Cells.get(8).clear();
//		System.out.println("cleared the cell");
//		Cells.get(7).sendKeys(Premier);
		System.out.println("entered value");
		return true;
	}
}
	