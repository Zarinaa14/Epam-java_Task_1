package by.bsu;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bsu")
public class FirstServlet extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(FirstServlet.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doPost");
        String str= request.getParameter("с");
        request.setAttribute("res",str);
        request.getRequestDispatcher("result.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("This is " + this.getClass().getName() + ", using the GET method");
        LOGGER.info("doPost");
    }
}
