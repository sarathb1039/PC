/**
 * @ClassPurpose This Class used for the Documents Screen
 * @Scriptor Nishantini
 * @ReviewedBy 
 * @ModifiedBy Sojan David
 * @LastDateModified 4/17/2017
 */
package com.pc.screen;

import java.io.IOException;
import org.apache.log4j.Logger;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.PCThreadCache;

public class Documents {
	
	public static String sheetname = "Documents";
	Common common = CommonManager.getInstance().getCommon();
	static Logger logger =Logger.getLogger(sheetname);
	
	/**
	 * @function Use to perform all the objects/elements/functions from the  Documents sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRDocuments() throws Exception
	{
			Boolean status = true;
			status = common.ClassComponent(sheetname,Common.o);
			if(!status)
			{
				return status;
			}
			return status;
	}
	
	/**
	 * @function Use to select the document from the d
	 * @param sFuncValue
	 * @return true/false
	 * @throws Exception
	 */
	public boolean selectDocument(String sFuncValue) throws Exception
	{
		Boolean status = false;
		String sValue[] = sFuncValue.split(":::");
		try{
			switch (sValue[0].toUpperCase())
			{
				case "ACCOUNT":
					status = common.ActionOnTable(Common.o.getObject("eleDocumentTable"), 2, 2, sValue[1], "a");
					break;
				case "POLICY":
					status = common.ActionOnTable(Common.o.getObject("eleDocumentTable"), 2, 2, sValue[1], "a");
				break;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public boolean SelectButtoninDocuments(String value) throws Exception 
	{
		boolean status = false;
		String[] sValue = value.split(":::");
		int Rowindex = Integer.parseInt(sValue[0]);
		int Colindex = Integer.parseInt(sValue[1]);
		status = common.SelectEditBoxInTableBasedonRowColIndex(Common.o.getObject("eleDocumentSearchResult"), Rowindex, Colindex);
		if(status==true)
		 {
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verify if template is being Selected", "Template value selected", "PASS");
			
		 }	
		 else
		 {
			HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Template value not selected from table", "Template value not selected", "Fail");
			
		  }


		return status;
	}
	
	
	/**
     * @function verify the expected behaviour
     * @param funValue
     * @return true/false
     * @throws Exception
     */
     public boolean VerifyResults(String funValue) throws Exception
     {
                     boolean status = true;
                     String[] sValue = funValue.split(":::");
                     String wait = HTML.properties.getProperty("SHORTWAIT");
                     Integer x = Integer.valueOf(wait);
                     String ActValue;
                     switch (sValue[0].toUpperCase())
                     {
                         
                                     case "VERIFY_DOC_ACTIONS":
                                                     logger.info("Validating the '"+sValue[0]+"'");
                     
                                                     ActValue=common.ReadElement(Common.o.getObject("eleView_DocButton"),x);
                                                     status=common.CompareStringResult("document Actions - View", sValue[2], ActValue);                
                                                     ActValue=common.ReadElement(Common.o.getObject("eleCheckOut"),x);
                                                     status=common.CompareStringResult("document Actions - CheckOut", sValue[1], ActValue);          
                                                     break;
                                     case "VERIFY_DOC_ACTIONS_AFTER_CHKOUT":
                                                     logger.info("Validating the '"+sValue[0]+"'");
                                                     ActValue=common.ReadElement(Common.o.getObject("eleCheckIn"),x);
                                                     status=common.CompareStringResult("document Actions - CheckIn", sValue[1], ActValue);
                                                     ActValue=common.ReadElement(Common.o.getObject("eleView_DocButton"),x);
                                                     status=common.CompareStringResult("document Actions - View", sValue[2], ActValue);                
                                                     ActValue=common.ReadElement(Common.o.getObject("eleDownload_DocButton"),x);
                                                     status=common.CompareStringResult("document Actions - View", sValue[3], ActValue);                
                                                     
                                                     ActValue=common.ReadElement(Common.o.getObject("eleDiscardButton"),x);
                                                     status=common.CompareStringResult("document Actions - Discard", sValue[4], ActValue);
                                                     break;
                                                     
                                     case "VERIFY_DOC_ACTIONS_DISABLED":
                                                     logger.info("Validating the '"+sValue[0]+"'");
                                                     status=common.ElementDisplayed(common.o.getObject("eleCheckOut_Disabled"));
                                                     ActValue=common.ReadElement(Common.o.getObject("eleCheckOut_Disabled"),x);
                                                     status=common.CompareStringResult("document Actions - ChekOut Disabled", sValue[1], ActValue);
                                                     
                                                     /*status=common.ElementExist(common.o.getObject("eleCheckIn"));
                                                     status=common.ElementDisplayed(common.o.getObject("eleCheckIn_diabled"));
                                                     ActValue=common.ReadElement(Common.o.getObject("eleCheckIn_diabled"),x);
                                                     status=common.CompareStringResult("document Actions - CheckIn Disabled", sValue[1], ActValue);
                                                     
                                                     status=common.ElementDisplayed(common.o.getObject("eleDiscard_Disabled"));
                                                     ActValue=common.ReadElement(Common.o.getObject("eleDiscard_Disabled"),x);
                                                     status=common.CompareStringResult("document Actions - Discard Disabled", sValue[2], ActValue);*/
                                                     
                                     case "VERIFY_DOC_ACTIONS_DOESNT_EXIST":
                                                     logger.info("Validating the '"+sValue[0]+"'");
                                                     status=common.ElementDisplayed(Common.o.getObject("eleCheckOut"));
                                                     status=common.ElementExistOrNotFalse("CheckOut Button","Verify existence of check Out Action", "Button Check Out not avaialble", Common.o.getObject("eleCheckOut"));
                                                     status=common.ElementExistOrNotFalse("View Button","Verify existence of View Action", "Button Check In not avaialble", Common.o.getObject("eleCheckIn"));
                                                     break;
                                     case "VERIFY_FILE_FORMAT":
                                                     logger.info("Validating the '"+sValue[0]+"'");
                                                     String strFileType=common.ReadElementGetAttribute(Common.o.getObject("eleDocImg"), "src", x);
                                                     if (sValue[1].equalsIgnoreCase("WORD"))
                                                     {
                                                                     if(strFileType.contains("word.png"))
                                                                     {
                                                                                     HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verfith Format of document present", "Expected -" + sValue[1]+ "Actual -" +strFileType, "PASS");
                                                                                     status = true;
                                                                                     
                                                                     }
                                                                     else
                                                                     {
                                                                                     HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), "Verfith Format of document present", "Expected -" + sValue[1]+ "Actual -" +strFileType, "FAIL");
                                                                                     status = false;
                                                                                     
                                                                     }
                                                     }
                                                     break;
                                     case "Table":
                                                     status=common.ActionOnTable(Common.o.getObject("elePolDocumentTble"), 5, 4, "UnderwritingTools", "a");
                                                     break;
                                                     
                     }
                     return status;
     }
     
     /**
      * @function Method used to upload the file into UI
      * @return true/false
      */
     public static boolean uploadFile()
     {
             boolean status = true;
             try{
            	 Runtime.getRuntime().exec("C:\\Selenium\\AutoIT\\FileUpload.exe");
             }catch(IOException e)
             {
            	 e.printStackTrace();
             }
             return status;
     }


}