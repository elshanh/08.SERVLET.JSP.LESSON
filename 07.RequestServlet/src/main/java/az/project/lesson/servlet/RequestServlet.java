package az.project.lesson.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "request", urlPatterns = {"/request"})
public class RequestServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter printWriter = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		printWriter.write(username);
		printWriter.write("\n");
		printWriter.write(password);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter printWriter = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		printWriter.write(username);
		printWriter.write("\n");
		printWriter.write(password);
	}	
	
		

}
