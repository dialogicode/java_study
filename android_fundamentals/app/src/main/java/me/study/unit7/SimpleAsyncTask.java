package me.study.unit7;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.Random;

public class SimpleAsyncTask extends AsyncTask<Void, Void, String> {
	private WeakReference<TextView> mTextView;

	public SimpleAsyncTask(TextView tv) {
		mTextView = new WeakReference<>(tv);
	}

	@Override
	protected String doInBackground(Void... voids) {
		// 10 이내의 정수를 생성
		Random r = new Random();
		int n = r.nextInt(11);
		int s = n * 200;

		// 무작위 시간동안 스레드 잠시 정지
		try {
			Thread.sleep(s);
		} catch (InterruptedException e){
			e.printStackTrace();
		}

		// 문자열 결과를 반환
		return "Awake at last after sleeping for " + s + "milliseconds!!!";
	}

	@Override
	protected void onPostExecute(String result) {
		mTextView.get().setText(result);
	}
}
