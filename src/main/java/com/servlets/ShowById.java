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
 * Created by Asus on 22.05.2017.
 */
@WebServlet("/serv/showById")
public class ShowById extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BusDao busDao = null;
        try {
            busDao = BusDao.getInstance();
            Integer id  = 0;
            id = Integer.valueOf(request.getParameter("id"));
            request.setAttribute("BUS",busDao.getBus(id));
            request.getRequestDispatcher("/showById.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
