package az.project.lesson.servlet;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ConfigServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		ServletConfig servletConfig = getServletConfig();
		
		response.getWriter().write("Developer: " +servletConfig.getInitParameter("developer")+"\n");
		response.getWriter().write("Servlet Name: " +servletConfig.getServletName());
		
		
	}

}
