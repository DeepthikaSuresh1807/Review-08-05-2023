package com.example.demo.BoutiqueModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Boutiquemodel{
	@Id
	private int id;
	private String  materialname;
	private String  size;
	private String  varieties;
	private String  price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaterialname() {
		return materialname;
	}
	public void setMaterialname(String materialname) {
		this.materialname = materialname;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getVarieties() {
		return varieties;
	}
	public void setVarieties(String varieties) {
		this.varieties = varieties;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
