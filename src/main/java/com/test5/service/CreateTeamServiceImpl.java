package com.test5.service;

import com.test5.dao.StudentDao;
import com.test5.dao.TeamDao;
import com.test5.entity.Student;
import com.test5.entity.Team.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateTeamServiceImpl implements CreateTeamService{
    @Autowired
    private TeamDao teamDao;

    @Autowired
    private StudentDao studentDao;
    @Override
    public int createTeam(Team team) {
        return teamDao.createTeam(team);
    }

    @Override
    public void updateStudentData(Student student) {
        studentDao.update(student);
    }
}
