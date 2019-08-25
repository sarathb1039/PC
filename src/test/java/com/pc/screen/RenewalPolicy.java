/**
 * @ClassPurpose Access all the data's from RenewalPolicy sheet
 * @Scriptor Rathish Kuppusamy
 * @ReviewedBy
 * @ModifiedBy Rathish Kuppusamy
 * @LastDateModified 3/21/2017
 */
package com.pc.screen;

import org.apache.log4j.Logger;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.PCThreadCache;

public class RenewalPolicy {
	
	public static String sheetname = "RenewalPolicy";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
	
	public Boolean SCRRenewalPolicy() throws Exception{

			Boolean status = true;
			status = common.ClassComponent(sheetname, Common.o);
			if(!status)
			{
				status = false;
			}
			return status;
	}
	
	/**
	 * @function use to verify the results of Renewal Policy use case
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
			case "VERIFYMESSAGE":
				Value = common.GetTextFromTable(Common.o.getObject("eleRenewalHistoryTable"), 0, 3, sValue[1]);
				status = common.CompareStringResult(sValue[0], sValue[2], Value);
				break;
			case "VERIFYTOPIC":
				Value = common.ReadElement(Common.o.getObject("elePreRenewalTopic"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
				status = common.CompareStringResult(sValue[0], sValue[1], Value);
				break;
			case "VERIFYPOLICYSTATUS":
				Value = common.ReadElement(Common.o.getObject("eleCLAPolicyStatus"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
				status = common.CompareStringResult(sValue[0], sValue[1], Value);
				break;
			case "VERIFYTRANSACTIONSTATUS":
				Value = common.ReadElement(Common.o.getObject("eleTransactionStatus"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
				status = common.CompareStringResult(sValue[0], sValue[1], Value);
				break;
			case "VERIFYCONFIRMATION": 
			 	Value = common.ReadElement(Common.o.getObject("txtPopUpWindowMsg"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
				status = common.CompareStringResult(sValue[0], sValue[1], Value);
				break;
			case "VERIFYLABEL": 
				Value = common.ReadElement(Common.o.getObject("eleSummaryPreRenewalLabel"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
				status = common.CompareStringResult(sValue[0], sValue[1], Value);
				break;
			case "VERIFYQUOTEPRESENTED": 
				Value = common.ReadElement(Common.o.getObject("eleQuotePre"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
				status = common.CompareStringResult(sValue[0], sValue[1], Value);
				break;
			case "VERIFYQUOTESUCCESSFUL":
				Value = common.ReadElement(Common.o.getObject("eleQuoteSuc"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
				status = common.CompareStringResult(sValue[0], sValue[1], Value);
				break;
			case "VERIFYQUOTEDATE":
				logger.info(sValue[0]);
				Value = common.ReadElement(Common.o.getObject("eleQuoteDate"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
				status = common.CompareStringResult("QuotePresentedDate", SCRCommon.ReturnCurrentDate(), Value);
				break;	
			case "VERIFYTITLE":
				Value = common.ReadElement(Common.o.getObject("eleCLATitlePolicyInfo"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
				status = common.CompareStringResult(sValue[0], sValue[1], Value);
				break;	
			/*case "VERIFYEXPIRYFIELDS":
				logger.info(sValue[0]);
				Value = common.ReadElementFromListEditBox(Common.o.getObject("edtExpiringPremium"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
				status = common.CompareStringResult("Expiry Field - Expiring Premium", sValue[1], Value);
				Value = common.ReadElement(Common.o.getObject("lstRenewalType"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
				status = common.CompareStringResult("Expiry Field - Renewal Type", sValue[2], Value);
				status = common.ElementExistOrNotTrue("Previous PolicyNumber Label", "Label - Previous policy number should be displayed", "Previous Policy number dispalyed", Common.o.getObject("lblPreviousPolNo"));
				status = common.ElementExistOrNotTrue("Previous PolicyNumber Editbox field", "Editbox - Previous policy number should be displayed", "Previous Policy number textbox  dispalyed", Common.o.getObject("EdtPreviousPolNo"));
            	break; */
			case "VERIFYEXPIRYFIELDS":
                logger.info(sValue[0]);
                Value = common.ReadElementFromListEditBox(Common.o.getObject("edtExpiringPremium"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
                status = common.CompareStringResult("Expiry Field - Expiring Premium", sValue[1], Value);
                Value = common.ReadElement(Common.o.getObject("lstRenewalType"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
                status = common.CompareStringResult("Expiry Field - Renewal Type", sValue[2], Value);
                status = common.ElementExistOrNotTrue("Previous PolicyNumber Label", "Label - Previous policy number should be displayed", "Previous Policy number dispalyed", Common.o.getObject("lblPreviousPolNo"));
                status = common.ElementExistOrNotTrue("Previous PolicyNumber Editbox field", "Editbox - Previous policy number should be displayed", "Previous Policy number textbox  dispalyed", Common.o.getObject("EdtPreviousPolNo"));
                break;  
			}
			if(!status)
			{
				HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+sValue[0]+" case should PASS",""+sValue[0]+" case should not fail", "FAIL");
				status = true;
			}
		return status;
	}	
}