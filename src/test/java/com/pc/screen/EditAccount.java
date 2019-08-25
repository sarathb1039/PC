/**
 * @ClassPurpose This Class used for the EditAccount Screen
 * @Scriptor Sojan David
 * @ReviewedBy
 * @ModifiedBy
 * @LastDateModified 3/17/2017
 */
package com.pc.screen;

import org.apache.log4j.Logger;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;

public class EditAccount {
	
		public static String sheetname = "EditAccount";
		Common common = CommonManager.getInstance().getCommon();
		static Logger logger =Logger.getLogger(sheetname);
		
		/**
		 * @function Use to perform all the objects/elements/functions from the EditAccount excel sheet
		 * @return true/false
		 * @throws Exception
		 */
		public Boolean SCREditAccount() throws Exception
		{	
			Boolean status = true;
			status = common.ClassComponent(sheetname, Common.o);
			if(!status)
			{
				status = false;
			}
			return true;
		}
}
