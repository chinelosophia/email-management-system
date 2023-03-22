package data.repositories;

import data.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserRepositoryImp implements UserRepository {
    private int count;
    List<User> users=new ArrayList<>();

    @Override
    public User saveUser(User user) {
        if(user.getUserId() != 0) throw new IllegalArgumentException("You cant register twice");
        user.setUserId(count() + 1);
        users.add(user);
        count++;
        return user;
}

    @Override
    public User findUserByUserName(String username) {
        for (User user : users)
            if (Objects.equals(user.getUserName(), username)) {
                return user;
            }
        return null;
    }

    @Override
    public User findUserById(int id) {
        for (User user : users)
            if (user.getUserId() != 0) {
                return user;
            }
        return null;
    }
    @Override
    public int count() {
        return count;
    }

    @Override
    public void delete(User user) {
        for (User user1 :users)
            if(user.getUserId()!=0){
                users.remove(user1);
                count--;
                break;
            }
    }

    @Override
    public void deleteAll() {
        users.clear();

    }
}
