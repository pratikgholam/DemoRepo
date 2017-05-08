package com.example.helloapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SecondaryActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	 	setContentView(R.layout.activity_secondary);
	 	Intent i = getIntent();
		Bundle b = i.getExtras();
		int n1 = b.getInt("n1");
		int n2 = b.getInt("n2");
		int t = n1+n2;
		b.putInt("total", t);
		System.out.println("total : "+t);
		i.putExtras(b);
		setResult(Activity.RESULT_OK,i);
		finish();
	}

	

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.secondary, menu);
		return true;
	}

}
