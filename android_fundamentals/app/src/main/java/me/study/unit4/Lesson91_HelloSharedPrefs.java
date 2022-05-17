package me.study.unit4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import me.study.R;

public class Lesson91_HelloSharedPrefs extends AppCompatActivity {
	// Current count
	private int mCount = 0;
	// Current background color
	private int mColor;
	// Text view to display both count and color
	private TextView mShowCountTextView;

	// Key for current count
	private final String COUNT_KEY = "count";
	// Key for current color
	private final String COLOR_KEY = "color";

	// lesson 9.1 실습 예제
	private SharedPreferences mPreferences;
	private String sharedPrefFile = "me.study.unit4.Lesson91";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lesson91);

		// Initialize views, color
		mShowCountTextView = findViewById(R.id.count_textview);
		mColor = ContextCompat.getColor(this, R.color.default_background);

		// Restore the saved instance state.
		/*if (savedInstanceState != null) {

			mCount = savedInstanceState.getInt(COUNT_KEY);
			if (mCount != 0) {
				mShowCountTextView.setText(String.format("%s", mCount));
			}

			mColor = savedInstanceState.getInt(COLOR_KEY);
			mShowCountTextView.setBackgroundColor(mColor);
		}*/

		// SharedPreferences 실습 후
		mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);

		mCount = mPreferences.getInt(COUNT_KEY, 0);
		mShowCountTextView.setText(String.format("%s", mCount));

		mColor = mPreferences.getInt(COLOR_KEY, mColor);
		mShowCountTextView.setBackgroundColor(mColor);
	}

	@Override
	protected void onPause() {
		super.onPause();
		SharedPreferences.Editor preferencesEditor = mPreferences.edit();
		preferencesEditor.putInt(COUNT_KEY, mCount);
		preferencesEditor.putInt(COLOR_KEY, mColor);
		preferencesEditor.apply();
	}

	public void changeBackground(View view) {
		int color = ((ColorDrawable) view.getBackground()).getColor();
		mShowCountTextView.setBackgroundColor(color);
		mColor = color;
	}

	public void countUp(View view) {
		mCount++;
		mShowCountTextView.setText(String.format("%s", mCount));
	}

	@Override
	protected void onSaveInstanceState(@NonNull Bundle outState) {
		super.onSaveInstanceState(outState);

		outState.putInt(COUNT_KEY, mCount);
		outState.putInt(COLOR_KEY, mColor);
	}

	public void reset(View view) {
		// Reset count
		mCount = 0;
		mShowCountTextView.setText(String.format("%s", mCount));

		// Reset color
		mColor = ContextCompat.getColor(this, R.color.default_background);
		mShowCountTextView.setBackgroundColor(mColor);

		// preferences 리셋
		SharedPreferences.Editor preferencesEditor = mPreferences.edit();
		preferencesEditor.clear();
		preferencesEditor.apply();
	}
}