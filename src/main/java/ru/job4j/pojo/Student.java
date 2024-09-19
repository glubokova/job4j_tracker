package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fullName;
    private String group;
    private Date admissionDate;

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String FIO) {
        this.fullName = fullName;
    }
}