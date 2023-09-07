package session12.practice.fitness_center_management.membership_management;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MembershipManagementSystem {

    private List<Member> members;
    private AtomicInteger memberIdCounter; // Used to generate unique memberId

    public MembershipManagementSystem() {
        members = new ArrayList<>();
        memberIdCounter = new AtomicInteger(1); // Initialize with 1 for the first member ID
    }

    // Method to register a new member
    public void registerMember(String name, String address, String emergencyContact, String medicalHistory, String fitnessGoals) {
        int memberId = memberIdCounter.getAndIncrement(); // Generate a unique member ID
    }
    //create a new Member object

}