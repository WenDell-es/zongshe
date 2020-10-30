package com.test5.entity.Team;

import com.test5.entity.Student;

import java.util.List;

public class Team {
    private int teamID;
    private String teamLeaderID;
    private int subjectID;
    private List<Student> mumberList;

    @Override
    public String toString() {
        return "Team{" +
                "teamID=" + teamID +
                ", teamLeaderID='" + teamLeaderID + '\'' +
                ", subjectID=" + subjectID +
                ", mumberList=" + mumberList +
                '}';
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public String getTeamLeaderID() {
        return teamLeaderID;
    }

    public void setTeamLeaderID(String teamLeaderID) {
        this.teamLeaderID = teamLeaderID;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public List<Student> getMumberList() {
        return mumberList;
    }

    public void setMumberList(List<Student> mumberList) {
        this.mumberList = mumberList;
    }

    public Team(int teamID, String teamLeaderID, int subjectID, List<Student> mumberList) {
        this.teamID = teamID;
        this.teamLeaderID = teamLeaderID;
        this.subjectID = subjectID;
        this.mumberList = mumberList;
    }

    public Team() {
    }
}
