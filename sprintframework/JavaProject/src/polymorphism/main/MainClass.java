package polymorphism.main;

import polymorphism.beans.HelloWorld;
import polymorphism.beans.HelloWorldEn;
import polymorphism.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		HelloWorld hello1 = new HelloWorldKo();
		callMethod(hello1);
		
		HelloWorld hello2 = new HelloWorldEn();//이제 클래스를 수정하려고 하면 뒤에 helloworlden부분만 수정하면됨
		callMethod(hello2);

	}

	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
}
