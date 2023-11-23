
import dao.*;
import dao.impl.*;


public class Context {
    //TODO: Method names can be noun sometimes, like following situations, you can add get in front of every method
    // but this is optional, following methods' names make the intention clear.
    public static UserDAO instanceUserDAO(){
        return new UserDaoImpl();
    }
    public static UserSkillDAO instanceUserSkillDAO(){
        return new UserSkillDaoImpl();
    }

    //TODO: add Dao suffix at the end of  followings method names, because you have to follow what you did above
    public static EmploymentDAO instanceEmploymentHistoryDAO(){

        return new EmploymentDaoImpl();
    }

    public static SkillDAO instanceSkillDAO(){
        return new SkillDaoImpl();
    }
    public static CountryDAO instanceCountryDAO(){
        return new CountryDaoImpl();
    }
}
