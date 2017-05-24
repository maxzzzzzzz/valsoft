package com.DAO;

import com.company.Classes.impls.Bus.Bus;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Asus on 15.05.2017.
 */
public interface IBusDao
{
    void saveBus(Bus bus) throws SQLException;
    List<Bus> allBuses() throws SQLException;
    boolean deleteBus(Bus bus) throws SQLException;
    public void updateBus(Bus bus) throws SQLException;
    public Bus getBus(int id) throws SQLException;
}
