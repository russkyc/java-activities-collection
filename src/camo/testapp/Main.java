package camo.testapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();

        System.out.print("Enter Last Name, First Name (eg: Juan, Dela Cruz): ");
        String[] studentName = String.valueOf(scanner.nextLine()).trim().split(",");
        student1.setFirstName(studentName[1]);
        student1.setLastName(studentName[0]);

        System.out.print("Enter Address: ");
        student1.setAddress(scanner.nextLine());

        System.out.print("Enter Student ID - Course(eg: 123456-BSIT): ");
        String[] studentInfo = String.valueOf(scanner.nextLine()).trim().split("-");
        student1.setStudentId(studentInfo[0]);
        student1.setCourse(studentInfo[1]);

        System.out.printf("First Name: %s\n",student1.getFirstName());
        System.out.printf("Last Name: %s\n",student1.getLastName());
        System.out.printf("Address: %s\n",student1.getAddress());
        System.out.printf("Student ID: %s\n",student1.getStudentId());
        System.out.printf("Course: %s\n",student1.getCourse());
    }
}
