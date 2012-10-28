package com.example.cis;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class RestaurantActivity extends Activity {
	private final String TAG = "<<RestaurantActivity";
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		Log.d(TAG,"here be oncreate. ProductList: "+RestaurantInfo.productsList.toString());
		setContentView(R.layout.restaurant_menu);
		//for (int i=0;i<RestaurantInfo.numberOfProducts;i++){
		TextView productName = (TextView)findViewById(R.id.productName1);
		TextView productPrice = (TextView)findViewById(R.id.productPrice1);
		productName.setText(RestaurantInfo.productsList.get(0).getName());
		productPrice.setText(Float.toString((RestaurantInfo.productsList.get(0).getPrice())));
		
		productName = (TextView)findViewById(R.id.productName2);
		productPrice = (TextView)findViewById(R.id.productPrice2);
		productName.setText(RestaurantInfo.productsList.get(1).getName());
		productPrice.setText(Float.toString((RestaurantInfo.productsList.get(1).getPrice())));
		
		productName = (TextView)findViewById(R.id.productName3);
		productPrice = (TextView)findViewById(R.id.productPrice3);
		productName.setText(RestaurantInfo.productsList.get(2).getName());
		productPrice.setText(Float.toString((RestaurantInfo.productsList.get(2).getPrice())));
		
		
	}
	


}
