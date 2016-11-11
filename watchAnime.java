
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Admin;
import model.Anime;
import model.Customer;
import model.DAO1;

/**
 * Servlet implementation class watchAnime
 */
@WebServlet("/watchAnime")
public class watchAnime extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public watchAnime() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//
		RequestDispatcher rd;
		HttpSession se = request.getSession();
		//
		try {
			if (se.getAttribute("admin") == null) {
				rd = getServletContext().getRequestDispatcher("/login.jsp");
				rd.forward(request, response);
			} else {
				int index = Integer.parseInt(request.getParameter("index"));
				//
				Admin admin = (Admin) se.getAttribute("admin");
				// thêm vào danh sách
				Anime anime = DAO1.getListAnime().get(index);
				admin.addWatchAni(anime);
				response.sendRedirect("/product/CustomerViewAnime.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
			rd = getServletContext().getRequestDispatcher("/notFound.jsp");
			rd.forward(request, response);
		}
	}

}
