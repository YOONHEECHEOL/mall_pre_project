package com.mall.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mall.common.Command;
import com.mall.common.MainPage;

@WebServlet("*.do")
public class FrontControll extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// 연결시켜 줄 hashMap 생성
	private HashMap<String, Command> map = new HashMap<String, Command>();

    public FrontControll() {
        super();
        // TODO Auto-generated constructor stub
    }


	public void init(ServletConfig config) throws ServletException {
		// 호출명 저장소
		map.put("/main.do", new MainPage());
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 실제 처리할 Command 를 호출하고, 결과를 돌려줄 페이지를 작성하는 곳
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String path = uri.substring(contextPath.length());
		
		Command command = map.get(path);
		String viewPage = command.run(request, response);
		
		if(viewPage != null) {
			if(viewPage.endsWith(".jsp")) {
				viewPage = "WEB-INF/jsp/" + viewPage;
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}
		
	}

}
