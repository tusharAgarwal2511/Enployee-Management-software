package dao;

import java.sql.*;
import databaseConnection.DatabaseConnection;


public class EmployeeDao {

    // inserts the data
    public void InsertData(String name, String email){

//        boolean isDataInserted = false;

        try{

            Connection connection = DatabaseConnection.getConnection();

            String INSERT_QUERY = "INSERT INTO employeedetails(name, email) VALUES(?, ?)";

            PreparedStatement insertPreparedStatement = connection.prepareStatement(INSERT_QUERY);

            insertPreparedStatement.setString(1, name);
            insertPreparedStatement.setString(2, email);

            insertPreparedStatement.executeUpdate();

//            isDataInserted = true;

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
