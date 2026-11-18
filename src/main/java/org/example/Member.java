package org.example;


public class Member {

    private String memberId;
    private String memberName;
    private int memberAge;

    //constructors
    public Member(String memberId, String memberName, int memberAge) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberAge = memberAge;
    }

    //getters
    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

   //display details
    public void displayDetails() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + memberName);
        System.out.println("Member Age: " + memberAge);
    }
}

