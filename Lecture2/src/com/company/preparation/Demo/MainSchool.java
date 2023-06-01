package com.company.preparation.Demo;

public class MainSchool {
    public static void main(String[] args) {
        School school= new School("New School");
        school.addStudent("Tom");
        school.addTeacher("Ben");
        school.createClass("Java");
        System.out.println(school);
    }
}
