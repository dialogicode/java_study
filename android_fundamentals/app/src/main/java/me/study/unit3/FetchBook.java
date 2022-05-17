package me.study.unit3;

import android.os.AsyncTask;
import android.widget.TextView;

import androidx.loader.content.AsyncTaskLoader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.ref.WeakReference;
import java.nio.channels.AsynchronousChannelGroup;

import me.study.R;

public class FetchBook extends AsyncTask<String, Void, String> {
	private WeakReference<TextView> mTitleText;
	private WeakReference<TextView> mAuthorText;

	public FetchBook(TextView titleText, TextView authorText) {
		this.mTitleText = new WeakReference<>(titleText);
		this.mAuthorText = new WeakReference<>(authorText);
	}

	@Override
	protected String doInBackground(String... strings) {
		return NetworkUtils.getBookInfo(strings[0]);
	}

	@Override
	protected void onPostExecute(String s) {
		super.onPostExecute(s);
		try {
			// 반환 값을 JSON 객체로 변환
			JSONObject jsonObject = new JSONObject(s);
			// items에 대한 JSON 배열을 얻기
			JSONArray itemsArray = jsonObject.getJSONArray("items");

			// 반복문을 위한 변수 초기화
			int i = 0;
			String title = null;
			String authors = null;

			// items 배열을 살펴보기
			// 제목과 작가가 둘다 존재할때만 아이템을 얻고 체크한다.
			while (i < itemsArray.length() && (authors == null && title == null)) {
				JSONObject book = itemsArray.getJSONObject(i);
				JSONObject volumeInfo = book.getJSONObject("volumeInfo");

				try {
					title = volumeInfo.getString("title");
					authors = volumeInfo.getString("authors");
				} catch (Exception e) {
					e.printStackTrace();
				}

				i++;
			}

			// 제목, 작가 둘다 존재할 대 결과를 나타내라
			if (title != null && authors != null) {
				mTitleText.get().setText(title);
				mAuthorText.get().setText(authors);
			} else {
				// 아무 결과도 나타나지 않을 때 UI에 실패를 나타내라
				mTitleText.get().setText(R.string.no_results);
				mAuthorText.get().setText("");
			}
		} catch (Exception e) {
			mTitleText.get().setText(R.string.no_results);
			mAuthorText.get().setText("");
		}
	}
}
