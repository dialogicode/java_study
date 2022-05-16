package me.study.unit1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import me.study.R;

public class Lesson11_HelloLog extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lesson11);

		// part 01.1
		// 로그 명령문 출력: 필터링 설정 d-debug, e-error, w-warn, i-info
		// 첫번째 매개변수 : 로그태그
			// 로그태그 상수 > Activity 예시
			// private static final String LOG_TAG = MainActivity.class.getSimpleName();
		// 두번째 매개변수 : 메세지
		Log.d("MainActivity", "Hello World");

		/*  part 01.2
		*
		* 	안드로이드 기기 화면의 UI - View 라는 객체 계층으로 구성
		*   TextViw     : display text
		*   EditText    : enable to enter and edit text
		*   Button, RadioButton, CheckBox, Spinner  : clickable element
		*   ScrollView, RecyclerView                : scrollable item
		*   ImageView   : display image
		*
		*   ConstraintLayout, LinearLayout  : containing other View element and positioning them.
		*/
	}
}