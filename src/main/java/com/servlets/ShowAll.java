package com.servlets;

import com.DAO.BusDao;
import com.company.Classes.impls.Bus.Bus;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Asus on 19.05.2017.
 */
@WebServlet("/serv/showAll")
public class ShowAll extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BusDao busDao = null;
        try {
            busDao = BusDao.getInstance();
            List<Bus> busList = busDao.allBuses();
            request.setAttribute("BUSES",busList);
            request.getRequestDispatcher("/showAll.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
