package com.codegym;



import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private static List<Student> student234 = new ArrayList<>();


    public static void displayListStudent() {
        for (Student student : student234) {
            System.out.println(student);
        }
    }

    public static void addStudent(Student student) {
        student234.add(student);
    }

    public int size() {
        return student234.size();
    }

    public static Student findStudentByName(String name) {
        Student student = null;
        for (int index = 0; index < student234.size(); index++) {
            if (student234.get(index).getName().equals(name)){
                student = student234.get(index);
            }
        }
        return student;
    }
}
