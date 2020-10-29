package com.test5.entity;




public class Student {
    private String studentID;
    private String studentName;
    private String studentPassword;
    private int teamID;
    private int subjectID;

    public Student(){}

    public Student(String studentID, String studentName, String studentPassword) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentPassword = studentPassword;
    }

    public Student(String studentID){
        this.studentID=studentID;
    }
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentPassword='" + studentPassword + '\'' +
                ", teamID=" + teamID +
                ", subjectID=" + subjectID +
                '}';
    }
}
