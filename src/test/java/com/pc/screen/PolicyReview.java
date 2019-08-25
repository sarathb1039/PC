package com.pc.screen;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;

public class PolicyReview {
	
		public static String sheetname = "PolicyReview";
		static Logger logger =Logger.getLogger(sheetname);
		Common common = CommonManager.getInstance().getCommon();
		private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
		public Boolean SCRPolicyReview() throws Exception
		{

			Boolean status = true;
			status = common.ClassComponent(sheetname, Common.o);
			if(!status)
			{
				status = false;
			}
		return status;
		}
		
		public boolean ApproveCountLast() throws NumberFormatException, Exception  
		{
			boolean status = false;
			status = common.WaitUntilClickable(Common.o.getObject("eleBindOptionAssert"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
			if(driver.findElements(Common.o.getObject("eleSPLApprvoalAssert")).isEmpty())
			{
				logger.info("System does not any special approval");
				status = common.SafeAction(Common.o.getObject("eleRiskAnalysisTab"), "eleRiskAnalysisTab", "ele");
				status = true;
			}
			else
			{
				status = common.SafeAction(Common.o.getObject("eleRiskAnalysispage"), "", "ele");
				status = common.WaitUntilClickable(Common.o.getObject("eleRiskAnalysis"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
				if(driver.findElements(Common.o.getObject("eleAuthorityAckowledge")).isEmpty() && driver.findElements(Common.o.getObject("eleSpecialApprove")).isEmpty() )
				{
					logger.info("Heading to Approve");
					//*****************This Code is for Approve Button 
					int sApprovalCount = common.ElementSize(Common.o.getObject("eleApprove"));
					for(int i = 0; i<sApprovalCount; i++ )
					{
							status = common.SafeAction(Common.o.getObject("eleApproveButton"), "", "ele");
							status = common.SafeAction(Common.o.getObject("eleRiskOkButton"), "", "ele");
					} 
				}
				else if(driver.findElements(Common.o.getObject("eleApprove")).isEmpty() && driver.findElements(Common.o.getObject("eleSpecialApprove")).isEmpty() )
				{
					logger.info("Heading to Authority Acknowledgement");
					//*****************This Code is for Authority Acknowledgement Approve button 
					int sApprovalAuthorityCount = common.ElementSize(Common.o.getObject("eleAuthorityAckowledge"));
					for(int i = 0; i<sApprovalAuthorityCount; i++ )
					{
							status = common.SafeAction(Common.o.getObject("eleAuthorityApprove"), "", "ele");
							status = common.SafeAction(Common.o.getObject("eleAlertPopUp"), "", "ele");
							status = common.SafeAction(Common.o.getObject("eleRiskOkButton"), "", "ele");
					}
				}else
				{
					logger.info("Heading to Special Approval");
					//*****************This Code is for Special Approval
					int sApprovalAuthorityCount = common.ElementSize(Common.o.getObject("eleSpecialApprove"));
					for(int i = 0; i<sApprovalAuthorityCount; i++ )
					{
							status = common.SafeAction(Common.o.getObject("eleSpecialApproveButton"), "", "ele");
							status = common.SafeAction(Common.o.getObject("eleAlertPopUp"), "", "ele");
							status = common.SafeAction(Common.o.getObject("eleRiskOkButton"), "", "ele");
					}
				}
			}
			if(!status)
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should approve all the request","System not approved all the request", "FAIL");
			}
			return status;	
		}
		

		public boolean ApproveCount() throws NumberFormatException, Exception  
		{
			boolean status = false;
			String sApproveType = null;
			int sApprovalCount;
			status = common.WaitUntilClickable(Common.o.getObject("eleBindOptionAssert"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
			sApproveType = common.ReadElement(Common.o.getObject("eleSPLApprvoalAssertTable"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
//			sApproveType = GetTextFromTableApproval(Common.o.getObject("eleSPLApprvoalAssertTable"), 0, 3, "This quote will require:::underwriting approval:::prior to issuance." , "label");
			if(sApproveType.contains("This quote will require underwriting approval prior to issuance."))
			{	
				status = common.SafeAction(Common.o.getObject("eleRiskAnalysispage"), "", "ele");
				status = common.WaitUntilClickable(Common.o.getObject("eleRiskAnalysis"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
				sApproveType = GetTextFromTableApproval(Common.o.getObject("eleApproveButtonType"), 4, 1, "Approve:::Special Approve:::Authority Acknoledge", "a");
				switch (sApproveType)
				{
					case "Approve":
						logger.info("Heading to Approve");
						//*****************This Code is for Approve Button 
						sApprovalCount = common.ElementSize(Common.o.getObject("eleApprove"));
						for(int i = 0; i<sApprovalCount; i++ )
						{
								status = common.SafeAction(Common.o.getObject("eleApproveButton"), "", "ele");
								status = common.SafeAction(Common.o.getObject("eleRiskOkButton"), "", "ele");
						} 
					break;
					case "Special Approve":
						logger.info("Heading to Special Approval");
						//*****************This Code is for Special Approval
						sApprovalCount = common.ElementSize(Common.o.getObject("eleSpecialApprove"));
						for(int i = 0; i<sApprovalCount; i++ )
						{
								status = common.SafeAction(Common.o.getObject("eleSpecialApproveButton"), "", "ele");
								status = common.SafeAction(Common.o.getObject("eleAlertPopUp"), "", "ele");
								status = common.SafeAction(Common.o.getObject("eleRiskOkButton"), "", "ele");
						}
					break;	
					case "Authority Acknowledge":
						logger.info("Heading to Authority Acknowledgement");
						//*****************This Code is for Authority Acknowledgement Approve button 
						sApprovalCount = common.ElementSize(Common.o.getObject("eleAuthorityAckowledge"));
						for(int i = 0; i<sApprovalCount; i++ )
						{
								status = common.SafeAction(Common.o.getObject("eleAuthorityApprove"), "", "ele");
								status = common.SafeAction(Common.o.getObject("eleAlertPopUp"), "", "ele");
								status = common.SafeAction(Common.o.getObject("eleRiskOkButton"), "", "ele");
						}
					break;	
				}	
			}
			else
			{
				logger.info("System does not any special approval");
				status = common.SafeAction(Common.o.getObject("eleRiskAnalysisTab"), "eleRiskAnalysisTab", "ele");
			}
			if(!status)
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should approve all the request","System not approved all the request", "FAIL");
			}
			return status;
		}
		
		/**
		 * @function This function use to get the text from the approve button type to approve the reques
		 * @param obj
		 * @param readTextCol
		 * @param strReadString
		 * @return readText
		 * @throws Exception
		 */
		public String GetTextFromTableApproval(By obj, int readTextCol, int sRow, String strReadString, String sTagname) throws Exception
		{	
			  boolean SearchString = false;
			  String[] sReadString = strReadString.split(":::");
			  String readText = null;
			  WebElement mytable = driver.findElement(obj);
			  List<WebElement> allrows = mytable.findElements(By.tagName("tr"));
			  for(int i = 0; i <= allrows.size()-1; i++)
			  {
				  List<WebElement> Cells = allrows.get(sRow).findElements(By.tagName("td"));
				  List<WebElement> CellElements = Cells.get(readTextCol).findElements(By.tagName(sTagname));
				  for(WebElement element: CellElements)
			          {
			        	  readText = element.getText();
			        	  if(readText.contains(sReadString[0]) || readText.contains(sReadString[1]) || readText.contains(sReadString[2]))
		        	  		{
			        		  	SearchString = true;
		            			break;
			            	}
			          }
			  if(SearchString == true)
			  	{
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
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System searched string in table and search string is  '" + strReadString + "'", "FAIL");
					SearchString = true;
			  }
			  return readText;  
		}	
}
