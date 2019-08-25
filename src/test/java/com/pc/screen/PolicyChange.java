/**
 * @ClassPurpose This Class used for the Cancel Policy
 * @Scriptor Raj
 * @ReviewedBy
 * @ModifiedBy
 * @LastDateModified 3/23/2017
 */
package com.pc.screen;

import org.apache.log4j.Logger;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.PCThreadCache;

public class PolicyChange {
	
		public static String sheetname = "PolicyChange";
		static Logger logger =Logger.getLogger(sheetname);
		Common common = CommonManager.getInstance().getCommon();
		
		/**
		 * @function Use to perform all the action in the PolicyChange sheet
		 * @return true/false
		 * @throws Exception
		 */
		public Boolean SCRPolicyChange() throws Exception{
			
			Boolean status = true;
			status = common.ClassComponent(sheetname, Common.o);
			if(!status)
			{
				return false;
			}
			return status;
		}
		
		/**
		 * @function This function use to fill the current date of policy change screen
		 * @return true/false
		 * @throws Exception
		 */
		public boolean EffectiveDate() throws Exception
		{
			boolean status = false;
			status = common.SafeAction(Common.o.getObject("lstCPEffectiveDate"), SCRCommon.ReturnCurrentDate(), "lst");
			status = common.SafeAction(Common.o.getObject("lstCPDateReceived"), SCRCommon.ReturnCurrentDate(), "lst");
			return status;
		}
}