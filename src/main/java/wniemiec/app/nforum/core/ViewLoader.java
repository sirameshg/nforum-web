package wniemiec.app.nforum.core;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewLoader {
	
	public static void loadView(HttpServletRequest request, 
			HttpServletResponse response, 
			String viewName)
	throws ServletException, IOException {
		loadView(request, response, viewName, viewName);
	}

	public static void loadView(HttpServletRequest request, 
								HttpServletResponse response,
								String viewName,
								String title) 
	throws ServletException, IOException {
		request.setAttribute("title", title);
		request.setAttribute("viewName", viewName);
		request
			.getRequestDispatcher("/WEB-INF/template/index.jsp")
			.forward(request, response);
	}
}
