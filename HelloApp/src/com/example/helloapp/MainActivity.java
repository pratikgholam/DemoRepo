package com.example.helloapp;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity  implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		System.out.println("Created");
		
		setContentView(R.layout.activity_main);
		Button b = (Button)findViewById(R.id.button1);
	//	b.setOnClickListener(new ButtonListener());
		b.setOnClickListener(this);
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		System.out.println("Stopped");
		super.onStop();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroyed");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		System.out.println("Paused");
		super.onPause();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		System.out.println("Restarted");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		System.out.println("Resumed");
		super.onResume();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		System.out.println("Started");
		super.onStart();
	}

	 

	@Override
	public void onClick(View arg0) {
		 
		System.out.println("My Button Clicked");
		//Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));
		//Intent i = new Intent(Intent.ACTION_EDIT,Uri.parse("content://contacts/people/1"));
//		Intent i = new Intent(Intent.ACTION_VIEW);
//		i.setData(Uri.parse("http://www.niitstudent.com"));
//		i.addCategory(Intent.CATEGORY_LAUNCHER);
//		startActivity(i);
		Intent i = new Intent(MainActivity.this,SecondaryActivity.class); //Explicit Intent
		//startActivity(i); //Starts Secondary Activity
		Bundle b = new Bundle();
		b.putInt("n1", 20);
		b.putInt("n2", 45);
		i.putExtras(b);
		startActivityForResult(i, 123);
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		System.out.println("**act res**");
		try{
			if(requestCode==123 && resultCode==Activity.RESULT_OK){
				Bundle b = data.getExtras();
				int result  = b.getInt("total");
				System.out.println("act result : " + result);
			}
			
			}
			catch(Exception e){
				System.out.println("act res err" );
			}
			
		}
	}


