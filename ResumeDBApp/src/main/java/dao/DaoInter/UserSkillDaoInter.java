package dao.DaoInter;

import entity.UserSkill;

import java.util.List;

public interface UserSkillDaoInter {
    public List<UserSkill> getAllSkillbyId(int userId);
}
