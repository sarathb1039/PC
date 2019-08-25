package com.pc.screen;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;

public class PolicyInfo {

	public static String sheetname = "PolicyInfo";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
	public Boolean SCRPolicyInfo() throws Exception{
		Boolean status = true;
		status = common.ClassComponent(sheetname, Common.o);
		if(!status)
		{
			status = false;
		}
		return status;
	}

	public boolean AddSecondNamedInsuredFromAddrBook(String name) throws Exception{
		boolean status = false ;
		String[] sName=name.split(" ");
		
		status=common.SafeAction(common.o.getObject("eleSecNamedInsuredButton"), "eleSecNamedInsuredButton", "ele");
		status=common.SafeAction(common.o.getObject("eleSecNamedInsured"), "eleSecNamedInsured", "ele");
		status=common.SafeAction(common.o.getObject("edtcommonFirstName"), sName[0], "edt");
		status=common.SafeAction(common.o.getObject("edtcommonLastName"), sName[1], "edt");
		status=common.SafeAction(common.o.getObject("eleCommonSearch"), "eleCommonSearch", "ele");
		status=common.SafeAction(common.o.getObject("eleCommonCreateNewContact"), "eleCommonCreateNewContact", "ele");
		return status;	
	}
	
	public boolean AddSecondNamedInsuredNewPerson(String name) throws Exception{
		XlsxReader sXL = XlsxReader.getInstance();
		boolean status = false ;
		String[] sValue=name.split(":::");
		
		SCRCommon scr=new SCRCommon();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		status=common.SafeAction(common.o.getObject("eleSNIIcon"), "eleSNIIcon", "ele");
		status=common.SafeAction(common.o.getObject("eleSecondaryNewPerson"), "eleSecondaryNewPerson", "ele");
		status=common.SafeAction(common.o.getObject("lstRelationshiptoInsured"), sValue[11], "lst");
		status=common.SafeAction(common.o.getObject("edtcommonFirstName"), sValue[0], "edt");
		status=common.SafeAction(common.o.getObject("edtcommonLastName"), sValue[1], "edt");
		status=common.SafeAction(common.o.getObject("edtcommonGender"), sValue[2], "edt");
		status=common.SafeAction(common.o.getObject("edtCommonDOB"), sValue[9], "edt");
		status=common.SafeAction(common.o.getObject("lstCommonMaritalStatus"), sValue[10], "lst");
		status=common.SafeAction(common.o.getObject("edtCommonHouseNumber"), sValue[3], "edt");
		status=common.SafeAction(common.o.getObject("edtCommonStreetName"), sValue[4], "edt");
		status=common.SafeAction(common.o.getObject("edtCommonCity"), sValue[5], "edt");
		status=common.SafeAction(common.o.getObject("lstCommonState"), sValue[6], "lst");
		status=common.SafeAction(common.o.getObject("lstCommonZipCode"), sValue[7], "lst");
		status=common.SafeAction(common.o.getObject("lstCommonAddressType"), sValue[8], "lst");
		status=common.SafeAction(common.o.getObject("edtDriverLicenseNumber"), sValue[12], "edt");
		status=common.SafeAction(common.o.getObject("lstDriverLicenseState"), sValue[13], "lst");
		status=scr.AddressStandardize();
		try
		{
			if(driver.findElement(common.o.getObject("btnCommonRetiredYes")).isDisplayed()==true && driver.findElement(common.o.getObject("btnCommonRetiredYes")).isEnabled()==true)
			{
				boolean flag=false;
				for(int i = 2; i <= sXL.getRowCount("PolicyInfo"); i++)
				{
					if(sXL.getCellData("PolicyInfo", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")) && sXL.getCellData("PolicyInfo", "btnCommonRetiredYes", i).contains("YES"))  
					{
						flag=true;
						status=common.SafeAction(common.o.getObject("btnCommonRetiredYes"), "btnCommonRetiredYes", "btn");
						break;
					}
				}
				if(flag==false)
				{
					status=common.SafeAction(common.o.getObject("btnCommonRetiredNo"), "btnCommonRetiredNo", "btn");
				}
				
				status=common.SafeAction(common.o.getObject("btncommonResOfDwellingNo"), "btncommonResOfDwellingNo", "btn");
			}
			
			if(driver.findElement(common.o.getObject("lstEducationLevel")).isDisplayed()!=true && driver.findElement(common.o.getObject("lstEducationLevel")).isEnabled()!=true)
			{
				System.out.println("Object not displayed.!");
			}
			else
			{
				status=common.SafeAction(common.o.getObject("lstEducationLevel"), "College Degree", "lst");	
			}
		}
		catch (Exception e) 
		{
			System.out.println(e.getStackTrace());
		}

		
		status=common.SafeAction(common.o.getObject("eleCommonOK"), "eleCommonOK", "ele");
		
		return status;	
	}

	
	
	public boolean AddSNIFromAddrBookforHome(String value) throws Exception{
		boolean status = false ;
		String[] sValue=value.split(":::");
		
	SCRCommon scr=new SCRCommon();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		status=common.SafeAction(common.o.getObject("eleSNIIcon"), "eleSNIIcon", "ele");
		status=common.SafeAction(common.o.getObject("eleScndNamedInsuFromAddrBook"), "eleScndNamedInsuFromAddrBook", "ele");
		status=common.SafeAction(common.o.getObject("edtcommonFirstName"), sValue[0], "edt");
		status=common.SafeAction(common.o.getObject("edtcommonLastName"), sValue[1], "edt");
		status=common.SafeAction(common.o.getObject("edtCommonCity"), sValue[5], "edt");
		status=common.SafeAction(common.o.getObject("lstCommonState"), sValue[6], "lst");
		status=common.SafeAction(common.o.getObject("lstCommonZipCode"), sValue[7], "lst");
		status=common.SafeAction(common.o.getObject("eleCommonSearch"), "eleCommonSearch", "ele");
		
		try {
			if(driver.findElement(common.o.getObject("eleCommonSelect")).isDisplayed()==true){
				
				status=common.SafeAction(common.o.getObject("eleCommonSelect"), "eleCommonSelect", "SCL");
				status=common.SafeAction(common.o.getObject("eleCommonSelect"), "eleCommonSelect", "DBL");
				status=common.SafeAction(common.o.getObject("eleSNIAdded"), "eleSNIAdded", "ele");
				status=common.SafeAction(common.o.getObject("lstRelationshiptoInsured"), sValue[11], "lst");
				status=common.SafeAction(common.o.getObject("edtDriverLicenseNumber"), sValue[12], "edt");
				status=common.SafeAction(common.o.getObject("lstDriverLicenseState"), sValue[13], "lst");
				status=scr.AddressStandardize();
				if(driver.findElement(common.o.getObject("btnCommonRetiredNo")).isDisplayed()==true)
				{
					status=common.SafeAction(common.o.getObject("btnCommonRetiredNo"), "btnCommonRetiredNo", "btn");
					status=common.SafeAction(common.o.getObject("btncommonResOfDwellingNo"), "btncommonResOfDwellingNo", "btn");
				}
				status=common.SafeAction(common.o.getObject("eleCommonOK"), "eleCommonOK", "ele");
			}
			
		} catch (Exception e) {
			status=common.SafeAction(common.o.getObject("eleCommonCreateNewContact"), "eleCommonCreateNewContact", "ele");
			status=common.SafeAction(common.o.getObject("edtcommonFirstName"), sValue[0], "edt");
			status=common.SafeAction(common.o.getObject("edtcommonLastName"), sValue[1], "edt");
			
			status=common.SafeAction(common.o.getObject("edtcommonGender"), sValue[2], "edt");
			status=common.SafeAction(common.o.getObject("edtCommonHouseNumber"), sValue[3], "edt");
			status=common.SafeAction(common.o.getObject("edtCommonStreetName"), sValue[4], "edt");
			
			status=common.SafeAction(common.o.getObject("edtCommonCity"), sValue[5], "edt");
			status=common.SafeAction(common.o.getObject("lstCommonState"), sValue[6], "lst");
			status=common.SafeAction(common.o.getObject("lstCommonZipCode"), sValue[7], "lst");
			
			status=common.SafeAction(common.o.getObject("lstCommonAddressType"), sValue[8], "lst");
			status=common.SafeAction(common.o.getObject("edtCommonDOB"), sValue[9], "edt");
			status=common.SafeAction(common.o.getObject("lstCommonMaritalStatus"), sValue[10], "lst");
			
			status=common.SafeAction(common.o.getObject("eleCommonUpdate"), "eleCommonUpdate", "ele");
			status=common.SafeAction(common.o.getObject("eleCommonSelect"), "eleCommonSelect", "ele");
			status=common.SafeAction(common.o.getObject("eleSNIAdded"), "eleSNIAdded", "ele");
			status=common.SafeAction(common.o.getObject("lstRelationshiptoInsured"), sValue[11], "lst");
			status=common.SafeAction(common.o.getObject("edtDriverLicenseNumber"), sValue[12], "edt");
			status=common.SafeAction(common.o.getObject("lstDriverLicenseState"), sValue[13], "lst");
			status=scr.AddressStandardize();
			status=common.SafeAction(common.o.getObject("eleCommonOK"), "eleCommonOK", "ele");
			status=common.SafeAction(common.o.getObject("btnCommonRetiredNo"), "btnCommonRetiredNo", "btn");
			status=common.SafeAction(common.o.getObject("btncommonResOfDwellingNo"), "btncommonResOfDwellingNo", "btn");
			status=common.SafeAction(common.o.getObject("eleCommonOK"), "eleCommonOK", "ele");
			
				
		}
		
		return status;
		
				
	}
	
	
	public boolean SelectValueFromSearchTable(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		int Rowindex = Integer.parseInt(sValue[0]);
		int Colindex = Integer.parseInt(sValue[1]);
		//String SendSpace = (sValue[2]);
		
         status = common.SelectEditBoxInTableBasedonRowColIndex(Common.o.getObject("eleSecInsuredSrhTbl"), Rowindex, Colindex);
		
		if(status==true)
		 {
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Select button Selected", "select button selected", "PASS");
			
		 }	
		 else
		 {
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Select button Selected", "Select button not Selected", "Fail");
			
		  }
	
		return status;
	}
	public boolean VerifyResults(String sFuncValue) throws Exception
	{
		boolean status = false;
		String[] sValue = sFuncValue.split(":::");
		logger.info("Verifying the Results");
		String Value = null;
		switch (sValue[0].toUpperCase())
		{				
		case "VERIFYPOLICYINFO":
			logger.info(sValue[0]);
			Value = common.ReadElementGetAttribute(Common.o.getObject("edtIndusCode"), "value", Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
			status = common.CompareStringResult(sValue[0], sValue[1], Value);
			Value = common.ReadElementGetAttribute(Common.o.getObject("edtNAICS"), "value", Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
			status = common.CompareStringResult(sValue[0], sValue[2], Value);
			Value = common.ReadElementGetAttribute(Common.o.getObject("edtMSI"), "value", Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
			status = common.CompareStringResult(sValue[0], sValue[3], Value);
			Value = common.ReadElementGetAttribute(Common.o.getObject("edtEBS"), "value", Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
			status = common.CompareStringResult(sValue[0], sValue[4], Value);
			Value = common.ReadElementGetAttribute(Common.o.getObject("lstOrganisationType"), "value", Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
			status = common.CompareStringResult(sValue[0], sValue[5], Value);
			Value = common.ReadElementGetAttribute(Common.o.getObject("edtFEIN"), "value", Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
			status = common.CompareStringResult(sValue[0], sValue[6], Value);
			Value = common.ReadElementGetAttribute(Common.o.getObject("lstProductType"), "value", Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
			status = common.CompareStringResult(sValue[0], sValue[7], Value);
			Value = common.ReadElementGetAttribute(Common.o.getObject("lstSubmissionSource"), "value", Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
			status = common.CompareStringResult(sValue[0], sValue[8], Value);
			Value = common.ReadElementGetAttribute(Common.o.getObject("lstSalesAgreementCode"), "value", Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
			status = common.CompareStringResult(sValue[0], sValue[9], Value);
			break;
		case "VERIFYPOLICYINFOSCREEN":
			Value = common.ReadElement(Common.o.getObject("elePolicyInfoAssert"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
			status = common.CompareStringResult(sValue[0], sValue[1], Value);
			break;
		case "VERIFYBORSTARTDATE":
			logger.info(sValue[0]);

			Value = common.ReadElement(Common.o.getObject("elePolBORStartDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
			status = common.CompareStringResult("PolicyBORStartDate", SCRCommon.ReturnCurrentDate(), Value);
			break;

		case "VERIFYBORENDDATE":
			logger.info(sValue[0]);
			Value = common.ReadElementGetAttribute(Common.o.getObject("elePolBOREndDate"),"value", Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
			status = common.CompareStringResult("PolicyBOREnd", sValue[1], Value);
			break;

		case "BORDATE":
			logger.info(sValue[0]);

			Value = common.ReadElement(Common.o.getObject("elePolBORStartDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
			status = common.CompareStringResult("PolicyBORStartDate", SCRCommon.ReturnCurrentDate(), Value);
			Value = common.ReadElement(Common.o.getObject("elePolBOREndDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
			status = common.CompareStringResult("PolicyBOREndDate", SCRCommon.ReturnSixtyDaysFromDate(), Value);
			break;
		case "VERIFYSORBORNOTSET":
			logger.info(sValue[0]);
			Value = common.ReadElement(Common.o.getObject("elePolBORStartDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
			if(Value.equals(SCRCommon.ReturnCurrentDate()))
			{
				status = false;
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Current Date should not match","Current Date is matching", "FAIL");
			}else{
				status = true;
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Current Date should not match","Current Date is not matching", "PASS");
			}

			Value = common.ReadElement(Common.o.getObject("elePolBOREndDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
			if(Value.equals(SCRCommon.ReturnSixtyDaysFromDate()))
			{
				status = false;
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Sixty Days from Current Date should not match","Sixty Days from Current Date is matching", "FAIL");
			}else{
				status = true;
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Sixty Days from Current Date should not match","Sixty Days from Current Date is not matching", "PASS");
			}

			break; 
		}
		if(!status)
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+sValue[0]+" case should PASS",""+sValue[0]+" case should not fail", "FAIL");
			status = true;
		}
		return status;
	}

	/**
	 * @function use to validate the error msg
	 * @return true/false
	 * @throws Exception
	 */

	public boolean VerifyErrorMsg() throws Exception
	{
		boolean status = driver.findElements(Common.o.getObject("elePIErrorMsgs")).size()!=0;
		String strErrorMsg = common.ReadElement(Common.o.getObject("elePIErrorMsgs"), Integer.valueOf(HTML.properties.getProperty("LONGWAIT")));
		if(status == true)
		{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify whether error message is displayed","Error message is displayed : '"+strErrorMsg+"'", "WARNING");
			status = true;
		}
		else{
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify whether error message is displayed or not","Error message is not displayed : '"+strErrorMsg+"'", "FAIL");
			status = false;			
		}
		return status;
	}

	public boolean DefaultEffectiveDate() throws Exception
	{
		boolean status = false;
		String sCurrentDate = SCRCommon.ReturnCurrentDate();
		status = common.SafeAction(Common.o.getObject("edtPolicyEffDate"), sCurrentDate, "edt");
		return status;
	}
	public boolean ValidateAddress(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		logger.info("Verification started for  '"+sValue[1]+"'");
		// status=common.ElementExistOrNotTrue("Element exist", "XAct Pay Launch screen", "XAct Pay Launch screen dispalyed as expected", Common.o.getObject("eleXactPayLaunchTitle"));
		String Value = common.ReadElement(Common.o.getObject("eleAddressServerError"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
		status = common.CompareStringResult("Address Standardization validation", sValue[1],Value);
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
	public boolean updatessn(String value) throws Exception 
	{
		boolean status = false;
		
		//ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("edtNamedInsuredSSN")).click();
		ManagerDriver.getInstance().getWebDriver().findElement(common.o.getObject("edtNamedInsuredSSN")).sendKeys(value);
		String Value = common.ReadElement(Common.o.getObject("edtNamedInsuredSSN"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
		status = common.CompareStringResult("Validating the ssn number", value,Value);
		return status;
	}
}
