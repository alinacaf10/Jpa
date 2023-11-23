package dao;

import entity.User;

import java.util.List;

public interface UserDAO {
    public boolean addUser(User u);
    public User getById(int id);
    public boolean deleteUser(int id);
    public List<User> getAll();
    public boolean updateUser(User u);

}
