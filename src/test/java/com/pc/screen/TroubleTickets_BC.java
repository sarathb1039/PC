/**
 * @ClassPurpose This Class used for the Verify History
 * @Scriptor ACG Automation Team
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 06/06/2017
 */
package com.pc.screen;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import com.pc.constants.PCConstants;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;


public class TroubleTickets_BC {
	
	public static String sheetname = "TroubleTickets_BC";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	/**
	 * @function Use to perform all the objects/elements/functions from the Create Account excel sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRTroubleTickets_BC () throws Exception{

					Boolean status = true;
					status = common.ClassComponent(sheetname, Common.o);
					if(!status)
					{
						status = false;
					}
					return status;
	}
}