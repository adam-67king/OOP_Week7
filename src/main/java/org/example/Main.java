package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Member ID");
        String memberId=scanner.nextLine();
        System.out.println("Enter Member Name");
        String memberName=scanner.nextLine();
        System.out.println("Enter Member Age");
        int memberAge=scanner.nextInt();

        Member newMember = new Member(memberId, memberName, memberAge);

        System.out.println("Member created successfully");
        newMember.displayDetails();

        scanner.close();
    }
}