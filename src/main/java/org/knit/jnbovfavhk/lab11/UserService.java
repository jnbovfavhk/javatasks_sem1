package org.knit.jnbovfavhk.lab11;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    public static void registerUser(String name, String email) throws SQLException {
        UserDAOImpl dao = new UserDAOImpl();
        if (dao.emailExists(email)) {
            System.out.println("Пользователь с такой почтой уже зарегистрирован");
        } else {
            dao.create(new User(name, email));
        }
    }

    public static List<User> listAllUsers() throws SQLException {
        UserDAOImpl dao = new UserDAOImpl();
        return dao.findAll();
    }

    public static void deleteUser(String email) throws SQLException {
        UserDAOImpl dao = new UserDAOImpl();
        dao.delete(email);
    }

    public static void updateUser(String newName, String newEmail) throws SQLException {
        UserDAOImpl dao = new UserDAOImpl();
        User user = new User(newName, newEmail);

        dao.update(user);
    }
}
