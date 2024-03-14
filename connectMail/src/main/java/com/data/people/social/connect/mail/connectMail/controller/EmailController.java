package com.data.people.social.connect.mail.connectMail.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.people.social.connect.mail.connectMail.service.EmailService;

@RestController
public class EmailController {

	private final EmailService emailService;
	public EmailController(EmailService service) {
		emailService = service;
	}
	
	@RequestMapping("/sendMail")
	public String sendTestMail() {
		emailService.sendEmail("oliviadsouza76@gmail.com", "Connect Member", "Thank You for Registering with Us! Hpe you have a Good Day Ahead");
		return "Email Send Successfully";
	}
}
