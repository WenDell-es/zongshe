package com.test5.entity.Team.ResponseBody;

public class CreateTeamResponseBody {
    private int teamID;
    private int operationState;

    @Override
    public String toString() {
        return "CreateTeamResponseBody{" +
                "teamID=" + teamID +
                ", operationState=" + operationState +
                '}';
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public int getOperationState() {
        return operationState;
    }

    public void setOperationState(int operationState) {
        this.operationState = operationState;
    }

    public CreateTeamResponseBody(int teamID, int operationState) {
        this.teamID = teamID;
        this.operationState = operationState;
    }

    public CreateTeamResponseBody() {
    }
}
