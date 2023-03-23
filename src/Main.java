import dao.EmployeeDao;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to Employee Management Software");

        EmployeeDao employeeDao = new EmployeeDao();

        while(true){

            System.out.println("PRESS 1 to ENTER DATA");
            System.out.println("PRESS 2 to DELETE DATA");
            System.out.println("PRESS 3 to UPDATE DATA");
            System.out.println("PRESS 4 to SHOW DATA");
            System.out.println("PRESS 5 to EXIT");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int userChoice = Integer.parseInt(br.readLine());
                if(userChoice == 1){

                    System.out.println("ENTER EMPLOYEE NAME");
                    String employeeName = br.readLine();

                    System.out.println("ENTER EMPLOYEE EMAIL");
                    String employeeEmail = br.readLine();

                    employeeDao.InsertData(employeeName, employeeEmail);

                    System.out.println("DATA INSERTED");
                }
                else if(userChoice == 2){
                    // delete data
                }
                else if(userChoice == 3){
                    // update data
                }
                else if(userChoice == 4){
                    // show data
                }
                else if(userChoice == 5){
                    break;
                }
                else{
                    System.out.println("WRONG INPUT");
                }
        }


        System.out.println("See you soon");


    }
}
