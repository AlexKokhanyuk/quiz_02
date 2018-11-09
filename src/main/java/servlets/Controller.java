package servlets;

import beans.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Kokhaniuk
 * on 26.10.2018 15:33
 */
//@WebServlet("/servlet")

public class Controller extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");

        User userBean = new User();
        userBean.setName(name);
        userBean.setSurName(surname);
        userBean.incrKittyPet();
        req.getSession().setAttribute("user", userBean);
        req.getRequestDispatcher("page.jsp").forward(req, resp);
    }
}
