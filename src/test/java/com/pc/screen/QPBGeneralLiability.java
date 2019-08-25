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

public class QPBGeneralLiability {
	
	public static String sheetname = "QPBGeneralLiability";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
	public Boolean SCRQPBGeneralLiability() throws Exception{

		Boolean status = true;
		status = common.ClassComponent(sheetname,Common.o);
		if(!status)
		{
			status = false;
		}	
		return status;
	}
	
	public boolean VerifyResults(String sFuncValue) throws Exception
	{
		boolean status = false;
		String[] sValue = sFuncValue.split(":::");
		logger.info("Verifying the Results");
//		String Value = null;
			switch (sValue[0].toUpperCase())
			{				
				case "VERIFYGENERALLIABILITYPAGE":
					logger.info(sValue[0]);
					status = common.ElementExistOrNotTrue(sValue[0], "System should display General Liablility Roster Page", "System displays General Liability Roster Page", Common.o.getObject("eleQPBGeneralLiability"));
					break;
			}
			if(!status)
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+sValue[0]+" case should PASS",""+sValue[0]+" case fail", "FAIL");
				status = true;
			}
		return status;
	}
	
	public Boolean QPBOtherPremiumEdit(String strParam) throws Exception
	{
		Boolean status = true;
		String[] strParams = strParam.split(":::::");
		for(int i=0; i<(strParams.length);i++)
		{
			String strParams1[] = strParams[i].split(":::");
			String cla = "x-form-item-label x-unselectable x-form-item-label-top";
			List<WebElement> CellElements = driver.findElements(By.tagName("label"));
			  for(WebElement element: CellElements)
	          {
	        	  String objName = element.getText();
	        	  String clas = element.getAttribute("class");
		        	  if(objName.contains(strParams1[0]) )
		        	  {
			        		  if(cla.contains(clas))
			        		  {
					        		String readAttriID1 = element.getAttribute("id");
					        		String[] sID = readAttriID1.split("DV:");
					        		String[] sID1 = sID[1].split(":");
					        		int value2 = Integer.parseInt(sID1[0])+1;
					        		String SD3 = sID[0].concat("DV:")+value2+":QPBModalQuestion_ExtInputSet:IntegerFieldInput-inputEl";					        		
				        			WebElement  elem = common.returnObject(By.id(SD3));
				        		  	elem.click();
				        		  	elem.sendKeys(strParams1[1]);
				        		  	elem.sendKeys(Keys.TAB);
//				        		  	Common.WaitForPageToBeReady();
				        		  	Thread.sleep(4000);
				        		  	 break;
		        	  			}	
	        	  		}
        	  }
	          if(status)
			  {
				  logger.info(""+strParams1[0]+" TestArea has been Filled");  
				  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" TestArea should filled",""+strParams1[0]+" TestArea is filled","PASS");
			  }
			  else
			  {
				  logger.info(""+strParams1[0]+" TestArea has not been Filled");
				  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" TestArea should filled",""+strParams1[0]+" TestArea is not filled","FAIL");
				  status = false;
			  }
		}
		return status;
	}
	
	public Boolean QPBEdit(String strParam) throws Exception
	{
		Boolean status = true;
		String[] strParams = strParam.split(":::::");
		for(int i=0; i<(strParams.length);i++)
		{
			String strParams1[] = strParams[i].split(":::");
//		         for(String str: strParams)
//		         {
		        	 	  String cla = "x-form-item-label x-unselectable x-form-item-label-top";
						  List<WebElement> CellElements = driver.findElements(By.tagName("label"));
					          for(WebElement element: CellElements)
					          {
					        	  String objName = element.getText();
					        	  String clas = element.getAttribute("class");
						        	  if(objName.contains(strParams1[0]) )
						        	  {
							        		  if(cla.contains(clas))
							        		  {
									        		String readAttriID1 = element.getAttribute("id");
									        		String[] sID = readAttriID1.split("-");
								        			String sID1 = sID[0].concat("-inputEl");
								        			WebElement  elem = common.returnObject(By.id(sID1));
								        		  	elem.click();
								        		  	common.WaitForPageToBeReady();
								        		  	elem.sendKeys(strParams1[1]);
								        		  	break;
						        	  			}	
					        	  		}
						        	  
					        	  }
//		         }
	          if(status)
			  {
				  logger.info(""+strParams1[0]+" TestArea has been Filled");  
				  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" TestArea should filled",""+strParams1[0]+" TestArea is filled","PASS");
			  }
			  else
			  {
				  logger.info(""+strParams1[0]+" TestArea has not been Filled");
				  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" TestArea should filled",""+strParams1[0]+" TestArea is not filled","FAIL");
				  status = false;
			  }
		}
		return status;
	}
	
	public Boolean QPBEditWait(String strParam) throws Exception
	{
		Boolean status = true;
		String[] strParams = strParam.split(":::::");
		for(int i=0; i<(strParams.length);i++)
		{
			String strParams1[] = strParams[i].split(":::");
//		         for(String str: strParams)
//		         {
        	 	  String cla = "x-form-item-label x-unselectable x-form-item-label-left";
				  List<WebElement> CellElements = driver.findElements(By.tagName("label"));
			          for(WebElement element: CellElements)
			          {
			        	  String objName = element.getText();
			        	  String clas = element.getAttribute("class");
				        	  if(objName.contains(strParams1[0]) )
				        	  {
					        		  if(cla.contains(clas))
					        		  {
							        		String readAttriID1 = element.getAttribute("id");
							        		String[] sID = readAttriID1.split("-");
						        			String sID1 = sID[0].concat("-inputEl");
						        			WebElement  elem = common.returnObject(By.id(sID1));
						        		  	elem.click();
						        		  	elem.sendKeys(strParams1[1]);
						        		  	elem.sendKeys(Keys.TAB);
						        		  	Thread.sleep(4000);
						        		  	break;
				        	  			}	
			        	  		}  
		        	  }
//		         }
	          if(status)
			  {
				  logger.info(""+strParams1[0]+" TestArea has been Filled");  
				  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" TestArea should filled",""+strParams1[0]+" TestArea is filled","PASS");
			  }
			  else
			  {
				  logger.info(""+strParams1[0]+" TestArea has not been Filled");
				  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" TestArea should filled",""+strParams1[0]+" TestArea is not filled","FAIL");
				  status = false;
			  }
		}
		return status;
	}
	
	public Boolean QPBCoverageMarketingFlyers(String strParam) throws Exception
	{
		Boolean status = false;
		String[] strParams = strParam.split(":::::");
		for(int i=0; i<(strParams.length);i++)
		{
			String strParams1[] = strParams[i].split(":::");
//				for(String str: strParams1)
//		         {
				  List<WebElement> CellElements = driver.findElements(By.tagName("a"));
		          for(WebElement element: CellElements)
		          {
		        	  String objName = element.getText();
		        	  		{
			        		  if(objName.contains(strParams1[0]))
			        		  {
					        		String readAttriID1 = element.getAttribute("id");
					        		String[] sID = readAttriID1.split("_ExtInputSet");
				        			String sID1 = sID[0].concat("_ExtInputSet:choicea:choicea_Arg-inputEl");
				        			WebElement  sElement = common.returnObject(By.id(sID1));
				        			sElement.click();
				        			sElement.clear();
				        			sElement.sendKeys(strParams1[1]);
				        			sElement.sendKeys(Keys.TAB);
				        			common.WaitForPageToBeReady();
				        		  	Thread.sleep(3000);
				        		  	status = true;
				        		  	break;
		        	  			}	
		        	  		}
		        	  }
//		         }
			if(status)
			  {
				  logger.info(""+strParams1[0]+" Flyer has been Filled");  
				  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" should filled",""+strParams1[0]+" is filled","PASS");
			  }
			  else
			  {
				  logger.info(""+strParams1[0]+" Flyer has not been Filled");
				  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams1[0]+" should filled",""+strParams1[0]+" is not filled","FAIL");
				  status = false;
			  }
		}
		return status;
	}
	
	public Boolean QPBCheckBox(String strParam) throws Exception
	{
		Boolean status = false;
		String[] strParams = strParam.split(":::");
		for(String str: strParams)
         {
    	 		  String cla = "x-form-cb-label x-form-cb-label-after";
				  List<WebElement> CellElements = driver.findElements(By.tagName("label"));
		          for(WebElement element: CellElements)
		          {
		        	  String objName = element.getText();
		        	  String clas = element.getAttribute("class");
		        	  if(objName.contains(str) )
        	  			{
		        		  if(cla.contains(clas))
		        		  {
				        		  String readAttriID1 = element.getAttribute("id");
								  WebElement  elem = common.returnObject(By.id(readAttriID1));
				        		  elem.click();
				        		  common.WaitForPageToBeReady();
				        		  status = true;
				        		  break;
	        	  			}	
	        	  		}
		          }
		          if(status)
				  {
					  logger.info(""+str+" Check Box has been Selected");  
					  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+str+" should filled",""+str+" is Selected","PASS");					  
				  }
				  else
				  {
					  logger.info(""+str+" Check Box has not been Selected");
					  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+str+" should filled",""+str+" is not Selected","FAIL");
					  status = false;
				  }
         }
		return status;
	}
	
	public Boolean QPBVerifyElement(String strParam) throws Exception
	{
		Boolean status = false;
		Boolean sVerifyElementAssert = true;
		String[] strParams = strParam.split(":::");
		for(String str: strParams)
         {
    	 		  String cla = "x-form-cb-label x-form-cb-label-after";
				  List<WebElement> CellElements = driver.findElements(By.tagName("label"));
		          for(WebElement element: CellElements)
		          {
		        	  String objName = element.getText();
		        	  String clas = element.getAttribute("class");
		        	  if(objName.contains(str))
        	  			{
		        		  if(cla.contains(clas))
		        		  {
				        		  String readAttriID1 = element.getAttribute("id");
								  WebElement  elem = common.returnObject(By.id(readAttriID1));
				        		  	//Common.highlightElement(By.id(readAttriID1));
				        		  elem.click();
				        		  status = true;
				        		  sVerifyElementAssert = SCRCommon.PageVerify(strParams[1]);
				        		  break;
//				        		  Common.WaitForPageToBeReady();
	        	  			}	
	        	  		}
		          }
		          if(status)
				  {
					  logger.info(""+str+" Check Box has been Selected and Verified the Element");  
					  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+str+" should filled",""+str+" is Selected","PASS");
					  if(sVerifyElementAssert)
					  {
						  logger.info(""+strParams[1]+" Verified the Element");  
						  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams[1]+" should filled",""+strParams[1]+" is Selected","PASS");
					  }
					  else
					  {
						  logger.info(""+str+" Element does not exist");
						  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+strParams[1]+" should filled",""+strParams[1]+" is not Selected","FAIL");
						  status = false;
					  }
				  }
				  else
				  {
					  logger.info(""+str+" Check Box has not been Selected");
					  HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+str+" should filled",""+str+" is not Selected","FAIL");
					  status = false;
				  }
         }
		return status;
	}
}