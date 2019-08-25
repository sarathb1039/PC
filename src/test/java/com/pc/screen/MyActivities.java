/**
 * @ClassPurpose This Class used for the Desktop usecase
 * @Scriptor Nishantni
 * @ReviewedBy
 * @ModifiedBy
 * @LastDateModified 3/22/2017
 */
package com.pc.screen;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;

public class MyActivities {
	
	public static String sheetname = "MyActivities";
	Common common = CommonManager.getInstance().getCommon();
	static Logger logger =Logger.getLogger(sheetname);
	
	/**
	 * @function Use to perform all the objects/elements/functions from the  DocumentInfo sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRMyActivities() throws Exception
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
	 * @function use to select the activity from the summary screen
	 * @param strValue
	 * @return true/false
	 * @throws IOException
	 */
    public boolean SelectActivity(String strValue) throws IOException
    {
           boolean status = false;
           status = common.SelectActivity(strValue);
           return status;
    }
    
	/**
     * @function This function is used to select data from table in My Activities screen
     * @param sReadString
     * @return true/false
     * @throws Exception
     */
	public boolean SelectActivityFromActivityTableTable(String sReadString) throws Exception
   	{
   		boolean status = false;
   		status = common.ActionOnTable(Common.o.getObject("eleMyActivitiesTbl"), 7, 0, sReadString, "", "div");
   		return status;
   	}

	/**
     * @function This function is used to select data from table in My Activities screen
     * @param sReadString
     * @return true/false
     * @throws Exception
     */
	
	 public boolean VerifyResults(String funValue) throws Exception
	   	{
	   		boolean status = false;
	   		String[] sValue = funValue.split(":::");
	   		String Value = null;
	   			switch (sValue[0].toUpperCase())
	   			{	
	   			case "VERIFYMYACTIVITYACTIVITYTODAY":
					Value = common.GetTextFromTable(Common.o.getObject("eleMyActivitiesTbl"), 7 , sValue[1]);
					status = common.CompareStringResult(sValue[0], sValue[1], Value);
					break;
	   			
	   			case "VERIFYMYACTIVITYSTATUS":
					Value = common.GetTextFromTable(Common.o.getObject("eleMyActivitiesTbl"), 7 , sValue[1]);
					status = common.CompareStringResult(sValue[0], sValue[1], Value);
					break;
					
					
   				}
   			if(!status)
   			{
   				HTML.fnInsertResult(HTML.properties.getProperty("testcasename"), HTML.properties.getProperty("methodName"), ""+sValue[0]+" case should PASS",""+sValue[0]+" case should not fail", "FAIL");
   				status = true;
   			}
   		return status;
   	}
	   			
}