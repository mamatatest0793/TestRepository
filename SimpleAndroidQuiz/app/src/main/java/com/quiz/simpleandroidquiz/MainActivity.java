package com.quiz.simpleandroidquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity
{
	Button btn_play;
	TextView text_question;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn_play=(Button)findViewById(R.id.button_play);
		btn_play.setOnClickListener(new OnClickListener() 
		{			
			@Override
			public void onClick(View v) 
			{
				Intent intent=new Intent(MainActivity.this,StartQuizActivity.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
