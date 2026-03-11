// Main.java - Simple servlet handler
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class Main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(
            "<html>" +
            "<head><title>Java Web App</title></head>" +
            "<body>" +
            "<h1>Welcome to Java Web Application</h1>" +
            "<p>This is a simple servlet.</p>" +
            "</body>" +
            "</html>"
        );
    }
}