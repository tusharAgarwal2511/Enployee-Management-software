package dao;

import java.sql.*;
import databaseConnection.DatabaseConnection;


public class EmployeeDao {

    Connection connection;

    /***
     * Takes String name and String emaila dn inserts them into the database
     * @param name String
     * @param email String
     */
    public void insertData(String name, String email){

        try{

            connection = DatabaseConnection.getConnection();

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

    /***
     * Show the data to the user
     */

    public void getData(){

        try{

            connection = DatabaseConnection.getConnection();

            String GET_QUERY = "SELECT * FROM employeedetails";

            Statement getStatement = connection.createStatement();

            ResultSet result = getStatement.executeQuery(GET_QUERY);

            while(result.next()){
                int rowId = result.getInt("id");
                String rowName = result.getString("name");
                String rowEmail = result.getString("email");

                System.out.println("ID: " + rowId + " Name: " + rowName + " Email: " + rowEmail);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    /***
     * Takes the employee id and deleted the employee
     * with the given idd
     * @param userId int
     */
    public void deleteData(int userId){

        try{

            connection = DatabaseConnection.getConnection();

            String DELETE_QUERY = "DELETE FROM employeedetails WHERE id = ?";

            PreparedStatement deletePreparedStatement = connection.prepareStatement(DELETE_QUERY);

            deletePreparedStatement.setInt(1, userId);

            deletePreparedStatement.executeUpdate();

        }
        catch(Exception e){
            e.printStackTrace();
        }


    }


}
