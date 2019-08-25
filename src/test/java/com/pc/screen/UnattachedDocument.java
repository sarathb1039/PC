/**
 * @ClassPurpose This Class used for the UnattachedDocument usecase
 * @Scriptor Rajeshwari
 * @ReviewedBy
 * @ModifiedBy
 * @LastDateModified 3/22/2017
 */
package com.pc.screen;

import org.apache.log4j.Logger;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;

public class UnattachedDocument {
	
	public static String sheetname = "UnattachedDocument";
	Common common = CommonManager.getInstance().getCommon();
	static Logger logger =Logger.getLogger(sheetname);
	
	/**
	 * @function Use to perform all the objects/elements/functions from the  ResearchUnattachedDocument sheet
	 * @return true/false
	 * @throws Exception
	 */
	public Boolean SCRUnattachedDocument() throws Exception
	{
			Boolean status = true;
			status = common.ClassComponent(sheetname,Common.o);

			if(!status)
			{
				status = false;
			}
			return status;
	}
	
	/**
	 * @function used to select the specific xml doc from the table
	 * @param xmlDocName
	 * @return true/false
	 * @throws Exception
	 */
	public boolean SelectDocument(String xmlDocName) throws Exception
	{
		boolean status=false;
		status=common.ActionOnTable(common.o.getObject("eleUnattachedDocTable"), 0, 0, xmlDocName, "a");
		status=common.ElementExistOrNotTrue("DocumentDetails", "Verify document details page is getting displayed", "Document details is getting displayed ", common.o.getObject("eleDocumentDtlsTitle"));
		
		return status;
		
	}

	/**
	 * @function used to verify the Testcase results
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
		    
			case "VERIFYALERTCANCEL":
				logger.info("Validating the '"+sValue[0]+"'");
				
				//handled for Email adn fax field
				String[] arrValues=sValue[1].split("->");
				ActValue=common.ReadElementFromListEditBox(Common.o.getObject(arrValues[0]),x);
				status=common.CompareStringResult(sValue[3], arrValues[1], ActValue);	
				
				ActValue=common.ReadElementFromListEditBox(Common.o.getObject("edtEmailOrFaxText"),x);
				status=common.CompareStringResult("Email/Fax Text validation", sValue[2], ActValue);	
				
				ActValue=common.ReadElementFromListEditBox(Common.o.getObject("lstDeliveryMethod"),x);
				status=common.CompareStringResult("Delivery Type validation", sValue[3], ActValue);	
				break;
			
			case "VERIFYALERTOK":
				logger.info("Validating the '"+sValue[0]+"'");
				status=common.ElementExistOrNotTrue("Document Detail", "verify whether the Document details screen is displayed after cliking on Ok in Alert Popup", "Document details screen is displayed after cliking on Ok in Alert Popup", Common.o.getObject(sValue[1]));
		
			case "VERIFYERRMSG":
				ActValue = common.ReadElement(Common.o.getObject("eleCommonZeroResults"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
				status = common.CompareStringResult(sValue[0], sValue[1], ActValue);
				break;	
			case "VERIFYCFMMSG":
				ActValue = common.ReadElement(Common.o.getObject("eleUnAttachedMessage"), Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
				status = common.CompareStringResult(sValue[0], sValue[1], ActValue);
				break;
			case "VERIFYEDITABLE":
				ActValue = common.ReadElementGetAttribute((Common.o.getObject("lstMissingInfoUnattached")), "value", Integer.valueOf(HTML.properties.getProperty("NORMALWAIT")));
				status = common.CompareStringResult(sValue[0], sValue[1], ActValue);
				break;
				}
		return status;
	}
}