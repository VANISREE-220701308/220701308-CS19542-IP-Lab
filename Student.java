
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentNameSuggestionServlet")
public class Student extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    // Sample array of student names
    private String[] studentNames = {
        "Alice", "Bob", "Charlie", "David", "Eva",
        "Frank", "Grace", "Hannah", "Ivy", "Jack",
        "Karen", "Leo", "Mona", "Nina", "Oscar",
        "Paul", "Quincy", "Rachel", "Steve", "Tom",
        "Uma", "Victor", "Wendy", "Xander", "Yara","Vani","sree","Mohan","Nandy","aishu","alex","barath","barathi","charu","charan","ciby","divya",
        "Zane"
    };

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query = request.getParameter("query");
        PrintWriter out = response.getWriter();
        response.setContentType("index1/html");

        if (query != null && !query.trim().isEmpty()) {
            for (String name : studentNames) {
                if (name.toLowerCase().startsWith(query.toLowerCase())) {
                    out.println("<div>" + name + "</div>");
                }
            }
        }
    }
}





