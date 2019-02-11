package org.fasttrackit.persistance;

import org.fasttrackit.domain.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRepository {

    public User createUser(User user) {
        // when using reserved sql keywords, surround them with ticks: `
        String insertQuery = "INSERT INTO users (`name`, wonRaces) " +
                "VALUES ('" + user.getName() + "', " + user.getWonRaces() + ");";

        try (
                Connection connection = DatabaseConfiguration.getConnection();
                // todo: Statement will be replaced by PreparedStatement
                Statement statement = connection.createStatement()
        ) {
            int savedId = statement.executeUpdate(insertQuery);
            user.setId(savedId);
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
