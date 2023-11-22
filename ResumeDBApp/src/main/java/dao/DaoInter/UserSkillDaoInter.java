package dao.DaoInter;

import entity.UserSkill;

import java.util.List;

public interface UserSkillDaoInter {
    //TODO: naming convention is wrong in method name
    public List<UserSkill> getAllSkillbyId(int userId);
}
