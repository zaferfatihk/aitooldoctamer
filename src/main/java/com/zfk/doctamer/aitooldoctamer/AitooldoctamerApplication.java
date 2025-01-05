package com.zfk.doctamer.aitooldoctamer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AitooldoctamerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AitooldoctamerApplication.class, args);
	}
	
	@RequestMapping("/")
    String home() {
        return "Helloooooo World!";
    }

}
