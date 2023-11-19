package com.teachmeskills.homeWork_6.Ex_2;

public class Student {
    public String name;
    public String surname;
    public String passportNumber;
    public String groupName;

    public Student(String name, String surname, String passportNumber, String groupName) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
        this.groupName = groupName;
    }
    public static Student createStudent(String name, String surname, String passportNumber, String groupName) {
        return new Student(name,surname,passportNumber,groupName);
    }
}

