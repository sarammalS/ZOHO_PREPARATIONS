// Q1. Design a Java program to maintain hospital medical records.
// Create a base class MedicalRecord with: recordId, patientName, dateOfVisit, diagnosis
// Include inputRecordDetails() and displayRecord()
// Create InPatientRecord subclass: roomNumber, daysAdmitted, roomCharges, calculateTotalCharges()
// Create OutPatientRecord subclass: doctorName, consultationFee

import java.util.Scanner;

class MedicalRecord {
    String recordId;
    String patientName;
    String dateOfVisit;
    String diagnosis;

    void inputRecordDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Record ID: ");
        recordId = sc.nextLine();
        System.out.print("Enter Patient Name: ");
        patientName = sc.nextLine();
        System.out.print("Enter Date of Visit: ");
        dateOfVisit = sc.nextLine();
        System.out.print("Enter Diagnosis: ");
        diagnosis = sc.nextLine();
    }

    void displayRecord() {
        System.out.println("Record ID: " + recordId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Date of Visit: " + dateOfVisit);
        System.out.println("Diagnosis: " + diagnosis);
    }
}

class InPatientRecord extends MedicalRecord {
    int roomNumber;
    int numberOfDaysAdmitted;
    double roomCharges;

    void inputInPatientDetails() {
        inputRecordDetails();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Room Number: ");
        roomNumber = sc.nextInt();
        System.out.print("Enter Number of Days Admitted: ");
        numberOfDaysAdmitted = sc.nextInt();
        System.out.print("Enter Room Charges per Day: ");
        roomCharges = sc.nextDouble();
    }

    double calculateTotalCharges() {
        return numberOfDaysAdmitted * roomCharges;
    }

    @Override
    void displayRecord() {
        super.displayRecord();
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Days Admitted: " + numberOfDaysAdmitted);
        System.out.println("Room Charges per Day: $" + roomCharges);
        System.out.println("Total Charges: $" + calculateTotalCharges());
    }
}

class OutPatientRecord extends MedicalRecord {
    String doctorName;
    double consultationFee;

    void inputOutPatientDetails() {
        inputRecordDetails();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Doctor Name: ");
        doctorName = sc.nextLine();
        System.out.print("Enter Consultation Fee: ");
        consultationFee = sc.nextDouble();
    }

    @Override
    void displayRecord() {
        super.displayRecord();
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Consultation Fee: $" + consultationFee);
    }
}

public class Q1 {
    public static void main(String[] args) {
        InPatientRecord inPatient = new InPatientRecord();
        System.out.println("--- Enter In-Patient Record ---");
        inPatient.inputInPatientDetails();

        OutPatientRecord outPatient = new OutPatientRecord();
        System.out.println("\n--- Enter Out-Patient Record ---");
        outPatient.inputOutPatientDetails();

        System.out.println("\n--- Display In-Patient Record ---");
        inPatient.displayRecord();

        System.out.println("\n--- Display Out-Patient Record ---");
        outPatient.displayRecord();
    }
}
