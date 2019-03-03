package com.serlvet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.NewsDao;
import com.model.News;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
		this.doPost(req, resp);
		}
		
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		    throws ServletException, IOException {
		String titile = req.getParameter("title");
		String publish = req.getParameter("publish");
		String content=req.getParameter("content");
		String creater=req.getParameter("creater");
		String id=req.getParameter("id");
		News news = new News();
		news.setId(Integer.parseInt(id));
		news.setTitle(titile);  
		news.setPublish(publish);
		news.setContent(content);
		news.setCreater(creater);
		NewsDao dao = new NewsDao();
		dao.addNews(news);
		req.getRequestDispatcher("ShowServlet").forward(req, resp);
		}    

}
