package camo.firstterm.oopproject;

import camo.firstterm.oopproject.models.Course;
import camo.firstterm.oopproject.models.Student;
import camo.firstterm.oopproject.models.Subject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Subject> bsitSubjects = new ArrayList<>();
        ArrayList<Subject> bscsSubjects = new ArrayList<>();
        ArrayList<Student> studentList = new ArrayList<>();

        bsitSubjects.add(new Subject("STS2","Science Technology and Society",3));
        bsitSubjects.add(new Subject("COPRO2","Computer Programming 2",4));

        bscsSubjects.add(new Subject("NSTP2","National Service Training Program",3));
        bscsSubjects.add(new Subject("PCOMM","Purposive Communication",3));

        Course bsitCourse = new Course("BSIT","Bachelor of Science in Information Technology",bsitSubjects);
        Course bscsCourse = new Course("BSCS","Bachelor of Science in Computer Science",bscsSubjects);

        studentList.add(new Student("John Russell","Camo","Daraga, Albay","10229393", bsitCourse));
        studentList.add(new Student("Juan","Dela Cruz","Legazpi, Albay","02339242", bscsCourse));

        /*
        for(Student student : studentList){

            System.out.printf("\nStudent Number: %s\n",student.getStudentNumber());
            System.out.printf("Student Name: %S, %s\n",student.getLastName(),student.getFirstName());
            System.out.printf("Student Address: %s\n",student.getAddress());
            System.out.printf("Student Course: (%s) %s\n",student.getCourse().getCourseCode(),student.getCourse().getCourseDescription());
            System.out.print("Student Subjects:\n");

            int index = 1;

            for(Subject subject : student.getCourse().getSubjects()){
                System.out.printf("%d %s-%s (%d)\n",index ,subject.getSubjectCode(),subject.getSubjectDescription(),subject.getUnits());
                index++;
            }

        }
        */
    }
}
