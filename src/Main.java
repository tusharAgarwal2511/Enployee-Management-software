import dao.EmployeeDao;

import java.sql.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {

        Connection connection = databaseConnection.DatabaseConnection.getConnection();

        System.out.println("Welcome to Employee Management Software");

        EmployeeDao employeeDao = new EmployeeDao();

        while(true){

            System.out.println("");
            System.out.println("");
            System.out.println("PRESS 1 to ENTER DATA");
            System.out.println("PRESS 2 to DELETE DATA");
            System.out.println("PRESS 3 to SHOW DATA");
            System.out.println("PRESS 4 to EXIT");
            System.out.println("");
            System.out.println("");


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int userChoice = Integer.parseInt(br.readLine());
                if(userChoice == 1){

                    System.out.println("ENTER EMPLOYEE NAME");
                    String employeeName = br.readLine();

                    System.out.println("ENTER EMPLOYEE EMAIL");
                    String employeeEmail = br.readLine();

                    employeeDao.insertData(employeeName, employeeEmail);

                    System.out.println("DATA INSERTED");
                }
                else if(userChoice == 2){
                    System.out.println("ENTER THE ID OF THE USER YOU WANT TO DELETE");

                    int id = Integer.parseInt(br.readLine());

                    employeeDao.deleteData(id);

                    System.out.println("DELETED");
                }
                else if(userChoice == 3){

                    System.out.println("Here is the data");
                    employeeDao.getData();

                }
                else if(userChoice == 4){
                    break;
                }
                else{
                    System.out.println("WRONG INPUT");
                }
        }


        System.out.println("See you soon");
        connection.close();

    }
}
