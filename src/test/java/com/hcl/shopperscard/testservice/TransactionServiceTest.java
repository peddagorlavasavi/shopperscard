package com.hcl.shopperscard.testservice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;

import java.util.Optional;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.hcl.shopperscard.entity.Transaction;
import com.hcl.shopperscard.entity.User;
import com.hcl.shopperscard.repository.TransactionRepository;
import com.hcl.shopperscard.service.TransactionService;

public class TransactionServiceTest {
	@Autowired
	TransactionService transactionService;

	@MockBean
TransactionRepository transactionRepository;
	
	/*
	 * @Test public void whenValid_thenBuyProduct() { User user2 = new
	 * User(1L,"shankar");
	 * Mockito.when(transactionRepository.findAll()).thenReturn(Optional.of(user2));
	 * Mockito.when(transactionService.getUser(1L)).thenReturn(new User());
	 * Mockito.when(transactionRepository.save(any(Transaction.class))).thenReturn(
	 * user2); Transaction tranasction = transactionService.buyProduct( );
	 * assertThat(user2.getUserName()).isEqualTo("shankar");
	 * assertThat(user2.getUserId()).isEqualTo(1L); }
	 */
	 
}
