package com.zfk.doctamer.aitooldoctamer;

import org.springframework.boot.SpringApplication;

public class TestAitooldoctamerApplication {

	public static void main(String[] args) {
		SpringApplication.from(AitooldoctamerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
