package com.quiz.simpleandroidquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayQuizResult extends Activity
{
	private int result;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_quiz_result);
		Intent intent=getIntent();
		result=intent.getIntExtra("result", 0);
		
		TextView textView=(TextView)findViewById(R.id.textview);
		textView.setText("You scored : "+String.valueOf(result)+"/5");
		textView.setTextColor(getResources().getColor(android.R.color.white));
				
	}

	public void onHomeClick(View view)
	{
		Intent intent=new Intent(DisplayQuizResult.this,MainActivity.class);
		startActivity(intent);
	}
	

}
