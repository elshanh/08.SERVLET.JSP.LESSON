package az.project.lesson.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ContextServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		ServletContext servletContext = getServletContext();
		Enumeration<String> enumeration = servletContext.getInitParameterNames();
		
		PrintWriter printWriter = response.getWriter();
		
		while (enumeration.hasMoreElements()) {
			printWriter.write(enumeration.nextElement()+"\n");			
		}
		
		printWriter.close();

	}	

}
