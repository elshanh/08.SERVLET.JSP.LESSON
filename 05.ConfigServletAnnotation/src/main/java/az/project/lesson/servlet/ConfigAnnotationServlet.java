package az.project.lesson.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(
		name = "ConfigAnnotationServlet",urlPatterns = {"/configannotationservlet"},
		initParams={@WebInitParam(name="developer",value="Elshan HUSEYNZADA")}
)
public class ConfigAnnotationServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter printWriter = response.getWriter();
		ServletConfig servletConfig = getServletConfig();
		Enumeration<String> enumeration = servletConfig.getInitParameterNames();
		
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			printWriter.write(string);
		}
		
		printWriter.write(servletConfig.getInitParameter("developer"));
	}

}
