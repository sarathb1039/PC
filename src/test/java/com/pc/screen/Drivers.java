package com.pc.screen;

import java.util.Locale;

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
import com.pc.utilities.XlsxReader;

public class Drivers{
	
		public static String sheetname = "Drivers";
		static Logger logger =Logger.getLogger(sheetname);
		Common common = CommonManager.getInstance().getCommon();
		private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
		
		public Boolean SCRDrivers() throws Exception{
						Boolean status = true;
			status = common.ClassComponent(sheetname, Common.o);
			if(!status)
			{
				status = false;
			}
			return status;
	}

		public boolean AddDriverFromAddrBook(String name) throws Exception{
			boolean status = false ;
			String[] sName=name.split(" ");
			status=common.SafeAction(common.o.getObject("eleDriverfromAddrBook"), "eleDriverfromAddrBook", "ele");
			status=common.SafeAction(common.o.getObject("edtcommonFirstName"), sName[0], "edt");
			status=common.SafeAction(common.o.getObject("edtcommonLastName"), sName[1], "edt");
			status=common.SafeAction(common.o.getObject("eleCommonSearch"), "eleCommonSearch", "ele");
			status=common.SafeAction(common.o.getObject("eleCommonCreateNewContact"), "eleCommonCreateNewContact", "ele");

			
			
			return status;
			
					
		}

		
		public boolean MotorVehicleRecord() throws Exception{
			boolean status=false;
			driver.findElement(By.xpath("html/body/div[4]/table/tbody/tr/td/div/table/tbody/tr[4]/td/div/table/tbody/tr[1]/td/div/div[4]/div[1]/div/table/tbody/tr/td[1]/div")).click();
			driver.findElement(By.xpath("html/body/div[4]/table/tbody/tr/td/div/table/tbody/tr[4]/td/div/table/tbody/tr[1]/td/div/div[4]/div[1]/div/table/tbody/tr/td[1]/div")).sendKeys(Keys.SPACE);
			driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:RetrieveMVRButton")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:MVRDetailCardTab")).click();;

			driver.findElement(By.xpath("html/body/div[4]/table/tbody/tr/td/div/table/tbody/tr[4]/td/div/table/tbody/tr[1]/td/div/div[4]/div[1]/div/table/tbody/tr/td[1]/div")).click();
			driver.findElement(By.xpath("html/body/div[4]/table/tbody/tr/td/div/table/tbody/tr[4]/td/div/table/tbody/tr[1]/td/div/div[4]/div[1]/div/table/tbody/tr/td[1]/div")).sendKeys(Keys.SPACE);
			
			driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:RetrieveMVRButton")).click();
			Thread.sleep(2000);
			//status=common.SafeAction(common.o.getObject("btnRetrieveMVR"), "btnRetrieveMVR", "elj");
			//driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:MVRDetailCardTab"));
			driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:MotorVehicleRecordCard:PersonalMotorVehicleRecordsDV:MVRReportButton")).click();
			//driver.findElement(By.id("DriverMVRInfoPopup:__crumb__")).click();
			status=common.SafeAction(common.o.getObject("eleReturntoDrivers"), "eleReturntoDrivers", "ele");
			return  status;
		}
		
		public boolean MaskedField() throws Exception{
			boolean status=false;
			WebElement element = ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("edtCommonSSN"));
			status=common.SafeAction(common.o.getObject("edtCommonSSN"), "edtCommonSSN", "ele");
			String elementValue= element.getAttribute("value");
			if(elementValue.contains("***-**")){
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "The SSN  field value should have to masked as'"+elementValue+"'", "The SSN field value is masked as '"+elementValue+"", "PASS");
			}else{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "The SSN  field value should have to masked as'"+elementValue+"'", "The SSN field value is masked as '"+elementValue+"", "PASS");

			}
			
			System.out.println(elementValue);
			
			return status;
			
		}
		
		public boolean ExistingDriver(String DriverName) throws Exception{
			boolean status = false;
			XlsxReader sXL = XlsxReader.getInstance();
			
			for(int i = 2; i <= sXL.getRowCount("CreateAccount"); i++)
			{
				if(sXL.getCellData("CreateAccount", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
				{
					DriverName = sXL.getCellData("CreateAccount", "edtcommonFirstName", i)+" " +sXL.getCellData("CreateAccount", "edtcommonLastName", i);
					break;
				}
			}
			
			String XpathID="//a[contains(@id,'SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact')]//span[contains(text(),'"+DriverName+"')]";
			
			try
			{
				//ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("eleCommonAdd")).click();
				ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("eleExistingDriver")).click();
				ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("eleExistingDriver")).sendKeys(Keys.RIGHT);
				
				ManagerDriver.getInstance().getWebDriver().findElement(By.xpath(XpathID)).click();
				
				
				status = true;
			}
			catch(Exception e)
			{
				e.printStackTrace(); 
			}
			return status;
		}
		public boolean validateerrormessage(String value) throws Exception 
		{
			boolean status = false;
			String[] sValue = value.split(":::");
			logger.info("Verification started for  '"+sValue[1]+"'");
			// status=common.ElementExistOrNotTrue("Element exist", "XAct Pay Launch screen", "XAct Pay Launch screen dispalyed as expected", Common.o.getObject("eleXactPayLaunchTitle"));
			String Value = common.ReadElement(Common.o.getObject("elePCVerifyErrorMessages"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
			status = common.CompareStringResult("Validating the error message", sValue[1],Value);
			if(status=true){
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Error messages'"+ sValue[1] + "' and '"+value +"' should match ", "Error message is matching with  "+ sValue[1] + "' with '"+value +"'", "PASS");
				}else{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Error messages'"+ sValue[1] + "' and '"+value +"' should match '"+ sValue[1] + "' with '"+value +"'", "Error message is not matching with  "+ sValue[1] + "' with '"+value +"'", "FAIL");

				}
			return status;
		}
			


}