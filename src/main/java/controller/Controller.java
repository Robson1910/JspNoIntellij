package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ConnectionDAO;
import model.JavaBeans;

import java.io.IOException;
import java.util.ArrayList;

/**
 * The type Controller.
 */
@WebServlet(urlPatterns = { "/Controller", "/main", "/insert" })
public class Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    /**
     * The Dao.
     */
    ConnectionDAO dao = new ConnectionDAO();

    /**
     * Instantiates a new Controller.
     */
    public Controller() {
        super();
    }

    /**
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        if ("/main".equals(req.getServletPath())) {
            System.out.println("Fui chamado");
            doList(req, res);
        } else {
            res.sendRedirect("index.html");
        }
    }

    /**
     * Do list.
     *
     * @param req  the req
     * @param resp the resp
     * @throws ServletException the servlet exception
     * @throws IOException      the io exception
     */
    protected void doList(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ArrayList<JavaBeans> lista = dao.listarContatos();
        req.setAttribute("contatos", lista);
        RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
        rd.forward(req, resp);
    }
}
