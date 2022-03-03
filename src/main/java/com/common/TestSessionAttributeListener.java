package com.common;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class TestSessionAttributeListener implements HttpSessionAttributeListener {
	public TestSessionAttributeListener() {
		System.out.println("TestSessionAttributeListener 객체 생성");
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("TestSessionAttributeListener 객체 초기화");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("TestSessionAttributeListener 객체 해제");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("TestSessionAttributeListener 객체 추가");
	}
}
