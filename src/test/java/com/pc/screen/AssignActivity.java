/**
 * @ClassPurpose Access all the data's from AssignActivity sheet
 * @Scriptor Rathish Kuppusamy
 * @ReviewedBy
 * @ModifiedBy Rathish Kuppusamy
 * @LastDateModified 3/21/2017
 */
package com.pc.screen;
import java.io.IOException;
import org.apache.log4j.Logger;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;

public class AssignActivity {
	
	public static String sheetname = "AssignActivity";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	public Boolean SCRAssignActivity() throws Exception
	{
		Boolean status = true;
		status = common.ClassComponent(sheetname, Common.o);
		if(!status)
		{
			return false;
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
	 * @function use to select the activity table from the summary screen
	 * @param strValue
	 * @return true/false
	 * @throws IOException
	 */
    public boolean SelectActivityFromTable(String sReadString) throws Exception
	{
		boolean status = false;
		status = common.ActionOnTable(Common.o.getObject("eleActivityTblBody"), 1, 0, sReadString, "Assign", "a");
		return status;
	}
	
    /**
     * @function This function is used to select data from table in My Groups screen
     * @param sReadString
     * @return true/false
     * @throws Exception
     */
   	public boolean SelectActivityFromGroupTable(String sReadString) throws Exception
   	{
   		boolean status = false;
   		status = common.ActionOnTable(Common.o.getObject("eleMyGroupsTbl"), 9, 0, sReadString, "", "div");
   		return status;
   	}

    /**
     * @function This function is used to select data from table in My Queues screen
     * @param sReadString
     * @return true/false
     * @throws Exception
     */
	public boolean SelectActivityFromQueueTable(String sReadString) throws Exception
   	{
   		boolean status = false;
   		status = common.ActionOnTable(Common.o.getObject("eleMyQueuesTbl"), 6, 0, sReadString, "", "div");
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
	 * @function This function is used to select data from table having current date
	 * @param sReadActionCol
	 * @param sReadString
	 * @param sTagname
	 * @return true/false
	 * @throws Exception
	 */
	public boolean TodayActivity(int sReadActionCol, String sReadString, String sTagname) throws Exception
   	{
   		boolean status = false;
   		status = common.ActionOnTable(Common.o.getObject("eleMyGroupsTbl"), 3, 9, SCRCommon.ReturnCurrentDate(), "", "a");
   		return status;
   	}
	
    /**
     * @function This function is used to verify the actual result with expected result
     * @param funValue
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
   				
				case "VERIFYASSIGNTO":
//					Value = Common.re.ReadElement(Common.o.getObject("eleAssignTo"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
					Value = common.ReadElementGetAttribute(Common.o.getObject("eleAssignTo"), "value", Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
					status = common.CompareExactStringResult("VerifyUser", sValue[1], Value);
					break;
				case "VERIFYACTIVITYASSIGNEDTO":
					Value = common.GetTextFromTable(Common.o.getObject("eleAccountSummary_Activitytbl"), 2, sValue[1]);
					status = common.CompareStringResult(sValue[0], sValue[1], Value);
					break;
				case "VERIFYRELATEDTO":
					Value = common.ReadElement(Common.o.getObject("eleRelatedTo"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
					status = common.CompareStringResult("VerifyUser", sValue[1], Value);
					break;
				case "VERIFYPRIORITY":
					Value = common.ReadElement(Common.o.getObject("elePriority"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
					status = common.CompareStringResult("VerifyUser", sValue[1], Value);
					break;
				case "VERIFYSECURITYLEVEL":
					Value = common.ReadElement(Common.o.getObject("eleSecurityLevel"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
					status = common.CompareStringResult("VerifyUser", sValue[1], Value);
					break;
				case "VERIFYEXCEPTIONREASON":
					Value = common.ReadElement(Common.o.getObject("elePartnerExceptionResason"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
					status = common.CompareStringResult("VerifyUser", sValue[1], Value);
					break;
				case "VERIFYACTIVITYTODAY":
					Value = common.GetTextFromTable(Common.o.getObject("eleMyGroupsTbl"), 8, 7, sValue[1]);
					status = common.CompareStringResult(sValue[0], sValue[2], Value);
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