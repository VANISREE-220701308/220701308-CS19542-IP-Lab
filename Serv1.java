import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class book
 */
@WebServlet("/book")
public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		res.getWriter().append("Served at: ").append(req.getContextPath());
		res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        try {
//    
        	String option = req.getParameter("opt");
        	switch(option)
        	{
        	case "insert":
        		insertbook(req,res);
        		break;
        	case "delete":
        		deletebook(req,res);
        		break;
        	case "update":
        		updatebook(req,res);
        		break;
        	default:
        		out.println("Details not Entered");
        	}
        	}catch(Exception e) {
        		out.println(e);
        	}
        	
//        	PreparedStatement ps = con.prepareStatement("select * from book");
//        	ResultSet rs = ps.executeQuery();
//        	out.println("<table border='1'>");
//        	out.println("<tr>");
//        	out.println("<td>Book Name</td>");
//        	out.println("<td>Book ID</td>");
//        	out.println("<td>Author Name</td>");
//        	out.println("<td>Price</td>");
//        	out.println("</tr>");
//        	while (rs.next()) {
//        	out.println("<tr>");
//        	out.println("<td>" + rs.getString("BookName")+
//        	"</td>");
//        	out.println("<td>" + rs.getInt("Bookid") + 
//        	"</td>");
//        	out.println("<td>" + 
//        	rs.getString("AuthorName") + "</td>");
//        	out.println("<td>" + rs.getInt("Price") + 
//        	"</td>");
//        	out.println("</tr>");
//        	}
//        	out.println("</table>");
//        	ps.close();
//        	con.close();
//
//        }
//        catch(Exception e){
//        	
//        	out.println(e);
//        }
	}  
	
	public void insertbook(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException,SQLException,ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
    	String URL = "jdbc:mysql://localhost:3307/library";
    	Connection con = DriverManager.getConnection(URL,"root","");
    	PrintWriter out = res.getWriter();
    	String query = "Insert into book(BookName,Bookid,AuthorName,Price)values(?,?,?,?)";
    	String name = req.getParameter("bookname");
    	String id = req.getParameter("bookid");
    	String a_name = req.getParameter("author");
    	String price = req.getParameter("price");
    	PreparedStatement ps = con.prepareStatement(query);
    	ps.setString(1, name);
    	ps.setString(2, id);
    	ps.setString(3, a_name);
    	ps.setBigDecimal(4, new java.math.BigDecimal(price));
    	int n=ps.executeUpdate();
    	if(n>0) {
    		out.println("Book Inserted Successfully");
    	}
    	else {
    		out.println("Book Not Inserted");
    	}
    	ps.close();
    	con.close();
    	
	}
	public void deletebook(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException,SQLException,ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		String URL = "jdbc:mysql://localhost:3307/library";
		Connection con = DriverManager.getConnection(URL,"root","");
		PrintWriter out = res.getWriter();
		String query = "delete from book where bookid=?";
		PreparedStatement ps = con.prepareStatement(query);
		String id =req.getParameter("bookid");
		ps.setString(1,id);
		int k =ps.executeUpdate();
		if (k>0){
			out.println("Book is Deleted");
		}
		else {
			out.println("Book is Not Deleted");
		}
		ps.close();
		con.close();
	}
	public void updatebook(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException,SQLException,ClassNotFoundException{
		 Class.forName("com.mysql.jdbc.Driver");
		 String URL ="jdbc:mysql://localhost:3307/library";
		 Connection con = DriverManager.getConnection(URL,"root","");
		 PrintWriter out = res.getWriter();
		 String query ="update book set price=? where bookid=?";
		 PreparedStatement ps =con.prepareStatement(query);
		 String price =req.getParameter("price");
		 String id = req.getParameter("bookid");
		 ps.setString(1, price);
		 ps.setString(2, id);
		 int d = ps.executeUpdate();
		 if(d>0) {
			 out.println("Book Updated Successfully");
		 }
		 else {
			 out.println("book Not Updated");
		 }
		 ps.close();
		con.close();
	}	 
		 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}