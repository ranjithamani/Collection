package com.xworkz.collection.dto.sort;

import java.io.Serializable;

public class ProductDTO implements Serializable, Comparable<ProductDTO> {
	private String name;
	private String brand;
	private double price;
	private double quantity;

	public ProductDTO() {
	}

	@Override
	public int compareTo(ProductDTO o) {
		double priceRef = o.getPrice();
		if (this.price == priceRef)
			return 0;
		if (this.price > priceRef)
			return 1;
		if (this.price < priceRef)
			return -1;
		return 0;
	}

	public ProductDTO(String name, String brand, double price, double quantity) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", brand=" + brand + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}
