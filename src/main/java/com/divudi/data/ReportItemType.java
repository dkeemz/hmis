/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divudi.data;

/**
 *
 * @author Buddhika
 */
public enum ReportItemType {
    Area,
    AutherizedSignature,
    BarcodeBillId,
    BarcodeBillItemId,
    BarcodePatientId,
    BarcodePatientInvestigationId,
    BarcodePatientReportId,
    BilledDate,
    BilledTime,
    BillItemNo,
    BillNo,
    Birthday,
    BloodGroup,
    Category,
    CivilStatus,
    CollectingCenter,
    Css,
    DataEntered,
    DataEntrySignature,
    DateTime,
    Fax,
    Institution,
    InvestigationName,
    Item,
    Mobile,
    NameInFull,
    NameWithInitials,
    Nationality,
    NicNo,
    PatientAge,
    PatientName,
    PatientSex,
    Person,
    Phn,
    Phone,
    ReferringDoctor,
    ReferringInstitution,
    Religion,
    ReportedDate,
    ReportedTime,
    SampledDate,
    SampledTime,
    Speciman,
    Surname,
    ;

    public String getLabel() {
        switch (this) {
            case Area:
                return "Area";
            case AutherizedSignature:
                return "Autherized Signature";
            case BarcodeBillId:
                return "Barcode BillId";
            case BarcodeBillItemId:
                return "Barcode Bill Item Id";
            case BarcodePatientId:
                return "Barcode Patient Id";
            case BarcodePatientInvestigationId:
                return "Barcode Patient Investigation Id";
            case BarcodePatientReportId:
                return "Barcode Patient Report Id";
            case BilledDate:
                return "Billed Date";
            case BilledTime:
                return "Billed Time";
            case BillItemNo:
                return "Bill Item No";
            case BillNo:
                return "Bill No";
            case Birthday:
                return "Birthday";
            case BloodGroup:
                return "BloodGroup";
            case Category:
                return "Category";
            case CivilStatus:
                return "Civil Status";
            case CollectingCenter:
                return "Collecting Center";
            case DataEntered:
                return "Data Entered";
            case DataEntrySignature:
                return "Data Entry Signature";
            case DateTime:
                return "Date Time";
            case Css:
                return "css";
            case Fax:
                return "Fax";
            case Institution:
                return "Institution";
            case InvestigationName:
                return "Investigation Name";
            case Item:
                return "Item";
            case Mobile:
                return "Mobile";
            case NameInFull:
                return "Name In Full";
            case NameWithInitials:
                return "Name With Initials";
            case Nationality:
                return "Nationality";
            case NicNo:
                return "Nic No";
            case PatientAge:
                return "Patient Age";
            case PatientName:
                return "Patient Name";
            case PatientSex:
                return "Patient Sex";
            case Person:
                return "Person";
            case Phn:
                return "Patient's Number";
            case Phone:
                return "Phone";
            case ReferringDoctor:
                return "Referring Doctor";
            case ReferringInstitution:
                return "Referring Institution";
            case Religion:
                return "Religion";
            case ReportedDate:
                return "Reported Date";
            case ReportedTime:
                return "Reported Time";
            case SampledDate:
                return "Sampled Date";
            case SampledTime:
                return "Sampled Time";
            case Speciman:
                return "Speciman";
            case Surname:
                return "Surname";
        }
        return null;
    }
}
