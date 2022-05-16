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

		/*  part 01.1
		 *
		 *  로그 명령문 출력: 필터링 설정 d-debug, e-error, w-warn, i-info
		 *  첫번째 매개변수 : 로그태그
		 *      로그태그 상수 > Activity 예시
		 *      private static final String LOG_TAG = MainActivity.class.getSimpleName();
		 *  두번째 매개변수 : 메세지
		 */

		Log.d("MainActivity", "Hello World");
	}
}