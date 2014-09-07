package com.example.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);
        
       
        
        // establish connections to activity_main.xml
        // =============afasdfasdfadf
        Button btnToast = (Button) findViewById(R.id.btnToast);
        Button btnGoogle = (Button) findViewById(R.id.btnGoogle);
        Button btnCall = (Button) findViewById(R.id.btnCall);
        
        // define events
        btnToast.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Toast.makeText(getApplicationContext(), "Button is clicked",
        				Toast.LENGTH_LONG).show();
        		Intent myIntent = new Intent(getApplicationContext(), NewActivity.class);
        		startActivity(myIntent);
        	}
        });
        
        btnGoogle.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent myIntent = new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://www.google.com"));
        		startActivity(myIntent);
        	}
        });
        
        btnCall.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Intent myIntent = new Intent(Intent.ACTION_VIEW,
        				Uri.parse("tel:614-370-4577"));
				startActivity(myIntent);
			}
        });
 
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
