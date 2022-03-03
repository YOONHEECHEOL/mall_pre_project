package com.common;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class TestSessionListener implements HttpSessionListener {
	public TestSessionListener() {
		System.out.println("TestSessionListener 객체 생성");
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("TestSessionListener 객체 초기화");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("TestSessionListener 객체 해제");
	}
}
