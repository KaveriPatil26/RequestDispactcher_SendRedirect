package rdi_srdm.controller1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cls2")
public class Class_2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		String name1 = req.getParameter("ename");
		System.out.println("Class_2" + " " + name1);

//		RequestDispatcher dispatcher = req.getRequestDispatcher("https://www.instagram.com");
//		dispatcher.forward(req, resp);

		 resp.sendRedirect("http://www.instagram.com");
	}
}
