/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author russ
 */

import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();
        
        System.out.print("Enter student First Name: ");
        student1.setFirstName(scanner.nextLine());
        
        System.out.print("Enter student Last Name: ");
        student1.setLastName(scanner.nextLine());
        
        System.out.print("Enter student Address: ");
        student1.setAddress(scanner.nextLine());
        
        System.out.print("Enter student Course: ");
        student1.setCourse(scanner.nextLine());
        
        System.out.print("Enter student ID: ");
        student1.setStudentId(scanner.nextLine());
        
        System.out.println("First Name: " + student1.getFirstName());
        System.out.println("Last Name: " + student1.getLastName());
        System.out.println("Address: " + student1.getAddress());
        System.out.println("Course: " + student1.getCourse());
        System.out.println("Student ID: " + student1.getStudentId());
        
    }
    
}
