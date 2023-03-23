package dao;

import java.sql.*;
import databaseConnection.DatabaseConnection;


public class EmployeeDao {

    /***
     * Takes String name and String emaila dn inserts them into the database
     * @param name String
     * @param email String
     */
    public void InsertData(String name, String email){

        try{

            Connection connection = DatabaseConnection.getConnection();

            String INSERT_QUERY = "INSERT INTO employeedetails(name, email) VALUES(?, ?)";

            PreparedStatement insertPreparedStatement = connection.prepareStatement(INSERT_QUERY);

            insertPreparedStatement.setString(1, name);
            insertPreparedStatement.setString(2, email);

            insertPreparedStatement.executeUpdate();


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
