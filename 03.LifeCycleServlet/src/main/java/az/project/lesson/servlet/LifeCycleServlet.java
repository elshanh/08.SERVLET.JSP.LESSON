package az.project.lesson.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/lifeCycleServlet")
public class LifeCycleServlet extends HttpServlet{
	
	@Override
	public void init() {
		System.out.println("Servlet Start");
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter printWriter = response.getWriter();
		printWriter.write("<html><body>");
		printWriter.write("<h1>Hello My First Life Cycle SERVLET</h1>");
		printWriter.write("</body></html>");
	}
	
	@Override
	public void destroy() {
		System.out.println("Servlet End");
	}
	
	

}
