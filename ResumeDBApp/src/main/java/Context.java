
import dao.DaoImpl.*;
import dao.DaoInter.*;


public class Context {
    //TODO: Method names can be noun sometimes, like following situations, you can add get in front of every method
    // but this is optional, following methods' names make the intention clear.
    public static UserDaoInter instanceUserDao(){
        return new UserDaoImpl();
    }
    public static UserSkillDaoInter instanceUserSkillDao(){
        return new UserSkillDaoImpl();
    }

    //TODO: add Dao suffix at the end of  followings method names, because you have to follow what you did above
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
