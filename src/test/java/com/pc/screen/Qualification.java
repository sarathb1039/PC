/**
 * @ClassPurpose This Class used for the Create Accounts

 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 3/24/2017
 */
package com.pc.screen;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;

public class Qualification {
	
	public static String sheetname = "Qualification";
	static Logger logger =Logger.getLogger(sheetname);
	public  String submissionNumber;
	
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Qualification Excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRQualification() throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
	
	public  boolean Question(String strValue) throws Exception

	{

		boolean status=false;

		Thread.sleep(1000);

		String[] sValue = strValue.split(":::");

		status = common.ActionOnQualificationTable(Common.o.getObject(sValue[0]), 0, 1, sValue[1], sValue[2], sValue[3]);

		//status = common.ActionOnCell(Common.o.getObject(sValue[0]),1, sValue[1], sValue[2], "label");

		//System.out.println("value of the string question" + sValue.length);

		

		if(sValue.length > 4)

		{

			if (sValue[2].contains("none"))

			{

				ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(".//input[contains(@id,'simplecombo')]")).clear();

				ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(".//input[contains(@id,'simplecombo')]")).sendKeys(sValue[4]);

				ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(".//input[contains(@id,'simplecombo')]")).sendKeys(Keys.TAB);
				//status=common.SafeAction(common.o.getObject("eleQualificationScroll"), "eleQualificationScroll", "ele");
				//ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("eleQualificationScroll")).sendKeys(Keys.HOME);
				//Thread.sleep(500);
				//ManagerDriver.getInstance().getWebDriver().findElement(By.tagName("textarea")).sendKeys(Keys.HOME);
				
			}

			else

			{

			ManagerDriver.getInstance().getWebDriver().findElement(By.tagName("textarea")).sendKeys(sValue[4]);
			ManagerDriver.getInstance().getWebDriver().findElement(By.tagName("textarea")).sendKeys(Keys.TAB);			
			}

		}
		
		WebElement scroll = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("eleQualificationScroll"));
		//WebElement scroll = driver.findElement(By.xpath("//div[@id='gvLocationHorizontalRail']"));
		JavascriptExecutor js = (JavascriptExecutor)ManagerDriver.getInstance().getWebDriver(); 
		js.executeScript("arguments[0].scrollIntoView()", scroll);
		
		/*WebElement element = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("eleQualificationScroll"));
		String attributevalue="border:10px solid green;";
		JavascriptExecutor executor= (JavascriptExecutor) ManagerDriver.getInstance().getWebDriver();
		String getattrib=element.getAttribute("style");
		executor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, attributevalue);
		Thread.sleep(100);
		executor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, getattrib);*/
		
		return status;

	}
	public  boolean DefaultQuestion(String strValue) throws Exception
	{
		boolean status=false;
		
		String[] sValue = strValue.split(":::");
		WebElement mytable = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject(sValue[0]));
		List<WebElement> allrows = mytable.findElements(By.tagName(sValue[2]));
		//int sizeoftable = allrows.size();
//		for(int i = 0; i < sizeoftable; i++)
//		{
//			
//			if (allrows.get(i).getText().equals(sValue[1]))
//			{
//				System.out.println(i);
//				allrows.get(i).click();
//			}
//		}
		try{
			for(WebElement element: allrows)			
			{
				System.out.println("starting of loop");
				String objName = null;
				
					 objName = element.getText();	
					 System.out.println(objName);
				//System.out.println(objName);
				if(objName.equals(sValue[1]))
				{
					element.click();
					System.out.println("clicked on No");
					Thread.sleep(5000);
					//ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(".//img[contains(@class,'product')]")).click();
					
				}		
			
			}
		}catch(Exception ex){
			System.out.println("********Unwrapping exception"+ex);
		}
			
		
		return status;
	}
	
	public boolean UpdateSubmissionNumber() throws Exception
	{
		HashMap<String,Object> updateColumnNameValues = new HashMap<String,Object>();
		HashMap<String,Object> whereConstraint = new HashMap<String,Object>();
		XlsxReader sXL = XlsxReader.getInstance();
		common.WaitForElementExist(Common.o.getObject("eleSubmissionNumberQuote"), Integer.valueOf(HTML.properties.getProperty("SHORTWAIT")));
		submissionNumber = common.ReadElement(Common.o.getObject("eleSubmissionNumberQuote"), Integer.valueOf(HTML.properties.getProperty("SHORTWAIT")));
		submissionNumber = submissionNumber.substring(11,22);
		logger.info("Submission Created ::Submission Number '" +submissionNumber+ "'");
		PCThreadCache.getInstance().setProperty(PCConstants.CACHE_SUBMISSION_NUMBER, submissionNumber);
		updateColumnNameValues.put(PCConstants.SubmissionNumber, submissionNumber);
		whereConstraint.put(PCConstants.ID, PCThreadCache.getInstance().getProperty("TCID"));
		sXL.executeUpdateQuery(PCConstants.SHEET_TestData,  updateColumnNameValues,  whereConstraint );
		//Marking objects for Garbage collection
		whereConstraint = null;
		updateColumnNameValues = null;
		return true;
	}		
}