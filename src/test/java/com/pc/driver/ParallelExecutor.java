package com.pc.driver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.LocalDriverFactory;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.RemoteDriverFactory;

public class ParallelExecutor implements Runnable {
	
	private String strRunMode = null;
	private String strTestCaseName = null;
	private String dataSheetName = null;
	private String region = null;
	static  Logger log =Logger.getLogger(ParallelExecutor.class);
	
	public ParallelExecutor(String strRunMode, String strTestCaseName, String dataSheetName, String region)
	{
		this.strRunMode = strRunMode;
		this.strTestCaseName = strTestCaseName;
		this.dataSheetName = dataSheetName;
		this.region = region;
	}
	
	@Override
	public void run()
	{
		log.info("Starting Thread Id =" +Thread.currentThread().getId()+"Executing testcase = "+strTestCaseName);
		WebDriver driver = null;
		String execMode = HTML.properties.getProperty("EXECUTIONMODE");
		Common common = new Common();
		
		if(execMode.equalsIgnoreCase(PCConstants.executionModeLocal)){
			driver = LocalDriverFactory.getInstance().createNewDriver();
		}else {
			driver = RemoteDriverFactory.getInstance().createNewDriver();
		}
	
		CommonManager.getInstance().setCommon(common);
        ManagerDriver.getInstance().setWebDriver(driver);
        log.info("Thread ID = " + Thread.currentThread().getId() + " common = "+ common);
        try {
			common.RunTest("RunModeNo",strTestCaseName,"",region);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error("Error while executing test case = "+strTestCaseName, e);
		}
        common = null; //Mark for garbage collection
		
	}
}
