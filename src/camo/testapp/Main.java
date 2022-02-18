package camo.testapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();

        System.out.print("Enter First Name: ");
        student1.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        student1.setLastName(scanner.nextLine());

        System.out.print("Enter Address: ");
        student1.setAddress(scanner.nextLine());

        System.out.print("Enter Student ID: ");
        student1.setStudentId(scanner.nextLine());

        System.out.print("Enter Course: ");
        student1.setCourse(scanner.nextLine());

        System.out.println("First Name: " + student1.getFirstName());
        System.out.println("Last Name: " + student1.getLastName());
        System.out.println("Address: " + student1.getAddress());
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Course: " + student1.getCourse());
    }
}
