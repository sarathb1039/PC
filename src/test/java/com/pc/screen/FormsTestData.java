/**
 * @ClassPurpose This Class used for the Desktop usecase
 * @Scriptor Rathish Kuppusamy
 * @ReviewedBy
 * @ModifiedBy
 * @LastDateModified 04/06/2017
 */
package com.pc.screen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

//import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import com.pc.utilities.Common;
import com.pc.utilities.CommonManager;
import com.pc.utilities.ManagerDriver;
import com.pc.utilities.PCThreadCache;
import com.pc.utilities.XlsxReader;


public class FormsTestData {

	public static String sheetname = "FormsTestData";
	public static String sheetname1 = "CreateAccount";
	//public static int count;
	Common common = CommonManager.getInstance().getCommon();
	static Logger logger =Logger.getLogger(sheetname);
	private WebDriver driver = ManagerDriver.getInstance().getWebDriver();
	public  XlsxReader sXL; // Excel Read Object

	public Boolean SCRFormsTestData() throws Exception
	{
		Boolean status = true;
		status = common.ClassComponent(sheetname,Common.o);

		if(!status)
		{
			status = false;
		}
		return status;
	}

	public boolean fetchdata() throws Exception
	{
		boolean status = true;
		int rowIndex =1;
		int Drivers_rowIndex =1;
		int Vehicles_rowIndex =1;
		int Covg_rowIndex =1;
		int UBI_rowIndex =1;
		
		rowIndex=rowIndex+1;
		String Q1PA=null;
		String Q2PA=null;
		String Q3PA=null;
		String Q4PA=null;
		String Q5PA=null;
		String Q1HO3=null;
		String Q2HO3=null;
		String Q3HO3=null;
		String Q4HO3=null;
		String Q5HO3=null;
		String Q6HO3=null;
		String Q7HO3=null;
		String Q8HO3=null;
		String Q9HO3=null;
		String Q10HO3=null;
		String Q11HO3=null;
		String Q12HO3=null;
		String Q13HO3=null;
		String Q14HO3=null;
		String Q15HO3=null;
		String Q16HO3=null;
		String Q17HO3=null;
		String Q18HO3=null;

		String PrimaryNamedInsured=null;
		String SecondaryNamedInsured=null;
		String AddressLine1=null;
		String AddressLine2=null;
		String OrganizationName=null;
		String PaymentPlan=null;
		String AAAMembershipNum=null;
		String EnrolledAAADrive=null;
		String Paperless=null;
		String PolicyTerm=null;
		String VIN=null;
		String TitleHolder=null;
		String Lienholder=null;
		String VehiclePurchasedDate=null;
		String AdditionalDiscounts=null;
		String CoverageOffered=null;
		String PriorScore=null;
		String CurrentScore=null;
		String AnnualMileage=null;
		String RatedScore=null;
		String EvaluationDate=null;
		
		String PNIDOB=null;
		String Premium=null;
		String QuoteNumber=null;
		String PolicyNumber=null;
		String PolicyEffectiveDate=null;
		String PolicyExpirationDate=null;
		String PrimaryNamedInsuredL11= null;
		String insuredNameAddressandProducerInfocombined=null;
		String SecondaryNamedInsuredL11=null;
		String AddressL11=null;
		String Vehicle=null;
		String ActiveDrivers=null;
		String Use=null;
		String BodilyInjury=null;
		String BodilyInjuryPremium=null;
		String PropertyDamage=null; 
		String PropertyDamagePremium=null;
		String PropertyDamageLiabilityCoveragePremium=null;
		String MedicalPayments=null;
		String MedicalPaymentsPremium=null;
		String UninsuredUnderinsuredMotoristsBodilyInjuryAddOn=null;
		String UninsuredUnderinsuredMotoristsBodilyInjuryAddOnPremium=null; 
		String UninsuredUnderinsuredMotoristsPropertyDamage=null; 
		String UninsuredUnderinsuredMotoristsPropertyDamagePremium=null; 
		String Comprehensive=null;
		String ComprehensivePremium=null;
		String Collision=null;
		String CollisionPremium=null;
		String CarRental=null;
		String CarRentalPremium=null;
		String EnhancedExteriorRepairOption=null; 
		String EnhancedExteriorRepairOptionPremium=null;
		String LoanLeaseGap=null; 
		String LoanLeaseGapPremium=null;
		String ExtraEquipment=null; 
		String ExtraEquipmentPremium=null;
		String EnhancedTotalLossReplacement=null; 
		String EnhancedTotalLossReplacementPremium=null;
		String SubtotalPremium=null;
		String TransportationNetworkCompany=null;
		String TotalPremiumPerVehicle=null;
		String TransportationNetworkCompanyPremium=null;
		String DiscountsAppliedforVehicle=null; 
		String DiscountsAppliedforVehiclePremium=null;
		String SixMonthEstimatedPremiumbyVehicle=null;
		String BroadenedOtherCar=null; 
		String BroadenedOtherCarPremium=null;
		String BroadenedOtherCarCovgPremium=null;
		String TotalPremiumandFees=null;
		String SF_DriverName=null;
		String PremierLevel=null;
		String ScoreFactors=null;
		String ScoreFactors1=null;
		String ScoreFactors_Description=null;
		String Plan=null;
		String PlanBenefits=null; 
		String LossSurcharge=null; 
		String ViolationSurcharge=null; 
		String SixMonthEstimatedTotalPolicyPremium=null;

		String ApplicantPhoneNum=null;
		String PolicyApplicationNumber=null;
		String DriverInfo=null;
		String DateOfBirth=null;
		String Gender=null;
		String MaritalStatus=null;
		String DriverLicenseNo=null;
		String DriverLicenseState=null;
		String RelatedtoNI=null;
		String ResiHousehold=null;
		String DriverStatus=null;
		String EmploymentStatus=null;
		String AAAInsuredSince=null;
		String EducationLevel=null;
		String Industry=null;
		String Occupation=null;
		String GoodStudent=null;
		String StudentAway=null;
		String DefensiveDriver=null;
		String NewYoungDriver=null;
		String VehicleL102App=null;
		String VINAPP=null;
		String VehicleUsageAPP=null;
		String ExistingDamage=null;
		String DescExistingDamage=null;
		String AltGarageLoc=null;
		String AltGarageAddress=null;
		String AdditionalDiscountsAPP=null;
		String VehicleL103App=null;
		String PolicyApplicationNumberL100=null;
		String EffectiveDateL100=null;
		String ExpirationDateL100=null;
		String ApplicantAddressL100=null;
		String ApplicantEmailL100=null;
		
		String AAAMemberSince=null;
		String PaymentPlanL100=null;
		String TotalPremiumL100=null;
		String InitialDownPayment=null;
		String UninsuredUnderinsuredMotoristsBodilyInjury=null;
		String UninsuredUnderinsuredMotoristsBodilyInjuryPremium=null; 
		//Policy Discounts Application
		String AAADriveDis=null;
		String AAAMembershipDis=null;
		String AdvPurchaseDis=null;
		String DefensiveDriverDis=null;
		String EFTDis=null;
		String GoodStudentDis=null;
		String MultipleProductDis=null;
		String NewYoungDis=null;
		String PaperlessDis=null;
		String PayInFullDis=null;
		String PremierDis=null;
		String PriorInsCarrierDis=null;
		String PriorInsStatus=null;
		String StudentAwayDis=null;


		//Home Fields
		String PropertyAddress=null;
		String YearBuiltL33=null;
		String CountyL31=null;
		String ResFireDep=null;
		String NumofRooms=null;
		String MilestoFireDep=null;
		String FeettoFireHyd=null;
		String ProtectionClass=null;
		String DistancetoCoast=null;
		String BarrierIslands=null;
		String DwellinginConstruction=null;
		String DwellingCompletionDate=null;
		String PrimaryHeating=null;
		String SecondaryHeating=null;
		String PoolorHotTub=null;
		String PoolSlide=null;
		String DivingBoard=null;
		String Trampoline=null;
		String ConstructionType=null;
		String SplinkerSystem=null;
		String FireAlarmType=null;
		String SmokeDetectors=null;
		String FireExtinguisher=null;
		String BurglarAlarmType=null;
		String DeadboltLocks=null;
		String WaterDetectionDevice=null;
		String AttachedPool=null;
		String LaminatedWindows=null;
		String StormShutters=null;
		String FortifiedHome=null;
		String OriginalOwner=null;
		String HomePurchaseDate=null;
		String ReplacementCost=null;
		String NumofStories=null;
		String SquareFootage=null;
		String NumofBathrooms=null;
		String ExteriorWallType=null;
		String GarageCapacity=null;
		String GarageStyle=null;
		String FirePlace=null;
		String BasementType=null;
		String RoofType=null;
		String RoofShape=null;
		String RoofReplacementCost=null;
		String RoofFullRepYear=null;
		String RoofAgeVerification=null;
		String HailResistantRoof=null;
		String SecWaterResistanceRoof=null;
		String NumofOccupants=null;
		String NumofFamilies=null;
		String ResidentSmoker=null;
		String NonPayLast12Months=null;
		String AdvPurchaseEligi=null;
		String EFTPlan=null;
		String ACGLifePolicy=null;
		String YrsatCurrAddress=null;
		String YrsClaimFree=null;
		String NIInfoL35=null;
		String BirthdateL35=null;
		String GenderL35=null;
		String MaritalStatusL35=null;
		String DriverLicenseL35=null;
		String StateLicenseL35=null;
		String RetiredL35=null;
		String AAAMemSinceL35=null;
		String PriorPropInsL35=null;
		String HOPriorCarrierL35=null;
		String HOPriorInsTypeL35=null;
		String ExpDateL35=null;
		String YrsPriorCarrierL35=null;
		String DateOfLossL35=null;
		String TypeOfLossL35=null;
		String AmountPaidL35=null;

		//Discount Application Home
		String HOAAAMembesrshipDis=null;
		String HOAdvPurchaseDis=null;
		String ClaimFreeDis=null;
		String HOEFTDis=null;
		String FortifiedHomeDis=null;
		String HailResRoofDis=null;
		String HomeBuyerDis=null;
		String HoOwnershipDis=null;
		String HOMultiProductDis=null;
		String HOPaperlessDis=null;
		String HOPayInFullDis=null;
		String HOPaymentDis=null;
		String HOPremierDis=null;
		String HOPriorInsDis=null;
		String RetiredHODis=null;
		String RoofAgeVeriDis=null;
		String SafetyDeviceDis=null;
		String SmokeFreeDis=null;
		String StormShuttersDis=null;

		String ResidencePremisesL11=null;
		String AllOtherPerils=null; 
		String NetAllOtherPerils=null;
		String WindstormAndHail=null;
		String TropicalCycloneDeductible=null;
		String WindstormHailDeductibleType=null;
		String WindstormHailDeductible=null;
		String FMedicalPaymentstoOthers=null;
		String EPersonalLiability=null;
		String ADwelling=null;
		String CPersonalProperty=null; 
		String BAdditionalStructures=null; 
		String AdditionalLivingExpenses=null;
		String PolicyPremiumAP=null;
		String ScheduledPersonalPropertyPremiumAP=null; 
		String TotalPolicyPremiumAP=null; 
		String PolicyPremiumUP=null;
		String ScheduledPersonalPropertyPremiumUP=null; 
		String TotalPolicyPremiumUP=null;
		String FormNum=null;
		String AgentName=null;
		String AgentPhoneNum=null;
		String AgentMail=null;

		String Sinkhole=null;
		String RoofMaterialsEndorsement=null;
		String ElectronicDataRestoration=null;
		String BuildingMaterialsTheftProtection=null;
		String ExpandedCoverageJewelryWatchesand=null;
		String ExpandedCoverageCameras=null;
		String ExpandedCoverageTheftofSilverware=null;
		String ExpandedCoverageMusicalInstruments=null;
		String GolfCarts=null;
		String ExpandedCoverageSportsEquipment=null;
		String IncreasedCoverageonBusinessProperty=null;
		String OptionalProtectionforMold=null;
		String WaterDamageSewer=null;
		String FireDepartment= null;
		String LossAssessments=null;
		String LimitedMatching=null;
		//String RoofMaterialsEndorsement=null;
		String CamerasandPhotographicEquipment=null;
		String FineArts=null;
		String CoinCollection=null;
		String Silverware=null;
		String Firearms=null;
		String BusinessPersonalProperty=null;
		String Jewelry=null;
		String SportsEquipment=null;
		String GolfersEquipment=null;
		String FishingEquipment=null;
		String StampCollection=null;
		String MusicalInstruments=null;
		String Collectibles=null;
		String Furs=null;
		String TotalScheduledPersonalPropertyLimit=null;


		String policyType=null;
		String formNo = null;
		String policyNo = null;
		XlsxReader sXL = XlsxReader.getInstance();
		int rowcount = sXL.getRowCount("Login");
		String[] Covg_Value;
		int countofvehicles = 0;
		

		
		
		//PrimaryNamedInsured
		for(int i = 2; i <= sXL.getRowCount("CreateAccount"); i++)
		{
			if(sXL.getCellData("CreateAccount", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				PrimaryNamedInsured = sXL.getCellData("CreateAccount", "edtcommonFirstName", i).toUpperCase(Locale.ENGLISH) +" " +  sXL.getCellData("CreateAccount", "edtcommonLastName", i).toUpperCase(Locale.ENGLISH)  ;

				break;
			}
		}
		
		//SecondaryNamedInsured
		for(int i = 2; i <= sXL.getRowCount("PolicyInfo"); i++)
		{
			if(sXL.getCellData("PolicyInfo", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("PolicyInfo", "funAddSecondNamedInsuredNewPerson", i).contains(":::"))
				{
					String[] SNI;
					SNI= sXL.getCellData("PolicyInfo", "funAddSecondNamedInsuredNewPerson", i).split(":::");
					SecondaryNamedInsured=SNI[0].trim().toUpperCase(Locale.ENGLISH)+" "+SNI[1].toUpperCase(Locale.ENGLISH);
					break;
				}
			}
		}
		
		//AddressLine1
		for(int i = 2; i <=sXL.getRowCount("CreateAccount"); i++)
		{
			if(sXL.getCellData("CreateAccount", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				AddressLine1 = sXL.getCellData("CreateAccount", "edtCommonHouseNumber", i);
				break;
			}
		}

		//AddressLine2
				for(int i = 2; i <=sXL.getRowCount("CreateAccount"); i++)
				{
					if(sXL.getCellData("CreateAccount", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
					{
						AddressLine2 =sXL.getCellData("CreateAccount", "edtCommonCity", i)+" "+sXL.getCellData("CreateAccount", "lstCommonState", i) +" " +  sXL.getCellData("CreateAccount", "lstCommonZipCode", i);
						break;
					}
				}

		// OrganizationName
		for (int i = 2; i <= sXL.getRowCount("CreateAccount"); i++) {
			if (sXL.getCellData("CreateAccount", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) {
				OrganizationName = sXL.getCellData("CreateAccount", "edtOrganizationName", i);
				break;
			}
		}

		//PolicyNumber
		for(int i = 2; i <=sXL.getRowCount("TestData"); i++)
		{
			if(sXL.getCellData("TestData", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				PolicyApplicationNumber = sXL.getCellData("TestData", "PolicyNumber", i);
				//PolicyApplicationNumber=PolicyNumber;
				break;
			}
		}

		//Premium    
		for (int i = 2; i <= sXL.getRowCount("TestData"); i++) {
			if (sXL.getCellData("TestData", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) {
				Premium = sXL.getCellData("TestData", "TotalPremium", i);
				TotalPremiumL100 = Premium;
				break;
			}
		}

		//PolicyEffectiveDate 
		for(int i = 2; i <= sXL.getRowCount("NewSubmission"); i++)
		{
			if(sXL.getCellData("NewSubmission", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				PolicyEffectiveDate = sXL.getCellData("NewSubmission", "edtEffDate", i) ;
				break;
			}
		}

		//PolicyExpirationDate   -Autopopulate Expiration Date in Policyinfo screen 
		for(int i = 2; i <=  sXL.getRowCount("NewSubmission"); i++)
		{
			if(sXL.getCellData("NewSubmission", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				PolicyExpirationDate = sXL.getCellData("NewSubmission", "edtEffDate", i) ;
				break;
			}
		}
		
		//Policy Term
		
		PolicyTerm=PolicyEffectiveDate +" - "+PolicyExpirationDate;
		
		//PaymentPlan
				for(int i = 2; i <=  sXL.getRowCount("AddPolicy"); i++)
				{
					if(sXL.getCellData("AddPolicy", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
					{
						PaymentPlan = sXL.getCellData("AddPolicy", "edtDirectBillBC", i) ;
						break;
					}
				}
						
		// AAAMembershipNum
		for (int i = 2; i <= sXL.getRowCount("PolicyInfo"); i++) {
			if (sXL.getCellData("PolicyInfo", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
			{
				if(!sXL.getCellData("PolicyInfo", "eleAccAAAMembershipNo", i).equals(""))
				{
					AAAMembershipNum = sXL.getCellData("PolicyInfo", "eleAccAAAMembershipNo", i);
				}
				else
				{
					AAAMembershipNum="";
				}
				
				break;
			}
		}

		// Broadened Other Car
		for (int i = 2; i <= sXL.getRowCount("Coverages"); i++) {
			if (sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) {
				if (sXL.getCellData("Coverages", "funSelectCoverage_BroadenedOtherCar", i)
						.contains("BroadenedOtherCar")) {
					String[] BroadenedOtherCarPremium1 = sXL
							.getCellData("Coverages", "funSelectCoverage_BroadenedOtherCar", i).split(":::");
					BroadenedOtherCarPremium = BroadenedOtherCarPremium1[1];

				} 
				else 
				{
					BroadenedOtherCarPremium = "Not Included";
				}
				break;
			}
		}
		
		//PrimaryNamedInsuredL11
		for(int i = 2; i <=sXL.getRowCount("CreateAccount"); i++)
		{
			if(sXL.getCellData("CreateAccount", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				PrimaryNamedInsuredL11 = sXL.getCellData("CreateAccount", "edtcommonFirstName", i) +" " +  sXL.getCellData("CreateAccount", "edtcommonLastName", i)  ;
				break;
			}
		}

		//SecondaryNamedInsuredL11
		for(int i = 2; i <=sXL.getRowCount("PolicyInfo"); i++)
		{
			if(sXL.getCellData("PolicyInfo", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{

				SecondaryNamedInsuredL11 = sXL.getCellData("PolicyInfo", "edtcommonFirstName", i).trim().toUpperCase(Locale.ENGLISH) +" " +  sXL.getCellData("PolicyInfo", "edtcommonLastName", i).trim().toUpperCase(Locale.ENGLISH);
				break;

			}
		}

		//AddressL11
		for(int i = 2; i <=sXL.getRowCount("CreateAccount"); i++)
		{
			if(sXL.getCellData("CreateAccount", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				AddressL11 = sXL.getCellData("CreateAccount", "edtCommonHouseNumber", i) +" " +  sXL.getCellData("CreateAccount", "edtCommonCity", i)+"\n"+"," +  sXL.getCellData("CreateAccount", "lstCommonState", i) +" " +  sXL.getCellData("CreateAccount", "lstCommonZipCode", i);
				ResidencePremisesL11 = AddressL11;
				break;
			}
		}


		//SixMonthEstimatedTotalPolicyPremium 
		for(int i = 2; i <=sXL.getRowCount("TestData"); i++)
		{
			if(sXL.getCellData("TestData", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				Premium = sXL.getCellData("TestData", "TotalPremium", i);
				break;
			}
		}

		//QuoteNumber
		for(int i = 2; i <=sXL.getRowCount("TestData"); i++)
		{
			if(sXL.getCellData("TestData", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				QuoteNumber = "QTE" +sXL.getCellData("TestData", "SubmissionNumber", i);
				break;
			}
		}

	//AgentName	

		for(int i = 2; i <= sXL.getRowCount("CreateAccount"); i++)
		{
			if(sXL.getCellData("CreateAccount", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				AgentName = sXL.getCellData("CreateAccount", "edtOrganizationName", i) ;
				break;
			}
		}
		//AgentMail
		for(int i = 2; i <= sXL.getRowCount("PolicyInfo"); i++)
		{
			if(sXL.getCellData("PolicyInfo", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				AgentMail = sXL.getCellData("PolicyInfo", "edtCommonEmail", i) ;
				break;
			}
		}			
		//ApplicantPhoneNum
		for(int i = 2; i <=  sXL.getRowCount("CreateAccount"); i++)
		{
			if(sXL.getCellData("CreateAccount", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				ApplicantPhoneNum = sXL.getCellData("CreateAccount", "edtMobileNumber", i) ;
				break;
			}
		}				
		//ApplicantEmailL100       
		for(int i = 2; i <=  sXL.getRowCount("PolicyInfo"); i++)
		{
			if(sXL.getCellData("PolicyInfo", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				ApplicantEmailL100 = sXL.getCellData("PolicyInfo", "edtCommonEmail", i) ;
				break;
			}
		}	
		//AAAMemberSince
		//PaymentPlanL100
		//Paperless
		for(int i = 2; i <=  sXL.getRowCount("PolicyInfo"); i++)
		{

			if(sXL.getCellData("PolicyInfo", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")));   
			{
				if(sXL.getCellData("PolicyInfo", "elePaperLessCommunicationNo", i).contains("YES"))
				{
					Paperless = "No";
					PaperlessDis = "No";
				}
				if(sXL.getCellData("PolicyInfo", "elePaperLessCommunicationYes", i).contains("YES"))
				{
					Paperless = "Yes";
					PaperlessDis = "Yes";
				}
				break;
			}	
		}
		
		int countofDrivers1=0;
		for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
		{
			if(sXL.getCellData("Drivers", "ID", i).equals(PCThreadCache.getInstance().getProperty("TCID")))
			{
				countofDrivers1++;
			}

		}
		
		for (int b = 1; b <= countofDrivers1; b++) {
			// EnrolledAAADrive
			for (int i = 2; i <= sXL.getRowCount("Drivers"); i++) {

				if (sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))
						&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b))) {
					if (sXL.getCellData("Drivers", "eleParticipateInAAADriveTrue", i).contains("YES")) {
						EnrolledAAADrive = "Yes";

					}
					if (sXL.getCellData("Drivers", "eleParticipateInAAADriveFalse", i).contains("YES")) {
						EnrolledAAADrive = "No";

					}
					break;
				}
			}
		}
		
		//UninsuredUnderinsuredMotoristsBodilyInjury
		for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
		{
			if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{

				String[] UninsuredUnderinsuredMotoristsBodilyInjury1 =sXL.getCellData("Coverages", "funEnterCoverageValue_UUMBI", i).split(":::");
				if(UninsuredUnderinsuredMotoristsBodilyInjury1.length > 0)
				{
					if(UninsuredUnderinsuredMotoristsBodilyInjury1[UninsuredUnderinsuredMotoristsBodilyInjury1.length-1]!="")
					{
						String[] temp;
						temp=UninsuredUnderinsuredMotoristsBodilyInjury1[UninsuredUnderinsuredMotoristsBodilyInjury1.length-1].replace("$", "").split("/");
						UninsuredUnderinsuredMotoristsBodilyInjury="$"+temp[temp.length-2]+" each person/"+"$"+temp[temp.length-1].replace("$", "")+" each accident";
					}
					else
					{
						UninsuredUnderinsuredMotoristsBodilyInjury="Not Included";
					}
					
					break;
				}
			}
		}
		
		//AAADriveDis
		for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
		{

			if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))   
			{
				if(sXL.getCellData("Drivers", "eleParticipateInAAADriveTrue", i).contains("YES"))
				{

					AAADriveDis="Yes";
				}
				if(sXL.getCellData("Drivers", "eleParticipateInAAADriveFalse", i).contains("YES"))
				{

					AAADriveDis="No";
				}
				break;
			}	
		}
		// GoodStudentDis
		for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
		{

			if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))   
			{
				if(sXL.getCellData("Drivers", "eleGoodStudentDiscYes", i).contains("YES"))
				{

					GoodStudentDis="Yes";
				}
				if(sXL.getCellData("Drivers", "eleGoodStudentDiscNo", i).contains("YES"))
				{

					GoodStudentDis="No";
				}
				if(!sXL.getCellData("Drivers", "eleGoodStudentDiscYes", i).contains("YES") && !sXL.getCellData("Drivers", "eleGoodStudentDiscNo", i).contains("YES"))
				{
					GoodStudentDis="No";
				}
				break;
			}	
		}
		// StudentAwayDis
		for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
		{

			if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))   
			{
				if(sXL.getCellData("Drivers", "ele100kmsWithoutCarYes", i).contains("YES"))
				{

					StudentAwayDis = "Yes";
				}
				if(sXL.getCellData("Drivers", "ele100kmsWithoutCarNo", i).contains("YES"))
				{

					StudentAwayDis = "No";
				}
				break;
			}	
		}
		// DefensiveDriverDis  
		for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
		{

			if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))   
			{
				if(sXL.getCellData("Drivers", "eleDefensiveDriverDiscountTrue", i).contains("YES"))
				{

					DefensiveDriverDis="Yes";
				}
				if(sXL.getCellData("Drivers", "eleDefensiveDriverDiscountFalse", i).contains("YES"))
				{

					DefensiveDriverDis="No";
				}
				break;
			}	
		}
		//PriorInsCarrierDis     	
		for(int i = 2; i <=  sXL.getRowCount("PolicyInfo"); i++)
		{

			if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")));   
			{
				if(!sXL.getCellData("Drivers", "edtPriorAutoIns", i).contains("Not Required"))
				{

					PriorInsCarrierDis = "Yes";
					PriorInsStatus="Yes";
				}
				if(sXL.getCellData("Drivers", "edtPriorAutoIns", i).contains("Not Required"))
				{

					PriorInsCarrierDis = "No";
					PriorInsStatus="No";
				}
			}	
		}
		//BodilyInjury
		for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
		{
			if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("Coverages", "funEnterCoverageValue_BodilyInjury", i).contains("Limit"))
				{
					String[] BI_temp;
					String temp;
					String[] BodilyInjury1 =sXL.getCellData("Coverages", "funEnterCoverageValue_BodilyInjury", i).split(":::");
					BI_temp=BodilyInjury1[BodilyInjury1.length-1].trim().split("/");
					BodilyInjury="$"+BI_temp[BI_temp.length-2].replace("$", "")+" each person/$"+BI_temp[BI_temp.length-1].replace("$", "")+" each accident";
					break;
				}
			}
		}

		//PropertyDamage
		for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
		{
			if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("Coverages", "funEnterCoverageValue_PropertyDamage", i).contains("Limit"))
				{
					String[] PropertyDamage1 =sXL.getCellData("Coverages", "funEnterCoverageValue_PropertyDamage", i).split(":::");
					PropertyDamage ="$"+PropertyDamage1[3].replace("$", "")+" each accident";
					break;
				}
			}
		}
		//MedicalPayments
		for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
		{
			if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("Coverages", "funEnterCoverageValue_MedPay", i).contains("Limit"))
				{
					String[] MedicalPayments1 =sXL.getCellData("Coverages", "funEnterCoverageValue_MedPay", i).split(":::");
					MedicalPayments ="$"+MedicalPayments1[MedicalPayments1.length-1].replace("$", "")+" each person";

					break;
				}
			}
		}
		/*				//UninsuredUnderinsuredMotoristsBodilyInjuryAddOn
						for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
						{
							if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
							{

									String[] UninsuredUnderinsuredMotoristsBodilyInjuryAddOn1 =sXL.getCellData("Coverages", "funEnterCoverageValue_UUMBIOption", i).split(":::");
									UninsuredUnderinsuredMotoristsBodilyInjuryAddOn =UninsuredUnderinsuredMotoristsBodilyInjuryAddOn1[3];
									break;

							}
						}*/
		//UninsuredUnderinsuredMotoristsPropertyDamage	
		for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
		{
			if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("Coverages", "funEnterCoverageValue_UUMPD", i).contains("Property Damage"))
				{
					String[] UninsuredUnderinsuredMotoristsPropertyDamage1 =sXL.getCellData("Coverages", "funEnterCoverageValue_UUMPD", i).split(":::");
					if(UninsuredUnderinsuredMotoristsPropertyDamage1.length >1)
					{
						UninsuredUnderinsuredMotoristsPropertyDamage ="$"+UninsuredUnderinsuredMotoristsPropertyDamage1[UninsuredUnderinsuredMotoristsPropertyDamage1.length-1].replace("$", "")+" each accident";
						break;
					}
					else
					{
						UninsuredUnderinsuredMotoristsPropertyDamage="Not Included";
						break;
					}
				}
			}
		}

		//UnderinsuredMotoristsPropertyDamage	 same as above need to change this function for UMPD
		/*for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
		{
			if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("Coverages", "funEnterCoverageValue_UMPD", i).contains("Property Damage"))
				{
					String[] UninsuredUnderinsuredMotoristsPropertyDamage1 =sXL.getCellData("Coverages", "funEnterCoverageValue_UMPD", i).split(":::");
					UninsuredUnderinsuredMotoristsPropertyDamage =UninsuredUnderinsuredMotoristsPropertyDamage1[3];
					break;
				}
			}
		}*/


		//Plan

		for(int i = 2; i <= sXL.getRowCount("PolicyInfo"); i++)
		{
			if(sXL.getCellData("PolicyInfo", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				Plan = sXL.getCellData("PolicyInfo", "lstPrefferedTier", i);
				break;
			}
		}


		//AllOtherPerils

		for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
		{
			if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("Coverages", "funEnterCoverageValue_SectionIdeductiblesAllotherperils", i).contains("All Other Perils"))
				{
					String[] AllOtherPerils1 =sXL.getCellData("Coverages", "funEnterCoverageValue_SectionIdeductiblesAllotherperils", i).split(":::");
					AllOtherPerils ="$"+AllOtherPerils1[AllOtherPerils1.length-1].replace("$", "");

					break;
				}
			}
		}
		/*			   //NetAllOtherPerils  Available only when plan is ultimate

								for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
										{
											if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
											{
												if(sXL.getCellData("Coverages", "funEnterCoverageValue_SectionIdeductiblesNetAllotherperils", i).contains("Other Perils"))
												{
													String[] NetAllOtherPerils1 =sXL.getCellData("Coverages", "funEnterCoverageValue_SectionIdeductiblesNetAllotherperils", i).split(":::");
													NetAllOtherPerils = NetAllOtherPerils1[3];

													break;
												}
											}
										}*/

		//TropicalCycloneDeductible

		for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
		{
			if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("Coverages", "funEnterCoverageValue_SectionIdeductiblesTropicalCyclone", i).contains("Tropical Cyclone"))
				{
					String[] TropicalCycloneDeductible1 =sXL.getCellData("Coverages", "funEnterCoverageValue_SectionIdeductiblesTropicalCyclone", i).split(":::");
					TropicalCycloneDeductible ="$"+TropicalCycloneDeductible1[TropicalCycloneDeductible1.length-1].replace("$", "");

					break;
				}
			}
		}
		//WindstormHailDeductibleType
		for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
		{
			if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("Coverages", "funEnterCoverageValue_SectionIdeductiblesWindstromandHaildeductiblestype", i).contains("Windstorm and Hail"))
				{
					String[] WindstormHailDeductibleType1 =sXL.getCellData("Coverages", "funEnterCoverageValue_SectionIdeductiblesWindstromandHaildeductiblestype", i).split(":::");
					WindstormHailDeductibleType ="$"+WindstormHailDeductibleType1[WindstormHailDeductibleType1.length].replace("$", "");

					break;
				}
			}
		}
		//WindstormHailDeductible
		for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
		{
			if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("Coverages", "funEnterCoverageValue_SectionIdeductiblesWindstromandHail", i).contains("Windstorm and Hail"))
				{
					String[] WindstormHailDeductible1 =sXL.getCellData("Coverages", "funEnterCoverageValue_SectionIdeductiblesWindstromandHail", i).split(":::");
					WindstormHailDeductible ="$"+WindstormHailDeductible1[WindstormHailDeductible1.length-1].replace("$", "");

					break;
				}
			}
		}
		//EPersonalLiability
		for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
		{
			if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("Coverages", "funEnterCoverageValue_EPersonal Liability", i).contains("Limit"))
				{
					String[] EPersonalLiability1 =sXL.getCellData("Coverages", "funEnterCoverageValue_EPersonal Liability", i).split(":::");
					EPersonalLiability = EPersonalLiability1[3];

					break;
				}
			}
		}
		//FMedicalPaymentstoOthers
		for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
		{
			if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("Coverages", "funEnterCoverageValue_FMedical Payments to Others", i).contains("Limit"))
				{
					String[] FMedicalPaymentstoOthers1 =sXL.getCellData("Coverages", "funEnterCoverageValue_FMedical Payments to Others", i).split(":::");
					FMedicalPaymentstoOthers = FMedicalPaymentstoOthers1[3];

					break;
				}
			}
		}

						/*				//UninsuredUnderinsuredMotoristsPropertyDamagePremium
						for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
						{
							if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
							{
								if(sXL.getCellData("Coverages", "funSelectCoverage_BroadenedOtherCar", i).contains("BroadenedOtherCar"))
								{
									String[] BroadenedOtherCarPremium1 =sXL.getCellData("Coverages", "funSelectCoverage_BroadenedOtherCar", i).split(":::");
									BroadenedOtherCarPremium = BroadenedOtherCarPremium1[1];

									break;

								}
								else
								{
									BroadenedOtherCarPremium = "Not Included";
								}
							}
						}	*/		
		//CPersonalProperty
		for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
		{
			if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("Coverages", "funEnterCoverageValue_CPersonalProperty", i).contains("Limit"))
				{
					String[] CPersonalProperty1 =sXL.getCellData("Coverages", "funEnterCoverageValue_CPersonalProperty", i).split(":::");
					CPersonalProperty = CPersonalProperty1[3];

					break;
				}
			}
		}
		//ADwelling
		for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
		{
			if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("Coverages", "funEnterCoverageValue_AdwellingLimit", i).contains("Limit"))
				{
					String[] ADwelling1 =sXL.getCellData("Coverages", "funEnterCoverageValue_AdwellingLimit", i).split(":::");
					ADwelling = ADwelling1[3];

					break;
				}
			}
		}
		//AdditionalLivingExpenses
		for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
		{
			if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("Coverages", "funEnterCoverageValue_Additionallivingexpense", i).contains("Limit"))
				{
					String[] AdditionalLivingExpenses1 =sXL.getCellData("Coverages", "funEnterCoverageValue_Additionallivingexpense", i).split(":::");
					AdditionalLivingExpenses = AdditionalLivingExpenses1[3];

					break;

				}
			}
		}
		//ExpandedCoverageCameras
		for(int i = 2; i <= sXL.getRowCount("OptionalCoverages"); i++)
		{
			if(sXL.getCellData("OptionalCoverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("OptionalCoverages", "funSelectOptCoverage_ECCameras", i).contains("Cameras"))
				{
					String[] ExpandedCoverageCameras1 =sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_ECCameras", i).split(":::");
					ExpandedCoverageCameras = ExpandedCoverageCameras1[3];
					break;
				}
			}
		}

		//ExpandedCoverageMusicalInstruments
		for(int i = 2; i <= sXL.getRowCount("OptionalCoverages"); i++)
		{
			if(sXL.getCellData("OptionalCoverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("OptionalCoverages", "funSelectOptCoverage_ECMusicalInstruments", i).contains("Musical Instruments"))
				{
					String[] ExpandedCoverageMusicalInstruments1 =sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_ECMusicalInstruments", i).split(":::");
					ExpandedCoverageMusicalInstruments = ExpandedCoverageMusicalInstruments1[3];
					break;
				}
			}
		}
		//ExpandedCoverageSportsEquipment
		for(int i = 2; i <= sXL.getRowCount("OptionalCoverages"); i++)
		{
			if(sXL.getCellData("OptionalCoverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("OptionalCoverages", "funSelectOptCoverage_ECSportsEquip", i).contains("Sports Equipment"))
				{
					String[] ExpandedCoverageSportsEquipment1 =sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_ECSportsEquip", i).split(":::");
					ExpandedCoverageSportsEquipment = ExpandedCoverageSportsEquipment1[3];
					break;
				}
			}
		}
		//ExpandedCoverageTheftofSilverware
		for(int i = 2; i <= sXL.getRowCount("OptionalCoverages"); i++)
		{
			if(sXL.getCellData("OptionalCoverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("OptionalCoverages", "funSelectOptCoverage_ECTheftOfSilverware", i).contains("Theft of Silverware"))
				{
					String[] ExpandedCoverageTheftofSilverware1 =sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_ECTheftOfSilverware", i).split(":::");
					ExpandedCoverageTheftofSilverware = ExpandedCoverageTheftofSilverware1[3];
					break;
				}
			}
		}

		//GolfCarts
		for(int i = 2; i <= sXL.getRowCount("OptionalCoverages"); i++)
		{
			if(sXL.getCellData("OptionalCoverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("OptionalCoverages", "funSelectOptCoverage_GolfCart", i).contains("Golf Cart"))
				{
					String[] GolfCarts1 =sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_GolfCart", i).split(":::");
					GolfCarts = GolfCarts1[3];
					break;
				}
			}
		}

		//OptionalProtectionforMold
		for(int i = 2; i <= sXL.getRowCount("OptionalCoverages"); i++)
		{
			if(sXL.getCellData("OptionalCoverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_OptionalProtectionformold", i).contains("Optional"))
				{	
					String[] OptionalProtectionforMold1 =sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_OptionalProtectionformold", i).split(":::");
					OptionalProtectionforMold = OptionalProtectionforMold1[3];
					break;
				}	
			}
		}
		//WaterDamageSewer
		for(int i = 2; i <= sXL.getRowCount("OptionalCoverages"); i++)
		{
			if(sXL.getCellData("OptionalCoverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_WaterDamageSewer", i).contains("Water"))
				{
					String[] WaterDamageSewer1 =sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_WaterDamageSewer", i).split(":::");
					WaterDamageSewer = WaterDamageSewer1[3];


					break;
				}	
			}
		}
		//FireDepartment
		for(int i = 2; i <= sXL.getRowCount("OptionalCoverages"); i++)
		{
			if(sXL.getCellData("OptionalCoverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_FireDepartment", i).contains("Fire"))
				{
					String[] FireDepartment1 =sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_FireDepartment", i).split(":::");
					FireDepartment = FireDepartment1[3];


					break;
				}
			}
		}
		//LossAssessments
		for(int i = 2; i <= sXL.getRowCount("OptionalCoverages"); i++)
		{
			if(sXL.getCellData("OptionalCoverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_LossAssessments", i).contains("Loss"))
				{
					String[] LossAssessments1 =sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_LossAssessments", i).split(":::");
					LossAssessments = LossAssessments1[3];


					break;
				}
			}
		}
		//LimitedMatching
		for(int i = 2; i <= sXL.getRowCount("OptionalCoverages"); i++)
		{
			if(sXL.getCellData("OptionalCoverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_LimitedMatching", i).contains("Limited"))
				{
					String[] LimitedMatching1 =sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_LimitedMatching", i).split(":::");
					LimitedMatching = LimitedMatching1[3];


					break;
				}
			}
		}
		//ExpandedCoverageJewelryWatchesand
		for(int i = 2; i <= sXL.getRowCount("OptionalCoverages"); i++)
		{
			if(sXL.getCellData("OptionalCoverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("OptionalCoverages", "funSelectOptCoverage_ECJewelryWatchesandFurs", i).contains("Jewelry"))
				{
					String[] ExpandedCoverageJewelryWatchesand1 =sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_ECJewelryWatchesandFurs", i).split(":::");
					ExpandedCoverageJewelryWatchesand = ExpandedCoverageJewelryWatchesand1[3];


					break;
				}
			}
		}
		//IncreasedCoverageonBusinessProperty
		for(int i = 2; i <= sXL.getRowCount("OptionalCoverages"); i++)
		{
			if(sXL.getCellData("OptionalCoverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				if(sXL.getCellData("OptionalCoverages", "funSelectOptCoverage_IncCovonBussinessProperty", i).contains("Business"))
				{
					String[] IncreasedCoverageonBusinessProperty1 =sXL.getCellData("OptionalCoverages", "funEnterCoverageValue_IncCovonBussinessProperty", i).split(":::");
					IncreasedCoverageonBusinessProperty = IncreasedCoverageonBusinessProperty1[3];


					break;
				}
			}
		}
		//CamerasandPhotographicEquipment
		/*for(int i = 2; i <= sXL.getRowCount("ScheduledPersonalProperty"); i++)
		{
			if(sXL.getCellData("ScheduledPersonalProperty", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{

				CamerasandPhotographicEquipment =sXL.getCellData("ScheduledPersonalProperty", "edtSPPShortDescription_Cam", i)+  sXL.getCellData("ScheduledPersonalProperty", "edtSPPValue_Cam", i);
				break;								
			}
		}
		//FineArts
		for(int i = 2; i <= sXL.getRowCount("ScheduledPersonalProperty"); i++)
		{
			if(sXL.getCellData("ScheduledPersonalProperty", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{

				FineArts =sXL.getCellData("ScheduledPersonalProperty", "edtSPPShortDescription_FineArts", i)+  sXL.getCellData("ScheduledPersonalProperty", "edtSPPValue_FineArts", i);
				break;								
			}
		}
		//CoinCollection
		for(int i = 2; i <= sXL.getRowCount("ScheduledPersonalProperty"); i++)
		{
			if(sXL.getCellData("ScheduledPersonalProperty", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{

				CoinCollection =sXL.getCellData("ScheduledPersonalProperty", "edtSPPShortDescription_Coin", i)+  sXL.getCellData("ScheduledPersonalProperty", "edtSPPValue_Coin", i);
				break;								
			}
		}
		//Silverware
		for(int i = 2; i <= sXL.getRowCount("ScheduledPersonalProperty"); i++)
		{
			if(sXL.getCellData("ScheduledPersonalProperty", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{

				Silverware =sXL.getCellData("ScheduledPersonalProperty", "edtSPPShortDescription_Silverware", i)+  sXL.getCellData("ScheduledPersonalProperty", "edtSPPValue_Silverware", i);
				break;								
			}
		}
		//Firearms
		for(int i = 2; i <= sXL.getRowCount("ScheduledPersonalProperty"); i++)
		{
			if(sXL.getCellData("ScheduledPersonalProperty", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{

				Firearms =sXL.getCellData("ScheduledPersonalProperty", "edtSPPShortDescription_Firearms", i)+  sXL.getCellData("ScheduledPersonalProperty", "edtSPPValue_Firearms", i);
				break;								
			}
		}		
		//BusinessPersonalProperty
		for(int i = 2; i <= sXL.getRowCount("ScheduledPersonalProperty"); i++)
		{
			if(sXL.getCellData("ScheduledPersonalProperty", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{

				BusinessPersonalProperty =sXL.getCellData("ScheduledPersonalProperty", "edtSPPShortDescription_BusinessPersonal", i)+  sXL.getCellData("ScheduledPersonalProperty", "edtSPPValue_BusinessPersonal", i);
				break;								
			}
		}
		//Jewelry
		for(int i = 2; i <= sXL.getRowCount("ScheduledPersonalProperty"); i++)
		{
			if(sXL.getCellData("ScheduledPersonalProperty", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{

				Jewelry =sXL.getCellData("ScheduledPersonalProperty", "edtSPPShortDescription_Jewelry", i)+  sXL.getCellData("ScheduledPersonalProperty", "edtSPPValue_Jewelry", i);
				break;								
			}
		}
		//SportsEquipment	
		for(int i = 2; i <= sXL.getRowCount("ScheduledPersonalProperty"); i++)
		{
			//							if(sXL.getCellData("ScheduledPersonalProperty", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			//							{

			SportsEquipment =sXL.getCellData("ScheduledPersonalProperty", "edtSPPShortDescription_Sports", i)+ sXL.getCellData("ScheduledPersonalProperty", "edtSPPValue_Sports", i);
			break;

		}
		//						}
		//GolfersEquipment	
		for(int i = 2; i <= sXL.getRowCount("ScheduledPersonalProperty"); i++)
		{
			if(sXL.getCellData("ScheduledPersonalProperty", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				//								if(sXL.getCellData("ScheduledPersonalProperty", "funSelectSPPCoverage_Sports", i).contains("Cameras"))
				//							{
				GolfersEquipment =sXL.getCellData("ScheduledPersonalProperty", "edtSPPShortDescription_Golfers", i)+ sXL.getCellData("ScheduledPersonalProperty", "edtSPPValue_Golfers", i);
				break;
			}
		}
		//						}
		//FishingEquipment	
		for(int i = 2; i <= sXL.getRowCount("ScheduledPersonalProperty"); i++)
		{
			if(sXL.getCellData("ScheduledPersonalProperty", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{
				//								if(sXL.getCellData("ScheduledPersonalProperty", "funSelectSPPCoverage_Sports", i).contains("Cameras"))
				//							{
				FishingEquipment =sXL.getCellData("ScheduledPersonalProperty", "edtSPPShortDescription_Fishing", i)+ sXL.getCellData("ScheduledPersonalProperty", "edtSPPValue_Fishing", i);
				break;
			}
		}
		//						}
		//StampCollection	
		for(int i = 2; i <= sXL.getRowCount("ScheduledPersonalProperty"); i++)
		{
			if(sXL.getCellData("ScheduledPersonalProperty", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				StampCollection =sXL.getCellData("ScheduledPersonalProperty", "edtSPPShortDescription_Stamp", i)+ sXL.getCellData("ScheduledPersonalProperty", "edtSPPValue_Stamp", i);
				break;
			}
		}
		//MusicalInstruments	
		for(int i = 2; i <= sXL.getRowCount("ScheduledPersonalProperty"); i++)
		{
			if(sXL.getCellData("ScheduledPersonalProperty", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				MusicalInstruments =sXL.getCellData("ScheduledPersonalProperty", "edtSPPShortDescription_Musical", i)+ sXL.getCellData("ScheduledPersonalProperty", "edtSPPValue_Musical", i);
				break;
			}
		}
		//Collectibles	
		for(int i = 2; i <= sXL.getRowCount("ScheduledPersonalProperty"); i++)
		{
			if(sXL.getCellData("ScheduledPersonalProperty", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				Collectibles =sXL.getCellData("ScheduledPersonalProperty", "edtSPPShortDescription_Collectibles", i)+ sXL.getCellData("ScheduledPersonalProperty", "edtSPPValue_Collectibles", i);
				break;
			}
		}
		//Furs	
		for(int i = 2; i <= sXL.getRowCount("ScheduledPersonalProperty"); i++)
		{
			if(sXL.getCellData("ScheduledPersonalProperty", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				Furs =sXL.getCellData("ScheduledPersonalProperty", "edtSPPShortDescription_Furs", i)+ sXL.getCellData("ScheduledPersonalProperty", "edtSPPValue_Furs", i);
				break;
			}
		}*/
//PropertyAddress
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{	
				if(sXL.getCellData("Dwelling", "eleDwellLocEditLocation", i).contains("YES"))
				{
				
				PropertyAddress =sXL.getCellData("Dwelling", "edtCommonHouseNumber", i) +" " +  sXL.getCellData("Dwelling", "edtCommonCity", i) +"," +  sXL.getCellData("Dwelling", "lstCommonState", i) +" " +  sXL.getCellData("Dwelling", "lstCommonZipCode", i);
				}
				else
				{
					PropertyAddress=AddressLine1+AddressLine2;
				}
				break;
			}
		}
//CountyL31
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							
				if(sXL.getCellData("Dwelling", "eleDwellLocEditLocation", i).contains("YES"))
				{
				CountyL31 =sXL.getCellData("Dwelling", "edtCommonCounty", i);
					break;
				}
/*				else
				{
					CountyL31= ;
				}*/
				}
			}
