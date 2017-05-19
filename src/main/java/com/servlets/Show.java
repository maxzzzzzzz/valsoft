package com.servlets;

import com.DAO.BusDao;
import com.company.Classes.impls.Bus.Bus;
import sun.util.BuddhistCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Asus on 19.05.2017.
 */
@WebServlet("/serv/show")
public class Show extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Integer speed = Integer.valueOf(request.getParameter("speed"));
        Integer weight = Integer.valueOf(request.getParameter("weight"));
        Integer numberOfPassengers = Integer.valueOf(request.getParameter("numPass"));
        Integer numberOfWheels = Integer.valueOf(request.getParameter("numWheels"));
        Bus bus = new Bus(name,speed,weight,numberOfPassengers,numberOfWheels);
        BusDao busDao = null;
        try {
            busDao = BusDao.getInstance();
            busDao.saveBus(bus);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("BUS",bus);
        request.getRequestDispatcher("/showAdded.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request, response);
    }
}
