package com.codegym;



import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private static List<Student> students = new ArrayList<>();


    public static void displayListStudent() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void addStudent(Student student) {
        students.add(student);
    }

    public int size() {
        return students.size();
    }

    public static Student findStudentByName(String name) {
        Student student = null;
        for (int index = 0; index < students.size(); index++) {
            if (students.get(index).getName().equals(name)){
                student = students.get(index);
            }
        }
        return student;
    }
}
