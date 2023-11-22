
import dao.DaoImpl.*;
import dao.DaoInter.*;


public class Context {
    public static UserDaoInter instanceUserDao(){
        return new UserDaoImpl();
    }
    public static UserSkillDaoInter instanceUserSkillDao(){
        return new UserSkillDaoImpl();
    }
    public static EmploymentDaoInter instanceEmploymentHistory(){

        return new EmploymentDaoImpl();
    }
    public static SkillDaoInter instanceSkill(){
        return new SkillDaoImpl();
    }
    public static CountryDaoInter instanceCountry(){
        return new CountryDaoImpl();
    }
}
