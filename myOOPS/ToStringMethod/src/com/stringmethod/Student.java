package com.stringmethod;

public class Student {
	String name;
    int rollNo;
    String course;

    // Constructor
    Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Student [Name: " + name + ", Roll No: " + rollNo + ", Course: " + course + "]";
    }

}
