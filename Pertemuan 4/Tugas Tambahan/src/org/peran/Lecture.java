// Nama     : Fendi Ardianto
// NIM      : 24060122130077
// Nama File: Lecture.java
// Deskripsi: Membuat kelas Lecture dengan penerapan enkapsulasi dan relasi

package org.peran;

import org.person.Person;

import java.util.List;
import java.util.ArrayList;

public class Lecture extends Person{
    //Atribut
    private int employeeID;
    private List<Course> coursesTaught;

    // Methods
    // Konstruktor
    public Lecture(String name, int age, String address, int employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    // Getter
    public int getEmployeeID(){
        return employeeID;
    }

    // Setter
    public void setLEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }


    // Method lain
    public void getDetails() {
        //System.out.println("Menjalankan method getDetails Lecture:");
        System.out.println("Data Dosen :");
        System.out.println("Nama    : " + name);
        System.out.println("Umur    : " + age);
        System.out.println("Alamat  : " + address);
        System.out.println("NIP     : " + employeeID);
        System.out.println();
    } 

    public void teachCourse(Course course) {
        //System.out.println("Menjalankan method teachCourse :");
        //System.out.println("Memasukkan dosen " + name + " sebagai pengajar mata kuliah " + course.getCourseName());
        coursesTaught.add(course);
        course.setLecture(this);
        //System.out.println("Method teachCourse selesai dijalankan");
        //System.out.println();
    }

    public void viewTaughtCourses() {
        //System.out.println("Menjalankan method viewTaughtCourses :");
        System.out.println("Daftar mata kuliah yang diampu oleh dosen " + name + ":");
        for (Course course : coursesTaught) {
            System.out.println("- " + course.getCourseName());
        }
        System.out.println();
    }
}
