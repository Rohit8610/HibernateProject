package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dto.ProductDTO;
import com.nt.service.ProductMgmtService;
import com.nt.service.ProductMgmtServiceImpl;
@WebServlet("/searchurl")
public class ControllerServlet extends HttpServlet {
private ProductMgmtService pms;
RequestDispatcher rd=null;
public void init()
{
pms=new ProductMgmtServiceImpl();	
}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int id=Integer.parseInt(request.getParameter("id"));
   try {
    ProductDTO dto=pms.fetchProduct(id);
   request.setAttribute("pDTO", dto);
   rd=request.getRequestDispatcher("/result.jsp");
   rd.forward(request, response);
   }catch(Exception e)
   {System.out.println("ControllerServlet.doGet()");
	   e.printStackTrace();
	   rd=request.getRequestDispatcher("/error.jsp");
	   rd.forward(request,response);
   }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
public void destroy()
{
	pms=null;
}
}
