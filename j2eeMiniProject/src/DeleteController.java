

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.miniproj2.Result;
import com.miniproj2.User;
import com.miniproj2.UserDAO;





@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

   public DeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("cid"));
		
		User u=new User();
		u.setCid(id);
		UserDAO u1=new UserDAO();
		String result1 =u1.deleteUser(u);
		
		if(result1.equals(Result.SUCCESS))
		{
			RequestDispatcher rd = request.getRequestDispatcher("/deleteSuccess.jsp");
			rd.forward(request, response);
		}
	}

	
}
