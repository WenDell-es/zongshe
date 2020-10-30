package com.test5.entity.body;

public class LoginResponseBody {

    private int role;
    private int operationState;

    public LoginResponseBody() {

    }

    @Override
    public String toString() {
        return "loginResponseBody{" +
                "role=" + role +
                ", operationState=" + operationState +
                '}';
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getOperationState() {
        return operationState;
    }

    public void setOperationState(int operationState) {
        this.operationState = operationState;
    }

    public LoginResponseBody(int role, int operationState) {
        this.role = role;
        this.operationState = operationState;
    }

}
