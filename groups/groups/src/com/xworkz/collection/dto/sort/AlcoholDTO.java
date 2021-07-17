package com.xworkz.collection.dto.sort;

import java.io.*;

import com.xworkz.collection.dto.constants.*;

public class AlcoholDTO implements Serializable, Comparable<AlcoholDTO> {
	private String brand;
	private double price;
	private boolean scotch;
	private double quantity;
	private AlcoholType type;

	public AlcoholDTO() {
		System.out.println("AlcoholDTO default constr invoked");
	}

	@Override
	public int compareTo(AlcoholDTO o) {
		String brandRef = o.getBrand();
		if (this.brand.compareTo(brandRef) == 0)
			return 0;
		if (this.brand.compareTo(brandRef) > 0)
			return 1;
		if (this.brand.compareTo(brandRef) < 0)
			return -1;
		return 0;

		// return brand.compareTo(o.brand);
	}

	public AlcoholDTO(String brand, double price, boolean scotch, double quantity, AlcoholType type) {
		super();
		this.brand = brand;
		this.price = price;
		this.scotch = scotch;
		this.quantity = quantity;
		this.type = type;
	}

	@Override
	public String toString() {
		return "AlcoholDTO [brand=" + brand + ", price=" + price + ", scotch=" + scotch + ", quantity=" + quantity
				+ ", type=" + type + "]";
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

	public boolean isScotch() {
		return scotch;
	}

	public void setScotch(boolean scotch) {
		this.scotch = scotch;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public AlcoholType getType() {
		return type;
	}

	public void setType(AlcoholType type) {
		this.type = type;
	}

}
