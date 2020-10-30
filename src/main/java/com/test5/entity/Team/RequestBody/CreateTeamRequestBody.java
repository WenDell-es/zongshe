package com.test5.entity.Team.RequestBody;

public class CreateTeamRequestBody {
    private String studentID;
    private int operationID;

    @Override
    public String toString() {
        return "CreateTeamRequestBody{" +
                "studentID='" + studentID + '\'' +
                ", operationID=" + operationID +
                '}';
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getOperationID() {
        return operationID;
    }

    public void setOperationID(int operationID) {
        this.operationID = operationID;
    }

    public CreateTeamRequestBody(String studentID, int operationID) {
        this.studentID = studentID;
        this.operationID = operationID;
    }

    public CreateTeamRequestBody() {
    }
}
