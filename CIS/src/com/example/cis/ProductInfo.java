package com.example.cis;

/**
 * Product info class. Every product will have these variables.
 */
public class ProductInfo {
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
	public ProductInfo(int Id, int ProviderId, String Name, float Price){
		this.Id=Id;
		this.ProviderId=ProviderId;
		this.Name=Name;
		this.Price=Price;
	}
	public ProductInfo (){
		
	}
	
}
