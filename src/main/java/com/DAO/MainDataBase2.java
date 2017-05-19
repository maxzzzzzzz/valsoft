package com.DAO;

import com.company.Classes.impls.Bus.Bus;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Asus on 15.05.2017.
 */
public class MainDataBase2
{
    public static void main(String[] args) throws SQLException {
        BusDao busDao = BusDao.getInstance();
        List<Bus> busList = busDao.allBuses();
        for (int i = 0; i < busList.size(); i++) {
            System.out.println(busList.get(i).getName() + " "
                    + busList.get(i).getSpeed() + " " +
                    busList.get(i).getWeight() + " " +
                    busList.get(i).getNumberOfPassengers() + " " +
                    busList.get(i).getNumberOfWheels());
        }
        // System.out.println(databaseDAO.deleteBook(new Book("book2", 25.5, 399, 2000, 9)));
        Bus bus = new Bus("ultraBus",400,550,65,18);
        busDao.saveBus(bus);
//        busDao.updateBus(bus,2);
//        System.out.println(busDao.getBus(2));

    }
}
