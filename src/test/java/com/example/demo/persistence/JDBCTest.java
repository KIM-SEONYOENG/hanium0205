package com.example.demo.persistence;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection() {
        try (Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/test?autoReconnect=true&userSSL=false",
                            "root",
                            "1q2w3e4r")) {
            System.out.println(con);
            } catch (SQLException e) {
                e.printStackTrace();
        }
    }
}
