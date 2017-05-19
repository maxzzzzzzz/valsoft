package com.DAO;

import com.company.Classes.impls.Bus.Bus;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 15.05.2017.
 */
public class BusDao implements IBusDao
{
    private static String URL = "jdbc:postgresql://localhost:5432/myDataBase";
    private static String USER = "postgres";
    private static String PASSWORD = "140798";

    private static BusDao instance;

    public static BusDao getInstance() throws SQLException {
        if (instance == null) {
            instance = new BusDao();
        }
        return instance;
    }

    public BusDao() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        connection = DriverManager.getConnection(URL,USER,PASSWORD);
    }

    private Connection connection;

    public void saveBus(Bus bus) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
                "INSERT INTO bus (weight,numberofpassengers,numberofwheels,name,speed)" +
                        " VALUES (?,?,?,?,?)");
        ps.setInt(1,bus.getWeight());
        ps.setInt(2,bus.getNumberOfPassengers());
        ps.setInt(3,bus.getNumberOfWheels());
        ps.setString(4,bus.getName());
        ps.setInt(5,bus.getSpeed());
        ps.execute();
        ps.close();
    }


    public List<Bus> allBuses() throws SQLException {
        List<Bus> result = new ArrayList<Bus>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT weight,numberofpassengers,numberofwheels,name,speed FROM bus");
        while(rs.next())
        {
            result.add(new Bus(rs.getString("name"),
                    rs.getInt("speed"),
                    rs.getInt("weight"),
                    rs.getInt("numberofpassengers"),
                    rs.getInt("numberofwheels")));
        }
        return result;
    }

    public boolean deleteBus(Bus bus) throws SQLException {
        String delete = "DELETE FROM bus WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(delete);
        statement.setInt(1, bus.getId());
        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        return rowDeleted;
    }

    public void updateBus(Bus bus,int id) throws SQLException {
        String sql = "UPDATE bus SET weight = ?, numberofpassengers = ?, numberofwheels = ?, name = ?,speed = ? WHERE id = ?";
        //sql += " WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,bus.getWeight());
        statement.setInt(2, bus.getNumberOfPassengers());
        statement.setInt(3, bus.getNumberOfWheels());
        statement.setString(4, bus.getName());
        statement.setInt(5, bus.getSpeed());
        statement.setInt(6, id);
        statement.close();
    }

    public Bus getBus(int id) throws SQLException {
        Bus bus = null;
        String sql = "SELECT * FROM bus WHERE id = ?";

        PreparedStatement statement =connection.prepareStatement(sql);
        statement.setInt(1, id);

        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            int weight = resultSet.getInt("weight");
            int numberOfPassengers = resultSet.getInt("numberofpassengers");
            int numberOfWheels = resultSet.getInt("numberofwheels");
            String name = resultSet.getString("name");
            int speed = resultSet.getInt("speed");
            bus = new Bus(name,speed,weight, numberOfPassengers, numberOfWheels);
        }

        resultSet.close();
        statement.close();

        return bus;
    }

}