//YearBuiltL33		
//DwellinginConstruction
		
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				DwellinginConstruction =sXL.getCellData("Dwelling", "eleDwellingUnderConstructionNo", i);
					break;
				}
			}
//DwellingCompletionDate
				for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
				{
					if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
					{							

						DwellingCompletionDate =sXL.getCellData("Dwelling", "edtHousePurchaseYear", i);
							break;
						}
					}
//SplinkerSystem  
				for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
				{
					if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
					{							

						if(sXL.getCellData("Dwelling", "eleSprinklerSystemYes", i).contains("YES"))

						{

							SplinkerSystem = "Yes";

						}

						if(sXL.getCellData("Dwelling", "eleSprinklerSystemNo", i).contains("YES"))

						{

							SplinkerSystem = "No";

						}
					}
				}
				
//OriginalOwner				
				for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
				{
					if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
					{							

						if(sXL.getCellData("Dwelling", "eleIsNamedInsuredOrgOwnerYes", i).contains("YES"))

						{

							OriginalOwner = "Yes";
							
						}

						if(sXL.getCellData("Dwelling", "eleIsNamedInsuredOrgOwnerNo", i).contains("YES"))

						{

							OriginalOwner = "No";
							
						}
					}
				}
//ResFireDep
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				ResFireDep =sXL.getCellData("Dwelling", "lstRespondingFireDepartment", i);
					break;
				}
			}
