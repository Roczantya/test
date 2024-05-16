package com.example;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
    @Table(name = "student")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int NIM;

    @Column(name="Name")
    private String Name;

    @Column(name = "Age")
    private int Age;

    @Column(name = "Major")
    private String Major;

    @Column(name = "Address")
    private String Address;

    public Student(){

    }

    public Student(int NIM, String Name, int Age, String Major, String Address) {
        this.NIM = NIM;
        this.Name = Name;
        this.Age = Age;
        this.Major = Major;
        this.Address = Address;
    }
    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    } 
        public String toString() {
            return "Student{" +
                   "NIM=" + NIM +
                   ", Name='" + Name + '\'' +
                   ", Age=" + Age +
                   ", Major='" + Major + '\'' +
                   ", Address='" + Address + '\'' +
                   '}';
         
    }
}
