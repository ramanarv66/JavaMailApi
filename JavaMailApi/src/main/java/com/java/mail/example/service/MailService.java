package com.java.mail.example.service;

import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.stereotype.Service;

import com.java.mail.example.model.EmailBody;

@Service
public class MailService {
	
	 public boolean sendEmail(EmailBody emailBody) {
	        boolean flag = false;

	        //logic
	        //smtp properties
	        Properties properties = new Properties();
	        properties.put("mail.smtp.auth", true);
	        properties.put("mail.smtp.starttls.enable", true);
	        properties.put("mail.smtp.port", "587");
	        properties.put("mail.smtp.host", "smtp.gmail.com");

	        String username = "ramanaaws66";
	        String password = "hitrjpyvnmvzakrb";


	        //session
	        Session session = Session.getInstance(properties, new Authenticator() {
	            @Override
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(username, password);
	            }
	        });

	        try {

	            Message message = new MimeMessage(session);
	            message.setRecipient(Message.RecipientType.TO, new InternetAddress(emailBody.getTo()));
	            message.setFrom(new InternetAddress(emailBody.getFrom()));
	            message.setSubject(emailBody.getSubject());
	            message.setText(emailBody.getText());
	            Transport.send(message);
	            flag = true;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }


	        return flag;

	}

}
