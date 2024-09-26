package com.codegym;



import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private static List<Student> viet = new ArrayList<>();


    public static void displayListStudent() {
        for (Student student : viet) {
            System.out.println(student);
        }
    }

    public static void addStudent(Student student) {
        viet.add(student);
    }

    public int size() {
        return viet.size();
    }

    public static Student findStudentByName(String name) {
        Student student = null;
        for (int index = 0; index < viet.size(); index++) {
            if (viet.get(index).getName().equals(name)){
                student = viet.get(index);
            }
        }
        return student;
    }
}
