

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.miniproj2.User;
import com.miniproj2.UserDAO;




@WebServlet("/FetchAllUser")
public class FetchAllUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		UserDAO userDao=new UserDAO();
		ArrayList<User> list=userDao.getAllUsers();
		
		HttpSession session=request.getSession();
		session.setAttribute("userList",list);
		
		RequestDispatcher rd=request.getRequestDispatcher("/ViewDetails.jsp");
		rd.forward(request, response);
		
	}

}
