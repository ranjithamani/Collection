package com.xworkz.collections.dto;

import java.io.Serializable;

public class CosmeticDTO implements Serializable {
	private String name;
	private String brand;
	private Double price;
	private boolean branded;
	private Double weight;
	private String color;
	private boolean longlasting;

	public CosmeticDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("invoked cosmeticDTO constructer");
	}

	public CosmeticDTO(String name, String brand, Double price, boolean branded, double weight, String color,
			boolean longlasting) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.branded = branded;
		this.weight = weight;
		this.color = color;
		this.longlasting = longlasting;
	}

	@Override
	public String toString() {
		return "CosmeticDTO [name=" + name + ", brand=" + brand + ", price=" + price + ", branded=" + branded
				+ ", flavour=" + weight + ", color=" + color + ", longlasting=" + longlasting + "]";
	}
	public boolean equals(Object obj) {
		System.out.println("equals method invoked");
		if (obj == null) {
			return false;
		}
		if (obj instanceof CosmeticDTO) {
			CosmeticDTO ref = (CosmeticDTO) obj;
			if (this.price.equals(ref.getPrice()) && this.name == (ref.name)
					&& this.brand.equalsIgnoreCase(ref.getBrand())) {

				System.out.println("cosmetic equal:" + this.name);
				return true;

			} else {
				System.out.println("cosmetic is not equal:");
				return false;

			}
		}

		return false;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean isBranded() {
		return branded;
	}

	public void setBranded(boolean branded) {
		this.branded = branded;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isLonglasting() {
		return longlasting;
	}

	public void setLonglasting(boolean longlasting) {
		this.longlasting = longlasting;
	}

}
