package com.test5.dao;


import com.test5.entity.Team.Team;
import org.springframework.stereotype.Component;

@Component("TeamDao")
public interface TeamDao {

    int createTeam(Team team);


    Team searchTeam(Team team);

}
