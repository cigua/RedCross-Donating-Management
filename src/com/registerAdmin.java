package com;

import java.io.IOException;
import java.sql.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registerAdmin extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		String ID = request.getParameter("userID");
		int auth = Integer.parseInt(request.getParameter("auth"));
		int rs = 0;
		
		try {
			DBConnector query = new DBConnector();
			rs = query.updateAuth(auth,ID);
			if(rs == 1)
			{
				//��ӹ���Ա�ɹ�������¼�����
			}
			else
			{
				//��ӹ���Աʧ�ܣ�����¼����棬���ش�����Ϣ��
			}
			query.closeAll();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//request.setAttribute("acceptDetail", arrayResult);
		//request.getSession().setAttribute("acceptDetail", arrayResult);
		//request.getRequestDispatcher("accept_detail.jsp").forward(request, response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		doGet(request,response);
	}
}
