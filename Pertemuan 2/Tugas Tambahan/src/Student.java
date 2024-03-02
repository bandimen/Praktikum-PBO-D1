// Nama     : Fendi Ardianto
// NIM      : 24060122130077
// Nama File: Student.java
// Deskripsi: Membuat kelas Student dengan penerapan enkapsulasi dan relasi

import java.util.List;
import java.util.ArrayList;

public class Student {
    // Atribut
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    //Methods
    //Konstruktor
    Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    //Getter
    public String getSName(){
        return name;
    }
    public int getSAge(){
        return age;
    }
    public String getSAddress(){
        return address;
    }
    public int getStudentID(){
        return studentID;
    }

    //Setter
    public void setSName(String name){
        this.name = name;
    }
    public void setSAge(int age){
        this.age = age;
    }
    public void setSAddress(String address){
        this.address = address;
    }
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


