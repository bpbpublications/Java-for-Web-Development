import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionPage extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
out.println("<!DOCTYPE html>");
out.println("<html>");
out.println("<head>");
out.println("<title>Servlet Actionpage</title>");            
out.println("</head>");
out.println("<body>");
            String name=request.getParameter("Uname");
            String pwd=request.getParameter("pwd");
            if(name.equals("Sarika") &&pwd.equals("vivek"))
out.println("<h1>You are successfully login </h1>");
            else
out.println("<h1>User Name or Password is Incorrect </h1>");
out.println("</body>");
out.println("</html>");
        }
    }

     @Override
    public String getServletInfo() {
        return "Login Form ";
    }}

