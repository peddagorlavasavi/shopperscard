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

import com.hcl.shopperscard.entity.Products;
import com.hcl.shopperscard.repository.ProductRepository;
import com.hcl.shopperscard.repository.UserRepository;
import com.hcl.shopperscard.service.ProductService;
import com.hcl.shopperscard.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ProductServiceTest {
	@Autowired
	ProductService productService;

	@MockBean
	ProductRepository productRepository;
	
	@Test
	public void whenValidName_thenUserShouldBeFound() {
		Products product1 = new Products(1L,"mi", "mobile", 10000L, 50L);
		Mockito.when(productRepository.findById(1L)).thenReturn(Optional.of(product1));
		Long productId = 1L;
		Products product = productService.getProduct(productId);
		assertThat(product1.getName()).isEqualTo("mi");
	
	
	
	}
}
