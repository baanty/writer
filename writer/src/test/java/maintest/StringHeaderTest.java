package maintest;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.StringUtils;

public class StringHeaderTest {

    
    static String CURRENT_HEADER = "uuid,ingCountry,cid,serviceType1,serviceType2,serviceType3,purposeKyc,channel,givenNames,surname,verificationMethod,birthdate,placeOfBirth,countryOfBirth,nationality1,nationality2,nationality3,nationality4,r.streetName,r.houseNumber,r.postalCode,r.town,r.country,p.streetName,p.houseNumber,p.postalCode,p.town,p.country,c.streetName,c.houseNumber,c.postalCode,c.town,c.country,aorEvidence,industryCode,mostConservativeProductRisk,sourceOfFunds1,sourceOfFunds2,sourceOfFunds3,sourceOfFunds4,sourceOfFunds5,sourceOfWealth1,sourceOfWealth2,sourceOfWealth3,sourceOfWealth4,sourceOfWealth5,sourceOfFundsVerified,sourceOfWealthVerified,adverseIntelligence,nsAlertPep,materialTrueHitPep,nsAlertTer,materialTrueHitTer,srManagementApproved,mlroAdvice,mlroAdviceDueDiligence,taxCountry1,taxId1,taxCountry2,taxId2,taxCountry3,taxId3,taxCountry4,taxId4,taxCountry5,taxId5,iga2Consent,selfCertificateUs,selfCertificateNonUs,w9OrSubstituteW9,usTaxIdentifier,w8BenOrSubstituteW8Ben,expiryDateW8BenForm,nonUsPassport,fatca.certificateOfResidence,fatca.validId,approvedDocumentationQiRegime,certificateOfLoss,explanationMissingCertificateOfLoss,crs.selfCertificateBasedOnCrsTrigger,crs.certificateOfResidence,crs.validId,partyIdentified,partyVerified,idType1,idNumber1,idIssueDate1,idExpiryDate1,idPlaceOfIssue1,idCountryOfIssue1,idType2,idNumber2,idIssueDate2,idExpiryDate2,idPlaceOfIssue2,idCountryOfIssue2,idType3,idNumber3,idIssueDate3,idExpiryDate3,idPlaceOfIssue3,idCountryOfIssue3,purposeOfRelationship1,purposeOfRelationship2,purposeOfRelationship3,purposeOfRelationship4,purposeOfRelationship5,previousSrManagementApproved,currentApprovedCddRiskLevel,currentApprovedCddProcessType,currentCddNextReviewDate,otherRedFlag1,otherRedFlag2,otherRedFlag3,otherRedFlag4,otherRedFlag5,phoneCountry1,phoneCountry2,phoneCountry3,phoneCountry4,phoneCountry5,localCustomerRuleApplicable,currentCrsStatus,currentCrsProcessType,currentCrsNextReviewDate,crsEventTrigger,currentFatcaStatus,currentFatcaProcessType,currentFatcaNextReviewDate,fatcaEventTrigger,usSourceFdapPaymentDate,standingInstructionsCountries1,standingInstructionsCountries2,standingInstructionsCountries3,standingInstructionsCountries4,standingInstructionsCountries5,holdMail,substantialPresenceTest,usPerson,legalRepresentativeInvolved,legalRepresentative1.cid,legalRepresentative1.legalRepresentativeType,legalRepresentative1.evidenceForLrCollected,legalRepresentative1.evidenceForLrVerified,legalRepresentative1.aorEvidence,legalRepresentative1.adverseIntelligence,legalRepresentative1.countryOfBirth,legalRepresentative1.placeOfBirth,legalRepresentative1.r.streetName,legalRepresentative1.r.houseNumber,legalRepresentative1.r.postalCode,legalRepresentative1.r.town,legalRepresentative1.r.country,legalRepresentative1.p.streetName,legalRepresentative1.p.houseNumber,legalRepresentative1.p.postalCode,legalRepresentative1.p.town,legalRepresentative1.p.country,legalRepresentative1.c.streetName,legalRepresentative1.c.houseNumber,legalRepresentative1.c.postalCode,legalRepresentative1.c.town,legalRepresentative1.c.country,legalRepresentative1.idDocumentType1,legalRepresentative1.idNumber1,legalRepresentative1.idIssueDate1,legalRepresentative1.idExpiryDate1,legalRepresentative1.idPlaceOfIssue1,legalRepresentative1.idCountryOfIssue1,legalRepresentative1.idDocumentType2,legalRepresentative1.idNumber2,legalRepresentative1.idIssueDate2,legalRepresentative1.idExpiryDate2,legalRepresentative1.idPlaceOfIssue2,legalRepresentative1.idCountryOfIssue2,legalRepresentative1.idDocumentType3,legalRepresentative1.idNumber3,legalRepresentative1.idIssueDate3,legalRepresentative1.idExpiryDate3,legalRepresentative1.idPlaceOfIssue3,legalRepresentative1.idCountryOfIssue3,legalRepresentativeClient1.currentApprovedCddRiskLevel,legalRepresentativeClient1.currentApprovedCddProcessType,legalRepresentativeClient1.currentCddProcessStatus,legalRepresentativeClient1.currentCddNextReviewDate,legalRepresentativeNonClient1.givenNames,legalRepresentativeNonClient1.surname,legalRepresentativeNonClient1.birthdate,legalRepresentativeNonClient1.nationality1,legalRepresentativeNonClient1.nationality2,legalRepresentativeNonClient1.nationality3,legalRepresentativeNonClient1.nationality4,legalRepresentativeNonClient1.nsAlertPep,legalRepresentativeNonClient1.materialTrueHitPep,legalRepresentativeNonClient1.nsAlertTer,legalRepresentativeNonClient1.materialTrueHitTer,legalRepresentativeNonClient1.verified.verificationMethod,legalRepresentativeNonClient1.cdd.partyIdentified,legalRepresentativeNonClient1.cdd.partyVerified,legalRepresentative2.cid,legalRepresentative2.legalRepresentativeType,legalRepresentative2.evidenceForLrCollected,legalRepresentative2.evidenceForLrVerified,legalRepresentative2.aorEvidence,legalRepresentative2.adverseIntelligence,legalRepresentative2.countryOfBirth,legalRepresentative2.placeOfBirth,legalRepresentative2.r.streetName,legalRepresentative2.r.houseNumber,legalRepresentative2.r.postalCode,legalRepresentative2.r.town,legalRepresentative2.r.country,legalRepresentative2.p.streetName,legalRepresentative2.p.houseNumber,legalRepresentative2.p.postalCode,legalRepresentative2.p.town,legalRepresentative2.p.country,legalRepresentative2.c.streetName,legalRepresentative2.c.houseNumber,legalRepresentative2.c.postalCode,legalRepresentative2.c.town,legalRepresentative2.c.country,legalRepresentative2.idDocumentType1,legalRepresentative2.idNumber1,legalRepresentative2.idIssueDate1,legalRepresentative2.idExpiryDate1,legalRepresentative2.idPlaceOfIssue1,legalRepresentative2.idCountryOfIssue1,legalRepresentative2.idDocumentType2,legalRepresentative2.idNumber2,legalRepresentative2.idIssueDate2,legalRepresentative2.idExpiryDate2,legalRepresentative2.idPlaceOfIssue2,legalRepresentative2.idCountryOfIssue2,legalRepresentative2.idDocumentType3,legalRepresentative2.idNumber3,legalRepresentative2.idIssueDate3,legalRepresentative2.idExpiryDate3,legalRepresentative2.idPlaceOfIssue3,legalRepresentative2.idCountryOfIssue3,legalRepresentativeClient2.currentApprovedCddRiskLevel,legalRepresentativeClient2.currentApprovedCddProcessType,legalRepresentativeClient2.currentCddProcessStatus,legalRepresentativeClient2.currentCddNextReviewDate,legalRepresentativeNonClient2.givenNames,legalRepresentativeNonClient2.surname,legalRepresentativeNonClient2.birthdate,legalRepresentativeNonClient2.nationality1,legalRepresentativeNonClient2.nationality2,legalRepresentativeNonClient2.nationality3,legalRepresentativeNonClient2.nationality4,legalRepresentativeNonClient2.nsAlertPep,legalRepresentativeNonClient2.materialTrueHitPep,legalRepresentativeNonClient2.nsAlertTer,legalRepresentativeNonClient2.materialTrueHitTer,legalRepresentativeNonClient2.verified.verificationMethod,legalRepresentativeNonClient2.cdd.partyIdentified,legalRepresentativeNonClient2.cdd.partyVerified,legalRepresentative3.cid,legalRepresentative3.legalRepresentativeType,legalRepresentative3.evidenceForLrCollected,legalRepresentative3.evidenceForLrVerified,legalRepresentative3.aorEvidence,legalRepresentative3.adverseIntelligence,legalRepresentative3.countryOfBirth,legalRepresentative3.placeOfBirth,legalRepresentative3.r.streetName,legalRepresentative3.r.houseNumber,legalRepresentative3.r.postalCode,legalRepresentative3.r.town,legalRepresentative3.r.country,legalRepresentative3.p.streetName,legalRepresentative3.p.houseNumber,legalRepresentative3.p.postalCode,legalRepresentative3.p.town,legalRepresentative3.p.country,legalRepresentative3.c.streetName,legalRepresentative3.c.houseNumber,legalRepresentative3.c.postalCode,legalRepresentative3.c.town,legalRepresentative3.c.country,legalRepresentative3.idDocumentType1,legalRepresentative3.idNumber1,legalRepresentative3.idIssueDate1,legalRepresentative3.idExpiryDate1,legalRepresentative3.idPlaceOfIssue1,legalRepresentative3.idCountryOfIssue1,legalRepresentative3.idDocumentType2,legalRepresentative3.idNumber2,legalRepresentative3.idIssueDate2,legalRepresentative3.idExpiryDate2,legalRepresentative3.idPlaceOfIssue2,legalRepresentative3.idCountryOfIssue2,legalRepresentative3.idDocumentType3,legalRepresentative3.idNumber3,legalRepresentative3.idIssueDate3,legalRepresentative3.idExpiryDate3,legalRepresentative3.idPlaceOfIssue3,legalRepresentative3.idCountryOfIssue3,legalRepresentativeClient3.currentApprovedCddRiskLevel,legalRepresentativeClient3.currentApprovedCddProcessType,legalRepresentativeClient3.currentCddProcessStatus,legalRepresentativeClient3.currentCddNextReviewDate,legalRepresentativeNonClient3.givenNames,legalRepresentativeNonClient3.surname,legalRepresentativeNonClient3.birthdate,legalRepresentativeNonClient3.nationality1,legalRepresentativeNonClient3.nationality2,legalRepresentativeNonClient3.nationality3,legalRepresentativeNonClient3.nationality4,legalRepresentativeNonClient3.nsAlertPep,legalRepresentativeNonClient3.materialTrueHitPep,legalRepresentativeNonClient3.nsAlertTer,legalRepresentativeNonClient3.materialTrueHitTer,legalRepresentativeNonClient3.verified.verificationMethod,legalRepresentativeNonClient3.cdd.partyIdentified,legalRepresentativeNonClient3.cdd.partyVerified";
    
