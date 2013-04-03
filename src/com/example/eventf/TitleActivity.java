package com.example.eventf;


import com.example.eventf.FragmentData.DetailsFragmentDataIf;
import com.example.eventf.FragmentEvent.OnEventSelectedListener;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.view.Menu;



	public class TitleActivity extends Activity implements OnEventSelectedListener {
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			
			setContentView(R.layout.fragmenta);
			//background
			getWindow().getDecorView().setBackgroundColor(Color.BLACK);
		

		}
		
		public void onEventSelected(Bundle eventData) {
			Intent intent = new Intent(this, DetailActivity.class);
			intent.putExtras(eventData);
			startActivity(intent);
		}
	}

