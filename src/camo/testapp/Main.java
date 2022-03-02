package camo.testapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Last Name, First Name (eg: Juan, Dela Cruz): ");
        String[] studentDetails = String.valueOf(scanner.nextLine()).split(",");

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Student ID - Course(eg: 123456-BSIT): ");
        String[] studentInfo = String.valueOf(scanner.nextLine()).split("-");

        Student myStudent = new Student(studentDetails[1].trim(),studentDetails[0].trim(),address.trim(),studentInfo[0].trim(),studentInfo[1].trim());

        System.out.printf("First Name: %s\nLast Name: %s\nAddress: %s\nStudent ID: %s\nCourse: %s\n",myStudent.getFirstName(),myStudent.getLastName(),myStudent.getAddress(),myStudent.getStudentId(),myStudent.getCourse());
    }
}
