package org.soulcoder.springboot.action;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
	
	public MyCommandLineRunner(){
		System.out.println("Construct CommandLineRunner");
	}

	public void run(String... args) throws Exception {

		System.out.println("Entry CommandLineRunner");
		for (String arg : args) {
			System.out.println("CommandLineRunner:" + arg);
		}
	}

}
