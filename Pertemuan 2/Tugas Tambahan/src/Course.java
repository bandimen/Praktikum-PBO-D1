// Nama     : Fendi Ardianto
// NIM      : 24060122130077
// Nama File: Course.java
// Deskripsi: Membuat kelas Course dengan penerapan enkapsulasi dan relasi

import java.util.List;
import java.util.ArrayList;

public class Course {
    // Atribut
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    // Methods
    // Konstruktor
    Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    //Getter
    public String getCourseCode(){
        return courseCode;
    }
    public String getCourseName(){
        return courseName;
    }
    public Lecture getLecture(){
        return lecture;
    }

    //Setter
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setLecture(Lecture lecture){
        this.lecture = lecture;
    }

    //Method lain
    public void addStudent(Student student) {
        //System.out.println("Menjalankan method addStudent :");
        //System.out.println("Memasukkan mahasiswa " + student.getSName() + "ke dalam mata kuliah " + courseName);
        studentsEnrolled.add(student);
        student.enrollInCourse(this);
        //System.out.println("Method addStudent selesai dijalankan");
        //System.out.println();
    }

    public void removeStudent(Student student) {
        //System.out.println("Menjalankan method removeStudent :");
        //System.out.println("Menghapus mahasiswa " + student.getSName() + "dari mata kuliah " + courseName);
        studentsEnrolled.remove(student);
        student.dropFromCourse(this);
        //System.out.println("Method removeStudent selesai dijalankan");
        //System.out.println();
    }

    public void viewEnrolledStudents() {
       // System.out.println("Menjalankan method viewEnrolledStudents :");
        System.out.println("Daftar mahasiswa yang mengambil mata kuliah " + courseName + ":");
        for (Student student : studentsEnrolled) {
            System.out.println("- " +student.getSName());
        }
        System.out.println();
    }

    public void getDetails() {
        //System.out.println("Menjalankan method getDetails Course:");
        System.out.println("Data Mata Kuliah :");
        System.out.println("Nama MK         : " + courseName);
        System.out.println("Kode MK         : " + courseCode);
        System.out.println("Dosen Pengampu  : " + lecture.getLName());
        System.out.println();
    }  
}


