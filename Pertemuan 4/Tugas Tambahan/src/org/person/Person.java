// Nama     : Fendi Ardianto
// NIM      : 24060122130077
// Nama File: Person.java
// Deskripsi: Membuat kelas Person untuk diturunkan sifatnya ke Student dan Lecture

package org.person;

public class Person {
    //Atribut
    protected String name;
    protected int age;
    protected String address;

    //Getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void getDetails(){
        System.out.println("Nama    : " + name);
        System.out.println("Umur    : " + age);
        System.out.println("Alamat  : " + address);
    }
}
