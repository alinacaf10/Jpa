import dao.SkillDAO;
import dao.UserDAO;

public class Main {
    public static void main(String[] args) {
        UserDAO user=Context.instanceUserDAO();
        System.out.println(user.getAll());

    }
}



