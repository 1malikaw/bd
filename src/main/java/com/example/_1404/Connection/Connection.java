package com.example._1404.Connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connection {

    public Connection connection = null;

    public Connection getConnection(){
        //Ссылка для подключения к базе данных
        String url = "jdbc:mysql://localhost:3306/company";

        //Имя пользователя и пароль для подключения к базе данных
        String username = "root";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection(url, username, "");

            if (connection != null) {
                System.out .println("Successfully connected to MySQL database test");
            }
        } catch (Exception ex) {
            System.out .println("An error occurred while connecting MySQL database");
            ex.printStackTrace();
        }
        return connection;
    }
}

