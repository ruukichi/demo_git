package com.codegym;



import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private static List<Student> studentArrayList = new ArrayList<>();


    public static void displayListStudent() {
        for (Student student : studentArrayList) {
            System.out.println(student);
        }
    }

    public static void addStudent(Student student) {
        studentArrayList.add(student);
    }

    public int size() {
        return studentArrayList.size();
    }

    public static Student findStudentByName(String name) {
        Student student = null;
        for (int index = 0; index < studentArrayList.size(); index++) {
            if (studentArrayList.get(index).getName().equals(name)){
                student = studentArrayList.get(index);
            }
        }
        return student;
    }
}
