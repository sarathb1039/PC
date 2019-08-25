
package com.pc.screen;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;

public class Coverages{
	
		public static String sheetname = "Coverages";
		static Logger logger =Logger.getLogger(sheetname);
		Common common = CommonManager.getInstance().getCommon();
		private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
		public Boolean SCRCoverages() throws Exception{
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
			WebDriverWait wait = new WebDriverWait(driver, 15);
			boolean Status=false;
			System.out.println(value);
			String[] sValue = value.trim().split(":::");
			Thread.sleep(5000);
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
								wait.until(ExpectedConditions.visibilityOfElementLocated(sId1));
							}
							else
							{
								if(sValue[3].contains("Yes")){
									String sId = element.getAttribute("id");
									sId = sId.substring(0, sId.length() - 8) + "_true-inputEl";
									By sId1 = By.id(sId);
									Status = common.SafeAction(sId1,sValue[3],sValue[2]);
									wait.until(ExpectedConditions.visibilityOfElementLocated(sId1));
								}
								else{
									String sId = element.getAttribute("id");
									sId = sId.substring(0, sId.length() - 8) + "_false-inputEl";
									By sId1 = By.id(sId);
									Status = common.SafeAction(sId1,sValue[3],sValue[2]);
									wait.until(ExpectedConditions.visibilityOfElementLocated(sId1));
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
			Thread.sleep(3000);
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
								String sId_checkboxstatus = sId.replace(":_checkbox", "-body");//.substring(0, sId.length() - 7) + "-body";
								By sId1 = By.id(sId);
								By sId1_checkboxstatus = By.id(sId_checkboxstatus);
								//ManagerDriver.getInstance().getWebDriver().findElement(sId1).click();
//								ManagerDriver.getInstance().getWebDriver().findElement(sId1).sendKeys(Keys.ARROW_DOWN);
//								Thread.sleep(2000);								
								if(ManagerDriver.getInstance().getWebDriver().findElement(sId1_checkboxstatus).isDisplayed()==false)
								{
									ManagerDriver.getInstance().getWebDriver().findElement(sId1).sendKeys(Keys.SPACE);
									Thread.sleep(2000);
									//common.SafeAction(sId1, "elj"+sId1, "elj");//previously used
									System.out.println("selected "+sValue[1] );
								}
								else
								{
									System.out.println("Already selected"+sValue[1] );
								}
								
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

	/**switch (sValue[0].toUpperCase())
				{				
					case "VERIFYERRORMESSAGE":
						logger.info(sValue[0]);
						Value = common.ReadElement(Common.o.getObject("eleCommonZeroResults"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
						status = common.CompareStringResult(sValue[0], sValue[1], Value);
						break;
					case "CHECKPOLICYSTATUS":
						logger.info(sValue[0]);
						Value = common.ReadElement(Common.o.getObject("eleCLAPolicyStatus"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
						status = common.CompareStringResult("Policy Status", sValue[1], Value);
						break;
					case "CHECKTRANSACTIONSTATUS":
							logger.info(sValue[0]);
							Value = common.ReadElement(Common.o.getObject("eleTransactionStatus"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
							status = common.CompareStringResult("TransactionStatus", sValue[1], Value);
							break;
					case "CLABORDATE":
							logger.info(sValue[0]);
							Value = common.ReadElement(Common.o.getObject("eleCLABORStartDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
							status = common.CompareStringResult("BORStartDate", SCRCommon.ReturnCurrentDate(), Value);
							Value = common.ReadElement(Common.o.getObject("eleCLABOREndDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
							status = common.CompareStringResult("BOREndDate", SCRCommon.ReturnHundredAndEightyDaysFromDate(), Value);
							break;	
					  case "VERIFYPOLICYINFOSCREEN":
	                      logger.info(sValue[0]);
	                      status = common.ElementExistOrNotTrue("VerifyPolicyInfoScreen", "Policy Info Screen should not be editable", "Policy Info Screen should not be editable",(Common.o.getObject("elePolEffecDate")));
	                      status = common.ElementExistOrNotTrue("VerifyPolicyInfoScreen", "Policy Info Screen should not be editable", "Policy Info Screen should not be editable",(Common.o.getObject("elePolExpDate")));
	                      status = common.ElementExistOrNotTrue("VerifyPolicyInfoScreen", "Policy Info Screen should not be editable", "Policy Info Screen should not be editable",(Common.o.getObject("elePolSIC")));
	                      status = common.ElementExistOrNotTrue("VerifyPolicyInfoScreen", "Policy Info Screen should not be editable", "Policy Info Screen should not be editable",(Common.o.getObject("elePolMSI")));
	                      status = common.ElementExistOrNotTrue("VerifyPolicyInfoScreen", "Policy Info Screen should not be editable", "Policy Info Screen should not be editable",(Common.o.getObject("elePolBusinessSeg")));
	                      status = common.ElementExistOrNotTrue("VerifyPolicyInfoScreen", "Policy Info Screen should not be editable", "Policy Info Screen should not be editable",(Common.o.getObject("elePolProducer")));
	                      Value = Common.ReadElement(Common.o.getObject("elePolEffecDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                      status = Common.CompareStringResult("PolicyEffectiveDate", SCRCommon.ReturnCurrentDate(), Value);
	                      Value = Common.ReadElement(Common.o.getObject("elePolExpDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                      status = Common.CompareStringResult("PolicyExpirationDate", sValue[2], Value);
	                      Value = Common.ReadElement(Common.o.getObject("elePolSIC"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                      status = Common.CompareStringResult("PolicySICNumber", sValue[3], Value);
	                      Value = Common.ReadElement(Common.o.getObject("elePolMSI"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                      status = Common.CompareStringResult("PolicyMSINumber", sValue[4], Value);
	                      Value = Common.ReadElement(Common.o.getObject("elePolBusinessSeg"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                      status = Common.CompareStringResult("PolicyBusinessSegment", sValue[5], Value);
	                      Value = Common.ReadElement(Common.o.getObject("elePolProducer"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                      status = Common.CompareStringResult("PolicyProducer", sValue[6], Value);  
	                      break;
	               case "BORDATE":
	                      logger.info(sValue[0]);
	                      Value = common.ReadElement(Common.o.getObject("eleBORStartDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                      status = common.CompareStringResult("PolicyBORStartDate", SCRCommon.ReturnCurrentDate(), Value);
	                      Value = common.ReadElement(Common.o.getObject("eleBOREndDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                      status = common.CompareStringResult("PolicyBOREndDate", SCRCommon.ReturnSixtyDaysFromDate(), Value);
	                      break;
	               case "RECEIVEDDATE":
	                      logger.info(sValue[0]);
	                      Value = common.ReadElement(Common.o.getObject("eleBORReceivedDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                      status = common.CompareStringResult("PolicyReceivedDate", SCRCommon.ReturnCurrentDate(), Value);
	                      break;
	               case "VERIFYBORNOTSET":
	                      logger.info(sValue[0]);
	                      Value = common.ReadElement(Common.o.getObject("eleBORStartDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                      if(Value.equals(SCRCommon.ReturnCurrentDate()))
	                      {
	                             status = false;
	                             HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Current Date should not match","Current Date is matching", "FAIL");
	                      }else{
	                             status = true;
	                             HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Current Date should not match","Current Date is not matching", "PASS");
	                      }

	                      Value = common.ReadElement(Common.o.getObject("eleBOREndDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                      if(Value.equals(SCRCommon.ReturnSixtyDaysFromDate()))
	                      {
	                             status = false;
	                             HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Sixty Days from Current Date should not match","Sixty Days from Current Date is matching", "FAIL");
	                      }else{
	                             status = true;
	                             HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Sixty Days from Current Date should not match","Sixty Days from Current Date is not matching", "PASS");
	                      }
	                   break;
	               case "VERIFYBORSTARTDATE":
	        	   		logger.info(sValue[0]);
	        	   		Value = common.ReadElement(Common.o.getObject("eleBORStartDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	        	   		status = common.CompareStringResult("PolicyBORStartDate", SCRCommon.ReturnCurrentDate(), Value);
	                   break;
	               case "VERIFYBORENDDATE":
	            	   	logger.info(sValue[0]);
	            	   	Value = common.ReadElementGetAttribute(Common.o.getObject("eleBOREndDate"),"value", Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                    status = common.CompareStringResult("PolicyBOREnd", sValue[1], Value);
	                    break;
	               case "VERIFYFIELDS":
	                   logger.info(sValue[0]);
	                   //status=ActionOnFieldExistence(Common.o.getObject("eleTypeofCuisineLbl")),"Input");
	                   status=ActionOnFieldExistence("Type of Cuisine","Input");
	                   status=ActionOnFieldExistence("Risk Management Solutions","YES");
	                   status=ActionOnFieldExistence("Motor Carrier Filings","NO");
	                   status=ActionOnFieldExistence("Individual Financial Responsibility (SR22)","YES");
	                   status=ActionOnFieldExistence("TX Wind/Hail Exclusion Received","NO");
	                   break;
	               case "VERIFY_CANADIAN_POLICY_FIELDS":
	            	   logger.info(sValue[0]);
	            	   //String exlValue=Common.getSpecifiedExcelValue(sheetName, "edtOtherPolicyNo");
	            	   Value = common.ReadElement(Common.o.getObject("edtOtherPolicyNo"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	            	   status = common.CompareStringResult("OtherPolicy number - Canadian Policy", sValue[1], Value);
	            	   Value = common.ReadElement(Common.o.getObject("edtExchangeRate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	            	   status = common.CompareStringResult("Exchange Rate - Canadian Policy", sValue[2], Value);
	            	   Value = common.ReadElement(Common.o.getObject("edtTotalCanadianCost"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	            	   status = common.CompareStringResult("Total Canadian cost  - Canadian Policy", sValue[3], Value);
	            	   Value = common.ReadElement(Common.o.getObject("edtMailDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	            	   status = common.CompareStringResult("Mail Date  - Canadian Policy", sValue[4], Value);
	            	   //total cost field exitence
	            	   status=common.SafeAction(Common.o.getObject("edtTotalCost"), sValue[5], "edt");
	            	   String ActValue=common.ReadElementFromListEditBox(Common.o.getObject("edtTotalCost"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	            	   status = common.CompareStringResult("Total cost  - Canadian Policy", sValue[5], ActValue);
	            	   break;
	               case "WARNINGALERT":
	            	   logger.info(sValue[0]);
	            	   //String exlValue=Common.getSpecifiedExcelValue(sheetName, "edtOtherPolicyNo");
//	            	   Value = common.ReadElement(Common.o.getObject("edtOtherPolicyNo"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
//	            	   status = common.CompareStringResult("OtherPolicy number - Canadian Policy", sValue[1], Value);
	            	   status = common.ElementExistOrNotTrue(sValue[0], "Warning Alert should found", "Warning alert found", Common.o.getObject("eleCLAPIErrorMsgs"));
	            	   break;
	               case "VERIFYFIELDS":
	                   logger.info(sValue[0]);
	                   //status=ActionOnFieldExistence(Common.o.getObject("eleTypeofCuisineLbl")),"Input");
	                   status=ActionOnFieldExistence("Type of Cuisine","Input");
	                   status=ActionOnFieldExistence("Risk Management Solutions","YES");
	                   status=ActionOnFieldExistence("Motor Carrier Filings","NO");
	                   status=ActionOnFieldExistence("Individual Financial Responsibility (SR22)","YES");
	                   status=ActionOnFieldExistence("TX Wind/Hail Exclusion Received","NO");
	                   break;
	               case "VERIFY_CANADIAN_POLICY_FIELDS":
	                 logger.info(sValue[0]);
	                 //String exlValue=Common.getSpecifiedExcelValue(sheetName, "edtOtherPolicyNo");
	                 Value=common.ReadElementGetAttribute(Common.o.getObject("edtOtherPolicyNo"),"value", Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                 status = common.CompareStringResult("OtherPolicy number - Canadian Policy", sValue[1], Value);
	                 Value = common.ReadElementGetAttribute(Common.o.getObject("edtExchangeRate"), "value",Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                 status = common.CompareStringResult("Exchange Rate - Canadian Policy", sValue[2], Value);
	                 Value = common.ReadElementGetAttribute(Common.o.getObject("edtTotalCanadianCost"),"value", Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                 status = common.CompareStringResult("Total Canadian cost  - Canadian Policy", sValue[3], Value);
	                 Value = common.ReadElementGetAttribute(Common.o.getObject("edtMailDate"),"value", Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                 status = common.CompareStringResult("Mail Date  - Canadian Policy", sValue[4], Value);
	                 //total cost field exitence
	                 status=common.SafeAction(Common.o.getObject("edtTotalCost"), sValue[5], "edt");
	                 String ActValue=common.ReadElementFromListEditBox(Common.o.getObject("edtTotalCost"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                 status = common.CompareStringResult("Total cost  - Canadian Policy", sValue[5], ActValue);
	                 break;
	               case "VERIFYCUEBUTTONUNSELECTABLE":
	                   logger.info(sValue[0]);
	                   status = common.ElementExistOrNotTrue("VerifyCUEButtonUnselectable", "CUEButton Should not be selectable", "CUEButton Should not be selectable",(Common.o.getObject("eleCueButton")));
	                   break;
	               case "VERIFYRESERVEPOLICYNUMBER":
	            	   logger.info(sValue[0]);
	            	   status = common.ElementExistOrNotTrue("VerifyReservePolicyButtonselectable", "ReservePolicyButton Should  be selectable", "ReservePolicyButton Should  be selectable",(Common.o.getObject("eljCLAReservePolicyNumber")));                   
	                  break;
	               case "VERIFY_PIP_DEDUC_COVERAGE_LIST_BOX":
	                   logger.info(sValue[0]); 


	               case "VERIFY_PIP_WORKLOSS_COVERAGE_LIST_BOX":
	                   logger.info(sValue[0]);

	                   Value=common.ReadElementFromListEditBox(Common.o.getObject("lstPIPFloridaWorkLoss"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                   status = common.CompareStringResult("Validate value is set from dropdown -PIP Florida Work Losses", sValue[1], Value);
	                   break;    
	               case "VERIFY_PIP_APPLIESTO_COVERAGE_LIST_BOX":
	                   logger.info(sValue[0]);

	                   Value=common.ReadElementFromListEditBox(Common.o.getObject("lstPIPFloridaAppliesTo"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                   status = common.CompareStringResult("Validate value is set from dropdown -PIP Florida Applies to", sValue[1], Value);
	                   break;     
	               case "VALIDATE_CANADIAN_FIELD":
	                   Value = common.ReadElementGetAttribute(Common.o.getObject("edtExchangeRate"), "value",Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                      status = common.CompareStringResult("Exchange Rate - Canadian Policy", sValue[1], Value);
	                      Value = common.ReadElementGetAttribute(Common.o.getObject("edtTotalCanadianCost"),"value", Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                      status = common.CompareStringResult("Total Canadian cost  - Canadian Policy", sValue[2], Value);
	                      Value=common.ReadElementFromListEditBox(Common.o.getObject("edtTotalCost"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
	                      status = common.CompareStringResult("Total cost  - Canadian Policy", sValue[3], Value);
	                      break;

				} */



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
}


