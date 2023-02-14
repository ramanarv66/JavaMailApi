package com.java.mail.example.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.mail.example.model.EmailBody;
import com.java.mail.example.service.MailService;

@RestController
@RequestMapping
public class GEmailSenderController {
	
	@Autowired
	MailService mailService;
	
	@PostMapping("/send")
	public boolean sendEmail(@RequestBody EmailBody emailBody) {
		
		  boolean flag = false;
		  
		 flag = mailService.sendEmail(emailBody);
		  return flag;
		
	}
   

}
