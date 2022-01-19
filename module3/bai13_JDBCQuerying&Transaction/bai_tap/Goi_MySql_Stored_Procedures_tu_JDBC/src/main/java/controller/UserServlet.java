package controller;

import dao.UserDao;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = "/users")
public class UserServlet extends HttpServlet {
    private UserDao userDao = new UserDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        listUsers(req, resp);
    }

    private void listUsers(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = userDao.selectAllUsers();
        req.setAttribute("users", users);
        req.getRequestDispatcher("/users/list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action) {
            case "create": createUser(req, resp); break;
            case "delete": deleteUser(req, resp); break;
            case "update": updateUser(req, resp); break;
            default:
        }
        doGet(req, resp);
    }

    private void updateUser(HttpServletRequest req, HttpServletResponse resp) {
        String notification;
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        boolean isUpdated = userDao.updateUser(new User(id, name, email, country));
        notification = isUpdated ? "Update Sucessfully" : "Update Failed";
        req.setAttribute("notification", notification);
    }

    private void deleteUser(HttpServletRequest req, HttpServletResponse resp) {
        String notification;
        int id = Integer.parseInt(req.getParameter("id"));
        boolean isDeleted = userDao.deleteUser(id);
        notification = isDeleted ? "Delete Sucessfully" : "Delete Failed";
        req.setAttribute("notification", notification);
    }

    private void createUser(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        userDao.insertUser(new User(name, email, country));
    }
}
