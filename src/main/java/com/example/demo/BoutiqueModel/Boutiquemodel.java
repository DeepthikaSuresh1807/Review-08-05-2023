package com.example.demo.BoutiqueModel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bouti")
public class Boutiquemodel{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String  materialname;
	private String  size;
	private String  varieties;
	private String  price;
    @OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bouti_id")
	private BoutiqueDet boutiid;
	public BoutiqueDet getBoutiid() {
		return boutiid;
	}
	public void setBoutiid(BoutiqueDet boutiid) {
		this.boutiid = boutiid;
	}
	@Override
	public String toString() {
		return "Boutiquemodel [id=" + id + ", materialname=" + materialname + ", size=" + size + ", varieties="
				+ varieties + ", price=" + price + ", boutiid=" + boutiid + "]";
	}
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
