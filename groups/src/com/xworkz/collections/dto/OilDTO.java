package com.xworkz.collections.dto;

import java.io.Serializable;
import com.xworkz.collections.dto.constants.*;

public class OilDTO implements Serializable {
	private String brand;
	private Double price;
	private OilType type;
	private OilColor color;
	private boolean refined;
	private boolean cooking;
	private boolean quality;
	private Double viscocity;

	public OilDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("invoked OilDTO constructer");
	}

	public OilDTO(String brand, double price, OilType type, OilColor color, boolean refined, boolean cooking,
			boolean quality, double viscocity) {
		super();
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.color = color;
		this.refined = refined;
		this.cooking = cooking;
		this.quality = quality;
		this.viscocity = viscocity;
	}

	@Override
	public String toString() {
		return "OilDTO [brand=" + brand + ", price=" + price + ", type=" + type + ", color=" + color + ", refined="
				+ refined + ", cooking=" + cooking + ", quality=" + quality + ", viscocity=" + viscocity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals method");
		if (obj == null) {
			return false;
		}
		if (obj instanceof OilDTO) {
			OilDTO value = (OilDTO) obj;
			if (this.type.equals(value.getType()) && this.color.equals(value.color)
					&& this.brand.equalsIgnoreCase(value.getBrand())) {

				System.out.println("oil equal:" + this.brand);
				return true;

			} else {
				System.out.println("oil is not equal:");
				return false;

			}
		}
		return false;
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

	public OilType getType() {
		return type;
	}

	public void setType(OilType type) {
		this.type = type;
	}

	public OilColor getColor() {
		return color;
	}

	public void setColor(OilColor color) {
		this.color = color;
	}

	public boolean isRefined() {
		return refined;
	}

	public void setRefined(boolean refined) {
		this.refined = refined;
	}

	public boolean isCooking() {
		return cooking;
	}

	public void setCooking(boolean cooking) {
		this.cooking = cooking;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public double getViscocity() {
		return viscocity;
	}

	public void setViscocity(double viscocity) {
		this.viscocity = viscocity;
	}

}
