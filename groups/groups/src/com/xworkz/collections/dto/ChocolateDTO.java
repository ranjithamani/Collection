package com.xworkz.collections.dto;

import java.io.Serializable;

public class ChocolateDTO implements Serializable {
	private String name;
	private Double price;
	private String flovour;
	private boolean quality;
	private boolean taste;
	private boolean fssai;

	public ChocolateDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("invoked chacolate constructer");

	}

	public ChocolateDTO(String name, Double price, String flovour, boolean quality, boolean taste, boolean fssai) {
		super();
		this.name = name;
		this.price = price;
		this.flovour = flovour;
		this.quality = quality;
		this.taste = taste;
		this.fssai = fssai;
	}

	@Override
	public String toString() {
		return "ChocolateDTO [name=" + name + ", price=" + price + ", flovour=" + flovour + ", quality=" + quality
				+ ", taste=" + taste + ", fssai=" + fssai + "]";
	}

	public boolean equals(Object obj) {
		System.out.println("equals method invoked");
		if (obj == null) {
			return false;
		}
		if (obj instanceof ChocolateDTO) {
			ChocolateDTO ref = (ChocolateDTO) obj;
			if (this.price.equals(ref.getPrice()) && this.taste == (ref.taste)
					&& this.name.equalsIgnoreCase(ref.getName())) {

				System.out.println("chacolate equal:" + this.name);
				return true;

			} else {
				System.out.println("chacolate is not equal:");
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getFlovour() {
		return flovour;
	}

	public void setFlovour(String flovour) {
		this.flovour = flovour;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public boolean isTaste() {
		return taste;
	}

	public void setTaste(boolean taste) {
		this.taste = taste;
	}

	public boolean isFssai() {
		return fssai;
	}

	public void setFssai(boolean fssai) {
		this.fssai = fssai;
	}

}
