package camo.oopproject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Subject sub1 = new Subject("STS","Science Technology and Society",2);
        Subject sub2 = new Subject("CP2","Computer Programming 2",3);

        ArrayList<Subject> newSubjects = new ArrayList<>();
        newSubjects.add(sub1);
        newSubjects.add(sub2);

        Course newCourse = new Course("BSIT","Bachelor of Science in Information Technology",newSubjects);
        Student newStudent = new Student("John Russell","Camo","Zone 5, Bascaran","10229393", newCourse);

        System.out.println(newStudent.getCourse().getSubjects().get(0).getSubjectDescription());

    }
}
