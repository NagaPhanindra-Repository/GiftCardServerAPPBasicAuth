package com.codemer.giftcard.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codemer.giftcard.model.AuthenticationBean;
import com.codemer.giftcard.model.CardUser;
import com.codemer.giftcard.service.UserTransactionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/GiftCardManagement/api/v1")
public class BasicAuthController {
	@GetMapping(path = "/basicauth")
	public AuthenticationBean basicauth() {
		System.out.println("You are authenticated");
	    return new AuthenticationBean("You are authenticated");
	}
	@GetMapping(path = "/cardUserDeatils")
	public CardUser cardUserDeatils() {
		UserTransactionService trasactionService=new UserTransactionService();
		System.out.println("getCardUserdetails"+trasactionService.getCardUserdetails().getCardNumber());
		CardUser CurrentUser=trasactionService.getCardUserdetails();
		return CurrentUser;
		
	}

}

