// Nama     : Fendi Ardianto
// NIM      : 24060122130077
// Nama File: Student.java
// Deskripsi: Membuat kelas Student dengan penerapan enkapsulasi dan relasi

package org.peran;

import org.person.Person;

import java.util.List;
import java.util.ArrayList;

public class Student extends Person{
    // Atribut
    private int studentID;
    private List<Course> coursesEnrolled;

    //Methods
    //Konstruktor
    public Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    //Getter

    public int getStudentID(){
        return studentID;
    }

    //Setter
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    //Method lain
    public void getDetails() {
        //System.out.println("Menjalankan method getDetails Student :");
        System.out.println("Data Mahasiswa :");
        System.out.println("Nama    : " + name);
        System.out.println("Umur    : " + age);
        System.out.println("Alamat  : " + address);
        System.out.println("NIM     : " + studentID);
        System.out.println();
    }

    public void enrollInCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void dropFromCourse(Course course) {
        coursesEnrolled.remove(course);
    }

    public void viewEnrolledCourses() {
        //System.out.println("Menjalankan method viewEnrolledCourses :");
        System.out.println("Daftar mata kuliah yang diambil oleh mahasiswa " + name + ":");
        for (Course course : coursesEnrolled) {
            System.out.println("- " +course.getCourseName());;
        }
        System.out.println();
    }
}


