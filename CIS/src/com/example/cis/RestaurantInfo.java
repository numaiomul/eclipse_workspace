package com.example.cis;

import java.util.ArrayList;
import java.util.List;


/**
 * Class to store restaurant information. It is made static because the 
 * application is not intended to show information for multiple restaurants.
 */

public class RestaurantInfo {
	/**
	 * ID received from the QRCode scanned.
	 */
	public static String MarkerID = "";
	public static String restaurantName = "";
	public static int numberOfProducts = 0;
	public static List<ProductInfo> productsList = null; 
	public static int HotspotID;
	public static int OrderID;
	public static int ProviderID;
	
	public static List<ProductInfo> setMockList(){
		List<ProductInfo> mock = new ArrayList<ProductInfo>();
		return mock;
	}
}