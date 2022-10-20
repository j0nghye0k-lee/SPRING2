package com.demo.beans;

public class TestBean2 {
	
	public TestBean2() {
		System.out.println("TestBean2의 생성자!");
	}

	public void default_init() {
		System.out.println("TestBean2의 디폴트init 메소드");
	}

	public void default_destroy() {
		System.out.println("TestBean2의 디폴트destroy 메소드");
	}
}
