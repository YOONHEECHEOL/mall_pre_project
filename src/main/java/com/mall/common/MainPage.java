package com.mall.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainPage implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 시작페이지
		
		return "main/main.tiles";
	}

}
