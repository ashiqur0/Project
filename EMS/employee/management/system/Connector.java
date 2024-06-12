package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    
    Connection connection;
    java.sql.Statement statement;

    public Connector(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeManagement", "root", "Somrat2018");
            statement = connection.createStatement();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
