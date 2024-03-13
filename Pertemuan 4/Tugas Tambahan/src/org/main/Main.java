// Nama     : Fendi Ardianto
// NIM      : 24060122130077
// Nama File: Main.java
// Deskripsi: Membuat kelas Main untuk memanggil Student, Lecture, dan Course
package org.main;

import org.peran.*;


public class Main {
    public static void main(String[] args) {

        Student s1;
        Student s2;
        Lecture l1;
        Lecture l2;
        Course c1;
        Course c2;

        s1 = new Student("Fendi Ardianto", 20, "Pati", 77);
        s2 = new Student("Clara Zita Nabilla", 20, "Pati", 57);
        l1 = new Lecture("Spongebob Squarepants", 24, "Bikini Bottom", 123);
        l2 = new Lecture("Patrick Star", 22, "Bikini Bottom", 234);
        c1 = new Course("TMG123", "Teknik Meniup Gelembung", l2);
        c2 = new Course("MPU999", "Metodologi Penangkapan Ubur-Ubur", l1);
    
        s1.getDetails();
        s2.getDetails();
        l1.getDetails();
        l2.getDetails();

        l2.teachCourse(c1);
        l1.teachCourse(c2);
        c1.getDetails();
        c2.getDetails();

        l1.viewTaughtCourses();
        l2.viewTaughtCourses();

        c1.addStudent(s1);
        c1.addStudent(s2);
        c2.addStudent(s1);
        c1.viewEnrolledStudents();
        c2.viewEnrolledStudents();

        s1.viewEnrolledCourses();
        s2.viewEnrolledCourses();

        c1.removeStudent(s1);
        s1.viewEnrolledCourses();
    }
}
