package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {
	public static void main(String[] args) {
		SpringApplication.run(JpashopApplication.class, args);
		Hello hello = new Hello();
		hello.setFucking("dafad");
		String data = hello.getFucking();

		System.out.println(data);
	}

}
