/**
 * @ClassPurpose This Class used for the MaintainanceTransactions Screen
 * @Scriptor Sojan
 * @ReviewedBy
 * @ModifiedBy Sojan
 * @LastDateModified 3/24/2017
 */
package com.pc.screen;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.HTML;
import com.pc.utilities.PCThreadCache;

public class MaintainanceTransactions {
	
	public static String sheetname = "MaintainanceTransactions";
	static Logger logger =Logger.getLogger(sheetname);
	Common common = CommonManager.getInstance().getCommon();
		
		/**
		 * @function Use to perform all the objects/elements/functions from the MaintainanceTransactions excel sheet
		 * @return true/false
		 * @throws Exception
		 */
		public Boolean SCRMaintainanceTransactions() throws Exception
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
		 * @function - This function used to verify the Search result
		 * @param - value
		 * @return - true/false
		 * @throws Exception
		 */
		public boolean VerifyResults(String sFuncValue) throws Exception
		{
			boolean status = false;
			String[] sValue = sFuncValue.split(":::");
			logger.info("Verifying the Results");
			String Value = null;
				switch (sValue[0].toUpperCase())
				{	
					case "VERIFYMAINTAINANCETRANSASCTIONDETAILPAGE":
						logger.info(sValue[0]);
						status = common.ElementExistOrNotTrue(sValue[0], "System should display Maintainence Transasction Details Page to Capture", "System should display Maintainence Transasction Details Page to Capture the value", Common.o.getObject("CommonAssertForPage"));
						break;
					case "VERIFYCREATEMT":
						logger.info(sValue[0]);
						Value = common.ReadElement(Common.o.getObject("eleCLACancelPolStatusAssert"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						status = common.CompareStringResult("CheckingPolicyStatus", sValue[7], Value);
						Value = common.ReadElement(Common.o.getObject("lstMT_SourceOfSubmission"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						status = common.CompareStringResult("CheckSourceOfSubmission", sValue[1], Value);
						Value = common.ReadElement(Common.o.getObject("lstMT_CancelReason"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						status = common.CompareStringResult("CheckCancellationReason", sValue[2], Value);
//						Value = common.ReadElement(Common.o.getObject("txtMT_TransactionType"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
//						status = common.CompareStringResult("CheckTransactionType", sValue[3], Value);
						status = common.SafeAction(Common.o.getObject("eleMT_PaymentTab1"), "ele", "ele");
						Value = common.ReadElement(Common.o.getObject("edtMT_TranPremAmount"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						status = common.CompareStringResult("CheckTransactionPremAmount", sValue[4], Value);
//						Value = Common.ReadElement(Common.o.getObject("edtMT_GrossCommission"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
//						status = Common.CompareStringResult("CheckGrossCommission", sValue[5], Value);
//						Value = Common.ReadElement(Common.o.getObject("edtMT_RetailAgencyCommission"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
//						status = Common.CompareStringResult("CheckRetailAgency", sValue[6], Value);
						Value = common.ReadElement(Common.o.getObject("edtMT_GrossCommissionVerify"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						status = common.CompareStringResult("CheckGrossCommission", sValue[5], Value);
						Value = common.ReadElement(Common.o.getObject("edtMT_RetailAgencyCommissionVerify"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						status = common.CompareStringResult("CheckRetailAgency", sValue[6], Value);
						Value  = common.GetTextFromTable(Common.o.getObject("eleMT_Table"), 1, sValue[3]);
						status = common.CompareStringResult("CheckTransactionType", sValue[3], Value);
						break;
					case "VERIFYDELETE":
						logger.info(sValue[0]);
						status = common.ElementExistOrNotFalse(sValue[0], "The Transaction Should be delted", "The Transaction is deleted", Common.o.getObject("eleMT_DeleteVerify"));
						break;
					case "VERIFYTRANSACTION":
						logger.info(sValue[0]);
						Value = common.ReadElement(Common.o.getObject("eleMT_DeleteVerify"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						status = common.CompareStringResult("VerifyTransactionType", sValue[1], Value);
						break;
					case "VERIFYSUMMARYRESULT":
						logger.info(sValue[0]); 	
						Value = common.ReadElement(Common.o.getObject("eleMTGrossCommission"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						status = common.CompareStringResult("CheckGrossCommission", sValue[1], Value);
						Value = common.ReadElement(Common.o.getObject("eleMTRetailAgencyCommission"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						status = common.CompareStringResult("CheckRetailAgency", sValue[2], Value);
						break;
					case "VERIFYTYPELISTBOX":
						logger.info(sValue[0]);
						status = common.ElementExistOrNotTrue(sValue[0], "System should display the following values in the Type dropdown in the Policy Change Details section", "System should display the following values in the Type dropdown in the Policy Change Details section", Common.o.getObject("lstMT_Type"));
						break;
					case "VERIFYPAYMENTTAB":
						logger.info(sValue[0]);
						status = common.ElementExistOrNotTrue(sValue[0], "System should display the payment tab", "System should display the payment tab", Common.o.getObject("eleMT_PaymentTab"));
						break;
					case "VERIFYPOLICYCHANGESUMMARY":
						logger.info(sValue[0]); 	
						Value = common.ReadElement(Common.o.getObject("eleMTBearingEndorse"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						status = common.CompareStringResult("CheckBearingEndorsementCheck", sValue[1], Value);
						Value = common.ReadElement(Common.o.getObject("eleMTTotalCost"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						status = common.CompareStringResult("CheckTotalCostValue", sValue[2], Value);
						break;
					case "VERIFYCANCELEDPOLICY":
						logger.info(sValue[0]);
						status = common.ElementExistOrNotTrue(sValue[0], "System should cancel the policy", "System should display the policy as canceled", Common.o.getObject("eleMT_Canceled"));
						break;
					case "VERIFYTRANSACTIONLISTTYPES":
						logger.info(sValue[0]);
						Value = common.ReadElementGetAttribute(Common.o.getObject("lstMT_TransactionType"), "value", Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						status = common.CompareStringResult(sValue[0], sValue[1], Value);
						break;
					case "VERIFYDATEWARNINGMESSAGE":
						logger.info(sValue[0]);
//						status = false;
//						status = Common.ElementExistOrNotTrue(sValue[0], "System should cancel the policy", "System should display the policy as canceled", Common.o.getObject("eleMT_Canceled"));
						Value = common.ReadElement(Common.o.getObject("eleCommonErrorObject"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						status = common.CompareStringResult("VERIFYDATEWARNINGMESSAGE", sValue[1], Value);
						break;
					case "VIERFYCANCELSTATUS":
						logger.info(sValue[0]);
						Value = common.ReadElement(Common.o.getObject("eleMT_Canceled"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						status = common.CompareStringResult("VerifyCancelStaus", sValue[1], Value);
						Value = common.ReadElement(Common.o.getObject("eleCLAPIEffDate"), Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						status = common.CompareStringResult("VerifyCancelEffDate", SCRCommon.ReturnCurrentDate(), Value);
//						status = Common.ElementExistOrNotTrue(sValue[0], "System should cancel the policy", "System should display the policy as canceled", Common.o.getObject("eleMT_Canceled"));
						break;
				/*	case "VERIFYTRANSACTIONTYPE_TABLE":
						logger.info(sValue[0]);
						Value  = common.GetTextFromTable(Common.o.getObject("eleMT_Table"),0,1);
						status = common.CompareStringResult("VErifyTransaction type in Table", sValue[1], Value);
						break;*/
					case "VERIFYTRANSACTIONTYPE_TABLE":
                        logger.info(sValue[0]);
                        Value  = common.GetTextFromTable(Common.o.getObject("eleMT_Table"),0,1);
                        status = common.CompareStringResult("VErifyTransaction type in Table", sValue[1], Value);
                        break;
					case "EFFDT_LESS_POLEFFDT":
						String setDate = ReturnDateLessThanEffDate();
						status = common.SafeAction(Common.o.getObject("edtMT_TransactionEffective"), setDate, "edt");
						break;
					case "EFFDT_GRT_POLEXPDT":
						String setDate1 = ReturnOneYearFromDate_PlusOneDay();
						status = common.SafeAction(Common.o.getObject("edtMT_TransactionEffective"),setDate1,"edt");
						break;
					case "AUDITEFFDATE":
						status = common.SafeAction(Common.o.getObject("edtAuditEffDate"), SCRCommon.ReturnCurrentDate(), "edt");
						break;
					case "DT_RECEIEVED_GT_CUR_DT":
		                Calendar Date = Calendar.getInstance();  
		                Date.add(Calendar.DATE,1);
		                String strDate = (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
		                status = common.SafeAction(Common.o.getObject("edtMT_DateRecevied"), strDate, "edt");
						break;
					// below code to be added in verifyfunction
					case "VERIFYAUDITEXPDATE":
						Value = common.ReadElementGetAttribute(Common.o.getObject("edtAuditExpDate"), "value", Integer.valueOf(HTML.properties.getProperty("VERYLONGWAIT")));
						logger.info("exp date in system = "+Value);
						logger.info("One year date return from function = "+SCRCommon.ReturnOneYearFromDate());
						//status = common.CompareStringResult("Verify Audit Expiry Date", SCRCommon.ReturnOneYearFromDate(), Value);
						status = Value.contains(SCRCommon.ReturnOneYearFromDate());
						break;
				}
				if(!status)
				{
					HTML.fnInsertResult(PCThreadCache.getInstance().getProperty("testcasename"), PCThreadCache.getInstance().getProperty("methodName"), ""+sValue[0]+" case should PASS",""+sValue[0]+" case should not fail", "FAIL");
					status = true;
				}
			return status;
		}
		
		/**
		 * @function - This function used to get the Date for different scenario
		 * @param - value
		 * @return - true/false
		 * @throws Exception
		 */
		public boolean Date(String sFuncValue) throws Exception
		{
			boolean status = false;
				switch (sFuncValue.toUpperCase())
				{
					case "DATERECEIVED":
						status = common.SafeAction(Common.o.getObject("edtMT_DateRecevied"), SCRCommon.ReturnCurrentDate(), "edt");
						break;
					case "TRANSACTIONEFFECTIVE":
						status = common.SafeAction(Common.o.getObject("edtMT_TransactionEffective"), SCRCommon.ReturnCurrentDate(), "edt");
						break;
					case "AUDITEFFECTIVEDATE":
						status = common.SafeAction(Common.o.getObject("edtMTAuditEffDate"), SCRCommon.ReturnCurrentDate(), "edt");
						break;
					case "AUDITEXPIRATIONDATE":
						status = common.SafeAction(Common.o.getObject("edtAuditExpireDate"), SCRCommon.ReturnCurrentDate(), "edt");
						break;
					case "TRANSACTIONEFFECTIVE+60":
						status = common.SafeAction(Common.o.getObject("edtMT_TransactionEffective"), SCRCommon.ReturnSixtyDaysFromDate(), "edt");
						break;
					case "DATECOMPLETE":
						status = common.SafeAction(Common.o.getObject("edtMTCompleteDate"), SCRCommon.ReturnSixtyDaysFromDate(), "edt");
						break; 
				}
			return status;
		}
		
		/**
	     * @function This will use to take the current date
	     * @return Current Effective Date
	     */
	    /* public String returnCurrentDatePlusOne() 
	     {
	            String status = null;
	            try
	            {
//	                Date date = new Date();
	                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	                Calendar c = Calendar.getInstance();
	                c.add(Calendar.DATE, 1);
	                String strDate = sdf.format(c);
	                status = strDate;
	            }
	            catch(Exception e)
	            {
	                  e.printStackTrace();   
	                  logger.error("Thread ID = " + Thread.currentThread().getId() + " Error Occured =" +e.getMessage(), e);
	            }
	            return status;
	     }*/
	     
	     public String returnCurrentDatePlusOne() 
	     {
	            String returnDate = null;
	            try
	            {
	                Calendar Date = Calendar.getInstance();  
	                Date.add(Calendar.DATE,1);
	                String End_Date =  (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
	                returnDate = End_Date;
	            }
	            catch(Exception e)
	            {
	                  e.printStackTrace();  
	                  logger.error("Thread ID = " + Thread.currentThread().getId() + " Error Occured =" +e.getMessage(), e);
	            }
	            return returnDate;
	     }
		
		/**
		 * @function - This function used to select particular transaction as per the input
		 * @param - value
		 * @return - true/false
		 * @throws Exception
		 */
		public boolean SelectTransactions(String sFuncValue) throws Exception
		{
			boolean status = false;
			status = common.ActionOnTable(Common.o.getObject("eleMT_Table"), 1, 0, sFuncValue, "", "div");
			return status;
		}
		
		/**
		 * @function - This function used to select transaction value
		 * @param - value
		 * @return - true/false
		 * @throws Exception
		 */
		public boolean SelectTransactionsval(String sFuncValue) throws Exception
		{
			boolean status = false;
			status = common.ActionOnTable(Common.o.getObject("eleMT_Table"), 1, 3, sFuncValue, "div");
			return status;
		}
		
		/**
		 * @function - This function is to add date greater than policy expiry date
		 * @return expiry date + 1 day
		 */
		  public static String ReturnOneYearFromDate_PlusOneDay() 
	      {
	             String status = null;
	             try
	             {
	                 Calendar Date = Calendar.getInstance();  
	                 Date.add(Calendar.YEAR,1);
	                 Date.add(Calendar.DATE,1);
	                 String strDate =  (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
	                 status = strDate;
	             }
	             catch(Exception e)
	             {
	                   e.printStackTrace();              
	             }
	             return status;
	      }
		  /**
		   * This function return current day -1 day
		   * @return
		   */
		  public static String ReturnDateLessThanEffDate() 
	      {
	             String status = null;
	             try
	             {
	                 Calendar Date = Calendar.getInstance();  
	                 Date.add(Calendar.DATE,-1);
	                 String strDate =  (Date.get(Calendar.MONTH)+1)+"/"+(Date.get(Calendar.DATE)+"/"+(Date.get(Calendar.YEAR)));
	                 status = strDate;
	             }
	             catch(Exception e)
	             {
	                   e.printStackTrace();              
	             }
	             return status;
	      }


}