package com.example.cis;

import java.util.ArrayList;
import java.util.List;


/**
 * Class to store restaurant information. It is made static because the 
 * application is not intended to show information for multiple restaurants.
 */

public class RestaurantInfo {
	public static String SSH = "";
	public static String restaurantName = "";
	public static int numberOfProducts = 0;
	public static List<ProductInfo> productsList = null; 
	
	public static List<ProductInfo> setMockList(){
		List<ProductInfo> mock = new ArrayList<ProductInfo>();
		return mock;
	}
}