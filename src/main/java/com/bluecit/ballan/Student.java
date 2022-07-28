package com.bluecit.ballan;

public class Student {
    private final String studentName;
    private final Integer studentId;


    public Student(Integer studentId,String studentName) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}
