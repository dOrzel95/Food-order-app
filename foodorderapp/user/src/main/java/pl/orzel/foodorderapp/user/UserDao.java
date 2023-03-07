package pl.orzel.foodorderapp.main;

import pl.orzel.foodorderapp.user.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    User getById(int id);
    User getByUsername(String username);
    boolean deleteById(int id);
    boolean save(User user);
}
