package com.store;

public class stockModule {
	private int code;
	private String name;
	private float price;
	private int quantity;
	
	public stockModule(int code, String name, float price, int quantity) {
		this.code=code;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	

	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "\\~~~~Items in stock~~~~// \n[Code=" + code + ", Name=" + name + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}

}
