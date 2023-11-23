import dao.SkillDAO;
import dao.UserDAO;

public class Main {
    public static void main(String[] args) {
        UserDAO user=Context.instanceUserDAO();
        System.out.println(user.getAll());

        //TODO: above line will fail because there is no data in the database
    }
}

/*
 *  1. Package names must be lowercase, that is the naming convention of Java.
 *    DaoImpl -> daoImpl, daoInter -> daoInter
 *  2. Instead of creating a separate package for both of them create only one inner package.
 *    dao -> impl
 *    interfaces will be on dao package, their implementations will be on dao.impl package
 *  3. AbstractDAO and other DAO classes don't follow the same naming convention, if you write
 *   with this way AbstractDAO, then follow this in other classes and interfaces as well. UserDAO, UserDAOImpl.
 *  in my opinion, it will be nicer if you write this way: AbstractDao, UseDao, UserDaoImpl.
 *  4. Always format your code before push.
 *  5. Personally, I would not add Inter suffix at the end of every Dao interface. UserDao or CountryDao is okay.
 *  UserDaoImpl, CountryDaoImpl make your intention absolutely clear that those are implementation of interfaces.
 *
 *
 */