package com.example.demo.BoutiqueModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloths")

public class BoutiqueDet {
	@Override
	public String toString() {
		return "BoutiqueDet [id=" + id + ", availability=" + availability + ", colours=" + colours + ", stock=" + stock
				+ "]";
	}
	@Id
	private int id;
	private String availability;
	private String colours;
	private int stock;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getColours() {
		return colours;
	}
	public void setColours(String colours) {
		this.colours = colours;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

}
