package com.hcl.shopperscard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "product")

public class Products  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PRODUCT_ID")
	private Long productId;
	
	@Column(name = " PRODUCT_NAME")
	private String name;
	
	@Column(name = " PRODUCT_DESCRIPTION")
	private String pdescription;
	
	@Column(name = " PRODUCT_PRICE")
	private Long price;
	@Column(name = " PRODUCT_QUANTITY")
	private Long quantity;
	@ManyToOne()
	@JoinColumn(name = "Product_OWNERID" ,nullable = true)
	private User user;

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPdescription() {
		return pdescription;
	}

	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	public Products(Long productId, String name, String pdescription, Long price, Long quantity) {
		super();
		this.productId = productId;
		this.name = name;
		this.pdescription = pdescription;
		this.price = price;
		this.quantity = quantity;
	}
	

	public Products() {
	}

}