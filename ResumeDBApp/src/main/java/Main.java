import dao.DaoInter.SkillDaoInter;
import dao.DaoInter.UserDaoInter;
import entity.Skill;


public class Main {
    public static void main(String[] args) throws Exception {

        SkillDaoInter skillDaoInter=Context.instanceSkill();
        System.out.println(skillDaoInter.getSkillbyId(1).getName());

    }
}
