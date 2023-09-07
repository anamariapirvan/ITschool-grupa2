package session12.practice.fitness_center_management.membership_management;

public class Member {
    private int memberID;
    private String name;
    private String address;
    private String emergencyContact;
    private String medicalHistory;
    private String fitnessGoal;

    public Member(int memberID, String name, String address, String emergencyContact, String medicalHistory, String fitnessGoal){
        this.name=name;
        this.memberID=memberID;
        this.address=address;
        this.emergencyContact=emergencyContact;
        this.medicalHistory=medicalHistory;
        this.fitnessGoal=fitnessGoal;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getFitnessGoal() {
        return fitnessGoal;
    }

    public void setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
    }
}
