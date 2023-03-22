package data.repositories;

import data.model.User;

public interface UserRepository {
    public User saveUser(User user);
    public User findUserByUserName(String username);
    public User findUserById(int id);
    public int count();
    public void delete(User user);
    public void deleteAll();

}
