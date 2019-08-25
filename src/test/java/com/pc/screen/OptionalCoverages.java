
package com.pc.screen;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;

public class OptionalCoverages{
	
		public static String sheetname = "OptionalCoverages";
		static Logger logger =Logger.getLogger(sheetname);
		Common common = CommonManager.getInstance().getCommon();
		private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
		public Boolean SCROptionalCoverages() throws Exception{
						Boolean status = true;
			status = common.ClassComponent(sheetname, Common.o);
			if(!status)
			{
				status = false;
			}
			return status;
	}

		public boolean EnterCoverageValue(String value) throws Exception
		{
			boolean Status=false;
			System.out.println(value);
			String[] sValue = value.split(":::");
			Thread.sleep(3000);
			WebElement myscreen = ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject(sValue[0]));
			List<WebElement> allrows = myscreen.findElements(By.tagName("fieldset"));
			for(int i = 0; i <= allrows.size()-1; i++)
			{
				String[] Actualfeildsetname = allrows.get(i).getText().split("\\n");

				if (Actualfeildsetname[0].contains(sValue[1]))
				{
					List<WebElement> Cells = allrows.get(i).findElements(By.tagName("label"));
					for(WebElement element: Cells)
					{
						String Actuallabel = element.getText(); 

						if (Actuallabel.equals(sValue[2].substring(3)))
						{
							
							Status = true;
							//ActionObject = true;
							if (sValue[2].contains("edt")||sValue[2].contains("lst")||sValue[2].contains("edj")||sValue[2].contains("lsj"))
							{
								String sId = element.getAttribute("id");
								sId = sId.substring(0, sId.length() - 7) + "inputEl";
								By sId1 = By.id(sId);
							Status = common.SafeAction(sId1,sValue[3],sValue[2]);
							}
							else
							{
								if(sValue[3].contains("Yes")){
									String sId = element.getAttribute("id");
									sId = sId.substring(0, sId.length() - 8) + "_true-inputEl";
									By sId1 = By.id(sId);
								Status = common.SafeAction(sId1,sValue[3],sValue[2]);
								}
								else{
									String sId = element.getAttribute("id");
									sId = sId.substring(0, sId.length() - 8) + "_false-inputEl";
									By sId1 = By.id(sId);
								Status = common.SafeAction(sId1,sValue[3],sValue[2]);
								}
								
							}
							System.out.println(Status);
							break;

						}
					}
				}
				if(!Status==false)
				{
					break;

				}
			}
			return Status;
		}
		public boolean SelectCoverage(String value) throws Exception
		{
			boolean Status=false;

			String[] sValue = value.split(":::");

			WebElement myscreen = ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject(sValue[0]));
			List<WebElement> allrows = myscreen.findElements(By.tagName("fieldset"));
			for(int i = 0; i <= allrows.size()-1; i++)
			{
				String[] Actualfeildsetname = allrows.get(i).getText().split("\\n");

				if (Actualfeildsetname[0].contains(sValue[1]))
				{
					List<WebElement> Cells = allrows.get(i).findElements(By.tagName("legend"));
					for(WebElement element: Cells)
					{
						String Actuallabel = element.getText(); 

						if (Actuallabel.equals(sValue[1]))
						{
							
							Status = true;
							
								String sId = element.getAttribute("id");
								sId = sId.substring(0, sId.length() - 7) + ":_checkbox";
								By sId1 = By.id(sId);
								//ManagerDriver.getInstance().getWebDriver().findElement(sId1).click();
//								ManagerDriver.getInstance().getWebDriver().findElement(sId1).sendKeys(Keys.ARROW_DOWN);
//								Thread.sleep(2000);
								ManagerDriver.getInstance().getWebDriver().findElement(sId1).sendKeys(Keys.SPACE);
								System.out.println("selected"+sValue[1] );
							
							break;

						}
					}
				}
				if(!Status==false)
				{
					break;

				}
			}
			return Status;
		}
		
		public boolean SelectCoverage1(String value) throws Exception
		{
			boolean Status=false;

			String[] sValue = value.split(":::");

			WebElement myscreen = ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject(sValue[0]));
			List<WebElement> allrows = myscreen.findElements(By.tagName("fieldset"));
			for(int i = 0; i <= allrows.size()-1; i++)
			{
				String[] Actualfeildsetname = allrows.get(i).getText().split("\\n");

				if (Actualfeildsetname[0].contains(sValue[1]))
				{
					List<WebElement> Cells = allrows.get(i).findElements(By.tagName("legend"));
					for(WebElement element: Cells)
					{
						String Actuallabel = element.getText(); 

						if (Actuallabel.equals(sValue[1]))
						{
							
							Status = true;
							
								String sId = element.getAttribute("id");
								sId = sId.substring(0, sId.length() - 7) + ":_checkbox";
								By sId1 = By.id(sId);
								ManagerDriver.getInstance().getWebDriver().findElement(sId1).click();
//								ManagerDriver.getInstance().getWebDriver().findElement(sId1).sendKeys(Keys.ARROW_DOWN);
//								Thread.sleep(2000);
								ManagerDriver.getInstance().getWebDriver().findElement(sId1).sendKeys(Keys.SPACE);
								System.out.println(Status);
							
							break;

						}
					}
				}
				if(!Status==false)
				{
					break;

				}
			}
			return Status;
		}
		
		public boolean SelectVehicle(String VehicleIndex) throws Exception{
			boolean status=false;
			String XpathID=".//div[contains(@id,'VehicleCoveragesLV-body')]//table["+VehicleIndex+ "]";
			status = common.SafeAction(By.xpath(XpathID), "ele", "ele");
			
			Thread.sleep(5000);
			
			return status;
		}
		
