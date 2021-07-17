package com.xworkz.collections.list.dto;

import java.io.Serializable;

public class LipstickDTO implements Serializable {
	private String brand;
	private Double price;
	private Double weight;
	private boolean longlasting;
	private String color;

	public LipstickDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("deafault lipstick cnstr");
	}

	public LipstickDTO(String brand, Double price, Double weight, boolean longlasting, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.weight = weight;
		this.longlasting = longlasting;
		this.color = color;
	}

	@Override
	public String toString() {
		return "LipstickDTO [brand=" + brand + ", price=" + price + ", weight=" + weight + ", longlasting="
				+ longlasting + ", color=" + color + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public boolean isLonglasting() {
		return longlasting;
	}

	public void setLonglasting(boolean longlasting) {
		this.longlasting = longlasting;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
