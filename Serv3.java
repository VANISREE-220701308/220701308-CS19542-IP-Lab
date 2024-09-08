import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Serv3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		try {
//			
			Class.forName("com.mysql.jdbc.Driver");
			String URL ="jdbc:mysql://localhost:3307/library";
			Connection con= DriverManager.getConnection(URL,"root","");
			String query ="select * from book where lower(bookname) LIKE ?";
			PreparedStatement ps = con.prepareStatement(query);
			PrintWriter out = response.getWriter();
			String bookname =request.getParameter("search");
//			out.println(bookname);
			ps.setString(1, "%"+bookname.toLowerCase()+"%");
			ResultSet rs =ps.executeQuery();
				out.println("<table border='1'>");
	        	out.println("<tr>");
	        	out.println("<td>Book Name</td>");
	        	out.println("<td>Book ID</td>");
	        	out.println("<td>Author Name</td>");
	        	out.println("<td>Price</td>");
	        	out.println("</tr>");
	        	out.println("<tr>");
	        	while(rs.next()) {
	        	out.println("<td>" + rs.getString("bookname")+
	        	"</td>");
	        	out.println("<td>" + rs.getInt("bookid") + 
	        			
	        	"</td>");
	        	out.println("<td>" + 
	        	rs.getString("AuthorName") + "</td>");
	        	out.println("<td>" + rs.getInt("Price") + "</td>");
	        	out.println("</tr>");
	        	}
			ps.close();
			con.close();
	
		} catch (Exception e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
