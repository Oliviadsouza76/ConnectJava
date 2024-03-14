package com.data.people.social.connect.mail.connectMail.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	private JavaMailSender mailSender;
	
	public EmailService(JavaMailSender sender) {
		mailSender = sender;
	}
	
	public void sendEmail(String to,String subject ,String body) {
		
		SimpleMailMessage messenger = new SimpleMailMessage();
		messenger.setFrom("oliviamusic23@gmail.com");
		messenger.setTo(to);
		messenger.setSubject(subject);
		messenger.setText(body);
		
		mailSender.send(messenger);
	}
}