    public static void main(String[] arguments) {
        String[] currentActualHeaderArray = CURRENT_HEADER.split(",");
        String[] currentExpectedHeaderArray = getCurrentSpecifiedHeader().split(",");
        
        for (int index = 0 ; index < currentExpectedHeaderArray.length ; index ++ ) {
            if (!currentExpectedHeaderArray[index].equals(currentActualHeaderArray[index]) ) {
                System.out.println("Index - " + index + ". Expected - " + currentExpectedHeaderArray[index] + " . Actual - " + currentActualHeaderArray[index]);
                throw new RuntimeException("Test Failed");
            }
        }
        System.out.println("Test Passed");
    }
    
    static String getCurrentSpecifiedHeader() {

        return new CustomStringBuilder()
                .append("uuid")
                .append("ingCountry")
                .append("cid")
                .append("serviceType1")
                .append("serviceType2")
                .append("serviceType3")
                .append("purposeKyc")
                .append("channel")
                .append("givenNames")
                .append("surname")
                .append("verificationMethod")
                .append("birthdate")
                .append("placeOfBirth")
                .append("countryOfBirth")
                .append("nationality1")
                .append("nationality2")
                .append("nationality3")
                .append("nationality4")
                .append("r.streetName")
                .append("r.houseNumber")
                .append("r.postalCode")
                .append("r.town")
                .append("r.country")
                .append("p.streetName")
                .append("p.houseNumber")
                .append("p.postalCode")
                .append("p.town")
                .append("p.country")
                .append("c.streetName")
                .append("c.houseNumber")
                .append("c.postalCode")
                .append("c.town")
                .append("c.country")
                .append("aorEvidence")
                .append("industryCode")
                .append("mostConservativeProductRisk")
                .append("sourceOfFunds1")
                .append("sourceOfFunds2")
                .append("sourceOfFunds3")
                .append("sourceOfFunds4")
                .append("sourceOfFunds5")
                .append("sourceOfWealth1")
                .append("sourceOfWealth2")
                .append("sourceOfWealth3")
                .append("sourceOfWealth4")
                .append("sourceOfWealth5")
                .append("sourceOfFundsVerified")
                .append("sourceOfWealthVerified")
                .append("adverseIntelligence")
                .append("nsAlertPep")
                .append("materialTrueHitPep")
                .append("nsAlertTer")
                .append("materialTrueHitTer")
                .append("srManagementApproved")
                .append("mlroAdvice")
                .append("mlroAdviceDueDiligence")
                .append("taxCountry1")
                .append("taxId1")
                .append("taxCountry2")
                .append("taxId2")
                .append("taxCountry3")
                .append("taxId3")
                .append("taxCountry4")
                .append("taxId4")
                .append("taxCountry5")
                .append("taxId5")
                .append("iga2Consent")
                .append("selfCertificateUs")
                .append("selfCertificateNonUs")
                .append("w9OrSubstituteW9")
                .append("usTaxIdentifier")
                .append("w8BenOrSubstituteW8Ben")
                .append("expiryDateW8BenForm")
                .append("nonUsPassport")
                .append("fatca.certificateOfResidence")
                .append("fatca.validId")
                .append("approvedDocumentationQiRegime")
                .append("certificateOfLoss")
                .append("explanationMissingCertificateOfLoss")
                .append("crs.selfCertificateBasedOnCrsTrigger")
                .append("crs.certificateOfResidence")
                .append("crs.validId")
                .append("partyIdentified")
                .append("partyVerified")
                .append("idType1")
                .append("idNumber1")
                .append("idIssueDate1")
                .append("idExpiryDate1")
                .append("idPlaceOfIssue1")
                .append("idCountryOfIssue1")
                .append("idType2")
                .append("idNumber2")
                .append("idIssueDate2")
                .append("idExpiryDate2")
                .append("idPlaceOfIssue2")
                .append("idCountryOfIssue2")
                .append("idType3")
                .append("idNumber3")
                .append("idIssueDate3")
                .append("idExpiryDate3")
                .append("idPlaceOfIssue3")
                .append("idCountryOfIssue3")
                .append("purposeOfRelationship1")
                .append("purposeOfRelationship2")
                .append("purposeOfRelationship3")
                .append("purposeOfRelationship4")
                .append("purposeOfRelationship5")
                .append("previousSrManagementApproved")
                .append("currentApprovedCddRiskLevel")
                .append("currentApprovedCddProcessType")
                .append("currentCddNextReviewDate")
                .append("otherRedFlag1")
                .append("otherRedFlag2")
                .append("otherRedFlag3")
                .append("otherRedFlag4")
                .append("otherRedFlag5")
                .append("phoneCountry1")
                .append("phoneCountry2")
                .append("phoneCountry3")
                .append("phoneCountry4")
                .append("phoneCountry5")
                .append("localCustomerRuleApplicable")
                .append("currentCrsStatus")
                .append("currentCrsProcessType")
                .append("currentCrsNextReviewDate")
                .append("crsEventTrigger")
                .append("currentFatcaStatus")
                .append("currentFatcaProcessType")
                .append("currentFatcaNextReviewDate")
                .append("fatcaEventTrigger")
                .append("usSourceFdapPaymentDate")
                .append("standingInstructionsCountries1")
                .append("standingInstructionsCountries2")
                .append("standingInstructionsCountries3")
                .append("standingInstructionsCountries4")
                .append("standingInstructionsCountries5")
                .append("holdMail")
                .append("substantialPresenceTest")
                .append("usPerson")
                .append("legalRepresentativeInvolved")
                .append("legalRepresentative1.cid")
                .append("legalRepresentative1.legalRepresentativeType")
                .append("legalRepresentative1.evidenceForLrCollected")
                .append("legalRepresentative1.evidenceForLrVerified")
                .append("legalRepresentative1.aorEvidence")
                .append("legalRepresentative1.adverseIntelligence")
                .append("legalRepresentative1.countryOfBirth")
                .append("legalRepresentative1.placeOfBirth")
                .append("legalRepresentative1.r.streetName")
                .append("legalRepresentative1.r.houseNumber")
                .append("legalRepresentative1.r.postalCode")
                .append("legalRepresentative1.r.town")
                .append("legalRepresentative1.r.country")
                .append("legalRepresentative1.p.streetName")
                .append("legalRepresentative1.p.houseNumber")
                .append("legalRepresentative1.p.postalCode")
                .append("legalRepresentative1.p.town")
                .append("legalRepresentative1.p.country")
                .append("legalRepresentative1.c.streetName")
                .append("legalRepresentative1.c.houseNumber")
                .append("legalRepresentative1.c.postalCode")
                .append("legalRepresentative1.c.town")
                .append("legalRepresentative1.c.country")
                .append("legalRepresentative1.idDocumentType1")
                .append("legalRepresentative1.idNumber1")
                .append("legalRepresentative1.idIssueDate1")
                .append("legalRepresentative1.idExpiryDate1")
                .append("legalRepresentative1.idPlaceOfIssue1")
                .append("legalRepresentative1.idCountryOfIssue1")
                .append("legalRepresentative1.idDocumentType2")
                .append("legalRepresentative1.idNumber2")
                .append("legalRepresentative1.idIssueDate2")
                .append("legalRepresentative1.idExpiryDate2")
                .append("legalRepresentative1.idPlaceOfIssue2")
                .append("legalRepresentative1.idCountryOfIssue2")
                .append("legalRepresentative1.idDocumentType3")
                .append("legalRepresentative1.idNumber3")
                .append("legalRepresentative1.idIssueDate3")
                .append("legalRepresentative1.idExpiryDate3")
                .append("legalRepresentative1.idPlaceOfIssue3")
                .append("legalRepresentative1.idCountryOfIssue3")
                .append("legalRepresentativeClient1.currentApprovedCddRiskLevel")
                .append("legalRepresentativeClient1.currentApprovedCddProcessType")
                .append("legalRepresentativeClient1.currentCddProcessStatus")
                .append("legalRepresentativeClient1.currentCddNextReviewDate")
                .append("legalRepresentativeNonClient1.givenNames")
                .append("legalRepresentativeNonClient1.surname")
                .append("legalRepresentativeNonClient1.birthdate")
                .append("legalRepresentativeNonClient1.nationality1")
                .append("legalRepresentativeNonClient1.nationality2")
                .append("legalRepresentativeNonClient1.nationality3")
                .append("legalRepresentativeNonClient1.nationality4")
                .append("legalRepresentativeNonClient1.nsAlertPep")
                .append("legalRepresentativeNonClient1.materialTrueHitPep")
                .append("legalRepresentativeNonClient1.nsAlertTer")
                .append("legalRepresentativeNonClient1.materialTrueHitTer")
                .append("legalRepresentativeNonClient1.verified.verificationMethod")
                .append("legalRepresentativeNonClient1.cdd.partyIdentified")
                .append("legalRepresentativeNonClient1.cdd.partyVerified")
                .append("legalRepresentative2.cid")
                .append("legalRepresentative2.legalRepresentativeType")
                .append("legalRepresentative2.evidenceForLrCollected")
                .append("legalRepresentative2.evidenceForLrVerified")
                .append("legalRepresentative2.aorEvidence")
                .append("legalRepresentative2.adverseIntelligence")
                .append("legalRepresentative2.countryOfBirth")
                .append("legalRepresentative2.placeOfBirth")
                .append("legalRepresentative2.r.streetName")
                .append("legalRepresentative2.r.houseNumber")
                .append("legalRepresentative2.r.postalCode")
                .append("legalRepresentative2.r.town")
                .append("legalRepresentative2.r.country")
                .append("legalRepresentative2.p.streetName")
                .append("legalRepresentative2.p.houseNumber")
                .append("legalRepresentative2.p.postalCode")
                .append("legalRepresentative2.p.town")
                .append("legalRepresentative2.p.country")
                .append("legalRepresentative2.c.streetName")
                .append("legalRepresentative2.c.houseNumber")
                .append("legalRepresentative2.c.postalCode")
                .append("legalRepresentative2.c.town")
                .append("legalRepresentative2.c.country")
                .append("legalRepresentative2.idDocumentType1")
                .append("legalRepresentative2.idNumber1")
                .append("legalRepresentative2.idIssueDate1")
                .append("legalRepresentative2.idExpiryDate1")
                .append("legalRepresentative2.idPlaceOfIssue1")
                .append("legalRepresentative2.idCountryOfIssue1")
                .append("legalRepresentative2.idDocumentType2")
                .append("legalRepresentative2.idNumber2")
                .append("legalRepresentative2.idIssueDate2")
                .append("legalRepresentative2.idExpiryDate2")
                .append("legalRepresentative2.idPlaceOfIssue2")
                .append("legalRepresentative2.idCountryOfIssue2")
                .append("legalRepresentative2.idDocumentType3")
                .append("legalRepresentative2.idNumber3")
                .append("legalRepresentative2.idIssueDate3")
                .append("legalRepresentative2.idExpiryDate3")
                .append("legalRepresentative2.idPlaceOfIssue3")
                .append("legalRepresentative2.idCountryOfIssue3")
                .append("legalRepresentativeClient2.currentApprovedCddRiskLevel")
                .append("legalRepresentativeClient2.currentApprovedCddProcessType")
                .append("legalRepresentativeClient2.currentCddProcessStatus")
                .append("legalRepresentativeClient2.currentCddNextReviewDate")
                .append("legalRepresentativeNonClient2.givenNames")
                .append("legalRepresentativeNonClient2.surname")
                .append("legalRepresentativeNonClient2.birthdate")
                .append("legalRepresentativeNonClient2.nationality1")
                .append("legalRepresentativeNonClient2.nationality2")
                .append("legalRepresentativeNonClient2.nationality3")
                .append("legalRepresentativeNonClient2.nationality4")
                .append("legalRepresentativeNonClient2.nsAlertPep")
                .append("legalRepresentativeNonClient2.materialTrueHitPep")
                .append("legalRepresentativeNonClient2.nsAlertTer")
                .append("legalRepresentativeNonClient2.materialTrueHitTer")
                .append("legalRepresentativeNonClient2.verified.verificationMethod")
                .append("legalRepresentativeNonClient2.cdd.partyIdentified")
                .append("legalRepresentativeNonClient2.cdd.partyVerified")
                .append("legalRepresentative3.cid")
                .append("legalRepresentative3.legalRepresentativeType")
                .append("legalRepresentative3.evidenceForLrCollected")
                .append("legalRepresentative3.evidenceForLrVerified")
                .append("legalRepresentative3.aorEvidence")
                .append("legalRepresentative3.adverseIntelligence")
                .append("legalRepresentative3.countryOfBirth")
                .append("legalRepresentative3.placeOfBirth")
                .append("legalRepresentative3.r.streetName")
                .append("legalRepresentative3.r.houseNumber")
                .append("legalRepresentative3.r.postalCode")
                .append("legalRepresentative3.r.town")
                .append("legalRepresentative3.r.country")
                .append("legalRepresentative3.p.streetName")
                .append("legalRepresentative3.p.houseNumber")
                .append("legalRepresentative3.p.postalCode")
                .append("legalRepresentative3.p.town")
                .append("legalRepresentative3.p.country")
                .append("legalRepresentative3.c.streetName")
                .append("legalRepresentative3.c.houseNumber")
                .append("legalRepresentative3.c.postalCode")
                .append("legalRepresentative3.c.town")
                .append("legalRepresentative3.c.country")
                .append("legalRepresentative3.idDocumentType1")
                .append("legalRepresentative3.idNumber1")
                .append("legalRepresentative3.idIssueDate1")
                .append("legalRepresentative3.idExpiryDate1")
                .append("legalRepresentative3.idPlaceOfIssue1")
                .append("legalRepresentative3.idCountryOfIssue1")
                .append("legalRepresentative3.idDocumentType2")
                .append("legalRepresentative3.idNumber2")
                .append("legalRepresentative3.idIssueDate2")
                .append("legalRepresentative3.idExpiryDate2")
                .append("legalRepresentative3.idPlaceOfIssue2")
                .append("legalRepresentative3.idCountryOfIssue2")
                .append("legalRepresentative3.idDocumentType3")
                .append("legalRepresentative3.idNumber3")
                .append("legalRepresentative3.idIssueDate3")
                .append("legalRepresentative3.idExpiryDate3")
                .append("legalRepresentative3.idPlaceOfIssue3")
                .append("legalRepresentative3.idCountryOfIssue3")
                .append("legalRepresentativeClient3.currentApprovedCddRiskLevel")
                .append("legalRepresentativeClient3.currentApprovedCddProcessType")
                .append("legalRepresentativeClient3.currentCddProcessStatus")
                .append("legalRepresentativeClient3.currentCddNextReviewDate")
                .append("legalRepresentativeNonClient3.givenNames")
                .append("legalRepresentativeNonClient3.surname")
                .append("legalRepresentativeNonClient3.birthdate")
                .append("legalRepresentativeNonClient3.nationality1")
                .append("legalRepresentativeNonClient3.nationality2")
                .append("legalRepresentativeNonClient3.nationality3")
                .append("legalRepresentativeNonClient3.nationality4")
                .append("legalRepresentativeNonClient3.nsAlertPep")
                .append("legalRepresentativeNonClient3.materialTrueHitPep")
                .append("legalRepresentativeNonClient3.nsAlertTer")
                .append("legalRepresentativeNonClient3.materialTrueHitTer")
                .append("legalRepresentativeNonClient3.verified.verificationMethod")
                .append("legalRepresentativeNonClient3.cdd.partyIdentified")
                .append("legalRepresentativeNonClient3.cdd.partyVerified")
                .getValue();
    
    }
    
    public static final class CustomStringBuilder {
        
        @NotNull
        private final List<String> values = new ArrayList<String>();
        
        public CustomStringBuilder append(String appendable) {
            
            if (StringUtils.isNotBlank(appendable)) {
                values.add(appendable);    
            }
            return this;
        }
        
        public String getValue() {
            return String.join(",", values);
        }
        
    }
}
