
package com.example.eventf;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidquery.AQuery;

@SuppressLint("NewApi")
public class FragmentData extends Fragment {
	
	private DetailsFragmentDataIf mDataIf;

	// Context context;

	@SuppressLint("NewApi")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method

		// aq = new AQuery(this);
		Bundle dataBundle = mDataIf.getData();

		String data = dataBundle.getString("Data");
		String hours = dataBundle.getString("Hours");
		String place = dataBundle.getString("Place");
		String title = dataBundle.getString("Title");
		String date = dataBundle.getString("Date");
		String image = dataBundle.getString("Image");


		View detailsFragView = inflater.inflate(R.layout.viewer, container,
				false);
		AQuery detailsFragViewAq = new AQuery(getActivity(), detailsFragView);

		detailsFragViewAq.find(R.id.hours).text(hours);
		detailsFragViewAq.find(R.id.date).text(date);
		detailsFragViewAq.find(R.id.title).text(title);
		detailsFragViewAq.find(R.id.place).text(place);

		if (!(data.equals("null"))) {
			detailsFragViewAq.find(R.id.data).getTextView().setHint(data + "\n");
			detailsFragViewAq.find(R.id.background).image(image);
		}
		return detailsFragView;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			mDataIf = (DetailsFragmentDataIf) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString()
					+ " must implement DetailsFragmentDataIf");
		}
	}
	
	public interface DetailsFragmentDataIf {

		public Bundle getData();
		
	}

}