//MilestoFireDep
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				MilestoFireDep =sXL.getCellData("Dwelling", "lstRiskDistfromResFireDpt", i);
					break;
				}
			}
//FeettoFireHyd
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				if(sXL.getCellData("Dwelling", "eledistanceTofireHydrantYes", i).contains("YES"))

				{

					FeettoFireHyd = "Yes";

				}

				if(sXL.getCellData("Dwelling", "eledistanceTofireHydrantNo", i).contains("YES"))

				{

					FeettoFireHyd = "No";

				}
			}
		}		
//NumofRooms						
	
//ProtectionClass
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				ProtectionClass =sXL.getCellData("Dwelling", "lstDwellingProtectionClass", i);
					break;
				}
			}

//DistancetoCoast
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				DistancetoCoast =sXL.getCellData("Dwelling", "lstDwellingDistancetoCoast", i);
					break;
				}
			}
//BarrierIslands
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				if(sXL.getCellData("Dwelling", "eleDwellingBarrierIslandsYes", i).contains("YES"))

				{

					BarrierIslands = "Yes";

				}

				if(sXL.getCellData("Dwelling", "eleDwellingBarrierIslandsNo", i).contains("YES"))

				{

					BarrierIslands = "No";

				}
				//BarrierIslands =sXL.getCellData("Dwelling", "eleDwellingBarrierIslandsYes", i);
					break;
				}
			}
		

