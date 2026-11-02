package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
private String memberId;
private String memberName;
private int memberAge;

    public Member (String memberId, String memberName, int memberAge) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberAge = memberAge;
    }

public void displayDetails(){
    System.out.println(memberId);
    System.out.println(memberName);
    System.out.println(memberAge);
}

    public static void main(String[] args) {





    }
}