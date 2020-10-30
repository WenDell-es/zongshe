package com.test5.entity.Team.ResponseBody;

public class JoinTeamResponseBody {
    private int operationState;

    @Override
    public String toString() {
        return "JoinTeamResponseBody{" +
                "operationState=" + operationState +
                '}';
    }

    public int getOperationState() {
        return operationState;
    }

    public void setOperationState(int operationState) {
        this.operationState = operationState;
    }

    public JoinTeamResponseBody() {
    }

    public JoinTeamResponseBody(int operationState) {
        this.operationState = operationState;
    }
}