//PrimaryHeating
		for(int i = 2; i <= sXL.getRowCount("DwellingConstruction"); i++)
		{
			if(sXL.getCellData("DwellingConstruction", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				PrimaryHeating =sXL.getCellData("DwellingConstruction", "lstPrimaryHeating", i);
					break;
				}
			}
		
//SecondaryHeating						
		for(int i = 2; i <= sXL.getRowCount("DwellingConstruction"); i++)
		{
			if(sXL.getCellData("DwellingConstruction", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				SecondaryHeating =sXL.getCellData("DwellingConstruction", "lstSecondaryHeating", i);
					break;
				}
			}
//PoolSlide
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				if(sXL.getCellData("Dwelling", "elePoolSlideYes", i).contains("YES"))

				{
					PoolSlide = "Yes";
				}

				if(sXL.getCellData("Dwelling", "elePoolSlideNo", i).contains("YES"))

				{
					PoolSlide = "No";
				}

					break;
				}
			}
//DivingBoard
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				if(sXL.getCellData("Dwelling", "eleDivingBoardYes", i).contains("YES"))

				{
					DivingBoard = "Yes";
				}

				if(sXL.getCellData("Dwelling", "eleDivingBoardNo", i).contains("YES"))

				{
					DivingBoard = "No";
				}
					break;
				}
			}
//Trampoline
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				if(sXL.getCellData("Dwelling", "eleDivingBoardYes", i).contains("YES"))

				{
					Trampoline = "Yes";
				}

				if(sXL.getCellData("Dwelling", "eleDivingBoardNo", i).contains("YES"))

				{
					Trampoline = "No";
				}
				
					break;
				}
			}
//ConstructionType						
		for(int i = 2; i <= sXL.getRowCount("DwellingConstruction"); i++)
		{
			if(sXL.getCellData("DwellingConstruction", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				ConstructionType =sXL.getCellData("DwellingConstruction", "lstConstructionType", i);
					break;
				}
			}
//FireAlarmType						
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				FireAlarmType =sXL.getCellData("Dwelling", "lstFireAlarm", i);
					break;
				}
			}
//SmokeDetectors				
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							
				
				if(sXL.getCellData("Dwelling", "eleSmokeDetectorsYes", i).contains("YES"))

				{
					SmokeDetectors = "Yes";
				}

				if(sXL.getCellData("Dwelling", "eleSmokeDetectorsNo", i).contains("YES"))

				{
					SmokeDetectors = "No";
				}
					break;
				}
			}
//FireExtinguisher						
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				if(sXL.getCellData("Dwelling", "eleFireExtinguisherYes", i).contains("YES"))

				{
					FireExtinguisher = "Yes";
				}

				if(sXL.getCellData("Dwelling", "eleFireExtinguisherNo", i).contains("YES"))

				{
					FireExtinguisher = "No";
				}
					break;
				}
			}
//BurglarAlarmType						
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				BurglarAlarmType =sXL.getCellData("Dwelling", "lstBurglarAlarm", i);
					break;
				}
			}
//DeadboltLocks
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							
				if(sXL.getCellData("Dwelling", "eleDeadBoltsYes", i).contains("YES"))

				{
					DeadboltLocks = "Yes";
				}

				if(sXL.getCellData("Dwelling", "eleDeadBoltsNo", i).contains("YES"))

				{
					DeadboltLocks = "No";
				}
					break;
				}
			}
//WaterDetectionDevice
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				WaterDetectionDevice =sXL.getCellData("Dwelling", "lstWaterDetectDevice", i);
					break;
				}
			}	
//AttachedPool
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				if(sXL.getCellData("Dwelling", "eleAttachedPoolEncloseYes", i).contains("YES"))

				{
					AttachedPool = "Yes";
				}

				if(sXL.getCellData("Dwelling", "eleAttachedPoolEncloseNo", i).contains("YES"))

				{
					AttachedPool = "No";
				}
				
					break;
				}
			}	
//LaminatedWindows						
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				if(sXL.getCellData("Dwelling", "eleLaminatedWindowsYes", i).contains("YES"))

				{
					LaminatedWindows = "Yes";
				}

				if(sXL.getCellData("Dwelling", "eleLaminatedWindowsNo", i).contains("YES"))

				{
					LaminatedWindows = "No";
				}
					break;
				}
			}	
//StormShutters						
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							
				if(sXL.getCellData("Dwelling", "eleStormShuttersYes", i).contains("YES"))

				{
					StormShutters = "Yes";
				}

				if(sXL.getCellData("Dwelling", "eleStormShuttersNo", i).contains("YES"))

				{
					StormShutters = "No";
				}
					break;
				}
			}	
//FortifiedHome
		for(int i = 2; i <= sXL.getRowCount("DwellingConstruction"); i++)
		{
			if(sXL.getCellData("DwellingConstruction", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							
				if(sXL.getCellData("DwellingConstruction", "eleFortifiedHomeYes", i).contains("YES"))

				{
					FortifiedHome = "Yes";
				}

				if(sXL.getCellData("DwellingConstruction", "eleFortifiedHomeNo", i).contains("YES"))

				{
					FortifiedHome = "No";
				}	
					
				}
			}	
//HomePurchaseDate
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				HomePurchaseDate =sXL.getCellData("Dwelling", "edtHousePurchaseYear", i);
					break;
				}
			}	
