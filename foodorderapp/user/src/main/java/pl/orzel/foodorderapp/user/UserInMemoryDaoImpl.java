package pl.orzel.foodorderapp.user;

import pl.orzel.foodorderapp.main.UserDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class UserInMemoryDaoImpl implements UserDao {

    Map<Optional, User> users = new HashMap<>();
    @Override
    public List<User> getAll() {
        return (List<User>) users;
    }

    @Override
    public User getById(int id) {
        return users.get(id);
    }

    @Override
    public User getByUsername(String username) {
        return users.get(username);
    }

    @Override
    public boolean deleteById(int id) {
        users.remove(id);
        return false;
    }

    @Override
    public boolean save(User user) {
        users.put()
        return false;
    }
}
