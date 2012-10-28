package com.example.cis;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

@SuppressWarnings("unused")
public class LoadingActivity extends Activity{
	private final String TAG = "<<LoadingActivity";
	
	public void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loading_scene);
		
		
		JSONObject jsonObject;
		try {
			jsonObject = getResponse("http://cis-cloud.azurewebsites.net/api/authentication/1");/*+RestaurantInfo.MarkerID);*/
					
			RestaurantInfo.HotspotID=jsonObject.getInt("HotspotId");
			RestaurantInfo.OrderID=jsonObject.getInt("OrderId");
			RestaurantInfo.ProviderID=jsonObject.getInt("ProviderId");
			
		JSONArray jsonArray = getArrayResponse("http://cis-cloud.azurewebsites.net/api/services/list/"+RestaurantInfo.ProviderID);
		
		RestaurantInfo.productsList = RestaurantInfo.setMockList();
		int i =0;
		for(i = 0;;i++){
			try
			{
				JSONObject service = jsonArray.getJSONObject(i);
				ProductInfo tempProduct = new ProductInfo();
				tempProduct.setName(service.getString("Name"));
				tempProduct.setId(service.getInt("Id"));
				tempProduct.setPrice((float)service.getDouble("Price"));
				RestaurantInfo.productsList.add(tempProduct);
				RestaurantInfo.numberOfProducts++;
			}
			catch(JSONException e) {
				break;
			}
		}
		
		}
		catch(Exception e){}
		
		 RestaurantInfo.restaurantName="CIS Burger";

		 
		 Intent tempIntent = new Intent(this,RestaurantActivity.class);
		 startActivity(tempIntent);
	   
    }
	public JSONObject getResponse(String url) throws JSONException{
		String jsonString=null;
		
		  try {
		    HttpClient httpclient = new DefaultHttpClient();
		    HttpResponse response = httpclient.execute(new HttpGet(url));
		    jsonString=decodeResponse(new InputStreamReader(response.getEntity().getContent()));
		    
		    }
		  catch (Exception e) {
		    Log.d(TAG, "Network exception"+ e);
		  }
		  
		return new JSONObject(jsonString);
	}
	public JSONArray getArrayResponse(String url) throws JSONException{
		String jsonString=null;
		
		  try {
		    HttpClient httpclient = new DefaultHttpClient();
		    HttpResponse response = httpclient.execute(new HttpGet(url));
		    jsonString=decodeResponse(new InputStreamReader(response.getEntity().getContent()));
		    
		    }
		  catch (Exception e) {
		    Log.d(TAG, "Network exception"+ e);
		  }
		  
		return new JSONArray(jsonString);
	}
	
	public String decodeResponse( InputStreamReader codedResponse) throws IOException{
		 StringBuilder decodedResponse=new StringBuilder();
		 int tempVar = 0; 
		 while(tempVar != -1){
			 tempVar=codedResponse.read();
			 decodedResponse.append((char)tempVar);
		 } 
		return decodedResponse.toString();
	}
}
