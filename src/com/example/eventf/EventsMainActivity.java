package com.example.eventf;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.eventf.FragmentEvent.OnEventSelectedListener;

public class EventsMainActivity extends FragmentActivity implements OnEventSelectedListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_event);

		// background to avoid redraw.
		getWindow().setBackgroundDrawable(null);

	}

	public void onEventSelected(Event eventData) {
		Intent intent = new Intent(this, EventsDetailsActivity.class);
		intent.putExtras(eventData.toBundle());
		startActivity(intent);
	}
}
