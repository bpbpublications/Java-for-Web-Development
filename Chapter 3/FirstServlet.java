/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.*;
public class FirstServlet implements Servlet{
ServletConfig config=null;
public void init(ServletConfig config)
{
this.config=config;
System.out.println("Servletisinitialized");
}
public void service(ServletRequest req,ServletResponse res)
throws IOException,ServletException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.print("<html><body>");
out.print("<b>This is First Servlet through Servlet Interface</b>");
out.print("</body></html>");
}
public void destroy()
{
System.out.println("Servletisdestroyed");
}
public ServletConfig getServletConfig()
{return config;
}
public String getServletInfo()
{
return "InstituteofLearning-AdvanceJavaFirstServletviaServletinterface";
}
}
