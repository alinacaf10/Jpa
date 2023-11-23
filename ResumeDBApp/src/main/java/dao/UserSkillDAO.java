package dao;

import entity.UserSkill;

import java.util.List;

public interface UserSkillDAO {
    //TODO: naming convention is wrong in method name
    public List<UserSkill> getAllSkillbyId(int userId);
}
