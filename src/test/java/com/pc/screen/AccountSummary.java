package com.pc.screen;


import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;

public class AccountSummary {
	
	public static String sheetname = "AccountSummary";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	public Boolean SCRAccountSummary() throws Exception
	{
			Boolean status = true;
			status = common.ClassComponent(sheetname,Common.o);
			if(!status)
			{
				status = false;
			}
			return status;
	}
	
	public boolean VerifyResults(String funValue) throws Exception
	{
		boolean status = false;
		logger.info("Verify the Results");
		String[] sValue = funValue.split(":::");
		String Value = null;
			switch (sValue[0].toUpperCase())
			{				
				
				case "VERIFYEXPERIAN":
					logger.info(sValue[0]);
					Value = common.ReadElement(Common.o.getObject("eleAccount_ExperianKey"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
					status = common.CompareStringResult("PolicyExperian", sValue[1], Value);
					break;
					
				case "STATUSCHECK":
					logger.info(sValue[0]);
					Value = common.ReadElement(Common.o.getObject("eleNewSubmission"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
					status = common.CompareStringResult("VerifyStatus", sValue[1], Value);
					break;
					
				case "VERIFY_POLICY_FLAG":
                    logger.info(sValue[0]);
                    //status=common.ActionOnTable(common.o.getObject("eleAccountSummary_PolicyTermsTbl"), 8, 0, "In Force", "img");
                    //status = common.ActionOnTable(common.o.getObject("eleAccountSummary_PolicyTermsTbl"), 8, 0, "In Force","img");
                    Value=common.GetTextFromTable(Common.o.getObject("eleAccountSummary_PolicyTermsTbl"), 8, 1, "In Force");
                    status = common.ActionOnTable(Common.o.getObject("eleAccountSummary_PolicyTermsTbl"), 1, 0, Value,"img");
                    break;
                    
				case "VERIFY_POLICY_FLAG_DOESNT_EXIST":
                    logger.info(sValue[0]);
                    //status=common.ActionOnTable(common.o.getObject("eleAccountSummary_PolicyTermsTbl"), 8, 0, "In Force", "img");
                    //status = common.ActionOnTable(common.o.getObject("eleAccountSummary_PolicyTermsTbl"), 8, 0, "In Force","img");
                    Value=common.GetTextFromTable(Common.o.getObject("eleAccountSummary_PolicyTermsTbl"), 8, 1, "In Force");
                    status=ElementExistonTable(Common.o.getObject("eleAccountSummary_PolicyTermsTbl"), 1, 0, Value,"img");
                    if(!status)
                    {
                                    HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify the FLAG icon on Policy Term Section","Flag Icon is NOT Displayed on Policy Term Section", "PASS");
                                    status=true;
                    }
                    else
                    {
                                    HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify the FLAG icon on Policy Term Section","Flag Icon is Displayed on Policy Term Section", "FAIL");
                                    status=false;
                    }
                    break;
				case "VERIFYRESULT":
					logger.info(sValue[0]);
					Value = common.ReadElement(Common.o.getObject(sValue[1]), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
					if (Value != null)
					{
						status = true;
						
					}
					break;
				case "VERIFYPOLICYTERMS":
					logger.info(sValue[0]);
					//value = common.GetTextFromTable1(common.o.getObject("eleAccountSummary_PolicyTermsTbl"), 7,12,sValue[1]);
					Value = common.GetTextFromTable(Common.o.getObject("eleAccountSummary_PolicyTermsTbl"), 7,11,sValue[1]);
					status = common.CompareStringResult("verify display of biling Number", sValue[2], Value);
					if (sValue[3].toUpperCase().equalsIgnoreCase("SPAN") || sValue[3].toUpperCase().equalsIgnoreCase("DIV") )
					{
						status = common.ActionOnTable(Common.o.getObject("eleAccountSummary_PolicyTermsTbl"), 11, 11, sValue[2], sValue[3].toLowerCase());
						if (status)
						{
							HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Billing Number '"+sValue[2]+"' should display without hyperlink","'"+sValue[0]+"' displayed without hyperlink", "PASS");
						}
						else
						{
							HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Billing Number '"+sValue[2]+"' should display without hyperlink","'"+sValue[0]+"' NOT displayed without hyperlink", "FAIL");
						}
					}
					else if (sValue[3].toUpperCase().equalsIgnoreCase("LINK"))
					{
						status = common.ActionOnTable(Common.o.getObject("eleAccountSummary_PolicyTermsTbl"), 11, 11, sValue[2], "a");
						if (status)
						{
							HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Billing Number '"+sValue[2]+"' should display with hyperlink","'"+sValue[0]+"' displayed with hyperlink", "PASS");
						}
						else
						{
							HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Billing Number '"+sValue[2]+"' should display with hyperlink","'"+sValue[0]+"' NOT displayed with hyperlink", "FAIL");
						}
					}
					break;
					
				case "VERIFYPOLICYTRANSACTION":
					logger.info(sValue[0]);
					Value = common.GetTextFromTable(Common.o.getObject("eleAccountSummary_PolicyTranTbl"), 5,8,sValue[1]);
					status = common.CompareStringResult("verify display of biling Number", sValue[2], Value);
					if (sValue[3].toUpperCase().equalsIgnoreCase("SPAN") || sValue[3].toUpperCase().equalsIgnoreCase("DIV"))
					{
						status = common.ActionOnTable(Common.o.getObject("eleAccountSummary_PolicyTranTbl"), 8, 8, sValue[2], sValue[3].toLowerCase());
						if (status)
						{
							HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Billing method '"+sValue[2]+"' should display without hyperlink","'"+sValue[0]+"' displayed without hyperlink", "PASS");
						}
						else
						{
							HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Billing method '"+sValue[2]+"' should display without hyperlink","'"+sValue[0]+"' NOT displayed without hyperlink", "FAIL");
						}
					}
					else if (sValue[3].toUpperCase().equalsIgnoreCase("LINK"))
					{
						status = common.ActionOnTable(Common.o.getObject("eleAccountSummary_PolicyTranTbl"), 8,8, sValue[2], "a");
						if (status)
						{
							HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Billing method '"+sValue[2]+"' should display with hyperlink","'"+sValue[0]+"' displayed with hyperlink", "PASS");
						}
						else
						{
							HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Billing method '"+sValue[2]+"' should display with hyperlink","'"+sValue[0]+"' NOT displayed with hyperlink", "FAIL");
						}
					}
					else
					{
						status = false;
					}
					break;
				case "VERIFY_XACTPAY_ERR":     // changed to manage sheel policy
                    logger.info("Verification started for  '"+sValue[0]+"'");
                   // status=common.ElementExistOrNotTrue("Element exist", "XAct Pay Launch screen", "XAct Pay Launch screen dispalyed as expected", Common.o.getObject("eleXactPayLaunchTitle"));
                    Value = common.ReadElement(Common.o.getObject("elePCVerifyErrorMessages"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
                    status = common.CompareStringResult("Account Summary- XAct Pay Error message", sValue[1],Value);
                    break;
			}
			if(!status)
			{
				logger.info(""+sValue[0]+" Fails" );
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+sValue[0]+" case should PASS",""+sValue[0]+" case should not fail", "FAIL");
				status = true;
			}
		return status;
	}
	
		    /**
		* @function This function use to verify element in Table
		* @param obj,readCol,actionCol,strReadString,actionObjetName
		* @return status
		* @throws Exception
		*/
		public static Boolean ElementExistonTable(By obj, int readCol, int actionCol, String strReadString, String sTagName) throws Exception
		{      
			boolean Status=false;
			boolean SearchString=false;
//			boolean ActionObject=false;
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
			//            String objName = element.getText();
			//            if(objName.contains(actionObjetName))
			//                 {
			                  //Status = true;
			                  //ActionObject = true;
			                  Status=element.isDisplayed();
			                  break;
			//          }
			        }
		   }
		     if(Status == true)
		     {
		            break;
		     }
		}
		if(SearchString)
		{
		            logger.info("Search String available in the table. '" + strReadString + "'");  
		            HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System searched string in table and srarch string is  '" + strReadString + "'", "PASS");
		}
		else
		{
		            logger.info("Search String not available in the table. '" + strReadString + "'");  
		            HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should search string in table and Search string is '" + strReadString + "'","System searched string in table and srarch string is  '" + strReadString + "'", "FAIL");
		            Status = false;
		}
		return Status;
		}
		
		 /**
         * @function use to select policy transaction from the account file summary screen
         * @param  sReadString
         * @return true/false
         * @throws Exception
         */
         public boolean SelectPolicyTable(String sReadString) throws Exception
         {
                boolean status = false;
                status = common.ActionOnTable(Common.o.getObject("eleAccountSummary_PolicyTranTbl"), 4, 3, "", "div");
                return status;
         }
         
         /**
         * @function use to select policy term from the account file summary screen
         * @param  sReadString
         * @return true/false
         * @throws Exception
         */
         public boolean SelectPolicyTab(String sReadString) throws Exception
         {
                boolean status = false;
                status = common.ActionOnTable(Common.o.getObject("eleAccountSummary_PolicyTermsTbl"), 6, 1, "", "div");
                return status;
         }
}