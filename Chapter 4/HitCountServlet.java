import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  /**Counter to keep track  of the number of users visiting the web site */
public class HitCountServlet extends HttpServlet {
static int count;
  public void init(ServletConfig config) throws ServletException
  {
super.init(config);
   }
   public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  count++;
response.setContentType("text/html;charset=UTF-8");
 PrintWriter out =response.getWriter();
out.println("<!DOCTYPE html>");
out.println("<html>");
out.println("<head>");
out.println("<title>Servlet HitCountServlet</title>");            
out.println("</head>");
out.println("<body>");
out.println("<h1> You are user Number"+String.valueOf(count)+"Visiting our  website</h1>");                            
out.println("</body>");
out.println("</html>");
        }    

    @Override
    public String getServletInfo() {
        return "Hit count servlet";}
}