//ReplacementCost
		for(int i = 2; i <= sXL.getRowCount("DwellingConstruction"); i++)
		{
			if(sXL.getCellData("DwellingConstruction", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				ReplacementCost =sXL.getCellData("DwellingConstruction", "edtReplacementCostEstimate", i);
					break;
				}
			}	
		
//SquareFootage
		for(int i = 2; i <= sXL.getRowCount("DwellingConstruction"); i++)
		{
			if(sXL.getCellData("DwellingConstruction", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				SquareFootage =sXL.getCellData("DwellingConstruction", "edtApprxSquareFootage", i);
					break;
				}
			}	
		
//HailResistantRoof
		for(int i = 2; i <= sXL.getRowCount("DwellingConstruction"); i++)
		{
			if(sXL.getCellData("DwellingConstruction", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							
				if(sXL.getCellData("DwellingConstruction", "eleHailResistantYes", i).contains("YES"))

				{
					HailResistantRoof = "Yes";
				}

				if(sXL.getCellData("DwellingConstruction", "eleHailResistanteNo", i).contains("YES"))

				{
					HailResistantRoof = "No";
				}	
					break;
				}
			}
//SecWaterResistanceRoof
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							
				if(sXL.getCellData("Dwelling", "eleScndryWaterResYes", i).contains("YES"))

				{
					SecWaterResistanceRoof = "Yes";
				}

				if(sXL.getCellData("Dwelling", "eleScndryWaterResNo", i).contains("YES"))

				{
					SecWaterResistanceRoof = "No";
				}	
					break;
				}
			}
		
//NumofOccupants
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				NumofOccupants =sXL.getCellData("Dwelling", "lstNoOfOccupant", i);
					break;
				}
			}		
//NumofFamilies
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							

				NumofFamilies =sXL.getCellData("Dwelling", "lstNoOfFamilies", i);
					break;
				}
			}						
		
