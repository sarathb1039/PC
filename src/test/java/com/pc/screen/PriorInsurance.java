package com.pc.screen;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;

public class PriorInsurance {

	public static String sheetname = "PriorInsurance";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
	public Boolean SCRPriorInsurance() throws Exception{
		Boolean status = true;
		status = common.ClassComponent(sheetname, Common.o);
		if(!status)
		{
			status = false;
		}
		return status;
	}
	
	public boolean ValidateDatecontent(String value) throws Exception 
	{
		boolean status = false;

		String strDate;
		Date myDate;
		Calendar Date = Calendar.getInstance();
		//String[] sValue=value.split(":::");
		//SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		//System.out.println(sdf);
		
			 //this is  for validating BILL date when effective date less than 22 days

				strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
				 myDate = new Date(strDate);
				 strDate = new SimpleDateFormat("MM/dd/yyyy").format(myDate);
				 WebElement element1 = ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject(value));
					String txt =  element1.getText();
					//String txt =  element1.getAttribute("value");
					if (txt.contentEquals(strDate))
					{
						logger.info("System displayed '" +strDate + "'");  
						HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + strDate + "'","System displayed '" + strDate + "'", "PASS");
						//Status = true;
					}
					else
					{
						logger.info("System not displayed '" + strDate + "'");  
						HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "System should display '" + strDate + "'","System not displayed '" + strDate + "'", "FAIL");
						//Status = false;
					}
				
		
	
			return status;
		}
		
	public boolean verifyEffAndTenureDate() throws Exception 
	{
		boolean status = false;
		
		WebElement element1 = ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("eleEffDateOnInfoPane"));
		WebElement element2 = ManagerDriver.getInstance().getWebDriver().findElement(Common.o.getObject("edtAcgTenureDate"));
		String element1Value=element1.getText();
		System.out.println(element1Value);
		String element2Value=element2.getAttribute("value");
		System.out.println(element2Value);
		if(element1Value.contains(element2Value)){
			
			logger.info("Effective date and Tenure date are matched and displayed as'" +element2Value + "'");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Effective date and Acg Tenure date should be same ","Effective date and Acg Tenure date are matched", "PASS");
			status = true;
		}else{
			
			logger.info("Effective date and Tenure date are not  matched and displayed as'" +element2Value + "'");  
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Effective date and Acg Tenure date should be same ","Effective date and Acg Tenure date are NOT matched", "FAIL");
			status = false;
		}
        return status;    
	}
}