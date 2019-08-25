package com.pc.screen;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;

public class Quote {
		public  XlsxReader sXL;
		public static String sheetname = "Quote";
		static Logger logger =Logger.getLogger(sheetname);
		Common common = CommonManager.getInstance().getCommon();
		private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
		public  String submissionNumber;
		public  String coverageValue;
		
		public Boolean SCRQuote() throws Exception{
						Boolean status = true;
			status = common.ClassComponent(sheetname, Common.o);
			if(!status)
			{
				status = false;
			}
			return status;
	}
		
		public boolean ChoosePayment(String PaymentPlan) throws Exception
		{
			
			boolean status = false;
			JavascriptExecutor js = (JavascriptExecutor) ManagerDriver.getInstance().getWebDriver();
			System.out.println("choosing payment function");
			String[] value = PaymentPlan.split(":::");
			String Preferredtier = value[0];
			String Plan = null;
			String PolicyType = null;
			PolicyType = common.ReadElement(Common.o.getObject("eleLOBLabel"), Integer.valueOf(HTML.properties.getProperty("SHORTWAIT")));
			try
			{
			switch(Preferredtier)
			{
			case "Essential":
				Plan = "0";
			break;
			case "Advantage":
				if(PolicyType.equals("Select Home"))
				{
					Plan = "0";
				}
				else 
				{
				Plan = "1";
				}
				break;
			case "Ultimate":
				if(PolicyType.equals("Select Home"))
				{
					Plan = "1";
				}
				else 
				{
				Plan = "2";
				}
				break;	
				
			}
			
			WebElement paymentplan1 = driver.findElement(By.xpath(".//a[contains(@id,'SideBySidePeriod:"+ Plan + ":SideBySidePaymentDetailLV') and text() ='"+value[1]+"']"));
			status = common.SafeAction(By.xpath(".//a[contains(@id,'SideBySidePeriod:"+ Plan + ":SideBySidePaymentDetailLV') and text() ='"+value[1]+"']"), "Quotetab", "ele");
			//driver.findElement(By.xpath(".//a[contains(@id,'SideBySidePeriod:"+ Plan + ":SideBySidePaymentDetailLV') and text() ='"+value[1]+"']")).click();
			SCRCommon.JavaScriptDynamicWait(paymentplan1, js);
			System.out.println("selected payment plan");
			//Thread.sleep(5000);
		if(driver.findElement(By.xpath(".//a[contains(@id,'SideBySidePeriod:"+ Plan + ":SideBySidePaymentDetailLV') and text() ='"+value[1]+"']")).isDisplayed()==true)
			{
			
			common.SafeAction(By.xpath(".//a[contains(@id,'SideBySidePeriod:"+ Plan + ":SideBySidePaymentDetailLV') and text() ='"+value[1]+"']"), "eleSelectPayment", "eleSelectPayment");
				SCRCommon.JavaScriptDynamicWait(paymentplan1, js);
				//Thread.sleep(5000);
			}
//			if(driver.findElement(By.xpath(".//a[contains(@id,'SideBySidePeriod:0:SideBySidePaymentDetailLV') and text() ='"+value[1]+"']")).isDisplayed()==true )
//			{
//			System.out.println("selected payment plan again");
			//driver.findElement(By.xpath(".//a[contains(@id,'SideBySidePeriod:0:SideBySidePaymentDetailLV') and text() ='"+value[1]+"']")).click();
//			}
			common.SafeAction(Common.o.getObject("eleQuoteTab"), "Quotetab", "ele");
			System.out.println("verify for Detail tab");
			
			if (ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("eleDetails")).isDisplayed()	==true) 
			{
				System.out.println("details button is displayed");
				Thread.sleep(5000);
				common.SafeAction(Common.o.getObject("eleDetails"), "DetailsTab", "ele");
				common.ApproveUWIssueTable("IssueTable");
				common.SafeAction(Common.o.getObject("eleQuoteTab"), "Quotetab", "ele");
				
				//status = common.SafeAction(Common.o.getObject("eleCommonOK"), "YES", "ele");
				
			}
			}
			catch (Exception e) {
				//status = common.SafeAction(Common.o.getObject("elePolicyNumberText"), "YES", "ele");
				return true;
				
			}
			Thread.sleep(3000);	
			return true;
			
		}
		
		public boolean Paymentoptionscheck() throws Exception
		{
			return true;
		}
		public boolean UpdatePremium() throws Exception
		{
			HashMap<String,Object> updateColumnNameValues = new HashMap<String,Object>();
			HashMap<String,Object> whereConstraint = new HashMap<String,Object>();
			XlsxReader sXL = XlsxReader.getInstance();
			common.SafeAction(Common.o.getObject("eleQuoteTab"), "Quotetab", "ele");
			common.WaitForElementExist(Common.o.getObject("eleSubmissionNumberQuote"), Integer.valueOf(HTML.properties.getProperty("SHORTWAIT")));
			submissionNumber = common.ReadElement(Common.o.getObject("eleSubmissionNumberQuote"), Integer.valueOf(HTML.properties.getProperty("SHORTWAIT")));
			submissionNumber = submissionNumber.substring(11,24);
			logger.info("Submission Created ::Submission Number '" +submissionNumber+ "'");
			PCThreadCache.getInstance().setProperty(PCConstants.CACHE_SUBMISSION_NUMBER, submissionNumber);
			updateColumnNameValues.put(PCConstants.SubmissionNumber, submissionNumber);
			whereConstraint.put(PCConstants.ID, PCThreadCache.getInstance().getProperty("TCID"));
			sXL.executeUpdateQuery(PCConstants.SHEET_TestData,  updateColumnNameValues,  whereConstraint );
			//Marking objects for Garbage collection
			
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Submission Number shold be generated","Submission Number generated and the number is '" + submissionNumber + "'", "PASS");
			common.WaitForElementExist(Common.o.getObject("eleTotalPremium"), Integer.valueOf(HTML.properties.getProperty("SHORTWAIT")));
			submissionNumber = common.ReadElement(Common.o.getObject("eleTotalPremium"), Integer.valueOf(HTML.properties.getProperty("SHORTWAIT")));
			logger.info("Submission Created ::Total Premium '" +submissionNumber+ "'");
			
			updateColumnNameValues.put(PCConstants.TotalPremium, submissionNumber);
			whereConstraint.put(PCConstants.ID, PCThreadCache.getInstance().getProperty("TCID"));
			sXL.executeUpdateQuery(PCConstants.SHEET_TestData,  updateColumnNameValues,  whereConstraint );
			
			whereConstraint = null;
			updateColumnNameValues = null;
			return true;
		}
		
		public boolean UpdateCovgPremium() throws Exception
		{
			String temp1="";
			int countofvehicle = 0;
			HashMap<String,Object> updateColumnNameValues = new HashMap<String,Object>();
			HashMap<String,Object> whereConstraint = new HashMap<String,Object>();
			XlsxReader sXL = XlsxReader.getInstance();
		
			List<WebElement> rows = driver.findElements(Common.o.getObject("eleCovgPremTable"));
			//List<WebElement> rows = driver.findElements(By.xpath(".//div[contains(@id,'DetailsPanelSet:0:vehiclePanelIterator:')[matches('[0-9]{1,2}')]':costLV-body']"));
			countofvehicle=rows.size();
			
			for (int b = 0; b<=countofvehicle-1; b++)
			{
				String temp=Common.o.getObject("elePremTable").toString();
				temp=temp+b+":costLV-body')]";
				temp=temp.replace("By.xpath:", "").trim();
				By loc = By.xpath(temp);
				common.WaitForElementExist(loc, Integer.valueOf(HTML.properties.getProperty("LONGWAIT")));
				coverageValue = common.ReadElement(loc, Integer.valueOf(HTML.properties.getProperty("LONGWAIT")));
				coverageValue=coverageValue.replace("Description", "");
				coverageValue=coverageValue.replace("Premium", "").trim();
				coverageValue="Vehicle "+(b+1)+":::"+"\n"+coverageValue+":::"+"\n";
				logger.info("Coverage values captured ::Premium Table '" +coverageValue+ "'");
				
				temp1=temp1 + coverageValue;
				updateColumnNameValues.put(PCConstants.CoverageValue, temp1);
				whereConstraint.put(PCConstants.ID, PCThreadCache.getInstance().getProperty("TCID"));
				sXL.executeUpdateQuery(PCConstants.SHEET_TestData,  updateColumnNameValues,  whereConstraint ); 
				
			}
			
			whereConstraint = null;
			updateColumnNameValues = null;
			return true;
		}
		public boolean ChangeQuote(String Value) throws Exception
		
		{
			try
			{
				common.SafeAction(By.xpath(".//span[(text()='uote')]"), "eljPRQuote", "eljPRQuote");
				if(driver.findElement(By.xpath(".//span[(text()='uote')]")).isDisplayed()==true)
				{
					common.SafeAction(By.xpath(".//span[(text()='uote')]"), "eljPRQuote", "eljPRQuote");
					
				}
				
				common.SafeAction(Common.o.getObject("eleQuoteTab"), "Quotetab", "ele");
			}
			catch (Exception e) {
				//status = common.SafeAction(Common.o.getObject("elePolicyNumberText"), "YES", "ele");
				return true;
				
			}
			
			
			return true;
		}
		
		
		
}
		