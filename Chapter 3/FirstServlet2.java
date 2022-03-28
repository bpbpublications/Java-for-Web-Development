import java.io.*;
import javax.servlet.*;
public class FirstServlet2 extends GenericServlet
{
public void service(ServletRequest req,ServletResponse res)
throws IOException,ServletException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.print("<html><body>");
out.print("<b>This is First Servlet through Generic Servlet</b>");
out.print("</body></html>");
}
}
