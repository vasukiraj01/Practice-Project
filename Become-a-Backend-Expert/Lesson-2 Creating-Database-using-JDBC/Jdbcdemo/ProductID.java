package com.products;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductID
 */
@WebServlet("/ProductID")

public class ProductID extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<html><body>");
		int ProductID = Integer.parseInt(((ServletRequest) res).getParameter("ProductID"));
		Connection con = DataConnection.getMyConnection();
		String query="select*from details where ProductID =?";

		if (ProductID <= 6) {
			if (con != null) {

				try {

					PreparedStatement ps = con.prepareStatement(query);
					ps.setInt(1, ProductID);
					out.println("<table border=1 width=20% height=20%>");
					out.println("<tr><th>ProductID</th><th>ProductName</th><th>Price</th><th>Company</th><tr>");
					ResultSet pd = ps.executeQuery();
					// ResultSetMetaData rsmd = pd.getMetaData();
					while (pd.next()) {
						int n = pd.getInt("ProductID");
						String nm = pd.getString("ProductName");
						int s = pd.getInt("Price");
						String c = pd.getString("CompanyName");
						out.println(
								"<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td><td>" + c + "<td></tr>");
					}
					out.println("</table>");
					out.println("</html></body>");
					con.close();
				} catch (SQLException e) {
					out.println("Error");} 
			}
		}
		 else {
			out.println("Invalid ID");
		 }
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
