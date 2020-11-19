package org.myji.yeon;

public class HelloService {
	
	HelloRepository helloRepository;
	
	public HelloService(HelloRepository helloRepository) {
		this.helloRepository = helloRepository;
	}
	
	public String sayHello(String name) {
		return helloRepository.sayHello(name);
	}

}
