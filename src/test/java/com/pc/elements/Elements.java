/**
 * @ClassPurpose Object repository
 * @Scriptor All
 * @ReviewedBy
 * @ModifiedBy All
 * @LastDateModified 3/17/2017
 */
package com.pc.elements;

import java.util.HashMap;
import org.openqa.selenium.By;

public class Elements
{
		private  HashMap<String,By> hm = new HashMap<String,By>();  
		
		public Elements()
		{	
			//LogIn Objects
			hm.put("edtUserName", By.xpath(".//input[contains(@name,'username')]"));
			hm.put("pwdPassword", By.xpath(".//input[contains(@name,'password')]"));  
			
			
			hm.put("btnLogin", By.id("Login:LoginScreen:LoginDV:submit-btnInnerEl"));
			hm.put("btnCommonNext", By.xpath(".//span[contains(text(),'ext >')]"));
			
			hm.put("lstPrimaryMethodOfContact", By.xpath(".//input	[contains(@id,'PrimaryPhone-inputEl')]"));  
		
			
			//WebmessageWorksheetClear
			hm.put("btnWorksheetClear", By.id("WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton"));
			hm.put("eleMenuActions", By.id("PolicyFile:PolicyFileMenuActions"));
			hm.put("eleActionsIssuePolicy", By.id("PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_IssueSubmission-textEl"));
			hm.put("eleIssuancepaymentscreen", By.id("IssuanceWizard:BillingInfo"));
			hm.put("btnIssuancePolicy", By.xpath(".//span[contains(@id,'Issue-btnEl')]"));
			//Edit PolicyTRansaction
			hm.put("eleCommonEditPolicyTranx", By.xpath(".//span[contains(@id, ':EditPolicy-btnEl')]"));
			//Objects under Action Menu which is Under Desktop Main Menu
			hm.put("eleDeskTopAction", By.id("Desktop:DesktopMenuActions-btnInnerEl"));
			hm.put("eleDeskTopActionBC", By.id("DesktopGroup:DesktopMenuActions-btnInnerEl"));
			hm.put("eleDeskTopNewAccount", By.id("Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewAccount-textEl"));
			
			//Enter New Account Search Objects
			hm.put("edtCompanyName", By.id("NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("eleAccountInfoSearch", By.id("NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleAccountInfoCreateNewAccount", By.id("NewAccount:NewAccountScreen:NewAccountButton-btnInnerEl"));
			hm.put("eleCreateNewAccountForPerson", By.id("NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person-textEl"));
			hm.put("eleCreateNewAccountForCompany", By.id("NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Company-textEl"));
			hm.put("edtGender", By.id("NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:Gender-inputEl"));
			hm.put("edtGenderPerson", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalPersonNameInputSet:Gender-inputEl"));
			hm.put("eleClickInvoice", By.xpath(".//li[contains(text(),'INV')]"));
			//common buttons
			hm.put("eleLOBLabel", By.xpath(".//span[contains(@id,'LOBLabel-btnInnerEl')]"));
			hm.put("eleFromAddressBook", By.xpath(".//span[text()='From Address Book']"));
			hm.put("eleCommonActions", By.xpath(".//span[contains(@id,'MenuActions-btnIconEl')]"));
			hm.put("eleCommonSelectFromGrid", By.xpath(".//a[contains(@id,'0:_Select')]"));
			hm.put("eleForms", By.id("SubmissionWizard:Forms"));
			hm.put("eleCommonOK", By.xpath(".//span[contains(text(),'OK')]"));
			hm.put("eleCommonSelect", By.xpath(".//*[text()='Select']"));
			hm.put("eleCommonCancel", By.xpath(".//span[contains(text(),'Cance')]"));
			hm.put("eleCommonNext", By.xpath(".//span[contains(text(), 'Next >')]"));
			hm.put("btnAddReconcileNext", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAPrefillDriversScreen:houseHoldDrivers:PrefillDriversLV_tb:next"));
			hm.put("eleCommonFinish", By.xpath(".//span[contains(@id, ':Finish-btnWrap')]"));
			hm.put("eljCommonOK", By.xpath(".//span[contains(text(),'OK')]"));
			hm.put("eleCommonUpdate", By.xpath(".//span[contains(text(),'pdate')]"));
			hm.put("edtCommonPrefix", By.xpath(".//input[contains(@id,'Prefix-inputEl')]"));
			hm.put("edtCommonSuffix", By.xpath(".//input[contains(@id,'Suffix-inputEl')]"));
			hm.put("edtcommonFirstName", By.xpath(".//input[contains(@id, ':FirstName-inputEl')]"));
			hm.put("edtcommonMiddleName", By.xpath(".//input[contains(@id, ':MiddleInitial-inputEl')]"));
			hm.put("btncommonResOfDwellingNo", By.xpath(".//input[contains(@id, 'ResOfDwelling_false-inputEl')]"));
			hm.put("eleCommonAutoFill", By.xpath(".//span[contains(@id,':ConfigAutoFill-btnInnerEl')]"));
			hm.put("edtcommonLastName", By.xpath(".//input[contains(@id, ':LastName-inputEl')]"));
			hm.put("edtcommonGender", By.xpath(".//input[contains(@id, ':Gender-inputEl')]"));
			hm.put("edtCommonDOB", By.xpath(".//input[contains(@id, 'DateOfBirth-inputEl')]"));
			hm.put("lstCommonMaritalStatus", By.xpath(".//input[contains(@id, 'MaritalStatus-inputEl')]"));
			hm.put("edtMobileNumber",  By.xpath(".//input[contains(@id, 'CellPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl')]"));
			hm.put("edtCommonWorkPhone",  By.xpath(".//input[contains(@id, 'WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl')]"));
			hm.put("eleExistingDriver", By.xpath(".//span[(text()='Existing Driver')]"));
			hm.put("eleExistingContact", By.xpath(".//span[(text()='Existing Contact')]"));
			hm.put("eleCommonBack", By.xpath(".//span[contains(text(), '< Back')]"));
			hm.put("lstCommonPrimaryMethodofContact", By.xpath(".//input[contains(@id,'PrimaryPhone-inputEl')]"));
			hm.put("edtcommonPhone", By.xpath(".//input[contains(@id, 'HomePhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl')]"));
			hm.put("edtcommonPhone1", By.xpath(".//input[contains(@id, ':Phone-inputEl')]"));
			hm.put("edtCommonEmail", By.xpath(".//input[contains(@id,'EmailAddress1-inputEl')]"));
			hm.put("edtCommonSearchEmail", By.xpath(".//input[contains(@id,'Email-inputEl')]"));
			hm.put("edtCommonProducer",By.xpath(".//input[contains(@id,'ProducerOrganization-inputEl')]"));
			hm.put("edtCommonProducer1",By.xpath(".//input[contains(@id,'Producer-inputEl')]"));
			hm.put("edtCommonProducercode",By.xpath(".//input[contains(@id,'ProducerCode-inputEl')]"));
			hm.put("eleCommonReset", By.xpath(".//a[contains(@id,':Reset')]"));
			hm.put("eleCommonSearch", By.xpath(".//a[contains(@id,':SearchLinksInputSet:Search')]"));
			hm.put("eleCommonCreateNewContact", By.xpath(".//a[contains(@id,':CreateNewPerson')]"));

			
			hm.put("edtCommonHouseNumber", By.xpath(".//input[contains(@id, ':AddressLine1-inputEl')]"));
			hm.put("edtCommonStreetName", By.xpath(".//input[contains(@id, ':AddressLine2-inputEl')]"));
			hm.put("edtCommonCity", By.xpath(".//input[contains(@id, ':City-inputEl')]"));
			hm.put("edtCommonCounty", By.xpath(".//input[contains(@id, 'County-inputEl')]"));
			hm.put("lstCommonState", By.xpath(".//input[contains(@id, ':State-inputEl')]"));
			hm.put("lstCommonZipCode", By.xpath(".//input[contains(@id, ':PostalCode-inputEl')]"));
			hm.put("lstCommonAddressType", By.xpath(".//input[contains(@id, ':AddressType-inputEl')]"));
			hm.put("edtCommonSSN", By.xpath(".//input[contains(@id, ':OfficialIDDV_Input')]"));
			hm.put("btnCommonRefusedtoProvideInfoYes", By.xpath(".//input[contains(@id, ':refusedToProvideInfo_true-inputEl')]"));
			hm.put("btnCommonRefusedtoProvideInfoNo", By.xpath(".//input[contains(@id, ':refusedToProvideInfo_false-inputEl')]"));
			hm.put("btnCommonConsenttoTextYes", By.xpath(".//input[contains(@id, ':ConsentToText_true-inputEl')]"));
			hm.put("btnCommonConsenttoTextNo", By.xpath(".//input[contains(@id, ':ConsentToText_false-inputEl')]"));
			hm.put("btnCommonRetiredYes", By.xpath(".//input[contains(@id, 'Retired_true-inputEl')]"));
			hm.put("btnCommonRetiredNo", By.xpath(".//input[contains(@id, 'Retired_false-inputEl')]"));
			hm.put("btnCommonStandardize", By.xpath(".//*[text()='Standardize']"));
			hm.put("eleCommonOrganizationSearch", By.xpath(".//div[contains(@id, ':ProducerSelectionInputSet:Producer:SelectOrganization')]"));
			hm.put("btnCommonSelectStandardizeAddress", By.xpath(".//a[contains(@id, 'AddressStandardize_AcgPopup:StardizationResults_AcgLV')]"));
			hm.put("btnCommonSelectOVerrideAddress", By.xpath(".//a[contains(@id, 'AddressStandardize_AcgPopup:override')]"));
			hm.put("btnOverrideAddress", By.id("AddressStandardize_AcgPopup:override"));
			hm.put("eleCommonAdd", By.xpath(".//span[(text()='Add')]"));
			hm.put("eleClear", By.xpath(".//span[contains(@id, 'WebMessageWorksheet_ClearButton-btnInnerEl')]"));
			hm.put("eleCommonOrderPrefillYes", By.xpath(".//input[contains(@id, 'isPrefillOrdered_true-inputEl')]"));
			hm.put("eleCommonOrderPrefillNo", By.xpath(".//input[contains(@id, 'isPrefillOrdered_false-inputEl')]"));

			//screens
			
			hm.put("eleVehicleScreen", By.xpath(".//span[(text()='Vehicles') and contains(@class,'tree')]"));
			hm.put("eleDriversScreen", By.xpath(".//span[(text()='Drivers') and contains(@class,'tree')]"));
			
			
			
			//create Comapny Account
			hm.put("edtName", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalContactNameInputSet:Name-inputEl"));
			//Create Account Objects

			hm.put("edtMobileNumber",  By.xpath(".//input[contains(@id, 'CellPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl')]"));

			hm.put("edtFirstName", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
			hm.put("edtLastName", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalPersonNameInputSet:LastName-inputEl"));
			hm.put("edtHouseNumber", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
			hm.put("edtStreetName", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine2-inputEl"));
			hm.put("eleCity", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
			hm.put("edtCity", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
			
			hm.put("zedCity", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
			hm.put("lstState", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("eleZipCode", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("edtZipCode", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("lstZipCode", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("eleAddressType", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl"));
			hm.put("lstAddressType", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl"));
			hm.put("lstOrgType", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:OrgType-inputEl"));
			hm.put("eleOrgSearch", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer:SelectOrganization"));
			hm.put("lstProducerCodeOrgType", By.id("OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:Type-inputEl"));
			hm.put("edtOrganizationName", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:Description-inputEl"));
			hm.put("eleOrgResSearch", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleOrgSearchResults", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchLV:0:_Select"));
			hm.put("lstProducerCode", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:ProducerCode-inputEl"));
			hm.put("eleUpdate", By.cssSelector("a[id='CreateAccount:CreateAccountScreen:updateButton_Ext'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("btnUpdate", By.id("CreateAccount:CreateAccountScreen:Update"));
			hm.put("eleStandardise", By.id("CreateAccount:CreateAccountScreen:Standardize-btnInnerEl"));
			hm.put("btnSelectStandardizeAddr", By.id("AddressStandardize_AcgPopup:StardizationResults_AcgLV:0:select"));
			hm.put("btnSelectCityCounty", By.id("AddressStandardize_AcgPopup:CityCountyResults_AcgLV:0:select"));
			hm.put("eleCreateNewAccountNumber", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-inputEl"));
			hm.put("eleNew", By.id("MatchingSearchResults_ExtWorksheet:ToolbarButton-btnEl"));
			hm.put("eleAddSuccessMsg", By.id("CreateAccount:CreateAccountScreen:_msgs"));
			hm.put("lstUWCompany", By.xpath(".//input[contains(@id,':UWCompany-inputEl')]"));
			
			hm.put("edtType", By.xpath(".//input[contains(@id, 'AddressType1-inputEl')]"));
			//hm.put("lstType",By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressType2-inputEl"));
			hm.put("edtType1", By.xpath(".//input[contains(@id, 'AddressType2-inputEl')]"));
			//hm.put("lstType",By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressType1-inputEl"));;
			
			//Edit Account
			hm.put("eleEdtButton", By.id("AccountFile_Summary:AccountFile_SummaryScreen:EditAccount-btnInnerEl"));
			hm.put("edtMemberShipNumber", By.xpath(".//input[contains(@id, 'memberShipNumber-inputEl')]"));
			hm.put("edtEditAccountFirstName", By.id("EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
			hm.put("edtEditAccountLastName", By.id("EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl"));
		//	hm.put("eleActiveMailing",By.id("EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:activemailing-inputEl"));
			//hm.put("edtAIFNum", By.id("EditAccountPopup:EditAccountScreen:aifNumber_Ext-inputEl"));
			//hm.put("edtAllianceNum", By.id("EditAccountPopup:EditAccountScreen:allianceNumber_Ext-inputEl"));
			//hm.put("edtFEINNum", By.id("EditAccountPopup:EditAccountScreen:OfficialIDInputSet:OfficialIDDV_Input-inputEl"));
			hm.put("eleEditUpdate", By.id("EditAccountPopup:EditAccountScreen:Update-btnInnerEl"));
			//hm.put("txtFEINNum", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl"));
			//hm.put("txtAllianceNum", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:allianceNumber_Ext-inputEl"));
			//hm.put("txtAIFNum", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:aif_Ext-inputEl"));
			
			//Contacts
			hm.put("eleCreateNewContact", By.xpath(".//span[contains(@id,'addContactButton-btnInnerEl')]"));
//			hm.put("elePrimaryContact", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:14:roleType-arrowEl"));
//			hm.put("elePrimaryNewPerson", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:14:roleType:0:contactType-textEl"));
			hm.put("elePrimaryContact", By.xpath(".//span[contains(text(), 'Primary Contact')]"));
			hm.put("elePrimaryNewPerson", By.xpath(".//span[contains(text(), 'New Person')]"));
			hm.put("edtFName", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
			hm.put("edtLName", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl"));
			hm.put("sclCTUpdate", By.id("NewAccountContactPopup:ContactDetailScreen:updateButton_Ext-btnInnerEl"));
			hm.put("eleContactUpdate", By.id("NewAccountContactPopup:ContactDetailScreen:updateButton_Ext-btnInnerEl"));
//			hm.put("eleSecondaryContact", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:14:roleType-arrowEl"));
//			hm.put("eleSecondaryNewPerson", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:14:roleType:1:contactType-textEl"));
//			hm.put("eleSecondaryContact", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:15:roleType-arrowEl"));
//			hm.put("eleSecondaryNewPerson", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:15:roleType:1:contactType-textEl"));
			hm.put("eleSecondaryContact", By.xpath(".//span[contains(text(), 'Secondary Contact')]"));
			hm.put("eleSecondaryNewPerson", By.xpath(".//span[contains(text(), 'New Person')]"));
			hm.put("eleSameAddressAs", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon"));
			hm.put("eleAccountHolder", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail-textEl"));
			hm.put("eleAccountAddress", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress"));
			hm.put("eleAssertContact", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:ttlBar"));
			hm.put("eleBillingContact", By.xpath(".//span[contains(text(), 'Billing Contact')]"));
			hm.put("eleBillingNewPerson", By.xpath(".//span[contains(text(), 'New Person')]"));
			hm.put("lsjAccountSummary_PolTran", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_WorkOrdersLV_tb:WorkOrdersCompletenessFilter-inputEl"));
			hm.put("edtContactFirstName", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
            hm.put("edtContactLasttName", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl"));
            hm.put("elePolicyActions",By.id("PolicyGroup:PolicyDetailMenuActions-btnEl"));
            
			//LogOut
			hm.put("btnPreferences", By.id(":TabLinkMenuButton-btnIconEl"));
			hm.put("elePreferences", By.id(":TabLinkMenuButton-btnIconEl"));
			hm.put("eleLogOut", By.id("TabBar:LogoutTabBarLink-textEl"));	
			//Common Objects Across all the Screens
			/**hm.put("eleCommonSearch", By.xpath("//*[contains(@id,'SearchLinksInputSet:Search')]"));
			hm.put("eljCommonSearch", By.xpath("//*[contains(@id,'SearchLinksInputSet:Search')]"));
			hm.put("eleCommonEdit", By.xpath("//*[contains(@id,'Edit-btnInnerEl')]"));
			hm.put("eleCommonSelect", By.xpath("//*[contains(@id,'_Select')]"));
			hm.put("eleCommonAdd", By.xpath(".//span[(text()='Add')]"));
			hm.put("eljCommonSaveChanges", By.xpath(".//span[contains(text(), 'Save Changes')]"));
			hm.put("CommonAssertForPage", By.xpath("//*[contains(@id,'ExtPopup:ttlBar')]"));
			hm.put("eleCommonUpdate", By.xpath("//span[contains(text(),'Update')]"));
			hm.put("eleCommonUpdateId", By.xpath("//*[contains(@id,'Update-btnInnerEl')]"));
			hm.put("eljCommonUpdate", By.xpath("//span[contains(text(),'Update')]"));
			hm.put("eleCommonDelete", By.xpath(".//span[contains(text(), 'Delete')]"));
			hm.put("eleDeleteWarningMessage", By.id("messagebox-1001-displayfield-inputEl"));
			hm.put("eleWarningMessage", By.xpath("//*[contains(@id,'ExtPopup:_msgs')]"));
			hm.put("eleCommonSaveDraft", By.xpath(".//span[contains(@id, 'SaveDraftButton-btnInnerEl')]"));
			hm.put("eljCommonSaveDraft", By.xpath(".//span[contains(@id, 'SaveDraftButton-btnInnerEl')]"));
			hm.put("eleCommonWithDrawn", By.xpath(".//span[contains(text(), 'Withdrawn')]"));
			hm.put("eleCommonNext", By.xpath(".//span[contains(text(), 'Next >')]"));
			hm.put("eljCommonNext", By.xpath(".//span[contains(text(), 'Next >')]"));
			hm.put("eleCommonBack", By.xpath(".//span[contains(text(), '< Back')]"));
			hm.put("eleCommonUpToAccountFileSummary", By.xpath(".//a[contains(text(), 'Up to Account File Summary')]"));
			hm.put("eleCommonSaveChanges", By.xpath(".//span[contains(text(), 'Save Changes')]"));
			hm.put("eleCommonFinish", By.xpath(".//span[contains(text(), 'Finish')]"));
			hm.put("eljCommonFinish", By.xpath(".//span[contains(text(), 'Finish')]"));
			hm.put("eleCommonCancel", By.xpath("//span[contains(text(),'Cancel')]"));
			hm.put("eljCommonCancel", By.xpath("//span[contains(text(),'Cancel')]"));
			hm.put("eleCommonStandardize", By.xpath("//span[contains(.,'Standardize')]"));
			hm.put("eleCommonAccountNumber", By.xpath(".//*[@id='HIGPolicyFile:PSPolicyTerm_ExtInfoBar:HIGAccountNumber-btnInnerEl']/span"));
			hm.put("eleQPBAccountNo", By.id("AccountFile:AccountFileInfoBar:Account-btnEl"));
			hm.put("eleSaveAsDraft", By.xpath("//*[contains(@id,'SaveAsDraftButton-btnInnerEl')]"));
			hm.put("eleCommonFinalize", By.xpath("//span[contains(text(),'Finalize')]"));
			hm.put("eleCommonErrorObject", By.xpath("//*[contains(@id,'_msgs')]"));
			hm.put("eleCommonZeroResults", By.xpath("//*[contains(@id,'_msgs')]"));
			hm.put("eleNextPage", By.xpath(".//*[@data-qtip='Next Page']"));
			hm.put("eleActvityScrollBottom", By.xpath("//*[contains(@class,'x-box-scroller x-menu-scroll-bottom x-unselectable')]"));
			hm.put("eleActvityScrollTop", By.xpath("//*[contains(@class,'x-box-scroller x-menu-scroll-top x-unselectable')]"));
			hm.put("eleShellSummaryActivityTable", By.id("HIGPolicyFile_Summary:26-body"));
			hm.put("eleCLAPolicyInfoMandatoryAlert", By.xpath("//div[contains(text(),'Please ensure Policy Number, Business Segment, Business Grouping, Effective Date, Expiration Date, MSI, SIC and Producer Code are populated before Issuance')]"));
			
			//LogIn Objects
			hm.put("edtUserName", By.id("Login:LoginScreen:LoginDV:username-inputEl"));
			hm.put("pwdPassword", By.id("Login:LoginScreen:LoginDV:password-inputEl"));  
			hm.put("btnLogin", By.id("Login:LoginScreen:LoginDV:submit-btnInnerEl"));
			
			//Objects under Action Menu which is Under Desktop Main Menu
			hm.put("eleDeskTopAction", By.id("Desktop:DesktopMenuActions-btnInnerEl"));
			hm.put("eleDeskTopNewAccount", By.id("Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewAccount-textEl"));
            hm.put("melDesktop", By.id("TabBar:DesktopTab-btnWrap"));
            hm.put("eleUnattachedDocument", By.id("TabBar:DesktopTab:Desktop_DesktopUnattachedDocumentsPage-itemEl"));
            hm.put("eleResearchUnattachedDocument", By.id("TabBar:DesktopTab:Desktop_DesktopUnattachedDocumentsPage2-textEl"));

			//Enter New Account Search Objects
			hm.put("edtCompanyName", By.id("NewAccount:NewAccountScreen:NewAccountSearchDV:companyName:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("eleAccountInfoSearch", By.id("NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleAccountInfoCreateNewAccount", By.id("NewAccount:NewAccountScreen:NewAccountButton-btnInnerEl"));
			hm.put("eleCreateNewAccountForPerson", By.id("NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Company-textEl"));
			
			//Create Account Objects
			//hm.put("edtAddress1", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
			hm.put("edtAddress1", By.xpath("//*[contains(@id,'GlobalAddressInputSet:AddressLine1-inputEl')]"));
			hm.put("edjAddress1", By.xpath("//*[contains(@id,'GlobalAddressInputSet:AddressLine1-inputEl')]"));
			//hm.put("eleCity", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
			hm.put("eleCity", By.xpath("//*[contains(@id,'GlobalAddressInputSet:City-inputEl')]"));
			hm.put("edtCity", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
			//hm.put("zedCity", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
			hm.put("zedCity", By.xpath("//*[contains(@id,'GlobalAddressInputSet:City-inputEl')]"));
			hm.put("lsjCity", By.xpath("//*[contains(@id,'GlobalAddressInputSet:City-inputEl')]"));
			//hm.put("lstState", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("lstState", By.xpath("//*[contains(@id,'GlobalAddressInputSet:State-inputEl')]"));
			hm.put("zedState", By.xpath("//*[contains(@id,'GlobalAddressInputSet:State-inputEl')]"));
			hm.put("lsjState", By.xpath("//*[contains(@id,'GlobalAddressInputSet:State-inputEl')]"));
			//hm.put("eleZipCode", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("eleZipCode", By.xpath("//*[contains(@id,'GlobalAddressInputSet:PostalCode-inputEl')]"));
			//hm.put("zedZipCode", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("zedZipCode", By.xpath("//*[contains(@id,'GlobalAddressInputSet:PostalCode-inputEl')]"));
			hm.put("lsjZipCode", By.xpath("//*[contains(@id,'GlobalAddressInputSet:PostalCode-inputEl')]"));
			//hm.put("eleStandardise", By.id("CreateAccount:CreateAccountScreen:standardizeButton_Ext-btnInnerEl"));
			hm.put("eleStandardise", By.xpath("//*[contains(@id,'standardizeButton_Ext-btnInnerEl')]"));
			hm.put("edtFirstName", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
			hm.put("edtLastName", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalPersonNameInputSet:LastName-inputEl"));
//			hm.put("edtAddress1", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
//			hm.put("eleCity", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
//			hm.put("edtCity", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
//			hm.put("zedCity", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
//			hm.put("lstState", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
//			hm.put("eleZipCode", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
//			hm.put("zedZipCode", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("lstZipCode", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("lstAddressType", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl"));
			hm.put("lstOrgType", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:OrgType-inputEl"));
			hm.put("eleOrgSearch", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:ProducerCode_Ext:SelectProducerCode_Ext"));
			hm.put("lstProducerCodeOrgType", By.id("OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:Type-inputEl"));
			hm.put("edtOrganizationName", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:Description-inputEl"));
			hm.put("eleOrgResSearch", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleOrgSearchResults", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchLV:0:_Select"));
			hm.put("lstProducerCode", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:ProducerCode-inputEl"));
			hm.put("eleUpdate", By.cssSelector("a[id='CreateAccount:CreateAccountScreen:updateButton_Ext'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("btnUpdate", By.id("CreateAccount:CreateAccountScreen:updateButton_Ext-btnInnerEl"));
			hm.put("eleCreateNewAccountNumber", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-inputEl"));
			hm.put("eleNew", By.id("MatchingSearchResults_ExtWorksheet:ToolbarButton-btnEl"));
			hm.put("eleAddSuccessMsg", By.id("CreateAccount:CreateAccountScreen:_msgs"));
			hm.put("eleAccountName", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:Name-inputEl")); 
			hm.put("eleAccountFileSummary", By.id("AccountFile_Summary:AccountFile_SummaryScreen:ttlBar"));
			hm.put("eleAccountFileSummaryPage", By.id("AccountFile_Summary:AccountFile_SummaryScreen:ttlBar"));
			hm.put("eleCreateAccountPage", By.id("CreateAccount:CreateAccountScreen:ttlBar"));
			hm.put("eleCreateAccountOK", By.id("button-1005-btnInnerEl"));
			hm.put("eleCreateAccountCancel", By.id("button-1008-btnInnerEl"));
			hm.put("eleCreateAccountMatchingRecordsPage", By.id("wsTabBar:wsTab_0-btnInnerEl"));
			hm.put("eleMatchingAccountCancle", By.id("MatchingSearchResults_ExtWorksheet:ToolbarButton1-btnInnerEl"));
			hm.put("eleCreateAccountMessagePage", By.id("messagebox-1001-displayfield-inputEl"));
			hm.put("eleEnterAccountInformationErrorMessages", By.id("NewAccount:NewAccountScreen:_msgs"));
			hm.put("eleCompanyNameExactMatch", By.id("NewAccount:NewAccountScreen:NewAccountSearchDV:CompanyNameExact-inputEl"));
			hm.put("eleEnterAccountInformationPage", By.id("NewAccount:NewAccountScreen:ttlBar"));
			hm.put("edtAccountProducerCode", By.xpath("//*[contains(@id,'ProducerCodeSearchDV:Code-inputEl')]"));
			
			//Edit Account
			hm.put("eleEdtButton", By.id("AccountFile_Summary:AccountFile_SummaryScreen:EditAccount-btnInnerEl"));
			hm.put("edtAIFNum", By.id("EditAccountPopup:EditAccountScreen:aifNumber_Ext-inputEl"));
			hm.put("edtAllianceNum", By.id("EditAccountPopup:EditAccountScreen:allianceNumber_Ext-inputEl"));
			hm.put("edtFEINNum", By.id("EditAccountPopup:EditAccountScreen:OfficialIDInputSet:OfficialIDDV_Input-inputEl"));
			hm.put("eleEditUpdate", By.cssSelector("a[id='EditAccountPopup:EditAccountScreen:updateButton_Ext'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("txtFEINNum", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl"));
			hm.put("txtAllianceNum", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:allianceNumber_Ext-inputEl"));
			hm.put("txtAIFNum", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:aif_Ext-inputEl"));
            hm.put("edtAcount_OfficePhone", By.id("EditAccountPopup:EditAccountScreen:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl"));
            hm.put("edtAccount_Fax", By.id("EditAccountPopup:EditAccountScreen:ContactNameInputSet:FaxPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl"));
            hm.put("edtAccount_PrimaryMail", By.id("EditAccountPopup:EditAccountScreen:ContactNameInputSet:EmailAddress1-inputEl"));
            hm.put("edtAccount_SecondaryMail", By.id("EditAccountPopup:EditAccountScreen:ContactNameInputSet:EmailAddress2-inputEl"));
            hm.put("edtAccount_Website", By.id("EditAccountPopup:EditAccountScreen:website_Ext-inputEl"));
            hm.put("eleAccount_PrimaryMail", By.id("EditAccountPopup:EditAccountScreen:ContactNameInputSet:EmailAddress1-inputEl"));

			//Contacts
			hm.put("eleCreateNewContact", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton-btnInnerEl"));
//			hm.put("elePrimaryContact", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:14:roleType-arrowEl"));
//			hm.put("elePrimaryNewPerson", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:14:roleType:0:contactType-textEl"));
			hm.put("elePrimaryContact", By.xpath(".//span[contains(text(), 'Primary Contact')]"));
			hm.put("elePrimaryNewPerson", By.xpath(".//span[contains(text(), 'New Person')]"));
			hm.put("edtFName", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
			hm.put("edtLName", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl"));
			hm.put("sclCTUpdate", By.id("NewAccountContactPopup:ContactDetailScreen:updateButton_Ext-btnInnerEl"));
			hm.put("eleContactUpdate", By.id("NewAccountContactPopup:ContactDetailScreen:updateButton_Ext-btnInnerEl"));
//			hm.put("eleSecondaryContact", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:14:roleType-arrowEl"));
//			hm.put("eleSecondaryNewPerson", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:14:roleType:1:contactType-textEl"));
//			hm.put("eleSecondaryContact", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:15:roleType-arrowEl"));
//			hm.put("eleSecondaryNewPerson", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:15:roleType:1:contactType-textEl"));
			hm.put("eleSecondaryContact", By.xpath(".//span[contains(text(), 'Secondary Contact')]"));
			hm.put("eleSecondaryNewPerson", By.xpath(".//span[contains(text(), 'New Person')]"));
			hm.put("eleSameAddressAs", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon"));
			hm.put("eleAccountHolder", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail-textEl"));
			hm.put("eleAccountAddress", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress"));
			hm.put("eleAssertContact", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:ttlBar"));
			hm.put("eleBillingContact", By.xpath(".//span[contains(text(), 'Billing Contact')]"));
			hm.put("eleBillingNewPerson", By.xpath(".//span[contains(text(), 'New Person')]"));
			hm.put("lsjAccountSummary_PolTran", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_WorkOrdersLV_tb:WorkOrdersCompletenessFilter-inputEl"));
			hm.put("edtContactFirstName", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
            hm.put("edtContactLasttName", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl"));

            
			//LogOut
//			hm.put("elePreferences", By.id(":TabLinkMenuButton-btnIconEl"));
			hm.put("elePreferences", By.id(":TabLinkMenuButton-btnInnerEl"));
			hm.put("eleLogOut", By.id("TabBar:LogoutTabBarLink-textEl"));	*/
		
			//Messages
			hm.put("elePCDriverErrorMessages", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:_msgs"));
			hm.put("elePCVehicleErrorMessages", By.xpath(".//div[contains(@id,':PAVehiclesScreen:_msgs')]"));
			hm.put("elePCBindErrorMessages", By.id("WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs"));
			hm.put("eleBCErrorMessage",By.id("AccountTransferWizard:AccountTransferWizardTransferScreen:CannotTransferToAListBillAccount"));
			
			
			//melAccount	edtAccountNumbar	eleAccountSearchi
			hm.put("melAccount", By.id("TabBar:AccountTab-btnWrap"));
			hm.put("melSearch", By.id("TabBar:SearchTab-btnInnerEl"));
			hm.put("eleSearchScreen", By.id("TabBar:SearchTab-btnInnerEl"));
			hm.put("melDesktop", By.id("TabBar:DesktopTab-btnWrap"));
			hm.put("melAdministration", By.id("TabBar:AdminTab-btnWrap"));
            hm.put("edtaccountNumber", By.id("TabBar:AccountTab:AccountTab_AccountNumberSearchItem-inputEl"));    
            hm.put("btnAccountSearch", By.id("TabBar:AccountTab:AccountTab_AccountNumberSearchItem_Button"));
            hm.put("eleSearchAccount", By.id("TabBar:SearchTab:Search_AccountSearch-textEl"));

			//NewSubmission 
//			hm.put("eleActions", By.id("AccountFile:AccountFileMenuActions-btnIconEl"));
			hm.put("eleActions", By.xpath(".//*[contains(@id,'MenuActions-btnInnerEl')]"));
			hm.put("eleNewSubmission", By.id("AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-textEl")); 					
			hm.put("eleOrganisationSearch", By.id("NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:Producer:SelectOrganization"));
			hm.put("edtOrganisationName", By.id("OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("eleSearchButton", By.id("OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleSearchResult", By.id("OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchResultsLV:0:_Select"));
			hm.put("lstProduverCodeList", By.id("NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerCode-inputEl"));
			//hm.put("lstSegment", By.id("NewSubmission:NewSubmissionScreen:ProductSettingsDV:segment_Ext-inputEl"));
//			hm.put("eleWorkeComp", By.id("NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:0:addSubmission"));
//			hm.put("btnWorkerComp", By.id("NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:0:addSubmission"));
//			hm.put("eljWorkerComp", By.id("NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:0:addSubmission"));
			//hm.put("assertforPolicyINFOPage", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:DateQuoteNeeded-labelEl"));
			//hm.put("eleassertforPolicyINFOPage", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:DateQuoteNeeded-labelEl"));
			
			//hm.put("lstBusinessGroup", By.id("NewSubmission:NewSubmissionScreen:ProductSettingsDV:businessGrouping_Ext-inputEl"));
			//hm.put("lstSalesAgreementCode", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:SalesAgreementCode-inputEl"));
			//hm.put("eljShell", By.id("NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:0:addSubmission"));
			//hm.put("eljSOR", By.id("NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:0:SystemOfRecord"));
//			hm.put("eleProductNameTable", By.id("NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body"));
			hm.put("eleMultiple", By.id("NewSubmission:NewSubmissionScreen:ProductSettingsDV:CreateSingle_false-inputEl"));
			hm.put("eleSingle", By.id("NewSubmission:NewSubmissionScreen:ProductSettingsDV:CreateSingle_true-inputEl"));
			hm.put("eleDefaultBaseState", By.id("NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultBaseState-inputEl"));
			hm.put("lstDefaultBaseState", By.id("NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultBaseState-inputEl"));
			//hm.put("edtEffDate", By.id("NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultPPEffDate_Ext-inputEl"));
			hm.put("edtEffDate", By.xpath(".//input[contains(@id,'nullDate-inputEl')]"));
			hm.put("elePersonalAuto", By.id("NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:0:addSubmission"));
			hm.put("eleHomeOwners", By.id("NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:1:addSubmission"));
			//hm.put("eleProductNameTable", By.id("NewSubmission:NewSubmissionScreen:ProductSelectionLV-body"));
			hm.put("funSelectLOB", By.id("NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body"));
			//hm.put("funSelectLOB", By.id("NewSubmission:NewSubmissionScreen:ProductSelectionLV"));
			//hm.put("eleMultiple", By.id("NewSubmission:NewSubmissionScreen:ProductSettingsDV:CreateSingle_false-inputEl"));
			//hm.put("eleSingle", By.id("NewSubmission:NewSubmissionScreen:ProductSettingsDV:CreateSingle_true-inputEl"));
//			hm.put("eleMakeSubmissions", By.id("NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV_tb:MakeSubmissions-btnInnerEl"));
			hm.put("eleMakeSubmissions", By.id("NewSubmission:NewSubmissionScreen:ProductSelectionLV_tb:MakeSubmissions"));
			hm.put("eleNewSubmissionTitle", By.id("NewSubmission:NewSubmissionScreen:ttlBar")); 
			//hm.put("edtEffDate", By.id("NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultPPEffDate_Ext-inputEl"));
           // hm.put("edtExpDate", By.id("NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultExpirationDate-inputEl"));
			hm.put("eleStates", By.xpath("html/body/div[11]/div/ul"));

            //Qulaifications
			/* hm.put("elePAEligibility1Yes", By.id("radio-1807-inputEl"));
			hm.put("elePAEligibility1No", By.id("radio-1808-inputEl"));
			
			hm.put("elePAEligibility2Yes", By.id("radio-1809-inputEl"));
			hm.put("elePAEligibility2No", By.id("radio-1810-inputEl"));
			
			hm.put("elePAEligibility3Yes", By.id("radio-1811-inputEl"));
			hm.put("elePAEligibility3No", By.id("radio-1812-inputEl"));
			
			hm.put("elePAEligibility4Yes", By.id("radio-1813-inputEl"));
			hm.put("elePAEligibility4No", By.id("radio-1814-inputEl"));
			
			hm.put("elePAEligibility5Yes", By.id("radio-1815-inputEl"));
			hm.put("elePAEligibility5No", By.id("radio-1816-inputEl")); */
		
		hm.put("eleHOPolicyTypeLbl", By.xpath(".//span[contains(text(),'Policy Type')]"));
		hm.put("eleQualificationScroll", By.xpath(".//div[contains(@id,'centerPanel')]"));
		hm.put("eleQualificationScreen", By.xpath(".//span[contains(@id, 'PreQualificationScreen:ttlBar')]"));
		hm.put("elePAEligibilityTable", By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:1:QuestionSetLV-body"));
		hm.put("eleHOPolicyType", By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:HOPolicyType-inputEl"));
		hm.put("lstHOPolicyType", By.xpath(".//input[contains(@id, 'PolicyType-inputEl')]"));
		
		//hm.put("eleHOPolicyTable", By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV-table"));
		//hm.put("eleHO3PolicyEligibilityTable", By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV-table"));
		hm.put("eleHOPolicyTable", By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:0:QuestionSetLV"));
		hm.put("eleHO3PolicyEligibilityTable", By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:2:QuestionSetLV-body"));
		hm.put("eleHO3HomeEligibilityTable", By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:2:QuestionSetLV-body"));
		
		hm.put("eleHO4PolicytTable", By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:1:QuestionSetLV-body"));
		hm.put("eleHO6EligibilityTable", By.id(""));
		hm.put("eleHOTypeOfBusiness", By.xpath("html/body/div[4]/table/tbody/tr/td/div/table/tbody/tr[5]/td/div/table/tbody/tr[1]/td/div/div[2]/div[1]/div[1]/table[3]/tbody/tr/td[2]/div"));
		hm.put("edtHOTypeofBusiness2", By.xpath("html/body/div[4]/table/tbody/tr/td/div/table/tbody/tr[5]/td/div/table/tbody/tr[1]/td/div/div[2]/div[1]/div[2]/div/div/div/div[1]/input"));
		hm.put("elePlzProvideDetails", By.xpath("html/body/div[4]/table/tbody/tr/td/div/table/tbody/tr[5]/td/div/table/tbody/tr[3]/td/div/div[2]/div[1]/div/table[19]/tbody/tr/td[2]/div"));
		hm.put("edtProvideDetails", By.xpath("html/body/div[4]/table/tbody/tr/td/div/table/tbody/tr[5]/td/div/table/tbody/tr[3]/td/div/div[2]/div[1]/div[2]/div/div/div/div/textarea"));
		//Organisation
		//	hm.put("eleOrganisation", By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:ttlBar"));
			
			//Next is common for all the pages
			hm.put("eleNext",By.xpath(".//span[contains(@id,':Next-btnInnerEl')]"));
			hm.put("eljNext", By.xpath(".//span[contains(@id,':Next-btnInnerEl')]"));
			//hm.put("eleNext", By.xpath(".//span[contains(text(),'Next-btnInnerEl')]"));

			
			
			//PolicyInfo
			hm.put("elePolicyInfoTab", By.xpath(".//span[contains(text(),'Policy Info')]"));
			hm.put("eljPolicyInfoTab", By.xpath(".//span[contains(text(),'Policy Info')]"));
			hm.put("btnMultiProductLife", By.xpath(".//input[contains(@id,'MultiProductDisc_AcgInputSet:life-inputEl')]"));
			hm.put("edtAcgLifePL", By.xpath(".//input[contains(@id,'acgLifePolicyNumber-inputEl')]"));
			hm.put("btnMultiProductHome", By.xpath(".//input[contains(@id,'MultiProductDisc_AcgInputSet:home-inputEl')]"));
			hm.put("btnMultiProductCondo", By.xpath(".//input[contains(@id,'MultiProductDisc_AcgInputSet:condo-inputEl')]"));
			hm.put("btnMultiProductRenters", By.xpath(".//input[contains(@id,'MultiProductDisc_AcgInputSet:renters-inputEl')]"));
			
			hm.put("eleMultiProductHomeOwn", By.xpath(".//input[contains(@id,'question_option1-inputEl')]"));
			hm.put("eleMultiProductCondoOwn", By.xpath(".//input[contains(@id,'question_option2-inputEl')]"));
			hm.put("eleMultiProductNone", By.xpath(".//input[contains(@id,'question_option3-inputEl')]"));
			hm.put("eleMultiProductMobileHome",  By.xpath(".//input[contains(@id,'question_option3-inputEl')]"));
			hm.put("eleMultiProductNoneFL", By.xpath(".//input[contains(@id,'question_option4-inputEl')]"));
			hm.put("btnHomeAuto", By.xpath(".//input[contains(@id,'MultiProductDisc_AcgInputSet:auto-inputEl')]"));
			hm.put("btnHomeLife", By.xpath(".//input[contains(@id,'MultiProductDisc_AcgInputSet:life-inputEl')]"));
			hm.put("eleCommonOrderPrefillYes", By.xpath(".//input[contains(@id, 'isPrefillOrdered_true-inputEl')]"));
			hm.put("edtPNIMembershipNo", By.xpath(".//input[contains(@id,'MembershipPNIInputSet:membership-inputEl')]"));
			hm.put("eleCommonOrderPrefillNo", By.xpath(".//input[contains(@id, 'isPrefillOrdered_false-inputEl')]"));
			hm.put("eleFirstCompanyYes", By.xpath(".//input[contains(@id,'Company_true-inputEl')]"));
			hm.put("eleFirstCompanyNo", By.xpath(".//input[contains(@id,'Company_false-inputEl')]"));
			
			hm.put("btnQuote", By.xpath(".//span[contains(@id,':QuoteOrReview-btnInnerEl')]"));
			hm.put("eljQuote", By.xpath(".//span[contains(@id,':QuoteOrReview-btnInnerEl')]"));
			hm.put("elePISaveDraft", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:Draft-btnInnerEl"));
			hm.put("eljPISaveDraft", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:Draft-btnInnerEl"));
			
			hm.put("eleSameAsPolicyAddYes", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:MailingAddInfo_AcgInputSet:mailingsameaspolicy_true-inputEl"));
			hm.put("eleSameAsPolicyAddNo", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:MailingAddInfo_AcgInputSet:mailingsameaspolicy_false-inputEl"));
			hm.put("elePreviousAddressYes", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PreviousAddInfo_AcgInputSet:prevstaylessthan3_true-inputEl"));
			hm.put("elePreviousAddressNo", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PreviousAddInfo_AcgInputSet:prevstaylessthan3_false-inputEl"));
			hm.put("elePolicyEffDate", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-inputEl"));
			hm.put("edtPolicyEffDate", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-inputEl"));
			hm.put("btnPolicyOrganizationSearch", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:Producer:SelectOrganization"));
			hm.put("edtOrganizationName", By.id("OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("eleSearchButton", By.id("OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleSearchResult", By.id("OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchResultsLV:0:_Select"));
			hm.put("lstPolicyProducerCode", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:ProducerCode-inputEl"));
			
			hm.put("btnPolicyOrganizationSearch1", By.xpath(".//div[contains(@id, 'PolicyInfoProducerOfRecordInputSet:Producer1:SelectOrganization')]"));			
			hm.put("lstPolicyProducerCode1", By.xpath(".//input[contains(@id, 'PolicyInfoProducerOfRecordInputSet:ProducerCode4-inputEl')]"));

			hm.put("elePrefferedTier", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:ProducerCode-trigger-picker"));
			hm.put("lstPrefferedTier", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AutoTier_AcgInputSet:auto_tier-inputEl"));
			hm.put("elePaperLessCommunicationNo", By.xpath(".//input[contains(@id, 'SignupforPaperlessCommunication_false-inputEl')]"));
			hm.put("elePaperLessCommunicationYes", By.xpath(".//input[contains(@id, 'SignupforPaperlessCommunication_true-inputEl')]"));
			hm.put("elePaperLessDiscYes", By.xpath(".//input[contains(@id, 'PaperlessDiscount_true-inputEl')]"));
			hm.put("elePaperLessDiscNo", By.xpath(".//input[contains(@id, 'PaperlessDiscount_false-inputEl')]"));
			hm.put("elePaperLessDiscConsentYes", By.xpath(".//input[contains(@id, 'PaperlessConsentText_true-inputEl')]"));
			hm.put("elePaperLessDiscConsentNo", By.xpath(".//input[contains(@id, 'PaperlessConsentText_false-inputEl')]"));
			hm.put("lstPaperlessContract",By.xpath(".//input[contains(@id, 'PaperlessContactType-inputEl')]"));
			hm.put("elePNIAAAMembershipYes", By.xpath(".//input[contains(@id,'PNIMemberShipID_true-inputEl')]"));
			hm.put("elePNIAAAMembershipNo", By.xpath(".//input[contains(@id,'PNIMemberShipID_false-inputEl')]"));
			hm.put("edtMemberSince", By.xpath(".//input[contains(@id,'membersince-inputEl')]"));
			hm.put("elesellMembershipYes", By.xpath(".//input[contains(@id,':sellMembershipID_true-inputEl')]"));
			hm.put("elesellMembershipNo", By.xpath(".//input[contains(@id,':sellMembershipID_false-inputEl')]"));
			
			hm.put("edtEmailPNI",By.xpath(".//input[contains(@id, ':emailPNI-inputEl')]"));
			hm.put("edtReenterMail", By.xpath("//input[contains(@id, ':ReEnterEmailPNI-inputEl')]"));
			hm.put("eleSNIIcon", By.xpath(".//a[contains(@id,'ChangeSecondaryNamedInsuredButtonMenuIcon')]"));
			hm.put("eleScndNamedInsuFromAddrBook", By.xpath(".//a[contains(@id,'SecondaryNamedInsuredABContactAdder-itemEl')]"));
			hm.put("eleSNIAdded", By.xpath(".//div[contains(@id,'ChangeSecondaryNamedInsuredButton-inputEl')]"));
			
			hm.put("elePIErrorMsgs", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:_msgs"));
			hm.put("edtSSN", By.xpath(".//input[contains(@id,'OfficialIDDV_Input-inputEl')]"));
			hm.put("eleAffinityGroup", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:AffinityGroup:SelectAffinityGroup"));
			hm.put("elePolicyAddress", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:ChangePolicyAddressButton:ChangePolicyAddressButtonMenuIcon"));	
			hm.put("eleEditCurrentAddress",By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:ChangePolicyAddressButton:EditPolicyAddressMenuItem-itemEl"));
			hm.put("edtPIHouseNumber", By.id("EditPolicyAddressPopup:PolicyAddressInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
			hm.put("edtPIStreetName", By.id("EditPolicyAddressPopup:PolicyAddressInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine2-inputEl"));
			hm.put("edtPICity", By.id("EditPolicyAddressPopup:PolicyAddressInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
			hm.put("lstPIState",By.id("EditPolicyAddressPopup:PolicyAddressInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("edtPIZipcode",By.id("EditPolicyAddressPopup:PolicyAddressInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("eleStandardize", By.id("EditPolicyAddressPopup:Standardize-btnInnerEl"));
			hm.put("eleAddressServerError", By.id("AddressStandardize_AcgPopup:0"));
			hm.put("elePIOverrideAddress", By.id("AddressStandardize_AcgPopup:override-btnInnerEl"));	
			hm.put("edtCensusTract", By.xpath(".//input[contains(@id, ':censustract-inputEl')]"));
			hm.put("eleUpdateCommon", By.xpath(".//span[contains(@id, 'Update-btnInnerEl')]"));
			hm.put("eleCloseOptionsPI",By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:CloseOptions-btnWrap"));	
			hm.put("elePolPrimNameInsired", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Name-inputEl"));
			hm.put("edtPolPrimDOB", By.xpath(".//input[contains(@id,'DateOfBirth-inputEl')]"));			
			hm.put("elePolPrimContentofTextYes", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolNamedInsuredDetails_AcgInputSet:ConsentToText_true-inputEl"));
			hm.put("eleNamedInsured", By.xpath(".//a[contains(@id,'ChangeSecondaryNamedInsuredButtonMenuIcon')]"));
		//	hm.put("eleSNIIcon", By.xpath(".//a[contains(@id,'ChangeSecondaryNamedInsuredButtonMenuIcon')]"));
			hm.put("eleSNIAdded", By.xpath(".//div[contains(@id,'ChangeSecondaryNamedInsuredButton-inputEl')]"));
			hm.put("edtSNIRelationNI", By.xpath(".//input[contains(@id,'RelationshipwidPrimary-inputEl')]"));
			hm.put("eleScndNamedInsuFromAddrBook", By.xpath(".//a[contains(@id,'SecondaryNamedInsuredABContactAdder-itemEl')]"));
			
			//hm.put("eleNamedInsured", By.xpath(".//a[contains(@id,'')]"));
			hm.put("eleNewPerson", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton:AdditionalNamedPersonAdder-itemEl"));
			hm.put("lstRelationshiptoInsured",By.xpath(".//input[contains(@id,'Relationship')]"));
			hm.put("eleNamedInsuredSSN", By.id("NewSecondaryNamedInsuredPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:OfficialIDriver:OfficialIDInputSet:OfficialIDDV_Input-inputEl"));
			hm.put("edtNamedInsuredSSN", By.id("NewSecondaryNamedInsuredPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:OfficialIDriver:OfficialIDInputSet:OfficialIDDV_Input-inputEl"));
			hm.put("eleNamedIsnuredSamePolicyAddresYes", By.xpath(".//input[contains(@id,'SecondaryNamedInsuredInputSet:MailingAddInfo_AcgInputSet:mailingsameaspolicy_true-inputEl')]"));
			hm.put("eleNamedIsnuredSamePolicyAddresNo", By.xpath(".//input[contains(@id,'SecondaryNamedInsuredInputSet:MailingAddInfo_AcgInputSet:mailingsameaspolicy_false-inputEl')]"));
			hm.put("eleNamedInsuredlessthan3yearsYes", By.xpath(".//input[contains(@id,'SecondaryNamedInsuredInputSet:PreviousAddInfo_AcgInputSet:prevstaylessthan3_true-inputEl')]"));
			hm.put("eleNamedInsuredlessthan3yearsNo", By.xpath(".//input[contains(@id,'SecondaryNamedInsuredInputSet:PreviousAddInfo_AcgInputSet:prevstaylessthan3_false-inputEl')]"));
			hm.put("eleSNIMemebershipYes", By.xpath(".//input[contains(@id,'SecondaryNamedInsuredInputSet:MembershipSNIInputSet:PNIMemberShipID_true-inputEl')]"));
			hm.put("eleSNIMemebershipNo", By.xpath(".//input[contains(@id,'SecondaryNamedInsuredInputSet:MembershipSNIInputSet:PNIMemberShipID_false-inputEl')]"));
			hm.put("eleChangePrimaryInsured", By.xpath(".//a[contains(@id,'ChangePrimaryNamedInsuredButtonMenuIcon')]"));
			hm.put("eleNewPersonPNI", By.xpath(".//span[contains(@id,'AdditionalNamedPersonAdder-textEl')]"));
			hm.put("eleNamedInsuredResDwelYes", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolNamedInsuredDetails_AcgInputSet:ResOfDwelling_true-inputEl"));
			hm.put("eleNamedInsuredResDwelNo", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolNamedInsuredDetails_AcgInputSet:ResOfDwelling_false-inputEl"));
			hm.put("eleNamedInsuredAddrTab", By.xpath(".//span[contains(@id,'AddressesCardTab-btnInnerEl')]"));
			hm.put("eleNamedInsuredClick", By.xpath(".//div[contains(@id,'ChangeSecondaryNamedInsuredButton-inputEl')]"));
			hm.put("eleNamedInsuredHISameAsNamedInsuredYes", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOPriorInsuranceHOEScreen:AdditionalDetailsHome_AcgDV:SNISameAsPNI_true-inputEl"));
			hm.put("eleNamedInsuredHISameAsNamedInsuredNo", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOPriorInsuranceHOEScreen:AdditionalDetailsHome_AcgDV:SNISameAsPNI_false-inputEl"));
			hm.put("eleNamedInsuredAISameAsNamedInsuredYes", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOPriorInsuranceHOEScreen:AdditionalDetailsHome_AcgDV:SNIDetailsSameAsPNI_true-inputEl"));
			hm.put("eleNamedInsuredAISameAsNamedInsuredNo", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOPriorInsuranceHOEScreen:AdditionalDetailsHome_AcgDV:SNIDetailsSameAsPNI_false-inputEl"));
			hm.put("eleAccAAAMembershipYes", By.xpath(".//input[contains(@id, 'AccountInfoInputSet:MembershipPNIInputSet:PNIMemberShipID_true-inputEl')]"));
			hm.put("eleAccAAAMembershipNo", By.xpath(".//input[contains(@id, 'AccountInfoInputSet:MembershipPNIInputSet:PNIMemberShipID_false-inputEl')]"));
			hm.put("edtAccAAAMembershipNumber", By.xpath(".//input[contains(@id, 'AccountInfoInputSet:MembershipPNIInputSet:membership-inputEl')]"));
			hm.put("edtAccAAAMembersince", By.xpath(".//input[contains(@id, 'AccountInfoInputSet:MembershipPNIInputSet:membersince-inputEl')]"));
			hm.put("eleAccBypassValidation", By.xpath(".//input[contains(@id, 'MembershipPNIInputSet:byPassValidation-inputEl')]"));
			hm.put("eleSecAAAMembershipYes", By.xpath(".//input[contains(@id, 'SecondaryNamedInsuredInputSet:MembershipSNIInputSet:PNIMemberShipID_true-inputEl')]"));
			hm.put("eleSecAAAMembershipNo", By.xpath(".//input[contains(@id, 'SecondaryNamedInsuredInputSet:MembershipSNIInputSet:PNIMemberShipID_false-inputEl')]"));
			hm.put("elePrimaryNamedInsured", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Name-inputEl"));
			hm.put("edtPrimaryNamedInsuredDOB", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:PolicyContactRoleDetails_AcgInputSet:DateOfBirth-inputEl"));
			hm.put("lstEducationLevel", By.xpath(".//input[contains(@id, 'EducationLevel-inputEl')]"));

			hm.put("eleOtherACGPoliciesLIFE", By.xpath(".//input[contains(@id, ':life-inputEl')]"));
			
			hm.put("elePolPrimContentofTextNo", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolNamedInsuredDetails_AcgInputSet:ConsentToText_false-inputEl"));
			hm.put("eleFirstHIQuoteTrue", By.xpath(".//input[contains(@id,'isFirstHomeCompany_true')]"));
			hm.put("eleFirstAPQuoteTrue", By.xpath(".//input[contains(@id,'isFirstAutoCompany_true')]"));
			hm.put("eleOtherACGPolNone", By.xpath(".//label[contains(text(),'None')]"));
			//hm.put("edtCensusTract", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:PolicyContactDetailsDV:censustract-inputEl"));
//Decline
			
			hm.put("eleDecline",By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:CloseOptions:Decline-textEl"));
			hm.put("eleSDReasonCode",By.id("DeclineReasonPopup:RejectScreen:RejectReasonDV:RejectReason-inputEl"));
			hm.put("lstSDReasonCode",By.id("DeclineReasonPopup:RejectScreen:RejectReasonDV:RejectReason-inputEl"));
			hm.put("edtReasonText", By.id("DeclineReasonPopup:RejectScreen:RejectReasonDV:RejectReasonText-inputEl"));
			hm.put("eleSDDecline", By.id("DeclineReasonPopup:RejectScreen:Update-btnInnerEl"));
		
			hm.put("eleSNTSubmission",By.id("JobComplete:JobCompleteScreen:JobCompleteDV:ViewJob-inputEl"));
		
			
			
			hm.put("eleHistorySubmission",By.id("SubmissionWizard:History"));
			hm.put("elePFinish", By.xpath(".//span[contains(@id,'Finish-btnInnerEl')]"));
				//Nottaken
			
			hm.put("eleNotTakenJob",By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:CloseOptions:NotTakenJob-itemEl"));
			hm.put("eleNTReasonCode",By.id("NotTakenReasonPopup:RejectScreen:RejectReasonDV:RejectReason-inputEl"));
			hm.put("lstNTReasonCode",By.id("NotTakenReasonPopup:RejectScreen:RejectReasonDV:RejectReason-inputEl"));
			hm.put("edtNTReasonText", By.id("NotTakenReasonPopup:RejectScreen:RejectReasonDV:RejectReasonText-inputEl"));
			hm.put("eleNTRNotTaken",By.id("NotTakenReasonPopup:RejectScreen:Update-btnInnerEl"));
			hm.put("eleNTRSbumission",By.id("JobComplete:JobCompleteScreen:JobCompleteDV:ViewJob-inputEl"));
			hm.put("eleHistorySubmission",By.id("SubmissionWizard:History"));
				///Affinity Groups
			hm.put("edtAffinityGroupName", By.id("AffinityGroupSearchPopup:AffinityGroupSearchScreen:AffinityGroupSearchDV:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("lstAffinityGroupType", By.id("AffinityGroupSearchPopup:AffinityGroupSearchScreen:AffinityGroupSearchDV:GroupType-inputEl"));
				///Home Owners 
			hm.put("eleHOBaseState", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:BaseState-inputEl"));
			hm.put("lstHOBaseState", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:BaseState-inputEl"));
			hm.put("btnOrderHLHistory", By.xpath(".//span[contains(@id,'homeLoss:orderHLH-btnInnerEl')]"));
					
			
		/*	hm.put("edtFEIN", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyOfficialIDInputSet:OfficialIDDV_Input-inputEl"));
			hm.put("eleIndustryCodeSearch", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:IndustryCode:SelectIndustryCode"));
			hm.put("edtIndustryCode", By.id("IndustryCodeSearchPopup:IndustryCodeSearchScreen:IndustryCodeSearchDV:Code-inputEl"));
			hm.put("btnSearchButton", By.id("IndustryCodeSearchPopup:IndustryCodeSearchScreen:IndustryCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleSelectCode", By.id("IndustryCodeSearchPopup:IndustryCodeSearchScreen:IndustryCodeSearchResultsLV:0:_Select"));
			hm.put("edtIndusCode", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:IndustryCode-inputEl"));
			hm.put("edtNAICS", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:NAICSIndustryCode-inputEl"));
			hm.put("edtMSI", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:MSIExt-inputEl") );
			hm.put("edtEBS", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:YearBusinessStarted-inputEl"));
			hm.put("lstOrganisationType", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OrganizationType-inputEl") );
			hm.put("lstProductType", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ProductType-inputEl"));
//			hm.put("lstSubmissionSource", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:SubmissionSource-inputEl") );
			hm.put("lstSubmissionSource", By.xpath(".//*[contains(@id,'SubmissionSource-inputEl')]") );
			hm.put("edtNPNNum", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:NPNNumber-inputEl") );
			hm.put("lstAffinityGroup", By.xpath(".//*[contains(@id,'AffinityGroup1-inputEl')]") );
			hm.put("lstTradeMark", By.xpath(".//*[contains(@id,'Trademark-inputEl')]") );
         	hm.put("elePolicyInfoAssert", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:ttlBar"));
//			hm.put("elePolicyInfoAssert", By.id("PolicyFile_PolicyInfo:PolicyFile_PolicyInfoScreen:0"));
            hm.put("elePolBORStartDate", By.id("PolicyFile_PolicyInfo:PolicyFile_PolicyInfoScreen:PolicyFile_PolicyInfoDV:PolicyInfoInputSet:QuotePresented-bodyEl"));
            hm.put("elePolBOREndDate",By.id("PolicyFile_PolicyInfo:PolicyFile_PolicyInfoScreen:PolicyFile_PolicyInfoDV:PolicyInfoInputSet:QuoteSuccessful-bodyEl"));*/
			//Payment PC
			hm.put("elePaymentPCScreen", By.id("SubmissionWizard:BillingInfo"));
			//Add and Reconcile Drivers
			hm.put("eleDiscoveredDriversTable", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAPrefillDriversScreen:discoverDrivers:PrefillDriversLV-body"));
			hm.put("eleHouseHolderDriversTable", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAPrefillDriversScreen:houseHoldDrivers:PrefillDriversLV-body"));
			hm.put("btnAddandReconcileMerge", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAPrefillDriversScreen:houseHoldDrivers:PrefillDriversLV_tb:merge"));
			hm.put("elecommonAdd", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAPrefillDriversScreen:discoverDrivers:PrefillDriversLV_tb:add"));
			
			//Drivers
			hm.put("lstDayOfMonth", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BindSummaryDV:InvoiceStreamInputSet:DayOfMonth-inputEl"));
			hm.put("elePaymentErrorMsgs", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:_msgs"));
			hm.put("eleDoUWishToPayNowYES", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:IsReadyToPay_true-inputEl"));
			hm.put("eleDoUWishToPayNowNo", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:IsReadyToPay_false-inputEl"));
			//Drivers :AddDriver:AddFromSearch-itemEl
			hm.put("eleDriverfromAddrBook", By.xpath(".//a[contains(@id, ':AddDriver:AddFromSearch-itemEl')]"));
			
			hm.put("eleAddDriver", By.xpath(".//a[contains(@id, 'AddDriver')]"));
			hm.put("lstAddDriver", By.className("x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small"));
			hm.put("eleAddNewPerson", By.xpath(".//span[contains(@id, 'AddDriver:0:ContactType-textEl')]"));
			hm.put("btnRemoveDriver", By.xpath(".//span[contains(@id, ':DriversLV_tb:Remove-btnInnerEl')]"));
			hm.put("edtDriverGender", By.id("NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:Gender-inputEl"));
			hm.put("eleResidentofHouseholdYes", By.xpath(".//input[contains(@id, 'ResOfHousehold_true-inputEl')]"));
			hm.put("eleResidentofHouseholdNo", By.xpath(".//input[contains(@id, 'ResOfHousehold_false-inputEl')]"));
			hm.put("edtACGAutoTenureDate", By.xpath(".//input[contains(@id, ':AcgAutoTenureDate-inputEl')]"));
			hm.put("edtSelectAutoTenureDate", By.id("NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:SelectAutoTenureDate-inputEl"));
			hm.put("edtDriverStatus", By.xpath(".//input[contains(@id, 'LicenseInputSet:DriverStatus1-inputEl')]"));
			hm.put("eleDriverStatus", By.xpath(".//input[contains(@id, 'LicenseInputSet:DriverStatus1-inputEl')]"));

			hm.put("edtAgeLicensedinUS", By.xpath(".//input[contains(@id, 'LicenseInputSet:AgeLicensedInUS-inputEl')]"));
			hm.put("edtDateLicensed", By.xpath(".//input[contains(@id, 'LicenseInputSet:DateLicenced-inputEl')]"));
					
			hm.put("eleContentofTextYes", By.id("NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:PolicyContactRoleOtherDetails_AcgInputSet:ConsentToText_true-inputEl"));
			hm.put("eleContentofTextNo", By.id("NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:PolicyContactRoleOtherDetails_AcgInputSet:ConsentToText_flase--inputEl"));
			//hm.put("eleRefusedToProvideInfo", By.xpath(".//input[contains(@id,'RefusedToProvideInfoRe-inputEl')]"));
			//driver gender field which was duplicated
			hm.put("edtDriverGenderDuplicate", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:Gender-inputEl"));
			//hm.put("eleDriversTab", By.xpath("html/body/div[2]/div/div/div/div[3]/div[3]/div[1]/div/table[5]/tbody/tr/td/div"));
			hm.put("eleDriversTab",By.id("SubmissionWizard:LOBWizardStepGroup:PADrivers"));
			hm.put("edtDriverMaritalStatus",By.xpath(".//input[contains(@id, ':MaritalStatus-inputEl')]"));
			hm.put("eleSameAsInsuredYes", By.xpath(".//input[contains(@id, 'SameAsPNI_true-inputEl')]"));
			hm.put("eljSameAsInsuredYes", By.xpath(".//input[contains(@id, 'SameAsPNI_true-inputEl')]"));
			hm.put("eleSameAsInsuredNo", By.xpath(".//input[contains(@id, 'SameAsPNI_false-inputEl')]"));
			hm.put("edtPriorAutoIns", By.xpath(".//input[contains(@id, 'AdditionalDetails_AcgDV:HasPriorPolicy-inputEl')]"));
					
			hm.put("edtCarrierName", By.xpath(".//input[contains(@id, 'AdditionalDetails_AcgDV:CarrierName-inputEl')]"));					
			hm.put("edtDriverBodilyInjured",  By.xpath(".//input[contains(@id, 'AdditionalDetails_AcgDV:BodilyInjuryLimitType-inputEl')]"));					
			hm.put("edtDriverExpirationDate", By.xpath(".//input[contains(@id, 'AdditionalDetails_AcgDV:ExpirationDate-inputEl')]"));					
			hm.put("edtYearsWithPrior", By.xpath(".//input[contains(@id, 'AdditionalDetails_AcgDV:YearsWithPriorCarrier-inputEl')]"));					
			hm.put("edtYearwithSecondPrior", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:0:PolicyContactRolePanelSet:AdditionalDetails_AcgDV:YearsWithSecondPriorCarrier-inputEl"));
			
			hm.put("eleAdditionalDetailsTab", By.xpath(".//a[contains(@id, ':AdditionalDetailcCardTab')]"));
			
			hm.put("btnRetrieveMVR", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:RetrieveMVRButton"));
			hm.put("Order/RetrieveMVR", By.xpath(".//span[contains(text(),'Order/Retrieve MVR')]"));
			hm.put("eleSelectallMVR", By.xpath(".//div[contains(@id,'MVRReportLV')]//div[2]//div//div//div//div//span//span//span//div"));
			hm.put("eleSnowPlowNo", By.xpath(".//input[contains(@id, 'IsSnowAttachedVehicle_false-inputEl')]"));
			hm.put("eleSnowPlowYes", By.xpath(".//input[contains(@id, 'IsSnowAttachedVehicle_true-inputEl')]"));
			
			hm.put("eleReturntoDrivers", By.id("DriverMVRInfoPopup:__crumb__"));
			hm.put("eleContactDetailsTab", By.xpath(".//span[contains(@id,'PolicyContactDetailCardTab-btnInnerEl')]"));
			
			hm.put("eleDriverfromAddrBook", By.xpath(".//a[contains(@id, ':AddDriver:AddFromSearch-itemEl')]"));
			hm.put("eleCommonSearch", By.xpath(".//a[contains(@id,':SearchLinksInputSet:Search')]"));
			hm.put("eleCommonCreateNewContact", By.xpath(".//a[contains(@id,':CreateNewPerson')]"));
			
			hm.put("eleSecNamedInsuredButton", By.xpath(".//a[contains(@id, 'ChangeSecondaryNamedInsuredButtonMenuIcon')]"));
			hm.put("eleSecNamedInsured", By.xpath(".//a[contains(@id, 'SecondaryNamedInsuredABContactAdder-itemEl')]"));
			hm.put("eleSecInsuredUpdBtn", By.xpath(".//span[contains(@id, 'NewContactPopup:isFromPolicy-btnInnerEl')]"));
			//hm.put("eleSecInsuredSrhTbl", By.xpath(".//div[contains(@id, 'ContactSearchResultsLV-body')]"));
			hm.put("eleSecInsuredSrhTbl", By.xpath(".//div[contains(@id, 'ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV-body')]"));
			
			///Contact Details
			hm.put("edtNewDriverFirstName", By.id("NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
			hm.put("edtNewDriverLastName", By.id("NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:LastName-inputEl"));
			hm.put("edtNewDriverHouseNum", By.id("NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
			hm.put("edtNewDriverStrtName", By.id("NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine2-inputEl"));
			hm.put("edtNewDriverZipCode", By.id("NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("eleNewDriverAddrType", By.id("NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:AddressType-inputEl"));
			hm.put("lstNewDriverAddrType", By.id("NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:AddressType-inputEl"));
			hm.put("eleNewDriverDOB", By.id("NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:DateOfBirth-inputEl"));
			hm.put("edtNewDriverDOB", By.id("NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:PolicyContactRoleDetails_AcgInputSet:DateOfBirth-inputEl"));
			hm.put("eleDriverNoOfAccidents", By.id("NewPolicyDriverPopup:ContactDetailScreen:PolicyDriverInfoDV:numberofaccidents-inputEl"));
			hm.put("lstDriverNoOfAccidents", By.id("NewPolicyDriverPopup:ContactDetailScreen:PolicyDriverInfoDV:numberofaccidents-inputEl"));
			hm.put("eleDriverNoOfViolations", By.id("NewPolicyDriverPopup:ContactDetailScreen:PolicyDriverInfoDV:numberofviolations-inputEl"));
			hm.put("lstDriverNoOfViolations", By.id("NewPolicyDriverPopup:ContactDetailScreen:PolicyDriverInfoDV:numberofviolations-inputEl"));
		
			hm.put("lstRelationshipToNI", By.xpath(".//input[contains(@id, 'Relationship-inputEl')]"));
				
			hm.put("edtDriverLicenseNumber", By.xpath(".//input[contains(@id, 'LicenseInputSet:LicenseNumber-inputEl')]"));
			hm.put("lstDriverLicenseState",By.xpath(".//input[contains(@id, 'LicenseInputSet:LicenseState-inputEl')]"));
					
			hm.put("eleDriverAddrStandardize", By.id("NewPolicyDriverPopup:ContactDetailScreen:Standardize-btnInnerEl"));
			hm.put("btnSelectStandardizeAddr", By.id("AddressStandardize_AcgPopup:StardizationResults_AcgLV:0:select"));
			hm.put("btnSelectCityCounty", By.id("AddressStandardize_AcgPopup:CityCountyResults_AcgLV:0:select"));
			hm.put("btnDriverDetailsOk", By.xpath(".//span[contains(text(),'pdate')]"));
			
			hm.put("edtDriverFirstName", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
			hm.put("edtDriverLastName", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:LastName-inputEl"));
			hm.put("eleDriverAddrType", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:AddressType-inputEl"));
			hm.put("lstDriverAddrType", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:AddressType-inputEl"));
			hm.put("edtLicenseNumber", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:LicenseInputSet:LicenseNumber-inputEl"));
			hm.put("lstLicenseState",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:LicenseInputSet:LicenseState-inputEl"));
					///Roles Tab
			hm.put("eleRolesTab", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:RolesCardTab-btnInnerEl"));
			hm.put("edtYearFirstLicensed", By.xpath(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:0:PolicyContactRolePanelSet:PolicyDriverInfoDV:yearlicensed-inputEl']"));
			hm.put("eleNoOfAccidentyPolicy", By.xpath(".//*[@id='gridview-1097-record-25']/tbody/tr/td[2]/div"));
			hm.put("eleNoOfAccidentsAccount", By.xpath(".//*[@id='gridview-1097-record-25']/tbody/tr/td[3]/div"));
			hm.put("eleNoOfViolationsPolicy", By.xpath(".//*[@id='gridview-1097-record-26']/tbody/tr/td[2]/div"));
			hm.put("eleNoOfViolationsAccount", By.xpath(".//*[@id='gridview-1097-record-26']/tbody/tr/td[3]/div"));
			hm.put("lstNoOfAccidentyPolicy", By.xpath(".//*[@id='gridview-1097-record-25']/tbody/tr/td[2]/div"));
			hm.put("lstNoOfAccidentsAccount", By.xpath(".//*[@id='gridview-1097-record-25']/tbody/tr/td[3]/div"));
			hm.put("lstNoOfViolationsPolicy", By.xpath(".//*[@id='gridview-1097-record-26']/tbody/tr/td[2]/div"));
			hm.put("lstNoOfViolationsAccount", By.xpath(".//*[@id='gridview-1097-record-26']/tbody/tr/td[3]/div"));
			hm.put("eleRefuseToProvideInfo", By.xpath(".//input[contains(@id,'RefusedToProvideInfoRe-inputEl')]"));
			
				///Drivers Discount 
			hm.put("eleDefensiveDriverDiscountTrue", By.xpath(".//input[contains(@id,':DefensiveDriverDiscount_true-inputEl')]"));
			hm.put("eleDefensiveDriverDiscountFalse", By.xpath(".//input[contains(@id,':DefensiveDriverDiscount_false-inputEl')]"));
			hm.put("edtDriverCourseTaken", By.xpath(".//input[contains(@id,':DateCourseTaken-inputEl')]"));
			hm.put("eleCourtOrderedYes", By.xpath(".//input[contains(@id,':CourtOrdered_true-inputEl')]"));
			hm.put("eleCourtOrderedNo", By.xpath(".//input[contains(@id,':CourtOrdered_false-inputEl')]"));
		hm.put("eleGoodStudentDiscYes", By.xpath(".//input[contains(@id,':IsGoodStudentDiscount_true-inputEl')]"));
		hm.put("eleGoodStudentDiscNo", By.xpath(".//input[contains(@id,':IsGoodStudentDiscount_false-inputEl')]"));
		hm.put("ele100kmsWithoutCarYes",  By.xpath(".//input[contains(@id,':IsDriverAway_true-inputEl')]"));
		hm.put("ele100kmsWithoutCarNo",  By.xpath(".//input[contains(@id,':IsDriverAway_false-inputEl')]"));
		
		hm.put("edtSchoolName",  By.xpath(".//input[contains(@id,':SchoolName-inputEl')]"));
		hm.put("edtSchoolCity",  By.xpath(".//input[contains(@id,':SchoolCity-inputEl')]"));
		hm.put("edtSchoolState",  By.xpath(".//input[contains(@id,':SchoolState-inputEl')]"));

		
			hm.put("eljParticipateInAAADriveTrue", By.xpath(".//input[contains(@id,':AAADrive_true-inputEl')]"));
			hm.put("eleParticipateInAAADriveTrue", By.xpath(".//input[contains(@id,':AAADrive_true-inputEl')]"));
			hm.put("eleYoungDriverDiscountOverrideYes", By.xpath(".//input[contains(@id,'oungDriverDiscOverride_true-inputEl')]"));
			hm.put("eleYoungDriverDiscountOverrideNo", By.xpath(".//input[contains(@id,'oungDriverDiscOverride_false-inputEl')]"));
			hm.put("eleParticipateInAAADriveFalse", By.xpath(".//input[contains(@id,':AAADrive_false-inputEl')]"));
			hm.put("eleOverrideAAADriveTrue", By.xpath(".//input[contains(@id,':OverideAAADrive_true-inputEl')]"));
			hm.put("eleOverrideAAADriveFalse", By.xpath(".//input[contains(@id,':OverideAAADrive_false-inputEl')]"));
			hm.put("lstAAADriverStatus", By.xpath(".//input[contains(@id,':DriveStatus-inputEl')]"));
			hm.put("edtPriorScore", By.xpath(".//input[contains(@id,':priorScore-inputEl')]"));
			hm.put("edtCurrentScore", By.xpath(".//input[contains(@id,':CurrentScore-inputEl')]"));
			hm.put("edtAnnualMileage", By.xpath(".//input[contains(@id,':EstimatedAnnnualMileage-inputEl')]"));
			

			
			
			// Prior Info screen for HO
			hm.put("elePriorInsuranceTab", By.id("SubmissionWizard:LOBWizardStepGroup:PriorPolicies"));
			hm.put("lstPriorHomeownersInsurance", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOPriorInsuranceHOEScreen:AdditionalDetailsHome_AcgDV:HasPriorPolicyHome-inputEl"));
			hm.put("eljPriorHomeownersInsuranceYes", By.xpath(".//input[contains(@id, 'HasPriorPolicyHome_true-inputEl')]"));
			hm.put("btnPriorHomeownersInsuranceNo", By.xpath(".//input[contains(@id, 'HasPriorPolicyHome_false-inputEl')]"));
			
			hm.put("edtAcgTenureDate", By.xpath(".//input[contains(@id,':AcgTenure-inputEl')]"));
			hm.put("eleEffDateOnInfoPane", By.xpath(".//*[@id='SubmissionWizard:JobWizardInfoBar:EffectiveDate-btnInnerEl']/span"));
			
			hm.put("edtCarrierHomeName", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOPriorInsuranceHOEScreen:AdditionalDetailsHome_AcgDV:CarrierNameHome-inputEl"));
			//hm.put("lstPolicyType", By.xpath(".//input[contains(@id, 'PolicyType-inputEl')]"));
			hm.put("edtExpirationDate", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOPriorInsuranceHOEScreen:AdditionalDetailsHome_AcgDV:ExpirationDateHome-inputEl"));
			hm.put("lstYearswithPriorCarrier", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOPriorInsuranceHOEScreen:AdditionalDetailsHome_AcgDV:YearsWithPriorCarrier-inputEl"));
			hm.put("eljAutoInsurancewithACGAAYes", By.xpath(".//input[contains(@id, 'InsuranceWithAAA_true-inputEl')]"));
			hm.put("btnAutoInsurancewithACGAANo", By.xpath(".//input[contains(@id, 'InsuranceWithAAA_false-inputEl')]"));
			hm.put("lstYearswithACGAAA", By.xpath(".//input[contains(@id, 'YearWithAAA-inputEl')]"));
			hm.put("lstYearswithCurrentAutoCarrier", By.xpath(".//input[contains(@id, 'YearsWithCurrentAuto-inputEl')]"));
			hm.put("lstBodilyInjuryLimitTyper", By.xpath(".//input[contains(@id, 'BodilyInjuryLimitType-inputEl')]"));
			hm.put("edtNumberofVehicals", By.xpath(".//input[contains(@id, 'NoOfVehicles-inputEl')]"));
			hm.put("lstPriorAutoCarrier", By.xpath(".//input[contains(@id, 'YearsWithPriorAutoCarrier-inputEl')]"));
			hm.put("lstSecondAutoCarrier", By.xpath(".//input[contains(@id, 'SecondPriorAuto-inputEl')]"));
			
			hm.put("lstPriorPolicyType", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOPriorInsuranceHOEScreen:AdditionalDetailsHome_AcgDV:PolicyType-inputEl"));
			hm.put("edtHavePriorInsurance", By.xpath(".//input[contains(@id,'PNIHasAutoInsurance-inputEl')]"));
			
			hm.put("eleDriverEmploymentStatus", By.xpath(".//input[contains(@id, ':EmpStatus-inputEl')]"));
			hm.put("lstDriverEmploymentStatus", By.xpath(".//input[contains(@id, ':EmpStatus-inputEl')]"));
			hm.put("eleDriverIndustry", By.xpath(".//input[contains(@id, ':IndustryType-inputEl')]"));
			hm.put("lstDriverIndustry", By.xpath(".//input[contains(@id, ':IndustryType-inputEl')]"));
			hm.put("eleDriverOccupation", By.xpath(".//input[contains(@id, ':SpecificIndustryType-inputEl')]"));
			hm.put("lstDriverOccupation", By.xpath(".//input[contains(@id, ':SpecificIndustryType-inputEl')]"));
			hm.put("eleDriverEducationLevel", By.xpath(".//input[contains(@id, ':EducationLevel-inputEl')]"));
			hm.put("lstDriverEducationLevel", By.xpath(".//input[contains(@id, ':EducationLevel-inputEl')]"));
		    hm.put("eleReportsACG", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:_msgs"));
			hm.put("btnRetriveAlHistory", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:InsuranceScoreCV:autoLossPanel:autoLoss:orderAutoLH-btnInnerEl"));
			//Dwelling fo HO
			hm.put("eleHODwellingErrorMsgs", By.xpath(".//div[contains(@id, ':HODwellingHOEScreen:_msgs')]"));
			hm.put("eleHODwellingConstructionErrorMsgs", By.xpath(".//div[contains(@id, 'HODwellingConstructionHOEScreen:_msgs')]"));

			hm.put("eleDwellLocName", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:HODwellingLocationHOEInputSet:HODwellingLocationInput:HODwellingLocationInputMenuIcon"));
			hm.put("eleDwellLocNewLocation",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:HODwellingLocationHOEInputSet:HODwellingLocationInput:NewGarageLocation-textEl") );
			hm.put("eleDwellLocEditLocation", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:HODwellingLocationHOEInputSet:HODwellingLocationInput:EditDwellingLocation-textEl"));
			hm.put("edtDwellingLocationName", By.xpath("/html/body/div[4]/table/tbody/tr/td/div/table/tbody/tr[4]/td/div/div[2]/div/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td/div/div/div/div[2]/div/div[1]/input"));
			hm.put("btnTerritoryCodeForHomeownersLine",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:TerritoryCodeInputSet:0:TerritoryCode-inputEl"));
			hm.put("eleCodeForHOLine", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:TerritoryCodeInputSet:0:TerritoryCode:SelectTerritoryCode"));
			
			//Location Search
			hm.put("eleHOLocationErrorMsgs", By.id("Location_AcgPopup:LocationScreen:_msgs"));
			hm.put("eleNonSpecificLocYes", By.id("Location_AcgPopup:LocationScreen:LocationDetailPanelSet:LocationDetail_AcgCV:LocationDetailDV:LocationDetail_AcgInputSet:NonSpecificLocation_true-inputEl"));
			hm.put("eleNonSpecificLocNo", By.id("Location_AcgPopup:LocationScreen:LocationDetailPanelSet:LocationDetail_AcgCV:LocationDetailDV:LocationDetail_AcgInputSet:NonSpecificLocation_false-inputEl"));
			hm.put("edtLocHouseNum", By.id("Location_AcgPopup:LocationScreen:LocationDetailPanelSet:LocationDetail_AcgCV:LocationDetailDV:LocationDetail_AcgInputSet:TargetedAddress_AcgInputSet:globalAddressContainer:GlobalAddress_AcgInputSet:AddressLine1-inputEl"));
			hm.put("edtLocStreetName", By.id("Location_AcgPopup:LocationScreen:LocationDetailPanelSet:LocationDetail_AcgCV:LocationDetailDV:LocationDetail_AcgInputSet:TargetedAddress_AcgInputSet:globalAddressContainer:GlobalAddress_AcgInputSet:AddressLine2-inputEl"));
			hm.put("edtLocCityName", By.id("Location_AcgPopup:LocationScreen:LocationDetailPanelSet:LocationDetail_AcgCV:LocationDetailDV:LocationDetail_AcgInputSet:TargetedAddress_AcgInputSet:globalAddressContainer:GlobalAddress_AcgInputSet:City-inputEl"));
			hm.put("lstDwellingLocationType", By.id("Location_AcgPopup:LocationScreen:LocationDetailPanelSet:LocationDetail_AcgCV:LocationDetailDV:LocationDetail_AcgInputSet:TargetedAddress_AcgInputSet:globalAddressContainer:GlobalAddress_AcgInputSet:AddressType1-inputEl"));
			
	
			hm.put("eleLocState", By.id("LocationPopup:LocationScreen:LocationDetailPanelSet:LocationDetailCV:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("lstLocState", By.id("LocationPopup:LocationScreen:LocationDetailPanelSet:LocationDetailCV:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("edtLocZipCode", By.id("Location_AcgPopup:LocationScreen:LocationDetailPanelSet:LocationDetail_AcgCV:LocationDetailDV:LocationDetail_AcgInputSet:TargetedAddress_AcgInputSet:globalAddressContainer:GlobalAddress_AcgInputSet:PostalCode-inputEl"));
			hm.put("btnLocStandardize", By.id("Location_AcgPopup:LocationScreen:Standardize-btnInnerEl"));
			hm.put("btnSelectStandardizeAddr", By.id("AddressStandardize_AcgPopup:StardizationResults_AcgLV:0:select"));
			hm.put("btnSelectCityCounty", By.id("AddressStandardize_AcgPopup:CityCountyResults_AcgLV:0:select"));
			hm.put("btnLocOK", By.id("Location_AcgPopup:LocationScreen:Update-btnInnerEl"));

		      	///Territory Code Search
			
			
			
				hm.put("eletype1", By.id("TerritoryCodeSearchPopup:TerritoryCodeSearchScreen:TerritoryCodeSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressType1-inputEl"));
				hm.put("lsttype1", By.id("TerritoryCodeSearchPopup:TerritoryCodeSearchScreen:TerritoryCodeSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressType1-inputEl"));
				hm.put("edtNumber1",By.xpath(".//input[contains(@id, 'AddressNumber1-inputEl')]"));
				hm.put("eletype2", By.id("TerritoryCodeSearchPopup:TerritoryCodeSearchScreen:TerritoryCodeSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressType2-inputEl"));
				hm.put("lsttype2", By.id("TerritoryCodeSearchPopup:TerritoryCodeSearchScreen:TerritoryCodeSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressType2-inputEl"));
				hm.put("edtNumber2",By.xpath(".//input[contains(@id, 'AddressNumber2-inputEl')]"));
				hm.put("edtTerritoryCity",By.id("TerritoryCodeSearchPopup:TerritoryCodeSearchScreen:TerritoryCodeSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
				hm.put("edtTerritoryCountry",By.id("TerritoryCodeSearchPopup:TerritoryCodeSearchScreen:TerritoryCodeSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:County-inputEl"));
				hm.put("eleTerritoryState",By.id("TerritoryCodeSearchPopup:TerritoryCodeSearchScreen:TerritoryCodeSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
				hm.put("lstTerritoryState",By.id("TerritoryCodeSearchPopup:TerritoryCodeSearchScreen:TerritoryCodeSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
				hm.put("edtTerritoryZIPCode", By.id("TerritoryCodeSearchPopup:TerritoryCodeSearchScreen:TerritoryCodeSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
				hm.put("edtCode1", By.id("TerritoryCodeSearchPopup:TerritoryCodeSearchScreen:TerritoryCodeSearchDV:Code-inputEl"));
				hm.put("edtDescription", By.id("TerritoryCodeSearchPopup:TerritoryCodeSearchScreen:TerritoryCodeSearchDV:Description-inputEl"));
				hm.put("btnTerritorySearch", By.xpath("/html/body/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr[11]/td/div/div/div/table/tbody/tr/td[1]/a"));
				hm.put("btnTerritorySelect", By.id("TerritoryCodeSearchPopup:TerritoryCodeSearchScreen:TerritoryCodeSearchResultsLV:0:_Select"));
			
			hm.put("edtLocalTaxJurisdiction", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:LocalTaxJurisdictionId-inputEl"));
			hm.put("eleLocalTaxJurisdiction", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:LocalTaxJurisdictionId:SelectLocalTaxJurisdictionId"));
			
				hm.put("edjSelectPlan", By.xpath(".//input[contains(@id,'tierPlanIterator:0:PickOffering-inputEl')]"));
				hm.put("eleSelectVersion", By.xpath(".//a[contains(@id,'ActionButtonSetsId:1:SelectButtonId')]"));
				hm.put("eleSelectVersion0", By.xpath(".//a[contains(@id,'ActionButtonSetsId:0:SelectButtonId')]"));
				
				hm.put("eleDetailsVersion", By.xpath(".//a[contains(@id,'ActionButtonSetsId:1:DetailsButtonId')]"));
				hm.put("eleDetailsVersion0", By.xpath(".//a[contains(@id,'ActionButtonSetsId:0:DetailsButtonId')]"));
			
				
				///Tax Location Search
				hm.put("edtCode2",By.id("TaxLocationSearchPopup:TaxLocationSearchScreen:TaxLocationSearchDV:Code-inputEl"));
				hm.put("eleType3", By.id("TaxLocationSearchPopup:TaxLocationSearchScreen:TaxLocationSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressType1-inputEl"));
				hm.put("lstType3", By.id("TaxLocationSearchPopup:TaxLocationSearchScreen:TaxLocationSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressType1-inputEl"));
				hm.put("edtNumber", By.id("TaxLocationSearchPopup:TaxLocationSearchScreen:TaxLocationSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressNumber1-inputEl"));
				hm.put("eleType4", By.id("TaxLocationSearchPopup:TaxLocationSearchScreen:TaxLocationSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressType2-inputEl"));
				hm.put("edtNumber", By.id("TaxLocationSearchPopup:TaxLocationSearchScreen:TaxLocationSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressNumber2-inputEl"));
				hm.put("edtTaxCity", By.id("TaxLocationSearchPopup:TaxLocationSearchScreen:TaxLocationSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
				hm.put("edtTaxCountry",  By.id("TaxLocationSearchPopup:TaxLocationSearchScreen:TaxLocationSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:County-inputE"));
				hm.put("eleTaxState",By.id("TaxLocationSearchPopup:TaxLocationSearchScreen:TaxLocationSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
				hm.put("lstTaxState",By.id("TaxLocationSearchPopup:TaxLocationSearchScreen:TaxLocationSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
				hm.put("edtTaxLocationPrefix",By.id("TaxLocationSearchPopup:TaxLocationSearchScreen:TaxLocationSearchDV:TLPrefix-inputEl"));
				hm.put("edtDescription",By.id("TaxLocationSearchPopup:TaxLocationSearchScreen:TaxLocationSearchDV:Description-inputEl"));
				hm.put("btnSearch",By.id("TaxLocationSearchPopup:TaxLocationSearchScreen:TaxLocationSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
				hm.put("btnSelect",By.id("TaxLocationSearchPopup:TaxLocationSearchScreen:TaxLocationSearchResultsLV:0:_Select"));
			
				
			hm.put("edtDistanceToFireHydrantFt", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:DistToFireHydrant-inputEl"));
			hm.put("edtDistanceToFireStationMi", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:DistToFireStation-inputEl"));
			hm.put("eleAnyFloodingOrFireHazardNo", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:FloodFireHazard_false-inputEl"));
			hm.put("eleAnyFloodingOrFireHazardYes", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:FloodFireHazard_true-inputEl"));
			hm.put("eleWithIn300FtOfCommercialPropertyNo",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:WithinCommercialProperty_false-inputEl"));
			hm.put("eleWithIn300FtOfCommercialPropertyYes",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:WithinCommercialProperty_true-inputEl"));
			hm.put("edtYearPurchased", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:DwellingYear-inputEl"));
			hm.put("edtEstimatedReplacementCost",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:DwellingReplacement-inputEl"));
			hm.put("eleResidenceType",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:ResidenceType-inputEl"));
			hm.put("lstResidenceType",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:ResidenceType-inputEl"));
			hm.put("eleHowIsTheDwellingCustomarilyUsed", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:DwellingUse-inputEl"));
			hm.put("lstHowIsTheDwellingCustomarilyUsed",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:DwellingUse-inputEl"));
			hm.put("eleHowIsTheDwellingOccupied",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:DwellingOccupancy-inputEl"));
			hm.put("lstHowIsTheDwellingOccupied",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:DwellingOccupancy-inputEl"));
			hm.put("eleAreThereAnyRoomersBoardersNo",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:RoomersBoarders_false-inputEl"));
			hm.put("eleAreThereAnyRoomersBoardersYes",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:RoomersBoarders_true-inputEl"));
			hm.put("eleNoOfUnitsInBuilding",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:NumUnits-inputEl"));
			hm.put("lstNoOfUnitsInBuilding",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:NumUnits-inputEl"));
			hm.put("eleFirePlaceOrWoodStoveNo",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:FireWoodStove_false-inputEl"));
			hm.put("eleFirePlaceOrWoodStoveYes",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:FireWoodStove_true-inputEl"));
			hm.put("eleTrampolineOnThePremisesYes", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:HoQuestions:Trampoline_true-inputEl"));
			hm.put("eleTrampolineOnThePremisesNO", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:HoQuestions:Trampoline_false-inputEl"));
			hm.put("eleSwimmingPoolOnThePremisesYes", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:HoQuestions:SwimmingPool_true-inputEl"));
			hm.put("eleSwimmingPoolOnThePremisesNo", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:HoQuestions:SwimmingPool_false-inputEl"));
			hm.put("btnProtectionCode", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:AutofillId"));
			

		
			hm.put("eleHowManyDogsAreOnTheInsuredPremises",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:NumberOfDogs_Acg-inputEl"));
			hm.put("lstHowManyDogsAreOnTheInsuredPremises",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:NumberOfDogs_Acg-inputEl"));
			hm.put("eleAnyAnimalsOrExoticPetsOnPremisesNo",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:AnyAnimals_false-inputEl"));
			hm.put("eleAnyAnimalsOrExoticPetsOnPremisesYes",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingDetailsHOEDV:AnyAnimals_true-inputEl"));
			
			hm.put("lstNoOfOccupant", By.xpath(".//input[contains(@id, 'NumberofOccupants-inputEl')]"));
			hm.put("lstResidenceType",By.xpath(".//input[contains(@id, 'ResidenceType-inputEl')]"));
			hm.put("lstNoOfFamilies", By.xpath(".//input[contains(@id, 'NumberofFamilies-inputEl')]"));
			hm.put("lstDwellingDistancetoCoast", By.xpath(".//input[contains(@id,':distanceCoast-inputEl')]"));
			hm.put("eleDwellingBarrierIslandsYes", By.xpath(".//input[contains(@id,'BarrierIsland_true-inputEl')]"));
			hm.put("eleDwellingBarrierIslandsNo", By.xpath(".//input[contains(@id,'BarrierIsland_false-inputEl')]"));

			hm.put("edtHousePurchaseYear", By.xpath(".//input[contains(@id,'HomePurchaseDate-inputEl')]"));
			hm.put("eleIsNamedInsuredOrgOwnerYes", By.xpath(".//input[contains(@id,'NamedInsuredTheOriginalOwner_true-inputEl')]"));
			hm.put("eleIsNamedInsuredOrgOwnerNo", By.xpath(".//input[contains(@id,'NamedInsuredTheOriginalOwner_false-inputEl')]"));
			hm.put("eleIsSmokerResidingInHouseholdYes", By.xpath(".//input[contains(@id,'SmokerResidingInHousehold_true-inputEl')]"));
			hm.put("eleIsSmokerResidingInHouseholdNo", By.xpath(".//input[contains(@id,'SmokerResidingInHousehold_false-inputEl')]"));
			hm.put("eleStormShuttersNo", By.xpath(".//input[contains(@id,'StormShutters_false-inputEl')]"));
			hm.put("eleStormShuttersYes", By.xpath(".//input[contains(@id,'StormShutters_true-inputEl')]"));
			hm.put("eleLaminatedWindowsYes", By.xpath(".//input[contains(@id,'LaminatedWindows_true-inputEl')]"));
			hm.put("eleLaminatedWindowsNo", By.xpath(".//input[contains(@id,'LaminatedWindows_false-inputEl')]"));
			hm.put("eleScndryWaterResYes", By.xpath(".//input[contains(@id,'SecondaryWaterResistance_true-inputEl')]"));
			hm.put("eleScndryWaterResNo", By.xpath(".//input[contains(@id,'SecondaryWaterResistance_false-inputEl')]"));
			hm.put("eleAttachedPoolEncloseYes", By.xpath(".//input[contains(@id,'AttachedPoolEnclosure_true-inputEl')]"));
			hm.put("eleAttachedPoolEncloseNo", By.xpath(".//input[contains(@id,'AttachedPoolEnclosure_false-inputEl')]"));
			hm.put("elePoolYes", By.xpath(".//input[contains(@id,'SwimmingPool_true-inputEl')]"));
			hm.put("elePoolNo", By.xpath(".//input[contains(@id,'SwimmingPool_false-inputEl')]"));
			hm.put("elePoolSlideYes", By.xpath(".//input[contains(@id,'PoolHavingSlide_true-inputEl')]"));
			hm.put("elePoolSlideNo", By.xpath(".//input[contains(@id,'PoolHavingSlide_false-inputEl')]"));
			hm.put("eleDivingBoardYes", By.xpath(".//input[contains(@id,'PoolDivingBoard_true-inputEl')]"));	
			hm.put("eleDivingBoardNo", By.xpath(".//input[contains(@id,'PoolDivingBoard_false-inputEl')]"));
			hm.put("eleTrampolineYes", By.xpath(".//input[contains(@id,'Trampoline_true-inputEl')]"));
			hm.put("eleTrampolineNo", By.xpath(".//input[contains(@id,'Trampoline_false-inputEl')]"));
			hm.put("lstNumberOfDogs", By.xpath(".//input[contains(@id,'NumberOfDogs_Acg-inputEl')]"));
			hm.put("eleDwellingUnoccupiedYes", By.xpath(".//input[contains(@id,'DwellingUnoccupied_true-inputEl')]"));
			hm.put("eleDwellingUnoccupiedNo", By.xpath(".//input[contains(@id,'DwellingUnoccupied_false-inputEl')]"));
			hm.put("eleInsuredWithAAAYes", By.xpath(".//input[contains(@id,'InsuredWithAAA_true-inputEl')]"));
			hm.put("eleInsuredWithAAANo", By.xpath(".//input[contains(@id,'InsuredWithAAA_false-inputEl')]"));
			hm.put("lstStateofPrimaryRes", By.xpath(".//input[contains(@id,'ResidenceState-inputEl')]"));
			hm.put("eleDwellingUnderConstructionYes", By.xpath(".//input[contains(@id,'DwellingUnderConstruction_true-inputEl')]"));
			hm.put("eleDwellingUnderConstructionNo", By.xpath(".//input[contains(@id,'DwellingUnderConstruction_false-inputEl')]"));
			hm.put("eleDwellingProffContractYes", By.xpath(".//input[contains(@id,'professionalcontractor_true-inputEl')]"));
			hm.put("eleDwellingProffContractNo", By.xpath(".//input[contains(@id,'professionalcontractor_false-inputEl')]"));
			
			hm.put("eleWillCnstructCompDateYes", By.xpath(".//input[contains(@id,'ConstructionDate_true-inputEl')]"));
			hm.put("eleWillCnstructCompDateNo", By.xpath(".//input[contains(@id,'ConstructionDate_false-inputEl')]"));
			hm.put("edtNoOfDaysHomeRented", By.xpath(".//input[contains(@id,'HomeRented-inputEl')]"));
			hm.put("lstDwellingProtectionClass", By.xpath(".//input[contains(@id,'protectionClass-inputEl')]"));
			hm.put("lstRespondingFireDepartment", By.xpath(".//input[contains(@id,'respondingFireDepartmentId-inputEl')]"));
			hm.put("eledistanceTofireHydrantYes", By.xpath(".//input[contains(@id,'distanceTofireHydrant_true-inputEl')]"));
			hm.put("eledistanceTofireHydrantNo", By.xpath(".//input[contains(@id,'distanceTofireHydrant_false-inputEl')]"));
			hm.put("lstRiskDistFireDepartment", By.xpath(".//input[contains(@id,'FireDepartment-inputEl')]"));
			
			hm.put("eleDwellingVisibleFromPublicYes",  By.xpath(".//input[contains(@id,'DwellingVisible_true-inputEl')]"));
			hm.put("eleDwellingVisibleFromPublicNo",  By.xpath(".//input[contains(@id,'DwellingVisible_false-inputEl')]"));
			
			hm.put("lstRiskDistfromResFireDpt", By.xpath(".//input[contains(@id,'FireDepartment-inputEl')]"));
			hm.put("eleProtectionClassCode", By.xpath(".//div[contains(@id,':protectionClass-inputEl')]"));
			
			hm.put("eleSprinklerSystemYes", By.xpath(".//input[contains(@id,'SprinklerSystem_true-inputEl')]"));
			hm.put("eleSprinklerSystemNo", By.xpath(".//input[contains(@id,'SprinklerSystem_false-inputEl')]"));
			hm.put("eleDeadBoltsYes", By.xpath(".//input[contains(@id,'Deadbolt_true-inputEl')]"));
			hm.put("eleDeadBoltsNo", By.xpath(".//input[contains(@id,'Deadbolt_false-inputEl')]"));
			hm.put("lstFireAlarm", By.xpath(".//input[contains(@id,'FireAlarmType-inputEl')]"));
			hm.put("eleFireExtinguisherYes", By.xpath(".//input[contains(@id,'FireExtinguisher_true-inputEl')]"));
			hm.put("eleFireExtinguisherNo", By.xpath(".//input[contains(@id,'FireExtinguisher_false-inputEl')]"));
			hm.put("eleSmokeDetectorsYes", By.xpath(".//input[contains(@id,'SmokeAlarm_true-inputEl')]"));
			hm.put("eleSmokeDetectorsNo", By.xpath(".//input[contains(@id,'SmokeAlarm_false-inputEl')]"));
			hm.put("lstBurglarAlarm", By.xpath(".//input[contains(@id,'BurglarAlarm-inputEl')]"));
			hm.put("lstWaterDetectDevice", By.xpath(".//input[contains(@id,'WaterDetection-inputEl')]"));
			
			
			///Dwelling Protection 
			hm.put("eleProtectionDetails", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:DwellingSingleProtectionIdTab-btnInnerEl"));
			hm.put("eleLocationType",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:DwellingLocation-inputEl"));
			hm.put("lstLocationType",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:DwellingLocation-inputEl"));
			hm.put("eleOneOrMoreFireExtinguishersInTheHomeNo",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:FireExtinguisher_false-inputEl"));
			hm.put("eleOneOrMoreFireExtinguishersInTheHomeYes",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:FireExtinguisher_true-inputEl"));
			hm.put("eleBurglarAlarmNo",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:BurglarAlarm_false-inputEl"));
			hm.put("eleBurglarAlarmYes",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:BurglarAlarm_true-inputEl"));
			hm.put("eleFireAlaramRepoMCNo",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:FireAlarmReportingStn_false-inputEl"));
			hm.put("eleFireAlaramRepoMCYes",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:FireAlarmReportingStn_true-inputEl"));
			hm.put("eleSmokeAlarmsNo",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:SmokeAlarm_false-inputEl"));
			hm.put("eleSmokeAlarmsYes",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:SmokeAlarm_true-inputEl"));
			hm.put("eleSprinklerSystemType",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:SprinklerSystemType-inputEl"));
			hm.put("lstSprinklerSystemType",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:SprinklerSystemType-inputEl"));
//			hm.put("eleDeadboltsNo",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:Deadbolt_false-inputEl"));
//			hm.put("eleDeadboltsYes",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:Deadbolt_true-inputEl"));
			hm.put("eleResidenceVisibleToNeighborsNo",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:ResidenceVisible_false-inputEl"));
			hm.put("eleResidenceVisibleToNeighborsYes",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HODwellingProtectionDetailsHOEDV:ResidenceVisible_true-inputEl"));
			
			
			//Vehicles for PA
			hm.put("eleVehicleTab", By.id("SubmissionWizard:LOBWizardStepGroup:PersonalVehicles"));
			hm.put("btnCreateVehicle", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl"));
			hm.put("btnRemoveVehicle", By.xpath(".//span[contains(text(),'Remove Vehicle')]"));
			hm.put("eleGaragedAtDropdown", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:PAGarageLocationInputSet:PAGarageLocationInput-trigger-picker"));
		
			hm.put("lstVehicleType", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Type_DV-inputEl"));
			hm.put("lsjVehicleType", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Type_DV-inputEl"));
			hm.put("lstVehicleDescription", By.xpath(".//input[contains(@id,'TypeDescription')]"));
			hm.put("lsjVehicleDescription2", By.xpath(".//input[contains(@id,'TypeDescription2_DV-inputEl')]"));

			hm.put("elePriorYear1981Yes",By.xpath(".//input[contains(@id,'VehicleYearPrior_true-inputEl')]"));	
			hm.put("elePriorYear1981No",By.xpath(".//input[contains(@id,'VehicleYearPrior_false-inputEl')]"));	
			hm.put("edtVehicleYear",By.xpath(".//input[contains(@id,'Year_DV-inputEl')]"));	
			hm.put("edtVehicleMake",By.xpath(".//input[contains(@id,'Make_DV-inputEl')]"));	

			hm.put("edtVehicleModel",By.xpath(".//input[contains(@id,'Model_DV-inputEl')]"));	
			
			hm.put("lsjVehicleYear",By.xpath(".//input[contains(@id,'YearDropDown-inputEl')]"));	
			hm.put("lsjVehicleMake",By.xpath(".//input[contains(@id,'Make')]"));	
			hm.put("lsjVehicleModel",By.xpath(".//input[contains(@id,'Model')]"));
			hm.put("lsjVehicleTrim",By.xpath(".//input[contains(@id,'Trim')]"));
			hm.put("eljVehicleLookup", By.xpath(".//a[contains(@id,'PersonalAuto_VehicleDV:lookUp')]"));
			hm.put("eleVehicleLookup", By.xpath(".//a[contains(@id,'PersonalAuto_VehicleDV:lookUp')]"));
			hm.put("edtVIN", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:VinYMM:Vin_DV-inputEl"));
			hm.put("lstRegisteredState", By.xpath(".//input[contains(@id,'RegisteredState-inputEl')]"));
			hm.put("btnVehicleLookUp", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:lookUp"));
			hm.put("lstVehicleLicenseState", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicenseState_DV-inputEl"));
			hm.put("lstVehicleGaragedAt", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:PAGarageLocationInputSet:PAGarageLocationInput-inputEl"));
			hm.put("eleAddAssignee", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver-btnEl"));
			hm.put("eleSelectAssignee", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver-textEl"));
			hm.put("edtAssigneePercentage", By.xpath(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']"));
			hm.put("edtVehicleNewCost", By.xpath(".//input[contains(@id,'CostNew_DV-inputEl')]"));
			hm.put("edtvehicleCurrentValue", By.xpath(".//input[contains(@id,'CurrentValueId-inputEl')]"));
			hm.put("edtConversionVanNewCost", By.xpath(".//input[contains(@id,'ConversionVanCostNew-inputEl')]"));
			hm.put("lsjAssignedDriver", By.xpath(".//input[contains(@id,'AssignedDriver_Acg-inputEl')]"));
			hm.put("eleAssignedDriver", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AssignedDriver_Acg-inputEl"));
			hm.put("eleAssignedDriverList", By.cssSelector("div.x-boundlist-floating.x-border-box"));
			hm.put("eleVehiclesTable", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesLV-body"));
			hm.put("eleGarageat", By.xpath(".//a[contains(@id,'PAGarageLocationInputMenuIcon')]"));
			hm.put("eleNewLocation", By.xpath(".//span[contains(@id,'NewGarageLocation-textEl')]"));
			hm.put("eleEditLocation", By.xpath(".//span[contains(@id,'EditGarageLocation-textEl')]"));
			hm.put("edtDatePurchased", By.xpath(".//input[contains(@id,'DatePurchased-inputEl')]"));
			hm.put("elePreviouslyTitledYes", By.xpath(".//input[contains(@id,'IsPreviouslyTitled_true-inputEl')]"));
			hm.put("elePreviouslyTitledNo", By.xpath(".//input[contains(@id,'IsPreviouslyTitled_false-inputEl')]"));
			
			hm.put("lstVehicleSearchBy", By.xpath(".//input[contains(@id,'PersonalAuto_VehicleDV:searchBy-inputEl')]"));
			hm.put("edtVINNumber",By.xpath(".//input[contains(@id,'Vin_DV-inputEl')]"));
			hm.put("eleModifiedToIncresePerforYes",By.xpath(".//input[contains(@id,'HasVehicleSubstantialMod_true-inputEl')]"));
			hm.put("eleModifiedToIncresePerforNo",By.xpath(".//input[contains(@id,'HasVehicleSubstantialMod_false-inputEl')]"));

			hm.put("lstExistingDamage",By.xpath(".//input[contains(@id,':ExistingDamage-inputEl')]"));
			hm.put("edtCylinders", By.xpath(".//input[contains(@id,'Cylinders-inputEl')]"));
			hm.put("eleAirbagYes", By.xpath(".//input[contains(@id,'AirBagType_true-inputEl')]"));	
			hm.put("eleAirbagNo",	By.xpath(".//input[contains(@id,'AirBagType_false-inputEl')]"));
			hm.put("eleABSYes",	By.xpath(".//input[contains(@id,'AbsType_true-inputEl')]"));
			hm.put("eleABSNo",By.xpath(".//input[contains(@id,'AbsType_false-inputEl')]"));	
			hm.put("lstAntiTheftDevice",By.xpath(".//input[contains(@id,'AntiTheftDevice-inputEl')]"));
			hm.put("eleSafetyInspectionYes",By.xpath(".//input[contains(@id,'IsSafetyInspection_true-inputEl')]"));	
			hm.put("lstBusinessUseOfVehicle", By.xpath(".//input[contains(@id,':TradesmanType-inputEl')]"));
			hm.put("eleSafetyInspectionNo",By.xpath(".//input[contains(@id,'IsSafetyInspection_false-inputEl')]"));	
			hm.put("edtVehicleInspectionDate",By.xpath(".//input[contains(@id,'VehicleInspectionDate-inputEl')]"));	
			//hm.put("eleHomeInspectionYes",By.xpath(".//input[contains(@id,'IsHomeInsComplete_Acg_true-inputEl')]"));
			//hm.put("eleHomeInspectionNo",By.xpath(".//input[contains(@id,'IsHomeInsComplete_Acg_false-inputEl')]"));

			hm.put("eleHomeInspectionYes",By.xpath(".//input[contains(@id,'IsSysHomeInsOrdered_Acg_true-inputEl')]"));
			hm.put("eleHomeInspectionNo",By.xpath(".//input[contains(@id,'IsSysHomeInsOrdered_Acg_false-inputEl')]"));
			
			
			hm.put("lstVehicleUsage",	By.xpath(".//input[contains(@id,'VehicleUsage-inputEl')]"));
			hm.put("edtAnnualMileage",	By.xpath(".//input[contains(@id,'annualmiles_DV-inputEl')]"));
			
			hm.put("edtOnewayMileage", By.xpath(".//input[contains(@id,'OneWayMileage-inputEl')]"));
			hm.put("lstDaysDrivenperWeek", By.xpath(".//input[contains(@id,'DaysDrivenToSchool-inputEl')]"));
			hm.put("btnCompOnly",By.xpath(".//input[contains(@id,'CompOnlyId-inputEl')]"));
			
			
			hm.put("eleTitleHolder", By.xpath("//div[3][@id ='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:TitleHolderLV-body']/div[1]/div[1]/table/tbody/tr/td[3]/div"));

			
			hm.put("eleTitleHolderTable", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:TitleHolderLV-body"));
			
			hm.put("eleTitleHolderRemove", By.xpath(".//a[contains(@id,'TitleHolderLV_tb:Remove')]"));
			hm.put("edtOwnership", By.xpath(".//input[contains(@id,'VehicleOwnershipType-inputEl')]"));
			hm.put("btnSubstancialYes", By.xpath(".//input[contains(@id,'HasVehicleSubstantialMod_true-inputEl')]"));
			hm.put("btnSubstancialNo", By.xpath(".//input[contains(@id,'HasVehicleSubstantialMod_false-inputEl')]"));
			hm.put("btnSnowAttachedYes", By.xpath(".//input[contains(@id,'IsSnowAttachedVehicle_ture-inputEl')]"));
			hm.put("btnSnowAttachedNo", By.xpath(".//input[contains(@id,'IsSnowAttachedVehicle_false-inputEl')]"));
			
			hm.put("lstExistingDamage", By.xpath(".//input[contains(@id,'ExistingDamage-inputEl')]"));
			
			//Dwelling Construction for HO
			hm.put("edtYearBuilt", By.xpath(".//input[contains(@id,'YearBuilt-inputEl')]"));
			hm.put("lstConstructionType", By.xpath(".//input[contains(@id,'ConstructionType-inputEl')]"));
			hm.put("eljRetreiveRCE", By.xpath(".//a[contains(@id,'rceCheck:retrieveDefaultRCE')]"));
			
			hm.put("eleFortifiedHomeYes", By.xpath(".//input[contains(@id,'HomeFortified_true-inputEl')]"));
			hm.put("eleFortifiedHomeNo", By.xpath(".//input[contains(@id,'HomeFortified_false-inputEl')]"));
			hm.put("edtApprxSquareFootage", By.xpath(".//input[contains(@id,'ApproxSqFoot-inputEl')]"));
			hm.put("lstPrimaryHeating", By.xpath(".//input[contains(@id,'PrimaryHeating-inputEl')]"));
			hm.put("lstSecondaryHeating", By.xpath(".//input[contains(@id,'SecondaryHeatingType-inputEl')]"));
			hm.put("eleHailResistantYes", By.xpath(".//input[contains(@id,'HailResistant_true-inputEl')]"));
			hm.put("eleHailResistanteNo", By.xpath(".//input[contains(@id,'HailResistant_false-inputEl')]"));
			hm.put("lstUnitFloorNumber", By.xpath(".//input[contains(@id,'UnitFloor-inputEl')]"));
			hm.put("edtReplacementCostEstimate", By.xpath(".//input[contains(@id,'ReplacementCost-inputEl')]"));
			hm.put("eleDifferentRCEYes", By.xpath(".//input[contains(@id,'DifferentRCE_true-inputEl')]"));
			hm.put("eleDifferentRCENo", By.xpath(".//input[contains(@is,'DifferentRCE_false-inputEl')]"));
			hm.put("edtQuotedRCE", By.xpath(".//input[contains(@id,'QuotedRCE-inputEl')]"));
			hm.put("eleRoofUpgraded",By.xpath(".//input[contains(@id,'roofUpgrade-inputEl')]"));
			hm.put("edtRoofUpgradedYear", By.xpath(".//input[contains(@id,'yearRoofUpgrade-inputEl')]"));
			hm.put("eleRoofAgeVerificationYes", By.xpath(".//input[contains(@id,'roofAgeVerification_true-inputEl')]"));
			hm.put("eleRoofAgeVerificationNo", By.xpath(".//input[contains(@id,'roofAgeVerification_false-inputEl')]"));
			
			hm.put("eleIsSecondaryHeatingYes", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:SecondaryHeatingExists_true-inputEl"));
			hm.put("eleIsSecondaryHeatingNo", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:SecondaryHeatingExists_false-inputEl"));
			hm.put("elePlumbing", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:PlumbingSystem-inputEl"));
			hm.put("lstNoOfStories", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:NumStories-inputEl"));
			hm.put("lstGarage", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:Garage-inputEl"));
			hm.put("eleAnyCoveredPorschesYes", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:CoveredPorches_true-inputEl"));
			hm.put("eleAnyCoveredPorschesNo", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:CoveredPorches_false-inputEl"));
			hm.put("lstFoundationType", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:FoundationType-inputEl"));
			hm.put("lstRoofType", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:RoofType-inputEl"));
			hm.put("lstPlumbing", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:PlumbingSystem-inputEl"));
			hm.put("eleWiring", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:Wiring-inputEl"));

			hm.put("lstWiring", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:Wiring-inputEl"));
			hm.put("lstElelctricalSystem", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:ElectricalSystem-inputEl"));
			hm.put("edtNoOfAmps", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:NumberofAmps-inputEl"));
			hm.put("lstWindClass", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:WindClass-inputEl"));
			hm.put("edtConstructClassifCode", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingConstructionHOEScreen:HODwellingConstructionDetailsHOEDV:ConstructionClass-inputEl"));
			
			///Additional Interest
			hm.put("eleAdditionalInterest", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:DwellingAdditionalInterestIdTab"));
			hm.put("btnAddContactsDwelling", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HOAdditionalInterestDetailsHOEDV:AdditionalInterestLV_tb:AddContactsButton"));
			hm.put("eleAddNewPersonContact", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HODwellingHOEScreen:HODwellingSingleHOEPanelSet:HOAdditionalInterestDetailsHOEDV:AdditionalInterestLV_tb:AddContactsButton:1:ContactType-itemEl"));
			hm.put("edtInterestType", By.id("NewAdditionalInterestPopup:ContactDetailScreen:AdditionalInterestInfoDV:Type-inputEl"));
			
			hm.put("eleAdditionalInterestTable", By.xpath("html/body/div[4]/table/tbody/tr/td/div/table/tbody/tr[4]/td/div/table/tbody/tr/td/div/div[2]/div/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[3]/div[1]/div[1]/table"));
			hm.put("edtAIDescription", By.name("AddlInterestDesc"));
			
				//Coverages for Both PA and HO
			
			hm.put("eleCoverageScreen", By.xpath(".//span[contains(text(),'Coverages')]"));
			hm.put("eljCoverageScreen", By.xpath(".//span[contains(text(),'Coverages')]"));
				//Vehicles coverages
			hm.put("eleHOCoveragesErrorMessages", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:_msgs"));
			hm.put("elePACoveragesScreen", By.id("SubmissionWizard:LOBWizardStepGroup:PALine"));
			hm.put("eleHOCoveragesScreen", By.id("SubmissionWizard:LOBWizardStepGroup:HOCoverages"));
			hm.put("eleNoDeductibleGlassNo", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PersonalAuto_VehicleCoverageDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:BooleanTermInput_false-inputEl"));
			hm.put("lsjDeductible", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PersonalAuto_VehicleCoverageDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl"));
			hm.put("HomeOwnersCoverage", By.xpath(".//tbody[contains(@id,':HOPolicyLevelCoveragesIDTab:panelId-tbody')]"));
			hm.put("PersonalAutoCoverage", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV_ref-tbody"));
			hm.put("VehicleCoverage", By.xpath(".//tbody[contains(@id,'PersonalAuto_VehicleCoverageDetailDV-tbody')]"));
			hm.put("HODwellingCoverage", By.xpath(".//tbody[contains(@id,':HOAdditionalCoveragesDV-tbody')]"));
			
			//hm.put("OptionalPropertyCoverage", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:DwellingEndorsements:HOAdditionalCoveragesPanelSet:HOAdditionalCoveragesDV_ref-tbody"));
			//hm.put("OptionalPropertyCoverage", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:Endorsements:HOAdditionalCoveragesPanelSet:HOAdditionalCoveragesDV_ref-tbody"));
			hm.put("OptionalPropertyCoverage", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:Endorsements:HOAdditionalCoveragesPanelSet:dwellingDetails:HOAdditionalCoveragesDV-tbody"));
			
			hm.put("eleAutoLiabilityPackage", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:3:CoverageInputSet:CovPatternInputGroup:LiabilityTermInput-inputEl"));

			hm.put("lstAutoLiabilityPackage", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:3:CoverageInputSet:CovPatternInputGroup:LiabilityTermInput-inputEl"));
			hm.put("eleBodilyInjuryLimi", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:PackageTermInput-inputEl"));
			hm.put("lstBodilyInjuryLimi", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:PackageTermInput-inputEl"));
			hm.put("elePropertyDamageLimit", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:1:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl"));
			hm.put("lstPropertyDamageLimit", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:1:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl"));

			hm.put("eleMedicalPayments", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:2:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl"));
			hm.put("lstMedicalPayments", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:2:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl"));
			hm.put("eleBodyInjuryPackage", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:5:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:PackageTermInput-inputEl"));
			hm.put("lstBodyInjuryPackage", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:5:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:PackageTermInput-inputEl"));
			hm.put("eleCoverageOption", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:5:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:TypekeyTermInput-inputEl"));
			hm.put("lstCoverageOption", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:5:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:TypekeyTermInput-inputEl"));

				//PIP_Florida
				hm.put("elePIPFloridaDeductible",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PAPipCategoryIterator:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl"));
				hm.put("lstPIPFloridaDeductible", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PAPipCategoryIterator:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl"));
				hm.put("elePIPFloridaWorkLoss", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PAPipCategoryIterator:0:CoverageInputSet:CovPatternInputGroup:2:CovTermInputSet:TypekeyTermInput-inputEl"));
				hm.put("lstPIPFloridaWorkLoss", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PAPipCategoryIterator:0:CoverageInputSet:CovPatternInputGroup:2:CovTermInputSet:TypekeyTermInput-inputEl"));
				hm.put("elePIPFloridaAppliesTo", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PAPipCategoryIterator:0:CoverageInputSet:CovPatternInputGroup:3:CovTermInputSet:TypekeyTermInput-inputEl"));
				hm.put("lstPIPFloridaAppliesTo", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PAPipCategoryIterator:0:CoverageInputSet:CovPatternInputGroup:3:CovTermInputSet:TypekeyTermInput-inputEl"));

				//Uninsured or UnderInsured Motorists Bodily injured
				hm.put("eleUIMorUnIMBodilyInj", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:3:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:PackageTermInput-inputEl"));
				hm.put("lstUIMorUnIMBodilyInj", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:3:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:PackageTermInput-inputEl"));
				hm.put("eleUIMorUnIMStackingOptionFL", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:3:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:TypekeyTermInput-inputEl"));
				hm.put("lstUIMorUnIMStackingOptionFL", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:3:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:TypekeyTermInput-inputEl"));
				hm.put("eleUIMorUnIMOption", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:4:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:TypekeyTermInput-inputEl"));
				hm.put("lstUIMorUnIMOption", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:4:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:TypekeyTermInput-inputEl"));
				hm.put("eleUIMorUnIMBodilyInjGA", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:4:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:PackageTermInput-inputEl"));
				hm.put("lstUIMorUnIMBodilyInjGA", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:4:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:PackageTermInput-inputEl"));

			//Plan and Discount			
			hm.put("elePlanandDiscountTab", By.xpath(".//span[contains(@id,'planAndDiscountTab-btnInnerEl')]"));
			hm.put("eleEFTDiscountYes", By.xpath(".//input[contains(@id,'Discount_AcgDV:EFTDisc_true-inputEl')]"));
			hm.put("eleEFTDiscountNo", By.xpath(".//input[contains(@id,'Discount_AcgDV:EFTDisc_false-inputEl')]"));
			hm.put("elePIFDiscountYes",By.xpath(".//input[contains(@id,'PayInFullDisc_true-inputEl')]"));
			hm.put("elePIFDiscountNo", By.xpath(".//input[contains(@id,'PayInFullDisc_false-inputEl')]"));
			hm.put("eleAdvpurchaseDiscountYes", By.xpath(".//input[contains(@id,'Discount_AcgDV:advancePurchaseIS:AdvPurchaseDisc_true-inputEl')]"));
			hm.put("eleAdvpurchaseDiscountNo", By.xpath(".//input[contains(@id,'Discount_AcgDV:advancePurchaseIS:AdvPurchaseDisc_false-inputEl')]"));
			hm.put("eleOverrideAdvpurchaseDiscountYes", By.xpath(".//input[contains(@id,'AdvPurchaseOveriden_true-inputEl')]"));
			hm.put("eleOverrideAdvpurchaseDiscountNo", By.xpath(".//input[contains(@id,'AdvPurchaseOveriden_false-inputEl')]"));
			
			hm.put("edtAdvDate", By.xpath(".//input[contains(@id,'advancePurchaseIS:DaysinAdvanced-inputEl')]"));
			hm.put("lstPlanAndDiscPlanType", By.xpath(".//input[contains(@id,'Plan_AcgDV:planType-inputEl')]"));
			hm.put("lstPlanAndDiscPaymentOptions", By.xpath(".//input[contains(@id,'Plan_AcgDV:paymentType-inputEl')]"));

				//HO open property coverage
				hm.put("eleHOOpenLiabCvrg", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOPOlicyLevelEndorsementsCardIdTab-btnInnerEl"));
				hm.put("btnHOOPenLiabAddCvrg", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOLineEndorsements:HOAdditionalCoveragesPanelSet:HOAdditionalCoveragesDV_tb:Add-btnInnerEl"));
				hm.put("eleHOHomeLine",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOPolicyLevelExclusionsAndConditionsCardHomeownersTab-btnInnerEl"));
				hm.put("btnHOHomeLineAddEx", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:PolicyLevelConditionsAndExclusions:HOAdditionalExclusionsAndConditionsPanelSet:AddExclusionsOrCondition-btnInnerEl"));
				hm.put("eleHODwellingEx", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOPolicyLevelExclusionsAndConditionsCardDwellingTab-btnInnerEl"));
				hm.put("btnHODwellingAddEX", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:PolicyLevelConditionsAndExclusionsDwelling:HOAdditionalExclusionsAndConditionsPanelSet:AddExclusionsOrCondition"));
				
				hm.put("eleHOOpenPropertyCoverages", By.xpath(".//a[contains(@id,':HOEndorsementsCardIdTab')]"));
			
				hm.put("btnHOOpenPropAddCoverages", By.xpath(".//a[contains(@id,':HOAdditionalCoveragesDV_tb:Add')]"));
				hm.put("edtHOOpenKeywordSearch", By.id("CoveragePatternSearchPopup:CoveragePatternSearchScreen:CoveragePatternSearchDV:Keyword-inputEl"));
				hm.put("btnSearchHOOpenAddCovg", By.id("CoveragePatternSearchPopup:CoveragePatternSearchScreen:CoveragePatternSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
				hm.put("eleHOOpenSelectCoverage", By.id("CoveragePatternSearchPopup:CoveragePatternSearchScreen:CoveragePatternSearchResultsLV-body"));
				hm.put("btnHOOpenAddSelectedCovg", By.id("CoveragePatternSearchPopup:CoveragePatternSearchScreen:CoveragePatternSearchResultsLV_tb:AddCoverageButton-btnInnerEl"));
				hm.put("eleAddedCvgTitle", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:DwellingEndorsements:HOAdditionalCoveragesPanelSet:HOAdditionalCoveragesDV:0:HOCoverageInputSet:CovPatternInputGroup-legendTitle"));
				hm.put("eleLimitExpandedCvgJewel", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:DwellingEndorsements:HOAdditionalCoveragesPanelSet:HOAdditionalCoveragesDV:0:HOCoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:PackageTermInput-inputEl"));
				hm.put("lstLimitExpandedCvgJewel", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:DwellingEndorsements:HOAdditionalCoveragesPanelSet:HOAdditionalCoveragesDV:0:HOCoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:PackageTermInput-inputEl"));
				//hm.put("eleContractSale", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:DwellingEndorsements:HOAdditionalCoveragesPanelSet:HOAdditionalCoveragesDV:0:HOCoverageInputSet:CovPatternInputGroup-legendTitle"));
				
			hm.put("eleHOOpenExclusionCoverages", By.xpath(".//span[contains(@id, 'HOPolicyLevelExclusionsAndConditionsCardHomeownersTab-btnInnerEl')]"));	
			hm.put("btnHOOpenExclusionAddCoverages", By.xpath(".//span[contains(@id, 'HOAdditionalExclusionsAndConditionsPanelSet:AddExclusionsOrCondition-btnInnerEl')]"));
			hm.put("edtHOExclusionKeywordSearch", By.xpath(".//input[contains(@id, 'CoveragePatternSearchDV:Keyword-inputEl')]"));
			hm.put("btnSearchHOExclusionAddCovg", By.id("CoveragePatternSearchPopup:CoveragePatternSearchScreen:CoveragePatternSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			
			
			
			
			
			hm.put("lstAllOtherPerils", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:0:HOCoverageInputSet:CovPatternInputGroup:0:CovTermPOCHOEInputSet:OptionTermInput-inputEl"));
			hm.put("edtNetAllOtherPerils", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:0:HOCoverageInputSet:CovPatternInputGroup:1:CovTermPOCHOEInputSet:DirectTermInput-inputEl"));
			hm.put("eleTropicalCyclone", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:0:HOCoverageInputSet:CovPatternInputGroup:2:CovTermPOCHOEInputSetOptionTermInput-inputEl"));

			hm.put("lstTropicalCyclone", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:0:HOCoverageInputSet:CovPatternInputGroup:2:CovTermPOCHOEInputSet:OptionTermInput-inputEl"));
			hm.put("eleVendorPrefill",By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:isPrefillOrdered_true-inputEl"));
			hm.put("eleWindstormOrHailDeductType", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:0:HOCoverageInputSet:CovPatternInputGroup:3:CovTermPOCHOEInputSet:OptionTermInput-inputEl"));
			hm.put("lsjWindstormOrHailDeductType", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:0:HOCoverageInputSet:CovPatternInputGroup:3:CovTermPOCHOEInputSet:OptionTermInput-inputEl"));
			hm.put("lstWindstormOrHailDeductType", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:0:HOCoverageInputSet:CovPatternInputGroup:3:CovTermPOCHOEInputSet:OptionTermInput-inputEl"));
			hm.put("edtWindstormOrHailDeductType", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:0:HOCoverageInputSet:CovPatternInputGroup:3:CovTermPOCHOEInputSet:OptionTermInput-inputEl"));

			hm.put("eleWindstormOrHailDeduct", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:0:HOCoverageInputSet:CovPatternInputGroup:4:CovTermPOCHOEInputSet:OptionTermInput"));
			hm.put("lstWindstormOrHailDeduct", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:0:HOCoverageInputSet:CovPatternInputGroup:4:CovTermPOCHOEInputSet:OptionTermInput"));
			
			hm.put("eljModernConstrValueYes", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:1:HOCoverageInputSet:CovPatternInputGroup:0:CovTermPOCHOEInputSet:BooleanTermInput_true-inputEl"));
			hm.put("eljModernConstrValueNo", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:1:HOCoverageInputSet:CovPatternInputGroup:0:CovTermPOCHOEInputSet:BooleanTermInput_false-inputEl"));
			hm.put("edtDwellingLimit", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:1:HOCoverageInputSet:CovPatternInputGroup:1:CovTermPOCHOEInputSet:DirectTermInput-inputEl"));
			hm.put("edjDwellingLimit", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:1:HOCoverageInputSet:CovPatternInputGroup:1:CovTermPOCHOEInputSet:DirectTermInput-inputEl"));
			hm.put("edtReplacementCostEst", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:1:HOCoverageInputSet:CovPatternInputGroup:2:CovTermPOCHOEInputSet:DirectTermInput-inputEl"));
			hm.put("edtAdditionalStructLimit", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:2:HOCoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:DirectTermInput-inputEl"));
			hm.put("elePersonalPropertyPercentOfA", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:3:HOCoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl"));

			hm.put("lstPersonalPropertyPercentOfA", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:3:HOCoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl"));
			hm.put("edtPersonalPropertyLimit", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:3:HOCoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:DirectTermInput-inputEl"));
			hm.put("eleAddLvngExpPercentofA", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:4:HOCoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl"));

			hm.put("lstAddLvngExpPercentofA", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:4:HOCoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl"));
			hm.put("edtAddLvngExpLimit", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId1:4:HOCoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:DirectTermInput-inputEl"));
			hm.put("elePersonalLiabLimit", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId2:0:HOCoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl"));
			hm.put("eleMedicalPaymentsLimit", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId2:1:HOCoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl"));
			hm.put("lstPersonalLiabLimit", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId2:0:HOCoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl"));
			hm.put("lstMedicalPaymentsLimit", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatterIterId2:1:HOCoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl"));
			hm.put("eleExtendedCoverageYes", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatternHODW:0:HOCoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:BooleanTermInput_true-inputEl"));
			hm.put("eleExtendedCoverageNo", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:coveragePatternHODW:0:HOCoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:BooleanTermInput_false-inputEl"));
			
			//Dwelling Exclusions and Conditiosn
			hm.put("eleDwellingExclusions", By.xpath(".//a[contains(@id,'HOPolicyLevelExclusionsAndConditionsCardHomeownersTab')]"));
			hm.put("btnAddExcclusionorCond", By.xpath(".//a[contains(@id,'AddExclusionsOrCondition')]"));
			hm.put("eleExlusionRadio", By.id("CoveragePatternSearchPopup:CoveragePatternSearchScreen:CoveragePatternSearchDV:SearchType_option2-inputEl"));
			//hm.put("edt", value)
			//Scheduled Personal Property 
			//Scheduled Personal Property 
			hm.put("lstSPPCategory", By.xpath(".//input[contains(@id,'Category-inputEl')]"));
			hm.put("btnSPPAdd", By.xpath(".//a[contains(@id,'ItemsLV_tb:AddButton')]"));
			
			hm.put("edtSPPShortDescription", By.xpath(".//input[contains(@id,'ShortDescription-inputEl')]"));
			hm.put("edtSPPValue", By.xpath(".//input[contains(@id,'Value-inputEl')]"));

			hm.put("lstSPPType", By.xpath(".//input[contains(@id,'Type-inputEl')]"));
			hm.put("eleStampCollectionNo",By.xpath(".//input[contains(@id,'StampCollection_false-inputEl')]"));
			hm.put("eleAppraisalYes",By.xpath(".//input[contains(@id,'Appraisal_true-inputEl')]"));
			hm.put("eleAppraisalNo",By.xpath(".//input[contains(@id,'Appraisal_false-inputEl')]"));
			hm.put("eleCoinCollectionYes",By.xpath(".//input[contains(@id,'CoinCollection_true-inputEl')]"));
			hm.put("eleCoinCollectionNo",By.xpath(".//input[contains(@id,'CoinCollection_false-inputEl')]"));
			hm.put("eleGemPrintYes",By.xpath(".//input[contains(@id,'GemprintItem_true-inputEl')]"));
			hm.put("eleGemPrintNo",By.xpath(".//input[contains(@id,'GemprintItem_false-inputEl')]"));
			//Risk Analysis For Both PA and HO
			
			hm.put("eleIssuesTable", By.xpath(".//div[contains(@id,'RiskEvaluationPanelSet:0-body')]"));
			hm.put("eleUWISsuesTab", By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:EvaluationIssuesCardTab-btnInnerEl"));
			hm.put("eleContingenciesTab", By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:ContingenciesCardTab-btnInnerEl"));
			hm.put("elePriorPoliciesTab", By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:PriorPolicyCardTab-btnInnerEl"));
			hm.put("eleClaimsTab", By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:ClaimsCardTab-btnInnerEl"));
			hm.put("elePriorLossesTab", By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:LossHistoryCardTab-btnInnerEl"));
			hm.put("eleMotorVehicleRecordsTab", By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:MotorVehicleRecordTab-btnInnerEl"));
			hm.put("btnAddUWIssue", By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV_tb:AddManualIssue"));
			hm.put("btnAddContingency", By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV_tb:AddNewContingencyButton-btnInnerEl"));
			hm.put("btnRequestApproval", By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV_tb:RequestApproval-btnInnerEl"));
			hm.put("eleUWIssuesTab", By.xpath(".//span[contains(@id,'olicyFile_EvaluationIssuesCardTab-btnInnerEl')]"));
			
			//Policy Review
			hm.put("elePRQuote", By.xpath(".//span[contains(@id,'QuoteOrReview-btnInnerEl')]"));
			hm.put("eljPRQuote", By.xpath(".//span[contains(@id,'QuoteOrReview-btnInnerEl')]"));
			hm.put("elePRReleaseLock", By.id("SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:Unlock-btnInnerEl"));
			hm.put("elePRVersions", By.id("SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:Versions-btnInnerEl"));
			hm.put("elePRVersionsSideBySide", By.id("SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:Versions:SideBySide-textEl"));
			hm.put("elePRCloseOptions", By.id("SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:CloseOptions-btnInnerEl"));
			hm.put("elePRCloseWithdraw", By.id("SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:CloseOptions:WithdrawJob-textEl"));
			hm.put("elePRCloseDecline", By.id("SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:CloseOptions:Decline-textEl"));
			hm.put("elePRCloseNotTaken", By.id("SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:CloseOptions:NotTakenJob-textEl"));
			hm.put("edjSelectPlan", By.xpath(".//input[contains(@id,'tierPlanIterator:0:PickOffering-inputEl')]"));
			hm.put("eleSelectVersion", By.xpath(".//a[contains(@id,'ActionButtonSetsId:1:SelectButtonId')]"));
			hm.put("eleSelectVersion0", By.xpath(".//a[contains(@id,'ActionButtonSetsId:0:SelectButtonId')]"));
			hm.put("eleBindOption", By.id("SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnWrap"));
//			hm.put("eleIssuePolicy", By.id("SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions:BindAndIssue-textEl"));
			hm.put("eleIssuePolicy", By.xpath(".//span[contains(text(),'Issue Policy')]"));
			hm.put("eleAlertPopUp", By.id("button-1005-btnInnerEl"));
			hm.put("eleDetails", By.id("UWBlockProgressIssuesPopup:IssuesScreen:DetailsButton-btnInnerEl"));
			hm.put("eleApprove", By.xpath(".//a[contains(text(), 'Approve')]"));
			hm.put("eleUWApprove", By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:Approve-btnInnerEl"));
			hm.put("eleRiskOkButton", By.id("RiskApprovalDetailsPopup:Update-btnInnerEl"));
		//	hm.put("eleProceedtoBind", By.id("SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:ProceedToBind"));

			hm.put("eleProceedtoBind", By.xpath(".//span[contains(text(),'Proceed To Bind')]"));
			
			//Payment Sceen
			//Documents
			hm.put("eleDocumentsScreen", By.id("SubmissionWizard:Documents"));
			hm.put("eleSave", By.id("NewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:NewTemplateDocumentDV:SaveBtnId"));
			hm.put("eleDocsEdit", By.id("NewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:NewTemplateDocumentDV:EditBtnlId"));

			 hm.put("eleNewDocumentLink", By.xpath(".//span[contains(@id, 'Documents_NewDocumentButton-btnInnerEl')]"));
			 hm.put("eleTemplateLnk", By.xpath(".//span[contains(@id, 'PolicyFile_Documents_NewDocumentButton:NewJobDocumentMenuItemSet:PolicyPeriodNewDocumentMenuItemSet_Template-textEl')]"));
			 
			 hm.put("eleDocumentTemplateSearchImg", By.xpath(".//div[contains(@id, 'SelectTemplatePicker')]"));
			 hm.put("edtRemarks", By.id("NewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:NewTemplateDocumentDV:RemarksTextInput-inputEl"));
			hm.put("btnTemplateSave", By.id("NewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:NewTemplateDocumentDV:SaveBtnId"));
			 //Reports 
			hm.put("Reports", By.xpath(".//[contains(@id,'Reports_Acg')]"));
			hm.put("eleVehicleHistReportTab", By.xpath(".//a[contains(@id,':vehicleReportIdTab')]"));
			hm.put("eleLossesAndViolations",By.xpath(".//span[contains(@id,'lossesAndViolationsCardTab-btnInnerEl')]"));
			hm.put("eleAutoLossesYes",By.xpath(".//input[contains(@id,'autoLosses_true-inputEl')]"));
			//hm.put("eleAutoLossesNo",By.xpath(".//input[contains(@id,'autoLosses_false-inputEl')]"));
			hm.put("eleAutoLossesNo",By.xpath(".//input[contains(@id,'autoLosses_false-inputEl')]"));
			hm.put("eleDrivingviolationsYes",By.xpath(".//input[contains(@id,'drivingViolations_true-inputEl')]"));
			hm.put("eleDrivingviolationsNo",By.xpath(".//input[contains(@id,'drivingViolations_false-inputEl')]"));
			hm.put("eleHomelossesYes", By.xpath(".//input[contains(@id,'homeLosses_true-inputEl')]"));	
			hm.put("eleHomelossesNo", By.xpath(".//input[contains(@id,'homeLosses_false-inputEl')]"));
			hm.put("eljHomelossesNo", By.xpath(".//input[contains(@id,'homeLosses_false-inputEl')]"));
			hm.put("eleOrderAutoLossHist", By.xpath(".//a[contains(@id,':autoLoss:orderVALH')]"));
			hm.put("eljOrderAutoLossHist", By.xpath(".//a[contains(@id,':autoLoss:orderVALH')]"));
			hm.put("btnOrderAutoLossHist", By.xpath(".//a[contains(@id,':autoLoss:orderVALH')]"));
			hm.put("eleAutoLossesTable", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:InsuranceScoreCV:autoLossPanel:AutoLossLV-body"));
			hm.put("eljOrderHomeLossHist", By.xpath(".//a[contains(@id,':homeLoss:orderVHLH')]"));
			hm.put("eleAutoLossesTable", By.xpath(".//div[contains(@id,'autoLossPanel:AutoLossLV-body')]"));
			hm.put("eljOrder/RetrieveMVR", By.xpath(".//span[contains(text(),'Order/Retrieve MVR')]"));
			hm.put("eleSelectallMVR", By.xpath(".//div[contains(@id,'MVRReportLV')]//div[2]//div//div//div//div//span//span//span//div"));
			
				///Insurance Score
			hm.put("eleReportsTab", By.id("SubmissionWizard:LOBWizardStepGroup:Reports_Acg"));
			hm.put("lstInsuranceScoreOrdered", By.xpath(".//input[contains(@id,':ScoreType-inputEl')]"));
			hm.put("lsjInsuranceScoreOrdered", By.xpath(".//input[contains(@id,':ScoreType-inputEl')]"));
			hm.put("edtSecondCommonSSN", By.xpath(".//input[contains(@id,'SecondOfficialIDDV_Input-inputEl')]"));
			hm.put("lstSecondInsuranceScoreOrdered", By.xpath(".//input[contains(@id,':SecondScoreType-inputEl')]"));
			hm.put("btnOrderorRetrieveInsScore", By.xpath(".//a[contains(@id,'orderInsuranceScore')]"));
			hm.put("eljOrderorRetrieveInsScore", By.xpath(".//a[contains(@id,'orderInsuranceScore')]"));
			hm.put("btnOrderVendorInsScore", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:InsuranceScoreCV:Score:VendorInsuracneScore"));
			hm.put("btnOrderOrRetrieveSecondInsScore", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:InsuranceScoreCV:SecondScore:orderInsuranceScoreSecond"));
			hm.put("btnOrderSecondVendorInsScore", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:InsuranceScoreCV:SecondScore:VendorInsuracneScoreSecond"));
			hm.put("CreditScoreTable", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:InsuranceScoreCV:InsuranceScoreDetailsLV-body"));
			hm.put("eleInsurnceScoreCardTab", By.xpath(".//span[contains(@id,'InsurnceScoreCardTab-btnInnerEl')]"));
			hm.put("lstPremierIndicator", By.xpath(".//input[contains(@id,':Score:PremierIndicator-inputEl')]"));
			hm.put("lstPremierLevel", By.xpath(".//input[contains(@id,':Score:PremierLevel-inputEl')]"));
			hm.put("lsjSecondInsuranceScoreOrdered", By.xpath(".//input[contains(@id,':SecondScoreType-inputEl')]"));
			hm.put("lstSecondPremierIndicator", By.xpath(".//input[contains(@id,':SecondScore:PremierIndicator-inputEl')]"));
			hm.put("lstSecondPremierLevel", By.xpath(".//input[contains(@id,':SecondScore:SecondPremierLevel-inputEl')]"));
			///VehcileHistoryTable
			hm.put("eleVehicleHistoryTable", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:InsuranceScoreCV:VehicleReport_AcgLV-body"));
			
			hm.put("lstInsuranceScoreOrdered", By.xpath(".//input[contains(@id,':ScoreType-inputEl')]"));
			hm.put("edtSecondCommonSSN", By.xpath(".//input[contains(@id,'SecondOfficialIDDV_Input-inputEl')]"));
			hm.put("lstSecondInsuranceScoreOrdered", By.xpath(".//input[contains(@id,':SecondScoreType-inputEl')]"));
			hm.put("btnOrderorRetrieveInsScore", By.xpath(".//a[contains(@id,'orderInsuranceScore')]"));
			hm.put("btnOrderVendorInsScore", By.xpath(".//a[contains(@id,'VendorInsuracneScore')]"));
			hm.put("btnOrderOrRetrieveSecondInsScore", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:InsuranceScoreCV:SecondScore:orderInsuranceScoreSecond"));
			hm.put("btnOrderSecondVendorInsScore", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:InsuranceScoreCV:SecondScore:VendorInsuracneScoreSecond"));
			hm.put("CreditScoreTable", By.xpath(".//div[contains(@id,':InsuranceScoreDetailsLV-body')]"));
				///VehcileHistoryTable
			hm.put("eleVehicleHistoryTable", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:Report_AcgPanelSet:InsuranceScoreCV:VehicleReport_AcgLV-body"));
		//	SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:Report_AcgPanelSet:InsuranceScoreCV:VehicleReport_AcgLV-body
			//Quote
			hm.put("eleQuoteTab",By.xpath(".//td[contains(@id,'Quote')]"));
			hm.put("btnEditPolicyTranx", By.xpath(".//span[contains(@id,'EditPolicy-btnInnerEl')]"));
			hm.put("eleEditPolicyTranx", By.xpath(".//span[contains(@id,'EditPolicy')]"));
			hm.put("eleEditPolicyTranxWorkflow", By.xpath(".//span[contains(@id,'EditPolicyWorkflow-btnInnerEl)]"));			hm.put("lstBillingMethod", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:BillingMethod-inputEl"));			
			hm.put("btnQuoteReleaseScreen", By.id("SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:Unlock-btnInnerEl"));
			hm.put("sclQuote", By.xpath(".//*[@id='SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']"));
			hm.put("btnEditPolicyTranx", By.id("SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:EditPolicy-btnInnerEl"));
			hm.put("lstBillingMethod", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:BillingMethod-inputEl"));
			
//			hm.put("elePRQuote", By.xpath(".//*[@id='SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']"));
			//hm.put("elePRQuote", By.xpath(".//*[contains(@id,'QuoteOrReview-btnInnerEl')]"));
		//	hm.put("eleProceedtoBind", By.id("SubmissionWizard:Job_RiskAnalysisScreen:JobWizardToolbarButtonSet:ProceedToBind-btnInnerEl"));
			hm.put("eleBindOption", By.id("SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnWrap"));
			hm.put("eleBindOptions", By.xpath(".//span[contains(@id, 'BindOptions-btnInnerEl')]"));
			hm.put("eleBindOnly", By.id("SubmissionWizard:Job_RiskAnalysisScreen:JobWizardToolbarButtonSet:BindOptions:BindOnly-textEl"));
			hm.put("eleBindOnlyPC", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:JobWizardBillingToolbarButtonSet:BindOptions:BindOnly-textEl"));
			hm.put("eleReadyforPayment", By.xpath(".//span[contains(@id, 'ReadyForPayment-textEl')]"));
			hm.put("eljReadyforPayment", By.xpath(".//span[contains(@id, 'ReadyForPayment-textEl')]"));
			hm.put("elePayandBind", By.xpath(".//span[contains(@id, 'PayAndBind-textEl')]"));
			hm.put("eleBindWithOutPayment", By.xpath(".//span[contains(@id, 'BindWithoutPayment-textEl')]"));
			hm.put("eljBindWithOutMembership", By.xpath(".//span[contains(@id, 'BindWithoutMembership-textEl')]"));
//			hm.put("eleIssuePolicy", By.id("SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions:BindAndIssue-textEl"));
			hm.put("eleIssuePolicy", By.xpath(".//span[contains(text(),'Issue Policy')]"));
			hm.put("eleAlertPopUp", By.id("button-1005-btnInnerEl"));
			hm.put("eleDetails", By.id("UWBlockProgressIssuesPopup:IssuesScreen:DetailsButton-btnInnerEl"));
			hm.put("eleApprove", By.xpath(".//a[contains(text(), 'Approve')]"));
			hm.put("eleRiskOkButton", By.id("RiskApprovalDetailsPopup:Update-btnInnerEl"));
			hm.put("eleApproveButton", By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:1:UWIssueRowSet:Approve"));
			hm.put("eleSPLApprvoalAssertTable1", By.id("SubmissionWizard/ViewQuote"));
			hm.put("eleSPLApprvoalAssertTable", By.xpath(".//*[@id='SubmissionWizard/ViewQuote']/table/tbody/tr[4]/td"));
			hm.put("eleSPLApprvoalAssert", By.id("SubmissionWizard:SubmissionWizard_QuoteScreen:WarningsPanelSet:0:PanelSet:Warning"));
			hm.put("eleRiskAnalysispage", By.xpath(".//span[contains(text(),'Risk Analysis')]"));
			hm.put("eleAuthorityApprove", By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:1:UWIssueRowSet:authorityAcknowledge_Ext"));
			hm.put("eleBindOptionAssert", By.id("SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnInnerEl"));
//			hm.put("eleApprove", By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:1:UWIssueRowSet:Approve"));
			hm.put("eleAuthorityAckowledge", By.xpath(".//a[contains(text(), 'Authority Acknowledge')]"));
			hm.put("eleSpecialApprove", By.xpath(".//a[contains(text(),'Special Approve')]"));
			hm.put("eleSpecialApproveButton", By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:1:UWIssueRowSet:SpecialApprove"));
			hm.put("eleApproveButtonType", By.id("SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:0-body"));
			//Forms
			hm.put("eleTrailingDocsTable", By.id("SubmissionWizard:FormsScreen:TrailingDocumentsLV-body"));
			hm.put("elePremTable", By.xpath(".//div[contains(@id,'RatingCumulDetailsPanelSet:0:vehiclePanelIterator:"));
			hm.put("eleCovgPremTable", By.xpath(".//div[contains(@id,'costLV-body')]")); 
			
			//Payment for PC
			hm.put("elePaymentPC", By.xpath(".//td[contains(@id,':BillingInfo')]"));
			hm.put("eljPaymentPC", By.id("SubmissionWizard:BillingInfo"));
			hm.put("eleQuote", By.xpath(".//tbody//span[contains(text(),'Quote')]"));
			hm.put("eleFullAPP", By.xpath(".//a[contains(@id,'ConvertToFullApp')]"));
			hm.put("elePolicyReviewScreen", By.id("SubmissionWizard:PolicyReview"));
			hm.put("elePaymentBindOptions", By.xpath(".//span[contains(@id,'BindOptions-btnInnerEl')]"));
			hm.put("elePaymentIssuePolicy", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:JobWizardBillingToolbarButtonSet:BindOptions:BindAndIssue-textEl"));
			hm.put("btnPayEditPolicyTrax", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:JobWizardBillingToolbarButtonSet:EditPolicy-btnInnerEl"));
			hm.put("elePayBillingMethod", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:BillingMethod-inputEl"));
			hm.put("lstPayBillingMethod", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:BillingMethod-inputEl"));
			hm.put("btnPaymentConfirm", By.xpath(".//*[@id='button-1005-btnInnerEl']"));
			hm.put("btnIssueConfirm", By.xpath(".//*[@id='button-1005-btnInnerEl']"));
			hm.put("elePaymentTab", By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailPayments"));
			hm.put("elePaymentReverseTbl", By.id("AccountPayments:AccountDetailPaymentsScreen:DirectBillPaymentsListDetail:AccountDBPaymentsLV-body"));
			hm.put("eleReverse", By.id("AccountPayments:AccountDetailPaymentsScreen:DirectBillPaymentsListDetail:AccountDBPaymentsLV:0:ActionButton:ReversePayment-textEl"));
			hm.put("eleReverseActions", By.xpath(".//a[contains(text(), 'Actions')]"));
			hm.put("lstCnfmReverselReason", By.id("DBPaymentReversalConfirmationPopup:Reason-inputEl"));
			hm.put("btnCnfmReverselok", By.id("DBPaymentReversalConfirmationPopup:Update-btnInnerEl"));
			hm.put("elePaymentPlanTable", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:PlanInputSet:PaymentsPlanDV:PaymentsPlanInputSet:InstallmentPlan:BillingAdjustmentsInstallmentsLV-body"));
			hm.put("eljIssueNow", By.xpath(".//span[contains(@id,'IssueNow-textEl')]"));
			
			/*hm.put("elePaymentPage", By.xpath(".//span[contains(text(),'Payment')]"));
			hm.put("lstBillingMethod", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:BillingMethod-inputEl"));
			hm.put("elePayBindOption", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:JobWizardToolbarButtonSet:BindOptions-btnWrap"));
			hm.put("elePayIssuePolicy", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:JobWizardToolbarButtonSet:BindOptions:BindAndIssue-textEl"));
//			hm.put("elePolicyNumber", By.id("JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl"));
			hm.put("elePolicyNumber", By.xpath(".//*[contains(@id,'ViewPolicy-inputEl')]"));
			hm.put("lstBillingNumber", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:billingnumber_Ext-inputEl"));
			hm.put("edtBillingNumber", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:enterBillingNumber_Ext-inputEl"));
			hm.put("lstPay", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:installmentplans_Ext-inputEl"));
			hm.put("elePolicySummary", By.id("PolicyFile_Summary:Policy_SummaryScreen:0"));
			hm.put("bliPayBindOption", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:JobWizardToolbarButtonSet:BindOptions-btnWrap"));
			hm.put("eleclkPolicyNumber", By.id("JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl"));
			hm.put("eleViewPolicy", By.id("JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl"));
			hm.put("elePolicyNumbetInPolicySummaryPage", By.id("PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_PolicyDV:PolicyNumber-inputEl"));
			hm.put("elePayrollProviderImg", By.xpath("//*[contains(@id,'payrollprovidernametrigger:Selectpayrollprovidernametrigger')]"));
			hm.put("eleXactPayLaunchTitle", By.id("PSXactpayLaunch_ExtPopup:XactpayLaunchScreen:0"));
	        hm.put("eleNewBillingNum", By.xpath("//*[contains(@id,'newBillingNumber-inputEl')]"));
			hm.put("eleClassName", By.className("x-list-plain"));
			*/
			//Final Submission Bound Page(To take the policy Number)
			hm.put("eleSubmissionBound", By.id("JobComplete:JobCompleteScreen:ttlBar"));
			hm.put("elePolicyNumberText", By.xpath(".//div[contains(@id,'ViewPolicy-inputEl')]"));
			hm.put("eleSubmissionNumber", By.id("PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_TransactionsLV:0:JobNumber"));
			hm.put("eleSubmissionNumberQuote", By.id("SubmissionWizard:0_header-innerCt"));
			//Policy Change
			hm.put("eleChangePolicy", By.xpath(".//span[contains(@id,':PolicyFileMenuActions_ChangePolicy-textEl')]"));
			hm.put("edtCPEffectiveDate", By.id("StartPolicyChange:StartPolicyChangeScreen:StartPolicyChangeDV:nullDate-inputEl"));
			hm.put("edtCPDecription", By.xpath(".//input[contains(@id,':Description-inputEl')]"));
			hm.put("elePolicyInfoScreen", By.xpath(".//td[contains(@id,':PolicyInfo')]"));
			hm.put("elePADriversScreen", By.xpath(".//td[contains(@id,':PADrivers')]"));
			hm.put("eleVehicleScreen", By.xpath(".//td[contains(@id,':PersonalVehicles')]"));
			hm.put("elePACovergesScreen", By.xpath(".//td[contains(@id,':PALine')]"));
			
			hm.put("eleHOPriorScreenScreen", By.xpath(".//td[contains(@id,':PriorPolicies')]"));
			hm.put("eleHODwellingScreen", By.xpath(".//td[contains(@id,'::HomeownersDwelling')]"));
			hm.put("eleHODwellingConstructionScreen", By.xpath(".//td[contains(@id,':HomeownersDwellingConstruction')]"));
			hm.put("eleHOCovergesScreen", By.xpath(".//td[contains(@id,':HOCoverages')]"));
			
			
				///Policy Change Drivers
			hm.put("eleDriverNonPremiumPaymentYes", By.xpath(".//input[contains(@id,'DriverNonPremiumPayment_true-inputEl')]"));
			hm.put("eleDriverNonPremiumPaymentNo", By.xpath(".//input[contains(@id,'DriverNonPremiumPayment_false-inputEl')]"));
			hm.put("eleDriversFullTimeResidentYes", By.xpath(".//input[contains(@id,'DriversFullTimeResident_true-inputEl')]"));
			hm.put("eleDriversFullTimeResidentNo", By.xpath(".//input[contains(@id,'DriversFullTimeResident_false-inputEl')]"));
			hm.put("eleDriverDeniedPaymentYES", By.xpath(".//input[contains(@id,'DriverDeniedPayment_true-inputEl')]"));
			hm.put("eleDriverDeniedPaymentNo", By.xpath(".//input[contains(@id,'DriverDeniedPayment_false-inputEl')]"));
			hm.put("eleDriverLicenseCancellationYES", By.xpath(".//input[contains(@id,':DriverLicenseCancellation_true-inputEl')]"));
			hm.put("eleDriverLicenseCancellationNo", By.xpath(".//input[contains(@id,':DriverLicenseCancellation_false-inputEl')]"));
			hm.put("eleDriverSR22orFR44FnnclRspnsbltyYES", By.xpath(".//input[contains(@id,':DriverSR22orFR44FnnclRspnsblty_true-inputEl')]"));
			hm.put("eleDriverSR22orFR44FnnclRspnsbltyNo", By.xpath(".//input[contains(@id,':DriverSR22orFR44FnnclRspnsblty_false-inputEl')]"));
			hm.put("eleDriverSR22FnnclRspnsbltyYES", By.xpath(".//input[contains(@id,'DriverSR22FnnclRspnsblty_true-inputEl')]"));
			hm.put("eleDriverSR22FnnclRspnsbltyNo", By.xpath(".//input[contains(@id,'DriverSR22FnnclRspnsblty_false-inputEl')]"));
			hm.put("eleDriverCancelledYes", By.xpath(".//input[contains(@id,'DriverCancelled_true-inputEl')]"));
			hm.put("eleDriverCancelledNo", By.xpath(".//input[contains(@id,'DriverCancelled_false-inputEl')]"));
			
					/// Policy Change Reports
			
			hm.put("eleBypassInsuranceScore", By.id("PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:Report_AcgPanelSet:InsuranceScoreCV:OverrideInsuranceScoreReport-inputEl"));
			
			
			
			hm.put("lstCPDateReceived", By.id("StartPolicyChange:StartPolicyChangeScreen:StartPolicyChangeDV:ReceivedDate_date-inputEl"));
			hm.put("eleCPNext", By.cssSelector("a[id='StartPolicyChange:StartPolicyChangeScreen:NewPolicyChange'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("btnCPIssuePolicy", By.xpath(".//span[contains(@id,':BindPolicyChange-btnInnerEl')]"));
			hm.put("eleCPIssuePolicy", By.xpath(".//span[contains(@id,':BindPolicyChange-btnInnerEl')]"));
			hm.put("btnCPAddRemarks", By.xpath(".//span[contains(@id,':PolicyRemarks-btnInnerEl')]"));
			hm.put("eleCPAddRemarks", By.xpath(".//span[contains(@id,':PolicyRemarks-btnInnerEl')]"));
			hm.put("edtCPAddRemarksInput", By.xpath(".//textarea[contains(@id,':Remarks-inputEl')]"));
			
			//Add Class Function
			hm.put("eletableRowXpath", By.xpath(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:WC7StateCoverageScreen:WC7StateCoverageCV:WC7ClassesInputSet:WCCovEmpLV-body']/div/table/tbody"));
			hm.put("eleCheckingStateActExist", By.xpath(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:WC7StateCoverageScreen:WC7StateCoverageCV:WC7ClassesInputSet:WCCovEmpLV-body']/div/table/tbody/tr"));
			
			//State Edit Box
			hm.put("edtStateAct", By.name("WC7SpecialCoverage"));
			
			//Address Edit Box
			hm.put("edtAddressCode", By.name("Loc"));
			
			//Class CodeeleAccMerge
			hm.put("lstAddClassSearchCode", By.name("ClassCode"));
			hm.put("eleAddClassSearchButton", By.className("x-trigger-index-0 x-form-trigger x-form-search-trigger x-form-trigger-first"));
			hm.put("eleClassSearchButton", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:WC7StateCoverageScreen:WC7StateCoverageCV:WC7ClassesInputSet:WCCovEmpLV:0:ClassCode:SelectClassCode"));
			hm.put("edtEnterClassCode", By.id("WC7ClassCodeSearchPopup:WC7ClassCodeSearchScreen:WC7ClassCodeSearchDV:Code-inputEl"));
			hm.put("eleClassCodeButton", By.id("WC7ClassCodeSearchPopup:WC7ClassCodeSearchScreen:WC7ClassCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleSelectInput", By.id("WC7ClassCodeSearchPopup:WC7ClassCodeSearchScreen:ClassCodeSearchResultsLV:0:_Select"));
			
			//Annaul Premium
			hm.put("eleAnualPremiumEditClick", By.name("AnnualRenum"));
			hm.put("edtAnualPremiumEditClick", By.name("AnnualRenum"));
			hm.put("lstAnualPremiumEditClick", By.name("AnnualRenum"));
			
			//Search Policy
			hm.put("melPolicy", By.id("TabBar:PolicyTab-btnInnerEl"));
			hm.put("edtPolicyNumber", By.id("TabBar:PolicyTab:PolicyTab_PolicyRetrievalItem-inputEl"));
			hm.put("elePolicyNumberSearch", By.id("TabBar:PolicyTab:PolicyTab_PolicyRetrievalItem_Button"));
			
			//Merge Accounts
			hm.put("eleAccMerge", By.id("AccountFile:AccountFileMenuActions:AccountFileMenuActions_MergeAccounts-textEl"));
			hm.put("edtAccNum", By.id("AccountFile_AccountSearch:OtherAccountSearchScreen:AccountSearch_ExtDV:AccountNumber-inputEl"));
			hm.put("eleMergeSearch", By.id("AccountFile_AccountSearch:OtherAccountSearchScreen:AccountSearch_ExtDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleSelect", By.id("AccountFile_AccountSearch:OtherAccountSearchScreen:OtherAccountSearchResults_ExtLV:0:Select_Ext"));
			hm.put("eleMerge", By.id("AccountFile_MergeAccountsSelection:MergeAccounts-btnInnerEl"));
			hm.put("edtMergeCompanyName", By.id("AccountFile_AccountSearch:OtherAccountSearchScreen:AccountSearch_ExtDV:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("eleSameTgtasSrc", By.id("AccountFile_AccountSearch:OtherAccountSearchScreen:_msgs"));
			hm.put("eleMergeCancel", By.id("AccountFile_MergeAccountsSelection:CancelButton-btnInnerEl"));
			hm.put("btnResetbtn", By.id("AccountFile_AccountSearch:OtherAccountSearchScreen:AccountSearch_ExtDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));
			hm.put("txtMergeTranMsg", By.id("AccountFile_Summary:AccountFile_SummaryScreen:accountMergeMsg_Ext"));
			hm.put("txtMergeCancelMsg", By.id("AccountFile_AccountSearch:OtherAccountSearchScreen:AccountSearch_ExtDV:GlobalContactNameInputSet:Name-labelEl"));
			hm.put("txtCapAccNum", By.xpath(".//*[@id='AccountFile:AccountFileInfoBar:Account-btnInnerEl']/span[2]"));
			hm.put("txtTagetAccNotExistMsg", By.xpath(".//*[@id='AccountFile_AccountSearch:OtherAccountSearchScreen:_msgs']/div[1]"));
			hm.put("eleContacts", By.xpath(".//span[contains(text(), 'Contacts')]"));
			hm.put("eleMergeTranMsg", By.id("AccountFile_Summary:AccountFile_SummaryScreen:accountMergeMsg_Ext"));
			hm.put("eleMergeCancelMsg", By.id("AccountFile_AccountSearch:OtherAccountSearchScreen:AccountSearch_ExtDV:GlobalContactNameInputSet:Name-labelEl"));
			hm.put("eleCapAccNum", By.xpath(".//*[@id='AccountFile:AccountFileInfoBar:Account-btnInnerEl']/span[2]"));
			hm.put("eleTagetAccNotExistMsg", By.xpath(".//*[@id='AccountFile_AccountSearch:OtherAccountSearchScreen:_msgs']/div[1]"));
//			hm.put("eleContacts", By.xpath(".//span[contains(text(), 'Contacts')]"));
//			hm.put("eleContacts", By.xpath(".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Contacts']/div/span"));
			hm.put("eleRole", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:RolesCardTab-btnInnerEl"));
			hm.put("eleMAHTable1", By.xpath(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV-body']/div/table/tbody/tr[2]/td[4]"));

			
			//Merge Validation
			hm.put("eleSearchMenu", By.id("TabBar:SearchTab-btnWrap"));
			hm.put("eleAccSearch", By.id("TabBar:SearchTab:Search_AccountSearch-textEl"));
			hm.put("edtSourceAccount", By.id("AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl"));
			hm.put("eleZeroResultMsg", By.xpath(".//div[contains(text(), 'The search returned zero results.')]"));
			hm.put("eleMVSearch", By.id("AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleCompMatch", By.id("AccountFile_AccountSearch:OtherAccountSearchScreen:AccountSearch_ExtDV:CompanyNameExact-inputEl"));
			hm.put("edtMerAllianceNum", By.id("AccountFile_AccountSearch:OtherAccountSearchScreen:AccountSearch_ExtDV:AllianceMember_Ext-inputEl"));
			hm.put("edtMerAIFNum", By.id("AccountFile_AccountSearch:OtherAccountSearchScreen:AccountSearch_ExtDV:AIFNumber_Ext-inputEl"));
			hm.put("edtMerFEIN", By.id("AccountFile_AccountSearch:OtherAccountSearchScreen:AccountSearch_ExtDV:FEIN_Ext-inputEl"));
			hm.put("edtMerExperian", By.id("AccountFile_AccountSearch:OtherAccountSearchScreen:AccountSearch_ExtDV:ExperianKey_Ext-inputEl"));
			hm.put("eleMAHTable2", By.xpath(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:ContactRolesDV:ContactRolesLV-body']/div/table/tbody/tr/td[2]"));
			hm.put("txtCheckNewRoleActiveStatus", By.xpath(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV-body']/div/table/tbody/tr[2]/td[2]"));
			hm.put("eleCheckNewRoleActiveStatus", By.xpath(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV-body']/div/table/tbody/tr[2]/td[2]"));
			hm.put("eleMerAIFNum", By.id("EditAccountPopup:EditAccountScreen:aifNumber_Ext-inputEl"));
			hm.put("eleMerAllianceNum", By.id("EditAccountPopup:EditAccountScreen:allianceNumber_Ext-inputEl"));
			hm.put("eleMerFEINNum", By.id("EditAccountPopup:EditAccountScreen:OfficialIDInputSet:OfficialIDDV_Input-inputEl"));
			hm.put("accFileContactRoleTable", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV-body"));
			hm.put("eleAccFileContactRoleTable", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV-body"));
			
			//Policy Move
			hm.put("elePolicyMove", By.id("AccountFile:AccountFileMenuActions:AccountFileMenuActions_MovePolicies-textEl"));
			hm.put("eleMergePolicy", By.id("AccountFile_MovePoliciesSelection:MovePoliciesButton"));
			hm.put("btnMergePolicy", By.id("AccountFile_MovePoliciesSelection:MovePoliciesButton"));
			hm.put("txtPolicyMoveMsg", By.id("AccountFile_Summary:AccountFile_SummaryScreen:policyMoveMsg_Ext"));
			hm.put("eleMutilplePolicyMsgCheck", By.id("AccountFile_MovePoliciesSelection:_msgs"));
			hm.put("txtMutilplePolicyMsgCheck", By.id("AccountFile_MovePoliciesSelection:_msgs"));
			hm.put("elePMCount", By.id("AccountFile_MovePoliciesSelection:PSAccountFile_MovePoliciesSelection_ExtLV-body"));
			hm.put("rowPMCount", By.id("AccountFile_MovePoliciesSelection:PSAccountFile_MovePoliciesSelection_ExtLV-body"));
			hm.put("eleAfterPolicyMoveVerify", By.xpath(".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:PSPolicyTermInfo_ExtLV-body']"));
			hm.put("eleMergeAccounts", By.id("AccountFile_MergeAccountsSelection:MergeAccounts-btnInnerEl"));
			hm.put("elePolicyMoveButton", By.id("AccountFile_MovePoliciesSelection:MovePoliciesButton-btnInnerEl"));
			hm.put("txtMergeAccountinPolicyMove", By.id("AccountFile_MergeAccountsSelection:mergeAccountsAlert"));
			hm.put("txtMergeAccountinPolicyMove2", By.id("AccountFile_MergeAccountsSelection:mergeAccountRemovalAlert"));
			hm.put("eleMergeAccountinPolicyMove", By.id("AccountFile_MergeAccountsSelection:mergeAccountsAlert"));
			hm.put("eleMergeAccountinPolicyMove2", By.id("AccountFile_MergeAccountsSelection:mergeAccountRemovalAlert"));
			
			//Policy Move Verification
			hm.put("chkPolicyAvbleinTgtAcc", By.id("AccountFile_Summary:AccountFile_SummaryScreen:PSPolicyTermInfo_ExtLV:0:higpolicy"));
			hm.put("chkPolicyAvbleinTgtAcc1", By.id("AccountFile_Summary:AccountFile_SummaryScreen:PSPolicyTermInfo_ExtLV:1:higpolicy"));
			hm.put("elePolicyAvbleinTgtAcc", By.id("AccountFile_Summary:AccountFile_SummaryScreen:PSPolicyTermInfo_ExtLV:0:higpolicy"));
			hm.put("elePolicyAvbleinTgtAcc1", By.id("AccountFile_Summary:AccountFile_SummaryScreen:PSPolicyTermInfo_ExtLV:1:higpolicy"));
			hm.put("elePolicyMoveCancel", By.id("AccountFile_MovePoliciesSelection:ToolbarButton-btnInnerEl"));
			hm.put("txtCancelConfirmScreen", By.id("AccountFile_AccountSearch:OtherAccountSearchScreen:ttlBar"));
			hm.put("eleCancelConfirmScreen", By.id("AccountFile_AccountSearch:OtherAccountSearchScreen:ttlBar"));
			hm.put("elePopUpCancel", By.id("button-1008-btnInnerEl"));
			hm.put("txtPopUpWindowMsg", By.id("messagebox-1001-displayfield-inputEl"));
			hm.put("elePopUpWindowMsg", By.id("messagebox-1001-displayfield-inputEl"));
			
			//Account Contacts
			hm.put("eleAccountContactScreen", By.xpath(".//span[(text()='Contacts') and contains(@class,'tree')]"));
			
			
			hm.put("eleAccountDetailTab", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDetailCardTab-btnInnerEl"));
			hm.put("eleRoleTab", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:RolesCardTab-btnInnerEl"));
			hm.put("txtAccNameinContactDetail", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("txtAddressinContactDetail", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl"));
			hm.put("txtMailinginContactDetail", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:AddressType-inputEl"));
			hm.put("txtEmailinContactDetail", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:EmailAddress1-inputEl"));
			hm.put("txtFEINinContactDetail", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl"));
			hm.put("eleAccNameinContactDetail", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("eleAddressinContactDetail", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl"));
			hm.put("eleMailinginContactDetail", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:AddressType-inputEl"));
			hm.put("eleEmailinContactDetail", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:EmailAddress1-inputEl"));
			hm.put("eleFEINinContactDetail", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl"));
			hm.put("eleRoleTable", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:ContactRolesDV:ContactRolesLV-body"));
			hm.put("eleAdrressesTab", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesCardTab-btnInnerEl"));
			hm.put("txtAddressinAddressTab", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl"));
			hm.put("txtAddressTypeinAddressTab", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressType-inputEl"));
			hm.put("eleAddressinAddressTab", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl"));
			hm.put("eleAddressTypeinAddressTab", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressType-inputEl"));
			hm.put("eleCreateNewAccountforCompany", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton-btnWrap"));
			hm.put("eleBillingContactforCompany", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:5:roleType-arrowEl"));
			hm.put("eleBillingContactforCompany1", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:5:roleType:0:contactType-textEl"));
			hm.put("edtBillingContactName", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("eleChangeStatus", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:changeActiveStatus-btnInnerEl"));
			hm.put("eleRemoveContact", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:removeContact-btnInnerEl"));
			hm.put("edtContactName", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
//			hm.put("eleAccountFileContactUpdate", By.id("EditAccountContactPopup:ContactDetailScreen:updateButton_Ext-btnInnerEl"));
			hm.put("eleAccountFileContactRoleTab", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:RolesCardTab-btnIconEl"));
			hm.put("eleAddRole", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactRolesDV:ContactRolesLV_tb:AddRoleButton-btnWrap"));
			hm.put("eleAddRoleBC", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactRolesDV:ContactRolesLV_tb:AddRoleButton:5:RoleType-textEl"));
			hm.put("eleAccountFileRoleTable", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactRolesDV:ContactRolesLV-body"));
			hm.put("eleRemoveRole", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactRolesDV:ContactRolesLV_tb:Remove-btnInnerEl"));
			hm.put("eleAddressTab", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesCardTab-btnInnerEl"));
			hm.put("eleAddAddress", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesPanelSet:AddressesLV_tb:Add-btnInnerEl"));
//			hm.put("edtAddAddress1", By.id("AddressStandardization_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
//			hm.put("eleAddZipCode", By.id("AddressStandardization_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
//			hm.put("lstAddZipCode", By.id("AddressStandardization_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("edtAddAddress1", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
			hm.put("eleAddZipCode", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("lstAddZipCode", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("eleAddStandardize", By.id("EditAccountContactPopup:ContactDetailScreen:standardizeButton_Ext-btnInnerEl"));
			hm.put("eleAccountFileContactUpdate", By.cssSelector("a[id='EditAccountContactPopup:ContactDetailScreen:updateButton_Ext'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("eleAddOK", By.id("AddressStandardization_ExtPopup:updateButton_Ext-btnInnerEl"));
			hm.put("eleAddressesTable", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet:AddressesLV-body"));
			hm.put("txtAddresses", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl"));
			hm.put("txtMailing", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressType-inputEl"));
			hm.put("eleAddresses", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl"));
			hm.put("eleMailing", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressType-inputEl"));
			hm.put("eleAssociatedPoliceis", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:PoliciesCardTab-btnInnerEl"));
			hm.put("eleListofPolciesTable", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountFile_Contacts_PoliciesLV-body"));
			hm.put("eleAccountSummaryPage", By.id("PolicyFile_Summary:Policy_SummaryScreen:0"));
			hm.put("eleNewAddressTable", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesPanelSet:AddressesLV-body"));
			hm.put("bliAddRole", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactRolesDV:ContactRolesLV_tb:AddRoleButton-btnWrap"));
            hm.put("eleDBATab", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:DBACardTab-btnInnerEl"));
            hm.put("bliAddDBA", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactDBALV_tb:addContactButton-btnWrap"));
            hm.put("lstCompanyType", By.id("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:companyType_Ext-inputEl"));
            hm.put("edtCompanyDBAName", By.name("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name"));
            hm.put("eleDBAOK", By.id("NewDBAContactPopup:ContactDetailScreen:Update-btnInnerEl"));
            hm.put("eleContactDBATab", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:DBACardTab-btnInnerEl"));
            hm.put("eleContacts_DBATable", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:ContactDBALV-body"));
            hm.put("elePaymentPlans",By.id("AccountAddPaymentPlanPopup:PaymentPlansLV-body"));
           
			//Manage Activity
//			hm.put("eleNewActivity", By.id("AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity-textEl"));
			hm.put("eleNewShellActivity", By.xpath(".//*[contains(@id,'Create:ActivityID-textEl')]"));
			hm.put("eleNewActivity", By.xpath(".//*[contains(@id,'MenuActions_NewActivity-textEl')]"));
			hm.put("eleReminder", By.xpath("//*[contains(@id,'NewActivityMenuItemSet')]//span[contains(text(), 'Reminder')]"));
			hm.put("eleFollowUp", By.xpath("//*[contains(@id,'NewActivityMenuItemSet')]//span[contains(text(), 'Follow up')]"));
			hm.put("eleRemainder", By.xpath("//*[contains(@id,'ActivityDetailWorksheet:ActivityDetailScreen:CloseAndCreateToolBarButton:CloseAndCreate_ExtMenuItemSet:')]//span[contains(text(), 'Reminder')]"));
			hm.put("eleRemainderFollowUp", By.xpath("//*[contains(@id,'ActivityDetailWorksheet:ActivityDetailScreen:CloseAndCreateToolBarButton:CloseAndCreate_ExtMenuItemSet:')]//span[contains(text(), 'Follow up')]"));
			hm.put("eleActivityOK", By.xpath("//*[contains(@id,'UpdateButton-btnInnerEl')]"));
			hm.put("lstTopicAM", By.xpath("//*[contains(@id,'Topic-inputEl')]"));
			hm.put("edtTextAM", By.xpath("//*[contains(@id,'Text-inputEl')]"));
			hm.put("eleActivityTable", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_ActivitiesLV-body"));
			hm.put("eleActivityFollowUpList", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_ActivitiesLV:0:Subject"));
			hm.put("eleCloseActivity", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailToolbarButtonSet:ActivityDetailToolbarButtons_SkipButton-btnInnerEl"));
			hm.put("lstCurrentActivitiesAllOpen", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_ActivitiesLV:activitiesFilter-inputEl"));
			hm.put("txtViewNoteWarningMsg", By.id("NewActivityWorksheet:NewActivityScreen:_msgs"));
			hm.put("eleViewNotes", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailToolbarButtons_ViewNotes-btnInnerEl"));
			hm.put("txtViewNotesMessage", By.id("x-form-el-AccountFile_Notes:NotesScreen:NotesLV:0:NoteRowSet:Body"));
			hm.put("eleViewNotesMessage", By.id("x-form-el-AccountFile_Notes:NotesScreen:NotesLV:0:NoteRowSet:Body"));
			hm.put("eleAccountFileNotesScreen", By.id("AccountFile_Notes:NotesScreen:ttlBar"));
			hm.put("clrDueDate", By.id("NewActivityWorksheet:NewActivityScreen:NewActivityDV:TargetDate-inputEl"));
			hm.put("clrEscalationDate", By.id("NewActivityWorksheet:NewActivityScreen:NewActivityDV:EscalationDate-inputEl"));
			hm.put("eleActivityCancel", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailToolbarButtonSet:Cancel-btnInnerEl"));
			hm.put("txtActivityStatus", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:Status-inputEl"));
//			hm.put("eleActivityStatus", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:Status-inputEl"));
			hm.put("eleActivityStatus", By.xpath(".//*[contains(@id, 'Status-inputEl')]"));
			hm.put("eleActivityClosed0", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_ActivitiesLV:0:Subject"));	
			hm.put("eleActivityClosed3", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_ActivitiesLV:3:Subject"));	
			hm.put("eleActivityCompleted4", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_ActivitiesLV:4:Subject"));
			hm.put("eleCompleteAcitivity", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailToolbarButtonSet:ActivityDetailToolbarButtons_CompleteButton-btnInnerEl"));
			hm.put("eleCloseCreateNew", By.id("ActivityDetailWorksheet:ActivityDetailScreen:CloseAndCreateToolBarButton-btnWrap"));
			hm.put("blinewRemainder", By.id("ActivityDetailWorksheet:ActivityDetailScreen:CloseAndCreateToolBarButton-btnWrap"));
//			hm.put("eleRemainderCloseandCreate", By.xpath(".//span[contains(text(), 'Reminder')]"));
//			hm.put("eleRemainderFollowUp", By.xpath(".//span[contains(text(), 'Follow up')]"));
			hm.put("eleReplaceActivityCheck", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:ActivityStatus-inputEl"));
			hm.put("txtStatusCheck", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:ActivityStatus-inputEl"));
			hm.put("eleSearchLookUpMA", By.id("NewActivityWorksheet:NewActivityScreen:NewActivityDV:SelectFromList:AssigneePicker"));
			hm.put("lstMAQueue", By.id("PCAssigneePickerPopup:AssigneePickerScreen:AssignmentSearchDV:AssignmentSearchInputSet:SearchFor-inputEl"));
			hm.put("lsjMAQueue", By.id("PCAssigneePickerPopup:AssigneePickerScreen:AssignmentSearchDV:AssignmentSearchInputSet:SearchFor-inputEl"));
			hm.put("edtMAQueue", By.id("PCAssigneePickerPopup:AssigneePickerScreen:AssignmentSearchDV:AssignmentSearchInputSet:QueueName-inputEl"));
			hm.put("eleMAAssignQueue", By.id("PCAssigneePickerPopup:AssigneePickerScreen:PCAssignmentQueueLV:0:_Select"));
			hm.put("eleMASearch", By.id("PCAssigneePickerPopup:AssigneePickerScreen:AssignmentSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("edtMAUserName", By.id("PCAssigneePickerPopup:AssigneePickerScreen:AssignmentSearchDV:AssignmentSearchInputSet:Username-inputEl"));
			hm.put("eleMAUNAssign", By.id("PCAssigneePickerPopup:AssigneePickerScreen:PCAssignmentUserLV:0:_Select"));
			hm.put("eleMAPoleleActions", By.id("PolicyFile:PolicyFileMenuActions-btnIconEl"));
//			hm.put("eleMAPolNewActivity", By.id("PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_Create:PolicyFileMenuActions_NewActivity-textEl"));
			hm.put("eleMAPolNewActivity", By.xpath(".//*[contains(@id,'NewActivity-textEl')]"));
			hm.put("eleMAPolReminder", By.xpath(".//span[contains(text(), 'Reminder')]"));
			hm.put("eleMAPolFollowUp", By.xpath(".//span[contains(text(), 'Follow up')]"));
			hm.put("elePartnerException", By.id("NewActivityWorksheet:NewActivityScreen:NewActivityDV:PartnerException-inputEl"));
			hm.put("lstPartnerExceptionResason", By.id("NewActivityWorksheet:NewActivityScreen:NewActivityDV:ExceptionReason-inputEl"));
			hm.put("eleMAReset", By.id("PCAssigneePickerPopup:AssigneePickerScreen:AssignmentSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));
			hm.put("eleRemainderXSellFollowUp", By.xpath(".//*[contains(text(),'X-Sell')]"));
			hm.put("lstActivity_Status", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_ActivitiesLV:activitiesFilter-inputEl"));
			hm.put("eleActivityDesc", By.name("NewActivityWorksheet:NewActivityScreen:NewActivityDV:Description2-inputEl"));
//			hm.put("eleNewActivity", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID-itemEl"));
//          hm.put("eleReminder", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:7:NewActivityMenuItemSet_Category"));
            hm.put("eleFollowUp", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:7:NewActivityMenuItemSet_Category:0:item "));
            hm.put("eleRequest", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:8:NewActivityMenuItemSet_Category"));
            hm.put("eleNbPrep", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:8:NewActivityMenuItemSet_Category:14:item"));
            hm.put("eleOther", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:0:item"));
            hm.put("eleActivityAssign", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailToolbarButtonSet:ActivityDetailToolbarButtons_AssignButton"));
            hm.put("eleAssignbutton", By.id("AssignActivitiesPopup:AssignmentPopupScreen:AssignmentPopupDV:AssignmentByGroupPopupScreen_ButtonButton"));
            hm.put("eleActivityEdit", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailToolbarButtonSet:Edit"));
            hm.put("eleAMP", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category"));
            hm.put("eleAMPToDo", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:28:item"));
            hm.put("eleAMPEvaluate", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:10:item"));
            hm.put("eleSummary", By.xpath(".//*[@id='HIGPolicyFile:MenuLinks:HIGPolicyFile_HIGPolicyFile_Summary']/div/span"));
            hm.put("eljSummary", By.xpath(".//*[@id='HIGPolicyFile:MenuLinks:HIGPolicyFile_HIGPolicyFile_Summary']/div/span"));
            hm.put("eleComplete", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailToolbarButtonSet:ActivityDetailToolbarButtons_CompleteButton-btnInnerEl"));
            hm.put("eleAMPPreRenewalDirection", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:24:item"));
            //manage activity rathish going to be changed
            hm.put("eleAMPTABSFollowUp", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:27:item"));
            hm.put("eleAMPRequestACORD", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:21:item"));
            hm.put("eleAMPRequestRenewalInfo", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:23:item"));
            hm.put("eleAMPSecondRequest", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:26:item"));
            hm.put("eleAMPCertificateOfInsurance", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:7:item"));
            hm.put("eleAMPReferral", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:18:item"));
            hm.put("eleAMPAcknowledgeRenewal", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:1:item"));
            hm.put("eleAMPBrokerQuote", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category:5:item"));
//          hm.put("eleAMP", By.xpath("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID:NewActivityMenuItemSet:1:NewActivityMenuItemSet_Category")); 
            hm.put("lstRelatedTo", By.id("NewActivityWorksheet:NewActivityScreen:ActivityDetailNoteDV:RelatedTo-inputEl")); 
            hm.put("eleRelatedTo", By.id("NewActivityWorksheet:NewActivityScreen:ActivityDetailNoteDV:RelatedTo-inputEl"));
            hm.put("edtActivityText", By.id("NewActivityWorksheet:NewActivityScreen:ActivityDetailNoteDV:Text-inputEl"));
            hm.put("eleMyQueues", By.id("Desktop:MenuLinks:Desktop_DesktopAssignableQueues"));
            hm.put("eleMyGroups", By.id("Desktop:MenuLinks:Desktop_DesktopAssignableGroups_Ext"));
            hm.put("eleMyActivities", By.id("Desktop:MenuLinks:Desktop_DesktopActivities"));
            hm.put("eleCallOutChcbx", By.id("NewActivityWorksheet:NewActivityScreen:NewActivityDV:CallOut-inputEl"));
            hm.put("eleCallOutLbl", By.id("NewActivityWorksheet:NewActivityScreen:NewActivityDV:CallOut-inputEl"));
            hm.put("edtEscalationDate", By.id("NewActivityWorksheet:NewActivityScreen:NewActivityDV:EscalationDate-inputEl"));
            hm.put("eleActivityTblBody", By.id("PCAssigneePickerPopup:AssigneePickerScreen:PCAssignmentUserLV-body")); 
            hm.put("eleAssignPicker", By.id("NewActivityWorksheet:NewActivityScreen:NewActivityDV:SelectFromList:AssigneePicker"));
            hm.put("lstSearchFor", By.id("PCAssigneePickerPopup:AssigneePickerScreen:AssignmentSearchDV:AssignmentSearchInputSet:SearchFor-inputEl"));
            hm.put("eleAssignSearch", By.id("PCAssigneePickerPopup:AssigneePickerScreen:AssignmentSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
            hm.put("eleAssignReset", By.id("PCAssigneePickerPopup:AssigneePickerScreen:AssignmentSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));
            hm.put("eleAssignBtn", By.xpath(".//a[contains(text(), 'AssigneePickerScreen')]"));
            hm.put("edtAssignFirstName", By.id("PCAssigneePickerPopup:AssigneePickerScreen:AssignmentSearchDV:AssignmentSearchInputSet:PLNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
            hm.put("eleAssignNewActivity", By.id("AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewActivity-itemEl"));
            hm.put("eleReturnActivity", By.id("PCAssigneePickerPopup:__crumb__"));
            hm.put("eleActivityAssert", By.id("NewActivityWorksheet:NewActivityScreen:ttlBar"));
            hm.put("eleMyActivitiesTbl", By.id("DesktopActivities:DesktopActivitiesScreen:DesktopActivitiesLV-body"));
            hm.put("eleMyActivitiesAssign", By.id("DesktopActivities:DesktopActivitiesScreen:DesktopActivitiesLV_tb:DesktopActivities_AssignButton-btnInnerEl"));
            hm.put("eleMyActivitiesDesktop", By.id("TabBar:DesktopTab-btnInnerEl"));
            hm.put("eleQueueAssignSelectedToMe", By.id("DesktopAssignableQueues:DesktopAssignableQueuesScreen:AssignSelectedButton-btnInnerEl"));
            hm.put("eleAssignTo", By.id("NewActivityWorksheet:NewActivityScreen:NewActivityDV:SelectFromList-inputEl"));
            hm.put("eleAccountSummary", By.id("AccountFile:MenuLinks:AccountFile_AccountFile_Summary"));
            hm.put("eleMyQueuesTbl", By.id("DesktopAssignableQueues:DesktopAssignableQueuesScreen:DesktopAssignableQueuesLV-body"));
            hm.put("eleMyGroupsTbl", By.id("DesktopAssignableGroups_Ext:activitiesLV:DesktopAssignableGroups_ExtLV-body"));
            hm.put("eleGroupAssignSelectedToMe", By.id("DesktopAssignableGroups_Ext:AssignSelectedButton-btnInnerEl"));
            hm.put("elePartnerExceptionChckBox", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:PartnerException-inputEl"));
//          hm.put("eleExceptionReason", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:ExceptionReason-inputEl"));
//          hm.put("lstExceptionReason", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:ExceptionReason-inputEl"));
            hm.put("lstAllGroupsBtn", By.id("DesktopAssignableGroups_Ext:activitiesLV:DesktopAssignableGroups_ExtLV:assignableGroupFilter-inputEl"));
            hm.put("edtAllGroupsBtn", By.id("DesktopAssignableGroups_Ext:activitiesLV:DesktopAssignableGroups_ExtLV:assignableGroupFilter-inputEl"));
            hm.put("eleMyGroupsAssert", By.id("DesktopAssignableGroups_Ext:ttlBar"));
            hm.put("lstAllOpenBtn", By.id("DesktopAssignableGroups_Ext:activitiesLV:DesktopAssignableGroups_ExtLV:activitiesFilter-inputEl"));
            hm.put("edtAllOpenBtn", By.id("DesktopAssignableGroups_Ext:activitiesLV:DesktopAssignableGroups_ExtLV:activitiesFilter-inputEl"));
            hm.put("elePriority", By.id("NewActivityWorksheet:NewActivityScreen:NewActivityDV:Priority-inputEl"));
            hm.put("eleSecurityLevel", By.id("NewActivityWorksheet:NewActivityScreen:ActivityDetailNoteDV:SecurityLevel-inputEl"));
            hm.put("elePartnerExceptionResason", By.id("NewActivityWorksheet:NewActivityScreen:NewActivityDV:ExceptionReason-inputEl"));
            hm.put("eleBulkAssignment",  By.xpath(".//a[contains(text(), 'BulkAssignment')]"));
            hm.put("lstAssignTo", By.id("NewActivityWorksheet:NewActivityScreen:NewActivityDV:SelectFromList-inputEl")); 
            hm.put("eleEscalationDate", By.id("NewActivityWorksheet:NewActivityScreen:NewActivityDV:EscalationDate-inputEl")); 
            hm.put("eleshellpolicyActivity", By.id("HIGPolicyFile_Summary:0:Subject"));
            hm.put("eleGrp_InQueue", By.xpath("//div[@id='Team:TeamMenuTree:TeamTreeView-body']//span[contains(@class,'x-tree-node-text') and text()='In Queue']"));
            hm.put("eleActivitySubjectVal",By.xpath("//*[contains(@id,'NewActivityDV:Subject-inputEl')]"));
            hm.put("eleActivityDescVal",By.xpath("//*[contains(@id,'NewActivityDV:Description2-inputEl')]"));
            hm.put("eleCancelNewActivity", By.id("NewActivityWorksheet:NewActivityScreen:NewActivityScreen_CancelButton-btnInnerEl"));
            hm.put("edtMAGroupName", By.id("PCAssigneePickerPopup:AssigneePickerScreen:AssignmentSearchDV:AssignmentSearchInputSet:GroupName-inputEl"));
            
            //Account Notes Search
			hm.put("eleAccNotes", By.id("AccountFile:MenuLinks:AccountFile_AccountFile_Notes"));
			hm.put("edtAccNoteSearchText", By.id("AccountFile_Notes:NotesScreen:NoteSearchDV:TextSearch-inputEl"));
			hm.put("eleAccountNotesSearch", By.id("AccountFile_Notes:NotesScreen:NoteSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("funAccountNotesVerify", By.id("x-form-el-AccountFile_Notes:NotesScreen:NotesLV:0:NoteRowSet:Subject"));								   
			hm.put("edtAccNoteSearchAuthor", By.id("AccountFile_Notes:NotesScreen:NoteSearchDV:Author-inputEl"));
			hm.put("lstAccNoteSearchTopic", By.id("AccountFile_Notes:NotesScreen:NoteSearchDV:Topic-inputEl"));
			hm.put("edtAccNoteSearchDateFrom", By.id("AccountFile_Notes:NotesScreen:NoteSearchDV:DateFrom-inputEl"));
			hm.put("edtAccNoteSearchDateTo", By.id("AccountFile_Notes:NotesScreen:NoteSearchDV:DateTo-inputEl"));
			hm.put("lstAccNoteSearchRelatedTo", By.id("AccountFile_Notes:NotesScreen:NoteSearchDV:RelatedTo-inputEl"));
			hm.put("eleAccountNoteReset", By.id("AccountFile_Notes:NotesScreen:NoteSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));
			hm.put("eleAccNoteAscOrder", By.id("AccountFile_Notes:NotesScreen:NoteSearchDV:sortAscending_true-inputEl"));
			hm.put("eleDecNoteAscOrder", By.id("AccountFile_Notes:NotesScreen:NoteSearchDV:sortAscending_false-inputEl"));
			
			//Account Search Screen
			hm.put("eleAccountFileNotes", By.id("AccountFile_Notes:NotesScreen:ttlBar"));
						
			// Create Account Notes
			hm.put("eleAccountAction", By.id("AccountFile:AccountFileMenuActions-btnInnerEl"));
			hm.put("eleNewNote", By.id("AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewNote-textEl"));
			hm.put("lstTopic", By.id("NewAccountNoteWorksheet:NewNoteScreen:NewNoteDV:Topic-inputEl"));
			hm.put("edtSubjectText", By.id("NewAccountNoteWorksheet:NewNoteScreen:NewNoteDV:Subject-inputEl"));
			hm.put("edtText", By.id("NewAccountNoteWorksheet:NewNoteScreen:NewNoteDV:Text-inputEl"));
			hm.put("sclAccCreateUpdate", By.id("NewAccountNoteWorksheet:NewNoteScreen:NewNoteScreen_UpdateButton-btnInnerEl"));
			hm.put("eleAccCreateUpdate", By.id("NewAccountNoteWorksheet:NewNoteScreen:NewNoteScreen_UpdateButton-btnInnerEl"));
			
			//Delete Account Note
			hm.put("eleDelete", By.id("AccountFile_Notes:NotesScreen:NotesLV:0:NoteRowSet:NotesLV_DeleteLink"));
			hm.put("eleDeleteAccountNoteOK", By.id("button-1005-btnInnerEl"));

			//Edit Account Notes
			hm.put("eleAccountNoteEdit", By.id("AccountFile_Notes:NotesScreen:NotesLV:0:NoteRowSet:NotesLV_EditLink"));
			hm.put("edtEditAccNoteSubject", By.id("EditNotePopup:EditNoteScreen:EditNoteDV:Subject-inputEl"));
			hm.put("edtEditAccNoteText", By.id("EditNotePopup:EditNoteScreen:EditNoteDV:Text-inputEl"));
			hm.put("eleUpdateAccEditNote", By.id("EditNotePopup:EditNoteScreen:Update-btnInnerEl"));
			hm.put("edtSearchText", By.id(""));

			//Policy Search
			hm.put("elePolicyTransactions", By.id("AccountFile:MenuLinks:AccountFile_AccountFile_WorkOrders"));
			hm.put("eleSelectPolicy", By.id("AccountFile_WorkOrders:AccountFile_WorkOrdersScreen:AccountWorkOrdersLV:0:PolicyNumber"));
			
			//Policy Summary
			//hm.put("elepolicySummary_Activitytbl", By.id("HIGPolicyFile_Summary:26-body"));

			//Search Policy Notes
			hm.put("elePolicyNotes", By.id("PolicyFile:MenuLinks:PolicyFile_PolicyFile_Notes"));
			hm.put("edtPolicySearchText", By.id("PolicyFile_Notes:Policy_NotesScreen:NoteSearchDV:TextSearch-inputEl"));
			hm.put("elePolicyNotesSearch", By.id("PolicyFile_Notes:Policy_NotesScreen:NoteSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("funPolicyNotesVerify1", By.id("x-form-el-PolicyFile_Notes:Policy_NotesScreen:NotesLV:0:NoteRowSet:Body"));
			hm.put("elePolicyNotePage", By.id("PolicyFile_Notes:Policy_NotesScreen:ttlBar"));
		
			// Create Policy Notes
			hm.put("elePolicyAction", By.id("PolicyFile:PolicyFileMenuActions-btnInnerEl"));
			hm.put("elePolicyNewNote", By.id("PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_Create:PolicyFileMenuActions_NewNote-textEl"));
			hm.put("lstPolicyNotesTopic", By.id("NewNoteWorksheet:NewNoteScreen:NewNoteDV:Topic-inputEl"));
			hm.put("edtPolicyNotesSubjectText", By.id("NewNoteWorksheet:NewNoteScreen:NewNoteDV:Subject-inputEl"));
			hm.put("lstPolicyNotesRelatedTo", By.id("NewNoteWorksheet:NewNoteScreen:NewNoteDV:RelatedTo-inputEl"));
			hm.put("edtPolicyNotesText", By.id("NewNoteWorksheet:NewNoteScreen:NewNoteDV:Text-inputEl"));
			hm.put("elePolicyNotesCreateUpdate", By.id("NewNoteWorksheet:NewNoteScreen:NewNoteScreen_UpdateButton-btnInnerEl"));
			hm.put("sclPolicyNotesCreateUpdate", By.id("NewNoteWorksheet:NewNoteScreen:NewNoteScreen_UpdateButton-btnInnerEl"));
				
			//Policy Note Delete
			hm.put("elePolicyNoteDelete", By.id("PolicyFile_Notes:Policy_NotesScreen:NotesLV:0:NoteRowSet:NotesLV_DeleteLink"));
			hm.put("eleDeletePolicyNoteOK", By.id("button-1005-btnWrap"));
			
			// Policy Note Edit
			hm.put("elePolNoteEdit", By.id("PolicyFile_Notes:Policy_NotesScreen:NotesLV:0:NoteRowSet:NotesLV_EditLink"));
			hm.put("edtPolNoteUpdateSubject", By.id("EditNotePopup:EditNoteScreen:EditNoteDV:Subject-inputEl"));
			hm.put("edtPolNoteUpdateText", By.id("EditNotePopup:EditNoteScreen:EditNoteDV:Text-inputEl"));
			hm.put("elePolNoteUpdateNote", By.id("EditNotePopup:EditNoteScreen:Update-btnInnerEl"));
			
			//Activity Pattern
			hm.put("eleBusinessSettings", By.id("TabBar:AdminTab:Admin_BusinessSettings-textEl"));
			hm.put("eleActivityPatterns", By.id("TabBar:AdminTab:Admin_BusinessSettings:BusinessSettings_ActivityPatterns-textEl"));
			hm.put("eleNewActivityPattern", By.id("ActivityPatterns:ActivityPatternsScreen:ActivityPatterns_NewActivityPatternButton-btnInnerEl"));
			hm.put("edtSubject", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:Subject-inputEl"));
			hm.put("edtCode", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:Code-inputEl"));
			hm.put("lstPatternLevel", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:PatternLevel-inputEl"));
			hm.put("eleBSAdd", By.id("NewActivityPattern:ActivityPatternDetailScreen:skillAndTrackLV_tb:Add-btnInnerEl"));
			hm.put("eleBSTable", By.id("NewActivityPattern:ActivityPatternDetailScreen:skillAndTrackLV-body"));
			hm.put("lstBusinessSegement", By.name("businessSegment_Ext"));
			hm.put("lstSkill", By.name("skill_Ext"));
			hm.put("lstTrack", By.name("track_Ext"));
			hm.put("eleUpdateAP", By.id("NewActivityPattern:ActivityPatternDetailScreen:Update-btnInnerEl"));
			hm.put("eleCancelAP", By.id("NewActivityPattern:ActivityPatternDetailScreen:Cancel-btnInnerEl"));
			hm.put("eleLastPageArrow", By.xpath(".//*[@id='ActivityPatterns:ActivityPatternsScreen:ActivityPatternsLV']/div[1]/div/div/a[6]"));
			hm.put("eljLastPageArrow", By.xpath(".//*[@id='ActivityPatterns:ActivityPatternsScreen:ActivityPatternsLV']/div[1]/div/div/a[6]"));
			hm.put("eleNextPageArrow", By.xpath("//span[contains(@class,'x-btn-icon-el x-tbar-page-next')]"));
			hm.put("elePreviousLastArrow", By.xpath("//span[contains(@class,'x-btn-icon-el x-tbar-page-first')]"));
			hm.put("eleNewActivityPatternListTable", By.xpath(".//*[@id='ActivityPatterns:ActivityPatternsScreen:ActivityPatternsLV-body']/div/table/tbody"));
//			hm.put("eleActivityPatternTable", By.id("ActivityPatterns:ActivityPatternsScreen:ActivityPatternsLV-body"));
			hm.put("eleActivityPatternPageCount", By.xpath("//*[contains(@id,'ActivityPatterns:ActivityPatternsScreen:ActivityPatternsLV')]//div[contains(text(),'of')]"));
			hm.put("eleUpToActivityPattern", By.id("NewActivityPattern:NewActivityPattern_UpLink"));
			hm.put("eljDeleteAP", By.id("ActivityPatterns:ActivityPatternsScreen:ActivityPatterns_DeleteButton"));
			hm.put("eleDeleteAP", By.cssSelector("a[id='ActivityPatterns:ActivityPatternsScreen:ActivityPatterns_DeleteButton'][class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("eleEditAP", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:Edit-btnInnerEl"));
			hm.put("edtEditSubject", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:Subject-inputEl"));
			hm.put("eleEditUpdateAP", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:Update-btnInnerEl"));
			hm.put("eleEditUptoLink", By.id("ActivityPatternDetail:ActivityPatternDetail_UpLink"));
			hm.put("eleEditCancelAP", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:Cancel-btnInnerEl"));
			hm.put("txtSubjectMandatoryWarningMessage", By.xpath(".//*[@id='NewActivityPattern:ActivityPatternDetailScreen:_msgs']/div[1]"));
			hm.put("txtCodeMandatoryWarningMessage", By.xpath(".//*[@id='NewActivityPattern:ActivityPatternDetailScreen:_msgs']/div[2]"));
			hm.put("txtPatternLevelMandatoryWarningMessage", By.xpath(".//*[@id='NewActivityPattern:ActivityPatternDetailScreen:_msgs']/div[3]"));
			hm.put("eleRecurringYes", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:Recurring_true-inputEl"));
			hm.put("lstPriority", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:Priority-inputEl"));
			hm.put("lstCategory", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:Category-inputEl"));
			hm.put("txtRecurring", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:Recurring-inputEl"));
			hm.put("txtPriority", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:Priority-inputEl"));
			hm.put("txtCategory", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:Category-inputEl"));
			hm.put("txtType", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:Type-inputEl"));
			hm.put("txtBusinessSegment", By.xpath(".//*[@id='ActivityPatternDetail:ActivityPatternDetailScreen:skillAndTrackLV-body']/div/table/tbody/tr[1]/td[2]"));
			hm.put("txtSkillLevel", By.xpath(".//*[@id='ActivityPatternDetail:ActivityPatternDetailScreen:skillAndTrackLV-body']/div/table/tbody/tr[1]/td[3]"));
			hm.put("txtTrack", By.xpath(".//*[@id='ActivityPatternDetail:ActivityPatternDetailScreen:skillAndTrackLV-body']/div/table/tbody/tr[1]/td[4]"));
			hm.put("lstBusinessGrouping", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:ApplicableSegment_Ext-inputEl"));
			hm.put("txtBusinessGrouping", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:ApplicableSegment_Ext-inputEl"));
			hm.put("eleSelectBS", By.xpath(".//*[@id='ActivityPatternDetail:ActivityPatternDetailScreen:skillAndTrackLV-body']/div/table/tbody/tr[1]/td[1]"));
			hm.put("eleRemoveBS", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:skillAndTrackLV_tb:Remove"));
			hm.put("eleBSTableExist", By.xpath(".//*[@id='ActivityPatternDetail:ActivityPatternDetailScreen:skillAndTrackLV-body']/div/table/tbody/tr[1]"));
			hm.put("edtAP_Description", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:Description-inputEl"));
            hm.put("edtAP_EscalationDays", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:EscalationDays-inputEl"));
            hm.put("edtAP_TargetDays", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:TargetDays-inputEl"));
            hm.put("lstAP_escalationStartpt", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:EscalationStartPt-inputEl"));
            hm.put("lstAP_TargetStartpt", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:TargetStartPoint-inputEl"));
            hm.put("lstAP_EsacalationIncDays", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:EscalationInclDays-inputEl"));
            hm.put("lstAP_TargetIncDays", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:TargetIncludeDays-inputEl"));
            hm.put("edtAP_EscalationHours", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:EscalationHours-inputEl"));
            hm.put("edtAP_TargetHours", By.id("NewActivityPattern:ActivityPatternDetailScreen:ActivityPatternDetailDV:TargetHours-inputEl"));

			
			//Account Summary
			hm.put("elePolicyNumberTrasanction", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_WorkOrdersLV:0:PolicyNumber"));
			
			// ODS 
			//Account Summary
            hm.put("eleAccountNumber", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-bodyEl"));
            hm.put("bliCLAPayBindOption", By.id("HIGPolicyFile_Payment_Ext:BindOptions-btnInnerEl"));
            hm.put("lstPayment_BillingMethod", By.id("HIGPolicyFile_Payment_Ext:psBillingAdjustment:PSBillingAdjustment_ExtDV:psBillingMethod-inputEl"));
            hm.put("lstPayment_BillingNumber", By.id("HIGPolicyFile_Payment_Ext:psBillingAdjustment:PSBillingAdjustment_ExtDV:PSBillingnumber-inputEl"));

            //Affinity Group
            hm.put("eleAdministration", By.id("TabBar:AdminTab-btnInnerEl"));
            hm.put("eleAuthorityActions", By.id("Admin:AdminMenuActions-btnInnerEl"));
            hm.put("eleNewAffinityGroup", By.id("Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuActions_NewAffinityGroup-textEl"));
            hm.put("eleAffinityGroup_Edit", By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:Edit-btnInnerEl"));
            hm.put("edtCommertialProgramName", By.xpath("//*[contains(@id,'GlobalContactNameInputSet:Name-inputEl')]"));          
            hm.put("edtAffGroupName", By.xpath("//*[contains(@id,'AffinityGroupDetailDV:Description-inputEl')]"));            
            hm.put("edtAthorityCPID", By.xpath("//*[contains(@id,'AffinityGroupDetailDV:CPID_Ext-inputEl')]"));           
            hm.put("lstAthoritySegment", By.xpath("//*[contains(@id,'BusinessSegment_Ext-inputEl')]"));
            hm.put("lstAthorityType", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:Type-inputEl"));
            hm.put("eleAthorityOrganizationlink", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:Organization:SelectOrganization"));
            hm.put("edtAthorityOrganizationName", By.id("OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:GlobalContactNameInputSet:Name-inputEl"));
            hm.put("eleAuthoritySearch", By.id("OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
            hm.put("eleAuthoritySelect", By.id("OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchResultsLV:0:_Select"));
            hm.put("eleAuthorityUpdate", By.xpath("//*[contains(@id,'Update-btnInnerEl')]"));           
            hm.put("edtPCFirstName", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:GlobalPersonNameInputSet:FirstName-inputEl"));
            hm.put("edtPCPrefFirstName", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:GlobalPersonNameInputSet:PreferredFirstName-inputEl"));
            hm.put("edtPCLastName", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:GlobalPersonNameInputSet:LastName-inputEl"));
            hm.put("edtPCPhoneNumber", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:PrimaryConPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl"));
            hm.put("edtPCEmail", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:PrimaryEmail-inputEl"));
            hm.put("edtICFirstName", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:FirstName-inputEl"));
            hm.put("edtICLastName", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:LastName-inputEl"));
            hm.put("edtICPhoneNumber", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:InternalConPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl"));
            hm.put("edtICEmail", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:Email-inputEl"));
            hm.put("edtAffinityGrpStartDt", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:StartDate-inputEl"));
            hm.put("edtAffinityGrpEndDt", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:EndDate-inputEl"));           
            hm.put("eleJurisdictions", By.xpath("//*[contains(@id,'AffinityGroupDetail_JurisdictionsTab-btnInnerEl')]"));
            hm.put("eleAffinityJurAdd", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupJurisdictionsLV_tb:Add-btnInnerEl"));           
            hm.put("eleAffinityProducts", By.xpath("//*[contains(@id,'AffinityGroupDetail_ProductsCardTab-btnInnerEl')]"));           
            hm.put("bliAffinityProductAdd", By.xpath("//*[contains(@id,'AffinityGroupProductsLV_tb:AddProduct-btnInnerEl')]"));           
            hm.put("eleAffinityProductvalue", By.xpath("//*[contains(@id,'AffinityGroupProductsLV_tb:AddProduct-btnInnerEl')]"));
            hm.put("sclAffinityProductvalue", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupProductsLV_tb:AddProduct:30:Product-textEl"));           
            hm.put("eleAffinityProducerCode", By.xpath("//*[contains(@id,'ProducerCodeCardTab-btnInnerEl')]"));           
            hm.put("eleAffinityProducerCodeAdd", By.xpath("//*[contains(@id,'ProducerCodesAffinityGroupLV_tb:Add-btnInnerEl')]"));            
            hm.put("edtAffinityOrganizationName", By.xpath("//*[contains(@id,'ProducerCodeSearchDV:Description-inputEl')]"));           
            hm.put("eleAffinityOrgResSearch", By.xpath("//*[contains(@id,'SearchAndResetInputSet:SearchLinksInputSet:Search')]"));           
            hm.put("eleAffinityOrgSearchResults", By.xpath("//*[contains(@id,'AdminProducerCodeSearchLV:0:_Select')]"));           
            hm.put("eleAffinityJuristictiontable", By.xpath("//*[contains(@id,'AffinityGroupDetailScreen:AffinityGroupJurisdictionsLV-body')]"));
            hm.put("eleAffinityProducerCodeRemove", By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:ProducerCodesAffinityGroupLV_tb:Remove-btnInnerEl"));
            hm.put("eleAffinityJurisdictionVal", By.name("Jurisdiction"));
            hm.put("eleAffinityProductsRemove", By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupProductsLV_tb:Remove-btnInnerEl"));           
            hm.put("eleAffinityproducerCodetbl", By.xpath("//*[contains(@id,'ProducerCodesAffinityGroupLV-body')]"));
            hm.put("eleAffinityproducerCodeVal", By.name("EffDate"));
            hm.put("eleAffinityprodExpDt", By.name("ExpDate"));
            hm.put("sclAffinityGroupSearchTab", By.id("Admin:MenuLinks:Admin_UsersAndSecurity:UsersAndSecurity_SearchAffinityGroup"));
            hm.put("eleAffinityGroupSearchTab", By.id("Admin:MenuLinks:Admin_UsersAndSecurity:UsersAndSecurity_SearchAffinityGroup"));
            hm.put("edtAffinityGrp_CommPgmName", By.id("SearchAffinityGroup:AffinityGroupSearchScreen:AffinityGroupSearchDV:GlobalContactNameInputSet:Name-inputEl"));
            hm.put("eleAffinityGrp_Search", By.id("SearchAffinityGroup:AffinityGroupSearchScreen:AffinityGroupSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
            hm.put("eleAffinityGrp_clkSearchResult", By.id("SearchAffinityGroup:AffinityGroupSearchScreen:AffinityGroupSearchResultsLV:0:Name"));
            hm.put("eleAffinityGroup_Basics", By.xpath("//*[contains(@id,'BasicCardTab-btnInnerEl')]"));
            
            //Affinity Group Retrieve Data
            hm.put("eleAffinityGroup_AffinityName", By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:Description-inputEl"));
            hm.put("eleAffinityGroup_CommPgmIden", By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:AffinityGroupNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
            hm.put("eleAffinityGroup_CPID", By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:CPID_Ext-inputEl"));
            hm.put("eleAffinityGroup_Segment",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:BusinessSegment_Ext-inputEl"));
            hm.put("eleAffinityGroup_Type",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:Type-inputEl"));
            hm.put("eleAffinityGroup_Organization",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:Organization-inputEl"));
            hm.put("eleAffinityGroup_PCFirstName",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:GlobalPersonNameInputSet:FirstName-inputEl"));
            hm.put("eleAffinityGroup_PCPrefFirstName",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:GlobalPersonNameInputSet:PreferredFirstName-bodyEl"));
            hm.put("eleAffinityGroup_PCLastName",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:GlobalPersonNameInputSet:LastName-inputEl"));
            hm.put("eleAffinityGroup_PCPhoneNumber",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:PrimaryConPhone:GlobalPhoneInputSet:PhoneDisplay-inputEl"));
            hm.put("eleAffinityGroup_PCEmail",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:PrimaryEmail-inputEl"));
            hm.put("eleAffinityGroup_ICFirstName",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:FirstName-inputEl"));
            hm.put("eleAffinityGroup_ICLastName",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:LastName_Ext-inputEl"));
            hm.put("eleAffinityGroup_ICPhoneNumber",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:InternalConPhone:GlobalPhoneInputSet:PhoneDisplay-inputEl"));
            hm.put("eleAffinityGroup_ICEmail",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:Email-inputEl"));
            hm.put("eleAffinityGroup_StartDate",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:StartDate-inputEl"));
            hm.put("eleAffinityGroup_EndDate",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:EndDate-inputEl"));
            hm.put("eleAffinityGroup_Jurisdictions",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetail_JurisdictionsTab-btnInnerEl"));           
            hm.put("eleAffinityGroup_JurisdictionSt", By.xpath("//*[contains(@id,'JurisdictionsLV-body')]"));
            hm.put("eleAffinityGroup_Products",By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetail_ProductsCardTab-btnInnerEl"));           
            hm.put("eleAffinityGroup_ProductsSt", By.xpath("//*[contains(@id,'AffinityGroupProductsLV-body')]"));           
            hm.put("eleAffinityGroup_ProducerCodes", By.xpath("//*[contains(@id,'ProducerCodeCardTab-btnInnerEl')]"));           
            hm.put("eleAffinityGroup_ProducerCodesSt", By.xpath("//*[contains(@id,'ProducerCodesAffinityGroupLV-body')]"));
            hm.put("eleCompanyNameSearch", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:companyName:SelectcompanyName"));
            hm.put("edtAffinityCompanyName", By.id("PayrollCompanySearch_ExtPopup:searchBillingCompany-inputEl"));
            hm.put("eleVerifyCompany", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:companyName-inputEl"));
            hm.put("eleVerifyAffinityGroupName", By.cssSelector("[id='AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:Description-inputEl'][readonly='readonly']"));
            hm.put("eleVerifyCommmercialProgram", By.cssSelector("[id='AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetailDV:AffinityGroupNameInputSet:GlobalContactNameInputSet:Name-inputEl'][readonly='readonly']"));
            
            //PolicySummary Retrieve Data
            hm.put("elePolicySummary_AccountNumber", By.id("PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_AccountDV:Number-inputEl"));
            hm.put("elePolicySummary_PolicyNumber", By.id("PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_PolicyDV:PolicyNumber-inputEl"));
            hm.put("eleShell_PolicyNumber", By.id("HIGPolicyFile_Summary:PolicyNumber-inputEl"));
            hm.put("eleShellPolicySummarytab", By.id("HIGPolicyFile:MenuLinks:HIGPolicyFile_HIGPolicyFile_Summary"));
            hm.put("elePolicySummary_ActivityDesc", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:Description-inputEl"));
            hm.put("elePolicySummary_ActivityStatus", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:Status-inputEl"));
            hm.put("elePolicySummary_CloseWS",By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailToolbarButtonSet:ActivityDetailToolbarButtons_CloseButton-btnInnerEl"));
            hm.put("eleShell_AccountNumber", By.id("HIGPolicyFile_Summary:Number-inputEl"));
            hm.put("eleActivity_Status", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:ActivityStatus-inputEl"));
            hm.put("eleActivity_EscalationDate", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:EscalationDate-inputEl"));
            hm.put("eleActivityDesc", By.name("NewActivityWorksheet:NewActivityScreen:NewActivityDV:Description2-inputEl"));
            hm.put("elepolicySummary_Activitytbl", By.id("HIGPolicyFile_Summary:24-body"));
            hm.put("elePolicySummary_CancelWS", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailToolbarButtonSet:Cancel-btnInnerEl"));
            
            //Account Summary Retrieve Data
            hm.put("eleAccountSummary_AccountNumber", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-inputEl"));                
            hm.put("lstAccountSummary_PolTran", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_WorkOrdersLV_tb:WorkOrdersCompletenessFilter-inputEl"));
            hm.put("eleAccountSummary_PolicyTranTbl", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_WorkOrdersLV-body"));
            hm.put("lstActivity_Status", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_ActivitiesLV:activitiesFilter-inputEl"));
            hm.put("eleAccountSummary_PolicyTermsTbl", By.id("AccountFile_Summary:AccountFile_SummaryScreen:PSPolicyTermInfo_ExtLV-body"));
            
            //Account Contacts Retrieve data
            hm.put("eleAccountSummary_Contacttbl", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV-body"));
            hm.put("eleContacts_Name", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
            hm.put("eleContacts_Address", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl"));
            hm.put("eleAccountSummary_Activitytbl", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_ActivitiesLV-body"));
            hm.put("eleAccountContactAddress", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
            hm.put("eleAccountContactCity", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
            hm.put("eleAccountContactState", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
            hm.put("eleAccountContactZip", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
            hm.put("eleCancel", By.id("EditAccountContactPopup:ContactDetailScreen:Cancel-btnInnerEl"));
            hm.put("eleAccountContactPhone", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl"));
            hm.put("eleAccountContactFax", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:FaxPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl"));
            hm.put("eleAccountContactPrimaryEmail", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:EmailAddress1-inputEl"));
            hm.put("eleAccountContactSecondaryEmail", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:EmailAddress2-inputEl"));
            hm.put("eleAccountContactCountry", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl"));
            hm.put("eleAccountContactCounty", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:County-inputEl"));
            hm.put("eleAccountContactAddress", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
            hm.put("eleAccountContactCity", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
            hm.put("eleAccountContactState", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
            hm.put("eleAccountContactZip", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
            hm.put("eleAlternatePayerAdd", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:BillingContactsInputs:AccountContactBillingInputSet:changeAltPayerContactButton_Ext:changeAltPayerContactButton_ExtMenuIcon"));
            hm.put("eleExistingAlternatePayer", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:BillingContactsInputs:AccountContactBillingInputSet:changeAltPayerContactButton_Ext:ExistingAlternatePayerContact-textEl"));
            hm.put("eleExistingAlternateNewPerson", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:BillingContactsInputs:AccountContactBillingInputSet:changeAltPayerContactButton_Ext:ExistingAlternatePayerContact:0:UnassignedAccountContactForAltPayer-textEl"));
            
            //Activity Pattern Retrieve Data
            hm.put("eleActivityPatterntbl", By.id("ActivityPatterns:ActivityPatternsScreen:ActivityPatternsLV-body"));
            hm.put("eleAP_Code",By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:Code-inputEl"));
            hm.put("eleAP_SegmentCode", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:ApplicableSegment_Ext-inputEl"));
            hm.put("eleAP_Pattern", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:PatternLevel-inputEl"));
            hm.put("eleAP_EscalationDays", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:EscalationDays-inputEl"));
            hm.put("eleAP_EscalationHours", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:EscalationHours-inputEl"));
            hm.put("eleAP_EscalationStartDate", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:EscalationStartPt-inputEl"));
            hm.put("eleAP_EscalationIncludeDays", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:EscalationInclDays-inputEl"));
            hm.put("eleAP_TargetDays", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:TargetDays-inputEl"));
            hm.put("eleAP_TargetHours", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:TargetHours-inputEl"));
            hm.put("eleAP_TargetIncludedays", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:TargetIncludeDays-inputEl"));
            hm.put("eleAP_TargetStartpoint", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:TargetStartPoint-inputEl"));
            hm.put("eleAP_BusinessSegment", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:skillAndTrackLV-body"));
            hm.put("eleAP_ActiveClass", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:ActivityClass-inputEl"));
            hm.put("eleAP_AutomatedOnly", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:AutomatedOnly-inputEl"));
            hm.put("eleAP_Mandatory", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:Mandatory-inputEl"));
            hm.put("eleAP_Type", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:Type-inputEl"));
            hm.put("eleAP_Category", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:Category-inputEl"));
            hm.put("eleAP_Priority", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:Priority-inputEl"));
            hm.put("eleAP_Recurring", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:Recurring-inputEl"));
            hm.put("eleAP_Subject", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:ActivityPatternDetailDV:Subject-inputEl"));

            //Edit Account RetrieveData
            hm.put("edtAccount_AIFNum", By.id("EditAccountPopup:EditAccountScreen:aifNumber_Ext-inputEl"));
            hm.put("edtAccount_AllianceNum", By.id("EditAccountPopup:EditAccountScreen:allianceNumber_Ext-inputEl"));
            hm.put("edtAccount_FEIN", By.id("EditAccountPopup:EditAccountScreen:OfficialIDInputSet:OfficialIDDV_Input-inputEl"));
            hm.put("edtAccount_AccountName", By.id("EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
            hm.put("edtAccount_Country", By.id("EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl"));
            hm.put("eleAccount_Country", By.id("EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl"));
            hm.put("edtAccount_Address1", By.id("EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
            hm.put("edjAccount_Address1", By.id("EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
            hm.put("eleAccount_Address1", By.id("EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
            hm.put("edtAccount_City", By.id("EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
            hm.put("eleAccount_City", By.id("EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
            hm.put("edtAccount_County", By.id("EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:County-inputEl"));
            hm.put("eleAccount_County", By.id("EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:County-inputEl"));
            hm.put("edtAccount_State", By.id("EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
            hm.put("eleAccount_State", By.id("EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
            hm.put("edtAccount_ZipCode", By.id("EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
            hm.put("eleAccount_ZipCode", By.id("EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
            hm.put("edtAccount_OrganizationType", By.id("EditAccountPopup:EditAccountScreen:OrgType-inputEl"));
            hm.put("eleAccount_AddressType", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AddressShortInputSet:AddressType-inputEl"));
            hm.put("eleAccount_ExperianKey", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:experiankey-bodyEl"));
            hm.put("eleAccountSummary_LeftPane", By.xpath(".//span[contains(text(), 'Summary')]"));
            hm.put("eleAccount_StandardizeBtn", By.id("EditAccountPopup:EditAccountScreen:standardizeButton_Ext-btnInnerEl"));
            hm.put("eleAccount_Message", By.id("EditAccountPopup:EditAccountScreen:_msgs"));
            
            //CLA PolicyInfo Retrieve Data
            hm.put("edtBORCtrlStartDate", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:BORStart-inputEl"));
            hm.put("edtBORCtrlEndDate", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:BORControlEnd-inputEl"));
            hm.put("edtAARPNumber", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:AARP-inputEl"));  
            hm.put("edtFEINCode", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:fein-inputEl"));
            hm.put("eleIndustryCodeSearchIcon", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:SICIndustryCode:SelectIndustryCode"));
            hm.put("eleInSearchButton", By.id("IndustryCodeSearchPopup:IndustryCodeSearchScreen:IndustryCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
            hm.put("eleInSelect", By.id("IndustryCodeSearchPopup:IndustryCodeSearchScreen:IndustryCodeSearchResultsLV:0:_Select"));
            hm.put("eleNAICSSearch", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:NAICSIndustryCode:SelectIndustryCode"));
            hm.put("lstAffinityGroupName", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:AffinityGroup1-inputEl"));
            hm.put("lstIndustryType", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:industryType-inputEl"));
//          hm.put("edtMSI1", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:MSIID-inputEl"));
            hm.put("edtYearBusinessStarted", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:YearBusinessStarted-inputEl"));          
            hm.put("edtNPNNumber",By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:ProducerSelectionInputSet:NPNNumber-inputEl"));
            hm.put("edtNPNFirstName",By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:ProducerSelectionInputSet:NPNFirstName-inputEl"));
            hm.put("edtNPNLastName",By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:ProducerSelectionInputSet:NPNLastName-inputEl"));
            hm.put("edtOtherPolicyNumber", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:PSAMPPoliciesOnlyInputSet:OtherPolicyNumber-inputEl"));
            hm.put("eleNonHartfordClaim",By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:PSAMPPoliciesOnlyInputSet:NonhartfordClaimsMade-inputEl"));

            //Search Tab
			hm.put("eleSearchTab",By.id("TabBar:SearchTab-btnEl"));
			hm.put("eleSearchTabPolicyItm",By.id("TabBar:SearchTab:Search_PolicySearch-itemEl"));			
			hm.put("eleSearchTabPolicy",By.id("Search:MenuLinks:Search_PolicySearch"));	
			hm.put("eleSearchTabAccount", By.id("Search:MenuLinks:Search_AccountSearch"));
			hm.put("edtSearchTabCompanyName",By.id("PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("edtSearchTabAccountNum",By.xpath(".//input[contains(@id,'AccountNumber-inputEl')]"));
			hm.put("edtMembership#", By.xpath(".//input[contains(@id, 'MembershipNumber-inputEl')]"));
			hm.put("eleSearchTabSearchBtn", By.xpath(".//a[contains(@id, 'SearchLinksInputSet:Search')]"));
			//hm.put("eleSearchTabSearchBtn",By.id("PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleSearchTabErrorMsgs",By.id("PolicySearch:PolicySearchScreen:_msgs"));
//			hm.put("eleSearchTabSearchResults",By.xpath("//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearch_ResultsLV-body']/div/table/tbody"));
			hm.put("eleSearchTabSearchResults",By.id("PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearch_ResultsLV-body"));
			hm.put("eleSearchTabPolicyTitle",By.id("PolicySearch:PolicySearchScreen:ttlBar"));
			hm.put("edtSearchTabPolicyNum",By.xpath(".//input[contains(@id,'PolicyNumberCriterion-inputEl')]"));
					
			hm.put("edtSearchTabOtherPolicy",By.id("PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:otherPolicyNumber-inputEl"));
			hm.put("edtSearchTabBillingNum",By.id("PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:billingNumber-inputEl"));
			hm.put("edtSearchTabFEIN",By.id("PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:TaxID-inputEl"));
			hm.put("eleSearchTabExactName",By.id("PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:CompanyNameExact-inputEl"));
			hm.put("eleSearchTabResetBtn",By.id("PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));
			hm.put("lstSearchTabState",By.id("PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("lstSearchTabUWCompanies",By.id("PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:UWCompany-inputEl"));
			hm.put("eleSearchPoliciesResults", By.xpath("//*[contains(@id,'PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearch_ResultsLV')]//div[contains(text(),'of')]"));
			hm.put("eleSearchPoliciesPageNext", By.xpath(".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearch_ResultsLV']//span[contains(@class,'x-btn-icon-el x-tbar-page-next')]"));
			hm.put("", By.xpath(""));
			
			//Shell Policy Note Edit
			hm.put("eleShellPolNoteEdit", By.id("HIGPolicyFile_Notes:PolicyShell_Notes_ExtScreen:NotesLV:0:NoteRowSet:NotesLV_EditLink"));
			hm.put("edtShellPolNoteUpdateSubject", By.id("EditNotePopup:EditNoteScreen:EditNoteDV:Subject-inputEl"));
			hm.put("edtShellPolNoteUpdateText", By.id("EditNotePopup:EditNoteScreen:EditNoteDV:Text-inputEl"));
			hm.put("eleShellPolNoteUpdateNote", By.id("EditNotePopup:EditNoteScreen:Update-btnInnerEl"));
			hm.put("eleShell_ContactTable", By.id("HIGPolicyFile_Contacts:0-body")); //sheel contact
			hm.put("eleFName_ShellContacts", By.id("HIGPolicyFile_Contacts:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
			hm.put("eleLName_ShellContacts", By.id("HIGPolicyFile_Contacts:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl"));
			
			//Shell Policy Note Delete
			hm.put("eleShellPolicyNoteDelete", By.id("HIGPolicyFile_Notes:PolicyShell_Notes_ExtScreen:NotesLV:0:NoteRowSet:NotesLV_DeleteLink"));
			hm.put("eleShellDeletePolicyNoteOK", By.id("button-1005-btnWrap"));

			// Shell Summary Quick launch link			
			hm.put("eleShellPolicySummaryQLaunch", By.id("HIGPolicyFile:MenuLinks:HIGPolicyFile_HIGPolicyFile_Summary"));

			// Create Shell Policy Notes
            hm.put("eleShellPolicyAction", By.id("HIGPolicyFile:HIGPolicyFileMenuActions-btnInnerEl"));
            hm.put("eleShellPolicyNewNote", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:HIGAccountMenuActions_NewNote-textEl"));                                                                          
            hm.put("lstShellPolicyNotesTopic", By.id("NewHIGPolicyNoteWorksheet:NewNoteScreen:NewNoteDV:Topic-inputEl"));
            hm.put("edtShellPolicyNotesSubjectText", By.id("NewHIGPolicyNoteWorksheet:NewNoteScreen:NewNoteDV:Subject-inputEl"));
            hm.put("lstShellPolicyNotesRelatedTo", By.id("NewHIGPolicyNoteWorksheet:NewNoteScreen:NewNoteDV:RelatedTo-inputEl"));
            hm.put("edtShellPolicyNotesText", By.id("NewHIGPolicyNoteWorksheet:NewNoteScreen:NewNoteDV:Text-inputEl"));
            hm.put("eleShellPolicyNotesCreateUpdate", By.id("NewHIGPolicyNoteWorksheet:NewNoteScreen:NewNoteScreen_UpdateButton-btnInnerEl"));
            hm.put("eleShellPolicyNotesCreateCancel", By.id("NewHIGPolicyNoteWorksheet:NewNoteScreen:NewNoteScreen_CancelButton-btnInnerEl"));
            hm.put("eleShellPolicySummary", By.id("HIGPolicyFile_Summary:ttlBar"));
            hm.put("eleShellPolicyTopicErrorMsgs", By.xpath(".//*[@id='NewHIGPolicyNoteWorksheet:NewNoteScreen:_msgs']/div[1]"));
            hm.put("eleShellPolicyTextErrorMsgs", By.xpath(".//*[@id='NewHIGPolicyNoteWorksheet:NewNoteScreen:_msgs']/div[2]"));

			//Search Shell Policy Notes
            hm.put("eleShellPolicyNotes", By.id("HIGPolicyFile:MenuLinks:HIGPolicyFile_HIGPolicyFile_Notes"));
            hm.put("edtShellPolicySearchText", By.id("HIGPolicyFile_Notes:PolicyShell_Notes_ExtScreen:PolicyShell_NotesSearch_ExtDV:TextSearch-inputEl"));
            hm.put("edtShellTopicNote", By.id("HIGPolicyFile_Notes:PolicyShell_Notes_ExtScreen:PolicyShell_NotesSearch_ExtDV:Topic-inputEl"));
            hm.put("edtShellRelatedToNote", By.id("HIGPolicyFile_Notes:PolicyShell_Notes_ExtScreen:PolicyShell_NotesSearch_ExtDV:RelatedTo-inputEl"));
            hm.put("eleShellNotesSearchBtn", By.id("HIGPolicyFile_Notes:PolicyShell_Notes_ExtScreen:PolicyShell_NotesSearch_ExtDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
            hm.put("funPolicyShellNotesVerify", By.id("HIGPolicyFile_Notes:PolicyShell_Notes_ExtScreen:NotesLV-body"));
            hm.put("eleShellPolicyNoteTitle", By.id("HIGPolicyFile_Notes:PolicyShell_Notes_ExtScreen:ttlBar"));
            hm.put("eleShellPolicyResetBtn", By.id("HIGPolicyFile_Notes:PolicyShell_Notes_ExtScreen:PolicyShell_NotesSearch_ExtDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));

			// Search Shell Policy
			hm.put("funSelectPolicy", By.xpath(".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:PSPolicyTermInfo_ExtLV-body']/div/table/tbody"));
			       
            //Search Activities
			hm.put("eleSearchActivites", By.id("TabBar:SearchTab:Search_ActivitySearch-textEl"));
			hm.put("edtSearchActivitesProducerCode", By.id("ActivitySearch:ActivitySearchScreen:ActivitySearchDV:ProducerCode-inputEl"));
			hm.put("edtSearchActivitesAccountNumber", By.id("ActivitySearch:ActivitySearchScreen:ActivitySearchDV:AccountNumber-inputEl"));
			hm.put("eleSearchActivitesSearch", By.id("ActivitySearch:ActivitySearchScreen:ActivitySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("SearchTable", By.id("ActivitySearch:ActivitySearchScreen:ActivitiesSearchLV-body"));
			hm.put("eleSearchActivitiesReset", By.id("ActivitySearch:ActivitySearchScreen:ActivitySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));
			hm.put("eleSearchActivitesLookUp", By.id("ActivitySearch:ActivitySearchScreen:ActivitySearchDV:AssignedUser:SelectOrganization"));
			hm.put("edtSAUserName", By.id("SearchActivitiesUserSearch_ExtPopup:UserSearchPopupScreen:SearchActivitiesUserSearch_ExtDV:Username-inputEl"));
			hm.put("eleSAUNSearch", By.id("SearchActivitiesUserSearch_ExtPopup:UserSearchPopupScreen:SearchActivitiesUserSearch_ExtDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleSAUNSelect", By.id("SearchActivitiesUserSearch_ExtPopup:UserSearchPopupScreen:UserSearchResultsLV:0:_Select"));
			hm.put("eleSAAssign", By.cssSelector("a[id='ActivitySearch:ActivitySearchScreen:ActivitiesSearchLV_tb:ActivitySearch_AssignButton'][class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("lstSASelectFromList", By.id("AssignActivitiesPopup:AssignmentPopupScreen:AssignmentPopupDV:SelectFromList-inputEl"));
			hm.put("eleSAUserAssign", By.id("AssignActivitiesPopup:AssignmentPopupScreen:AssignmentPopupDV:AssignmentByGroupPopupScreen_ButtonButton-btnInnerEl"));
			hm.put("eleSAActivityWorkSpaceOK", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailToolbarButtonSet:ActivityDetailToolbarButtons_UpdateButton-btnInnerEl"));
			hm.put("eleSAFindaUserorQueue", By.id("AssignActivitiesPopup:AssignmentPopupScreen:AssignmentPopupDV:3-inputEl"));
			hm.put("lstSASearchFor", By.id("AssignActivitiesPopup:AssignmentPopupScreen:AssignmentPopupDV:AssignmentSearchInputSet:SearchFor-inputEl"));
			hm.put("edtSAUNAA", By.id("AssignActivitiesPopup:AssignmentPopupScreen:AssignmentPopupDV:AssignmentSearchInputSet:Username-inputEl"));
			hm.put("edtSAFNAA", By.id("AssignActivitiesPopup:AssignmentPopupScreen:AssignmentPopupDV:AssignmentSearchInputSet:PLNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
			hm.put("edtSALNAA", By.id("AssignActivitiesPopup:AssignmentPopupScreen:AssignmentPopupDV:AssignmentSearchInputSet:PLNameInputSet:GlobalPersonNameInputSet:LastName-inputEl"));
			hm.put("eleSASearchAA", By.id("AssignActivitiesPopup:AssignmentPopupScreen:AssignmentPopupDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("edtSAQueueName", By.id("AssignActivitiesPopup:AssignmentPopupScreen:AssignmentPopupDV:AssignmentSearchInputSet:QueueName-inputEl"));
			hm.put("eleSAResetAA", By.id("AssignActivitiesPopup:AssignmentPopupScreen:AssignmentPopupDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));
			hm.put("eleSARETURNSA", By.id("AssignActivitiesPopup:__crumb__"));
			hm.put("eleSARtoSAMsg", By.id("messagebox-1001-displayfield-inputEl"));
			hm.put("eleSAssigntoQueue", By.id("ActivitySearch:ActivitySearchScreen:ActivitySearchDV:AssignedQueue:SelectOrganization"));
			hm.put("edtSAQueueNameATQ", By.id("SearchQueue_ExtPopup:searchQueue-inputEl"));
			hm.put("eleSASearchATQ", By.id("SearchQueue_ExtPopup:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleSASelectATQ", By.id("SearchQueue_ExtPopup:0:_Select"));
			hm.put("eleSAAssignUN", By.id("AssignActivitiesPopup:AssignmentPopupScreen:AssignmentUserLV:0:_Select"));
			hm.put("txtOOTBTCON15", By.xpath(".//*[@id='SearchActivitiesUserSearch_ExtPopup:UserSearchPopupScreen:_msgs']/div"));
			hm.put("eleDisableAssigntoQueue", By.cssSelector("input[id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:AssignedQueue-inputEl'][disabled='']"));
			hm.put("eleDisableAssigntoUser", By.cssSelector("input[id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:AssignedUser-inputEl'][disabled='']"));
			hm.put("eleSearchQueueSearchResultsTable", By.id("SearchQueue_ExtPopup:2-body"));
			hm.put("txtAssigntoQueueOOTB", By.xpath(".//*[@id='SearchQueue_ExtPopup:_msgs']/div"));
			hm.put("eleSAClose", By.cssSelector("a[id='ActivitySearch:ActivitySearchScreen:ActivitiesSearchLV_tb:ActivitySearch_SkipButton'][class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("eleSAComplete", By.cssSelector("a[id='ActivitySearch:ActivitySearchScreen:ActivitiesSearchLV_tb:ActivitySearch_CompleteButton'][class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("eleSAFollowUp", By.id("ActivitySearch:ActivitySearchScreen:ActivitiesSearchLV:0:Subject"));
			hm.put("eleSearchActivitiesTitle", By.id("ActivitySearch:ActivitySearchScreen:ttlBar"));
			
			//Document
			hm.put("eleSearchIDRAS", By.id("PolicyFile_Documents:Policy_DocumentsScreen:ExternalDocumentLinksDV:SearchIDARS-btnInnerEl"));
			hm.put("eleNoRecords", By.id("noResultsOk_label"));
			hm.put("eleoptCopyType", By.id("optCopyType"));
			hm.put("drpoptCopyType", By.id("optCopyType"));
			hm.put("eleSearch", By.id("searchButtonAD_label"));
			hm.put("eleView", By.id("viewButton_label"));
			hm.put("eleDocument", By.id("PolicyFile:MenuLinks:PolicyFile_PolicyFile_Documents"));			
			hm.put("edtRemarks", By.id("NewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:NewTemplateDocumentDV:RemarksTextInput-inputEl"));
			hm.put("eleDocumentsScreen", By.xpath(".//span[text()='Documents']"));
			hm.put("eleSave", By.id("NewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:NewTemplateDocumentDV:SaveBtnId"));
			hm.put("eleDocsEdit", By.id("NewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:NewTemplateDocumentDV:EditBtnlId"));
			hm.put("eleDocumentsCancel", By.xpath("//*[contains(@id,'DocumentCreationToolbarButtonSet:Cancel-btnInnerEl')]"));
			
			
			//Driver Information
			hm.put("eleCLADriver", By.id("HIGPolicyFile:MenuLinks:HIGPolicyFile_HIGPolicy_Drivers"));
			hm.put("eleCLADvrEdit", By.id("HIGPolicy_Drivers:DriversPanelSet:Edit-btnInnerEl"));
			hm.put("eleCLADvrAddDriver", By.id("HIGPolicy_Drivers:DriversPanelSet:Add-btnInnerEl"));
			hm.put("eleCLADvrOK", By.xpath("//*[contains(@id,'DriverPopup:Update-btnInnerEl')]"));
			hm.put("edtCLADvrFirstName", By.xpath("//*[contains(@id,'DriverPopup:HIGDriverInfoDV:firstname-inputEl')]"));
			hm.put("edtCLADvrLastName", By.xpath("//*[contains(@id,'DriverPopup:HIGDriverInfoDV:lastname-inputEl')]"));
			hm.put("edtCLADvrLicenceNumber", By.xpath("//*[contains(@id,'DriverPopup:HIGDriverInfoDV:licenseno-inputEl')]"));
			hm.put("lstCLADvrLicenceState", By.xpath("//*[contains(@id,'DriverPopup:HIGDriverInfoDV:licensestate-inputEl')]"));
			hm.put("txtFirstNameWarningandDOB", By.xpath("//*[contains(@id,'DriverPopup:_msgs')]/div"));
			hm.put("txtLastNameWarning", By.xpath(".//*[@id='HIGNewDriverPopup:_msgs']/div[2]"));
			hm.put("txtLicenceNumber", By.xpath(".//*[@id='HIGNewDriverPopup:_msgs']/div[3]"));
			hm.put("txtLicenceState", By.xpath(".//*[@id='HIGNewDriverPopup:_msgs']/div[4]"));
			hm.put("txtUpdateLicenceNumberAppropriate", By.xpath(".//*[@id='HIGNewDriverPopup:_msgs']/div[4]"));
			hm.put("eleCLADvrUpdate", By.id("HIGPolicy_Drivers:DriversPanelSet:Update-btnInnerEl"));
			hm.put("eleCLADvrAddDriverFirstRecord", By.xpath(".//*[@id='HIGEditDriverPopup:_msgs']/div"));
			hm.put("eleCLADvrEditDriverDetails", By.id("HIGEditDriverPopup:Edit-btnInnerEl"));
			hm.put("eleCLADvrCancel", By.id("HIGEditDriverPopup:Cancel-btnInnerEl"));
			hm.put("eleDriverInformationRecordTable", By.id("HIGPolicy_Drivers:DriversPanelSet:DriverDetailLV-body"));
			hm.put("eleCLADvrUpdateDriverDetails", By.id("HIGEditDriverPopup:Update-btnInnerEl"));
			hm.put("eleCLADvrChangeActiveStatus", By.id("HIGPolicy_Drivers:DriversPanelSet:changeActiveStatus-btnInnerEl"));
			hm.put("edtCLADvrDOB", By.xpath("//*[contains(@id,'DriverPopup:HIGDriverInfoDV:dob-inputEl')]"));
			hm.put("eleCLADvrRemoveDriver", By.id("HIGPolicy_Drivers:DriversPanelSet:Remove-btnInnerEl"));
			hm.put("eleCLADvrDriverDetailsCancel", By.xpath("//*[contains(@id,'DriverPopup:Cancel-btnInnerEl')]"));
			hm.put("edtCLADvrDateFirstLicenced", By.xpath("//*[contains(@id,'DriverPopup:HIGDriverInfoDV:dateFirstLicensed-inputEl')]"));
			hm.put("txtInactiveEffectiveDate", By.xpath("//*[contains(@id,'DriverPopup:HIGDriverInfoDV:inactiveDate-inputEl')]"));
			hm.put("eleCLADvrReturnToDriver", By.xpath("//*[contains(@id,'DriverPopup:__crumb__')]"));
			hm.put("eleCheckRemvoedDriverPresent", By.xpath(".//a[contains(text(), 'First')]"));
			hm.put("eleCLADvrPolicyNumber", By.id("AccountFile_Summary:AccountFile_SummaryScreen:PSPolicyTermInfo_ExtLV:0:higpolicy"));
			hm.put("eleForceDMV", By.id("HIGPolicy_Drivers:DriversPanelSet:forceDMV"));
			hm.put("eleOrderMVR", By.id("HIGPolicy_Drivers:DriversPanelSet:orderMVR"));
			hm.put("eleBrowseButton", By.id("//a//span[contains(.,'Browse')]"));
			hm.put("eleSpreadsheet", By.id("HIGPolicy_Drivers:DriversPanelSet:driverExportImportMenu-btnInnerEl"));
			hm.put("eleImportSpreadsheet", By.id("HIGPolicy_Drivers:DriversPanelSet:driverExportImportMenu:Import-itemEl"));
			hm.put("eleOrderAll", By.id("HIGPolicy_Drivers:DriversPanelSet:orderAll"));
			
			//Vehicle / Auto Id Card
			hm.put("eleAutoIdCardActionMenu", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:newVehicle-textEl"));
			hm.put("eleAutoIdCardTitle", By.id("HIGVehicleIDPopup:ttlBar"));
			hm.put("lstAutoIdCardSourceOfRequest", By.id("HIGVehicleIDPopup:soureOfRequest-inputEl"));
			hm.put("edtAutoIdCardEndorsementEffDate", By.id("HIGVehicleIDPopup:endorsementEffDate-inputEl"));
			hm.put("lstAutoIdCardDeliveryType", By.id("HIGVehicleIDPopup:deliveryType-inputEl"));
			hm.put("lstAutoIdCardContactName", By.id("HIGVehicleIDPopup:contactName1-inputEl"));
			hm.put("eleAutoIdCardAddNewVehicleBtn", By.id("HIGVehicleIDPopup:PSVehicleDetails_ExtLV_tb:addVehicle-btnInnerEl"));
			hm.put("eleAutoIdCardSaveDraftBtn", By.id("HIGVehicleIDPopup:saveDraftButton-btnInnerEl"));
			hm.put("eleAutoIdCardCancelBtn", By.id("HIGVehicleIDPopup:CancelButton-btnInnerEl"));
			hm.put("eleAutoIdCardFinalizeBtn", By.cssSelector("a[id='HIGVehicleIDPopup:finalizeDocument'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("eljAutoIdCardFinalizeBtn", By.cssSelector("a[id='HIGVehicleIDPopup:finalizeDocument'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("eleAutoIdCardRequestFormBtn", By.id("HIGVehicleIDPopup:requestForm-btnInnerEl"));
			hm.put("eleAutoIdCardReturntoPolicyInfolnk", By.id("HIGVehicleIDPopup:__crumb__"));
			hm.put("edtAutoIdCardToEmail", By.id("HIGVehicleIDPopup:DeliveryPreferenceTO_Ext:TOEmail_Ext-inputEl"));
			hm.put("edtAutoIdCardToFax", By.id("HIGVehicleIDPopup:DeliveryPreferenceTO_Ext:TOFax_Ext-inputEl"));
			hm.put("eleAutoIdCardAddEditUniqueContact", By.id("HIGVehicleIDPopup:uniqueContactInputSet:addEditUniqueContact-btnInnerEl"));
			hm.put("eleAutoIdCardUniqueContact", By.id("HIGVehicleIDPopup:uniqueContactInputSet:addEditUniqueContact:0:roleType-textEl"));
			hm.put("eleAutoIdCardAddEditCompany", By.id("HIGVehicleIDPopup:uniqueContactInputSet:addEditUniqueContact:0:roleType:0:contactType-textEl"));
			hm.put("eleAutoIdCardAddEditPerson", By.id("HIGVehicleIDPopup:uniqueContactInputSet:addEditUniqueContact:0:roleType:1:contactType-textEl"));
			hm.put("eleAutoIdCardRemoveUniqueContact", By.id("HIGVehicleIDPopup:uniqueContactInputSet:DeleteUniqueTo-btnInnerEl"));
			hm.put("eleAutoIdCardVehicleDetailsTable", By.id("HIGVehicleIDPopup:PSVehicleDetails_ExtLV-body"));
			hm.put("eleAutoIdCardErrorMsg", By.id("HIGVehicleIDPopup:_msgs"));
			
			//New Unique Contact
			hm.put("eleAIDNewUniqueContactTitle", By.id("AddVehicleUniqueContactPopup:ContactDetailScreen:ttlBar"));
			hm.put("edtAIDName", By.id("AddVehicleUniqueContactPopup:ContactDetailScreen:VehicleContactCV:VehicleContactNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("lstAIDCountry", By.id("AddVehicleUniqueContactPopup:ContactDetailScreen:VehicleContactCV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl"));
			hm.put("edtAIDAddressLine1", By.id("AddVehicleUniqueContactPopup:ContactDetailScreen:VehicleContactCV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
			hm.put("edtAIDCity", By.id("AddVehicleUniqueContactPopup:ContactDetailScreen:VehicleContactCV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
			hm.put("edtAIDCountry", By.id("AddVehicleUniqueContactPopup:ContactDetailScreen:VehicleContactCV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:County-inputEl"));
			hm.put("lstAIDState", By.id("AddVehicleUniqueContactPopup:ContactDetailScreen:VehicleContactCV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("edtAIDZipcode", By.id("AddVehicleUniqueContactPopup:ContactDetailScreen:VehicleContactCV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("edtAIDFirstName", By.id("AddVehicleUniqueContactPopup:ContactDetailScreen:VehicleContactCV:VehicleContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
			hm.put("edtAIDLastName", By.id("AddVehicleUniqueContactPopup:ContactDetailScreen:VehicleContactCV:VehicleContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl"));
			hm.put("eleAIDUpdateBtn", By.id("AddVehicleUniqueContactPopup:ContactDetailScreen:updateButton_Ext-btnInnerEl"));
			hm.put("eleAIDCancelBtn", By.id("AddVehicleUniqueContactPopup:ContactDetailScreen:Cancel-btnInnerEl"));
			hm.put("eleAIDReturnToAIDCardLnk", By.id("AddVehicleUniqueContactPopup:__crumb__"));
			
			// Vehicle Information
			hm.put("eleVINewVehicleTitle", By.id("PSNewVehicle_ExtPopup:ttlBar"));
			hm.put("lstVIState", By.id("PSNewVehicle_ExtPopup:vehicleState-inputEl"));
			hm.put("edtVIModelYear", By.id("PSNewVehicle_ExtPopup:vehicleYear-inputEl"));
			hm.put("edtVIMake", By.id("PSNewVehicle_ExtPopup:vehicleMake-inputEl"));
			hm.put("edtVIModel", By.id("PSNewVehicle_ExtPopup:vehicleModel-inputEl"));
			hm.put("edtVIVehicleVIN", By.id("PSNewVehicle_ExtPopup:vehicleVIN-inputEl"));
			hm.put("eleVIOkBtn", By.id("PSNewVehicle_ExtPopup:OK-btnInnerEl"));
			hm.put("eleVICancelBtn", By.id("PSNewVehicle_ExtPopup:Cancel-btnInnerEl"));
			hm.put("eleVIReturntoAIDCardLnk", By.id("PSNewVehicle_ExtPopup:__crumb__"));
			
			// Account Submission Manager
            hm.put("eleASMSubmissionTransQuickLink", By.xpath(".//span[contains(text(), 'Submission Manager')]"));               
            hm.put("eleASMSubmissionManagerTitle", By.id("SubmissionManager:SubmissionManagerScreen:0"));
            hm.put("eleASMBannerMessage", By.id("SubmissionManager:SubmissionManagerScreen:Message"));               
            hm.put("lstASMFilter", By.id("SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:submissionFilter-inputEl"));
            hm.put("eleASMNewSubmissionBtn", By.id("SubmissionManager:SubmissionManagerScreen:SubmissionManager_NewSubmission-btnInnerEl"));
            hm.put("eleASMSearchResultTable", By.id("SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV-body"));
			
			//Customer Forms
			hm.put("eleCustomerForms", By.xpath("//span[contains(text(), 'Customer Forms')]"));
			hm.put("eleCFTSAddNewCustomerForm", By.id("AccountFile_Certificates:CertificateSearchScreen:certSearchPanel:CertificateScreenResultsLV_tb:addNewCertificate-btnInnerEl"));
//			hm.put("eleCFTSAddNewPolicy", By.cssSelector("a[id='CertificatePopup:defaultCertScreen:CertificatePanelSet:certificatePolicyDataLV_tb:ToolbarButton'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("eleCFTSAddNewPolicy",  By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:certificatePolicyDataLV_tb:ToolbarButton-btnWrap"));
			hm.put("eleCFTSAddNewPolicyDataAddress", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:certificatePolicyDataLV_tb:ToolbarButton:0:policyLineToAdd-textEl"));
			hm.put("eleCFTSAddNewPolicy1", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:certificatePolicyDataLV:0:policyNumber"));
			hm.put("eleCFTSAddNewPolicy2", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:certificatePolicyDataLV:1:policyNumber"));
			hm.put("txtAddNewPolicyWarning", By.id("CertificatePopup:defaultCertScreen:_msgs"));
			hm.put("lstCFTSFormName", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:formType-inputEl"));
			hm.put("lstCFTSSourceOfRequest", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:sourceofRequest-inputEl"));
			hm.put("eleCFTSCopyInsured", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:CopyInsured-inputEl"));
			hm.put("lstCFTSHowSent", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:InsuredHowSent-inputEl"));
			hm.put("lsjCFTSHowSent", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:InsuredHowSent-inputEl"));
			hm.put("eleCFTSEMail", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:InsuredEmail-inputEl"));
			hm.put("edtCFTSEMail", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:InsuredEmail-inputEl"));
			hm.put("edtCFTSFax", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:InsuredFax-inputEl"));
			hm.put("eleCFTSSaveDraft", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet_tb:saveAndPrint-btnEl"));
			hm.put("txtFormNumber", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:certnumber-inputEl"));
			hm.put("eleCFTSAddNewCustomerFormTable", By.id("AccountFile_Certificates:CertificateSearchScreen:certSearchPanel:CertificateScreenResultsLV-body"));
			hm.put("eleCFTSAddAccountRecipients", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:accountReciepientLV_tb:addAccountrecipient-btnWrap"));
			hm.put("eleCFTSFormNumber", By.id("AccountFile_Certificates:CertificateSearchScreen:certSearchPanel:CertificateScreenResultsLV:0:certNumber"));
			hm.put("eleCFTSFormNumber1", By.id("AccountFile_Certificates:CertificateSearchScreen:certSearchPanel:CertificateScreenResultsLV:1:certNumber"));
			hm.put("eleCFTSNewAccountRecipients", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:accountReciepientLV_tb:addAccountrecipient:newAccRec-textEl"));
			hm.put("edtCFTSName1", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:nameOne-inputEl')]"));
			hm.put("lstCFTSHowSentRecipients", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:howSent-inputEl')]"));
			hm.put("lsjCFTSHowSentRecipients", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:howSent-inputEl')]"));
			hm.put("edtCFTSPrimaryEmail", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:EmailAddress1-inputEl')]"));
			hm.put("edtCFTSAddress1", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl')]"));
			hm.put("eleCFTSAddress1", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl')]"));
			hm.put("eleCFTSCity", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl')]"));
			hm.put("zedCFTSCity", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl')]"));
			hm.put("eleCFTSState", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-triggerWrap')]"));
			hm.put("zedCFTSState", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-triggerWrap')]"));
			hm.put("eleCFTSZipCode", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl')]"));
			hm.put("zedCFTSZipCode", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl')]"));
			hm.put("eleCFTSStandardize", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:standardizeButton_Ext-btnInnerEl')]"));
			hm.put("eleCFTSUpdate", By.cssSelector("a[id='NewAccountRecipient_ExtPopup:updateButton_Ext'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("lstCFTSCertType", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:typeCert-inputEl')]"));
			hm.put("eleCFTSExistingAccountRecipients", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:accountReciepientLV_tb:addAccountrecipient:existingAccRec-textEl"));
			hm.put("eleCFTSAccountReceipientsTable", By.id("AccountRecipientCert_ExtPopup:AccountRecipientSummaryScreen:AccountRecipientLV-body"));
			hm.put("eleCFTSAccountRecipientsEdit", By.id("EditAccountRecipient_ExtPopup:Edit-btnInnerEl"));
//			hm.put("eleCFTSUpdateEdit", By.cssSelector("a[id='EditAccountRecipient_ExtPopup:updateButton_Ext'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon x-over x-btn-over x-btn-default-toolbar-small-over']"));
			hm.put("eleCFTSUpdateEdit", By.id("EditAccountRecipient_ExtPopup:updateButton_Ext"));
			hm.put("txtCFTSName", By.id("EditAccountRecipient_ExtPopup:nameOne-inputEl"));
			hm.put("txtCFTSPrimaryEmail", By.id("EditAccountRecipient_ExtPopup:EmailAddress1-inputEl"));
			hm.put("txtCFTSAddress", By.id("EditAccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl"));
			hm.put("txtCFTSAnnual", By.id("EditAccountRecipient_ExtPopup:typeCert-inputEl"));
			hm.put("edtCFTSFormNumber", By.id("AccountFile_Certificates:CertificateSearchScreen:certSearchPanel:CertificateSearchDV:certnumber-inputEl"));
			hm.put("eleCFTSSearch", By.id("AccountFile_Certificates:CertificateSearchScreen:certSearchPanel:CertificateSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleCFTSReset", By.id("AccountFile_Certificates:CertificateSearchScreen:certSearchPanel:CertificateSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));
			hm.put("txtZeroResults", By.xpath("//*[contains(text(),'The search returned zero results.')]"));
			hm.put("eleCFTSAddRecepient", By.cssSelector("a[id='AccountRecipientCert_ExtPopup:AccountRecipientSummaryScreen:AccountRecipientLV_tb:value1'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("eleCFTSRequestForm", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet_tb:requestForm-btnInnerEl"));								
			hm.put("eleCFTSFinalize", By.id("EditCertificatePopup:editCertScreen:EditCertificatePanelSet_tb:viewCertificate-btnInnerEl"));
			hm.put("eleCustomerFormsPageAssert", By.id("AccountFile_Certificates:CertificateSearchScreen:ttlBar"));
			hm.put("eleCFTSFinalizeCancel", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet_tb:cancel-btnInnerEl"));
			hm.put("eleCFTSView", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:accountReciepientLV:0:documentView"));
			hm.put("eleCFTSView1", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:accountReciepientLV:1:documentView"));
			hm.put("lstCFTSAsOfDate", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:certDate-inputEl"));
			hm.put("eleCFTSCancel", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet_tb:cancel-btnInnerEl"));
			hm.put("eleCFTSWithDrawForm", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet_tb:withdrawCertuificate-btnInnerEl"));
			hm.put("eleCFTSEvidenceOfPropertyTab", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:EvidenceOfPropertyTab-btnInnerEl')]"));
			hm.put("lstCFTSEvidenceType", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:evidenceFormType-inputEl')]"));
			hm.put("edtCFTSARFax", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:FaxPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl')]"));
			hm.put("eleAccountRecepientsTable", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:accountReciepientLV-body"));
			hm.put("eleCFTSAddNewLocation", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet:locationsLV_tb:AddLocation-btnInnerEl"));
			hm.put("edtCFTSLILocation", By.id("CertLocation_ExtPopup:locationNum-inputEl"));
			hm.put("edtCFTSLIBuilding", By.id("CertLocation_ExtPopup:BuildingNum-inputEl"));
			hm.put("lstCFTSLIState", By.id("CertLocation_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("eleCFTSLIState", By.id("CertLocation_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("edtCFTSLIAddress1", By.id("CertLocation_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
			hm.put("eleCFTSLIZipCode", By.id("CertLocation_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("lstCFTSLIZipCode", By.id("CertLocation_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("eleCFTSLIStandardise", By.id("CertLocation_ExtPopup:standardizeButton_Ext-btnInnerEl"));
			hm.put("eleCFTSLIUpdate", By.cssSelector("a[id='CertLocation_ExtPopup:updateButton_Ext'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("eleCFTSFormNameRO", By.cssSelector("div[id='CertificatePopup:defaultCertScreen:CertificatePanelSet:formType-inputEl'][class='x-form-display-field']"));
			hm.put("eleCFTSFormNumberRO", By.cssSelector("div[id='CertificatePopup:defaultCertScreen:CertificatePanelSet:certnumber-inputEl'][class='x-form-display-field']"));
			hm.put("eleCFTSSourceOfRequestRO", By.cssSelector("div[id='CertificatePopup:defaultCertScreen:CertificatePanelSet:sourceofRequest-inputEl'][class='x-form-display-field']"));
			hm.put("eleCFTSFinalWorkStatusRO", By.cssSelector("div[id='CertificatePopup:defaultCertScreen:CertificatePanelSet:status-inputEl'][class='x-form-display-field']"));
			hm.put("eleCFTSEOPRequestForm", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet_tb:requestForm_Ext-btnInnerEl"));
			hm.put("lstCFTSAccountRecepient", By.id("AccountFile_Certificates:CertificateSearchScreen:certSearchPanel:CertificateSearchDV:accountRecipient-inputEl"));
			hm.put("eleCFTSEditForm", By.id("CertificatePopup:defaultCertScreen:CertificatePanelSet_tb:requestForm_Ext-btnInnerEl"));
			hm.put("eleCFTSSaveAsDraft", By.id("EditCertificatePopup:editCertScreen:EditCertificatePanelSet_tb:saveAndPrint-btnInnerEl"));
			hm.put("eleCFTSAccountRecepientDataEntry", By.id("EditCertificatePopup:editCertScreen:ttlBar"));
			hm.put("eleForms", By.id("SubmissionWizard:Forms"));
			hm.put("eleFormsTable", By.id("SubmissionWizard:FormsScreen:FormsDV-table"));
			// SubmissionWizard:FormsScreen:FormsDV 
			
			
			//Account Policy Transaction
            hm.put("eleAPTAccountSummaryTitle", By.id("AccountFile_WorkOrders:AccountFile_WorkOrdersScreen:ttlBar"));                                                                                            
            hm.put("eleAPTBannerMessage", By.id("AccountFile_WorkOrders:AccountFile_WorkOrdersScreen:policyShellMessage_Ext"));
            hm.put("eleAPTPolicyTransQuickLink", By.xpath(".//span[contains(text(), 'Policy Transactions')]"));
            hm.put("eleAPTStatus", By.id("AccountFile_WorkOrders:AccountFile_WorkOrdersScreen:WorkOrdersCompletenessFilter-inputEl"));
            hm.put("eleAPTSearchResultTable", By.id("AccountFile_WorkOrders:AccountFile_WorkOrdersScreen:AccountWorkOrdersLV-body"));
            hm.put("eleAPTPolicyTransactionTitle", By.id("PolicyFile_Jobs:Policy_JobsScreen:0"));
            hm.put("eleAPTPolicyTransactionAccountName", By.id("PolicyFile_Jobs:Policy_JobsScreen:DetailPanel:Policy_JobInfoDV:Policy_JobDetailsInputSet:Account-inputEl"));
			
            //Account Recepient
            hm.put("eleAccountReceipients", By.xpath(".//span[contains(text(), 'Account Recipients')]"));
			hm.put("eleNewAccountRecipient", By.id("AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewAccountRecipient-textEl"));
            hm.put("edtARName1", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:nameOne-inputEl')]"));
            hm.put("edtARName2", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:nameTwo-inputEl')]"));
            hm.put("edtARName3", By.xpath(""));
			hm.put("lstARHowSentRecipients", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:howSent-inputEl')]"));
			hm.put("edtARPrimaryEmail", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:EmailAddress1-inputEl')]"));
			hm.put("edtARAddress1", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl')]"));
			hm.put("eleARCity", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl')]"));
			hm.put("zedARCity", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl')]"));
			hm.put("eleARState", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-triggerWrap')]"));
			hm.put("zedARState", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-triggerWrap')]"));
			hm.put("eleARZipCode", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl')]"));
			hm.put("zedARZipCode", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl')]"));
			hm.put("eleARStandardize", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:standardizeButton_Ext-btnInnerEl')]"));
			hm.put("eleARUpdate", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:updateButton_Ext-btnInnerEl')]"));
			hm.put("lstARCertType", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:typeCert-inputEl')]"));
			hm.put("eleAROverride", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:overrideButton_Ext-btnInnerEl')]"));
			hm.put("eleAREvidenceOfPropertyTab", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:EvidenceOfPropertyTab-btnInnerEl')]"));
			hm.put("lstAREvidenceType", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:evidenceFormType-inputEl')]"));
			hm.put("txtAREvidenceType", By.id("NewAccountRecipient_ExtPopup:evidenceFormType-inputEl"));
			hm.put("eleARCancel", By.xpath("//*[contains(@id,'AccountRecipient_ExtPopup:Cancel-btnInnerEl')]"));
			hm.put("edtARAccountRecipients", By.id("AccountRecipientSummary_Ext:AccountRecipientSummaryScreen:accountRecipient-inputEl"));
			hm.put("eleARAccountRecipientsTable", By.id("AccountRecipientSummary_Ext:AccountRecipientSummaryScreen:AccountRecipientLV-body"));
			hm.put("txtARName1", By.id("EditAccountRecipient_ExtPopup:nameOne-inputEl"));
			hm.put("txtARName2", By.id("EditAccountRecipient_ExtPopup:nameTwo-inputEl"));
			hm.put("txtAREmail", By.id("EditAccountRecipient_ExtPopup:EmailAddress1-inputEl"));
			hm.put("txtARAddress", By.id("EditAccountRecipient_ExtPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl"));
			hm.put("txtARCertType", By.id("EditAccountRecipient_ExtPopup:typeCert-inputEl"));
			hm.put("eleAREdit", By.id("EditAccountRecipient_ExtPopup:Edit-btnInnerEl"));
			hm.put("eljAREdit", By.id("EditAccountRecipient_ExtPopup:Edit-btnInnerEl"));
			hm.put("eleAccountReceipientLabel", By.id("AccountRecipientSummary_Ext:AccountRecipientSummaryScreen:ttlBar"));
			hm.put("eleARSearch", By.id("AccountRecipientSummary_Ext:AccountRecipientSummaryScreen:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			
			//Policy Change
			hm.put("eleChangePolicy", By.id("PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_ChangePolicy-textEl"));
			hm.put("lstCPEffectiveDate", By.id("StartPolicyChange:StartPolicyChangeScreen:StartPolicyChangeDV:EffectiveDate_date-inputEl"));
			hm.put("lstCPDateReceived", By.id("StartPolicyChange:StartPolicyChangeScreen:StartPolicyChangeDV:ReceivedDate_date-inputEl"));
			hm.put("eleCPNext", By.cssSelector("a[id='StartPolicyChange:StartPolicyChangeScreen:NewPolicyChange'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("eleCPIssuePolicy", By.id("PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:JobWizardToolbarButtonSet:BindPolicyChange-btnInnerEl"));

			// Manual AMP Submission
			hm.put("eleReservePolicyNumFromCLA", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:action-btnInnerEl"));
			hm.put("eleRPNNextBtn", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:next-btnInnerEl"));
			hm.put("elePreEvaluateCompleteActivity", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:approveactivity-btnInnerEl"));
			hm.put("eleGoToLink", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:action-btnInnerEl"));
			hm.put("eleClassGuideSelectCustomerRadioBtn", By.cssSelector("input[name='segmentRBG'][value='Select Customer']"));
			hm.put("eleClassGuideSelectCustomerxpandRadioBtn", By.cssSelector("input[name='segmentRBG'][value='Priority Markets']"));
			hm.put("lstClassGuideRiskState", By.cssSelector("select[name='riskStateDDL']"));
			hm.put("eleCGSearchByClassDesc", By.cssSelector("input[name='searchSelector'][value='Radio1']"));
			hm.put("eleCGSearchBySpectrumCode", By.cssSelector("input[name='searchSelector'][value='Radio2']"));
			hm.put("eleCGSearchBySICCode", By.cssSelector("input[name='searchSelector'][value='Radio3']"));
			hm.put("eleCGSearchByISOGLCode", By.cssSelector("input[name='searchSelector'][value='Radio4']"));
			hm.put("eleCGSearchByWorkersCompCode", By.cssSelector("input[name='searchSelector'][value='Radio5']"));
			hm.put("eleCGSearchAgainBtn", By.cssSelector("input[name='backToSearchButton'][value='Search Again']"));
			hm.put("edtCGClassDescText", By.cssSelector("input[name='classDescriptionText']"));
			hm.put("lstCGBusinessType", By.cssSelector("select[name='industryDDL']"));
			hm.put("eleCGSearchBtn", By.cssSelector("button[name='Search']"));
			
			//Missing Inforamtion
			hm.put("eleMissingInformationTab", By.xpath(".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_MissingInfo_Ext']/div/span"));
			hm.put("eleActivityGeneral", By.xpath(".//span[contains(text(),'Missing Information')]"));
			hm.put("eleActivityGeneral", By.xpath(".//span[contains(text(),'General')]"));
			hm.put("eleGeneralASC", By.xpath(".//span[contains(text(),'ASC')]"));
			hm.put("eleActivityRemainder", By.xpath(".//span[contains(text(), 'Reminder')]"));
			hm.put("eleFollowUp", By.xpath(".//span[contains(text(), 'Follow up')]"));
			hm.put("eleActivityUnderWriterReview", By.xpath(".//span[contains(text(),'Underwriter Review')]"));
			hm.put("eleUnderWriterReviewReferToUW", By.xpath(".//span[contains(text(),'Refer to UW')]"));
			hm.put("eleCLANewActivity", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:ActivityID-textEl"));
			hm.put("lstActivityStatus", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:ActivityStatus-inputEl"));
			hm.put("eleActivityMissingInformation", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailToolbarButtonSet:ActivityDetailToolbarButtons_MissingInfoButton-btnInnerEl"));
			hm.put("lstMIPolicyNumber", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:policyNumber-inputEl"));
			hm.put("lstMICorrespodence", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:correspondenceInputSet:Coresspondence-inputEl"));
			hm.put("lsjMICorrespodence", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:correspondenceInputSet:Coresspondence-inputEl"));
			hm.put("edtMIRecipientName", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:correspondenceInputSet:RecipientName-inputEl"));
			hm.put("eleMIRecipientName", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:correspondenceInputSet:RecipientName-inputEl"));
			hm.put("txtMissingInformationID", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:missingInfoID-inputEl"));
			hm.put("eleMICancel", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:cancel1-btnInnerEl"));
			hm.put("lstOriginalReceivedDate", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:date-inputEl"));
			hm.put("lsjOriginalReceivedDate", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:date-inputEl"));
			hm.put("eleOriginalReceivedDate", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:date-inputEl"));
			hm.put("eleMIFAX", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:correspondenceInputSet:Fax-inputEl"));
			hm.put("eleOriginalReceivedDateUNEdit", By.cssSelector("div[id='MissingInformation_ExtPage:NewMissingInfoScreen:date-inputEl'][class='x-form-display-field']"));
			hm.put("lstActivityPendReason", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:PendStatus-inputEl"));
			hm.put("eleReferToUW", By.xpath(".//a[contains(text(),'Refer to UW')]"));
			hm.put("elePolicyActivityTable", By.id("PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_ActivitiesLV-body"));
			hm.put("eleMIAdd", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:Add-btnInnerEl"));
			hm.put("eljMIAdd", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:Add-btnInnerEl"));
			hm.put("eleMIAddReasonTable", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:2-body"));
			hm.put("lstMIReason", By.name("reasoncell"));
			hm.put("lsjMIReason", By.name("reasoncell"));
			hm.put("eleMISubmit", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:submit-btnInnerEl"));
			hm.put("eleMIMissingInformationTable", By.id("AccountFile_MissingInfo_Ext:3-body"));
			hm.put("eleMIMissingInfoID", By.id("AccountFile_MissingInfo_Ext:0:MissingInfoWO"));
			hm.put("eleMIErrorMessage", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:banner"));
			hm.put("eleMIStatus", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:Status-inputEl"));
			hm.put("eleMIMissingInformationFirstLetterSent", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:MIfirstlettersent-inputEl"));
			hm.put("eleMissingInformation", By.xpath(".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_MissingInfo_Ext']/div/span"));
			hm.put("eleAccountSummaryMissingInfoTable", By.id("AccountFile_Summary:AccountFile_SummaryScreen:MissingInfoLV-body"));
			hm.put("elePolicySummaryMissingInfoTable", By.id("PolicyFile_Summary:Policy_SummaryScreen:MissingInfoLV-body"));
			hm.put("eleMIPolicyNumberUnEdit", By.cssSelector("div[id='MissingInformation_ExtPage:NewMissingInfoScreen:policyNumber-inputEl'][class='x-form-display-field']"));
			hm.put("eleMIEmail", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:correspondenceInputSet:EmailAddress-inputEl"));
			hm.put("elePolicyShellSummaryMissingInfoTable", By.id("HIGPolicyFile_Summary:MissingInfoLV-body"));
			hm.put("eleMissingInfoLabel", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:ttlBar"));
			hm.put("eleNewActionMissingInfo", By.xpath(".//a[contains(text(),'New Missing Information')]"));
			hm.put("eleMISave", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:save-btnInnerEl"));
			hm.put("eleMissingInformationAssert", By.id("AccountFile_MissingInfo_Ext:ttlBar"));
			hm.put("eleMissingInformationLabel", By.id("MissingInformation_ExtPage:NewMissingInfoScreen:ttlBar"));
			hm.put("eleMissingInfoReasonTable", By.xpath(".//span[contains(text(),'Missing Information Reason')]"));
			hm.put("edtMissingInfoID", By.xpath("//*[contains(@id,'MissingInformationID-inputEl')]"));
			hm.put("eleShellActivityTable", By.id("HIGPolicyFile_Summary:26-body"));
			
			//Manage Affinity Group
			hm.put("eleICLastNamebutton", By.id("NewAffinityGroup:AffinityGroupDetailScreen:AffinityGroupDetailDV:LastName_Ext:SelectLastName_Ext"));
			hm.put("eleAffinityGrp_clkReset", By.id("SearchAffinityGroup:AffinityGroupSearchScreen:AffinityGroupSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));
			hm.put("eleAuthorityCancel", By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:Cancel-btnInnerEl"));
			hm.put("eleAuthorityBasics", By.id("AffinityGroupDetailPage:AffinityGroupDetailScreen:AffinityGroupDetail_BasicCardTab-btnInnerEl"));
			hm.put("eleAffinityGroupNamevfy", By.xpath("//label[contains(.,'Affinity Group')]//ancestor::tr[1]//following-sibling::tr[1]//table//tbody//td[2]//input"));
			hm.put("eleTrademarkvfy", By.xpath("//label[contains(.,'Affinity Group')]//ancestor::tr[1]//following-sibling::tr[2]//table//tbody//td[2]//input"));
			hm.put("eleAffinityGrpErrmsg", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:_msgs"));
			
            //Page Left Panel All Links
            hm.put("eleDeskTopLeftPanelLinks", By.xpath(".//*[@id='Desktop:MenuLinks-body']/div/table/tbody"));
            hm.put("eleDeskTopLeftPanelActions", By.id("Desktop:DesktopMenuActions-btnInnerEl"));
//          hm.put("eleDeskTopLeftPanelActions", By.xpath(".//*[contains(@id,'MenuActions-btnInnerEl')]"));
            hm.put("eleAccountLeftPanelLinks", By.xpath(".//*[@id='AccountFile:MenuLinks']/div/table/tbody"));
            hm.put("eleAccountLeftPanelActions", By.id("AccountFile:AccountFileMenuActions-btnInnerEl"));
            hm.put("elePolicyLeftPanelLinks", By.xpath(".//*[@id='PolicyFile:MenuLinks-body']/div/table/tbody"));
//          hm.put("elePolicyLeftPanelActions", By.id("PolicyFile:PolicyFileMenuActions-btnInnerEl"));
            hm.put("elePolicyLeftPanelActions", By.xpath(".//*[contains(@id,'MenuActions-btnInnerEl')]"));
			hm.put("eleAdminLeftPanelLinks", By.xpath(".//*[@id='Admin:MenuLinks-body']/div/table/tbody"));
            
            //Manage User
            hm.put("eleNewUser",By.id("Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuActions_NewUser-textEl"));
            hm.put("edtUser_FirstName",By.xpath(".//*[contains(@id,'Name:GlobalPersonNameInputSet:FirstName-inputEl')]"));
            hm.put("edtUser_LastName",By.xpath(".//*[contains(@id,'Name:GlobalPersonNameInputSet:LastName-inputEl')]"));
            hm.put("edtUser_UserName",By.xpath(".//*[contains(@id,'UserDetailInputSet:Username-inputEl')]"));
            hm.put("lstUser_UserType",By.xpath(".//*[contains(@id,'UserDetailDV:UserType-inputEl')]"));
            hm.put("eleUser_SkillTrack",By.xpath(".//*[contains(@id,'UserDetail_SkillTrackCardTab-btnInnerEl')]"));
            hm.put("eleUser_Attributes",By.xpath(".//*[contains(@id,'UserDetail_AttributesCardTab-btnInnerEl')]"));
            hm.put("eleUser_Access",By.xpath(".//*[contains(@id,'UserDetail_AccessCardTab-btnInnerEl')]"));
            hm.put("eleUser_Roles",By.xpath(".//*[contains(@id,'UserDetail_RolesCardTab-btnInnerEl')]"));
            hm.put("eleUser_Region",By.xpath(".//*[contains(@id,'UserDetail_RegionCardTab-btnInnerEl')]"));
            hm.put("eleUserUWAuthority",By.xpath(".//*[contains(@id,'UserDetail_AuthorityCardTab-btnInnerEl')]"));
            hm.put("eleUser_Update",By.xpath(".//*[contains(@id,'UserDetailToolbarButtonSet:Update-btnInnerEl')]"));
            hm.put("eljUser_Update",By.xpath(".//*[contains(@id,'UserDetailToolbarButtonSet:Update-btnInnerEl')]"));
            hm.put("eleUser_AddRole",By.xpath(".//*[contains(@id,'UserRolesLV_tb:Add-btnInnerEl')]"));
            hm.put("eleUser_Roletbl",By.xpath(".//*[contains(@id,'UserDetailScreen:UserRolesLV-body')]"));
            hm.put("eleUser_RoleName", By.name("RoleName"));
            hm.put("eleUser_AddSkill",By.xpath(".//*[contains(@id,'UserSkill_ExtLV_tb:Add-btnInnerEl')]"));
            hm.put("eleUser_Skilltbl",By.xpath(".//*[contains(@id,'UserDetailScreen:UserSkill_ExtLV-body')]"));
            hm.put("eleUser_RemoveSkill",By.xpath(".//*[contains(@id,'UserSkill_ExtLV_tb:Remove-btnInnerEl')]"));
            hm.put("eleUser_SkillSegment",By.name("BusinessSegment"));                 
            hm.put("eleUser_Skill",By.name("skills"));
            hm.put("eleUser_Tracktbl",By.xpath(".//*[contains(@id,'UserDetailScreen:UserTrack_ExtLV-body')]"));
            hm.put("eleUser_Track",By.name("tracks"));
            hm.put("eleUser_RemoveTrack",By.xpath(".//*[contains(@id,'UserTrack_ExtLV_tb:Remove-btnInnerEl')]"));
            hm.put("eleUser_RemoveRole",By.xpath(".//*[contains(@id,'UserRolesLV_tb:Remove-btnInnerEl')]"));
            hm.put("eleUser_RemoveUWAuthority",By.xpath(".//*[contains(@id,'UserAuthorityLV_tb:Remove-btnInnerEl')]"));
            hm.put("eleUser_AddTrack",By.xpath(".//*[contains(@id,'UserDetailScreen:UserTrack_ExtLV_tb:Add-btnInnerEl')]"));
            hm.put("eleUser_AddUWAuthoritytbl",By.xpath(".//*[contains(@id,'UserDetailScreen:UserAuthorityLV-body')]"));
            hm.put("eleUser_UWAuthorityName",By.name("Name"));
            hm.put("eleUser_AddUWAuthority",By.xpath(".//*[contains(@id,'UserDetailScreen:UserAuthorityLV_tb:Add-btnInnerEl')]"));
            hm.put("eleUser_EditUser",By.xpath(".//*[contains(@id,'UserDetailToolbarButtonSet:Edit-btnInnerEl')]"));
            hm.put("eleUser_Cancel",By.id("NewUser:UserDetailScreen:UserDetailToolbarButtonSet:Cancel-btnInnerEl"));
            hm.put("eleUser_UserSummary",By.id("AdminUserSearchPage:UserSearchScreen:ttlBar"));
            hm.put("lstUser_CLALterm", By.xpath(".//*[contains(@id,'logisticalTerminal_Ext-inputEl')]"));
            hm.put("edtUser_OperatorIni", By.xpath(".//*[contains(@id,'operatorInitials_Ext-inputEl')]"));
            hm.put("eleUser_AddAccess", By.xpath(".//*[contains(@id,'UserGroupsLV_tb:Add-btnInnerEl')]"));
            hm.put("eleUser_SelectAccessGrp", By.xpath(".//*[@id='OrganizationGroupTreePopup:OrganizationGroupTreePopupScreen:OrganizationGroupTreePopup:OrganizationGroupTreePopupPicker-body']//span[contains(text(),'Commercial Lines Operations')]"));
            hm.put("eleUser_RemoveAccess", By.xpath(".//*[contains(@id,'UserGroupsLV_tb:Remove-btnInnerEl')]"));
            hm.put("eleUser_Accesstbl", By.xpath(".//*[contains(@id,'AccessDV:UserGroupsLV-body')]"));
            hm.put("eleManageUsererrmsg", By.xpath(".//*[contains(@class,'message')]"));
            hm.put("lstUser_Prefix", By.xpath(".//*[contains(@id,'Name:GlobalPersonNameInputSet:Prefix-inputEl')]"));
            hm.put("edtUser_PreferredFirstName", By.xpath(".//*[contains(@id,':Name:GlobalPersonNameInputSet:PreferredFirstName-inputEl')]"));
            hm.put("eleUser_OrgAddress", By.xpath(".//*[contains(@id,'UseOrganizationAddress_false-inputEl')]"));
            hm.put("edtUser_AddressLine1", By.xpath(".//*[contains(@id,'AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl')]"));
            hm.put("edtUser_City", By.xpath(".//*[contains(@id,'AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl')]"));
            hm.put("eleUser_City", By.xpath(".//*[contains(@id,'AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl')]"));
            hm.put("edtUser_County", By.xpath(".//*[contains(@id,'AddressInputSet:globalAddressContainer:GlobalAddressInputSet:County-inputEl')]"));
            hm.put("lstUser_Country", By.xpath(".//*[contains(@id,'AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl')]"));
            hm.put("edtUser_Country", By.xpath(".//*[contains(@id,'AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl')]"));
            hm.put("lstUser_State", By.xpath(".//*[contains(@id,'AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl')]"));
            hm.put("edtUser_State", By.xpath(".//*[contains(@id,'AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl')]"));
            hm.put("edtUser_Zipcode", By.xpath(".//*[contains(@id,'AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl')]"));
            hm.put("eleUser_Zipcode", By.xpath(".//*[contains(@id,'AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl')]"));
            hm.put("lstUser_AddressType", By.xpath(".//*[contains(@id,'UserDetailDV:AddressType-inputEl')]"));
            hm.put("edtUser_AddressType", By.xpath(".//*[contains(@id,'UserDetailDV:AddressType-inputEl')]"));
            hm.put("lstUser_PrimaryPhone", By.xpath(".//*[contains(@id,'UserDetailDV:PrimaryPhone-inputEl')]"));
            hm.put("edtUser_PrimaryPhone", By.xpath(".//*[contains(@id,'UserDetailDV:PrimaryPhone-inputEl')]"));
            hm.put("edtUser_WorkPhone", By.xpath(".//*[contains(@id,'WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl')]"));
            hm.put("edtUser_Fax", By.xpath(".//*[contains(@id,'Fax:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl')]"));
            hm.put("eleUser_Fax", By.xpath(".//*[contains(@id,'Fax:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl')]"));
            hm.put("edtUser_Email", By.xpath(".//*[contains(@id,'UserDetailDV:Email-inputEl')]"));
            hm.put("eleUser_Email", By.xpath(".//*[contains(@id,'UserDetailDV:Email-inputEl')]"));
            hm.put("eleUser_Active", By.xpath(".//*[contains(@id,'UserDetailCommons:UserDetailInputSet:Active_true-inputEl')]"));
            hm.put("eleUser_UserName", By.xpath(".//*[contains(@id,'UserDetailInputSet:Username-inputEl')]"));
            hm.put("eleUserSummary_Active", By.id("UserDetailPage:UserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:Active-inputEl"));
            hm.put("eleUserSummary_Prefix", By.id("UserDetailPage:UserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:Name:GlobalPersonNameInputSet:Prefix-inputEl"));
            hm.put("eleUserSummary_FirstName", By.id("UserDetailPage:UserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:Name:GlobalPersonNameInputSet:FirstName-inputEl"));
            hm.put("eleUserSummary_LastName",By.id("UserDetailPage:UserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:Name:GlobalPersonNameInputSet:LastName-inputEl"));
            hm.put("eleUserSummary_PreferredFirstName", By.id("UserDetailPage:UserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:Name:GlobalPersonNameInputSet:PreferredFirstName-inputEl"));
            hm.put("eleUserSummary_UserType", By.id("UserDetailPage:UserDetailScreen:UserDetailDV:UserType-inputEl"));
            hm.put("eleUserSummary_XactPay", By.id("UserDetailPage:UserDetailScreen:UserDetailDV:accesstype-inputEl"));
            hm.put("lstUser_XactPay", By.xpath(".//*[contains(@id,'UserDetailScreen:UserDetailDV:accesstype-inputEl')]"));
            hm.put("eleUserSummary_ExternalUser", By.id("UserDetailPage:UserDetailScreen:UserDetailDV:ExternalUser-inputEl"));
            hm.put("eleUser_ExternalFalse", By.xpath(".//*[contains(@id,'UserDetailScreen:UserDetailDV:ExternalUser_false-inputEl')]"));
            hm.put("eleUserSummary_Position", By.xpath(".//*[contains(@id,'UserDetailScreen:UserDetailDV:position_Ext-inputEl')]"));
            hm.put("edtUser_Position", By.xpath(".//*[contains(@id,'UserDetailScreen:UserDetailDV:position_Ext-inputEl')]"));
            hm.put("eleUserSummary_ProfessionalDesgn", By.id("UserDetailPage:UserDetailScreen:UserDetailDV:professionalDesignation_Ext-inputEl"));
            hm.put("edtUser_ProfessionalDesgn", By.xpath(".//*[contains(@id,'UserDetailScreen:UserDetailDV:professionalDesignation_Ext-inputEl')]"));
            hm.put("eleUser_NewSkillTrack",By.xpath(".//*[contains(@id,'UserDetailScreen:UserDetail_SkillTrackCardTab')]"));
            hm.put("eleUser_AddAttribute", By.xpath(".//*[contains(@id,'UserDetailScreen:UserAttributesLV_tb:Add-btnInnerEl')]"));
            hm.put("eleUser_AttributeTbl", By.id("UserAttributesPopup:UserAttributesPopupScreen:UserAttributesSearchLV-body"));
            hm.put("eleUser_AttributeTblSummary", By.id("UserDetailPage:UserDetailScreen:UserAttributesLV-body"));
            
            //Serach User
            hm.put("edtUserSearch_UserName",By.id("AdminUserSearchPage:UserSearchScreen:UserSearchDV:Username-inputEl"));
            hm.put("eleUserSearch_Search",By.id("AdminUserSearchPage:UserSearchScreen:UserSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
            hm.put("eleUserSearch_Reset",By.id("AdminUserSearchPage:UserSearchScreen:UserSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));
            hm.put("eleUserSearch_clkSearchResult",By.id("AdminUserSearchPage:UserSearchScreen:UserSearchResultsLV:0:DisplayName"));
            hm.put("eleUserSearch_DeleteUser",By.id("UserDetailPage:UserDetailScreen:UserDetailToolbarButtonSet:UserDetailToolbarButtons_DeleteUserButton-btnInnerEl"));
            hm.put("eleUserSearch_DeleteUserOk",By.xpath(".//span[contains(text(),'OK')]"));

			//Assignment Administration
			hm.put("eleUSERSecurity", By.id("TabBar:AdminTab:Admin_UsersAndSecurity-textEl"));
			hm.put("eleAssignmentAdministation", By.xpath(".//*[@id='Admin:MenuLinks:Admin_UsersAndSecurity:UsersAndSecurity_AssignmentAdmin_ExtPage']/div/span"));
			hm.put("eleAAAdd", By.xpath("//*[contains(@id,'AddClassCodeButton-btnInnerEl')]"));
			hm.put("eleAssignmentAdministrationTable", By.id("AssignmentAdmin_ExtPage:1-body"));
			hm.put("eleAAProducerCodeSearchIcon", By.xpath("//*[contains(@id,'ProducerCodeCell:SelectProducerCodeCell')]"));
			hm.put("edtAAAgencyName", By.xpath("//*[contains(@id,'ProducerCodeSearchDV:Description-inputEl')]"));
			hm.put("eleAAProducerCodeSearchButton", By.xpath("//*[contains(@id,'SearchLinksInputSet:Search')]"));
			hm.put("eleAAProducerCodeSelect", By.xpath("//*[contains(@id,'_Select')]"));
			hm.put("eleAAAssignedUserIcon", By.xpath("//*[contains(@id,'participantName_Ext:SelectparticipantName_Ext')]"));
			hm.put("edtAAUserName", By.xpath("//*[contains(@id,'Username-inputEl')]"));
			hm.put("eleAAUpdate", By.xpath("//*[contains(@id,'UpdateButton-btnInnerEl')]"));
			hm.put("eleAADelete", By.xpath("//*[contains(@id,'deleteButton_Ext-btnInnerEl')]"));
			hm.put("eleAAAssigneeRole", By.xpath("//*[contains(@id,'SelectAssignedUser')]"));
			hm.put("eleAAEditWarningAlert", By.xpath(".//*[@id='AssignmentAdmin_ExtPage:_msgs']/div"));
			hm.put("lstAssigneeRole", By.name("assigneeRole_Ext"));
			hm.put("lstAASegment", By.name("BusinessSegmentCell"));
			hm.put("lstEffectiveDate", By.name("EffectiveDateCell"));
			hm.put("eleAAEdit", By.xpath("//*[contains(@id,'EditButton-btnInnerEl')]"));
			hm.put("eleAAReset", By.xpath("//*[contains(@id,'SearchLinksInputSet:Reset')]"));
			hm.put("eleZeroResultsErrorMessage", By.xpath("//*[contains(@id,'AssignmentAdmin_ExtPage:_msgs')]"));
			hm.put("eleAABulkReassignment", By.xpath("//*[contains(@id,'BulkReassignButton-btnInnerEl')]"));
			hm.put("edtAANewAssignee", By.xpath("//*[contains(@id,'toUser-inputEl')]"));
			hm.put("eleAAAssign", By.xpath("//*[contains(@id,'AssignButton-btnInnerEl')]"));
			hm.put("eleAAProducerCode", By.xpath("//*[contains(@id,'SelectSelectedProducerCode')]"));
			hm.put("edtAAProducerCode", By.xpath("//*[contains(@id,'ParentCode-inputEl')]"));
			hm.put("eleSBACAdd", By.xpath("//*[contains(@id,'addNewSbac-btnInnerEl')]"));
			hm.put("eleSBACUWAssignment", By.xpath(".//*[@id='Admin:MenuLinks:Admin_UsersAndSecurity:UsersAndSecurity_SbacUWAssignment_Ext']/div/span"));
			hm.put("eleSBACUWAssignmentTable", By.id("SbacUWAssignment_Ext:2-body"));
			hm.put("eleSBACUpdate", By.xpath("//*[contains(@id,'updateButton-btnInnerEl')]"));
			hm.put("edtSBACUWAgentMail", By.name("AgentEmail"));
			hm.put("edtSBACUWAgentAgentFirstName", By.name("FirstName"));
			hm.put("edtSBACUWAgentAgentLastName", By.name("LastName"));
			hm.put("eleSBACEdit", By.xpath("//*[contains(@id,'editButton-btnInnerEl')]"));
			hm.put("eleCPIDParticipantAssignment", By.xpath(".//*[@id='Admin:MenuLinks:Admin_UsersAndSecurity:UsersAndSecurity_CPIDParticipant_Ext']/div/span"));
			hm.put("eleCPIDParticipantAssignmentTable", By.id("CPIDParticipant_Ext:2-body"));
			hm.put("eleCPIDUpdate", By.xpath("//*[contains(@id,'ToolbarButton-btnInnerEl')]"));
			hm.put("lstCPID", By.name("cpid"));
			hm.put("lstRO", By.name("regionalOfficeCode"));
			hm.put("lstCPIDAssigneeRole", By.name("assigneeRole"));
			hm.put("eleAACancel", By.xpath("//*[contains(@id,'Cancel-btnInnerEl')]"));
			hm.put("eleDuplicateExistErrorMsg", By.xpath("//*[contains(@id,'_Ext:_msgs')]"));
			hm.put("eleAADuplicateExistErrorMsg", By.id("AssignmentAdmin_ExtPage:_msgs"));
			hm.put("eleSBACDuplicateExistErrorMsg", By.id(""));
			hm.put("eleCPIDDuplicateExistErrorMsg", By.id(""));
			hm.put("lstSIC", By.name("SICCategory"));
			hm.put("lstRenewalReviewType", By.name("renewalReviewTypeInput_Ext"));
			hm.put("lstJobType", By.name("JobCell"));
			hm.put("eleAASelectUser", By.xpath("//*[contains(@id,'UserSearchResultsLV-body')]"));
			hm.put("eleSBACDelete", By.xpath("//*[contains(@id,'removeButton-btnInnerEl')]"));
			
			//Midterm Intake Process
			hm.put("eleUnattachedDocuments", By.xpath("//*[contains(@id,'UnattachedDocumentWorkItemsLV-body')]"));
			hm.put("eleDocumentDetailsSearchIcon", By.xpath("//*[contains(@id,'SelectPolicyNumber')]"));
			hm.put("edtPolicyNumberLastSix", By.xpath("//*[contains(@id,'otherPolicyNumber-inputEl')]"));
			
			//Maintainence Transaction
			hm.put("edtMT_TransactionPremium", By.id("PSMaintenanceTransactionDetails_ExtPopup:transactionPremium-inputEl"));
			hm.put("eleMaintainanceTransactionsDetailsAssert", By.id("PSMaintenanceTransactionDetails_ExtPopup:ttlBar"));
			hm.put("eleMaintainanceTransactionsAssert", By.id("HIGPolicyFile_MidTermTransactions:ttlBar"));
			hm.put("eleMaintainanceTransactions", By.xpath(".//*[@id='HIGPolicyFile:MenuLinks:HIGPolicyFile_HIGPolicyFile_MidTermTransactions']/div/span"));
			hm.put("lstMT_TransactionType", By.xpath("//*[contains(@id,'transactionType-inputEl')]"));
			hm.put("lsjMT_TransactionType", By.xpath("//*[contains(@id,'transactionType-inputEl')]"));
			hm.put("edtMT_DateRecevied", By.xpath("//*[contains(@id,'dateReceived-inputEl')]"));
			hm.put("edtMT_TransactionEffective", By.xpath("//*[contains(@id,'transEffectiveDate-inputEl')]"));
			hm.put("lstMT_SourceOfSubmission", By.xpath("//*[contains(@id,'ourceOfSubmission-inputEl')]"));
			hm.put("lstMT_Type", By.xpath("//*[contains(@id,'claRefundMethod-inputEl')]"));
			hm.put("lstMT_CancelReason", By.xpath("//*[contains(@id,'ancelReason-inputEl')]"));
			hm.put("eleMT_PaymentTab", By.xpath("//*[contains(@id,'AMPPaymentTab-btnIconEl')]"));
			hm.put("edtMT_TranPremAmount", By.xpath("//*[contains(@id,'AMPTransactionPremAmount-inputEl')]"));
			hm.put("edtMT_GrossCommission", By.xpath("//*[contains(@id,'GrossCommissionPercentage-inputEl')]"));
			hm.put("edtMT_RetailAgencyCommission", By.xpath("//*[contains(@id,'RetailAgentCommPercentage-inputEl')]"));
			hm.put("eleMT_TranPremAmount", By.xpath("//*[contains(@id,'AMPTransactionPremAmount-inputEl')]"));
			hm.put("eleMT_GrossCommission", By.xpath("//*[contains(@id,'GrossCommissionPercentage-inputEl')]"));
			hm.put("eleMT_RetailAgencyCommission", By.xpath("//*[contains(@id,'RetailAgentCommPercentage-inputEl')]"));
			hm.put("edtMT_GrossCommissionVerify", By.id("HIGPolicyFile_MidTermTransactions:MaintenanceTransactionLDV:PSMaintTxnAMPPaymentDV:GrossCommissionPercentage-bodyEl"));
			hm.put("edtMT_RetailAgencyCommissionVerify", By.id("HIGPolicyFile_MidTermTransactions:MaintenanceTransactionLDV:PSMaintTxnAMPPaymentDV:RetailAgentCommPercentage-inputEl")); 
			hm.put("txtMT_TransactionType", By.xpath("//*[contains(@id,':transactionDetailsDV:Type-inputEl')]"));
			hm.put("eleMT_TransactionType", By.xpath("//*[contains(@id,':transactionDetailsDV:Type-inputEl')]"));
			hm.put("eleMT_PaymentTab1", By.xpath("//*[contains(@id,'ampPaymentDetailTab-btnIconEl')]"));
			hm.put("eleMT_Table", By.id("HIGPolicyFile_MidTermTransactions:MaintenanceTransactionLDV:0"));
			hm.put("eleMT_DeleteVerify", By.xpath("//*[contains(@id,'HIGPolicyFile_MidTermTransactions:MaintenanceTransactionLDV:0:HIGTransactionType')]"));
			hm.put("edtMT_ChangeNarrative", By.xpath("//td//label[contains(.,'Change Narrative')]//ancestor::td[1]//following-sibling::td//textarea"));			
			hm.put("eleMTBearingEndorse", By.id("HIGPolicyFile_Summary:LastEndorsementEffectiveDate-bodyEl"));
			hm.put("eleMTTotalCost", By.id("HIGPolicyFile_Summary:PolicyPerCost-bodyEl"));
			hm.put("eleMT_Canceled", By.xpath("//*[@id='HIGPolicyFile:PSPolicyTerm_ExtInfoBar:HIGPolicyStatus-btnInnerEl']/span[contains(.,'Canceled')]"));
			hm.put("eleMT_BearingEndorsement", By.xpath("//td//label[contains(.,'Is this a Premium Bearing Endorsement')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("edtMT_EndorsementNumber", By.xpath("//td//label[contains(.,'Endorsement Number')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("edtMT_AnnualPremium", By.xpath("//td//label[contains(.,'Annual Premium')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("edtMT_NameofRequestor", By.xpath("//td//label[contains(.,'Name of Requestor')]//ancestor::td[1]//following-sibling::td//input"));
//			hm.put("edtMT_GrossCommission", By.xpath("//tr//td//label[contains(.,'Gross Commission %')]//ancestor::td[1]//following-sibling::td//input"));
//			hm.put("edtMT_RetailAgencyCommission", By.xpath("//tr//td//label[contains(.,'Retail Agency Commission %')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("eleMT_BearingEndorsement", By.xpath("//td//label[contains(.,'Is this a Premium Bearing Endorsement')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("elePolicyShellDoc_View", By.id("PolicyShell_Documents_Ext:PolicyShell_Documents_ExtScreen:DocumentsLV:0:DocumentsLV_ViewDoc")); 
			hm.put("elePC_PolicyShellDocuments", By.xpath(".//*[@id='HIGPolicyFile:MenuLinks-body']//span[contains(text(),'Policy Shell Documents')]")); 
			hm.put("eleMT_TransactionTab",By.id("PSMaintenanceTransactionDetails_ExtPopup:transactiondetailsTab-btnInnerEl"));
			hm.put("edtAuditExpDate", By.id("PSMaintenanceTransactionDetails_ExtPopup:auditExpDate-inputEl"));
			hm.put("eleCashBasisLabel", By.id("PSMaintenanceTransactionDetails_ExtPopup:cashBasis-inputEl"));
            hm.put("eleCashBasisCheckBox", By.id("PSMaintenanceTransactionDetails_ExtPopup:cashBasis-labelEl"));
			
			//Address Standardization
			hm.put("eleAccountLocAddNewLocation", By.id("AccountFile_Locations:AccountFile_LocationsScreen:AccountFile_LocationsLV_tb:AddNewLocation-btnInnerEl"));
			hm.put("eleNonSpecificLocationYES", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:NonSpecificLocation_true-inputEl"));
			hm.put("eleNonSpecificLocationNo", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:NonSpecificLocation_false-inputEl"));
			hm.put("edtLocationCode", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:LocationCode-inputEl"));
			hm.put("edtLocationName", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:LocationName-inputEl"));
			hm.put("lstLocationCountry", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl"));
			hm.put("edtLocationAddress1", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
			hm.put("lstLocationAddress1", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
			hm.put("lsjLocationAddress1", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
			hm.put("edtLocationCity", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
			hm.put("lsjLocationState", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("lstLocationState", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("eleLocationState", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("eleLocationZipCode", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("eljLocationZipCode", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("edjLocationZipCode", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("edtLocationZipCode", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("lsjLocationZipCode", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("edtLocationPhone", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:Phone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl"));
			hm.put("edtLocationNumberOfEmpls", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:EmployeeCount-inputEl"));
			hm.put("eleLocationNumberOfEmpls", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:EmployeeCount-inputEl"));
			hm.put("eleLocationUpdateBtn", By.cssSelector("a[id='AccountLocationPopup:LocationScreen:updateButton_Ext'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
			hm.put("eleLocationStandardizeBtn", By.id("AccountLocationPopup:LocationScreen:standardizeButton_Ext-btnInnerEl"));											   
			hm.put("eleLocationCancelBtn", By.id("AccountLocationPopup:LocationScreen:Cancel-btnInnerEl"));
			hm.put("eleReturntoAccountFileLocation", By.id("AccountLocationPopup:__crumb__"));
			hm.put("eleLocationInformationTitle", By.id("AccountLocationPopup:LocationScreen:ttlBar"));
			hm.put("eleLocationsQuickLaunch", By.xpath(".//span[contains(text(), 'Locations')]"));
			hm.put("eleAccountFileLocationTitle", By.id("AccountFile_Locations:AccountFile_LocationsScreen:ttlBar"));
			hm.put("eleLocationInfoMsg", By.id("AccountLocationPopup:LocationScreen:_msgs"));												
			hm.put("eleLocationOverrideBtn", By.id("AccountLocationPopup:LocationScreen:overrideButton_Ext-btnInnerEl"));
			
			//Account Location
            hm.put("eleLocation", By.xpath("//tr//td//div//span[contains(.,'Locations')]"));
            hm.put("eleAddNewLocation", By.xpath("//span//span[contains(.,'Add New Location')]"));
            hm.put("eleNonSpecificLocation", By.xpath("//label[contains(.,'Yes')]//preceding-sibling::input"));
            hm.put("edtLocationCode", By.xpath("//label[contains(.,'Location Code')]//ancestor::td[2]//following-sibling::td//input"));
            hm.put("edtLocationName", By.xpath("//label[contains(.,'Location Name')]//ancestor::td[2]//following-sibling::td//input"));
//            hm.put("edtLocationAddress1", By.xpath("//tr//td//label[contains(.,'Address 1')]//ancestor::td[1]//following-sibling::td//input"));
            hm.put("eleLocationCity", By.xpath("//label[contains(.,'City')]//ancestor::td[1]//following-sibling::td//input"));
            hm.put("lstLocationCity", By.xpath("//label[contains(.,'City')]//ancestor::td[1]//following-sibling::td//input"));
            hm.put("edtLocationCounty", By.xpath("//label[contains(.,'County')]//ancestor::td[1]//following-sibling::td//input"));
            hm.put("edtLocationState", By.xpath("//label[contains(.,'State')]//ancestor::td[1]//following-sibling::td//input"));
//            hm.put("edtLocationZipCode", By.xpath("//label[contains(.,'ZIP Code')]//ancestor::td[1]//following-sibling::td//input"));
            hm.put("eleUpdateLocation", By.xpath("//span//span[contains(.,'Update')]"));
            hm.put("eleLocationChangeActiveStatus", By.xpath("//span//span[contains(.,'Change Active Status')]"));
            hm.put("eleLocationSetAsPrimary", By.xpath("//span//span[contains(.,'Set As Primary')]"));
            hm.put("eleLcoationRemoveLocations", By.xpath("//span//span[contains(.,'Remove Locations')]"));
            hm.put("eleLocationTable", By.id("AccountFile_Locations:AccountFile_LocationsScreen:AccountFile_LocationsLV-body"));			
			
		    //Account Contacts related
			hm.put("edtAccountContactAddress1", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
			hm.put("lstAccountContactState", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("edtAccountContactZipCode", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("edtAccountContactFirstName", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
			hm.put("edtAccountContactLastName", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl"));
			hm.put("eleAccountContactCreateNewContact", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton-btnWrap"));
			hm.put("eleAccountContactAdditionalInterest", By.xpath(".//span[contains(text(), 'Additional Interest')]"));
			hm.put("eleAccountContactNewPerson", By.xpath(".//span[contains(text(), 'New Person')]"));
			hm.put("eleContactsQuickLaunch", By.xpath(".//span[contains(text(), 'Contacts')]"));
			
			//User generated Docs for shell Policies
			hm.put("eleDocumentsAssert", By.id("AccountFile_Documents:DocumentsScreen:ttlBar"));
			hm.put("eleShellDocumentsAssert", By.id("PolicyShell_Documents_Ext:PolicyShell_Documents_ExtScreen:ttlBar"));
//			hm.put("eleDocumentTemplateSearchImg", By.id("AccountNewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:NewTemplateDocumentDV:TemplatePicker:SelectTemplatePicker"));
			hm.put("eleDocumentTemplateSearchImg", By.xpath(".//div[contains(@id, 'SelectTemplatePicker')]"));
			hm.put("lsjDocumentType", By.id("DocumentTemplateSearchPopup:DocumentTemplateSearchScreen:DocumentTemplateSearchDV:DocumentType-inputEl"));
			hm.put("lstDocumentState", By.id("DocumentTemplateSearchPopup:DocumentTemplateSearchScreen:DocumentTemplateSearchDV:State-inputEl"));
			hm.put("edtDocumentKeyWord", By.id("DocumentTemplateSearchPopup:DocumentTemplateSearchScreen:DocumentTemplateSearchDV:Keywords-inputEl"));
			hm.put("eleDocumentSearchBtn", By.id("DocumentTemplateSearchPopup:DocumentTemplateSearchScreen:DocumentTemplateSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleDocumentSearchResult", By.id("DocumentTemplateSearchPopup:DocumentTemplateSearchScreen:DocumentTemplateSearchResultsLV-body"));
//			hm.put("eleCreateNewdocFromTempLnk", By.id("AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewDocument:AccountNewDocumentMenuItemSet:AccountNewDocumentMenuItemSet_Template-textEl"));
//			hm.put("eleNewDocumentLnk", By.id("AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewDocument-textEl"));
//			hm.put("eleGenerateDocumentBtn", By.id("AccountNewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:NewTemplateDocumentDV:CreateDocumentBundle-btnInnerEl"));
			hm.put("lsjUGD_DeliveryType", By.xpath("//tr//td//label[contains(.,'Delivery Type')]//ancestor::td[1]//following-sibling::td//input"));
//			hm.put("edtUGD_Name", By.xpath("//tr//td//label[contains(.,'Name')]//ancestor::td[1]//following-sibling::td//input"));
//			hm.put("lstUGD_Name", By.xpath("//tr//td//label[contains(.,'Name')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("edtUGD_Email", By.xpath("//tr//td//label[contains(.,'Email')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("edtUGD_Fax", By.xpath("//tr//td//label[contains(.,'Fax')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("lsjUGDCC_DeliveryType", By.xpath("//tr//td//label[contains(.,'CC Recipient')]//ancestor::tr[1]//following-sibling::tr//td//label[contains(.,'Delivery Type')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("edtUGDCC_Email", By.xpath("//tr//td//label[contains(.,'CC Recipient')]//ancestor::tr[1]//following-sibling::tr//td//label[contains(.,'Email')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("edtUGDCC_Fax", By.xpath("//tr//td//label[contains(.,'CC Recipient')]//ancestor::tr[1]//following-sibling::tr//td//label[contains(.,'Fax')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("eleAttachTemplate", By.id("AccountNewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:NewTemplateDocumentDV:NewDocumentAttachTemplate_ExtInputSet:AttachedTemplatesLV_tb:AttachTemplate"));
			hm.put("eleTempTable", By.id("AccountNewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:NewTemplateDocumentDV:NewDocumentAttachTemplate_ExtInputSet:AttachedTemplatesLV-body"));			
//			hm.put("eleUGDSaveAsDraft", By.id("AccountNewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:SaveAsDraftButton"));
			hm.put("eljUGDFinalise", By.id("AccountNewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:FinalizeButton-btnInnerEl"));
			hm.put("eleUGDDocumentsTab", By.xpath("//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Documents']//div//span[contains(.,'Documents')]"));
			hm.put("eleDocumentFinalizeTable", By.id("AccountFile_Documents:DocumentsScreen:DocumentsLV-body"));			
			hm.put("eleSaveToFileBtn", By.cssSelector("a[id='AccountNewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:SaveToFileButton'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));									
			hm.put("eleLinkExistingDoc", By.id("AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewDocument:AccountNewDocumentMenuItemSet:AccountNewDocumentMenuItemSet_Linked-textEl"));
			hm.put("eleBrowseToUploadBtn", By.name("fileContent"));
			hm.put("eleUGDDocType", By.id("DocumentDetailsPopup:DocumentDetailsScreen:DocumentDetailsDV:DocumentMetadataInputSet:MimeType-inputEl"));
			hm.put("eleUGDDocArchivalStatus", By.id("DocumentDetailsPopup:DocumentDetailsScreen:DocumentDetailsDV:DocumentMetadataInputSet:ArchivalStatus_Ext-inputEl"));
			hm.put("eleUGDSaveAsDraft", By.cssSelector("a[id='AccountNewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:SaveAsDraftButton'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
            hm.put("eleCreateNewdocFromTempLnk", By.xpath(".//span[contains(@id, 'MenuItemSet_Template-textEl')]"));
            hm.put("eleNewDocumentLnk", By.xpath(".//span[contains(@id, 'MenuActions_NewDocument-textEl')]"));
            hm.put("eleGenerateDocumentBtn", By.xpath(".//*[contains(@id, 'CreateDocumentBundle-btnInnerEl')]"));
            hm.put("eljGenerateDocumentBtn", By.xpath(".//*[contains(@id, 'CreateDocumentBundle-btnInnerEl')]"));
            hm.put("edtUGD_Name", By.xpath(".//input[contains(@id, 'TORecipientName_Ext-inputEl')]"));
            hm.put("lsjUGD_Name", By.xpath(".//input[contains(@id, 'TORecipientNames_Ext-inputEl')]"));
//          hm.put("eleShellDocumentTable", By.id("PolicyShell_Documents_Ext:PolicyShell_Documents_ExtScreen:DocumentsLV-body"));
            hm.put("eleDocumentTable", By.xpath(".//div[contains(@id, 'DocumentsLV-body')]"));
            
            hm.put("eleNewDocumentLink", By.xpath(".//span[contains(@id, 'Documents_NewDocumentButton-btnInnerEl')]"));
            hm.put("eleTemplateLnk", By.xpath(".//span[contains(@id, 'PolicyFile_Documents_NewDocumentButton:NewJobDocumentMenuItemSet:PolicyPeriodNewDocumentMenuItemSet_Template-textEl')]"));
                   
			// Account Manage
			hm.put("eljAMCustVerificationBtn", By.id("AccountFile_Summary:AccountFile_SummaryScreen:custVerifiedButton_Ext"));
			hm.put("eleAMCustVerificationBtn", By.id("AccountFile_Summary:AccountFile_SummaryScreen:custVerifiedButton_Ext"));
			hm.put("eleAMDateCustVerified", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:accountStatus_Ext-inputEl"));
			hm.put("eleAMProducerCode", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountPCsLV-body"));
			
			//Account UW Files
			hm.put("eleUWFilesQuickLaunch", By.xpath(".//span[contains(text(), 'Underwriting Files')]"));
			hm.put("lstUWFilesFilterOptions", By.id("UnderwritingFiles:RenewalManagerScreen:RenewalManagerLV:jobGroupTypeFilter-inputEl"));
			hm.put("eleUWFilesSearchResults", By.id("UnderwritingFiles:RenewalManagerScreen:RenewalManagerLV-body"));
			hm.put("elePolicyAccountNumber", By.id("PolicyFile:PolicyFileMenuInfoBar:AccountNumber-btnEl"));
			hm.put("eleUWFile", By.id("UnderwritingFiles:RenewalManagerScreen:RenewalManagerLV:0:GroupName"));
			hm.put("eleUWActivityTab", By.id("MixedSubRenGroup_ExtDetail:activitiesTab-btnIconEl"));
			hm.put("eleUWActivityTable", By.id("MixedSubRenGroup_ExtDetail:DesktopActivitiesLV-body"));
			
			//Rewrite Term
			hm.put("eleRewriteNewTerm", By.xpath(".//span[contains(@id,'RewriteNewTerm-textEl')]"));
            hm.put("eleRewriteWarning", By.id("//span[contains(text(), 'Policy is being Rewritten')]"));
            hm.put("eleRewritePolicyNumberfLD", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:PolicyNumberInputSet:PolicyNumberComplete-inputEl"));
            hm.put("eleRewritePolicy#", By.xpath("//*[@id='HIGPolicyFile:PSPolicyTerm_ExtInfoBar:HIGPSPolicy']//span//span//span"));
            
			//CLA Customer Completion Letter
            hm.put("elePC_CustomerCompletionletter", By.xpath(".//*[@id='HIGPolicyFile:MenuLinks:HIGPolicyFile_HIGPolicyFile_CustomerCompletionLetter']//span[contains(text(),'Customer Completion Letter')]"));
            hm.put("elePC_SaveDraft", By.id("HIGPolicyFile_CustomerCompletionLetter:PSCustomerCompletionLetterScreen:saveButton-btnInnerEl"));
            hm.put("elePCVerifyErrorMessages", By.xpath(".//*[@class='message']"));
            hm.put("lstPC_TransactionType", By.id("HIGPolicyFile_CustomerCompletionLetter:PSCustomerCompletionLetterScreen:transType-inputEl"));
            hm.put("eleCustomerCompltrYes", By.id("HIGPolicyFile_CustomerCompletionLetter:PSCustomerCompletionLetterScreen:PSCustCompLetterTransInputSet:CCLetterIndicator_true-inputEl"));
            hm.put("eleCustomerCompltrNo", By.id("HIGPolicyFile_CustomerCompletionLetter:PSCustomerCompletionLetterScreen:PSCustCompLetterTransInputSet:CCLetterIndicator_false-inputEl"));
            hm.put("lstPC_DeliveryMethod", By.id("HIGPolicyFile_CustomerCompletionLetter:PSCustomerCompletionLetterScreen:PSCustCompLetterTransInputSet:deliveryMethod-inputEl"));
            hm.put("elePC_DeliveryMethod", By.id("HIGPolicyFile_CustomerCompletionLetter:PSCustomerCompletionLetterScreen:PSCustCompLetterTransInputSet:deliveryMethod-inputEl"));
            hm.put("elePC_AttachDocuments", By.id("HIGPolicyFile_CustomerCompletionLetter:PSCustomerCompletionLetterScreen:PSCustCompLetterTransInputSet:CompletionLetterAttachDocs_ExtInputSet:AttachedTemplatesLV_tb:AttachDocuments-btnInnerEl"));
            hm.put("elePC_Submit", By.id("HIGPolicyFile_CustomerCompletionLetter:PSCustomerCompletionLetterScreen:submitLetter-btnInnerEl"));
            hm.put("elePC_CustomerCompletionltr", By.id("HIGPolicyFile_CustomerCompletionLetter:PSCustomerCompletionLetterScreen:ttlBar"));
            hm.put("elePolicyTransactionType", By.id("HIGPolicyFile_MidTermTransactions:MaintenanceTransactionLDV:transactionDetailsDV:Type-inputEl"));
            
            //AMPBilling
			hm.put("eleCLAAMPBindOptions", By.xpath("//span[contains(.,'Issue Policy')]"));
			hm.put("lstNewSubmission", By.xpath("//div//a//span[contains(.,'New Submission')]"));
			hm.put("eleBillingCompany", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:PSAMPPoliciesOnlyInputSet:AMPBillingCompany:SelectAMPBillingCompany"));
			hm.put("sclBillingCompany", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:PSAMPPoliciesOnlyInputSet:AMPBillingCompany:SelectAMPBillingCompany"));
			hm.put("eleBillingCompanySearch", By.id("PS_AMPSearchBillingCompanyPopup:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleBillingCompanySelect", By.xpath("//*[@id='PS_AMPSearchBillingCompanyPopup:AMPBillingCompanyResultsLV-body']//table//tbody//tr[1]//td[1]//div//a[contains(.,'Select')]"));
			hm.put("lstAMPBillingMethod", By.xpath("//tr//td//label[contains(.,'Billing Method')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("lsjAMPBillingMethod", By.xpath("//tr//td//label[contains(.,'Billing Method')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("lstAMPBillingNumber", By.xpath("//tr//td//label[contains(.,'Billing Number')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("lsjAMPBillingNumber", By.xpath("//tr//td//label[contains(.,'Billing Number')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("edtAMPBillingNumber", By.id("HIGPolicyFile_Payment_Ext:psBillingAdjustment:PSBillingAdjustment_ExtDV:enterBillingNumber-inputEl"));
//			hm.put("lstAMPInstallmentPlan", By.xpath("//tr//td//label[contains(.,'Installment Plan')]//ancestor::td[1]//following-sibling::td//input"));			
			hm.put("edtPolicyFee", By.xpath("//tr//td//label[contains(.,'Policy Fee')]//ancestor::td[1]//following-sibling::td//input"));
//			hm.put("edtFilingFee", By.xpath("//tr//td//label[contains(.,'Filing Fee')]//ancestor::td[1]//following-sibling::td//input"));
//			hm.put("edtInspectionFee", By.xpath("//tr//td//label[contains(.,'Inspection Fee')]//ancestor::td[1]//following-sibling::td//input"));
//			hm.put("edtStampingFee", By.xpath("//tr//td//label[contains(.,'Stamping Fee')]//ancestor::td[1]//following-sibling::td//input"));
//			hm.put("edtPolicyTax", By.xpath("//tr//td//label[contains(.,'Policy Tax')]//ancestor::td[1]//following-sibling::td//input"));
//			hm.put("edtAmpFee", By.xpath("//tr//td//label[contains(.,'AMP Fee')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("edtWCAssessment", By.xpath("//tr//td//label[contains(.,'WC Assessment')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("edtWCExpenseConstant", By.xpath("//tr//td//label[contains(.,'WC Expense Constant')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("edtTotalPremium", By.xpath("//tr//td//label[contains(.,'Total Premium')]//ancestor::td[1]//following-sibling::td//input"));
			//hm.put("eleTotalPremium", By.xpath("//tr//td//label[contains(.,'Total Premium')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("eleMailToProducer", By.xpath("//tr//td//label[contains(.,'Mail to Producer')]//ancestor::td[1]//following-sibling::td//tr//td[2]//label[contains(.,'Yes')]//preceding-sibling::input"));
			hm.put("eleTotalPremium", By.id("SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl"));

			hm.put("edtGrossCommission", By.xpath("//tr//td//label[contains(.,'Gross Commission %')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("edtRetailAgencyCommission", By.xpath("//tr//td//label[contains(.,'Retail Agency Commission %')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("elePolicyInfoTab", By.xpath("//*[@id='HIGPolicyFile:HIGPolicyFileAcceleratedMenuActions:HIGJobAcceleratedMenuItemSet:PSPolicyMenuItemSet_PolicyInfo']//span[contains(.,'Policy Info')]"));
			hm.put("eleMaintenenceTab", By.xpath("//*[@id='HIGPolicyFile:MenuLinks:HIGPolicyFile_HIGPolicyFile_MidTermTransactions']/div/span[contains(.,'Maintenance Transactions')]"));
			hm.put("lstTransactionType", By.xpath("//label[contains(.,'Transaction Type')]//ancestor::td[1]//following-sibling::td//td[1]//input"));
			hm.put("lstSourceofSubmission", By.xpath("//label[contains(.,'Source of Submission')]//ancestor::td[1]//following-sibling::td//td[1]//input"));
			hm.put("edtTotalAuditedCost", By.xpath("//label[contains(.,'Total Audited Cost')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("edtAuditEffectDate", By.xpath("//label[contains(.,'Audit Effective Date')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("edtAuditExpireDate", By.xpath("//label[contains(.,'Audit Expiration Date')]//ancestor::td[1]//following-sibling::td//input"));
			hm.put("eleMTGrossCommission", By.xpath("//*[@id='HIGPolicyFile_Summary:PSAMPPoliciesOnlyInputSet:GrossCommissionPercentage-bodyEl']"));
			hm.put("eleMTRetailAgencyCommission", By.xpath("//*[@id='HIGPolicyFile_Summary:PSAMPPoliciesOnlyInputSet:RetailAgentCommPercentage-bodyEl']"));
			hm.put("lstAMPInstallmentPlan", By.xpath("//*[contains(@id,'psBillingInstallmentPlan-inputEl')]"));
			hm.put("edtFilingFee", By.xpath("//*[contains(@id,'FillingFee-inputEl')]"));
			hm.put("edtInspectionFee", By.xpath("//*[contains(@id,'InspectionFee-inputEl')]"));
			hm.put("edtStampingFee", By.xpath("//*[contains(@id,'StampingFee-inputEl')]"));
			hm.put("edtPolicyTax", By.xpath("//*[contains(@id,'PolicyTax-inputEl')]"));
			hm.put("edtAmpFee", By.xpath("//*[contains(@id,'AMPFee-inputEl')]"));
			hm.put("edtTransPremiumAmt", By.xpath("//*[contains(@id,'AMPTransactionPremAmount-inputEl')]"));
			
			//Guided Workflow
			hm.put("eleGuidedWorkFlowTab", By.xpath(".//*[contains(@id, 'guidedWorkflowsTab-btnInnerEl')]"));
			hm.put("eleGuidedWorkflow", By.xpath(".//*[contains(@id, 'PSJob_Step_ExtScreen:ttlBar')]"));
			hm.put("eleCancelPolicy", By.xpath(".//*[contains(@id, 'CancellationID-textEl')]"));
			hm.put("lstGWSource", By.xpath(".//*[contains(@id, 'Source-inputEl')]"));
			hm.put("lstGWSourceofSubmission", By.xpath(".//*[contains(@id, 'SourceofSubmission-inputEl')]"));
			hm.put("edtGWDateReceived", By.xpath(".//*[contains(@id, 'DateReceived_date-inputEl')]"));
			hm.put("lstGWReason", By.xpath(".//*[contains(@id, 'ReasonCode-inputEl')]"));
			hm.put("lstGWAuditPeriod", By.xpath(".//*[contains(@id, 'AuditPeriod-inputEl')]"));
			hm.put("lstGWRefundMethod", By.xpath(".//*[contains(@id, 'RefundMethod-inputEl')]"));
			hm.put("eleGWAccepatbleEvidence", By.xpath(".//*[contains(@id, 'IsAcceptableEvidence_true-inputEl')]"));
			hm.put("eleGWCancellationQuestions", By.xpath(".//*[contains(@id, 'QuestionSetLV-body')]"));
			hm.put("lstGWEvidenceType", By.xpath(".//*[contains(@id, 'EvidenceType-inputEl')]"));
			hm.put("edtNameOfRequestor", By.xpath(".//*[contains(@id, 'NameofRequestor-inputEl')]"));
			hm.put("eleGWCLASummary", By.xpath(".//*[@id='PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:ttlBar']"));
			hm.put("eleGWOPERINIT", By.xpath(".//*[contains(@id, 'OperInIt-inputEl')]"));
			hm.put("edtGWOPERINIT", By.xpath(".//*[contains(@id, 'OperInIt-inputEl')]"));
			hm.put("eleGWCancelSummary", By.xpath(".//*[contains(@id, 'PSJob_ExtWizard:PSJob_Summary_ExtScreen:0')]"));
			hm.put("eleGWShortRateWarning", By.xpath(".//*[contains(@id, 'shortRatePenaltyVerbatim')]"));
			hm.put("eleGWCloseOptions", By.xpath(".//*[contains(@id, 'CloseOptions-btnWrap')]"));
			hm.put("eleGWWithDrawTransaction", By.xpath(".//*[contains(@id, 'WithdrawJob-textEl')]"));
			hm.put("eleGWWarning1", By.xpath(".//*[@id='PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:_msgs']/div[2]"));
			hm.put("eleGWWarning2", By.xpath(".//*[@id='PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:_msgs']/div[3]"));
			hm.put("eleGWWarning3", By.xpath(".//*[@id='PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:_msgs']/div[4]"));
			hm.put("eleGWRewrite", By.xpath(".//*[contains(@id, 'Rewrite-inputEl')]"));
			hm.put("edtGWCancellationEffectiveDate", By.xpath(".//*[contains(@id, 'CancelEffDate_date-inputEl')]"));
			hm.put("eleGWAccepatbleEvidenceNo", By.xpath(".//*[contains(@id, 'IsAcceptableEvidence_false-inputEl')]"));
		
			//hm.put("eleGWWarningMessages", By.xpath(".//*[@id='PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:_msgs']/div"));
			hm.put("eleGWWarningMessages", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:_msgs"));
			hm.put("eleGuidedWorkFlowTable", By.id("HIGPolicyFile_MidTermTransactions:guidedWorkflowsTab:panelId"));
			hm.put("eleGuidedWorkFlowInfoBar", By.id("PSJob_ExtWizard:PSJob_ExtInfoBar:jobType-btnInnerEl"));
			
			//Test Data
            hm.put("lstPI_TermType", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:TermType-inputEl"));
            hm.put("eleLOBtbl", By.id("PSPolicyTerm_Ext_Info:LineOfBusinessLV-body"));
            hm.put("lstLOSval", By.name("LevelofSupport"));
            hm.put("lstLOBval", By.name("LineofBusiness"));
            hm.put("eleCLAPIAdd", By.id("PSPolicyTerm_Ext_Info:LineOfBusinessLV_tb:Add-btnInnerEl"));
            hm.put("edtAcc_ProducerCode", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:Code-inputEl"));
            hm.put("edtPI_ExpirationDate", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:HIGExpirationDateID-inputEl"));
            hm.put("eleExposureStateColumn", By.xpath(".//a[contains(text(), '<none>')]"));
            hm.put("dblExposureState", By.xpath("//li[contains(text(),'Connecticut')]"));
            hm.put("eleExposureStateArrow", By.id("button-1491-btnIconEl"));
            hm.put("eleCommonSave", By.xpath(".//span[contains(text(), 'Save')]"));
            hm.put("edtSelectProducer", By.id("QPB_ExtWizard:qpbWizardStepGroup:QPBWizardStepSet:MMQPBWizardStepSet:QPBContactInformation_ExtScreen:producerName-inputEl"));
            hm.put("eleSelectAcc", By.id("HIGPolicyFile:PSPolicyTerm_ExtInfoBar:HIGAccountNumber-btnInnerEl"));
            hm.put("eleinlandMarine", By.id("QPB_ExtWizard:qpbWizardStepGroup:QPBWizardStepSet:MMQPBWizardStepSet:QPBLOBDetail_ExtScreen:ttlBar"));
		
			//Policy Shell Participants
			hm.put("eleParticipants", By.xpath("//*[@id='HIGPolicyFile:MenuLinks:HIGPolicyFile_HIGPolicyFile_Roles']/div"));
			hm.put("eleEdit", By.id("HIGPolicyFile_Roles:PSJob_RoleScreen:PSJobParticipants_ExtCV:PSJobParticipants_ExtPanelSet:TransactionRolesLV_tb:Edit-btnInnerEl"));
			hm.put("eleUpdParticipantsate", By.id("HIGPolicyFile_Roles:PSJob_RoleScreen:PSJobParticipants_ExtCV:PSJobParticipants_ExtPanelSet:TransactionRolesLV_tb:Update-btnInnerEl"));
//			hm.put("eleAdd", By.id("HIGPolicyFile_Roles:PSJob_RoleScreen:PSJobParticipants_ExtCV:PSJobParticipants_ExtPanelSet:TransactionRolesLV_tb:Add-btnInnerEl"));
			 hm.put("eleAdd", By.xpath(".//*[contains(@id, 'Add-btnInnerEl')]"));
			hm.put("tblParticipants", By.id("HIGPolicyFile_Roles:PSJob_RoleScreen:PSJobParticipants_ExtCV:PSJobParticipants_ExtPanelSet:TransactionRolesLV-body"));
			hm.put("eleSelectUser", By.id("HIGPolicyFile_Roles:PSJob_RoleScreen:PSJobParticipants_ExtCV:PSJobParticipants_ExtPanelSet:TransactionRolesLV:1:AssignedUser:UserBrowseMenuItem"));
			hm.put("edtEnterUserID", By.id("UserSearchPopup:UserSearchPopupScreen:UserSearchDV:Username-inputEl"));
			hm.put("eleSearchPartUser", By.id("UserSearchPopup:UserSearchPopupScreen:UserSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleSearchPartUserSelect", By.id("UserSearchPopup:UserSearchPopupScreen:UserSearchResultsLV:0:_Select"));
			hm.put("lstAssignmentRole", By.name("AssignmentRole"));
			hm.put("lstAssignedGroup", By.name("AssignedGroup"));
			hm.put("eleParticipentsErrorMessages", By.xpath(".//*[@id='HIGPolicyFile_Roles:PSJob_RoleScreen:_msgs']/div"));
			hm.put("eleParticipentsTitle", By.id("HIGPolicyFile_Roles:PSJob_RoleScreen:ttlBar"));
			hm.put("eleParticipentsRemove", By.id("HIGPolicyFile_Roles:PSJob_RoleScreen:PSJobParticipants_ExtCV:PSJobParticipants_ExtPanelSet:TransactionRolesLV_tb:Remove-btnInnerEl"));
		
			//Producer Code
			hm.put("eleAdministrationMenu", By.id("TabBar:AdminTab-btnInnerEl"));
			hm.put("edtAdminPCAgencyName", By.id("AdminProducerCodeSearch:AdminProducerCodeSearchScreen:ProducerCodeSearchDV:Description-inputEl"));
			hm.put("eleAdminPCSearch", By.id("AdminProducerCodeSearch:AdminProducerCodeSearchScreen:ProducerCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eleAdminPCSearchResults", By.id("AdminProducerCodeSearch:AdminProducerCodeSearchScreen:AdminProducerCodeSearchLV:0:Code"));
			hm.put("eleAdminPCReset", By.id("AdminProducerCodeSearch:AdminProducerCodeSearchScreen:ProducerCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));
			hm.put("edtAdminPCMasterPC", By.id("AdminProducerCodeSearch:AdminProducerCodeSearchScreen:ProducerCodeSearchDV:ParentCode-inputEl"));
			hm.put("edtAdminPCProducerCode", By.id("AdminProducerCodeSearch:AdminProducerCodeSearchScreen:ProducerCodeSearchDV:Code-inputEl"));
			hm.put("edtAdminPCLocationPhone", By.id("AdminProducerCodeSearch:AdminProducerCodeSearchScreen:ProducerCodeSearchDV:locationPhone_Ext-inputEl"));
			hm.put("eleAdminPCErrorMessage", By.id("AdminProducerCodeSearch:AdminProducerCodeSearchScreen:_msgs"));
			hm.put("edtAdminPCZipCode", By.id("AdminProducerCodeSearch:AdminProducerCodeSearchScreen:ProducerCodeSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("edtAccProducerCode", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:ProducerCode_Ext-inputEl"));
			hm.put("eleAccProducerName", By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:AgencyName_Ext-inputEl"));
			hm.put("edtMasterProducerCode", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:ParentCode-inputEl"));
			hm.put("edtProducerCode", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:Code-inputEl"));
			hm.put("edtPCAgencyName", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:Description-inputEl"));
			hm.put("elePCSearch", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("eljPCSearch", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
			hm.put("elePCSelectSearchResults", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchLV:0:_Select"));
			hm.put("elePCReset", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));
			hm.put("eljPCReset", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));
			hm.put("elePCSearchResultsTable", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchLV-body"));
			hm.put("elePolicyInfoErrorMessage", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:_msgs"));
			hm.put("elePolicyInfoPage", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:ttlBar"));
			hm.put("eleAdminPCPaging", By.id("AdminProducerCodeSearch:AdminProducerCodeSearchScreen:AdminProducerCodeSearchLV:_ListPaging"));
			hm.put("eleAdminProducerCodePage", By.id("AdminProducerCodeSearch:AdminProducerCodeSearchScreen:ttlBar"));
			hm.put("elePolicyInfonPCSearch", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:ProducerCode_Ext:SelectProducerCode_Ext"));
			hm.put("elePolicyInfonPCShellPCSearch", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:ProducerSelectionInputSet:ProducerCode_Ext:SelectProducerCode_Ext"));
			hm.put("elePCShellPolicyInfoErrorMessage", By.id("WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs"));
			
			/*//Additional Insured Extension
			hm.put("eleAddInsAddDBA", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV_tb:AddContactsButton-btnInnerEl"));
			hm.put("eleAddInsNewCompany", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV_tb:AddContactsButton:0:ContactType-textEl"));
			hm.put("eleAddInsRemoveDBA", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:ContactDBALV_tb:removeDBAContact-btnInnerEl"));
			hm.put("eleAddInsNewNamedInsuredPage", By.id("NewAdditionalNamedInsuredPopup:ContactDetailScreen:ttlBar"));
			hm.put("edtAddInsCompanyName", By.id("NewAdditionalNamedInsuredPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("eleAddInsSameAddAs", By.id("NewAdditionalNamedInsuredPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon"));
			hm.put("eleAddInsSameAddAsType", By.id("NewAdditionalNamedInsuredPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail-textEl"));
			hm.put("eleAddInsSameAddAsAddress", By.id("NewAdditionalNamedInsuredPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress-textEl"));
			hm.put("eleAddInsOK", By.id("NewAdditionalNamedInsuredPopup:ContactDetailScreen:updateButton_Ext-btnInnerEl"));
			hm.put("eleAddInsDBAAddedTable", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV-body"));
			hm.put("eleAddInsSelDBA", By.xpath(".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV-body']/div/table/tbody/tr/td/div"));
			hm.put("eleAddInsDBARemove", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV_tb:Remove-btnInnerEl"));
			hm.put("elePriNamedInsSelDBASetPrimary", By.xpath(".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:listOfDBAs:PolicyDBAsDV:NamedInsuredInputSet:DBAListLV-body']/div/table/tbody/tr/td/div"));
			hm.put("elePriNamedInsDBASetPrimary", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:listOfDBAs:PolicyDBAsDV:NamedInsuredInputSet:DBAListLV_tb:setToPrimary-btnInnerEl"));
			hm.put("eleAccDBAs", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:DBACardTab-btnInnerEl"));
			hm.put("eleAccAddDBA", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:ContactDBALV_tb:addContactButton-btnInnerEl"));
			hm.put("eleAccDBANewCompany", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:ContactDBALV_tb:addContactButton:0:0:contactType-textEl"));
			hm.put("edtAccDBAName", By.id("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("eleAccNewDBARoleTab", By.id("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:RolesCardTab-btnInnerEl"));
			hm.put("eleAccNewAddDBARole", By.id("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:ContactRolesDV:ContactRolesLV_tb:AddRoleButton-btnInnerEl"));
			hm.put("eleAccNewAddDBARoleNamedInsured", By.id("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:ContactRolesDV:ContactRolesLV_tb:AddRoleButton:13:RoleType-itemEl"));
			hm.put("eleAccNewAddDBARoleTable", By.id("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:ContactRolesDV:ContactRolesLV-body"));
			hm.put("eleAccNewAddDBARoleRemove", By.id("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:ContactRolesDV:ContactRolesLV_tb:Remove-btnInnerEl"));
			hm.put("eleAccDBAUpdate", By.id("NewDBAContactPopup:ContactDetailScreen:Update-btnInnerEl"));
			hm.put("eleAccAddDBATable", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:ContactDBALV-body"));
			hm.put("eleAccRemoveDBA", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:ContactDBALV_tb:removeDBAContact-btnInnerEl"));
//			hm.put("eleAccountNumber", By.id("SubmissionWizard:JobWizardInfoBar:AccountNumber-btnInnerEl"));
			hm.put("eleAccountNumber", By.xpath("//*[contains(@id, 'AccountNumber-btnInnerEl')]"));
			hm.put("eleAccCreateNewContact", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton-btnInnerEl"));
			hm.put("eleAccNamedInsured", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:12:roleType-textEl"));
			hm.put("eleAccNamedInsNewCompany", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:12:roleType:0:contactType-textEl"));
			hm.put("edtAccNamedInsNewCompanyName", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("eleAccNamedInsameAddAs", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon"));
			hm.put("eleAccNamedInsSameAddAsType", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail-textEl"));
			hm.put("eleAccNamedInsSameAddAsAddress", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress-textEl"));
			hm.put("eleAccNamedInsUpdate", By.id("NewAccountContactPopup:ContactDetailScreen:updateButton_Ext-btnInnerEl"));
			hm.put("eleAccNamedInsTable", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV-body"));
			hm.put("eleAccNamedInsDBATab", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:DBACardTab-btnInnerEl"));
			hm.put("eleAccNamedInsAddDBA", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactDBALV_tb:addContactButton-btnInnerEl"));
			hm.put("eleAccNewNamedInsNewCompany", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactDBALV_tb:addContactButton:0:0:contactType-textEl"));
			hm.put("eleAccNamedInsDBATable", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactDBALV-body"));
			hm.put("eleAccNamedInsDBARemove", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactDBALV_tb:removeDBAContact-btnInnerEl"));
			hm.put("edtAccNamedInsNewDBAName", By.id("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("eleAccNamedInsNewDBAOK", By.id("NewDBAContactPopup:ContactDetailScreen:Update-btnInnerEl"));*/
			
			//AccountSummary
            hm.put("elePol", By.id("AccountFile_Summary:AccountFile_SummaryScreen:PSPolicyTermInfo_ExtLV:0:higpolicy"));
            
            //PolicySummary
            hm.put("elePolicyInfo", By.id("PolicyFile:PolicyFileAcceleratedMenuActions:PolicyMenuItemSet:PolicyMenuItemSet_PolicyInfo"));  
            
            //CLAPolicySummary
            hm.put("eleCLAPolicyInfo", By.id("PolicyFile:PolicyFileAcceleratedMenuActions:PolicyMenuItemSet:PolicyMenuItemSet_PolicyInfo"));
            hm.put("eleCLAPolicyFile", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:WizardMenuActions_Goto:ToPolicyFile-textEl"));
            hm.put("eleCLAAccountName", By.id("HIGPolicyFile_Summary:AccountName-inputEl"));
            hm.put("elepolicySummary_CompletedTransactionTble", By.id("HIGPolicyFile_Summary:PSPolicy_Summary_TransactionsLV-body")); 
            hm.put("eleBillingMetod_TransTble", By.xpath("//*[contains(@class,'miniButton') and contains(@id,'HIGPolicyFile_Summary:PSPolicy_Summary_TransactionsLV:0:BillingMethod')]"));
            
            //Group
            hm.put("eleAdministration", By.id("TabBar:AdminTab-btnInnerEl"));
            hm.put("eleNewGroup", By.id("Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuActions_NewGroup-textEl"));
            hm.put("edtGroupName", By.id("NewGroup:GroupDetailScreen:GroupDetailDV:GlobalContactNameInputSet:Name-inputEl"));
            hm.put("lstType", By.id("NewGroup:GroupDetailScreen:GroupDetailDV:Type-inputEl"));
            hm.put("lstSecZone", By.id("NewGroup:GroupDetailScreen:GroupDetailDV:GroupDetailInputSet:SecurityZone-inputEl"));
            hm.put("eleUpdateGroup", By.id("NewGroup:GroupDetailScreen:Update-btnInnerEl"));
            // hm.put("edtGroupInfoRecordTable", By.id("AdminUserSearchPage:UserSearchScreen:UserSearchDV:GroupNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
            hm.put("eleUserName", By.id("AdminUserSearchPage:UserSearchScreen:UserSearchDV:Username-inputEl"));
            hm.put("edtSearchGroupName", By.id("AdminUserSearchPage:UserSearchScreen:UserSearchDV:GroupNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
            hm.put("eleSearchGroupBtn", By.id("AdminUserSearchPage:UserSearchScreen:UserSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
            hm.put("eleSuperUser", By.id("AdminUserSearchPage:UserSearchScreen:UserSearchResultsLV:2:DisplayName"));
            hm.put("eleCancelGroup", By.id("NewGroup:GroupDetailScreen:Cancel-btnInnerEl"));
            
            //RenewalPolicy
            
            
            hm.put("eleRenewPolicy", By.xpath(".//span[contains(@id,'RenewPolicy-textEl')]"));
            hm.put("eleAlertPopUp", By.id("button-1005-btnInnerEl"));
           hm.put("eleWorkFlowIndicator", By.xpath(".//span[contains(@id,'WorkflowLabel-btnInnerEl')]"));
            
            hm.put("elePreRenewal", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:PreRenewalID-textEl"));
            hm.put("elePreRenewalEdit", By.id("PSPreRenewalDirectionPage:PreRenewalDirectionScreen:Edit-btnInnerEl"));
            hm.put("lstPreRenewalDirection", By.id("PSPreRenewalDirectionPage:PreRenewalDirectionScreen:PreRenewalDirection-inputEl"));
            hm.put("lsjPreRenewalDirection", By.id("PSPreRenewalDirectionPage:PreRenewalDirectionScreen:PreRenewalDirection-inputEl"));
            hm.put("edtPreRenewalDirection", By.id("PSPreRenewalDirectionPage:PreRenewalDirectionScreen:PreRenewalDirection-inputEl"));
            hm.put("edtPreRenewalText", By.id("PSPreRenewalDirectionPage:PreRenewalDirectionScreen:Text-inputEl"));
            hm.put("elePreRenewalUpdate", By.id("PSPreRenewalDirectionPage:PreRenewalDirectionScreen:Update-btnInnerEl"));
            hm.put("elePreRenewalDelete", By.id("PSPreRenewalDirectionPage:PreRenewalDirectionScreen:PreRenewalDirectionScreen_DeleteButton-btnInnerEl"));
            hm.put("eleRenewalHistoryTable", By.id("HIGPolicyFile_History:PSJob_HistoryScreen:HistoryScreenResultsLV"));
            hm.put("eleHistory", By.xpath(".//*[@id='HIGPolicyFile:MenuLinks:HIGPolicyFile_HIGPolicyFile_History']/div/span"));
            hm.put("elePreRenewalView", By.id("PSPreRenewalDirectionPage:PreRenewalDirectionScreen:PreRenewalDirectionScreen_ViewNotesButton-btnInnerEl"));
            hm.put("elePreRenewalTopic", By.id("x-form-el-PSPreRenewalNotesPage:PolicyShell_Notes_ExtScreen:NotesLV:0:NoteRowSet:Topic"));
            hm.put("eleRenewPolicy", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_NewPolTransactions:PolicyFileMenuActions_RenewPolicy"));
            hm.put("eleRenewShell", By.id("HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_NewPolTransactions:PolicyFileMenuActions_RenewPolicy:RenewSORShell_ExtMenuItemSet:renewShell"));
            hm.put("eleProCodeLabel", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:ProducerSelectionInputSet:ProducerCode_Ext-labelEl"));
            hm.put("eleProductLabel", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:Product-labelEl"));
            hm.put("eleEffDateLabel", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:HIGEffectiveDateID-labelEl"));
            hm.put("eleBusSegLabel", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:BusSegmentID-labelEl"));
            hm.put("eleSummaryPreRenewalLabel", By.id("HIGPolicyFile_Summary:12"));
            hm.put("eleSummaryPreRenewalClick", By.id("HIGPolicyFile_Summary:PreRenewalDirection-inputEl"));
            hm.put("eleSelectAccount", By.id("HIGPolicyFile:PSPolicyTerm_ExtInfoBar:HIGAccountNumber"));
            hm.put("eleCloseOptionNonRenew", By.id("PSPolicyTerm_Ext_Info:CloseOptions:NonRenewJob-textEl"));
            hm.put("eleRenewalWarning", By.id("PSPolicyTerm_Ext_Info:NonRenewAlert"));
            hm.put("eleCloseOptionNotTaken", By.id("PSPolicyTerm_Ext_Info:CloseOptions:NotTakenJob-itemEl"));
            hm.put("eleNextYearYes", By.id("PSNotTakenReasonExtPopup:RejectScreen:PSRejectReasonExtDV:PursueNextYear_true-inputEl"));
            hm.put("lstSuccessfulCarrier", By.id("PSNotTakenReasonExtPopup:RejectScreen:PSRejectReasonExtDV:SuccessfulCarrier-inputEl"));
            hm.put("edtSuccessfulPremium", By.id("PSNotTakenReasonExtPopup:RejectScreen:PSRejectReasonExtDV:SuccessfulPremium-inputEl"));
            
            //Policy Shell Contacts
			hm.put("eleShellContactsLink", By.xpath("//*[@id='HIGPolicyFile:MenuLinks:HIGPolicyFile_HIGPolicyFile_Contacts']/div"));
			hm.put("eleShellCreateNewContact", By.id("HIGPolicyFile_Contacts:AddNewToolbarButton"));
			hm.put("eleShellExistingContact", By.id("HIGPolicyFile_Contacts:AddexistingToolbarButton"));
			hm.put("eleShellAgentContact",By.xpath("//span[contains(text(), 'Agency Contact')]"));
			hm.put("eleShellBillingContact",By.xpath("//span[contains(text(), 'BillingContact')]"));
			hm.put("eleShellNewPerson",By.xpath("//span[contains(text(), 'New Person')]"));
			hm.put("eleShellRoleTab", By.id("HIGNewPolicyFileContactPopup:ContactDetailScreen:RolesCardTab"));
			hm.put("eleShellAddRole", By.id("HIGNewPolicyFileContactPopup:ContactDetailScreen:ContactRolesDV:ContactRolesLV_tb:AddRoleButton"));
			hm.put("eleShellRoleMenu", By.cssSelector(".x-panel.x-layer.x-panel-default.x-menu.x-border-box:not([style*='hidden']"));
			hm.put("eleShellExistingRoleMenu", By.cssSelector(".x-panel.x-layer.x-panel-default.x-menu.x-border-box:not([style*='hidden']"));
			hm.put("eleShellRoleTable", By.id("HIGNewPolicyFileContactPopup:ContactDetailScreen:ContactRolesDV:ContactRolesLV-body"));
			hm.put("edtShellFirstName", By.id("HIGNewPolicyFileContactPopup:ContactDetailScreen:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
			hm.put("edtShellLastName", By.id("HIGNewPolicyFileContactPopup:ContactDetailScreen:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl"));
			hm.put("edtShellAddress1", By.id("HIGNewPolicyFileContactPopup:ContactDetailScreen:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
			hm.put("eleShellCity", By.id("HIGNewPolicyFileContactPopup:ContactDetailScreen:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
			hm.put("zedShellCity", By.id("HIGNewPolicyFileContactPopup:ContactDetailScreen:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
			hm.put("lstShellState", By.id("HIGNewPolicyFileContactPopup:ContactDetailScreen:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("eleShellZipCode", By.id("HIGNewPolicyFileContactPopup:ContactDetailScreen:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("zedShellZipCode", By.id("HIGNewPolicyFileContactPopup:ContactDetailScreen:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("eleShellUpdate", By.id("HIGNewPolicyFileContactPopup:ContactDetailScreen:Update"));
			hm.put("eleSummaryContacts", By.id("HIGPolicyFile_Contacts:ttlBar"));
			
			//Billing Contact
            hm.put("elePayBillingContactLink", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:BillingContactsInputs:AccountContactBillingInputSet:ChangeBillingContactButton:ChangeBillingContactButtonMenuIcon"));
            hm.put("elePayNewPerson", By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:BillingContactsInputs:AccountContactBillingInputSet:ChangeBillingContactButton:1:contactType-textEl"));
            hm.put("edtPayFirstName", By.id("NewBillingContactPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
            hm.put("edtPayLastName", By.id("NewBillingContactPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:LastName-inputEl"));
            hm.put("lstPayPrimaryPhone", By.id("NewBillingContactPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:PrimaryPhone-inputEl"));
            hm.put("elePayHomePhone", By.id("NewBillingContactPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:HomePhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl"));
            hm.put("edtPayHomePhone", By.id("NewBillingContactPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:HomePhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl"));
            hm.put("elePayFaxPhone", By.id("NewBillingContactPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:FaxPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl"));
            hm.put("edtPayFaxPhone", By.id("NewBillingContactPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:FaxPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl"));
            hm.put("elePayPrimaryEmail", By.id("NewBillingContactPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:EmailAddress1-inputEl"));
            hm.put("edtPayPrimaryEmail", By.id("NewBillingContactPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:EmailAddress1-inputEl"));
            hm.put("elePaySecryEmail", By.id("NewBillingContactPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:EmailAddress2-inputEl"));
            hm.put("edtPaySecryEmail", By.id("NewBillingContactPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:EmailAddress2-inputEl"));
            hm.put("elePayAddresslink", By.id("NewBillingContactPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon"));
            hm.put("elePayAddress1link", By.id("NewBillingContactPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail-textEl"));
            hm.put("elePayAddress2link", By.id("NewBillingContactPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress-textEl"));
            hm.put("elePayOK", By.id("NewBillingContactPopup:ContactDetailScreen:updateButton_Ext-btnInnerEl"));
            hm.put("elePayStandardize", By.id("NewBillingContactPopup:ContactDetailScreen:standardizeButton_Ext-btnInnerEl"));
            hm.put("elePhonePref", By.id("PolicyFile_Contacts:Policy_ContactsScreen:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:PrimaryPhone-inputEl"));
            hm.put("eleHomePhone", By.id("PolicyFile_Contacts:Policy_ContactsScreen:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:HomePhone:GlobalPhoneInputSet:PhoneDisplay-inputEl"));
            hm.put("eleFaxPhone", By.id("PolicyFile_Contacts:Policy_ContactsScreen:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:FaxPhone:GlobalPhoneInputSet:PhoneDisplay-inputEl"));
            hm.put("elePrimaryEmail", By.id("PolicyFile_Contacts:Policy_ContactsScreen:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:EmailAddress1-inputEl"));
            hm.put("eleSecondaryEmail", By.id("PolicyFile_Contacts:Policy_ContactsScreen:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:EmailAddress2-inputEl"));
            hm.put("eleContactCountry", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl"));
            hm.put("eleContactAddress1", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
            hm.put("eleContactCity", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
            hm.put("eleContactCounty", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:County-inputEl"));
            hm.put("eleContactState", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
            hm.put("eleContactZip", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
            hm.put("elePolicy_Contacttbl", By.id("PolicyFile_Contacts:Policy_ContactsScreen:Policy_ContactsLV-body"));
            
            //Cancel Policy
            hm.put("eleCancelPolicyPC", By.xpath(".//span[contains(@id,'PolicyFileMenuActions_CancelPolicy-textEl')]"));
            hm.put("lstSourcePC",By.xpath(".//input[contains(@id,'Source-inputEl')]"));
            hm.put("lstReasonPC", By.xpath(".//input[contains(@id,'Reason-inputEl')]"));
            hm.put("lstReasonDescriptionPC", By.xpath(".//input[contains(@id,'ReasonDescription-inputEl')]"));
            hm.put("edtRemarksPC", By.xpath(".//textarea[contains(@id,'Remarks-inputEl')]"));
            hm.put("eljStartCancellationPC", By.xpath(".//span[contains(@id,'NewCancellation-btnInnerEl')]"));
            hm.put("eleCancelNowPC", By.xpath(".//span[contains(@id, 'CancelNow-textEl')]"));
            hm.put("eleScheduleCancellationPC", By.xpath(".//span[contains(@id,'SubmitCancellation-textEl')]"));
            hm.put("edtCancellationDatePC", By.xpath(".//input[contains(@id,'CancelDate-inputEl')]"));
            hm.put("edtCancellationDate", By.xpath(".//input[contains(@id, 'CancelDate_date-inputEl')]"));
            
            hm.put("eleSORCancelPolicy",By.id("PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_CancelPolicy-textEl"));
            hm.put("lstCan_Source",By.id("StartCancellation:StartCancellationScreen:CancelPolicyDV:Source-inputEl"));
            hm.put("lstCan_Subsource",By.id("StartCancellation:StartCancellationScreen:CancelPolicyDV:SubmissionSourceCancel-inputEl"));
            hm.put("edtCan_DateReceived",By.xpath("//*[contains(@id,'ReceivedDate_date-inputEl')]"));
            hm.put("lstCan_Reason",By.id("StartCancellation:StartCancellationScreen:CancelPolicyDV:Reason-inputEl"));
            hm.put("edtCan_Reasondesc",By.id("StartCancellation:StartCancellationScreen:CancelPolicyDV:ReasonDescription-inputEl"));
            hm.put("lstCan_RefundMethod",By.id("StartCancellation:StartCancellationScreen:CancelPolicyDV:CalcMethod-inputEl"));
            hm.put("edtCan_CanEffDate",By.xpath("//*[contains(@id,'ReceivedDate_date-inputEl')]"));
            hm.put("eleCan_StartCancel",By.id("StartCancellation:StartCancellationScreen:NewCancellation-btnInnerEl"));
            hm.put("eleCan_EntryScreen",By.id("CancellationWizard:CancellationWizard_EntryScreen:ttlBar"));
            hm.put("eleCan_OdenYES",By.id(""));
            hm.put("eleCan_Validate",By.id("CancellationWizard:CancellationWizard_EntryScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl"));
            hm.put("eljCan_Validate",By.id("CancellationWizard:CancellationWizard_EntryScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl"));
            hm.put("eleCan_Confirmation",By.id("CancellationWizard:CancellationWizard_QuoteScreen:ttlBar"));
            hm.put("bliCan_BindOption",By.id("CancellationWizard:CancellationWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnInnerEl"));
            hm.put("eleCan_PopupOK",By.id("button-1005-btnInnerEl"));
            hm.put("eleCan_PolNumclk",By.id("JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl"));
            hm.put("elwAccountAddress", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress"));
            hm.put("elwAddClass", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:WC7StateCoverageScreen:WC7StateCoverageCV:WC7ClassesInputSet:WCCovEmpLV_tb:Add-btnInnerEl"));
            hm.put("lsjSalesAgreementCode", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:SalesAgreementCode-inputEl"));
            hm.put("lsjOrganisationType", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OrganizationType-inputEl") );
            hm.put("lsjProductType", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ProductType-inputEl"));
            hm.put("lsjSubmissionSource", By.xpath(".//*[contains(@id,'SubmissionSource-inputEl')]") );	
            
            //Reinstate
            
            hm.put("eleReinstatePolicy", By.xpath(".//span[contains(@id, 'ReinstatePolicy-textEl')]"));
            hm.put("eleReinstate", By.xpath(".//span[contains(@id, 'Reinstate-btnInnerEl')]"));
            
            
            //Lien Holder Contact
            hm.put("eleOfficePhone", By.id("PolicyFile_Contacts:Policy_ContactsScreen:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:WorkPhone:GlobalPhoneInputSet:PhoneDisplay-inputEl"));
            hm.put("elePayPremiumFinck",By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:premiumfinanceindicator_Ext-inputEl"));
            hm.put("edtPayAgreementnum",By.id("SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:premiumfinancedetails:agreementnumber-inputEl"));
            hm.put("elePayName",By.xpath("//*[contains(@id,'PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:premiumfinancedetails:premiumfinanciername-inputEl')]"));
            hm.put("edtPayName",By.xpath("//*[contains(@id,'PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:premiumfinancedetails:premiumfinanciername-inputEl')]"));
            hm.put("elePayAddress",By.xpath("//*[contains(@id,'PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:premiumfinancedetails:premiumfinancieraddress-inputEl')]"));
            hm.put("edtPayAddress",By.xpath("//*[contains(@id,'PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:premiumfinancedetails:premiumfinancieraddress-inputEl')]"));
            hm.put("elePayCity",By.xpath("//*[contains(@id,'PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:premiumfinancedetails:premiumfinanciercity-inputEl')]"));
            hm.put("edtPayCity",By.xpath("//*[contains(@id,'PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:premiumfinancedetails:premiumfinanciercity-inputEl')]"));
            hm.put("lstPayState",By.xpath("//*[contains(@id,'PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:premiumfinancedetails:premiumfinancierstate-inputEl')]"));
            hm.put("elePayZipCode",By.xpath("//*[contains(@id,'PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:premiumfinancedetails:premiumfinancierzip-inputEl')]"));
            hm.put("edtPayZipCode",By.xpath("//*[contains(@id,'PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:premiumfinancedetails:premiumfinancierzip-inputEl')]"));
            hm.put("elePolicyTran_LeftPane", By.xpath(".//span[contains(text(), 'Policy Transactions')]"));
            hm.put("eleViewPolicyTran",By.id("PolicyFile_Jobs:Policy_JobsScreen:DetailPanel:Policy_JobInfoDV:JobFile-inputEl"));
            hm.put("elePolicyPayment_LeftPane", By.xpath(".//span[contains(text(), 'Payment')]"));
            hm.put("eleLien_AddressLine1",By.xpath("//*[contains(@id,'PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:premiumfinancedetails:premiumfinancieraddress-inputEl')]"));            
            hm.put("eleLien_CityName",By.xpath("//*[contains(@id,'PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:premiumfinancedetails:premiumfinanciercity-inputEl')]"));
            hm.put("eleLien_State_Abbr",By.xpath("//*[contains(@id,'PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:premiumfinancedetails:premiumfinancierstate-inputEl')]"));
            hm.put("eleLien_ZIPCODE",By.xpath("//*[contains(@id,'PaymentScreen:BillingAdjustmentsDV:BillingMethodDependent:premiumfinancedetails:premiumfinancierzip-inputEl')]"));
            hm.put("eleAcc_CustomerVer", By.id("AccountFile_Summary:AccountFile_SummaryScreen:custVerifiedButton_Ext-btnInnerEl"));
            hm.put("elePCOfficePhone", By.id("PolicyFile_Contacts:Policy_ContactsScreen:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:WorkPhone:GlobalPhoneInputSet:PhoneDisplay-inputEl"));
            hm.put("edtPCOfficePhone", By.id("EditAccountPopup:EditAccountScreen:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl"));
            hm.put("elePCFaxPhone", By.id("PolicyFile_Contacts:Policy_ContactsScreen:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:FaxPhone:GlobalPhoneInputSet:PhoneDisplay-inputEl"));
            hm.put("elePCPrimaryEmail", By.id("PolicyFile_Contacts:Policy_ContactsScreen:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:EmailAddress1-inputEl"));
            hm.put("elePCSecondaryEmail", By.id("PolicyFile_Contacts:Policy_ContactsScreen:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:EmailAddress2-inputEl"));
            hm.put("bliBusinessGrouping", By.id("NewActivityPattern:ActivityPatternDetailScreen:BusinessGroupingLV_tb:AddGrouping-btnWrap"));
            hm.put("tblAP_SegmentCode", By.id("ActivityPatternDetail:ActivityPatternDetailScreen:BusinessGroupingLV-body"));
            hm.put("eleCan_ODENQues", By.id("CancellationWizard:CancellationWizard_EntryScreen:QuestionSetsDV:0:QuestionSetLV-body"));
            hm.put("elePolTrantbl", By.id("PolicyFile_Jobs:Policy_JobsScreen:DetailPanel:JobsLV-body"));
            hm.put("eleSORReinstate",By.id("PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_ReinstatePolicy-textEl"));
            hm.put("lstRein_Reason", By.id("ReinstatementWizard:ReinstatementWizard_ReinstatePolicyScreen:ReinstatePolicyDV:ReasonCode-inputEl"));
            hm.put("edtReason_Desc", By.id("ReinstatementWizard:ReinstatementWizard_ReinstatePolicyScreen:ReinstatePolicyDV:ReasonDescription-inputEl"));
            hm.put("eleRein_Ques", By.id("ReinstatementWizard:ReinstatementWizard_ReinstatePolicyScreen:ReinstateQuestions:QuestionSetsDV:0:QuestionSetLV-body"));
            hm.put("eleRein_Quote", By.id("ReinstatementWizard:ReinstatementWizard_ReinstatePolicyScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl"));
            hm.put("eleRein_Quotettl", By.id("ReinstatementWizard:ReinstatementWizard_QuoteScreen:ttlBar"));
            hm.put("eleRein_Policy", By.id("ReinstatementWizard:ReinstatementWizard_QuoteScreen:JobWizardToolbarButtonSet:Reinstate-btnInnerEl"));
            hm.put("eleSORRewritePolicy", By.id("PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:StartRewriteMenuItemSet:RewriteFullTerm-textEl"));
            hm.put("lstRewriteAs", By.id("RewriteWizard:LOBWizardStepGroup:RewriteWizard_PolicyInfoScreen:RewriteWizard_PolicyInfoDV:PolicyInfoInputSet:RewriteAs-inputEl"));
            hm.put("lstRewrite_Subsource", By.id("RewriteWizard:LOBWizardStepGroup:RewriteWizard_PolicyInfoScreen:RewriteWizard_PolicyInfoDV:PolicyInfoInputSet:SubmissionSource-inputEl"));
            hm.put("eleRewriteQuote", By.id("RewriteWizard:LOBWizardStepGroup:RewriteWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl"));
            hm.put("eleRewriteQuotettl", By.id("RewriteWizard:RewriteWizard_QuoteScreen:ttlBar"));
            hm.put("eleRewriteIssue", By.id("RewriteWizard:RewriteWizard_QuoteScreen:JobWizardToolbarButtonSet:BindRewrite-btnInnerEl"));
            
            //History
            hm.put("eleNaviToHistory",By.id("AccountFile:MenuLinks:AccountFile_AccountFile_History"));
            hm.put("eleHistoryTable", By.xpath("//div[@id='AccountFile_History:1']//span[@class='x-column-header-text']"));
            hm.put("eleHistory_SelectUser", By.id("AccountFile_History:HistoryScreenDV:user:UserBrowseMenuItem"));
            hm.put("eleHistory_UserText", By.xpath("//div[@class='x-grid-view x-fit-item x-grid-view-default']/table"));
            hm.put("edtHistory_FirstName", By.id("UserSearchPopup:UserSearchPopupScreen:UserSearchDV:ContactInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
            hm.put("lstHistory_RelatedTo", By.id("AccountFile_History:HistoryScreenDV:relatedto-inputEl"));
            hm.put("eleHistory_Search", By.id("AccountFile_History:HistoryScreenDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
            hm.put("eleHistory_RelatedToDropdown", By.xpath("//table[@id='AccountFile_History:HistoryScreenDV:relatedto-triggerWrap']//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first']"));
            hm.put("eleHistory_RelatedToList", By.cssSelector(".x-list-plain>li"));
            
            //unattached doucment
            hm.put("eleUnattachedDocTable", By.id("DesktopUnattachedDocumentsPage:UnattachedDocumentsScreen:UnattachedDocumentWorkItemsLV-body"));
            hm.put("eleDocumentDtlsTitle", By.id("UnattachedDocumentsDetail:UnattachedDocumentsDetailScreen:ttlBar"));
            hm.put("eleGetNextUrgentDoc", By.id("DesktopUnattachedDocumentsPage:UnattachedDocumentsScreen:WorkOnHandDocumentLV_tb:GetNextUrgencyDoc-btnInnerEl"));
            hm.put("btnEmail/Fax", By.id("UnattachedDocumentsDetail:UnattachedDocumentsDetailScreen:EmailOfFax-btnInnerEl"));
            hm.put("eleEmail/FaxTitle", By.id("UnattachedDocumentsEmailFaxDetail:UnattachedDocumentsEmailFaxDetailScreen:ttlBar"));
            hm.put("lstDeliveryMethod", By.id("UnattachedDocumentsEmailFaxDetail:UnattachedDocumentsEmailFaxDetailScreen:deliveryMethod-inputEl"));
            hm.put("edtEmail", By.id("UnattachedDocumentsEmailFaxDetail:UnattachedDocumentsEmailFaxDetailScreen:CCLDeliveryEmail-inputEl"));
            hm.put("edtFax", By.id("UnattachedDocumentsEmailFaxDetail:UnattachedDocumentsEmailFaxDetailScreen:CCLDeliveryFax-inputEl"));
            hm.put("edtEmailOrFaxText", By.id("UnattachedDocumentsEmailFaxDetail:UnattachedDocumentsEmailFaxDetailScreen:EmailFaxText-inputEl"));
            hm.put("btnSend", By.id("UnattachedDocumentsEmailFaxDetail:UnattachedDocumentsEmailFaxDetailScreen:EmailOfFax"));
            hm.put("btnCancel", By.id("UnattachedDocumentsEmailFaxDetail:UnattachedDocumentsEmailFaxDetailScreen:CancelButton"));
            hm.put("lstSource", By.id("UnattachedDocumentsDetail:UnattachedDocumentsDetailScreen:Source-inputEl"));
            hm.put("eleDocumentName", By.id("UnattachedDocumentsDetail:UnattachedDocumentsDetailScreen:DocumentName-inputEl"));
            hm.put("btnResearch", By.id("UnattachedDocumentsDetail:UnattachedDocumentsDetailScreen:Research-btnInnerEl"));
            hm.put("btnDelete", By.id("UnattachedDocumentsDetail:UnattachedDocumentsDetailScreen:DeleteDoc-btnInnerEl"));
            hm.put("eleUnAttachedMessage", By.id("DesktopUnattachedDocumentsPage:UnattachedDocumentsScreen:message"));
            hm.put("clrEmail", By.id("UnattachedDocumentsEmailFaxDetail:UnattachedDocumentsEmailFaxDetailScreen:CCLDeliveryEmail-inputEl"));
            hm.put("clrFax", By.id("UnattachedDocumentsEmailFaxDetail:UnattachedDocumentsEmailFaxDetailScreen:CCLDeliveryFax-inputEl"));
            hm.put("clrEmailOrFaxText", By.id("UnattachedDocumentsEmailFaxDetail:UnattachedDocumentsEmailFaxDetailScreen:EmailFaxText-inputEl"));
            hm.put("eljSend", By.id("UnattachedDocumentsEmailFaxDetail:UnattachedDocumentsEmailFaxDetailScreen:EmailOfFax"));
            hm.put("eljCancel", By.id("UnattachedDocumentsEmailFaxDetail:UnattachedDocumentsEmailFaxDetailScreen:CancelButton"));
	          hm.put("edtDocIntakeTab", By.className("x-form-field x-form-text x-form-focus x-field-form-focus x-field-default-form-focus"));
	          hm.put("elePolicyPickerUnattached", By.id("UnattachedDocumentsDetail:UnattachedDocumentsDetailScreen:PolicyNumber:SelectPolicyNumber"));
	          hm.put("edtPolicySearchUnattached", By.id("UnattachedSearchPolicy_ExtPopup:UnattachedPolicySearchScreen:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:policyNumber-inputEl"));
	          hm.put("eleSearchBtnUnattached", By.id("UnattachedSearchPolicy_ExtPopup:UnattachedPolicySearchScreen:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
	          hm.put("eleSelectPolicyUnattached", By.id("UnattachedSearchPolicy_ExtPopup:UnattachedPolicySearchScreen:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearch_ResultsLV:0:_Select"));
	          hm.put("lstMissingInfoUnattached", By.id("UnattachedDocumentsDetail:UnattachedDocumentsDetailScreen:missingInfoID-inputEl"));
	          hm.put("eleCancelUnattached", By.id("UnattachedDocumentsDetail:UnattachedDocumentsDetailScreen:CancelButton-btnInnerEl"));
	          hm.put("eleUpdateUnattached", By.id("UnattachedDocumentsDetail:UnattachedDocumentsDetailScreen:Update-btnInnerEl"));
	          hm.put("btnEdit", By.id("UnattachedDocumentsDetail:UnattachedDocumentsDetailScreen:Edit-btnInnerEl"));
	          hm.put("eleUnattachedDocsTitle", By.id("DesktopUnattachedDocumentsPage:UnattachedDocumentsScreen:ttlBar"));
	          hm.put("eleSend", By.id("UnattachedDocumentsEmailFaxDetail:UnattachedDocumentsEmailFaxDetailScreen:EmailOfFax"));
   
            //DocumentInfo
            hm.put("eleDocument", By.xpath(".//td[contains(@id, 'Documents')]/div/span"));
            hm.put("eleDocIcon", By.xpath(".//*[contains(@id, 'DocumentsLV:0:Icon')]"));
            hm.put("eleEditDocument", By.id("EditDocumentFromTemplate_ExtPopup:EditTemplateDocument_ExtDV:EditDocumentBundle-btnInnerEl"));
            hm.put("edtMAIL", By.id("EditDocumentFromTemplate_ExtPopup:EditTemplateDocument_ExtDV:RecipientInformation_Ext:TORecipientInputSet_Ext:DeliveryPreferenceTO_Ext:TOEmail_Ext-inputEl"));
            hm.put("eleFinalize", By.id("EditDocumentFromTemplate_ExtPopup:FinalizeButton-btnInnerEl"));
            hm.put("eleShellNewDoc", By.xpath(".//*[@id='HIGPolicyFile:HIGPolicyFileMenuActions:PolicyFileMenuActions_Create:CreateDocument-textEl']"));
            hm.put("eleDocReset", By.xpath(".//*[contains(@id, 'SearchLinksInputSet:Reset')]"));
            hm.put("eleDeleteDocument", By.xpath(".//*[contains(@id, 'DeleteDocumentButton-btnInnerEl')]"));
            hm.put("elePolSaveDraft", By.cssSelector("a[id='NewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:SaveAsDraftButton'][class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
          
            /*hm.put("eleViewButton", By.xpath("//a[@id='AccountFile_Documents:DocumentsScreen:DocumentsLV:0:DocumentsLV_ViewDoc']"));
            hm.put("eleCheckIn", By.xpath("//a[@id='AccountFile_Documents:DocumentsScreen:DocumentsLV:0:CheckInDocument']"));
            hm.put("eleCheckOut", By.xpath("//a[@id='AccountFile_Documents:DocumentsScreen:DocumentsLV:0:CheckOutDocument']"));
            hm.put("eleDiscardButton", By.xpath("//a[@id='AccountFile_Documents:DocumentsScreen:DocumentsLV:0:DiscardDocument']"));
            hm.put("eleView_DocButton", By.xpath("//a[@id='AccountFile_Documents:DocumentsScreen:DocumentsLV:0:DocumentsLV_ViewDoc']"));
            hm.put("eleDownload_DocButton", By.xpath("//a[@id='AccountFile_Documents:DocumentsScreen:DocumentsLV:0:OpenDocument']"));
            hm.put("eleCheckOut_Disabled", By.xpath("//span[@class='miniButton' and @id='AccountFile_Documents:DocumentsScreen:DocumentsLV:0:CheckOutDocument']"));
            hm.put("eleCheckIn_Disabled", By.xpath("//span[@class='miniButton' and @id='AccountFile_Documents:DocumentsScreen:DocumentsLV:0:CheckInDocument']"));
            hm.put("eleDiscard_Disabled", By.xpath("//span[@class='miniButton' and @id='AccountFile_Documents:DocumentsScreen:DocumentsLV:0:DiscardDocument']"));
            hm.put("eleEdit_DocScreen", By.id("DocumentDetailsPopup:DocumentDetailsScreen:Edit-btnInnerEl"));
            hm.put("eleCheckIn_CheckInScreen", By.id("DocumentCheckIn_ExtPopup:ToolbarButton-btnInnerEl"));
            hm.put("eleBrowseDoc", By.xpath("//a[contains(@id,'fileuploadfield')]"));*/
            hm.put("eleViewButton", By.xpath("//a[contains(@id,'DocumentsLV:0:DocumentsLV_ViewDoc')]"));
            hm.put("eleCheckIn", By.xpath("//a[contains(@id,'DocumentsLV:0:CheckInDocument')]"));
            hm.put("eleCheckOut", By.xpath("//a[contains(@id,'DocumentsLV:0:CheckOutDocument')]"));
            hm.put("eleDiscardButton", By.xpath("//a[contains(@id,'DocumentsLV:0:DiscardDocument')]"));
            hm.put("eleView_DocButton", By.xpath("//a[contains(@id,'DocumentsLV:0:DocumentsLV_ViewDoc')]"));
            hm.put("eleDownload_DocButton", By.xpath("//a[contains(@id,'DocumentsLV:0:OpenDocument')]"));
            hm.put("eleCheckOut_Disabled", By.xpath("//span[@class='miniButton' and contains(@id,'DocumentsLV:0:CheckOutDocument')]"));
            hm.put("eleCheckIn_Disabled", By.xpath("//span[@class='miniButton' and contains(@id,'DocumentsLV:0:CheckInDocument')]"));
            hm.put("eleDiscard_Disabled", By.xpath("//span[@class='miniButton' and contains(@id,'DocumentsLV:0:DiscardDocument']"));
            hm.put("eleEdit_DocScreen", By.id("DocumentDetailsPopup:DocumentDetailsScreen:Edit-btnInnerEl"));
            hm.put("eleCheckIn_CheckInScreen", By.id("DocumentCheckIn_ExtPopup:ToolbarButton-btnInnerEl"));
            hm.put("eleBrowseDoc", By.xpath("//a[contains(@id,'fileuploadfield')]"));
            hm.put("edtDocumentName", By.xpath("//*[contains(@id,'DocumentsScreen:DocumentSearchDV:Name-inputEl')]"));
   
            //Account Participants
            hm.put("eleAccParticipants", By.xpath(".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Roles']/div/span"));
            hm.put("eleDisableEdit", By.xpath(".//span[contains(text(), 'Edit')]"));

            //Tool Participants
            hm.put("eleDisableAdd", By.xpath(".//span[contains(text(), 'Add')]"));
            hm.put("eleDisableRemove", By.xpath(".//span[contains(text(), 'Remove')]"));
            hm.put("eleSorParticipants", By.xpath(".//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Participants']/div/span"));
            hm.put("eleSubmissionParticipants",By.id("SubmissionWizard:Participants") );
            hm.put("lstParticipantAssigneeRole", By.id("SubmissionWizard:JobWizardToolsMenuWizardStepSet:ParticipantsScreen:JobRolesLV:1:AssignedUser:UserBrowseMenuItem"));
            hm.put("lstParticipantAssigneeRole", By.name("AssignmentRole"));
            hm.put("lstParticipantAssignedGroup", By.name("AssignedGroup"));
//          hm.put("lstRenewalReviewType",By.name("renewalReviewTypeInput_Ext"));
            hm.put("eleParticipantTable", By.id("SubmissionWizard:JobWizardToolsMenuWizardStepSet:ParticipantsScreen:JobRolesLV-body"));
            hm.put("eljParticipantSaveDraft", By.id("SubmissionWizard:JobWizardToolsMenuWizardStepSet:ParticipantsScreen:JobRolesLV_tb:Draft-btnInnerEl"));
            hm.put("eljRemoveParticipant", By.id("SubmissionWizard:JobWizardToolsMenuWizardStepSet:ParticipantsScreen:JobRolesLV_tb:Remove-btnInnerEl"));
            
            //BBT
            hm.put("eleNewActivitytitle", By.id("NewActivityWorksheet:NewActivityScreen:ttlBar"));
            hm.put("eleBBPTGuideWorkFlowTitle", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:ttlBar"));
            hm.put("eleBBPTErrorMsg", By.xpath("//div[@id='PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:_msgs']/div[@class='message']"));
            
            //AMP Policy
            hm.put("elePolicyInfo_RO", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:PolicyNumberInputSet:RegionalOffice-inputEl"));
            hm.put("edtPolicyInfo_PolicyNumber", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:PolicyNumberInputSet:PolicyNumberComplete-inputEl"));
            hm.put("edtCLAPolicySymbol", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:PolicyNumberInputSet:PolicySymbol-inputEl"));
            hm.put("eleCLAQuotePresented", By.id("PSPolicyTerm_Ext_Info:BindOptions:QuotePresented-textEl"));
            hm.put("eleCLAQuoteSuccessful", By.id("PSPolicyTerm_Ext_Info:BindOptions:QuoteSuccessful-textEl"));
            hm.put("edtPolicyInfo_PrimaryInsuredName",By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:Name-inputEl"));
            hm.put("edtPolicyInfo_AddressLine1",By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:HIGNamedInsured:HIGNamedInsuredInputSet:Address1-inputEl"));
            hm.put("edtCLABusinessGrouping", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:BusinessGrouping-inputEl"));
            hm.put("edtCLASegment", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:BusSegmentID-inputEl"));
            hm.put("lstPolicyInfo_SubmissionSource", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:SubmissionSource-inputEl"));
            hm.put("edtNPNMiddleInitial", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:ProducerSelectionInputSet:NPNMiddleInitial-inputEl"));
            hm.put("edtMTCompleteDate", By.id("PSMaintenanceTransactionDetails_ExtPopup:completeDate-inputEl"));
            hm.put("lstMT_ActionRequiredRenewal", By.id("PSMaintenanceTransactionDetails_ExtPopup:actionOnRenewal-inputEl"));
            hm.put("edtPolicyInfo_MSI", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:MSIID-inputEl"));
            hm.put("eleRA_Edit", By.id("HIGPolicyFile_RiskAnalysis_Ext:Edit-btnInnerEl"));
            hm.put("lstRA_BestIndex", By.id("HIGPolicyFile_RiskAnalysis_Ext:bestIndex-inputEl"));
            hm.put("lstRA_ComplexityScore", By.id("HIGPolicyFile_RiskAnalysis_Ext:complexityScore-inputEl"));
            hm.put("eleRA_Update", By.id("HIGPolicyFile_RiskAnalysis_Ext:Update-btnInnerEl"));
            hm.put("lsjPayment_BillingMethod", By.id("HIGPolicyFile_Payment_Ext:psBillingAdjustment:PSBillingAdjustment_ExtDV:psBillingMethod-inputEl"));
            hm.put("lsjPayment_BillingNumber", By.id("HIGPolicyFile_Payment_Ext:psBillingAdjustment:PSBillingAdjustment_ExtDV:PSBillingnumber-inputEl"));
            hm.put("lstPayment_InstallmentPlan", By.id("HIGPolicyFile_Payment_Ext:psBillingAdjustment:PSBillingAdjustment_ExtDV:psBillingInstallmentPlan-inputEl"));
            hm.put("lstPayment_FinalAudit", By.id("HIGPolicyFile_Payment_Ext:psBillingAdjustment:PSBillingAdjustment_ExtDV:FinalAudit-inputEl"));
            hm.put("edtPayment_PolicyFee", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:PolicyFee-inputEl"));
            hm.put("edtPayment_FilingFee", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:FillingFee-inputEl"));
            hm.put("edtPayment_InspectionFee", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:InspectionFee-inputEl"));
            hm.put("edtPayment_StampingFee", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:StampingFee-inputEl"));
            hm.put("edtPayment_PolicyTax", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:PolicyTax-inputEl"));
            hm.put("edtPayment_AMPFee", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:AMPFee-inputEl"));
            hm.put("edtPayment_WCAssessment", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:WCAssessment-inputEl"));
            hm.put("edtPayment_WCExpenseConstant", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:WCExpenseConstant-inputEl"));
            hm.put("edtPayment_TotalPremium", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:TotalPremiums-inputEl"));  
            hm.put("elePayment_PolicyFee", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:PolicyFee-inputEl"));
            hm.put("elePayment_FilingFee", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:FillingFee-inputEl"));
            hm.put("elePayment_InspectionFee", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:InspectionFee-inputEl"));
            hm.put("elePayment_StampingFee", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:StampingFee-inputEl"));
            hm.put("elePayment_PolicyTax", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:PolicyTax-inputEl"));
            hm.put("elePayment_AMPFee", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:AMPFee-inputEl"));
            hm.put("elePayment_WCAssessment", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:WCAssessment-inputEl"));
            hm.put("elePayment_WCExpenseConstant", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:WCExpenseConstant-inputEl"));
            hm.put("elePayment_TotalPremium", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:TotalPremiums-inputEl"));  
            hm.put("elePayment_MailProducer", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:MailToProducer_false-inputEl"));
            hm.put("edtPayment_GrossCommission", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:GrossCommissionPercentage-inputEl"));
            hm.put("edtPayment_RetailAgentCommission", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:RetailAgentCommPercentage-inputEl"));
            hm.put("edtPayment_AnniversaryDate", By.id("HIGPolicyFile_Payment_Ext:AMPPaymentInfoDV:AnniversaryDate-inputEl"));
            hm.put("elePayment_Update", By.id("HIGPolicyFile_Payment_Ext:Update-btnInnerEl"));
            hm.put("bliPayment_Bind", By.id("HIGPolicyFile_Payment_Ext:BindOptions-btnWrap"));  
            hm.put("lstLOBType", By.name("LineofBusiness"));
            hm.put("lstLOBLevelSupport", By.name("LevelofSupport"));
            hm.put("lstLOBAMPUWCompany", By.name("AMPUnderwritingCompany"));            
            hm.put("eleCommonUdpate", By.xpath(".//span[contains(text(), 'Update')]"));
            hm.put("edtLOBTotalCost", By.name("TotalCost"));
            hm.put("eleLOBPackageOverriding", By.xpath("//*[contains(@class,'x-grid-dirty-cell x-grid-cell-selected')]/div"));
            hm.put("edtLOBNumMotrizedVehicle",By.name("NumberofMotorizedVehicles"));
            hm.put("eleLOBCompositeRated", By.xpath("//*[contains(@class,'x-grid-cell-last x-grid-cell-selected')]/div"));
            
            //NameAddressChange
            hm.put("eleNameAddressScr", By.id("AccountFile:MenuLinks:AccountFile_AccountFile_NameAddressChange_Ext"));
            hm.put("eleNewChange", By.id("AccountFile_NameAddressChange_Ext:newChange-btnInnerEl"));
            hm.put("lstSourceOfSub", By.id("NameAddressChange_ExtPage:NACAccountAndSubmissionInfo_ExtDV:sourceOfSubmission-inputEl"));
            hm.put("edtNameOfReq", By.id("NameAddressChange_ExtPage:NACAccountAndSubmissionInfo_ExtDV:reqName-inputEl"));
            hm.put("edtDateRec", By.id("NameAddressChange_ExtPage:NACAccountAndSubmissionInfo_ExtDV:receivedDate-inputEl"));
            hm.put("edtChangeEffDate", By.id("NameAddressChange_ExtPage:NACAccountAndSubmissionInfo_ExtDV:ChangeEffDate-inputEl"));
            hm.put("eleAIFChk", By.id("NameAddressChange_ExtPage:AIF-inputEl"));
            hm.put("eleNACSubmit", By.id("NameAddressChange_ExtPage:NACSubmit-btnInnerEl"));
            hm.put("elePolicyTable", By.id("NameAddressChange_ExtPage:higPolicyInfo:NACPolicyInfo_ExtLV-body"));
            hm.put("elePayerChk", By.id("NameAddressChange_ExtPage:payer-inputEl"));
            hm.put("eleNameChangeChk", By.id("NameAddressChange_ExtPage:nameChange-inputEl"));
            hm.put("eleNameChangeChk", By.id("NameAddressChange_ExtPage:nameChange-inputEl"));
            hm.put("eleAddressChangeChk", By.id("NameAddressChange_ExtPage:addressChange-inputEl"));
            hm.put("elePayerChk", By.id("NameAddressChange_ExtPage:payer-inputEl"));
            hm.put("edtPolicyInfoName2", By.id("NameAddressChange_ExtPage:higPolicyInfo:policyInfoName2-inputEl"));
            hm.put("clrNameOfReq", By.id("NameAddressChange_ExtPage:NACAccountAndSubmissionInfo_ExtDV:reqName-inputEl"));
            hm.put("clrDateRec", By.id("NameAddressChange_ExtPage:NACAccountAndSubmissionInfo_ExtDV:receivedDate-inputEl"));
            hm.put("clrChangeEffDate", By.id("NameAddressChange_ExtPage:NACAccountAndSubmissionInfo_ExtDV:ChangeEffDate-inputEl"));
            hm.put("eleSummaryOfChangestbl", By.id("AccountFile_NameAddressChange_Ext:socList:SummaryOfChanges_ExtLV-body"));
            hm.put("eleUptoSummaryOfChanges", By.id("NameAddressChange_ExtPage:NameAddressChange_ExtPage_UpLink"));
            
            //Doing Business As
			hm.put("elePolPrimNameInsired", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Name-inputEl"));
			hm.put("elePrimaryNamedInsuredDBAPage", By.id("EditPolicyContactRolePopup:ContactDetailScreen:ttlBar"));
			hm.put("elePriNamedInsContactDetTab", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:PolicyContactRoleDetailCardTab-btnInnerEl"));
			hm.put("elePriNamedInsRoleTab", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:RolesCardTab-btnInnerEl"));
			hm.put("elePriNamedInsAddressesTab", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:AddressesCardTab-btnInnerEl"));
			hm.put("elePriNamedInsDBATab", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:DBACardTab-btnInnerEl"));
			hm.put("elePriNamedInsAddDBA", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:ContactDBALV_tb:addContactButton-btnInnerEl"));
			hm.put("elePriNamedInsRemoveDBA", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:ContactDBALV_tb:removeDBAContact-btnInnerEl"));
			hm.put("elePolPrimInsNewCompany", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:ContactDBALV_tb:addContactButton:0:0:contactType-textEl"));
			hm.put("elePolDBARolePage", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:ttlBar"));
			hm.put("edtPolDBARoleContDetTab", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:PolicyContactRoleDetailCardTab-btnInnerEl"));
			hm.put("edtPolDBARoleContDetContName", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("edtPolDBARoleContDetFEIN", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:PolicyContactDetailsDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl"));
			hm.put("elePolDBARoleAddressesTab", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:AddressesCardTab-btnInnerEl"));
			hm.put("elePolDBARoleAddrDetails", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:AddressesPanelSet:AddressDetailCardTab-btnInnerEl"));
			hm.put("elePolDBARoleOK", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:Update-btnInnerEl"));
			hm.put("elePolPrimInsOK", By.id("EditPolicyContactRolePopup:ContactDetailScreen:updateButton_Ext-btnInnerEl"));
			hm.put("elePolInfoDBATable", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:listOfDBAs:PolicyDBAsDV:NamedInsuredInputSet:DBAListLV-body"));
			hm.put("elePolDBARoleContDetAdd1", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
			hm.put("elePolDBARoleContDetCity", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
			hm.put("elePolDBARoleContDetCounty", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:County-inputEl"));
			hm.put("elePolDBARoleContDetState", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("elePolDBARoleContDetZip", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("elePolDBARoleContDetCountey", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl"));
			
			hm.put("elePolDBARoleAddrAdd1", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
			hm.put("elePolDBARoleAddrCity", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
			hm.put("elePolDBARoleAddrCounty", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:County-inputEl"));
			hm.put("elePolDBARoleAddrState", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
			hm.put("elePolDBARoleAddrZip", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
			hm.put("elePolDBARoleAddrCountey", By.id("NewPolicyDBAContact_ExtPopup:ContactDetailScreen:PolicyDBAContact_ExtCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl"));
			
			
			hm.put("elePolInfoDBAAddedTable", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:listOfDBAs:PolicyDBAsDV:NamedInsuredInputSet:DBAListLV-body"));
			hm.put("elePriNamedInsDBAAddedTable", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:ContactDBALV-body"));
			hm.put("elePriNamedInsSelectDBARemove", By.xpath(".//*[@id='AccountFile:MenuLinks-body']/div/table/tbody/tr/td/div"));
			
			//Additional Insured Extension
			hm.put("eleAddInsAddDBA", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV_tb:AddContactsButton-btnInnerEl"));
			hm.put("eleAddInsNewCompany", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV_tb:AddContactsButton:0:ContactType-textEl"));
			hm.put("eleAddInsRemoveDBA", By.id("EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:ContactDBALV_tb:removeDBAContact-btnInnerEl"));
			hm.put("eleAddInsNewNamedInsuredPage", By.id("NewAdditionalNamedInsuredPopup:ContactDetailScreen:ttlBar"));
			hm.put("edtAddInsCompanyName", By.id("NewAdditionalNamedInsuredPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("eleAddInsSameAddAs", By.id("NewAdditionalNamedInsuredPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon"));
			hm.put("eleAddInsSameAddAsType", By.id("NewAdditionalNamedInsuredPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail-textEl"));
			hm.put("eleAddInsSameAddAsAddress", By.id("NewAdditionalNamedInsuredPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress-textEl"));
			hm.put("eleAddInsOK", By.id("NewAdditionalNamedInsuredPopup:ContactDetailScreen:updateButton_Ext-btnInnerEl"));
			hm.put("eleAddInsDBAAddedTable", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV-body"));
			hm.put("eleAddInsSelDBA", By.xpath(".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV-body']/div/table/tbody/tr/td/div"));
			hm.put("eleAddInsDBARemove", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV_tb:Remove-btnInnerEl"));
			hm.put("elePriNamedInsSelDBASetPrimary", By.xpath(".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:listOfDBAs:PolicyDBAsDV:NamedInsuredInputSet:DBAListLV-body']/div/table/tbody/tr/td/div"));
			hm.put("elePriNamedInsDBASetPrimary", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:listOfDBAs:PolicyDBAsDV:NamedInsuredInputSet:DBAListLV_tb:setToPrimary-btnInnerEl"));
			hm.put("eleAccDBAs", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:DBACardTab-btnInnerEl"));
			hm.put("eleAccAddDBA", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:ContactDBALV_tb:addContactButton-btnInnerEl"));
			hm.put("eleAccDBANewCompany", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:ContactDBALV_tb:addContactButton:0:0:contactType-textEl"));
			hm.put("edtAccDBAName", By.id("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("eleAccNewDBARoleTab", By.id("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:RolesCardTab-btnInnerEl"));
			hm.put("eleAccNewAddDBARole", By.id("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:ContactRolesDV:ContactRolesLV_tb:AddRoleButton-btnInnerEl"));
			hm.put("eleAccNewAddDBARoleNamedInsured", By.id("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:ContactRolesDV:ContactRolesLV_tb:AddRoleButton:13:RoleType-itemEl"));
			hm.put("eleAccNewAddDBARoleTable", By.id("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:ContactRolesDV:ContactRolesLV-body"));
			hm.put("eleAccNewAddDBARoleRemove", By.id("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:ContactRolesDV:ContactRolesLV_tb:Remove-btnInnerEl"));
			hm.put("eleAccDBAUpdate", By.id("NewDBAContactPopup:ContactDetailScreen:Update-btnInnerEl"));
			hm.put("eleAccAddDBATable", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:ContactDBALV-body"));
			hm.put("eleAccRemoveDBA", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:ContactDBALV_tb:removeDBAContact-btnInnerEl"));
//			hm.put("eleAccountNumber", By.id("SubmissionWizard:JobWizardInfoBar:AccountNumber-btnInnerEl"));
			hm.put("eleAccountNumber", By.xpath("//*[contains(@id, 'AccountNumber-btnInnerEl')]"));
			hm.put("eleAccCreateNewContact", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton-btnInnerEl"));
//			hm.put("eleAccNamedInsured", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:12:roleType-textEl"));
//			hm.put("eleAccNamedInsNewCompany", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:12:roleType:0:contactType-textEl"));
			hm.put("eleAccNamedInsured", By.xpath("//span[@class='x-menu-item-text' and contains(text(),'Named Insured')]"));
			hm.put("eleAccNamedInsNewCompany", By.xpath("//span[@class='x-menu-item-text' and contains(text(),'New Company')]"));
			hm.put("edtAccNamedInsNewCompanyName", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("eleAccNamedInsameAddAs", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon"));
			hm.put("eleAccNamedInsSameAddAsType", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail-textEl"));
			hm.put("eleAccNamedInsSameAddAsAddress", By.id("NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress-textEl"));
			hm.put("eleAccNamedInsUpdate", By.id("NewAccountContactPopup:ContactDetailScreen:updateButton_Ext-btnInnerEl"));
			hm.put("eleAccNamedInsTable", By.id("AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV-body"));
			hm.put("eleAccNamedInsDBATab", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:DBACardTab-btnInnerEl"));
			hm.put("eleAccNamedInsAddDBA", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactDBALV_tb:addContactButton-btnInnerEl"));
			hm.put("eleAccNewNamedInsNewCompany", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactDBALV_tb:addContactButton:0:0:contactType-textEl"));
			hm.put("eleAccNamedInsDBATable", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactDBALV-body"));
			hm.put("eleAccNamedInsDBARemove", By.id("EditAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactDBALV_tb:removeDBAContact-btnInnerEl"));
			hm.put("edtAccNamedInsNewDBAName", By.id("NewDBAContactPopup:ContactDetailScreen:AccountDBAContactCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl"));
			hm.put("eleAccNamedInsNewDBAOK", By.id("NewDBAContactPopup:ContactDetailScreen:Update-btnInnerEl"));
			
			//BBT
            hm.put("eleNewActivitytitle", By.id("NewActivityWorksheet:NewActivityScreen:ttlBar"));
            hm.put("eleBBPTGuideWorkFlowTitle", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:ttlBar"));
            hm.put("eleBBPTErrorMsg", By.xpath("//div[@id='PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:_msgs']/div[@class='message']"));
            hm.put("eleBBT_GuidedInfoBar", By.xpath("//span[@class='infobar_elem_val' and contains(text(),'Guided Workflow - Book of Business Transfer')]"));
            hm.put("eleCloseOptions", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:CloseOptions-btnEl"));
            hm.put("eleClose_WithdrawTransaction", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:CloseOptions:WithdrawJob-textEl"));
            hm.put("eleJobNumber", By.id("PSJob_ExtWizard:PSJob_Summary_ExtScreen:PSJob_Summary_ExtDV:number-inputEl"));
            hm.put("eleStatus", By.id("PSJob_ExtWizard:PSJob_Summary_ExtScreen:PSJob_Summary_ExtDV:status-inputEl"));
            hm.put("eleActivity_TargetDate", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:TargetDate-inputEl"));
            hm.put("eleActivity_AssignTo", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:AssignedTo-inputEl"));
            hm.put("eleActivity_ActivityDesc", By.xpath("//textarea[@id='ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:Description-inputEl']"));
            
            //SST Guided workFlow
            hm.put("eleSSTGuidedWorkFlowTitle", By.xpath("//span[contains(text(),'SST Guided Workflow') and @class='g-title']"));
            hm.put("eleARUProcessingTitle", By.xpath("//span[contains(text(),'ARU Processing') and @class='g-title']"));
            hm.put("eleNotifyNewAgentTitle", By.xpath("//span[contains(text(),'Notify New Agent') and @class='g-title']"));
            hm.put("eleSSTProducerCodeIcon", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:newProducerCode:SelectnewProducerCode"));
            						                
            hm.put("lstSSTProcuderStatus", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:Status-inputEl"));
            hm.put("edtOPERInit", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:OperInIt-inputEl"));
            hm.put("eleSysGeneratedTble", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:systemGen"));
            hm.put("eleAgencyNameExact", By.id("ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:agencyNameExact_Ext-inputEl"));
            hm.put("eleErrorMsgs", By.xpath("//div[@id='PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:_msgs']//div[@class='message']"));
            hm.put("eleGuidedInfoBar", By.xpath("//span[@class='infobar_elem_val' and contains(text(),'Guided Workflow - Single Start Transfer')]"));
            hm.put("eljPolicyNo", By.xpath("//span[@class='infobar_elem_val' and contains(text(),'Policy #')]"));
            hm.put("edtEffectiveDate", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:effdatechange-inputEl"));
            hm.put("eleNewProducerCode", By.xpath("//input[contains(@id,'newProducerCode-inputEl')]"));
            hm.put("eleNewProducerName", By.xpath("//div[contains(@id,'newAgencyName-inputEl')]"));
            hm.put("elePAC", By.id("PolicyFile_Summary:Policy_SummaryScreen:ProducerCodesDV:PAC_Ext-inputEl"));
            
            hm.put("eleGuidedWrkFlw_MT", By.id("HIGPolicyFile_MidTermTransactions:guidedWorkflowsTab-btnInnerEl"));
            hm.put("eleGuidedWrkFlwTable", By.id("HIGPolicyFile_MidTermTransactions:guidedWorkflowsTab:panelId"));
            hm.put("eleDeclineReason", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:declineReason-inputEl"));
            hm.put("eleSysGeneratedYES", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:systemGen_true-inputEl"));
            hm.put("eleSysGeneratedNO", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:systemGen_false-inputEl"));
            hm.put("eleDeliveryMethodLbl", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:deliveryMethod-labelEl"));
            hm.put("edtDeliveryMethod", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:deliveryMethod-inputEl"));
            hm.put("elePolicySummary_PendingTransactn_Tble", By.id("HIGPolicyFile_Summary:PSPolicy_Summary_JobsInProgressLV-body"));

            //BOR Guided workFlow
            hm.put("eleBORWorkFlowTitle", By.xpath("//span[contains(text(),'CLA BOR Prep Guided Workflow') and @class='g-title']"));
            hm.put("elePolChgProducerSearchimg",By.xpath("//*[contains(@id,'ProducerCodeofService_Ext:SelectProducerCodeofService_Ext')]"));
			//hm.put("eleBORQstnTable", By.id("PolicyChangeWizard:BORWizardStepGroup:PolicyChangeWizard_BOR_ExtScreen:QuestionSetsDV:0:QuestionSetLV"));
			hm.put("eleBORQstnTable", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:QuestionSetsDV:0:QuestionSetLV"));
			//hm.put("eleBORQstnTable", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:QuestionSetsDV:0:QuestionSetLV-body"));
			hm.put("lstBORQstnlist",By.name("c1")); 
			hm.put("eleProducerSearchIcon", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:ProducerSelectionInputSet:ProducerCode_Ext:SelectProducerCode_Ext"));
			hm.put("eleBOR_Closeoptions", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:CloseOptions-btnInnerEl"));
			hm.put("eleBORClose_Withdraw_options", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:CloseOptions:WithdrawJob-textEl"));
			hm.put("edtBOREffectiveDate", By.id("PSJob_ExtWizard:AllStepsWizardStepGroup:PSJob_Step_ExtScreen:ProducerSelectionInputSet:BOREffDate_date-inputEl"));
			hm.put("elePolicEff_Summary", By.id("HIGPolicyFile_Summary:PolicyPerEffDate-inputEl"));
			
			//Cla policy Summary
			hm.put("eleRecentNotesDesc", By.xpath("//div[@id='HIGPolicyFile_Summary:HigNotesSummaryLV']//table//tr//div[@id='x-form-el-HIGPolicyFile_Summary:HigNotesSummaryLV:0:NoteRowSet:Body']"));
            hm.put("eleRecentNotesTopic", By.xpath("//div[@id='HIGPolicyFile_Summary:HigNotesSummaryLV']//table//tr//div[@id='x-form-el-HIGPolicyFile_Summary:HigNotesSummaryLV:0:NoteRowSet:Topic']"));
            hm.put("eleRecentNotesSubject", By.xpath("//div[@id='HIGPolicyFile_Summary:HigNotesSummaryLV']//table//tr//div[@id='x-form-el-HIGPolicyFile_Summary:HigNotesSummaryLV:0:NoteRowSet:Subject']"));
            hm.put("eleRecentNotesHeader", By.xpath("//span[@class='g-title' and text()='Recent Notes']"));
//            hm.put("elepolicySummary_Activitytbl", By.id("HIGPolicyFile_Summary:26-body"));
        	hm.put("elePolicySummaryPage", By.id("PolicyFile_Summary:Policy_SummaryScreen:0"));
        	
        	// classifications
            hm.put("eleMMClassification",By.id("AccountFile:MenuLinks:AccountFile_AccountFile_Classification_Ext"));
            hm.put("eleClassificationRefresh",By.id("AccountFile_Classification_Ext:Account_Classification_ExtScreen:Refresh-btnEl"));
            hm.put("eleMMClassGuideDetailTitle",By.xpath("//*[contains(@id,'AccountFile_Classification_Ext:Account_Classification_ExtScreen:ttlBar')]"));
            hm.put("eleClassificationErrorMsg", By.id("AccountFile_Classification_Ext:Account_Classification_ExtScreen:_msgs"));
            hm.put("eleEditClassification",By.id("AccountFile_Classification_Ext:Account_Classification_ExtScreen:EC-btnInnerEl"));
            hm.put("eleViewClassification",By.id("AccountFile_Classification_Ext:Account_Classification_ExtScreen:VCR-btnInnerEl"));
            hm.put("eleClassify",By.id("AccountFile_Classification_Ext:Account_Classification_ExtScreen:ToolbarButton-btnInnerEl"));
            hm.put("edtClassificationSCI", By.id("myForm:classificationSearchView_sic"));
            hm.put("edtClassificationDesc", By.id("myForm:classificationSearchView_description"));
            hm.put("DrpClassificationState", By.id("myForm:selState"));
            hm.put("btnClassificationSearch", By.id("myForm:search_button"));
            hm.put("btnSelectClassCode", By.id("myForm:cccTable:0:selectButton"));
            hm.put("drpTXWC",By.id("myForm:classDetailsTbl:0:wcStateTbl:0:wcStateRateId"));
            hm.put("drpFCode",By.id("myForm:classDetailsTbl:0:propFCodeTbl:0:propertyFCodeListId"));
            hm.put("btnAssign",By.id("myForm:assign_button"));
            hm.put("eleSICValue", By.id("AccountFile_Classification_Ext:Account_Classification_ExtScreen:Classification_IndustryCodeDetail_ExtInputSet:SIC-inputEl"));
            
            //Bulk Mailing
           /* hm.put("eleBulkemailing", By.id("TabBar:AdminTab:Admin_BulkMailingMenu-arrowEl"));
            hm.put("eleHomeofficetorts", By.id("TabBar:AdminTab:Admin_BulkMailingMenu:BulkMailingMenu_BulkMailingMainPage-textEl"));
            hm.put("eleCreateNewBatch", By.id("BulkMailingMainPage:createNewBatch-btnInnerEl"));
            hm.put("lstDocumentTemplate", By.id("BulkMailingBatchPopup:batchType-inputEl"));
            hm.put("edtPolicies", By.id("BulkMailingBatchPopup:policylist-inputEl"));
            hm.put("eleBulkEmailingSpreadSheet", By.id("BulkMailingBatchPopup:Spreadsheet-btnWrap"));
            hm.put("eleImport", By.id("BulkMailingBatchPopup:Spreadsheet:Import-textEl"));
            hm.put("eleBrowse", By.xpath(".//span[contains(text(), 'Browse...')]"));
            hm.put("eleFatalErrors", By.id("BulkMailingImportPopup:ErrorDV:FatalErrors-labelEl"));
            hm.put("eleissueTypeIssueReason", By.id("BulkMailingImportPopup:ErrorDV:FatalErrors-inputEl"));
            hm.put("eleimportafterfileuploaded", By.id("BulkMailingImportPopup:ImportButton-btnInnerEl"));
            hm.put("eleReturntoGenerateBatch", By.id("BulkMailingImportPopup:__crumb__"));
            hm.put("eleBulkMailingTable", By.id("BulkMailingMainPage:BatchLV-body"));
            hm.put("edtBatchId", By.id("BulkMailingMainPage:batchNumber-inputEl"));
            hm.put("eleSearchRecords", By.id("BulkMailingMainPage:searchRecords-btnInnerEl"));*/
            hm.put("eleBulkemailing", By.id("TabBar:AdminTab:Admin_BulkMailingMenu-arrowEl"));
            hm.put("eleHomeofficetorts", By.id("TabBar:AdminTab:Admin_BulkMailingMenu:BulkMailingMenu_BulkMailingMainPage-textEl"));
            hm.put("eleCreateNewBatch", By.id("BulkMailingMainPage:createNewBatch-btnInnerEl"));
            hm.put("lstDocumentTemplate", By.id("BulkMailingBatchPopup:batchType-inputEl"));
            hm.put("edtPolicies", By.id("BulkMailingBatchPopup:policylist-inputEl"));
            hm.put("eleBulkEmailingSpreadSheet", By.id("BulkMailingBatchPopup:Spreadsheet-btnWrap"));
            hm.put("eleImport", By.id("BulkMailingBatchPopup:Spreadsheet:Import-textEl"));
            hm.put("eleBrowse", By.xpath(".//span[contains(text(), 'Browse...')]"));
            hm.put("eleFatalErrors", By.id("BulkMailingImportPopup:ErrorDV:FatalErrors-labelEl"));
            hm.put("eleissueTypeIssueReason", By.id("BulkMailingImportPopup:ErrorDV:FatalErrors-inputEl"));
            hm.put("eleimportafterfileuploaded", By.id("BulkMailingImportPopup:ImportButton-btnInnerEl"));
            hm.put("eleReturntoGenerateBatch", By.id("BulkMailingImportPopup:__crumb__"));
            hm.put("eleBulkMailingTable", By.id("BulkMailingMainPage:BatchLV-body"));
            hm.put("edtBatchId", By.id("BulkMailingMainPage:batchNumber-inputEl"));
            hm.put("eleSearchRecords", By.id("BulkMailingMainPage:searchRecords-btnInnerEl"));
            hm.put("eleSubmitBatch", By.id("BulkMailingBatchPopup:Update-btnInnerEl"));
            hm.put("elePrintButton", By.id("BulkMailingMainPage:BatchLV_tb:PrintMe-btnInnerEl"));
            hm.put("elePrintOkButton", By.id("PrintOptionPopup:PrintOptionPopupScreen:Ok-btnInnerEl"));
            hm.put("eleBulktbl", By.id("BulkMailingMainPage:BatchLV-body"));
            hm.put("eleSavechanges", By.id("BulkMailingMainPage:BatchLV_tb:SaveChanges-btnInnerEl"));
            hm.put("eleReturntohomeofficetorts", By.id("BulkMailingBatchPopup:__crumb__"));

            
            //Reinsurance
            hm.put("eleReinsurance", By.id(".//span[contains(text(), 'Reinsurance')]"));
            hm.put("eleReinsuranceEdit", By.id("PolicyFile_Reinsurance_Ext:ReinsuranceDetails_ExtScreen:ToolbarButtonid-btnInnerEl"));
            hm.put("chkreinsuranceindicator", By.id("ReinsuranceEditScreenPopup:ReinsuranceDetails_ExtScreen:reinsuranceIndicator_Ext-inputEl"));
            hm.put("lstTranscationType", By.id("ReinsuranceEditScreenPopup:ReinsuranceDetails_ExtScreen:transactionType-inputEl"));
            hm.put("lstReinsured", By.id("ReinsuranceEditScreenPopup:ReinsuranceDetails_ExtScreen:reinsured-inputEl"));
            hm.put("eleReinsuranceUpdate", By.id("ReinsuranceEditScreenPopup:ReinsuranceDetails_ExtScreen:updateButton_Ext-btnInnerEl"));
            hm.put("eleTranscationTypestatus", By.id("PolicyFile_Reinsurance_Ext:ReinsuranceDetails_ExtScreen:transactionType-inputEl"));
            
            //Desktop
            hm.put("eleDesktopNewSubmission", By.id("Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewSubmission-textEl"));
            hm.put("eleRecentAccounts", By.id("TabBar:AccountTab:0:accountItem-textEl"));
            hm.put("eleNewAccount", By.id("TabBar:AccountTab:AccountTab_NewAccount-textEl"));
            hm.put("eleRecentPolicies", By.id("TabBar:PolicyTab:0:PolicyMenuPolicy-textEl"));
            hm.put("eleNewSubmissionPolicy", By.id("TabBar:PolicyTab:PolicyTab_NewSubmission-textEl"));
            
            //MySubmission
            hm.put("eleMySubmissions", By.id("Desktop:MenuLinks:Desktop_DesktopSubmissions"));
            hm.put("eleMySubmissionsAssert", By.id("DesktopSubmissions:DesktopSubmissionsScreen:0"));
            hm.put("eleMySubmissionBody", By.id("DesktopSubmissions:DesktopSubmissionsScreen:DesktopSubmissionsLV-body"));
            hm.put("lstMySubmissionsDropdown", By.id("DesktopSubmissions:DesktopSubmissionsScreen:jobFilter-inputEl"));
            
            //MyGroups
            hm.put("lstGroupsCategories", By.id("DesktopAssignableGroups_Ext:catetory-inputEl"));
            hm.put("eleGroupsAssignBtn", By.id("DesktopAssignableGroups_Ext:DesktopGroups_AssignButton-btnInnerEl"));
            hm.put("eleGroupName", By.id("GroupDetailPage:GroupDetailScreen:GroupDetailDV:GlobalContactNameInputSet:Name-labelEl"));
            hm.put("eleType", By.id("GroupDetailPage:GroupDetailScreen:GroupDetailDV:Type-labelEl"));
            hm.put("eleSecZone", By.id("GroupDetailPage:GroupDetailScreen:GroupDetailDV:GroupDetailInputSet:SecurityZone-labelEl"));
            hm.put("eleActionsNewGroup", By.id("Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuActions_NewGroup-itemEl"));
            hm.put("eleGroup", By.id("Admin:MenuLinks:Admin_UsersAndSecurity:UsersAndSecurity_AdminGroupSearchPage"));
            hm.put("edtGroupNameGroup", By.id("AdminGroupSearchPage:GroupSearchScreen:AdminGroupSearchDV:GlobalContactNameInputSet:Name-inputEl"));
            hm.put("eleSearchBtnGroup", By.id("AdminGroupSearchPage:GroupSearchScreen:AdminGroupSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
            hm.put("eleEditBtnGroup", By.id("GroupDetailPage:GroupDetailScreen:Edit-btnInnerEl"));
            hm.put("edtGroupNameBasics", By.id("GroupDetailPage:GroupDetailScreen:GroupDetailDV:GlobalContactNameInputSet:Name-inputEl"));
            hm.put("eleUpdateBtnGroup", By.id("GroupDetailPage:GroupDetailScreen:Update-btnInnerEl"));
            hm.put("eleDelete1", By.id("GroupDetailPage:GroupDetailScreen:GroupDetailScreen_BasicCard_DeleteButton-btnInnerEl"));
            hm.put("eleSelectGroupFromTable", By.id("AdminGroupSearchPage:GroupSearchScreen:GroupSearchResultsLV-body"));
            hm.put("eleResestBtn", By.id("AdminGroupSearchPage:GroupSearchScreen:AdminGroupSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));
            hm.put("eleRegionsLeftPanel", By.id("Admin:MenuLinks:Admin_UsersAndSecurity:UsersAndSecurity_Regions"));
            hm.put("eleAddRegionBtn", By.id("RegionsPage:RegionsScreen:RegionSearchResultsLV_tb:Regions_AddRegionButton-btnInnerEl"));
            hm.put("edtRegionName", By.id("NewRegion:RegionDetailScreen:Name-inputEl"));
            hm.put("lstCountry", By.id("NewRegion:RegionDetailScreen:Country-inputEl"));
            hm.put("lstTypeRegion", By.id("NewRegion:RegionDetailScreen:RegionDetailDV:zoneType-inputEl"));
            hm.put("eleUpdateBtn", By.id("NewRegion:RegionDetailScreen:Update-btnInnerEl"));
            hm.put("eleAddBtn", By.id("GroupDetailPage:GroupDetailScreen:GroupRegionLV_tb:Add-btnInnerEl"));
            hm.put("edtGroupRegionName", By.id("GroupRegionPopup:GroupRegionPopupScreen:RegionSearchDV:Name-inputEl"));
            hm.put("eleRegions", By.id("GroupDetailPage:GroupDetailScreen:GroupDetail_RegionsCardTab-btnInnerEl"));
            hm.put("eleSearchBtnBrowseGroup", By.id("GroupRegionPopup:GroupRegionPopupScreen:RegionSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
            hm.put("eleResestBtnBrowseGroup", By.id("GroupRegionPopup:GroupRegionPopupScreen:RegionSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset"));
            hm.put("eleSelectRegionTable", By.id("GroupRegionPopup:GroupRegionPopupScreen:RegionSearchResultsLV-body"));
            hm.put("eleGroupSearch", By.id("AdminGroupSearchPage:GroupSearchScreen:ttlBar"));
            hm.put("eleActionsNewGroupPg", By.id("NewGroup:GroupDetailScreen:ttlBar"));
            hm.put("eleSelectBrowseGrpBtn", By.id("GroupRegionPopup:GroupRegionPopupScreen:RegionSearchResultsLV_tb:GroupRegionPopup_SelectButton-btnInnerEl"));
            hm.put("eleGroupScreenRegion", By.id("GroupRegionPopup:__crumb__"));
            hm.put("eleDeleteBtnRegions", By.id("RegionsPage:RegionsScreen:RegionSearchResultsLV_tb:Regions_DeleteButton-btnInnerEl"));
            hm.put("eleRegionsTable", By.id("RegionsPage:RegionsScreen:RegionSearchResultsLV-body"));
            hm.put("eleGrpTableAdd", By.id("GroupDetailPage:GroupDetailScreen:GroupRegionLV-body"));

            //MyActivities
            hm.put("lstActivityDuration", By.id("DesktopActivities:DesktopActivitiesScreen:DesktopActivitiesLV:activitiesFilter-inputEl"));
            hm.put("eleAssignActivityPopup", By.id("AssignActivitiesPopup:AssignmentPopupScreen:ttlBar"));
            hm.put("eleCloseButton", By.id("DesktopActivities:DesktopActivitiesScreen:DesktopActivitiesLV_tb:DesktopActivities_SkipButton-btnInnerEl"));
            hm.put("eleCompleteButton", By.id("DesktopActivities:DesktopActivitiesScreen:DesktopActivitiesLV_tb:DesktopActivities_CompleteButton-btnInnerEl"));
             
            //Preferences
            hm.put("eleClickPreferences", By.id("TabBar:PrefsTabBarLink-textEl"));
            hm.put("eleVerifyPreferencePage", By.id("wsTabBar:wsTab_0-btnInnerEl"));
            hm.put("elePrefUpdate", By.id("UserPreferencesWorksheet:UserPreferencesScreen:Update-btnInnerEl"));
            hm.put("eleVerifyActivityPage", By.id("DesktopActivities:DesktopActivitiesScreen:0"));
           
            //MyAccounts
            hm.put("eleMyAccounts", By.id("Desktop:MenuLinks:Desktop_DesktopAccounts"));
            hm.put("lstAccDuration", By.id("DesktopAccounts:DesktopAccountsScreen:DesktopAccountsLV:accountsFilter-inputEl"));
            hm.put("eleMyAcctbl", By.id("DesktopAccounts:DesktopAccountsScreen:DesktopAccountsLV-body"));
              
            // classifications
            hm.put("eleMMClassification",By.id("AccountFile:MenuLinks:AccountFile_AccountFile_Classification_Ext"));
            hm.put("eleClassificationRefresh",By.id("AccountFile_Classification_Ext:Account_Classification_ExtScreen:Refresh-btnEl"));
            hm.put("eleMMClassGuideDetailTitle",By.id("AccountFile_Classification_Ext:Account_Classification_ExtScreen:ttlBar-btnEl"));
            hm.put("eleClassificationErrorMsg", By.id("AccountFile_Classification_Ext:Account_Classification_ExtScreen:_msgs"));
            hm.put("eleSCClassification", By.id("AccountFile:MenuLinks:AccountFile_AccountFile_Classification_Ext2"));
            hm.put("eleSCRefresh", By.id("AccountFile_Classification_Ext:Account_Classification_ExtScreen:Refresh-btnInnerEl"));
            hm.put("eleClassificationAssert", By.id("AccountFile_Classification_Ext:Account_Classification_ExtScreen:ttlBar"));
            hm.put("eleMMClassificationPolicyTerms", By.id("AccountFile_Classification_Ext:Account_Classification_ExtScreen:Classification_PolicyTermInfo_ExtLV_header"));                         
            hm.put("elePolicyTermsAssert", By.id("AccountFile_Classification_Ext:Account_Classification_ExtScreen:Classification_PolicyTermInfo_ExtLV_header_hd-textEl"));
            
            //CUE SUBMISSION
            hm.put("eleCueButton", By.id("PSPolicyTerm_Ext_Info:CueButton-btnInnerEl"));

            //CUE Policy Summary
            hm.put("elePolicySummary_EffectiveDate", By.id("HIGPolicyFile_Summary:PolicyPerEffDate-inputEl"));
            hm.put("elePolicySummary_ExpirationDate", By.id("HIGPolicyFile_Summary:PolicyPerExpirDate-inputEl"));
            hm.put("eleDriver_SelectUser", By.xpath("//div[@class='x-grid-cell-inner x-grid-cell-inner-checkcolumn']/img"));
            hm.put("lstWC_PlanID", By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:WC7CoverageOptionsScreen:WC7OptionsPanelSet:WCOptionsCV:WC7ParticipationPlanOptionDV:PlanID-inputEl"));
            hm.put("eljActions", By.xpath(".//*[contains(@id,'MenuActions-btnInnerEl')]"));
            hm.put("eleShellPolicyNoteName", By.id("x-form-el-HIGPolicyFile_Notes:PolicyShell_Notes_ExtScreen:NotesLV:0:NoteRowSet:Subject"));
            hm.put("eljForceDMV", By.id("HIGPolicy_Drivers:DriversPanelSet:forceDMV"));
            hm.put("eljCLAAccountNumber", By.id("HIGPolicyFile:PSPolicyTerm_ExtInfoBar:HIGAccountNumber-btnInnerEl"));
            hm.put("eljMergePolicy", By.id("AccountFile_MovePoliciesSelection:MovePoliciesButton"));
            hm.put("edtActivityEdit_Description", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:Description-inputEl"));
            hm.put("lstEdit_ActivityStatus", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailDV:ActivityStatus-inputEl"));
            hm.put("eleActivity_CompleteButton", By.id("ActivityDetailWorksheet:ActivityDetailScreen:ActivityDetailToolbarButtonSet:ActivityDetailToolbarButtons_CompleteButton"));
//          hm.put("eleNaviToHistory_LeftPane", By.xpath(".//span[contains(text(), 'History')]"));
            hm.put("eljCLADvrUpdate", By.id("HIGPolicy_Drivers:DriversPanelSet:Update-btnInnerEl"));
            hm.put("eleLocation_Number",By.id("AccountFile_Locations:AccountFile_LocationsScreen:AccountFile_LocationsLV:0:Loc"));
            hm.put("eleLocationState", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
            hm.put("eleLocationCountry", By.id("AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl"));
            hm.put("txtLicenseErrorMsg", By.xpath(".//*[@id='HIGNewDriverPopup:_msgs']/div[1]"));
            hm.put("eleAccountSummary_PolicyNumber", By.id("AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_WorkOrdersLV:0:PolicyNumber"));
            
            // New Objects
            hm.put("elePursueNextyr", By.id("PSDeclineReasonExtPopup:RejectScreen:PSRejectReasonExtDV:PursueNextYear_true-inputEl"));
            hm.put("lstSuccessfulCarrier", By.id("PSDeclineReasonExtPopup:RejectScreen:PSRejectReasonExtDV:SuccessfulCarrier-inputEl"));
            hm.put("edtSuccessfulCaramt", By.id("PSDeclineReasonExtPopup:RejectScreen:PSRejectReasonExtDV:SuccessfulPremium-inputEl"));
            hm.put("eleCLAPolicySymbol", By.id("PSPolicyTerm_Ext_Info:PSPolicyTerm_ExtDV:PolicyNumberInputSet:PolicySymbol-inputEl"));
            hm.put("edtSORNPNFirstName", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:NPNFirstName-inputEl"));
            hm.put("edtSORNPNLastName", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:NPNLastName-inputEl"));
            hm.put("edtSORNPNMiddleName", By.id("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:NPNMiddleInitial-inputEl"));
            hm.put("eleCompPolTrantbl", By.id("HIGPolicyFile_Summary:PSPolicy_Summary_TransactionsLV-body"));
            hm.put("edtMTEndorsementNum", By.id("PSMaintenanceTransactionDetails_ExtPopup:endorsementNumber-inputEl"));
            hm.put("eleMTIsPreBeaEnd", By.id("PSMaintenanceTransactionDetails_ExtPopup:permiumBearingEndorsement-inputEl"));
            hm.put("edtMTChangeNar", By.id("PSMaintenanceTransactionDetails_ExtPopup:changeNarrative-inputEl"));
            hm.put("edtMTAnnualPre", By.id("PSMaintenanceTransactionDetails_ExtPopup:annualPremium-inputEl"));
            hm.put("edtMTNameReq", By.id("PSMaintenanceTransactionDetails_ExtPopup:requestorName-inputEl"));
            hm.put("elePCSUMBillingMethod", By.id("HIGPolicyFile_Summary:BillingInformationDV:BillingMethod-inputEl"));
            hm.put("edtMTAuditCost", By.id("PSMaintenanceTransactionDetails_ExtPopup:totalAuditedCost-inputEl"));                    
            hm.put("edtMTAuditEffDate", By.id("PSMaintenanceTransactionDetails_ExtPopup:auditEffDate-inputEl"));
            hm.put("eleMTleftMaintenanceTran", By.xpath(".//span[contains(text(),'Maintenance Transaction')]"));
            hm.put("eleMTPayment", By.id("PSMaintenanceTransactionDetails_ExtPopup:AMPPaymentTab-btnInnerEl"));
            hm.put("edtMTTranPreAmt", By.id("PSMaintenanceTransactionDetails_ExtPopup:PSMaintTxnAMPPaymentDV:AMPTransactionPremAmount-inputEl"));
            hm.put("btnMTPremRet", By.id("PSMaintenanceTransactionDetails_ExtPopup:PSMaintTxnAMPPaymentDV:totTransPremiumType_option1-inputEl"));
            
            //Team Submission  
            hm.put("elePolicy", By.id("TabBar:PolicyTab-btnEl"));
            hm.put("eleTeam", By.id("TabBar:TeamTab-btnInnerEl"));
            hm.put("eleTeamSubmissions", By.xpath(".//*[@id='TeamGroup:MenuLinks:TeamGroup_TeamSubmissions']/div//span"));
            hm.put("eleTeamActivities", By.xpath("//td[@id='TeamGroup:MenuLinks:TeamGroup_TeamActivities']//span[text()='Activities']"));
            hm.put("eljTeamSubmissions", By.xpath(".//*[@id='TeamGroup:MenuLinks:TeamGroup_TeamSubmissions']/div//span"));
            hm.put("eleTeamRenewals", By.id("TeamGroup:MenuLinks:TeamGroup_TeamRenewals"));
            //hm.put("eleTeamOtherPolicyTransactions", By.xpath("//td[@id='TeamGroup:MenuLinks:TeamGroup_TeamOtherWorkOrders']//span[text()='Other Policy Transactions']"));
            hm.put("eleTeamOtherPolicyTransactions", By.xpath("//*[@id='TeamGroup:MenuLinks:TeamGroup_TeamOtherWorkOrders']//span[text()='Other Policy Transactions']"));
            hm.put("elePolicySummary", By.id("PolicyFile_Summary:Policy_SummaryScreen:0"));
            hm.put("eleMyGroupSummaryPage", By.xpath("//span[@id='TeamSummary:TeamSummaryScreen:0' and contains(text(),'My Groups: Summary')]"));
            hm.put("eleMyGroupActivities", By.xpath("//span[@id='TeamActivities:TeamActivitiesScreen:0' and contains(text(),'My Groups: Activities')]"));
            hm.put("eleMyGroupSubmission", By.xpath("//span[@id='TeamSubmissions:TeamSubmissionsScreen:0' and contains(text(),'My Groups: Submissions')]"));
            hm.put("eleMyGroupRenewals", By.xpath("//span[@id='TeamRenewals:TeamRenewalsScreen:0' and contains(text(),'My Groups: Renewals')]"));
            hm.put("eleMyGroupPendingTransactions", By.xpath("//span[@id='TeamOtherWorkOrders:TeamOtherWorkOrdersScreen:0' and contains(text(),'My Groups: Other Pending Policy Transactions')]"));
            hm.put("lstTeamTypeSubmission", By.id("TeamSubmissions:TeamSubmissionsScreen:TeamSubmissionsToolbar:higSubmissionFilter-inputEl"));
            hm.put("eleSelectTransacFromTable", By.id("TeamSubmissions:TeamSubmissionsScreen:TeamSubmissionsLV-body"));
            hm.put("elePolicyInfoSaveDraft", By.id("PSPolicyTerm_Ext_Info:SaveDraftButton-btnInnerEl"));
            hm.put("eleSelectActivityFromTable", By.id("TeamActivities:TeamActivitiesScreen:TeamActivitiesLV-body"));
            hm.put("eleAssignBtn", By.id("TeamActivities:TeamActivitiesScreen:TeamActivitiesLV_tb:TeamGroupActivities_Assign-btnInnerEl"));
            hm.put("eleAssignCancelBtn", By.id("AssignActivitiesPopup:AssignmentPopupScreen:AssignmentPopupScreen_CancelButton-btnInnerEl"));
            hm.put("eleMisassignedActivitiesMyGroup", By.id("treeview-1182-record-0:0"));
            hm.put("eleAssignActivityScreen", By.xpath("//span[@id='AssignActivitiesPopup:AssignmentPopupScreen:ttlBar' and contains(text(),'Assign Activities')]"));
            hm.put("eleActivtyTable", By.xpath("//div[@id='TeamActivities:TeamActivitiesScreen:TeamActivitiesLV-body']"));
            hm.put("eleTeam_SubmissionTable", By.xpath("//div[@id='TeamSubmissions:TeamSubmissionsScreen:TeamSubmissionsLV-body']"));
            hm.put("eleTeam_RenewalTable", By.xpath("//div[@id='TeamRenewals:TeamRenewalsScreen:TeamRenewalsLV-body']"));
            //hm.put("eleTeam_RenewalTable", By.xpath("//div[@id='TeamRenewals:TeamRenewalsScreen:TeamRenewalsLV-body']"));
            hm.put("edtTeam_Filter", By.xpath("//input[contains(@id,'Filter-inputEl')]"));
            hm.put("eleGrp_InQueue", By.xpath("//div[@id='Team:TeamMenuTree:TeamTreeView-body']//span[contains(@class,'x-tree-node-text') and text()='In Queue']"));
            hm.put("eleInQueuePage", By.xpath("//span[@id='TeamActivities:TeamActivitiesScreen:0' and contains(text(),'In Queue: Activities')]"));
            hm.put("eleTeam_InQueueTble", By.xpath("//div[@id='TeamActivities:TeamActivitiesScreen:TeamActivitiesLV-body']"));
            hm.put("ele_ActivityDetail_Title", By.xpath("//span[@id='ActivityDetailWorksheet:ActivityDetailScreen:ttlBar' and contains(text(),'Activity Detail')]"));
            hm.put("eljInQ_Actvty_SubjectLnk", By.xpath("//a[@id='TeamActivities:TeamActivitiesScreen:TeamActivitiesLV:0:Subject']"));   
            hm.put("eleTeam_OtherPendngTransTable", By.xpath("//div[@id='TeamOtherWorkOrders:TeamOtherWorkOrdersScreen:TeamOtherWorkOrdersLV-body']"));
            hm.put("elePremiumFinancing", By.cssSelector("input[id='HIGPolicyFile_Payment_Ext:psBillingAdjustment:PSBillingAdjustment_ExtDV:premiumFinanceIndicator-inputEl'][disabled='']"));
            hm.put("eleClassName", By.className("x-list-plain"));

           //AccountCreation in BC
            
            hm.put("eleAccountTabBC", By.id("TabBar:AccountsTab"));
            hm.put("eleActionsBC", By.id("AccountsGroup:AccountsMenuActions-btnInnerEl"));
            hm.put("eleNewAccountBC", By.id("AccountsGroup:AccountsMenuActions:AccountsMenuActions_NewAccount-textEl"));
            hm.put("eleAccountNumberBC", By.id("AccountGroup:AccountInfoBar:AccountNumber-btnInnerEl"));
            hm.put("edtAccountNameBC", By.id("NewAccount:NewAccountScreen:NewAccountDV:AccountName-inputEl"));
            hm.put("edtTypeBC",By.xpath(".//input[contains(@id,':AccountTypeInput-inputEl')]"));
            hm.put("lstBillingPlanBC", By.id("NewAccount:NewAccountScreen:NewAccountDV:BillingPlan-inputEl"));
            hm.put("lstDelinquencyPlanBC", By.id("NewAccount:NewAccountScreen:NewAccountDV:DelinquencyPlan-inputEl"));
            
            hm.put("eleFixBillDate", By.id("NewAccount:NewAccountScreen:NewAccountDV:FixDueDate_option0-inputEl"));
            hm.put("eleFixDueDate", By.id("NewAccount:NewAccountScreen:NewAccountDV:FixDueDate_option1-inputEl"));
            hm.put("edtInvoiceDayOfMonth", By.id("NewAccount:NewAccountScreen:NewAccountDV:InvoicesFixedOnInputGroup:InvoiceDayOfMonth-inputEl"));
            hm.put("edtFirstDayofMonth", By.id("NewAccount:NewAccountScreen:NewAccountDV:InvoicesFixedOnInputGroup:FirstTwicePerMonthInvoiceDayOfMonth-inputEl"));
            hm.put("edtSecondDayofMonth", By.id("NewAccount:NewAccountScreen:NewAccountDV:InvoicesFixedOnInputGroup:SecondTwicePerMonthInvoiceDayOfMonth-inputEl"));
            hm.put("edtDayofWeek", By.id("NewAccount:NewAccountScreen:NewAccountDV:InvoicesFixedOnInputGroup:InvoiceDayOfWeek-inputEl"));
            hm.put("edtAnchorDate", By.id("NewAccount:NewAccountScreen:NewAccountDV:InvoicesFixedOnInputGroup:EveryOtherWeekInvoiceAnchorDate-inputEl"));
            
            hm.put("lstSendInvoicesByBC", By.id("NewAccount:NewAccountScreen:NewAccountDV:SendInvoicesBy-inputEl"));
            hm.put("eleDefaultPaymentBC", By.id("NewAccount:NewAccountScreen:NewAccountDV:PaymentInstrument:CreateNewPaymentInstrument"));
            hm.put("lstPaymentMethodBC", By.id("NewPaymentInstrumentPopup:PaymentMethod-inputEl"));
            hm.put("edtNewPaymentToken", By.id("NewPaymentInstrumentPopup:Token-inputEl"));
            hm.put("eleNPIOkBC", By.id("NewPaymentInstrumentPopup:Update-btnInnerEl"));
            hm.put("eleAddContactBC", By.id("NewAccount:NewAccountScreen:NewAccountDV:NewAccountContactsLV_tb:addNewContact-btnWrap"));
            hm.put("eleNewPersonBC", By.id("NewAccount:NewAccountScreen:NewAccountDV:NewAccountContactsLV_tb:addNewContact:addNewPerson-textEl"));
            hm.put("edtFirstNameBC", By.id("NewAccountContactPopup:NewAccountContactScreen:AccountContactCV:AccountContactDetailDV:NameInputSet:GlobalPersonNameInputSet:FirstName-inputEl"));
            hm.put("edtLastNameBC", By.id("NewAccountContactPopup:NewAccountContactScreen:AccountContactCV:AccountContactDetailDV:NameInputSet:GlobalPersonNameInputSet:LastName-inputEl"));
            hm.put("edtAddress1BC", By.id("NewAccountContactPopup:NewAccountContactScreen:AccountContactCV:AccountContactDetailDV:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
            hm.put("eleCityBC", By.id("NewAccountContactPopup:NewAccountContactScreen:AccountContactCV:AccountContactDetailDV:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
            hm.put("edtCityBC", By.id("NewAccountContactPopup:NewAccountContactScreen:AccountContactCV:AccountContactDetailDV:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
            hm.put("edtStateBC", By.id("NewAccountContactPopup:NewAccountContactScreen:AccountContactCV:AccountContactDetailDV:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
            hm.put("eleZipcodeBC", By.id("NewAccountContactPopup:NewAccountContactScreen:AccountContactCV:AccountContactDetailDV:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
            hm.put("edtZipcodeBC", By.id("NewAccountContactPopup:NewAccountContactScreen:AccountContactCV:AccountContactDetailDV:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
            hm.put("btnPrimaryPayerYesBC", By.id("NewAccountContactPopup:NewAccountContactScreen:AccountContactCV:AccountContactDetailDV:PrimaryPayer_true-inputEl"));
            hm.put("elePersonOkBC", By.id("NewAccountContactPopup:NewAccountContactScreen:Update-btnInnerEl"));
            hm.put("eleCreateAccountBC", By.id("NewAccount:NewAccountScreen:Update-btnInnerEl"));
            hm.put("eleCreateAccountBC", By.id("NewAccount:NewAccountScreen:Update-btnInnerEl"));
            hm.put("edtMobileNumber",  By.xpath(".//input[contains(@id, 'CellPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl')]"));
            hm.put("btnAddPaymentPlans",By.xpath("//span[contains(@id,':Add-btnWrap')]"));
            hm.put("eleAddPlansBC",By.xpath("//div[contains(@id,':PaymentPlansLV-body')]"));
            hm.put("btnAddPaymentPlansBC",By.xpath(".//span[contains(@id,':AddSelectedPaymentPlans-btnEl')]"));
            hm.put("btnInvoiceStreams",By.xpath(".//span[contains(@id,':addInvoiceStreamButton-btnInnerEl')]"));
            hm.put("edtCountryIS",By.xpath(".//input[contains(@id,':Country')]"));
            hm.put("edtAddressLineIS",By.xpath(".//input[contains(@id,':AddressLine1-inputEl')]"));
            hm.put("edtCityIS",By.xpath(".//input[contains(@id,':City-inputEl')]"));
            hm.put("edtStateIS",By.xpath(".//input[contains(@id,':State-inputEl')]"));
            hm.put("edtZipcodeIS",By.xpath(".//input[contains(@id,':PostalCode-inputEl')]"));
            hm.put("elePaperLessOption",By.xpath(".//input[contains(@id,':PaperLessOptionValues_true-inputEl')]"));
            hm.put("btnUpdateIS",By.xpath(".//span[contains(@id,':Update-btnInnerEl')]"));
            hm.put("btnCloseAccountlS",By.xpath(".//span[contains(@id,':CloseAccountButton-btnInnerEl')]"));
            hm.put("eleMoveToAccount",By.id("AccountPayments:AccountDetailPaymentsScreen:DirectBillPaymentsListDetail:AccountDBPaymentsLV:0:ActionButton:MoveToAccount-itemEl"));
            hm.put("eleSearchMoveAccount",By.id("MoveDirectBillPayment:EditDBPaymentScreen:PaymentDetailsDV:AccountNumber:AccountPicker"));
           //suspense Payment
            hm.put("eleSuspensepayment",By.id("DesktopGroup:MenuLinks:DesktopGroup_DesktopSuspensePayments"));
            hm.put("eleNewSuspensePayment",By.id("DesktopSuspensePayments:DesktopSuspensePaymentsScreen:NewPayment"));
            hm.put("edtSuspenseDate",By.id("NewSuspensePayment:NewSuspensePaymentScreen:NewSuspensePaymentDV:paymentDate-inputEl"));
            hm.put("edtSuspenseAmount",By.id("NewSuspensePayment:NewSuspensePaymentScreen:NewSuspensePaymentDV:amount-inputEl"));
            hm.put("lstPaymentInstrument",By.id("NewSuspensePayment:NewSuspensePaymentScreen:NewSuspensePaymentDV:PaymentInstrument-inputEl"));
            hm.put("edtSuspenseNotes",By.xpath(".//textarea[contains(@id,':Description-inputEl')]"));
            hm.put("eleSearchSuspenseAccount ",By.id("NewSuspensePayment:NewSuspensePaymentScreen:NewSuspensePaymentDV:AccountNumber:AccountPicker"));
            hm.put("eleDesktopTabBC", By.id("TabBar:DesktopTab"));
            hm.put("eleSuspensePay",By.id("DesktopSuspensePayments:DesktopSuspensePaymentsScreen:DesktopSuspensePaymentsLV-body"));
            hm.put("eleSuspenseACPicker",By.id("EditSuspensePaymentPopup:EditSuspensePaymentScreen:EditSuspensePaymentDV:AccountNumber:AccountPicker"));
            hm.put("btnCreateDisbursement",By.id("DesktopSuspensePayments:DesktopSuspensePaymentsScreen:createDisbursement-btnInnerEl"));
            hm.put("edtSuspenseDisDate",By.id("SuspenseCreateDisbursementWizard:CreateSuspenseDisbursementDetailScreen:CreateDisbursementDetailDV:effectiveDate-inputEl"));
            hm.put("lstReasonForDis",By.id("SuspenseCreateDisbursementWizard:CreateSuspenseDisbursementDetailScreen:CreateDisbursementDetailDV:reason-inputEl"));
            hm.put("edtPayeeTo",By.id("SuspenseCreateDisbursementWizard:CreateSuspenseDisbursementDetailScreen:CreateDisbursementDetailDV:payTo-inputEl"));
            hm.put("edtMailToo",By.id("SuspenseCreateDisbursementWizard:CreateSuspenseDisbursementDetailScreen:CreateDisbursementDetailDV:mailTo-inputEl"));
            hm.put("edtMailToAddress",By.id("SuspenseCreateDisbursementWizard:CreateSuspenseDisbursementDetailScreen:CreateDisbursementDetailDV:mailToAddress-inputEl"));
            hm.put("btnSuspense",By.id("SuspenseCreateDisbursementWizard:Next-btnInnerEl"));
            hm.put("btnSusupenseFinish",By.id("SuspenseCreateDisbursementWizard:Finish-btnInnerEl"));
            hm.put("eleAddressVerify",By.id("AccountSummary:AccountSummaryScreen:Address-inputEl"));
            //AccountGroup:MenuLinks:AccountGroup_AccountDetailContacts
            hm.put("eleAccountContacts",By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailContacts"));
            hm.put("btnContactsEdit",By.id("AccountDetailContacts:AccountDetailContactsScreen:Edit-btnInnerEl"));
            hm.put("btnContactsAdd",By.id("AccountDetailContacts:AccountDetailContactsScreen:addNewContact-btnInnerEl"));
            hm.put("eleAddNewContactPerson",By.id("AccountDetailContacts:AccountDetailContactsScreen:addNewContact:addNewPerson-textEl"));
            hm.put("eleSearchTab",By.id("TabBar:SearchTab"));
            hm.put("elePRSearch",By.id("SearchGroup:MenuLinks:SearchGroup_PaymentRequestSearch"));
            hm.put("lstPaymentMethod",By.id("PaymentRequestSearch:PaymentRequestSearchScreen:PaymentRequestSearchDV:MethodCriterion-inputEl"));
            hm.put("lstStatus",By.id("PaymentRequestSearch:PaymentRequestSearchScreen:PaymentRequestSearchDV:StatusCriterion-inputEl"));
            hm.put("edtMinimumAmount",By.id("PaymentRequestSearch:PaymentRequestSearchScreen:PaymentRequestSearchDV:MinAmountCriterion-inputEl"));
            hm.put("edtMaximumAmount",By.id("PaymentRequestSearch:PaymentRequestSearchScreen:PaymentRequestSearchDV:MaxAmountCriterion-inputEl"));
            hm.put("eleSearchPR",By.id("PaymentRequestSearch:PaymentRequestSearchScreen:PaymentRequestSearchDV:SearchAndPrintLinksInputSet:Search"));
            hm.put("elePrintExportAndImport",By.id("PaymentRequestSearch:PaymentRequestSearchScreen:PaymentRequestSearchDV:SearchAndPrintLinksInputSet:PrintAndExport"));
            hm.put("eleIEOk", By.id("PrintOptionPopup:PrintOptionPopupScreen:Ok-btnInnerEl"));
            hm.put("eleCustomExport",By.id("PrintOptionPopup:PrintOptionPopupScreen:PrintOptionDV:CustomExportChoice_Choice-inputEl"));
            hm.put("eleCustomSelect",By.id("PrintOptionPopup:PrintOptionPopupScreen:PrintOptionDV:CustomCsvColumnsLV-body"));
            hm.put("eleOpen",By.xpath(".//span[text()='Open']"));
            hm.put("eleEditAccDetails",By.id("AccountFile_Summary:AccountFile_SummaryScreen:EditAccount-btnEl"));
            hm.put("eleAccountSearchButton1", By.xpath(".//a[contains(@id,':SearchAndPrintLinksInputSet:Search')]"));
            hm.put("edtSuspenseNotes", By.xpath(".//textarea[contains(@id,'EditSuspensePaymentDV:Description-inputEl')]"));
            //Edit Account
            hm.put("eleActionsDetails", By.xpath(".//*[@id='AccountGroup:MenuLinks:AccountGroup_AccountOverview:AccountOverview_AccountDetailSummary']/div"));
            hm.put("btnEditAccountDetails", By.id("AccountDetailSummary:AccountDetailSummaryScreen:Edit-btnInnerEl"));
            hm.put("edtEditInvoiceDayofMonth", By.id("AccountDetailSummary:AccountDetailSummaryScreen:AccountDetailDV:InvoicesFixedOnInputGroup:InvoiceDayOfMonth-inputEl"));
            hm.put("btnEditAccountUpdate", By.id("AccountDetailSummary:AccountDetailSummaryScreen:Update-btnInnerEl"));
            hm.put("btnEditAccUpdateConfirm", By.xpath("html/body/div[11]/div[3]/div/div/a[1]/span/span"));
            //Add Policy to Account in BC
            //hm.put("", By.id(""));
            hm.put("eleAccountActions", By.id("AccountGroup:AccountDetailMenuActions-btnEl"));
            hm.put("elePolicyActions",By.id("PolicyGroup:PolicyDetailMenuActions-btnEl"));
            hm.put("eleAddPolicy", By.id("AccountGroup:AccountDetailMenuActions:AccountDetailMenuActions_NewPolicy-textEl"));
            hm.put("edtPolicyNumberBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:PolicyNumber-inputEl"));        
            hm.put("edtAnotherPolicyNumberBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:PolicyNumber-inputEl"));        

            hm.put("edtDoingbusinessasBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:DBA-inputEl"));
            hm.put("edtEffectiveDateBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:PolicyPerEffDate-inputEl"));
            hm.put("edtExpirationDateBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:PolicyPerExpirDate-inputEl")); 
            hm.put("eleEffectiveDateBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:PolicyPerEffDate-inputEl"));
            hm.put("eleExpirationDateBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:PolicyPerExpirDate-inputEl"));            
            hm.put("lstProductBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:PolicyLOB-inputEl"));
            hm.put("btnAssignedRiskYesBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:AssignedRisk_true-inputEl"));
            hm.put("btnAssignedRiskNoBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:AssignedRisk_false-inputEl"));
            hm.put("lstJurisdictionBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:RiskJurisdiction-inputEl"));
            hm.put("lstUWCompanyBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:UWCompany-inputEl"));
            hm.put("lstSecurityZoneBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:SecurityZone-inputEl"));
            hm.put("edtUnderwriterBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:Underwriter-inputEl"));
            hm.put("btnEligibleForFullPayDiscountYesBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:EligibleForFullPayDiscount_true-inputEl"));
            hm.put("btnEligibleForFullPayDiscountNoBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:EligibleForFullPayDiscount_false-inputEl"));
            hm.put("btnRequireFinalAuditYesBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:RequireFinalAudit_true-inputEl"));
            hm.put("btnRequireFinalAuditNoBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:RequireFinalAudit_false-inputEl"));
            hm.put("edtDirectBillBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:BillingMethod-inputEl"));
            hm.put("edtOverridingPayerAccountBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:OverridingPayerAccount-inputEl"));
            hm.put("lstPaymentplanBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:PaymentPlan-inputEl"));
            hm.put("lstOverridingInvoiceStreamBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:OverridingInvoiceStream-inputEl"));
            hm.put("lstDelinquencyplanBC", By.id("NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:DelinquencyPlan-inputEl"));
            hm.put("eleNextPolicyWizardBC", By.id("NewPolicyWizard:Next-btnInnerEl"));
            hm.put("eleAddPremium", By.xpath(".//span[contains(@id,':Add-btnInnerEl')]"));
            hm.put("elePremiumTable", By.xpath(".//div[contains(@id,':PolicyAddChargesLV-body')]"));
            hm.put("edtPremiumAmount", By.name("Amount"));
            hm.put("eleFinish", By.xpath(".//span[contains(@id,'Finish-btnInnerEl')]"));
            hm.put("eleBatchProcess", By.id("BatchProcessInfo:BatchProcessScreen:BatchProcessesLV-body"));
            hm.put("eleBatchActions", By.id("ServerTools:InternalToolsMenuActions-btnEl"));
            hm.put("eleReturntoBillingCenter", By.id("ServerTools:InternalToolsMenuActions:ReturnToApp-textEl"));
            hm.put("edtaccountNumberBC", By.xpath(".//input[contains(@id,':AccountNumberCriterion-inputEl')]"));
            hm.put("eleAccountSearchButton", By.xpath(".//a[contains(@id,'SearchAndPrintLinksInputSet:Search')]"));
          //  Accounts:AccountSearchScreen:AccountSearchDV:SearchAndPrintLinksInputSet:Search
            hm.put("eleBatchRefresh", By.id("BatchProcessInfo:BatchProcessScreen:BatchProcessesLV_tb:refresh"));
            hm.put("eleAccountResult", By.xpath(".//a[contains(@id,'ResultsLV:0:AccountNumber')]"));
            hm.put("eleAccountResult1", By.xpath(".//a[contains(@id,'AccountSearchResultsLV:0:_Select')]"));
            hm.put("eleAccountResult2", By.xpath(".//a[contains(@id,'AccountSearchResultsLV:0:Select')]"));
            hm.put("eleSearchPolicyResult", By.xpath(".//a[contains(@id,'ResultsLV:0:PolicyNumber')]"));
            hm.put("eleAccountSummaryBC",By.id("AccountSummary:AccountSummaryScreen:ttlBar"));
            hm.put("eleInvoices", By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailInvoices")); 
            hm.put("eleInvoicetable", By.id("AccountDetailInvoices:AccountDetailInvoicesScreen:DetailPanel:AccountInvoicesLV-body"));
            hm.put("eleMenuPayment", By.id("AccountGroup:AccountDetailMenuActions:AccountDetailMenuActions_Payments-arrowEl"));
            hm.put("eleNewDirectBillPayment", By.id("AccountGroup:AccountDetailMenuActions:AccountDetailMenuActions_Payments:AccountDetailMenuActions_NewDirectBillPayment-itemEl"));
            hm.put("eleOverrideDistribution", By.xpath(".//span[contains(@id, 'OverrideModeButton-btnInnerEl')]"));
            hm.put("edtDirectbillpaymentamout", By.id("NewDirectBillPayment:EditDBPaymentScreen:PaymentDetailsDV:Amount-inputEl"));
            hm.put("eleDirectbillpaymentAdditem", By.xpath(".//span[contains(@id,'EditDBPaymentScreen:AddItems-btnInnerEl')]"));
            hm.put("eleAdditemsearch", By.id("DirectBillAddInvoiceItemsPopup:InvoiceItemSearchPanelSet:SearchAndResetInputSet:SearchLinksInputSet:Search"));
            hm.put("eleAdditemList", By.id("DirectBillAddInvoiceItemsPopup:InvoiceItemSearchPanelSet:InvoiceItemsLV-body"));
            hm.put("eleSelectAllInvoices", By.xpath("//div[@id ='DirectBillAddInvoiceItemsPopup:InvoiceItemSearchPanelSet:InvoiceItemsLV']/div[2]/div/div/div[1]/div"));
            hm.put("eleSelectInvoiceItems", By.id("DirectBillAddInvoiceItemsPopup:SelectInvoiceItems-btnInnerEl"));
            
            hm.put("eleExecute", By.id("NewDirectBillPayment:EditDBPaymentScreen:Update-btnInnerEl"));
            hm.put("btnNewExecute",By.xpath(".//span[contains(@id, 'Update-btnInnerEl')]"));
            
            hm.put("elePolicyHistory",By.id("PolicyGroup:MenuLinks:PolicyGroup_PolicyDetailHistory"));
           // Account Details 
            hm.put("eleDetailsBC", By.xpath(".//td[contains(@id, 'AccountOverview_AccountDetailSummary')]"));
            hm.put("btnEditBC", By.xpath(".//span[contains(@id, 'Edit-btnInnerEl')]"));
            hm.put("edtDeliquencyBC", By.xpath(".//input[contains(@id, 'DelinquencyPlan-inputEl')]"));
            hm.put("btnUpdate1BC", By.xpath(".//span[contains(@id, 'Update-btnInnerEl')]"));

            
          //Administration
            hm.put("eleAdministration", By.id("TabBar:AdministrationTab"));
            hm.put("eleBusinesssettings", By.id("Admin:MenuLinks:Admin_BusinessSettings"));
            hm.put("eleBusinessplans", By.xpath(".//*[@id='Admin:MenuLinks:Admin_BusinessSettings:BusinessSettings_BillingPlans']/div/span"));
            hm.put("elePersonallinebilling", By.id("BillingPlans:BillingPlansScreen:BillingPlansLV:0:Name"));
            hm.put("eleDelayDisbursement", By.id("BillingPlanDetail:BillingPlanDetailScreen:BillingPlanDetailDV:DelayDisbursementLink"));
            hm.put("eleDelayDisbursementTbl", By.id("FeeOverrides_Ext:FeeOverridesScreen:DelayDisbursement_ExtLV-body"));
            hm.put("elePaymentReversalFeesTbl", By.id("FeeOverrides_Ext:FeeOverridesScreen:PaymentReversalFees_AcgLV-body"));
            hm.put("eleInvoiceFeesTbl", By.id("FeeOverrides_Ext:FeeOverridesScreen:InvoiceFees_ExtLV-body"));
            hm.put("eleInvoicesFeesTab", By.id("FeeOverrides_Ext:FeeOverridesScreen:InvoiceFeesCVTab-btnInnerEl"));
            hm.put("elePaymentReversalFeesTab", By.id("FeeOverrides_Ext:FeeOverridesScreen:PaymentReversalFeesCVTab-btnInnerEl"));
            hm.put("elePaymentAllocationPlans", By.id("Admin:MenuLinks:Admin_BusinessSettings:BusinessSettings_PaymentAllocationPlans"));
            hm.put("eleAllocationQ",By.id("PaymentAllocationPlanDetail:PaymentAllocationPlanDetailScreen:DistributionFilterLV-body"));
            hm.put("eleAllocationQ2",By.id("PaymentAllocationPlanDetail:PaymentAllocationPlanDetailScreen:InvoiceItemOrderingLV-body"));
            hm.put("elePaymentAlTable", By.id("PaymentAllocationPlans:PaymentAllocationPlansScreen:PaymentAllocationPlansLV-body"));

            
          //Invoicestream
            hm.put("eleInvoiceStreams", By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailInvoiceStreams"));
            hm.put("eleInvoiceStreamEditbtn", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:Edit"));
            hm.put("edtInvoiceStreamDescription", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:Description-inputEl"));
            hm.put("eleInvoiceStreamOverrideInvoiceYes", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:InvoiceStreamAnchorDateInputSet:OverrideInvoiceDayOfMonth_true-boxLabelEl"));
            hm.put("eleInvoiceStreamOverrideInvoiceNo", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:InvoiceStreamAnchorDateInputSet:OverrideInvoiceDayOfMonth_false-inputEl"));
            hm.put("edtInvoiceStreamOverrideinvoiceday", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:InvoiceStreamAnchorDateInputSet:OverridingInvoiceDayOfMonth-inputEl"));
            hm.put("eleInvoiceStreamBillDateOrDueDateBillingYes", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:OverrideBillDateOrDueDateBilling_true-inputEl"));
            hm.put("eleInvoiceStreamBillDateOrDueDateBillingNo", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:OverrideBillDateOrDueDateBilling_false-inputEl"));
            hm.put("eleInvoiceStreamOverridingBillDate", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:OverridingBillDateOrDueDateBilling_option0-inputEl"));
            hm.put("eleInvoiceStreamOverridingDueDateBilling", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:OverridingBillDateOrDueDateBilling_option1-inputEl"));
            hm.put("eleInvoiceStreamOverrideinstrumentYes", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:OverridePaymentInstrument_true-inputEl"));
            hm.put("eleInvoiceStreamOverrideinstrumentNo", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:OverridePaymentInstrument_false-inputEl"));
            hm.put("lstInvoiceStreamOverrideinstrument", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:OverridingPaymentInstrument-inputEl"));
            hm.put("edtInvoiceStreamInvoiceOwner", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:InvoiceOwner-inputEl"));
            hm.put("lstInvoiceStreamCountry", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:globalAddressContainer:GlobalAddressInputSet:Country-inputEl"));
            hm.put("edtInvoiceStreamAddressLine1", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
            hm.put("edtInvoiceStreamAddressLine2", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:globalAddressContainer:GlobalAddressInputSet:AddressLine2-inputEl"));
            hm.put("edtInvoiceStreamAddressLine3", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:globalAddressContainer:GlobalAddressInputSet:AddressLine3-inputEl"));
            hm.put("edtInvoiceStreamCountry", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:globalAddressContainer:GlobalAddressInputSet:City-inputEl"));
            hm.put("edtInvoiceStreamCounty", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:globalAddressContainer:GlobalAddressInputSet:County-inputEl"));
            hm.put("lstInvoiceStreamstate", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:globalAddressContainer:GlobalAddressInputSet:State-inputEl"));
            hm.put("edtInvoiceStreamPostalCode", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl"));
            hm.put("eleInvoiceStreamMail", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:PaperLessOption_true-inputEl"));
            hm.put("eleInvoiceStreamEmail", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:PaperLessOption_false-inputEl"));
            hm.put("edtInvoiceStreamEmail", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:Email-inputEl"));
            hm.put("eleInvoiceStreamLeadTimeYes", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:OverrideInvoicingLeadTime_true-inputEl"));
            hm.put("eleInvoiceStreamLeadTimeNo", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:OverrideInvoicingLeadTime_false-inputEl"));
            hm.put("edtInvoiceStreamLeadTime", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:AccountInvoiceStreamDetailDV:OverridingLeadTimeDayCount-inputEl"));
            hm.put("eleInvoiceStreamUpdatebtn", By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:Update-btnInnerEl"));
            hm.put("btnInvoiceStreamConfirm", By.id("button-1005-btnEl"));
           
		    //Search screen BC
            hm.put("eleMenuLnkAccount", By.id("SearchGroup:MenuLinks:SearchGroup_AccountSearch"));
            hm.put("eleMenuLnkPolicies", By.id("SearchGroup:MenuLinks:SearchGroup_PolicySearch"));
            hm.put("edtSearchAccountBC", By.xpath("//input[contains(@id, 'AccountNumberCriterion-inputEl')]"));
            hm.put("edtSearchPolicyBC", By.xpath("//input[contains(@id, 'PolicyNumberCriterion-inputEl')]"));
            hm.put("eleSearchbtnBC", By.xpath("//a[contains(@id,'SearchAndResetInputSet:SearchLinksInputSet:Search')]"));
            hm.put("eleSearchTblBC", By.xpath("//div[contains(@id, 'SearchResultsLV-body')]"));
            //PolicyHistory
            hm.put("elePolicyHistoryBC",By.id("PolicyDetailHistory:PolicyDetailHistoryScreen:PolicyDetailHistoryLV-body"));
            
           
           //Invoices
            hm.put("eleChangeInvoicedatesBC", By.id("AccountDetailInvoices:AccountDetailInvoicesScreen:DetailPanel:InvoiceDetailDV_tb:Edit-btnEl"));
            hm.put("eleUpdateInvoicedatesBC", By.id("AccountDetailInvoices:AccountDetailInvoicesScreen:DetailPanel:InvoiceDetailDV_tb:Update-btnInnerEl"));
            hm.put("eleBilldateBC", By.id("AccountDetailInvoices:AccountDetailInvoicesScreen:DetailPanel:InvoiceDetailDV:InvoiceDate-inputEl"));
            hm.put("eleDueDateBC", By.id("AccountDetailInvoices:AccountDetailInvoicesScreen:DetailPanel:InvoiceDetailDV:PaymentDueDate-inputEl"));
            hm.put("eleOK", By.xpath(".//span[text()='OK']"));
            hm.put("lstAggregattionType", By.xpath("//input[contains(@id, 'AggregationTypeSelector-inputEl')]"));
            
            hm.put("eleAggregationTypeTable", By.id("AccountDetailInvoices:AccountDetailInvoicesScreen:DetailPanel:InvoiceItemsLV-body"));
            hm.put("eleDisbursements",By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailDisbursements"));
            hm.put("eleOverview", By.id("AccountGroup:MenuLinks:AccountGroup_AccountOverview"));
            
           //Policies 
         //  hm.put("eleMenuLnkPolicies", By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailPolicies"));
           hm.put("eleMenuLnkPoliciesBC", By.xpath(".//td[contains(@id,':AccountGroup_AccountDetailPolicies')]"));
      
            hm.put("elePoliciesTblBC", By.xpath("//tbody[@id='AccountDetailPolicies:AccountDetailPoliciesScreen:OwnedTabTab:panelId-tbody']"));
            hm.put("eleInvoiceBC",By.id("AccountDetailPolicies:AccountDetailPoliciesScreen:0:OwnedPolicyPeriods:PolicyPeriodPanelLV:0:InvoiceStream") );
            hm.put("eleInvoice1BC", By.id("AccountDetailPolicies:AccountDetailPoliciesScreen:1:OwnedPolicyPeriods:PolicyPeriodPanelLV:0:InvoiceStream") );
            hm.put("eleAccountNumBC", By.id("PolicyGroup:PolicyInfoBar:AccountNumber-btnEl"));
            hm.put("elePolicyValueBC", By.id("PolicySummary:PolicySummaryScreen:PolicyValue-inputEl"));
            hm.put("elePolicies",By.id("AccountDetailPolicies:AccountDetailPoliciesScreen:0:OwnedPolicyPeriods:PolicyPeriodPanelLV:0:Number"));
            hm.put("elePolicies1", By.id("AccountDetailPolicies:AccountDetailPoliciesScreen:1:OwnedPolicyPeriods:PolicyPeriodPanelLV:0:Number"));
            //payment schedule
            hm.put("elePaymentSchedule",By.id("PolicyGroup:MenuLinks:PolicyGroup_PolicyDetailPayments"));
            hm.put("btnEditPlan",By.id("PolicyDetailPayments:PolicyDetailPaymentsScreen:ChangePaymentPlan-btnInnerEl"));
            hm.put("edtNewPaymentPlan",By.id("ChangePaymentPlanPopup:PaymentPlan-inputEl"));
            hm.put("btnExecute", By.id("ChangePaymentPlanPopup:Update-btnInnerEl"));
            hm.put("eleAccNumber",By.id("PolicyGroup:PolicyInfoBar:AccountNumber-btnInnerEl"));
            hm.put("eleSuspenseCards",By.xpath(".//*[contains(@id,'SuspenseItemCardTab')]"));
            hm.put("eleSuspenseAmount",By.id("AccountSummary:AccountSummaryScreen:Suspense-inputEl"));
            hm.put("eleModifyPay",By.id("AccountPayments:AccountDetailPaymentsScreen:DirectBillPaymentsListDetail:AccountDBPaymentsLV:0:ActionButton:ModifyDistribution-textEl"));
            hm.put("btnRemove",By.xpath(".//*[contains(@id,'Remove-btnInnerEl')]"));
           //History
            hm.put("eleHistoryTabBC", By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailHistory"));
            hm.put("eleHistoryTableBC", By.id("AccountDetailHistory:AccountDetailHistoryScreen:AccountDetailHistoryLV-body"));
            
           
           //Create Account in BC
            hm.put("eleInvoiceByBC", By.id("NewAccount:NewAccountScreen:NewAccountDV:BillingLevelInvoiceByAccount_false-inputEl"));
            hm.put("eleInvoiceByAccountBC", By.id("NewAccount:NewAccountScreen:NewAccountDV:BillingLevelInvoiceByAccount_true-inputEl"));

            hm.put("eleSeperateIFByBC",By.id("NewAccount:NewAccountScreen:NewAccountDV:BillingLevelSeparateIncomingFundsByAccount_false-inputEl"));
            hm.put("eleSeperateIFByAccountBC",By.id("NewAccount:NewAccountScreen:NewAccountDV:BillingLevelSeparateIncomingFundsByAccount_true-inputEl"));

            //Charges
            hm.put("eleChargesTabBC", By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailCharges")); 
            hm.put("eleEditHoldsbtnBC", By.id("AccountDetailCharges:AccountDetailChargesScreen:editHold-btnInnerEl"));
            hm.put("eleAssignPayerbtnBC", By.id("AccountDetailCharges:AccountDetailChargesScreen:AssignInvoiceItemsFromCharge-btnInnerEl"));
            hm.put("eleAssignToAccountlnkBC", By.id("AccountDetailCharges:AccountDetailChargesScreen:AssignInvoiceItemsFromCharge:AccountPayerChoice-textEl"));
          hm.put("eleSearchNewPayer", By.xpath(".//div[contains(@id,':PayerAccount:SelectPayerAccount')]"));
            hm.put("edtNewPayerBC", By.name("AssignInvoiceItemsToNewPayerPopup:AssignInvoiceItemsToNewPayerScreen:PayerAccount-inputEl"));
            hm.put("edtInvoiceStreamBC", By.name("AssignInvoiceItemsToNewPayerPopup:AssignInvoiceItemsToNewPayerScreen:InvoiceStream-inputEl"));
            hm.put("eleExecutebtnBC", By.id("AssignInvoiceItemsToNewPayerPopup:AssignInvoiceItemsToNewPayerScreen:Update"));
            hm.put("eleChargesTableBC", By.id("AccountDetailCharges:AccountDetailChargesScreen:AccountDetailChargesListDetailPanel:ChargesLV-body"));
            hm.put("eleInvoiceItemsTableBC", By.id("AccountDetailCharges:AccountDetailChargesScreen:AccountDetailChargesListDetailPanel:InvoiceItemsLV-body"));
            hm.put("eleChargesHoldTableBC", By.id("ChargeHoldsPopup:ChargeHoldsScreen:ChargesLV-body"));
            hm.put("edtChargeHoldStatus", By.name("ChargeHoldStatus"));
            hm.put("edtChargeHoldRdate", By.name("HoldReleaseDate"));
            
            hm.put("eleAccountNuminViewPAne", By.xpath(".//span[contains(@id,':AccountNumber-btnInnerEl')]"));
            
            
            //search Account for applying charges
            hm.put("eleSelectSearchedAccount", By.id("AccountSearchPopup:AccountSearchScreen:AccountSearchResultsLV:0:_Select"));
            
            //Search Policy
            hm.put("eleRenewalPolicyinAccount", By.id("AccountSummary:AccountSummaryScreen:AccountPolicyPeriodsLV:1:PolicyNumber"));
            hm.put("elePolicySearch", By.id("TabBar:PoliciesTab"));
            hm.put("edtPolicySearchNumberBC", By.xpath(".//input[contains(@id,':PolicyNumberCriterion-inputEl')]"));
            hm.put("elePolicyResult", By.id("Policies:PolicySearchScreen:PolicySearchResultsLV:0:PolicyNumber"));
            
            //NewPlociywizard screen
            hm.put("lstPolicyTypeBC", By.name("Type"));
            
            
           //Batch running common
            hm.put("edtCommandfield", By.id("QuickJump-inputEl"));
            
           //HeldCharges from desktop screen
            hm.put("eleHeldChargesBC", By.id("TabBar:DesktopTab:DesktopGroup_DesktopHeldCharges"));
            hm.put("eleChargesHeldTableBC", By.id("DesktopHeldCharges:DesktopHeldChargesScreen:ChargesLV-body"));
            hm.put("eleLastPagebtnHeldTableBC", By.xpath("//span[contains(@class,'page-last')]"));
            //new note
            hm.put("eleNewNoteBC",By.id("AccountGroup:AccountDetailMenuActions:AccountsMenuActions_NewNote-textEl"));
            hm.put("btnUpdateBC",By.id("AccountNewNoteWorksheet:AccountNewNoteScreen:Update"));
            hm.put("edtTopicBC",By.id("AccountNewNoteWorksheet:AccountNewNoteScreen:NewNoteDV:Topic-inputEl"));
            hm.put("edtSubjectBC",By.id("AccountNewNoteWorksheet:AccountNewNoteScreen:NewNoteDV:Subject-inputEl"));
            hm.put("edtTextBC",By.id("AccountNewNoteWorksheet:AccountNewNoteScreen:NewNoteDV:Text-inputEl"));
            hm.put("eleAccountNotesBC",By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailNotes"));
            hm.put("eleSearchANBC",By.id("AccountDetailNotes:AccountDetailNotesScreen:NoteSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
            hm.put("btnAccountSearchBC",By.id("AccountGroup:AccountInfoBar:AccountNumber-btnInnerEl"));
            hm.put("eleClickPolicyNUmberBC",By.id("AccountSummary:AccountSummaryScreen:AccountPolicyPeriodsLV:0:PolicyNumber"));
            hm.put("elePolicyNotes",By.id("PolicyGroup:MenuLinks:PolicyGroup_PolicyDetailNotes"));
            hm.put("elePNSearchBC",By.id("PolicyDetailNotes:PolicyDetailNotesScreen:NoteSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search"));
            
            //Trouble Tickets
            hm.put("eleTroubleTicket", By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailTroubleTickets"));
            hm.put("btnNewTTBC",By.id("AccountDetailTroubleTickets:AccountDetailTroubleTicketsScreen:NewTroubleTicket-btnInnerEl"));
            hm.put("edtTypeTTBC",By.id("CreateTroubleTicketWizard:CreateTroubleTicketInfoScreen:NewTroubleTicketInfoDV:TicketType-inputEl"));
            hm.put("edtSubjectTTBC",By.id("CreateTroubleTicketWizard:CreateTroubleTicketInfoScreen:NewTroubleTicketInfoDV:Subject-inputEl"));
            hm.put("edtDetailsTTBC",By.id("CreateTroubleTicketWizard:CreateTroubleTicketInfoScreen:NewTroubleTicketInfoDV:DetailedDescription-inputEl"));
            hm.put("edtPriorityTTBC",By.id("CreateTroubleTicketWizard:CreateTroubleTicketInfoScreen:NewTroubleTicketInfoDV:Priority-inputEl"));
            hm.put("edtDateTTBC",By.id("CreateTroubleTicketWizard:CreateTroubleTicketInfoScreen:NewTroubleTicketInfoDV:DueDate-inputEl"));
            hm.put("eleNextTTBC",By.id("CreateTroubleTicketWizard:Next-btnInnerEl"));
            hm.put("eleDisbursmentBC",By.id("CreateTroubleTicketWizard:CreateTroubleTicketHoldsScreen:HoldDV:3:HoldType-inputEl"));
            hm.put("edtReleaseDateBC",By.id("CreateTroubleTicketWizard:CreateTroubleTicketHoldsScreen:HoldDV:3:ReleaseDate-inputEl")); 
            hm.put("edtAssignedTTBC",By.id("CreateTroubleTicketWizard:CreateTroubleTicketConfirmationScreen:CreateTroubleTicketConfirmationScreenDV:AssignTicketOwner-inputEl"));
            hm.put("btnFinishTTBC",By.id("CreateTroubleTicketWizard:Finish-btnInnerEl"));
            hm.put("eleAlertTTBC",By.id("AccountSummary:AccountSummaryScreen:AccountDetailSummary_TroubleTicketAlertAlertBar"));
            hm.put("eleModifyDistributionBC",By.id("AccountPayments:AccountDetailPaymentsScreen:DirectBillPaymentsListDetail:AccountDBPaymentsLV:0:ActionButton:ModifyDistribution"));
			hm.put("eleModifyDisburActions", By.xpath(".//a[contains(text(), 'Actions')]"));
			hm.put("elePaymentsTTBC",By.id("AccountPayments:AccountDetailPaymentsScreen:DirectBillPaymentsListDetail:AccountDBPaymentsLV-body"));
            hm.put("eleSelectInvoiceTTBC",By.xpath("//div[@id ='DirectBillAddInvoiceItemsPopup:InvoiceItemSearchPanelSet:InvoiceItemsLV-body']/div/div/table[1]/tbody/tr/td/div[1]/img"));
			hm.put("eleInvoiceTTBC", By.id("DirectBillAddInvoiceItemsPopup:InvoiceItemSearchPanelSet:InvoiceItemsLV-body"));
			hm.put("eleAccountNuSearch",By.id("AccountSearchPopup:AccountSearchScreen:AccountSearchResultsLV:0:_Select"));
			hm.put("edtAggregateBC",By.id("NewDirectBillPayment:EditDBPaymentScreen:DistributionAmountsLV_tb:Aggregate-inputEl"));
			hm.put("edtCreditBC",By.id("NewDirectBillCreditDistribution:EditDBPaymentScreen:DistributionAmountsLV_tb:Aggregate-inputEl"));
			hm.put("edtInoTab",By.xpath(".//*[@id='ModifyDirectBillPaymentPopup:EditDBPaymentScreen:DistributionAmountsLV-body']/div/div/table[2]/tbody/tr/td[8]"));
			hm.put("eleModifypayment",By.id("ModifyDirectBillPaymentPopup:EditDBPaymentScreen:OverrideModeButton-btnInnerEl"));
			hm.put("edtAggregateModifyBC",By.id("ModifyDirectBillPaymentPopup:EditDBPaymentScreen:DistributionAmountsLV_tb:Aggregate-inputEl"));
			hm.put("eleModAdd",By.id("ModifyDirectBillPaymentPopup:EditDBPaymentScreen:AddItems-btnInnerEl"));
			hm.put("eleGeneralBC",By.id("AccountGroup:AccountDetailMenuActions:AccountDetailMenuActions_NewTransaction:AccountDetailMenuActions_General"));
			hm.put("eleGenNext",By.id("AccountNewTransactionWizard:Next-btnInnerEl"));
			hm.put("edtGenChargepattern",By.id("AccountNewTransactionWizard:ChargeDetailsScreen:Type-inputEl"));
			hm.put("edtGeneralAmount",By.id("AccountNewTransactionWizard:ChargeDetailsScreen:Amount-inputEl")); 
			hm.put("eleGenFinish",By.id("AccountNewTransactionWizard:Finish-btnInnerEl"));
			hm.put("elePaymentInstrument",By.id("NewDirectBillPayment:EditDBPaymentScreen:PaymentDetailsDV:PaymentInstrument:CreateNewPaymentInstrument"));
			hm.put("edtPaymentIns",By.id("NewPaymentInstrumentPopup:PaymentMethod-inputEl"));
			hm.put("eleDBPayment",By.xpath(".//div[@id='AccountPayments:AccountDetailPaymentsScreen:DirectBillPaymentsListDetail:AccountDBPaymentsLV-body']/div/div/table[1]/tbody/tr/td[2]"));
			hm.put("btnCreditAdditems",By.id("NewDirectBillCreditDistribution:EditDBPaymentScreen:AddItems-btnInnerEl"));
			hm.put("eleMDBPayment",By.id("MoveDirectBillPayment:EditDBPaymentScreen:AddItems-btnInnerEl"));

			
			
					//Transfer polices
            hm.put("eleTransferPoliciesBC", By.id("AccountGroup:AccountDetailMenuActions:AccountDetailMenuActions_TransferPolicies-textEl"));
            hm.put("edtAccountnumFieldBC", By.id("AccountTransferWizard:WizardsStep1AccountPolicySearchScreen:AccountSearchDV:AccountNumberCriterion-inputEl"));
            hm.put("eleCommonSearchButton", By.xpath("//a[contains(@id,'SearchLinksInputSet:Search')]"));
            hm.put("eleCommonSelectButton", By.xpath("//a[contains(@id,'Select')]"));
            hm.put("eleTransferPoliciesTableBC", By.id("AccountTransferWizard:AccountTransferWizardTransferScreen:AccountTransferDV:AccountTransferPoliciesLV-body"));
            hm.put("eleFinishButton", By.id("AccountTransferWizard:Finish-btnInnerEl"));
            
           //InvoiceStreams
            hm.put("eleInvoiceStreamsTableBC", By.id("AccountTransferWizard:AccountTransferWizardTransferScreen:AccountTransferDV:AccountTransferPoliciesLV-body"));
          // hm.put("eleUnappliedFund", By.id("NewDirectBillPayment:EditDBPaymentScreen:PaymentDetailsDV:UnappliedFunds-inputEl"));
            //search Contacts
            hm.put("eleMenulnkContactsBC", By.id("SearchGroup:MenuLinks:SearchGroup_ContactSearch"));
            hm.put("lstSContactTypeBC", By.id("ContactSearch:ContactSearchScreen:ContactSearchDV:ContactType-inputEl"));
            hm.put("edtSContactTaxIdBC", By.id("ContactSearch:ContactSearchScreen:ContactSearchDV:TaxID-inputEl"));
            hm.put("lstSContactCountryBC", By.id("ContactSearch:ContactSearchScreen:ContactSearchDV:globalAddressContainer:GlobalAddressInputSet:Country-inputEl"));
            hm.put("eleContactsresultsTblBC", By.id("ContactSearch:ContactSearchScreen:ContactSearchResultsLV-body"));
            
            //Policy Contact maintaining
            hm.put("eleContactsTab", By.id("PolicyGroup:MenuLinks:PolicyGroup_PolicyDetailContacts"));
            hm.put("eleEditContact", By.id("PolicyDetailContacts:PolicyDetailContactsScreen:Edit"));
            hm.put("eleAddNewPolicyContact", By.id("PolicyDetailContacts:PolicyDetailContactsScreen:addNewContact"));
            hm.put("eleAddNewPErsonAccount", By.id("PolicyDetailContacts:PolicyDetailContactsScreen:addNewContact:addNewPerson-textEl"));
            
            hm.put("edtCommonAddressLine1", By.xpath(".//input[contains(@id,':AddressLine1-inputEl')]"));
            hm.put("btnContatctUpdate", By.id("PolicyDetailContacts:PolicyDetailContactsScreen:Update"));
            hm.put("eleAddContactRole", By.id("PolicyDetailContacts:PolicyDetailContactsScreen:ListDetailPanel:PolicyContactDetailDV:RolesLV_tb:Add"));
            hm.put("eleRoleDropdown", By.xpath(".//div[contains(text(),'<none>')]"));
            hm.put("elePrimaryInsuredRole", By.xpath(".//li[contains(text(),'Primary Insured')]"));
            hm.put("eleRoleDropdown1", By.xpath(".//div[@class='x-grid-cell-inner' and contains(text(), 'Primary Insured')]"));
            hm.put("eleAdditionalInterstRole", By.xpath(".//li[contains(text(),'Additional Interest')]"));

//            hm.put("eljPrimaryInsuredRole", By.id("html/body/div[4]/table/tbody/tr/td/div/table/tbody/tr[5]/td/div/div[2]/div/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr[20]/td/div/table/tbody/tr/td[2]/div/div[3]/div[1]/div[1]/table/tbody/tr/td[2]/div"));
//
//            hm.put("edtPrimaryInsuredRole", By.id("html/body/div[4]/table/tbody/tr/td/div/table/tbody/tr[5]/td/div/div[2]/div/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr[20]/td/div/table/tbody/tr/td[2]/div/div[3]/div[1]/div[1]/table/tbody/tr/td[2]/div"));
//            
            //Renewal Policy
            hm.put("eleRenewPolicyBC", By.id("PolicyGroup:PolicyDetailMenuActions:PolicyDetailMenuActions_Renew"));
            hm.put("eleRenewalNext", By.id("RenewPolicyWizard:Next"));
            hm.put("btnRenewalAddPremium", By.id("RenewPolicyWizard:RenewPolicyWizardChargeStepScreen:Add"));
            hm.put("btnRenewalFinish", By.id("RenewPolicyWizard:Finish"));
            hm.put("eleRenewalPremiumTable", By.id("RenewPolicyWizard:RenewPolicyWizardChargeStepScreen:RenewPolicyChargesLV-body"));
           hm.put("eleInvoicePL",By.xpath(".//*[@id='NewDirectBillPayment:EditDBPaymentScreen:PaymentDetailsDV:UnappliedFunds-inputEl']"));
           
            
		
            //Create Transaction
            hm.put("eleNewTransactionTab", By.id("AccountGroup:AccountDetailMenuActions:AccountDetailMenuActions_NewTransaction-arrowEl"));
            hm.put("eleTransferAmount",By.id("AccountGroup:AccountDetailMenuActions:AccountDetailMenuActions_NewTransaction:AccountDetailMenuActions_Transfer-itemEl"));
            hm.put("eleUnappliedAmount", By.id("AccountSummary:AccountSummaryScreen:TotalUnappliedAmount-inputEl"));
            hm.put("eleTransferAmountTab", By.id("AccountNewTransferWizard:TransferDetailsScreen:TransferDetailsDV:Target_option1-inputEl"));
            hm.put("eleTransferDetails", By.id("AccountNewTransferWizard:TransferDetailsScreen:TransferDetailsDV:TransferDetailsLV-body"));
            hm.put("eleTargetAccount",By.xpath(".//div[@id='AccountNewTransferWizard:TransferDetailsScreen:TransferDetailsDV:TransferDetailsLV:0:TargetAccount:SelectTargetAccount']"));
            //Transaction
            hm.put("eleTansactionTab", By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailTransactions"));
            hm.put("eleTransactionTable",By.id("AccountDetailTransactions:AccountDetailTransactionsScreen:AccountDetailTransactionsLV-body"));
            
        
            //AccountNewTransferWizard:TransferDetailsScreen:TransferDetailsDV:Target_option1-inputEl
              
            ////Disbursement
	            hm.put("eleDisbursementTab", By.id("AccountGroup:AccountDetailMenuActions:AccountDetailMenuActions_NewTransaction:AccountDetailMenuActions_Disbursement-textEl"));
	            hm.put("edtDisbursementAmount", By.id("AccountCreateDisbursementWizard:CreateDisbursementDetailScreen:CreateDisbursementDetailDV:amount-inputEl"));
	            hm.put("edtDisbursementDueDate", By.id("AccountCreateDisbursementWizard:CreateDisbursementDetailScreen:CreateDisbursementDetailDV:effectiveDate-inputEl"));
	            hm.put("edtDisbursementReason", By.id("AccountCreateDisbursementWizard:CreateDisbursementDetailScreen:CreateDisbursementDetailDV:reason-inputEl"));
	            hm.put("edtDisbursementPayTo", By.id("AccountCreateDisbursementWizard:CreateDisbursementDetailScreen:CreateDisbursementDetailDV:payTo-inputEl"));
	            hm.put("edtDisbursementMailTo", By.id("AccountCreateDisbursementWizard:CreateDisbursementDetailScreen:CreateDisbursementDetailDV:mailTo-inputEl"));
	            hm.put("edtDisbursementMailAddress", By.id("AccountCreateDisbursementWizard:CreateDisbursementDetailScreen:CreateDisbursementDetailDV:mailToAddress-inputEl"));
	            hm.put("btnDisbursementFinish", By.id("AccountCreateDisbursementWizard:Finish"));
	            hm.put("eleReasonF", By.id("AccountDetailDisbursements:AccountDetailDisbursementsScreen:DisbursementsLV:DisbursementDetailDV:reason-inputEl"));
	            hm.put("eleDisbursmentTable",By.id("AccountDetailDisbursements:AccountDetailDisbursementsScreen:DisbursementsLV:1-body"));
	            ///Recapture
	            hm.put("eleRecaptureTab", By.id("AccountGroup:AccountDetailMenuActions:AccountDetailMenuActions_NewTransaction:AccountDetailMenuActions_Recapture"));
	            hm.put("edtRecaptureAmount", By.id("AccountNewRecaptureWizard:RecaptureDetailsScreen:Amount-inputEl"));
            
            hm.put("edtPaymentReversalNote", By.id("DBPaymentReversalConfirmationPopup:ReverseNotes-inputEl"));
            //credit amount 
            hm.put("eleCreditAmount",By.id("AccountGroup:AccountDetailMenuActions:AccountDetailMenuActions_NewTransaction:AccountDetailMenuActions_Credit"));
            hm.put("eleUnapplieds",By.xpath(".//input[contains(@id,'DesignatedUnapplieds-inputEl')]"));
            hm.put("lstUnCreidt",By.xpath(".//input[contains(@id,'creditType-inputEl')]"));
            hm.put("edtUnAmount",By.id("AccountNewCreditWizard:CreditDetailsScreen:Amount-inputEl"));
            hm.put("btnUnNext",By.id("AccountNewCreditWizard:Next-btnInnerEl"));
            hm.put("btnUnFinish",By.id("AccountNewCreditWizard:Finish-btnInnerEl"));
            hm.put("eleNewCreditDistrubution",By.id("AccountGroup:AccountDetailMenuActions:AccountDetailMenuActions_Payments:AccountDetailMenuActions_NewDirectBillCreditDistribution"));
            hm.put("eleCreditCheck",By.id("NewDirectBillCreditDistribution:EditDBPaymentScreen:PaymentDetailsDV:UseUnappliedFunds-inputEl"));
            hm.put("eleCreditDistrubution",By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailPayments:AccountDetailPayments_AccountCreditDistributions"));
			//hm.put("eleCreditBC",By.xpath(".//*[@id='AccountCreditDistributions:AccountDetailPaymentsScreen:DirectBillCreditDistributionListDetail:AccountDBPaymentsLV-body']/div/div/table/tbody/tr/td[3]"));
            hm.put("eleCreditBC",By.id("AccountPayments:AccountDetailPaymentsScreen:DirectBillPaymentsListDetail:AccountDBPaymentsLV-body"));
            hm.put("eleNPRequest",By.id("AccountGroup:AccountDetailMenuActions:AccountDetailMenuActions_Payments:AccountDetailMenuActions_NewPaymentRequest-textEl"));
            hm.put("edtNPAmount",By.id("AccountDetailNewPaymentRequestWizard:NewPaymentRequestScreen:PaymentRequestDV:amount-inputEl"));
			hm.put("edtDraftDate",By.id("AccountDetailNewPaymentRequestWizard:NewPaymentRequestScreen:PaymentRequestDV:paymentDate-inputEl"));
			hm.put("elePIMethod", By.id("AccountDetailNewPaymentRequestWizard:NewPaymentRequestScreen:PaymentRequestDV:PaymentInstrument:CreateNewPaymentInstrument"));
			//hm.put("btnALAdd",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:InsuranceScoreCV:autoLossPanel:autoLoss:Add-btnInnerEl"));
							//			SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:InsuranceScoreCV:homeLossPanel:homeLoss:orderHLH-btnInnerEl
			hm.put("btnALAdd",By.xpath(".//span[contains(@id,'Add-btnInnerEl')]"));
			hm.put("eleHlTable",By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:Report_AcgScreen:InsuranceScoreCV:homeLossPanel:HomeLossLV-body"));
			hm.put("eleDirectPaymentCheck",By.id("NewDirectBillPayment:EditDBPaymentScreen:PaymentDetailsDV:UseUnappliedFunds-inputEl"));							
			//fundstracking
			
            hm.put("eleFundstracking",By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailFundsTracking"));
            hm.put("eleReverseTab",By.id("AccountPayments:AccountDetailPaymentsScreen:DirectBillPaymentsListDetail:AccountPaymentDistributionItemsCV:ReversedItemsDetailsTab"));
            hm.put("elePaymentsNotes",By.id("AccountPayments:AccountDetailPaymentsScreen:DirectBillPaymentsListDetail:AccountPaymentDistributionItemsCV:PaymentNotes-inputEl"));
            hm.put("elePaymentRequests",By.id("AccountGroup:MenuLinks:AccountGroup_AccountDetailPayments:AccountDetailPayments_AccountPaymentRequests"));
            hm.put("eleFundsUserCard",By.id("AccountDetailFundsTracking:AccountDetailFundsTrackingScreen:FundsUsesCardTab-btnInnerEl"));
            hm.put("eleSuspenseAmountTable",By.xpath(".//div[contains(@id,'SuspenseItemsLV-body')]"));
            //Account360
            hm.put("eleAccount360", By.id("AccountGroup:MenuLinks:AccountGroup_AccountView_ExtIS"));
            hm.put("eleAccount360SummaryTable", By.id("AccountView_ExtIS:AccountViewScreen:AccountViewTransactionActivitiesSummary_ExtISLV-body"));
            
            //Direct Bill Payment Invoices
            hm.put("eleDirectBillPaymentInvoicesTable", By.id("NewDirectBillPayment:EditDBPaymentScreen:DistributionAmountsLV-body"));
            hm.put("eleNewCreditDistribution",By.id("NewDirectBillCreditDistribution:EditDBPaymentScreen:DistributionAmountsLV-body"));

            hm.put("eleChangePolicyBC", By.id("PolicyGroup:PolicyDetailMenuActions:PolicyDetailMenuActions_ChangePolicy"));
            hm.put("edtChangeEffectiveDate",By.xpath(".//input[contains(@id,'PolicyChangeDate-inputEl')]"));
			 hm.put("eleGetInvoiceNumber",By.id("AccountDetailInvoiceStreams:AccountDetailInvoiceStreamsScreen:InvoiceStreamsDetailPanel:InvoiceStreamsLV-body"));
		}
		
		public By getObject(String ff)
		{
			By retuValue = null;
			if(hm.containsKey(ff))
			{
			  retuValue = hm.get(ff);
			}
			return retuValue;
		}
}