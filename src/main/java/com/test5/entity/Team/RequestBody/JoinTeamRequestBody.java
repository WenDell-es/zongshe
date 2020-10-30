package com.test5.entity.Team.RequestBody;

public class JoinTeamRequestBody {
    private String studentID;
    private int teamID;
    private int operationID;

    @Override
    public String toString() {
        return "JoinTeamRequestBody{" +
                "studentID='" + studentID + '\'' +
                ", teamID=" + teamID +
                ", operationID=" + operationID +
                '}';
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public int getOperationID() {
        return operationID;
    }

    public void setOperationID(int operationID) {
        this.operationID = operationID;
    }

    public JoinTeamRequestBody(String studentID, int teamID, int operationID) {
        this.studentID = studentID;
        this.teamID = teamID;
        this.operationID = operationID;
    }

    public JoinTeamRequestBody() {
    }
}
