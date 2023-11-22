package dao.DaoInter;

import entity.Skill;

import java.util.List;

public interface SkillDaoInter {
    public List<Skill> getAllSkill();
    public boolean addSkill(Skill skill);
    public boolean removeSkill(int id);
    public boolean updateSkill(Skill skill);

    //TODO: naming convention is wrong in method name
    public Skill getSkillbyId(int skillId);
}
