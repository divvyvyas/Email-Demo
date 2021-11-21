package com.mail.emaildemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mail.emaildemo.model.EmailResponse;
import com.mail.emaildemo.service.EmailService;

@RestController
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/send-email")
	public ResponseEntity<String> sendMail(@RequestBody EmailResponse emailResponse) {
		emailService.sendMail(emailResponse);
		return new ResponseEntity<>("Email sent successfully!!", HttpStatus.OK);
	}

}
