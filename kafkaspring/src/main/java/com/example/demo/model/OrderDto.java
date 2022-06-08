package com.example.demo.model;

public class OrderDto {

	long id;
	long idproduit;
	int quantity;
	String state;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdproduit() {
		return idproduit;
	}
	public void setIdproduit(long idproduit) {
		this.idproduit = idproduit;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
