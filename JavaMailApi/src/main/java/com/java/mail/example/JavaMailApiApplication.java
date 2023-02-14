package com.java.mail.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.mail.example.controller.GEmailSenderController;

@SpringBootApplication
public class JavaMailApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMailApiApplication.class, args);
		 /*GEmailSenderController gEmailSender = new GEmailSenderController();
	        String to = "m.ramanarv@gmail.com";
	        String from = "ramanaaws66@gmail.com";
	        String subject = "Second: Sending email using GMail";
	        String text = "This is a example email send using gmail and java program with out less secure app";
	        boolean b = gEmailSender.sendEmail(to, from, subject, text);
	        if (b) {
	            System.out.println("Email is sent successfully");
	        } else {
	            System.out.println("There is problem in sending email");
	        }
	}*/

}
}
