package me.study.unit7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import me.study.R;

public class Lesson71_SimpleAsyncTask extends AppCompatActivity {
	// 상태 저장을 꺼내오기 위한 키
	private static final String TEXT_STATE = "currentText";

	// 결과를 보여줄 텍스트뷰
	private TextView textView1 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lesson71);

		// 뷰 요소 설정
		textView1 = (TextView) findViewById(R.id.textView1);

		// 저장된 상태가 존재하면 로드
		if(savedInstanceState != null){
			textView1.setText(savedInstanceState.getString(TEXT_STATE));
		}
	}

	public void startTask(View view) {
		// textView1 에 메세지 띄우기
		textView1.setText(R.string.napping);

		// AsyncTask 작동시키기
		new SimpleAsyncTask(textView1).execute();
	}

	@Override
	protected void onSaveInstanceState(@NonNull Bundle outState) {
		super.onSaveInstanceState(outState);

		// TextView 상태를 저장
		outState.putString(TEXT_STATE, textView1.getText().toString());
	}
}