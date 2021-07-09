package com.example.recycleview2we;

public class StudentModel {
   private String name;
    private int age;
    private  String address;
    private int imageid;
    private String Dob;

    public StudentModel(String name, int age, String address, int imageid,String Dob) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.imageid = imageid;
        this.Dob=Dob;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getImageid() {
        return imageid;
    }

    public String getDob(){
        return Dob;
    }





}

