package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean valid= false;
    int choice;
    while (valid){
        System.out.println("Menu:");
        System.out.println("1. Create Student Profile");
        System.out.println("2. Update Student Profile");
        System.out.println("3. Delete Student Profile");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        switch (choice) {
            case 1:
                System.out.print("Enter NIM: ");
                int nim = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                System.out.print("Enter Major: ");
                String major = scanner.nextLine();
                System.out.print("Enter Address: ");
                String address = scanner.nextLine();
                Student student = new Student(nim, name, age, major, address);
                // Assuming session is a Hibernate session object
                session.beginTransaction();
                session.persist(student);
                session.getTransaction().commit();
                System.out.println("Profile created successfully.");
                break;
            case 2:
                System.out.print("Enter NIM of the student to update: ");
                int updateNim = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                // Fetch and update student logic here
                System.out.println("Profile updated successfully.");
                break;
            case 3:
                System.out.print("Enter NIM of the student to delete: ");
                int deleteNim = scanner.nextInt();
                // Delete student logic here
                System.out.println("Profile deleted successfully.");
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid number.");
        }

        scanner.close();
    } 
    }  
} 