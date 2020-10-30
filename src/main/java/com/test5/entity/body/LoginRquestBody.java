package com.test5.entity.body;

public class LoginRquestBody {
    private String studentID;
    private String password;
    private int operationID;

    public LoginRquestBody() {
    }

    public String getStudentID() {
        return studentID;
    }

    public String getPassword() {
        return password;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setOperationID(int operationID) {
        this.operationID = operationID;
    }

    public int getOperationID() {
        return operationID;
    }

}
