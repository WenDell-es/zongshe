package com.test5.service;

import com.test5.dao.TeamDao;
import com.test5.entity.Team.Team;
import org.springframework.beans.factory.annotation.Autowired;

public class JoinTeamServiceImpl implements JoinTeamService{
    @Autowired
    private TeamDao teamDao;

    @Override
    public Team searchTeam(Team team) {
        return teamDao.searchTeam(team);
    }
}
