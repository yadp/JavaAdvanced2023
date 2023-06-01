package com.company.preparation.Demo;

import java.util.ArrayList;
import java.util.List;


public class School {

    private String name;
    private List<String> students;
    private List<String> teachers;
    private List<String> classes;

    public School(String name){
        this.name= name;
        this.students= new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.classes = new ArrayList<>();
    }

    public void addStudent(String student){
        students.add(student);
    }

    public void removeStudent(String student){
        students.remove(student);
    }

    public void addTeacher(String teacher){
        teachers.add(teacher);
    }

    public void removeTeacher(String teacher){
        teachers.remove(teacher);
    }

    public void createClass(String name){
        classes.add(name);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", teachers=" + teachers +
                ", classes=" + classes +
                '}';
    }
}

