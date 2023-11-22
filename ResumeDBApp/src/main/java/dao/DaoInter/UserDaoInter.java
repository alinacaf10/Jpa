package dao.DaoInter;

import entity.User;
import entity.UserSkill;

import java.util.List;

public interface UserDaoInter {
    public boolean addUser(User u);
    public User getById(int id);
    public boolean deleteUser(int id);
    public List<User> getAll();
    public boolean updateUser(User u);

}
