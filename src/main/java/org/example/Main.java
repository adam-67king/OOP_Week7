package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nGym Membership Management");
            System.out.println("1 Add Member");
            System.out.println("2 Display All Members");
            System.out.println("3 Search by ID");
            System.out.println("4 Remove Member");
            System.out.println("5 Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter Member ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Age: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                Member newMember = new Member(id, name, age);
                members.add(newMember);
                System.out.println("Member added successfully");

            } else if (choice == 2) {
                if (members.size() == 0) {
                    System.out.println("There are no members stored");
                } else {
                    for (int i = 0; i < members.size(); i++) {
                        System.out.println("\nMember " + (i + 1) + ":");
                        members.get(i).displayDetails();
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter Member ID to search: ");
                String searchId = scanner.nextLine();
                boolean found = false;

                for (int i = 0; i < members.size(); i++) {
                    Member m = members.get(i);
                    if (m.getMemberId().equals(searchId)) {
                        System.out.println("\nMember found:");
                        m.displayDetails();
                        found = true;
                        break;
                    }
                }

                if (found == false) {
                    System.out.println("Member not found");
                }

            } else if (choice == 4) {
                System.out.print("Enter Member ID to remove: ");
                String removeId = scanner.nextLine();
                boolean removed = false;

                for (int i = 0; i < members.size(); i++) {
                    Member m = members.get(i);
                    if (m.getMemberId().equals(removeId)) {
                        members.remove(i);
                        System.out.println("Member removed successfully");
                        removed = true;
                        break;
                    }
                }

                if (removed == false) {
                    System.out.println("Member not found");
                }

            } else if (choice == 5) {
                System.out.println("Exiting program");
                break;

            } else {
                System.out.println("Invalid choice, please enter a number between 1 and 5");
            }
        }
        scanner.close();
    }
}