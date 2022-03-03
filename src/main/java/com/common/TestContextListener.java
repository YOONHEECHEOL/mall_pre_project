package com.common;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestContextListener implements ServletContextListener {
	public TestContextListener() {
		System.out.println("TestContextListener 객체 생성");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("TestContextListener 객체 초기화");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("TestContextListener 객체 해제");
	}
}
