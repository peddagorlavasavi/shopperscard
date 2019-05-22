package com.hcl.shopperscard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.shopperscard.entity.Products;
import com.hcl.shopperscard.entity.Transaction;
import com.hcl.shopperscard.entity.User;
import com.hcl.shopperscard.repository.ProductRepository;
import com.hcl.shopperscard.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	UserService userService;
	@Autowired
	ProductService productService;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public String getTransaction(Long userId, Transaction transaction) {

		String result = "";
		User user = userService.getUser(userId);
		Products product = productService.getProduct(transaction.getProductId());
		transaction.setAccount(user);
		transaction.setPrice(product.getPrice());
		if (product.getQuantity() < transaction.getQuantity()) {
			result = "Sufficient Quantity Not There Total Product is " + product.getQuantity();
		} else {
			product.setQuantity(product.getQuantity() - transaction.getQuantity());
			productRepository.save(product);
			transactionRepository.save(transaction);
			result = "" + transaction.getQuantity() + " Product is Buy Sucessfully and Remaning Product is "
					+ product.getQuantity();
		}

		return result;
	}

}
