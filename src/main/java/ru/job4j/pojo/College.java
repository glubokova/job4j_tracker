package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Aida Glubokova");
        student.setGroup("17-cd-8");
        student.setAdmissionDate(new Date());

        System.out.println("ФИО студента: " + student.getFullName());
        System.out.println("Группа: " + student.getGroup());
        System.out.println("Дата поступления: " + student.getAdmissionDate());
    }
}