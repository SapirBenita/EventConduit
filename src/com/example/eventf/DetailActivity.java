package com.example.eventf;


import com.example.eventf.FragmentData.DetailsFragmentDataIf;

import android.app.Activity;
import android.os.Bundle;

public class DetailActivity extends Activity implements DetailsFragmentDataIf{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragmentb);
		
	}
	

	public Bundle getData() {
		
		return getIntent().getExtras();
	}
}