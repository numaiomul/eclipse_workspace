package com.example.cis;

public class ProductInfo {
	/**
	 * Product info class. Every product will have these variables.
	 */
    private int Id ;
    private int ProviderId ;
    private String Name ;
    private float Price ;
    
    public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getProviderId() {
		return ProviderId;
	}
	public void setProviderId(int providerId) {
		ProviderId = providerId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
		
}
