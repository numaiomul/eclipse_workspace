package com.example.cis;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	private String outputText = "";
	public final Activity myActivity = this;
	public final Context myContext = this.getApplicationContext();
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button scanButton = (Button) findViewById(R.id.scanButton);
       	scanButton.setOnClickListener(mScanButtonEvent);
        
        }

    private OnClickListener mScanButtonEvent = new OnClickListener() {
    	public void onClick(View v) {
    		IntentIntegrator integrator = new IntentIntegrator(myActivity);
    		integrator.initiateScan();
    	}
    };
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
    	   IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
    	   if (scanResult != null) {
    	     outputText = scanResult.getContents();
    	   
    	     Context context = getApplicationContext();
    	     CharSequence text = scanResult.getContents();
    	     int duration = Toast.LENGTH_SHORT;

    	     Toast toast = Toast.makeText(context, text, duration);
    	     toast.show();  
    	     
    	   }
    	  
    	 }
}
    	

