package com.hcl.shopperscard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.shopperscard.entity.Transaction;
import com.hcl.shopperscard.service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	TransactionService  transactionService;

	@PostMapping("/buyProduct/{id}")
	public String buyProduct(@PathVariable("id") Long userId,@RequestBody Transaction transaction)
	{
		return transactionService.getTransaction(userId, transaction);
	}
}
