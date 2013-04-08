package com.example.eventf;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.eventf.FragmentDetail.DetailsFragmentDataIf;

public class EventsDetailsActivity extends FragmentActivity implements
		DetailsFragmentDataIf {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_detail);
	}

	public Event getEvent() {
		return new Event(getIntent().getExtras());
	}
}