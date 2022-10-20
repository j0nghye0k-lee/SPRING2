package com.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.HelloWorld;

public class MainClass {

	public static void main(String[] args) {
		// beans.xml 파일을 로딩하기
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/demo/config/beans.xml");//applicationcontext가 빈을 불러왔음

		// xml에 정의한 bean 객체의 주소값을 가져온다.
		HelloWorld hello1 = ctx.getBean("hello", HelloWorld.class); // 이미 만들어진 객체를 불러오는거, 객체 타입(.class)도 적어주고
		callMethod(hello1);

		ctx.close();// beans 설정을 그대로 가져와서 끈거 그래서 아무것도 안뜸.
	}

	private static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
