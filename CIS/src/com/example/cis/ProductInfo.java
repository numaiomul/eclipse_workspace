package com.example.cis;

/**
 * Product info class. Every product will have these variables.
 */
public class ProductInfo {
    private int Id ;
    private String Name ;
    private float Price ;
    
    public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public ProductInfo(int Id,  String Name, float Price){
		this.Id=Id;
		this.Name=Name;
		this.Price=Price;
	}
	public ProductInfo (){
		
	}
	
}
