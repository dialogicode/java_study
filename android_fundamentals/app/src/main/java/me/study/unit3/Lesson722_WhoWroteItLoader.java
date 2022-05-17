package me.study.unit3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import org.json.JSONArray;
import org.json.JSONObject;

import me.study.R;

public class Lesson722_WhoWroteItLoader extends AppCompatActivity
		implements LoaderManager.LoaderCallbacks<String> {

	private EditText mBookInput;
	private TextView mTitleText;
	private TextView mAuthorText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lesson722);

		mBookInput = (EditText) findViewById(R.id.bookInput);
		mTitleText = (TextView) findViewById(R.id.titleText);
		mAuthorText = (TextView) findViewById(R.id.authorText);

		if(getSupportLoaderManager().getLoader(0) != null){
			getSupportLoaderManager().initLoader(0, null, this);
		}
	}

	@NonNull
	@Override
	public Loader<String> onCreateLoader(int id, @Nullable Bundle args) {
		String queryString = "";
		if (args != null) queryString = args.getString("queryString");
		return new BookLoader(this, queryString);
	}

	@Override
	public void onLoadFinished(@NonNull Loader<String> loader, String data) {
		try {
			// 반환 값을 JSON 객체로 변환
			JSONObject jsonObject = new JSONObject(data);
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
				mTitleText.setText(title);
				mAuthorText.setText(authors);
			} else {
				// 아무 결과도 나타나지 않을 때 UI에 실패를 나타내라
				mTitleText.setText(R.string.no_results);
				mAuthorText.setText("");
			}
		} catch (Exception e) {
			mTitleText.setText(R.string.no_results);
			mAuthorText.setText("");
			e.printStackTrace();
		}
	}

	@Override
	public void onLoaderReset(@NonNull Loader<String> loader) {}

	public void searchBooks(View view) {
		String queryString = mBookInput.getText().toString();

		InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
		if (inputManager != null) {
			inputManager.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
		}

		ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo networkInfo = null;
		if (connMgr != null){
			networkInfo = connMgr.getActiveNetworkInfo();
		}

		if (networkInfo != null && networkInfo.isConnected() && queryString.length() != 0){
			//new FetchBook(mTitleText, mAuthorText).execute(queryString);
			// Loader 클래스로 요청하는 작업 바꿔주기
			Bundle queryBundle = new Bundle();
			queryBundle.putString("queryString", queryString);
			getSupportLoaderManager().restartLoader(0, queryBundle, this);

			mAuthorText.setText("");
			mTitleText.setText(R.string.loading);
		} else {
			if (queryString.length() == 0){
				mAuthorText.setText("");
				mTitleText.setText(R.string.no_search_term);
			} else {
				mAuthorText.setText("");
				mTitleText.setText(R.string.no_network);
			}
		}
	}
}