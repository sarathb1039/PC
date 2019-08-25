/**
 * @ClassPurpose This Class used for the DocumentInfo Screen
 * @Scriptor Kumar
 * @ReviewedBy
 * @ModifiedBy Sojan David
 * @LastDateModified 3/24/2017
 */
package com.pc.screen;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;

public class Participants {

	public static String sheetname = "Participants";
	Common common = CommonManager.getInstance().getCommon();
	static Logger logger =Logger.getLogger(sheetname);
	

	/**
	 * @function Use to perform all the objects/elements/functions from the Participant excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRParticipants() throws Exception{
		
		Boolean status = true;
		status = common.ClassComponent(sheetname, Common.o);
		if(!status)
		{
			return false;
		}
		return status;
	}
	/**
	 * @function Used to click the element in the table 
	 * @param sReadActionCol
	 * @param sReadString
	 * @return
	 * @throws Exception
	 */
	
	public boolean SelectParticipantTable(String sReadString) throws Exception
		   	{
		   		boolean status = false;
		   		status = common.ActionOnTable(Common.o.getObject("eleParticipantTable"), 1, 0, sReadString, "", "div");
		   		return status;
		   	} 

	/**
	 * @function use to assignment administration table
	 * @param sReadActionCol
	 * @param sReadString
	 * @return true/false
	 * @throws IOException 
	 * @throws Exception
	 */
	public boolean participantTable(String sFuncValue) throws IOException
	{
		boolean status = false;
		String sValue[] = sFuncValue.split(":::");
		int sRowCount = SCRCommon.TableRowCount(Common.o.getObject("eleParticipantTable"));   
		int selectUserID = sRowCount -1;
		String sFindSlectUserID = "SubmissionWizard:JobWizardToolsMenuWizardStepSet:ParticipantsScreen:JobRolesLV:"+selectUserID+":AssignedUser:UserBrowseMenuItem";
		By selectUser = By.id(sFindSlectUserID);
		try
		{
			switch (sValue[0].toUpperCase())
			{	
				case "NEW":
					status = common.SafeAction(selectUser, "ele", "ele");
					status=common.SafeAction(Common.o.getObject("edtEnterUserID"), sValue[1], "edt");
					status=common.SafeAction(Common.o.getObject("eleSearchQPB"), "ele", "ele");
					status=common.SafeAction(Common.o.getObject("eleSelectQPB"), "ele", "ele");
					status = SCRCommon.DataWebTable(Common.o.getObject("eleParticipantTable"), sRowCount, 2, "<none>", "single", "div");
		    		status = common.SafeAction(Common.o.getObject("lstParticipantAssigneeRole"), sValue[2], "lstAssigneeRole");
		    		status = common.SafeAction(Common.o.getObject("lstParticipantAssignedGroup"), sValue[3], "lstAssignedGroup");
		    		status = common.SafeAction(Common.o.getObject("lstRenewalReviewType"), sValue[4], "lstRenewalReviewType");
		    		break;
				case "UPDATE":
					break;
			}
    	}
		catch(Exception e)
		{
			if(status == false)
			{
				HTML.fnInsertResult(HTML.properties.getProperty("testcasename"), HTML.properties.getProperty("methodName"), "System should complete performing the add class","System not completed performing the add class", "FAIL");
			}
			e.printStackTrace();
		}
		return status;
	}
}
