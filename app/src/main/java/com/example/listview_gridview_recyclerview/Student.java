package com.example.listview_gridview_recyclerview;

public class Student {
    public String roll_no;
    public String name;
    public String address;

    public Student(String name,String roll_no,String address){
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
    }

    public String getRoll_no(){
        return roll_no;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}
