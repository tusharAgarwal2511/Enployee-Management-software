package databaseConnection;

import passwordAndUser.MySQLPasswordAndUser;

import java.sql.*;
public class DatabaseConnection {

    public static Connection connection;
    static MySQLPasswordAndUser mySqlPasswordAndUser = new MySQLPasswordAndUser();

    public static Connection getConnection(){


        try{

            if(connection == null){
                Class.forName("com.mysql.cj.jdbc.Driver");

                String URL = "jdbc:mysql://localhost:3306/ems";
                String PASSWORD = mySqlPasswordAndUser.PASSWORD;
                String USER = mySqlPasswordAndUser.USER;

                connection = DriverManager.getConnection(URL,USER, PASSWORD);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return connection;

    }

}
