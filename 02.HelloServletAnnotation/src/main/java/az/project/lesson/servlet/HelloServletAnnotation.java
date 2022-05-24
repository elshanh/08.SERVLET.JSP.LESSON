package az.project.lesson.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/helloannotation")
public class HelloServletAnnotation extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter printWriter = response.getWriter();
		printWriter.write("<html><body>");
		printWriter.write("<h1>Hello My First SERVLET Annotation</h1>");
		printWriter.write("</body></html>");
	}	

}
