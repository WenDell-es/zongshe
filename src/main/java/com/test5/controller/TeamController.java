package com.test5.controller;


import com.test5.entity.Student;
import com.test5.entity.Team.Team;
import com.test5.entity.Team.RequestBody.CreateTeamRequestBody;
import com.test5.entity.Team.ResponseBody.CreateTeamResponseBody;
import com.test5.service.CreateTeamService;
import com.test5.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("team")
public class TeamController {

    @Autowired
    CreateTeamService createTeamService;
    @Autowired
    InformationService informationService;

    @PostMapping("createTeam")
    public CreateTeamResponseBody createTeam(@CookieValue("ID") String cooike,@RequestBody CreateTeamRequestBody data){
        CreateTeamResponseBody reponseData=new CreateTeamResponseBody();
        if(data.getOperationID()==5){//验证操作码
            //验证cookie
            Student student;
            try {
                student=informationService.getStudentInformation(new Student(cooike));
                System.out.println("student = " + student);
            }
            catch (Exception e){
                reponseData.setOperationState(0);//未定义错误：数据库中不存在用户提交的cookieID
                return reponseData;
            }

            //检查学生是否已经加入队伍
           if(student.getTeamID()!=0){
               reponseData.setOperationState(-1);//
               return reponseData;
           }

           //创建队伍
            Team team=new Team();
            team.setTeamLeaderID(data.getStudentID());
            try {
                createTeamService.createTeam(team);
                reponseData.setOperationState(1);
                reponseData.setTeamID(team.getTeamID());
            }
            catch (Exception e){
                reponseData.setOperationState(-1);
                return reponseData;
            }
            //更新学生个人队伍信息
            student.setTeamID(team.getTeamID());
            try {
                createTeamService.updateStudentData(student);
            }
            catch (Exception e){
                reponseData.setOperationState(0);//数据库出毛病
                return reponseData;
            }
        }
        else {
            reponseData.setOperationState(-3);//操作码错误
        }
        return reponseData;
    }


}
