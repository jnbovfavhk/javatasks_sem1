package org.knit.jnbovfavhk.sem1.lab11;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    void create(User user) throws SQLException;
    User findById(int id) throws SQLException;
    List<User> findAll() throws SQLException;
    void update(User user) throws SQLException;
    void delete(String email) throws SQLException;
    boolean emailExists(String email) throws SQLException;

}
