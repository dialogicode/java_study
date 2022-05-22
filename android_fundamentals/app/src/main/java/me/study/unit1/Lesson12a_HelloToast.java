package me.study.unit1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import me.study.R;

public class Lesson12a_HelloToast extends AppCompatActivity {
	private int mCount = 0;
	private TextView mShowCount;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lesson12a);

		/*  part 01.2
		 *
		 * 	안드로이드 기기 화면의 UI - View 라는 객체 계층으로 구성
		 *  TextViw     : display text
		 *  EditText    : enable to enter and edit text
		 *  Button, RadioButton, CheckBox, Spinner  : clickable element
		 *  ScrollView, RecyclerView                : scrollable item
		 *  ImageView   : display image
		 *
		 *  ConstraintLayout, LinearLayout  : containing other View element and positioning them
		 */

		mShowCount = (TextView) findViewById(R.id.show_count);

	}

	public void showToast(View view) {
		// 짧게 화면에 팝업되서 나타나는 메세지 : Toast
		Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
		toast.show();
	}

	public void countUp(View view) {
		mCount++;
		if (mShowCount != null) {
			mShowCount.setText(Integer.toString(mCount));
		}
	}
}