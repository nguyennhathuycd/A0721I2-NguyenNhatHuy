package dao;

import model.User;

import java.util.List;

public interface IUserDao {
    public void insertUser(User user);
    public boolean updateUser(User user);
    public boolean deleteUser(int id);
    public User selectUserById(int id);
    public List<User> selectAllUsers();
}
