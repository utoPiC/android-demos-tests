package com.example.cridadordezamiadroid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	
	private static int PROJ_ID=1;
	private EditText citationId;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		Button btCreateCitation = (Button) findViewById(R.id.btNewCitation);
		Button btEditCitation= (Button) findViewById(R.id.btViewCitation);
		Button btShowMap= (Button) findViewById(R.id.btShowMap);

		citationId=(EditText)findViewById(R.id.etCitationId);
		
		btCreateCitation.setOnClickListener(btCreate);
		btEditCitation.setOnClickListener(btView);
		btShowMap.setOnClickListener(showMap);
		
	}
	
	public OnClickListener btCreate = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			Intent intent=new Intent(getString(R.string.zamiaDroidCitationCreate));
			
			Bundle b= new Bundle();
			b.putLong("id", 1);
			intent.putExtras(b);
			
			startActivity(intent);
			
		}
	};

	public OnClickListener showMap = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			Intent intent=new Intent(getString(R.string.zamiaDroidCitationMap));
			
			Bundle b= new Bundle();
			b.putLong("id", 1);
			intent.putExtras(b);
			
			startActivity(intent);
			
		}
	};

	
	public OnClickListener btView = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			Intent intent=new Intent(getString(R.string.zamiaDroidCitationEdit));
			
			Bundle b= new Bundle();
			b.putLong("id", 1);
			intent.putExtras(b);
			
			b= new Bundle();
			b.putLong("idSample",Long.valueOf(citationId.getText().toString()));
			intent.putExtras(b);
			
			startActivity(intent);
			
		}
	};

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
