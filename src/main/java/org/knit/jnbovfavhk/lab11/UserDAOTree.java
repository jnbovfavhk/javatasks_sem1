package org.knit.jnbovfavhk.lab11;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UserDAOTree implements UserDAO {

    Set<User> users = new HashSet<>();

    @Override
    public void create(User user) throws SQLException {
        users.add(user);
    }

    @Override
    public User findById(int id) throws SQLException {
        return users.stream().filter(user -> id == user.getId()).findAny().get();
    }

    @Override
    public List<User> findAll() throws SQLException {
        return users.stream().collect(Collectors.toList());
    }

    @Override
    public void update(User user) throws SQLException {
        User byId = findById(user.getId());
        byId.setEmail(user.getEmail());
        byId.setName(user.getName());
    }

    @Override
    public void delete(String email) throws SQLException {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.getEmail().equals(email)){
                iterator.remove();
            }
        }
    }

    @Override
    public boolean emailExists(String email) throws SQLException {
        return users.stream().filter(user -> user.getEmail().equals(email)).findAny().isPresent();
    }
}
