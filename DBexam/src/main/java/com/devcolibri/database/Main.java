package com.devcolibri.database;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/my_db_test";
    private static final  String USERNAME = "root";
    private static final String PASSWORD = "Rootroot";


    public static void main(String[] args) {
        Connection connection;

        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
            if (!connection.isClosed()){
                System.out.println(" соединенеи с бд установлено ");
            }

            connection.close();

            if (connection.isClosed()){
                System.out.println(" соединенеи с бд закрыто ");
            }

        } catch (SQLException e) {
            System.err.println("Э!неудалость загрузить класс драйвера!");
        }
    }
}
