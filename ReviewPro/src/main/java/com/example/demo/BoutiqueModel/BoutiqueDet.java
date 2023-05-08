package com.example.demo.BoutiqueModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cuisine")
public class BoutiqueDet {
	@Id
	private int id;
	private String dressType;
	private int price;
    private String availability;

	@Override
	public String toString() {
		return "FoodDet [id=" + id + ", dressType=" + dressType + ", price=" + price + ", availability="
				+ availability + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCuisineType() {
		return dressType;
	}
	public void setCuisineType(String DressType) {
		dressType = DressType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}

}
