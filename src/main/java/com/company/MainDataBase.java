package com.company;


import com.company.Classes.impls.Bus.Bus;
import com.sun.org.apache.bcel.internal.util.ClassPath;

import java.sql.*;

/**
 * Created by Asus on 10.05.2017.
 */
public class MainDataBase
{
    private static final String URL = "jdbc:postgresql://localhost:5432/myDataBase";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "140798";

        public static void main(String[] argv){
            String GET_ALL = "SELECT * FROM bus";
            PreparedStatement preparedStatement = null;
            String INSERT_NEW = "INSERT INTO bus VALUES(?,?,?,?,?)";
            String DELETE = "DELETE FROM bus WHERE weight=?";
            try {
                Class.forName("org.postgresql.Driver");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try(Connection connection = DriverManager
                    .getConnection(URL, USERNAME, PASSWORD); Statement statement = connection.createStatement()) {

                //statement.addBatch("UPDATE bus SET name='new name' WHERE id =1");
               // statement.addBatch("INSERT INTO bus(wheight, numberofpassengers, numberofwheels, name, speed) VALUES(150,25,8,'superBus',300);");
               // statement.executeBatch();
                //statement.clearBatch();
                //statement.close();
                 //ResultSet res = statement.executeQuery("SELECT FROM bus");

                preparedStatement  = connection.prepareStatement(DELETE);
                preparedStatement.setInt(1,150);
                preparedStatement.executeUpdate();
                preparedStatement = connection.prepareStatement(INSERT_NEW);
                preparedStatement.setInt(1,150);
                preparedStatement.setInt(2,12);
                preparedStatement.setInt(3,16);
                preparedStatement.setString(4,"superPuperBus");
                preparedStatement.setInt(5,120);
                preparedStatement.execute();
                ResultSet resultSet = statement.executeQuery(GET_ALL);
                while (resultSet.next())
                {
                    Bus bus = new Bus();
                    bus.setWeight(resultSet.getInt("weight"));
                    bus.setNumberOfPassengers(resultSet.getInt("numberOfPassengers"));
                    bus.setNumberOfWheels(resultSet.getInt("numberOfWheels"));
                    bus.setName(resultSet.getString("name"));
                    bus.setSpeed(resultSet.getInt("speed"));
                    System.out.println(bus);
                }


            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

}
