package org.myji.yeon;

public class HelloController {
	
	HelloService helloService;
	
	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}
	
	public void sayHello(String name) {
		System.out.println(helloService.sayHello(name));
	}

}
