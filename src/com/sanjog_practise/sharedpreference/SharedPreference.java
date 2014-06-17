package com.sanjog_practise.sharedpreference;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class SharedPreference extends Activity {
	
	
	private EditText et;

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shared_preference);
		
		et = (EditText) findViewById(R.id.editText1);
		
		SharedPreferences sp = getSharedPreferences("MY_PREFERENCE", 0);
		et.setText(sp.getString("default_value", ""));
		
}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub	
		super.onStop();
		SharedPreferences sp = getSharedPreferences("MY_PREFERENCE", 0);
		SharedPreferences.Editor editor = sp.edit();
		editor.putString("default_value", et.getText().toString());
		editor.commit();
		
	}
}