public boolean VerifyResults(String funValue) throws Exception
	{
		boolean status = false;
		String[] sValue = funValue.split(":::");
		logger.info("Verifying the Results");
		String Value = null;
		common.SafeAction(common.o.getObject(sValue[0]), sValue[1], sValue[0].substring(3));
		Value=common.ReadElementFromListEditBox(Common.o.getObject(sValue[0]), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
		status = common.CompareStringResult("Validate value is set from dropdown -", sValue[1], Value);
		if(!status)
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+sValue[0]+" case should PASS",""+sValue[0]+" case should not fail", "FAIL");
			status = true;
		}
		return status;
	}

	/**
	 * @function Uses to click the radio button
	 * @param sLabelValue
	 * @param sRadioButtonValue
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean ActionOnFieldExistence(String sLabelValue, String sRadioButtonValue) throws Exception
	{      
		boolean Status =false;
		boolean SearchString=false;
		String readText = null, sYes = null, sNo =null;
		List<WebElement> sTable = driver.findElements(By.tagName("label"));
		for(WebElement ele : sTable)
		{
			readText = ele.getText();
			if (readText.contains(sLabelValue))
			{
				SearchString = true;
				logger.info("Search String available in the table. '" + sLabelValue + "'");  
				HTML.fnInsertResult(HTML.properties.getProperty("testcasename"), HTML.properties.getProperty("methodName"), "System should search string in table and Search string is '" + sLabelValue + "'","System searched string in table and srarch string is  '" + readText + "'", "PASS");
				String sLabelId = ele.getAttribute("id");
				String[] sSplitReadID = sLabelId.split("-");
				if(sRadioButtonValue.contains("Input"))
				{
					logger.info("Search Element with label '"+readText+"' coressponding Input field should be verified for existence");
					sYes = sSplitReadID[0].concat("-inputEl");
					//Status = Common.SafeAction(By.id(sYes), "ele", "ele");
					//String value=Common.ReadElement(By.id(sYes), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
					Status=common.ElementDisplayed(By.id(sYes));
				}
				else if(sRadioButtonValue.contains("YES"))
				{
					logger.info("Search Element with label '"+readText+"' with option YES to be selected");
					sYes = sSplitReadID[0].concat("_true-boxLabelEl");
					Status = common.SafeAction(By.id(sYes), "ele", "ele");
				}      
				else
				{
					logger.info("Search Element with label '"+readText+"' with option No to be selected");
					sNo = sSplitReadID[0].concat("_false-boxLabelEl");
					Status = common.SafeAction(By.id(sNo), "ele", "ele");
				}
			}
		} 
		if(!SearchString)
		{
			logger.info("Search String is NOT available in the table. '" + sLabelValue + "'");  
			HTML.fnInsertResult(HTML.properties.getProperty("testcasename"), HTML.properties.getProperty("methodName"), "System should search string in table and Search string is '" + sLabelValue + "'","Coluld not find string '" + sLabelValue + "'", "FAIL");
		}

		if (Status)
		{
			logger.info("Search and click on object in the table cell and object name is '" + sYes + "'");  
			HTML.fnInsertResult(HTML.properties.getProperty("testcasename"), HTML.properties.getProperty("methodName"), "System should search object '"+sLabelValue+"' in the table cell and click on object '" + sNo + "'","System searched object the object '"+sLabelValue+"' in the table and clicked on object '" + sNo + "'", "PASS");
		}
		else
		{
			HTML.fnInsertResult(HTML.properties.getProperty("testcasename"), HTML.properties.getProperty("methodName"), "System should search object '"+sLabelValue+"' in the table cell and click on object '" + sYes + "'","System searched object the object '"+sLabelValue+"' in the table. But NOT able to perform action on object '" + sYes + "'", "PASS");
		}
		return Status;
	}



	/**	public boolean VerifyTextinListBox(String funValue) throws Exception
		{
			boolean status = false;
			  List<WebElement> sTable = driver.findElement(By.tagName()));



			return status;
		}	*/
	
	public boolean ToSelectCoverage(String value) throws Exception 
	{
		boolean status = false;
		
		
		
		String[] sValue = value.split(":::");
		try
		{
			status = common.ActionOnTable(Common.o.getObject("eleHOOpenSelectCoverage"),1,0, value,"img");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public boolean VerifyTextforAddedCvrg(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		status=common.ElementExist(common.o.getObject(sValue[0]));
		logger.info("Added expanded coverage :"+sValue[0]+"' is available");
		HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"),"Added new expanded coverage"+sValue[0]+"should be Available","The added new expanded coverage"+sValue[0]+"is availabe", "PASS");
	/**	if(common.WaitUntilClickable(Common.o.getObject(sValue[0]),  Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT"))))
		{
		status=common.ElementExist(common.o.getObject(sValue[0]));
		logger.info("Added expanded coverage :"+sValue[0]+"' is available");
		HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), sValue[0],sValue[1], "PASS");
		}
		else{
			System.out.println("element not available");
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), sValue[0],sValue[1], "FAIL");

		}*/
		return status;
		
	}
	public boolean SelectOptCoverage(String value) throws Exception 
	
	{
		boolean status = false;
		
		
		
		
		try
		{
			status = common.SafeAction(Common.o.getObject("eleHOOpenPropertyCoverages"), "ele", "ele");
			status = common.SafeAction(Common.o.getObject("btnHOOpenPropAddCoverages"), "ele", "ele");
			status = common.SafeAction(Common.o.getObject("edtHOOpenKeywordSearch"), value, "edtHOOpenKeywordSearch");
			status = common.SafeAction(Common.o.getObject("btnSearchHOOpenAddCovg"), "ele", "ele");
			status = common.ActionOnTable(Common.o.getObject("eleHOOpenSelectCoverage"),1,0, value,"img");
			status = common.SafeAction(Common.o.getObject("btnHOOpenAddSelectedCovg"), "ele", "ele");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public boolean SelectExcCoverage(String value) throws Exception 
	
	{
		boolean status = false;
		
		
		
		
		try
		{
			status = common.SafeAction(Common.o.getObject("eleHOOpenExclusionCoverages"), "ele", "ele");
			status = common.SafeAction(Common.o.getObject("btnHOOpenExclusionAddCoverages"), "ele", "ele");
			status = common.SafeAction(Common.o.getObject("edtHOExclusionKeywordSearch"), value, "edtHOExclusionKeywordSearch");
			status = common.SafeAction(Common.o.getObject("btnSearchHOExclusionAddCovg"), "ele", "ele");
			status = common.ActionOnTable(Common.o.getObject("eleHOOpenSelectCoverage"),1,0, value,"img");
			status = common.SafeAction(Common.o.getObject("btnHOOpenAddSelectedCovg"), "ele", "ele");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
}


