package dao;

import entity.Skill;

import java.util.List;

public interface SkillDAO {
    public List<Skill> getAllSkill();
    public boolean addSkill(Skill skill);
    public boolean removeSkill(int id);
    public boolean updateSkill(Skill skill);

    public Skill getSkillById(int skillId);
}
