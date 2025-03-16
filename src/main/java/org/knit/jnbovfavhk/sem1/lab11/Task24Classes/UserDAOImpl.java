package org.knit.jnbovfavhk.sem1.lab11.Task24Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    private final Connection connection;

    public UserDAOImpl() throws SQLException {
        this.connection = DataBaseConnection.getConnection();
    }

    @Override
    public void create(User user) throws SQLException {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.executeUpdate();

            System.out.println("Пользователь создан");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public User findById(int id) throws SQLException {
        User user = null;
        String sql = "SELECT * FROM users WHERE id = ?";


        try (PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {

                String name = rs.getString("name");
                String email = rs.getString("email");


                user = new User(name, email);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    @Override
    public List<User> findAll() throws SQLException {

        String sql = "SELECT * FROM users";

        List<User> recievedList = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                String name = rs.getString("name");
                String email = rs.getString("email");

                recievedList.add(new User(name, email));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return recievedList;
    }

    @Override
    public void update(User inputUser) throws SQLException {
        User user = new User(inputUser.getName(), inputUser.getEmail());

        String sql = "UPDATE users SET name=? email=?, WHERE email=?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getEmail());

            int countOfUpdatedStrings = statement.executeUpdate();

            System.out.printf("Было изменено %d строк", countOfUpdatedStrings);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void delete(String email) throws SQLException {
        String sql = "DELETE FROM users WHERE email=?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, email);

            statement.executeUpdate();

            System.out.println("Пользователь был удален");

    } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean emailExists(String email) throws SQLException {
        String sql = "SELECT * FROM users WHERE email=?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, email);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return true;
            }
        }
        return false;
    }
}
