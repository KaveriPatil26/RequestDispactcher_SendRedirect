package rdi_srdm.controller1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cls1")
public class Class_1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		String name = req.getParameter("ename");
		System.out.println("Class_1" + " " + name);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/cls2");
		dispatcher.forward(req, resp);
		
//		RequestDispatcher dispatcher1 = req.getRequestDispatcher("http://www.instagram.com");
//	    dispatcher.include(req, resp);
	}
}