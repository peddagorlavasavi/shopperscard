package com.hcl.shopperscard.testservice;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.shopperscard.entity.User;
import com.hcl.shopperscard.repository.UserRepository;
import com.hcl.shopperscard.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest


public class UserServiceTest {
	@Autowired
	UserService userService;

	@MockBean
	UserRepository userRepository;
	
	@Test
	public void whenValidName_thenUserShouldBeFound() {
		User user1 = new User(1L, "vasavi");
		Mockito.when(userRepository.findById(1L)).thenReturn(Optional.of(user1));
		Long userId = 1L;
		User user = userService.getUser(userId);
		assertThat(user1.getUserName()).isEqualTo("vasavi");
	
	
	
	}
	@Test
	public void whenValidName_thenUserShouldBeFound1() {
		User user2 = new User(2L, "shankar");
		Mockito.when(userRepository.findById(4L)).thenReturn(Optional.of(user2));
		Long userId = 2L;
		User user = userService.getUser(userId);
		assertThat(user2.getUserName()).isEqualTo("shankar");
	
	
	
	}
	@Test
	public void whenValidName_thenUserShouldBeFound2() {
		User user3 = new User(3L, "vijay");
		Mockito.when(userRepository.findById(5L)).thenReturn(Optional.of(user3));
		Long userId = 3L;
		User user = userService.getUser(userId);
		assertThat(user3.getUserName()).isEqualTo("vijay");
	
	
	
	}
}
