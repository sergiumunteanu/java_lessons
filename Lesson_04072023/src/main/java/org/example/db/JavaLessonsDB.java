package org.example.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JavaLessonsDB {
    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/java_lessons_db";
        String username = "root";
        String password = "serjcom90";
        return DriverManager.getConnection(url, username, password);
    }

//    public void create(String name, String department, double sallary){
//        try{
//            Connection connection = getConnection();
//            String sql = "INSERT INTO employees (`name`, `department`, `sallary`) " +
//                         "VALUES ('" + name + "', '" + department + "', " + sallary + ")";
//            Statement stmt = connection.createStatement();
//            int rows = stmt.executeUpdate(sql);
//            connection.close();
//            System.out.println("Success ");
//        }catch (SQLException ex){
//            System.out.println("Error insert employy: " + ex.getMessage());
//        }
//    }

    public void create(Employee employee){
        try{
            Connection connection = getConnection();
            String sql = "INSERT INTO employees (`name`, `department`, `sallary`) " +
                    "VALUES ('" + employee.getName() + "', '" + employee.getDepartment() + "', " + employee.getSallary() + ")";
            Statement stmt = connection.createStatement();
            int rows = stmt.executeUpdate(sql);
            connection.close();
            System.out.println("Success ");
        }catch (SQLException ex){
            System.out.println("Error insert employy: " + ex.getMessage());
        }
    }

    public void delete(int id){

    }

    public List<Employee> selectAll()
    {
        List<Employee> list = new ArrayList<>();
        try{
            Connection connection = getConnection();
            String sql = "SELECT id, name, department, sallary from employees";
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);

            while(resultSet.next()){
                list.add(new Employee(
                                resultSet.getInt("id"),
                                resultSet.getString("name"),
                                resultSet.getString("department"),
                                resultSet.getDouble("sallary")
                        )
                );
            }
            connection.close();
            //System.out.println("Success ");
        }catch (SQLException ex){
            //System.out.println("Error select employy: " + ex.getMessage());
        }

        return list;
    }

//    public void selectAll(){
//        try{
//            Connection connection = getConnection();
//            String sql = "SELECT id, name, department, sallary from employees";
//            Statement stmt = connection.createStatement();
//            ResultSet resultSet = stmt.executeQuery(sql);
//            while(resultSet.next()){
//                System.out.println(
//                resultSet.getInt("id") + " " +
//                resultSet.getString("name")+ " " +
//                resultSet.getString("department")
//                );
//            }
//            connection.close();
//            System.out.println("Success ");
//        }catch (SQLException ex){
//            System.out.println("Error select employy: " + ex.getMessage());
//        }
//    }
}