//ResidentSmoker
		for(int i = 2; i <= sXL.getRowCount("Dwelling"); i++)
		{
			if(sXL.getCellData("Dwelling", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							
				if(sXL.getCellData("Dwelling", "eleIsSmokerResidingInHouseholdYes", i).contains("YES"))

				{
					ResidentSmoker = "Yes";
				}

				if(sXL.getCellData("Dwelling", "eleIsSmokerResidingInHouseholdNo", i).contains("YES"))

				{
					ResidentSmoker = "No";
				}	
					break;
				}
			}						
//RetiredHODis
		for(int i = 2; i <= sXL.getRowCount("PolicyInfo"); i++)
		{
			if(sXL.getCellData("PolicyInfo", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))  
			{							
				if(sXL.getCellData("PolicyInfo", "btnCommonRetiredYes", i).contains("YES"))

				{
					RetiredHODis = "Yes";
				}

				if(sXL.getCellData("PolicyInfo", "btnCommonRetiredNo", i).contains("YES"))

				{
					RetiredHODis = "No";
				}	
					break;
				}
			}	
//Named Insured(s) Information
		//Count of Named Insureds
		int countofNI = 0; 

		for(int i = 2; i <=  sXL.getRowCount("PolicyInfo"); i++)
		{
			if(sXL.getCellData("PolicyInfo", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))
			{
				countofNI++;
			}

		}
		
		for (int c = 1; c<=countofNI; c++)
		{		
		//NIInfoL35
			for(int i = 2; i <= sXL.getRowCount("PolicyInfo"); i++)
			{


				if(sXL.getCellData("PolicyInfo", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("PolicyInfo", "Iteration", i).equals(Integer.toString(c)))   
				{
					if(sXL.getCellData("PolicyInfo", "funAddSNIFromAddrBookforHome", i)=="")	
					{
						NIInfoL35 = sXL.getCellData("PolicyInfo", "edtPolPrimDOB", i) ;
					}	

					else
					{
						String[] NIInfoL35Set= sXL.getCellData("PolicyInfo", "funAddSNIFromAddrBookforHome", i).split(":::") ;
						NIInfoL35 =NIInfoL35Set[9];
					}break;
				}

			}

		
		
		}
		//NI DOB
		for(int i = 2; i <=  sXL.getRowCount("PolicyInfo"); i++)
		{

			if(sXL.getCellData("PolicyInfo", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))   
			{

				PNIDOB = sXL.getCellData("PolicyInfo", "edtPolPrimDOB", i) ;
			}break;
		}

		String DriverLoop=null;
		for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
		{

			if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))   
			{
				DriverLoop = sXL.getCellData("Drivers", "funExistingDriver", i) ;
			}
		}


		Map<Integer,Object[]> data = new TreeMap<Integer,Object[]>();
		//String str= PdfTextExtractor.getTextFromPage(reader, pageIndex); //Extracting the content from a particular page.
		//data.put(1,new Object[] {"PrimaryNamedInsuredL7","SecondaryNamedInsuredL7","AddressL7", "Premium","QuoteNumber","PolicyNumber","PolicyApplicationNumber","PolicyEffectiveDate" ,"PolicyExpirationDate","PrimaryNamedInsuredL11","SecondaryNamedInsuredL11","AddressL11","ResidencePremisesL11","BodilyInjury","BodilyInjuryPremium","PropertyDamage","PropertyDamagePremium","MedicalPayments","MedicalPaymentsPremium","UninsuredUnderinsuredMotoristsBodilyInjuryAddOn","UninsuredUnderinsuredMotoristsBodilyInjuryAddOnPremium","UninsuredUnderinsuredMotoristsPropertyDamage","UninsuredUnderinsuredMotoristsPropertyDamagePremium","BroadenedOtherCar","BroadenedOtherCarPremium","Plan","PlanBenefits","LossSurcharge","ViolationSurcharge","SixMonthEstimatedTotalPolicyPremium","FormNum","AgentName","AgentPhoneNum","AgentMail","AllOtherPerils","NetAllOtherPerils","TropicalCycloneDeductible","WindstormAndHail","WindstormHailDeductibleType","WindstormHailDeductible","FMedicalPaymentstoOthers","EPersonalLiability","ADwelling","CPersonalProperty","BAdditionalStructures","AdditionalLivingExpenses","PolicyPremiumAP","ScheduledPersonalPropertyPremiumAP","TotalPolicyPremiumAP","PolicyPremiumUP","ScheduledPersonalPropertyPremiumUP","TotalPolicyPremiumUP","Sinkhole","RoofMaterialsEndorsement","ElectronicDataRestoration","BuildingMaterialsTheftProtection","ExpandedCoverageJewelryWatchesand","ExpandedCoverageCameras","ExpandedCoverageTheftofSilverware","ExpandedCoverageMusicalInstruments","GolfCarts","ExpandedCoverageSportsEquipment","IncreasedCoverageonBusinessProperty","OptionalProtectionforMold","WaterDamageSewer","FireDepartment","LossAssessments","LimitedMatching","CamerasandPhotographicEquipment","FineArts","CoinCollection","Silverware","Firearms","BusinessPersonalProperty","Jewelry","MusicalInstruments","Collectibles","Furs","SportsEquipment","GolfersEquipment","FishingEquipment","StampCollection","TotalScheduledPersonalPropertyLimit","PropertyAddress","CountyL31","ResFireDep","MilestoFireDep","FeettoFireHyd","ProtectionClass","DistancetoCoast","BarrierIslands","DwellinginConstruction","DwellingCompletionDate","PrimaryHeating","SecondaryHeating","PoolorHotTub","PoolSlide","DivingBoard","Trampoline","ConstructionType","SplinkerSystem","FireAlarmType","SmokeDetectors","FireExtinguisher","BurglarAlarmType","DeadboltLocks","WaterDetectionDevice","AttachedPool","LaminatedWindows","StormShutters","FortifiedHome","OriginalOwner","HomePurchaseDate","ReplacementCost","YearBuiltL33","NumofStories","SquareFootage","NumofRooms","NumofBathrooms","ExteriorWallType","GarageCapacity","GarageStyle","FirePlace","BasementType","RoofType","RoofShape","RoofReplacementCost","RoofFullRepYear","RoofAgeVerification","HailResistantRoof","SecWaterResistanceRoof","NumofOccupants","NumofFamilies","ResidentSmoker","NonPayLast12Months","AdvPurchaseEligi","EFTPlan","ACGLifePolicy","YrsatCurrAddress","YrsClaimFree","NIInfoL35","BirthdateL35","GenderL35","MaritalStatusL35","DriverLicenseL35","StateLicenseL35","RetiredL35","AAAMemSinceL35","PriorPropInsL35","HOPriorCarrierL35","HOPriorInsTypeL35","ExpDateL35","YrsPriorCarrierL35","DateOfLossL35","TypeOfLossL35","AmountPaidL35","PolicyApplicationNumberL100","AAADriveDis","AAAMembershipDis","AdvPurchaseDis","DefensiveDriverDis","EFTDis","GoodStudentDis","MultipleProductDis","NewYoungDis","PaperlessDis","PayInFullDis","PremierDis","PriorInsCarrierDis","PriorInsStatus","StudentAwayDis","FortifiedHomeDis","HailResRoofDis","HoOwnershipDis","HOPaperlessDis","SmokeFreeDis","StormShuttersDis","RetiredHODis","HOPriorInsDis"});                              
		//data.put(rowIndex, new Object[] {PrimaryNamedInsured,SecondaryNamedInsured,AddressLine1,AddressLine2,Premium,QuoteNumber,PolicyNumber,PolicyApplicationNumber,PolicyEffectiveDate,PolicyExpirationDate,PrimaryNamedInsuredL11,SecondaryNamedInsuredL11,AddressL11,ResidencePremisesL11,BodilyInjury,BodilyInjuryPremium,PropertyDamage,PropertyDamagePremium,MedicalPayments,MedicalPaymentsPremium,UninsuredUnderinsuredMotoristsBodilyInjuryAddOn, UninsuredUnderinsuredMotoristsBodilyInjuryAddOnPremium , UninsuredUnderinsuredMotoristsPropertyDamage , UninsuredUnderinsuredMotoristsPropertyDamagePremium ,BroadenedOtherCar , BroadenedOtherCarPremium , Plan , PlanBenefits , LossSurcharge , ViolationSurcharge , SixMonthEstimatedTotalPolicyPremium,FormNum,AgentName,AgentPhoneNum,AgentMail,AllOtherPerils,NetAllOtherPerils,TropicalCycloneDeductible,WindstormAndHail,WindstormHailDeductibleType,WindstormHailDeductible,FMedicalPaymentstoOthers,EPersonalLiability,ADwelling,CPersonalProperty,BAdditionalStructures,AdditionalLivingExpenses,PolicyPremiumAP,ScheduledPersonalPropertyPremiumAP,TotalPolicyPremiumAP,PolicyPremiumUP,ScheduledPersonalPropertyPremiumUP,TotalPolicyPremiumUP,Sinkhole,RoofMaterialsEndorsement,ElectronicDataRestoration,BuildingMaterialsTheftProtection,ExpandedCoverageJewelryWatchesand,ExpandedCoverageCameras,ExpandedCoverageTheftofSilverware,ExpandedCoverageMusicalInstruments,GolfCarts,ExpandedCoverageSportsEquipment,IncreasedCoverageonBusinessProperty,OptionalProtectionforMold,WaterDamageSewer,FireDepartment,LossAssessments,LimitedMatching,CamerasandPhotographicEquipment,FineArts,CoinCollection,Silverware,Firearms,BusinessPersonalProperty,Jewelry,MusicalInstruments,Collectibles,Furs,SportsEquipment,GolfersEquipment,FishingEquipment,StampCollection,TotalScheduledPersonalPropertyLimit,PropertyAddress,CountyL31,ResFireDep,MilestoFireDep,FeettoFireHyd,ProtectionClass,DistancetoCoast,BarrierIslands,DwellinginConstruction,DwellingCompletionDate,PrimaryHeating,SecondaryHeating,PoolorHotTub,PoolSlide,DivingBoard,Trampoline,ConstructionType,SplinkerSystem,FireAlarmType,SmokeDetectors,FireExtinguisher,BurglarAlarmType,DeadboltLocks,WaterDetectionDevice,AttachedPool,LaminatedWindows,StormShutters,FortifiedHome,OriginalOwner,HomePurchaseDate,ReplacementCost,YearBuiltL33,NumofStories,SquareFootage,NumofRooms,NumofBathrooms,ExteriorWallType,GarageCapacity,GarageStyle,FirePlace,BasementType,RoofType,RoofShape,RoofReplacementCost,RoofFullRepYear,RoofAgeVerification,HailResistantRoof,SecWaterResistanceRoof,NumofOccupants,NumofFamilies,ResidentSmoker,NonPayLast12Months,AdvPurchaseEligi,EFTPlan,ACGLifePolicy,YrsatCurrAddress,YrsClaimFree,NIInfoL35,BirthdateL35,GenderL35,MaritalStatusL35,DriverLicenseL35,StateLicenseL35,RetiredL35,AAAMemSinceL35,PriorPropInsL35,HOPriorCarrierL35,HOPriorInsTypeL35,ExpDateL35,YrsPriorCarrierL35,DateOfLossL35,TypeOfLossL35,AmountPaidL35,PolicyApplicationNumberL100,AAADriveDis,AAAMembershipDis,AdvPurchaseDis,DefensiveDriverDis,EFTDis,GoodStudentDis,MultipleProductDis,NewYoungDis,PaperlessDis,PayInFullDis,PremierDis,PriorInsCarrierDis,PriorInsStatus,StudentAwayDis,FortifiedHomeDis,HailResRoofDis,HoOwnershipDis,HOPaperlessDis,SmokeFreeDis,StormShuttersDis,RetiredHODis,HOPriorInsDis});
		
		data.put(1,new Object[] {"PrimaryNamedInsured","SecondaryNamedInsured","AddressLine1", "AddressLine2","InsuranceCompany","PolicyNumber","TotPremium","PolicyTerm","PaymentPlan","AAAMembershipNo","AAAMemberSince","AAADrive","Paperless","Broadened Other Car","Total Premium and Fees","Score Factors Driver Name","Premier Level","Score Factors","Score Factors1","Description of Score Factors"});
		data.put(rowIndex, new Object[] {PrimaryNamedInsured,SecondaryNamedInsured,AddressLine1,AddressLine2,OrganizationName,PolicyApplicationNumber,TotalPremiumL100,PolicyTerm,PaymentPlan,AAAMembershipNum,AAAMemberSince,EnrolledAAADrive,Paperless,BroadenedOtherCarPremium,TotalPremiumandFees,SF_DriverName,PremierLevel,ScoreFactors,ScoreFactors1,ScoreFactors_Description});
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sample sheet");

		Set<Integer> keyset = data.keySet();
		int rownum = 0;
		for (Integer key : keyset)
		{
			Row row = sheet.createRow(rownum++);
			Object [] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr)
			{
				Cell cell = row.createCell(cellnum++);
				if(obj instanceof Date) 
					cell.setCellValue((Date)obj);
				else if(obj instanceof Boolean)
					cell.setCellValue((Boolean)obj);
				else if(obj instanceof String)
					cell.setCellValue((String)obj);
				else if(obj instanceof Double)
					cell.setCellValue((Double)obj);

			}



		}

		//count of vehicles
		int countofvehicle = 0; 

		for(int i = 2; i <=  sXL.getRowCount("Vehicles"); i++)
		{
			if(sXL.getCellData("Vehicles", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))
			{
				countofvehicle++;
			}

		}
		//count of Drivers
		int countofDrivers=0;
		for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
		{
			if(sXL.getCellData("Drivers", "ID", i).equals(PCThreadCache.getInstance().getProperty("TCID")))
			{
				countofDrivers++;
			}

		}
		System.out.println(countofDrivers);
		XSSFSheet sheet1 = workbook.createSheet("Drivers");

		rowIndex = 1;
		Map<Integer,Object[]> data1 = new TreeMap<Integer,Object[]>();

		XSSFSheet sheet_UBI = workbook.createSheet("UBI Driver Information");
		Map<Integer,Object[]> data_UBI = new TreeMap<Integer,Object[]>();
		
		//DriverInfo
		for (int b = 1; b<=countofDrivers; b++)
		{
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).equals(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{

					DriverInfo = sXL.getCellData("Drivers", "funExistingDriver", i).trim().toUpperCase(Locale.ENGLISH) ;
					if(DriverInfo == "")
					{
						DriverInfo = sXL.getCellData("Drivers", "edtcommonFirstName", i).trim().toUpperCase(Locale.ENGLISH) +" "+sXL.getCellData("Drivers", "edtcommonLastName", i).trim().toUpperCase(Locale.ENGLISH);
						//DateOfBirth
						DateOfBirth = sXL.getCellData("Drivers", "edtCommonDOB", i);
					}
					else 

					{
					
						for(int s = 2; i <=  sXL.getRowCount("PolicyInfo"); s++)
						{
							if(sXL.getCellData("PolicyInfo", "ID", s).contains(PCThreadCache.getInstance().getProperty("TCID")))   
							{
								DateOfBirth = sXL.getCellData("PolicyInfo", "edtPolPrimDOB", s);
								break;
							}
						}
					}
					break;
				}

			}//end
			
			
			//Gender 
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{

					Gender = sXL.getCellData("Drivers", "edtcommonGender", i) ;
					break;
				}	
			}		
			//MaritalStatus
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{

					MaritalStatus = sXL.getCellData("Drivers", "lstCommonMaritalStatus", i) ;
					break;
				}	
			}		
			//DriverLicenseNo
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{

					DriverLicenseNo = sXL.getCellData("Drivers", "edtDriverLicenseNumber", i) ;
					break;
				}	
			}	
			//DriverLicenseState
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{

					DriverLicenseState = sXL.getCellData("Drivers", "lstDriverLicenseState", i) ;
					break;
				}	
			}	
			//RelatedtoNI
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{
					if(sXL.getCellData("Drivers", "lstRelationshiptoInsured", i).contains("Unrelated Driver"))	
					{
						RelatedtoNI = "No" ;
					}
					if(sXL.getCellData("Drivers", "lstRelationshiptoInsured", i).contains("Spouse")||sXL.getCellData("Drivers", "lstRelationshiptoInsured", i).contains("Other related driver"))
					{
						RelatedtoNI = "Yes";
					}
					break;
				}	
			}			
			//ResiHousehold		
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{
					if(sXL.getCellData("Drivers", "eleResidentofHouseholdYes", i).contains("YES"))
					{
						ResiHousehold = "Yes";
					}
					if(sXL.getCellData("Drivers", "eleResidentofHouseholdNo", i).contains("YES"))
					{
						ResiHousehold = "No";
					}
					break;
				}	
			}			
			//DriverStatus  
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{

					DriverStatus = sXL.getCellData("Drivers", "edtDriverStatus", i) ;
					break;
				}	
			}			
			//EmploymentStatus		
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{

					EmploymentStatus = sXL.getCellData("Drivers", "lstDriverEmploymentStatus", i) ;
					break;
				}	
			}			
			//EducationLevel
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{

					EducationLevel = sXL.getCellData("Drivers", "lstDriverEducationLevel", i) ;
					break;
				}	
			}			
			//Industry	
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{

					Industry = sXL.getCellData("Drivers", "lstDriverIndustry", i) ;
					break;
				}	
			}			
			//Occupation
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{

					Occupation = sXL.getCellData("Drivers", "lstDriverIndustry", i) ;
					break;
				}	
			}				
			//EnrolledAAADrive
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{
					if(sXL.getCellData("Drivers", "eleParticipateInAAADriveTrue", i).contains("YES"))
					{
						EnrolledAAADrive = "Yes";

					}
					if(sXL.getCellData("Drivers", "eleParticipateInAAADriveFalse", i).contains("YES"))
					{
						EnrolledAAADrive = "No";

					}
					break;
				}	
			}			
			// GoodStudent
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{
					if(sXL.getCellData("Drivers", "eleGoodStudentDiscYes", i).contains("YES"))
					{
						GoodStudent = "Yes";

					}
					if(sXL.getCellData("Drivers", "eleGoodStudentDiscNo", i).contains("YES"))
					{
						GoodStudent = "No";

					}
					break;
				}	
			}	
			// StudentAway
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{
					if(sXL.getCellData("Drivers", "ele100kmsWithoutCarYes", i).contains("YES"))
					{
						StudentAway = "Yes";

					}
					if(sXL.getCellData("Drivers", "ele100kmsWithoutCarNo", i).contains("YES"))
					{
						StudentAway = "No";

					}
					break;
				}	
			}
			//VehicleL102App
			/*for(int i = 2; i <=  sXL.getRowCount("Vehicles"); i++)
			{

				if(sXL.getCellData("Vehicles", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{

					VehicleL102App = sXL.getCellData("Vehicles", "lstVehicleYear", i) + " "+ sXL.getCellData("Vehicles", "lstVehicleMake", i) + " "+ sXL.getCellData("Vehicles", "lstVehicleModel", i);
					VehicleL103App=VehicleL102App;
					break;
				}	
			}*/
			//VINAPP
			for(int i = 2; i <=  sXL.getRowCount("Vehicles"); i++)
			{

				if(sXL.getCellData("Vehicles", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{

					VINAPP = sXL.getCellData("Vehicles", "edtVINNumber", i) ;
					break;
				}	
			}

			//Prior Score
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{

					PriorScore = sXL.getCellData("Drivers", "edtPriorScore", i) ;
					break;
				}	
			}
			
			//Current Score
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{

					CurrentScore = sXL.getCellData("Drivers", "edtCurrentScore", i) ;
					break;
				}	
			}
			
			//Annual Mileage
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{

					AnnualMileage = sXL.getCellData("Drivers", "edtAnnualMileage", i) ;
					break;
				}	
			}
			
			// DefensiveDriver  
			for(int i = 2; i <=  sXL.getRowCount("Drivers"); i++)
			{

				if(sXL.getCellData("Drivers", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Drivers", "Iteration", i).equals(Integer.toString(b)))   
				{
					if(sXL.getCellData("Drivers", "eleDefensiveDriverDiscountTrue", i).contains("YES"))
					{
						DefensiveDriver = "Yes";

					}
					if(sXL.getCellData("Drivers", "eleDefensiveDriverDiscountFalse", i).contains("YES"))
					{
						DefensiveDriver = "No";

					}
					break;
				}	
			}					
			// NewYoungDriver
			rowIndex++;
			//data1.put(1,new Object[] {"DriverInfo","DateOfBirth","Gender","MaritalStatus","DriverLicenseNo","DriverLicenseState","RelatedtoNI","ResiHousehold","DriverStatus","EmploymentStatus","EducationLevel","Industry","Occupation","EnrolledAAADrive","GoodStudent","StudentAway","DefensiveDriver","NewYoungDriver","VehicleL102App","VINAPP","VehicleUsageAPP","ExistingDamage","DescExistingDamage","AltGarageLoc","AltGarageAddress","AdditionalDiscountsAPP","VehicleL103App"});                              
			//data1.put(rowIndex, new Object[] { DriverInfo,DateOfBirth,Gender,MaritalStatus,DriverLicenseNo,DriverLicenseState,RelatedtoNI,ResiHousehold,DriverStatus,EmploymentStatus,EducationLevel,Industry,Occupation,EnrolledAAADrive,GoodStudent,StudentAway,DefensiveDriver,NewYoungDriver,VehicleL102App,VINAPP,VehicleUsageAPP,ExistingDamage,DescExistingDamage,AltGarageLoc,AltGarageAddress,AdditionalDiscountsAPP,VehicleL103App});
			data1.put(1,new Object[] {"Driver Name","Driver Status","Marital Status","AAA Insured Since","Accident/Violation Surcharge","Employment Status","Good Student","Student Away","Defensive Driver","New Young Driver"});
			data1.put(rowIndex, new Object[] {DriverInfo,DriverStatus,MaritalStatus,AAAInsuredSince,ViolationSurcharge,EmploymentStatus,GoodStudent,StudentAway,DefensiveDriver,NewYoungDriver});
			
			Set<Integer> keyset1 = data1.keySet();
			int rownum1 = 0;
			for (Integer key : keyset1)
			{
				Row row = sheet1.createRow(rownum1++);
				Object [] objArr = data1.get(key);
				int cellnum = 0;
				for (Object obj : objArr)
				{
					Cell cell = row.createCell(cellnum++);
					if(obj instanceof Date) 
						cell.setCellValue((Date)obj);
					else if(obj instanceof Boolean)
						cell.setCellValue((Boolean)obj);
					else if(obj instanceof String)
						cell.setCellValue((String)obj);
					else if(obj instanceof Double)
						cell.setCellValue((Double)obj);

				}
			}

			//UBI Driver Information sheet
			data_UBI.put(1,new Object[] {"Driver","Status","Prior Score","Current Score","Rated Score","Estimated Annual Miles","Evaluation Date","Household Score for AAADrive:","Eligible Participation Percentage:"});
			data_UBI.put(rowIndex, new Object[] {DriverInfo,DriverStatus,PriorScore,CurrentScore,RatedScore,AnnualMileage,EvaluationDate,ResiHousehold,EnrolledAAADrive});
			
			Set<Integer> keyset_UBI = data_UBI.keySet();
			rownum1 = 0;
			for (Integer key : keyset_UBI)
			{
				Row row = sheet_UBI.createRow(rownum1++);
				Object [] objArr = data_UBI.get(key);
				int cellnum = 0;
				for (Object obj : objArr)
				{
					Cell cell = row.createCell(cellnum++);
					if(obj instanceof Date) 
						cell.setCellValue((Date)obj);
					else if(obj instanceof Boolean)
						cell.setCellValue((Boolean)obj);
					else if(obj instanceof String)
						cell.setCellValue((String)obj);
					else if(obj instanceof Double)
						cell.setCellValue((Double)obj);

				}
			}

		}
		
		XSSFSheet sheet2 = workbook.createSheet("Vehicles");
		rowIndex = 1;
		Map<Integer,Object[]> data2 = new TreeMap<Integer,Object[]>();

		XSSFSheet sheet_Cov = workbook.createSheet("Coverages");
		Map<Integer,Object[]> data_Cov = new TreeMap<Integer,Object[]>();

		
		//Vehicles	
		for (int a = 1; a<=countofvehicle; a++)
		{
			//CoverageOffered=null;
			CoverageOffered="Limits/Deductible Selected Premium";
			for(int i = 2; i <=  sXL.getRowCount("Vehicles"); i++)
			{

				if(sXL.getCellData("Vehicles", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Vehicles", "Iteration", i).equals(Integer.toString(a)))   
				{
					Vehicle = sXL.getCellData("Vehicles", "edtVehicleYear", i) + " "+ sXL.getCellData("Vehicles", "edtVehicleMake", i) + " "+ sXL.getCellData("Vehicles", "edtVehicleModel", i);
					
					break;
				}	
			}//end

			
			//VIN
			for(int i = 2; i <=  sXL.getRowCount("Vehicles"); i++)
			{

				if(sXL.getCellData("Vehicles", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Vehicles", "Iteration", i).equals(Integer.toString(a)))   
				{

					VIN = sXL.getCellData("Vehicles", "edtVINNumber", i) ;
					break;
				}	
			}
			
			//TitleHolder
			for(int i = 2; i <=  sXL.getRowCount("Vehicles"); i++)
			{

				if(sXL.getCellData("Vehicles", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Vehicles", "Iteration", i).equals(Integer.toString(a)))   
				{

					if(sXL.getCellData("Vehicles", "funSelectCheckboxinTitleHoldertable", i).contains("YES"))
					{
						TitleHolder="YES";
						break;
					}
					else
					{
						TitleHolder="NO";
						break;
					}
				}	
			}
			
			//VehicleUsageAPP    
			for(int i = 2; i <=  sXL.getRowCount("Vehicles"); i++)
			{

				if(sXL.getCellData("Vehicles", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Vehicles", "Iteration", i).equals(Integer.toString(a)))   
				{

					VehicleUsageAPP = sXL.getCellData("Vehicles", "lstVehicleUsage", i) ;
					break;
				}	
			}	
			//ExistingDamage 
			for(int i = 2; i <=  sXL.getRowCount("Vehicles"); i++)
			{

				if(sXL.getCellData("Vehicles", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Vehicles", "Iteration", i).equals(Integer.toString(a)))   
				{

					ExistingDamage = sXL.getCellData("Vehicles", "lstExistingDamage", i) ;
					break;
				}	
			}	
			//DescExistingDamage	
			//AltGarageLoc 

			//AltGarageAddress	
			for(int i = 2; i <=  sXL.getRowCount("Vehicles"); i++)
			{

				if(sXL.getCellData("Vehicles", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Vehicles", "Iteration", i).equals(Integer.toString(a)))   
				{

					AltGarageAddress = sXL.getCellData("Vehicles", "lstVehicleGaragedAt", i) ;
					break;
				}	
			}
			//AdditionalDiscountsAPP
			/*//AAADriveDis	
	for(int i = 2; i <=  sXL.getRowCount("Vehicles"); i++)
	{

		if(sXL.getCellData("Vehicles", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Vehicles", "Iteration", i).equals(Integer.toString(a)))   
		{

			AltGarageAddress = sXL.getCellData("Vehicles", "lstVehicleGaragedAt", i) ;
					break;
		}	
	}	*/
			//Comprehensive

			for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
			{
				if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Coverages", "Iteration", i).equals(Integer.toString(a)))  
				{

					String[] Comprehensive1 =sXL.getCellData("Coverages", "funEnterCoverageValue_CompDeductible", i).split(":::");
					if(Comprehensive1[Comprehensive1.length-1]!="")
					{
						Comprehensive1[Comprehensive1.length-1]=Comprehensive1[Comprehensive1.length-1].replace("$", "");
						Comprehensive ="$"+Comprehensive1[Comprehensive1.length-1]+" Deductible";
					}
					else
					{
						Comprehensive ="Not Included";
					}
					break;
				}
			}

			//Collision

			for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
			{
				if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")) && sXL.getCellData("Coverages", "Iteration", i).equals(Integer.toString(a)) )  
				{

					String[] Collision1 =sXL.getCellData("Coverages", "funEnterCoverageValue_CollDeductible", i).split(":::");
					if(Collision1[Collision1.length-1]!="")
					{
						Collision1[Collision1.length-1]=Collision1[Collision1.length-1].replace("$", "");
						Collision ="$"+Collision1[Collision1.length-1]+" Deductible";
					}
					else
					{
						Collision="Not Included";
					}
					break;
				}
			}

			//Enhanced Exterior Repair Option
			for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
			{
				if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Coverages", "Iteration", i).equals(Integer.toString(a)))  
				{

					String[] EERO =sXL.getCellData("Coverages", "funEnterCoverageValue_EERO", i).split(":::");
					if(!EERO[EERO.length-1].equals(""))
					{
						EERO[EERO.length-1]=EERO[EERO.length-1].replace("$", "");
						EnhancedExteriorRepairOption ="$"+EERO[EERO.length-1];
					}
					else
					{
						EnhancedExteriorRepairOption="Not Included";
					}
					break;
				}
			}

			//Loan/Lease Gap
			for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
			{
				if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Coverages", "Iteration", i).equals(Integer.toString(a)))  
				{
					String[] LLG =sXL.getCellData("Coverages", "funEnterCoverageValue_LLG", i).split(":::");
					if(!LLG[LLG.length-1].equals(""))
					{
						LLG[LLG.length-1]=LLG[LLG.length-1].replace("$", "");
						LoanLeaseGap ="$"+LLG[LLG.length-1];
					}
					else
					{
						LoanLeaseGap="Not Included";
					}
					break;
				}
			}
			
			//Enhanced Total Loss Replacement
			for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
			{
				if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Coverages", "Iteration", i).equals(Integer.toString(a)))  
				{

					if(sXL.getCellData("Coverages", "funSelectCoverage_ETLR", i).trim()=="")
					{
						EnhancedTotalLossReplacement="Not Included";
						break;
					}
					else
					{
						EnhancedTotalLossReplacement="Included";
						break;
					}
					
				}
			}
			
			
			//TransportationNetworkCompany
			for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
			{
				if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))&& sXL.getCellData("Coverages", "Iteration", i).equals(Integer.toString(a)))  
				{

					String[] TNC =sXL.getCellData("Coverages", "funEnterCoverageValue_ExtraEquip_TNC", i).split(":::");
				
					if(!TNC[TNC.length-1].equals(""))
					{
						TNC[TNC.length-1]=TNC[TNC.length-1].replace("$", "");
						TransportationNetworkCompany ="$"+TNC[TNC.length-1];
					}
					else
					{
						TransportationNetworkCompany ="Not Included";
					}
					break;
				}
			}
			
			//CarRental

			for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
			{
				if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")) && sXL.getCellData("Coverages", "Iteration", i).equals(Integer.toString(a)) )  
				{

					String[] CarRental1 =sXL.getCellData("Coverages", "funEnterCoverageValue_CR", i).split(":::");
					if(!CarRental1[CarRental1.length-1].equals(""))
					{
						String[] temp;
						temp=CarRental1[CarRental1.length-1].trim().split("/");
						CarRental="$"+temp[temp.length-2].replace("$", "")+" per day/"+"$"+temp[temp.length-1].trim().replace("$", "")+" maximum";
					}
					else
					{
						CarRental="Not Included";
					}
					break;
				}
			}

			//ExtraEquipment
			for(int i = 2; i <= sXL.getRowCount("Coverages"); i++)
			{
				if(sXL.getCellData("Coverages", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")) && sXL.getCellData("Coverages", "Iteration", i).equals(Integer.toString(a)))  
				{

					String[] ExtraEquipment1 =sXL.getCellData("Coverages", "funEnterCoverageValue_ExtraEquip", i).split(":::");
					if(!ExtraEquipment1[ExtraEquipment1.length-1].equals(""))
					{
						ExtraEquipment="$"+ExtraEquipment1[ExtraEquipment1.length-1].replace("$", "");
					}
					else
					{
						ExtraEquipment="Not Included";
					}
					break;
				}
			}
			//ActiveDrivers
			for(int i = 2; i <= sXL.getRowCount("Vehicles"); i++)
			{
				if(sXL.getCellData("Vehicles", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")) && sXL.getCellData("Vehicles", "Iteration", i).equals(Integer.toString(a)))  
				{

					ActiveDrivers =sXL.getCellData("Vehicles", "lsjAssignedDriver", i);


					break;
				}
			}
			
			//VehiclePurchasedDate
			for(int i = 2; i <= sXL.getRowCount("Vehicles"); i++)
			{
				if(sXL.getCellData("Vehicles", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")) && sXL.getCellData("Vehicles", "Iteration", i).equals(Integer.toString(a)))  
				{

					VehiclePurchasedDate =sXL.getCellData("Vehicles", "edtDatePurchased", i);
					break;
				}
			}
			
			//Use
			for(int i = 2; i <= sXL.getRowCount("Vehicles"); i++)
			{
				if(sXL.getCellData("Vehicles", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")) && sXL.getCellData("Vehicles", "Iteration", i).equals(Integer.toString(a)))  
				{

					Use =sXL.getCellData("Vehicles", "lstVehicleUsage", i);


					break;

				}
			}
		
			rowIndex++;

			//String str= PdfTextExtractor.getTextFromPage(reader, pageIndex); //Extracting the content from a particular page.
			//data2.put(1,new Object[] {"Vehicle","ActiveDrivers","Use","Comprehensive","ComprehensivePremium","Collision","CollisionPremium","CarRental","CarRentalPremium","EnhancedExteriorRepairOption","EnhancedExteriorRepairOptionPremium","LoanLeaseGap","LoanLeaseGapPremium","ExtraEquipment","ExtraEquipmentPremium","EnhancedTotalLossReplacement","EnhancedTotalLossReplacementPremium","TransportationNetworkCompany","TransportationNetworkCompanyPremium","DiscountsAppliedforVehicle","DiscountsAppliedforVehiclePremium","SixMonthEstimatedPremiumbyVehicle"});                              
			//data2.put(rowIndex, new Object[] {Vehicle, ActiveDrivers , Use ,Comprehensive , ComprehensivePremium , Collision , CollisionPremium , CarRental , CarRentalPremium , EnhancedExteriorRepairOption , EnhancedExteriorRepairOptionPremium , LoanLeaseGap , LoanLeaseGapPremium , ExtraEquipment , ExtraEquipmentPremium , EnhancedTotalLossReplacement , EnhancedTotalLossReplacementPremium , TransportationNetworkCompany , TransportationNetworkCompanyPremium , DiscountsAppliedforVehicle , DiscountsAppliedforVehiclePremium , SixMonthEstimatedPremiumbyVehicle});
			data2.put(1,new Object[] {"Vehicle Name","Vehicle Identification Number","Vehicle Rated Address","Assigned Driver","Titleholder","Lienholder","Vehicle Usage","Vehicle Lease/ Purchase Date","Additional Discounts"});
			data2.put(rowIndex, new Object[] {Vehicle,VIN,AltGarageAddress,ActiveDrivers,TitleHolder,Lienholder,VehicleUsageAPP,VehiclePurchasedDate,AdditionalDiscounts});
			
			//data_Cov.put(1,new Object[] {"Vehicle Name","Coverage Offered","Bodily Injury","Property Damage","Medical Payment","Uninsured/ Underinsured Motorists BodilyInjury","Uninsured/Underinsured Motorists Property Damage","Comprehensive","Collision","Enhanced Exterior Repair Option","Car Rental","Loan/Lease Gap","Extra Equipment","Enhanced Total Loss Replacement","Transportation Network Company","Total Premium Per Vehicle"});
			data_Cov.put(1,new Object[] {"Vehicle Name","Coverage Offered","Bodily Injury","Bodily Injury Premium","Property Damage","Property Damage Premium","Medical Payment","Medical Payment Premium","Uninsured/ Underinsured Motorists BodilyInjury","Uninsured/ Underinsured Motorists BodilyInjury Premium","Uninsured/Underinsured Motorists Property Damage","Comprehensive","Comprehensive Premium","Collision","Collision Premium","Enhanced Exterior Repair Option","Car Rental","Car Rental Premium","Loan/Lease Gap","Extra Equipment","Enhanced Total Loss Replacement","Transportation Network Company","Total Premium Per Vehicle"});
			data_Cov.put(rowIndex, new Object[] {Vehicle,CoverageOffered,BodilyInjury,BodilyInjuryPremium,PropertyDamage,PropertyDamagePremium,MedicalPayments,MedicalPaymentsPremium,UninsuredUnderinsuredMotoristsBodilyInjury,UninsuredUnderinsuredMotoristsBodilyInjuryPremium,UninsuredUnderinsuredMotoristsPropertyDamage,Comprehensive,ComprehensivePremium,Collision,CollisionPremium,EnhancedExteriorRepairOption,CarRental,CarRentalPremium,LoanLeaseGap,ExtraEquipment,EnhancedTotalLossReplacement,TransportationNetworkCompany,TotalPremiumPerVehicle});
			Set<Integer> keyset_cov = data_Cov.keySet();
			
			Set<Integer> keyset2 = data2.keySet();
			int rownum2 = 0;
			for (Integer key : keyset2)
			{
				Row row = sheet2.createRow(rownum2++);
				Object [] objArr = data2.get(key);
				int cellnum = 0;
				for (Object obj : objArr)
				{
					Cell cell = row.createCell(cellnum++);
					if(obj instanceof Date) 
						cell.setCellValue((Date)obj);
					else if(obj instanceof Boolean)
						cell.setCellValue((Boolean)obj);
					else if(obj instanceof String)
						cell.setCellValue((String)obj);
					else if(obj instanceof Double)
						cell.setCellValue((Double)obj);

				}
			}
			
			rownum2 = 0;
			for (Integer key : keyset_cov)
			{
				Row row = sheet_Cov.createRow(rownum2++);
				Object [] objArr = data_Cov.get(key);
				int cellnum = 0;
				for (Object obj : objArr)
				{
					Cell cell = row.createCell(cellnum++);
					if(obj instanceof Date) 
						cell.setCellValue((Date)obj);
					else if(obj instanceof Boolean)
						cell.setCellValue((Boolean)obj);
					else if(obj instanceof String)
						cell.setCellValue((String)obj);
					else if(obj instanceof Double)
						cell.setCellValue((Double)obj);

				}
			}

			
			
		}
		
		//
		for(int i = 2; i <=  sXL.getRowCount("TestData"); i++)
		{

			if(sXL.getCellData("TestData", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID")))   
			{
				Covg_Value = sXL.getCellData("TestData", "CoverageValue", i).trim().split("Vehicle ([0-9]*)");
				if(Covg_Value.length>1)
				{
					XSSFSheet sheet_covgprem = workbook.createSheet("Coverage Premium Values");
					Map<Integer,Object[]> data_covgprem = new TreeMap<Integer,Object[]>();
					int rowIndex_covgprem=1;

					countofvehicles=Covg_Value.length;

					for(int j=0; j<countofvehicles; j++)
					{
						String[] temp;
						temp=Covg_Value[j].trim().split("\\$");	
						
						for(int k=0; k<temp.length; k++)
						{
							if(temp[k].contains("Liability - Bodily Injury Coverage"))
							{
								BodilyInjuryPremium="$"+temp[k+1].replaceAll("[a-zA-Z]", "").trim().replaceAll("[*/-]", "").trim();
							}
							if(temp[k].contains("Broadened Other Car Coverage"))
							{
								BroadenedOtherCarCovgPremium="$"+temp[k+1].replaceAll("[a-zA-Z]", "").trim().replaceAll("[*/-]", "").trim();
							}
							if(temp[k].contains("Property Damage Liability Coverage"))
							{
								PropertyDamageLiabilityCoveragePremium="$"+temp[k+1].replaceAll("[a-zA-Z]", "").trim().replaceAll("[*/-]", "").trim();
							}
							if(temp[k].contains("Medical Payments Coverage"))
							{
								MedicalPaymentsPremium="$"+temp[k+1].replaceAll("[a-zA-Z]", "").trim().replaceAll("[*/-]", "").trim();
							}
							if(temp[k].contains("Uninsured/Underinsured Motorists Property Damage Coverage"))
							{
								UninsuredUnderinsuredMotoristsPropertyDamagePremium="$"+temp[k+1].replaceAll("[a-zA-Z]", "").trim().replaceAll("[*/-]", "").trim();
							}
							if(temp[k].contains("Uninsured/Underinsured Motorists Bodily Injury Coverage"))
							{
								UninsuredUnderinsuredMotoristsBodilyInjuryAddOnPremium="$"+temp[k+1].replaceAll("[a-zA-Z]", "").trim().replaceAll("[*/-]", "").trim();
							}
							if(temp[k].contains("Comprehensive Coverage"))
							{
								ComprehensivePremium="$"+temp[k+1].replaceAll("[a-zA-Z]", "").trim().replaceAll("[*/-]", "").trim();
							}
							
							if(temp[k].contains("Collision Coverage"))
							{
								CollisionPremium="$"+temp[k+1].replaceAll("[a-zA-Z]", "").trim().replaceAll("[*/-]", "").trim();
							}
							
							if(temp[k].contains("Car Rental Coverage"))
							{
								CarRentalPremium ="$"+temp[k+1].replaceAll("[a-zA-Z]", "").trim();
							}
							
							if(temp[k].contains("Extra Equipment Coverage"))
							{
								ExtraEquipmentPremium ="$"+temp[k+1].replaceAll("[a-zA-Z]", "").trim().replaceAll("[*/-]", "").trim();
							}
							
							if(temp[k].contains("Enhanced Total Loss Replacement Coverage"))
							{
								EnhancedTotalLossReplacementPremium ="$"+temp[k+1].replaceAll("[a-zA-Z]", "").trim().replaceAll("[*/-]", "").trim();
							}
							
							if(temp[k].contains("Subtotal"))
							{
								SubtotalPremium ="$"+temp[k+1].replaceAll("[a-zA-Z]", "").trim().replace(":::", "").replaceAll("[*/-]", "").trim();
							}
														
						}
						
						//
						data_covgprem.put(1,new Object[] {"Liability - Bodily Injury Coverage","Broadened Other Car Coverage","Property Damage Liability Coverage","Medical Payments Coverage","Uninsured/Underinsured Motorists Property Damage Coverage","Uninsured/Underinsured Motorists Bodily Injury Coverage","Comprehensive Coverage","Collision Coverage","Car Rental Coverage","Extra Equipment Coverage","Enhanced Total Loss Replacement Coverage","Subtotal"});
						data_covgprem.put(rowIndex_covgprem, new Object[] {BodilyInjuryPremium,BroadenedOtherCarCovgPremium,PropertyDamageLiabilityCoveragePremium,MedicalPaymentsPremium,UninsuredUnderinsuredMotoristsPropertyDamagePremium,UninsuredUnderinsuredMotoristsBodilyInjuryAddOnPremium,ComprehensivePremium,CollisionPremium,CarRentalPremium,ExtraEquipmentPremium,EnhancedTotalLossReplacementPremium,SubtotalPremium});
						
						Set<Integer> keyset_covgprem = data_covgprem.keySet();
						int rownum_covgprem = 0;
						for (Integer key : keyset_covgprem)
						{
							Row row = sheet_covgprem.createRow(rownum_covgprem++);
							Object [] objArr = data_covgprem.get(key);
							int cellnum = 0;
							for (Object obj : objArr)
							{
								Cell cell = row.createCell(cellnum++);
								if(obj instanceof Date) 
									cell.setCellValue((Date)obj);
								else if(obj instanceof Boolean)
									cell.setCellValue((Boolean)obj);
								else if(obj instanceof String)
									cell.setCellValue((String)obj);
								else if(obj instanceof Double)
									cell.setCellValue((Double)obj);

							}
							
						}
						rowIndex_covgprem++;

						
					}
					
					break;
				}
				
			}
			
		}
		
		
		/*XSSFSheet sheet3 = workbook.createSheet("Qualification Ques");
		rowIndex = 1;
		Map<Integer,Object[]> data3 = new TreeMap<Integer,Object[]>();
		
		//Q1PA
				for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
				{
					if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
					{
						if(sXL.getCellData("Qualification", "funQuestion_DriverDeniedPayment", i).contains(":::"))
						{

						String[] Q1PASet =sXL.getCellData("Qualification", "funQuestion_DriverDeniedPayment", i).split(":::");
						Q1PA=Q1PASet[2];

						break;
						}
					}
				}
					//Q2PA
					for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
					{
						if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
						{
							if(sXL.getCellData("Qualification", "funQuestion_SR22Filling", i).contains(":::"))
							{

							String[] Q2PASet =sXL.getCellData("Qualification", "funQuestion_SR22Filling", i).split(":::");
							Q2PA=Q2PASet[2];

							break;
							}
						}
					}
						//Q3PA
						for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
						{
							if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
							{
								if(sXL.getCellData("Qualification", "funQuestion_DriverCancelled", i).contains(":::"))
								{

								String[] Q3PASet =sXL.getCellData("Qualification", "funQuestion_DriverCancelled", i).split(":::");
								Q3PA=Q3PASet[2];

								break;
								}
							}
						}


//Q4PA
		for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
		{
			if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
			{
				if(sXL.getCellData("Qualification", "funQuestion_FulltimeResidents", i).contains(":::"))
				{

				String[] Q4PASet =sXL.getCellData("Qualification", "funQuestion_FulltimeResidents", i).split(":::");
				Q4PA=Q4PASet[2];

				break;
				}
			}
		}
			//Q5PA
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_HouseholdResidents", i).contains(":::"))
					{

					String[] Q5PASet =sXL.getCellData("Qualification", "funQuestion_HouseholdResidents", i).split(":::");
					Q5PA=Q5PASet[2];

					break;
					}
				}
			}
			//Q1HO3
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_CoverageDeclined", i).contains(":::"))
					{

					String[] Q1HO3Set =sXL.getCellData("Qualification", "funQuestion_CoverageDeclined", i).split(":::");
					Q1HO3=Q1HO3Set[2];

					break;
					}
				}
			}
			//Q2HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_Trampoline", i).contains(":::"))
					{

					String[] Q2HO3Set =sXL.getCellData("Qualification", "funQuestion_Trampoline", i).split(":::");
					Q2HO3=Q2HO3Set[2];

					break;
					}
				}
			}
			//Q3HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_UnderGroundTankStorage", i).contains(":::"))
					{

					String[] Q3HO3Set =sXL.getCellData("Qualification", "funQuestion_UnderGroundTankStorage", i).split(":::");
					Q3HO3=Q3HO3Set[2];

					break;
					}
				}
			}
			//Q4HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_Minimum100AmpService", i).contains(":::"))
					{

					String[] Q4HO3Set =sXL.getCellData("Qualification", "funQuestion_Minimum100AmpService", i).split(":::");
					Q4HO3=Q4HO3Set[2];

					break;
					}
				}
			}
			//Q5HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_HomeHosting purposes?", i).contains(":::"))
					{

					String[] Q5HO3Set =sXL.getCellData("Qualification", "funQuestion_HomeHosting purposes?", i).split(":::");
					Q5HO3=Q5HO3Set[2];

					break;
					}
				}
			}
			//Q6HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_SurroundingPermisesMaintenance", i).contains(":::"))
					{

					String[] Q6HO3Set =sXL.getCellData("Qualification", "funQuestion_SurroundingPermisesMaintenance", i).split(":::");
					Q6HO3=Q6HO3Set[2];

					break;
					}
				}
			}
			//Q7HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_AdjacentCommercialExposure", i).contains(":::"))
					{

					String[] Q7HO3Set =sXL.getCellData("Qualification", "funQuestion_AdjacentCommercialExposure", i).split(":::");
					Q7HO3=Q7HO3Set[2];

					break;
					}
				}
			}
			//Q8HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_AbondonedProperty", i).contains(":::"))
					{

					String[] Q8HO3Set =sXL.getCellData("Qualification", "funQuestion_AbondonedProperty", i).split(":::");
					Q8HO3=Q8HO3Set[2];

					break;
					}
				}
			}
			//Q9HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_RentedIsnuredProperty", i).contains(":::"))
					{

					String[] Q9HO3Set =sXL.getCellData("Qualification", "funQuestion_RentedIsnuredProperty", i).split(":::");
					Q9HO3=Q9HO3Set[2];

					break;
					}
				}
			}
			//Q10HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_DeniedPaymentFraud", i).contains(":::"))
					{

					String[] Q10HO3Set =sXL.getCellData("Qualification", "funQuestion_DeniedPaymentFraud", i).split(":::");
					Q10HO3=Q10HO3Set[2];

					break;
					}
				}
			}
			//Q11HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_BusinessconductedPremises", i).contains(":::"))
					{

					String[] Q11HO3Set =sXL.getCellData("Qualification", "funQuestion_BusinessconductedPremises", i).split(":::");
					Q11HO3=Q11HO3Set[2];

					break;
					}
				}
			}
			//Q12HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_SwimmingPool", i).contains(":::"))
					{

					String[] Q12HO3Set =sXL.getCellData("Qualification", "funQuestion_SwimmingPool", i).split(":::");
					Q12HO3=Q12HO3Set[2];

					break;
					}
				}
			}
			//Q13HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_PetBiteHistory", i).contains(":::"))
					{

					String[] Q13HO3Set =sXL.getCellData("Qualification", "funQuestion_PetBiteHistory", i).split(":::");
					Q13HO3=Q13HO3Set[2];

					break;
					}
				}
			}
			//Q14HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_FarmingPursuit", i).contains(":::"))
					{

					String[] Q14HO3Set =sXL.getCellData("Qualification", "funQuestion_FarmingPursuit", i).split(":::");
					Q14HO3=Q14HO3Set[2];

					break;
					}
				}
			}
			//Q15HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_DeniedNonPayment", i).contains(":::"))
					{

					String[] Q15HO3Set =sXL.getCellData("Qualification", "funQuestion_DeniedNonPayment", i).split(":::");
					Q15HO3=Q15HO3Set[2];

					break;
					}
				}
			}
			//Q16HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_Dwelling", i).contains(":::"))
					{

					String[] Q16HO3Set =sXL.getCellData("Qualification", "funQuestion_Dwelling", i).split(":::");
					Q16HO3=Q16HO3Set[2];

					break;
					}
				}
			}
			//Q17HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_InsuredOwnProperty", i).contains(":::"))
					{

					String[] Q17HO3Set =sXL.getCellData("Qualification", "funQuestion_InsuredOwnProperty", i).split(":::");
					Q17HO3=Q17HO3Set[2];

					break;
					}
				}
			}
			//Q18HO3  
			for(int i = 2; i <= sXL.getRowCount("Qualification"); i++)
			{
				if(sXL.getCellData("Qualification", "ID", i).contains(PCThreadCache.getInstance().getProperty("TCID"))) 
				{
					if(sXL.getCellData("Qualification", "funQuestion_licensedBabySitting", i).contains(":::"))
					{

					String[] Q18HO3Set =sXL.getCellData("Qualification", "funQuestion_licensedBabySitting", i).split(":::");
					Q18HO3=Q18HO3Set[2];

					break;
					}
				}
			}

			rowIndex++;
			data3.put(1,new Object[] {"Q1PA","Q2PA","Q3PA","Q4PA","Q5PA","Q1HO3","Q2HO3","Q3HO3","Q4HO3","Q5HO3","Q6HO3","Q7HO3","Q8HO3","Q9HO3","Q10HO3","Q11HO3","Q12HO3","Q13HO3","Q14HO3","Q15HO3","Q16HO3","Q17HO3","Q18HO3"});
			data3.put(rowIndex, new Object[] {Q1PA,Q2PA,Q3PA,Q4PA,Q5PA,Q1HO3,Q2HO3,Q3HO3,Q4HO3,Q5HO3,Q6HO3,Q7HO3,Q8HO3,Q9HO3,Q10HO3,Q11HO3,Q12HO3,Q13HO3,Q14HO3,Q15HO3,Q16HO3,Q17HO3,Q18HO3,});
		
			Set<Integer> keyset3 = data3.keySet();
			int rownum3 = 0;
			for (Integer key : keyset3)
			{
				Row row = sheet3.createRow(rownum3++);
				Object [] objArr = data3.get(key);
				int cellnum = 0;
				for (Object obj : objArr)
				{
					Cell cell = row.createCell(cellnum++);
					if(obj instanceof Date) 
						cell.setCellValue((Date)obj);
					else if(obj instanceof Boolean)
						cell.setCellValue((Boolean)obj);
					else if(obj instanceof String)
						cell.setCellValue((String)obj);
					else if(obj instanceof Double)
						cell.setCellValue((Double)obj);

				}



			}*/


		
		

		try {
			FileOutputStream out =new FileOutputStream(new File("C:\\ACG\\Workspace\\Auto Package\\Output\\Forms_Dynamic_Data_OutPut.xlsx"));

			workbook.write(out);

			File source=new File("C:\\ACG\\Workspace\\Auto Package\\Output\\Forms_Dynamic_Data_OutPut.xlsx");
			File dest=new File("C:\\ACG\\Workspace\\Auto Package\\Input\\PDFGenerator\\TempFiles\\GeneratedPDFandInputTestDataforComparision\\"+PCThreadCache.getInstance().getProperty("TCID").substring(0)+".xlsx");
			//System.out.println(dest);
			FileChannel inputChannel1=new FileInputStream(source).getChannel();
			FileChannel outputChannel1=new FileOutputStream(dest).getChannel();
			outputChannel1.transferFrom(inputChannel1, 0, inputChannel1.size());
			inputChannel1.close();
			outputChannel1.close();

			out.close();

			//System.out.println("Excel written successfully..");


			return status;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;

	}



}	



