

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.miniproj2.Result;
import com.miniproj2.User;
import com.miniproj2.UserDAO;



/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		int cid=Integer.parseInt(request.getParameter("cid"));
		String cname =request.getParameter("cname");
		String qualification =request.getParameter("qualification");
		String state =request.getParameter("state");
	
		String party =request.getParameter("party");
		
		User u=new User();
		u.setCid(cid);
		u.setCname(cname);
		u.setQualification(qualification);
		u.setState(state);
		
		u.setParty(party);
		
		
		
		UserDAO userDao= new UserDAO();
		String result = userDao.register(u);
		
		if(result.equals(Result.SUCCESS))
		{
			session.setAttribute("cname", u.getCname());
			RequestDispatcher rd = request.getRequestDispatcher("/RegisterSuccess.jsp");
			rd.forward(request, response);
		}
		
	}

}
