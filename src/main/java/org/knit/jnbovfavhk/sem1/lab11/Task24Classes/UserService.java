package org.knit.jnbovfavhk.sem1.lab11.Task24Classes;

import java.sql.*;
import java.util.List;

public class UserService {


    private final UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void registerUser(String name, String email) throws SQLException {
        if (userDAO.emailExists(email)) {
            System.out.println("Пользователь с такой почтой уже зарегистрирован");
        } else {
            userDAO.create(new User(name, email));
        }
    }

    public List<User> listAllUsers() throws SQLException {
        return userDAO.findAll();
    }

    public  void deleteUser(String email) throws SQLException {
        userDAO.delete(email);
    }

    public void updateUser(String newName, String newEmail) throws SQLException {
        User user = new User(newName, newEmail);
        userDAO.update(user);
    }
}
