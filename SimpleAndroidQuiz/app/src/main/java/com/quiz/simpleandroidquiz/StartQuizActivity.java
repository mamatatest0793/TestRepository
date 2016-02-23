package com.quiz.simpleandroidquiz;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class StartQuizActivity extends Activity 
{
	private TextView text_que;
	private int i=1,result=0;
	private List<String> answer;
	private RadioGroup group;
	private RadioButton option1,option2,option3,option4;
	private Button button_next;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_quiz);
		getIntent();
		
		answer=new ArrayList<String>();
		answer.add("Java");
		answer.add("Mobile OS");
		answer.add("Linux");
		answer.add("Android Inc.");
		answer.add("Google");
		button_next=(Button)findViewById(R.id.button_next);
		button_next.setOnClickListener(new OnClickListener()
		{			
			@Override
			public void onClick(View v) 
			{
				group=(RadioGroup)findViewById(R.id.group);
				int id=group.getCheckedRadioButtonId();
				RadioButton rb=(RadioButton)findViewById(id);
				rb.setChecked(false);
				String ans=rb.getText().toString();
				if(ans.equals(answer.get(i-1)))
				{
					result++;
				}
				i++;
				Toast.makeText(StartQuizActivity.this,String.valueOf(result),Toast.LENGTH_LONG).show();
				startGame();
			}
		});
		startGame();
		
	}

	
	
	public void startGame()
	{
		switch (i) 
		{
		case 1:
			text_que=(TextView)findViewById(R.id.text_question);
			text_que.setText(R.string.que1);
			option1=(RadioButton)findViewById(R.id.option1);
			option2=(RadioButton)findViewById(R.id.option2);
			option3=(RadioButton)findViewById(R.id.option3);
			option4=(RadioButton)findViewById(R.id.option4);
			option1.setText(R.string.que1option1);
			option2.setText(R.string.que1option2);
			option3.setText(R.string.que1option3);
			option4.setText(R.string.que1option4);
			
			
			break;
		case 2:
			text_que=(TextView)findViewById(R.id.text_question);
			text_que.setText(R.string.que2);
			option1=(RadioButton)findViewById(R.id.option1);
			option2=(RadioButton)findViewById(R.id.option2);
			option3=(RadioButton)findViewById(R.id.option3);
			option4=(RadioButton)findViewById(R.id.option4);
			option1.setText(R.string.que2option1);
			option2.setText(R.string.que2option2);
			option3.setText(R.string.que2option3);
			option4.setText(R.string.que2option4);
			break;
		case 3: 
			text_que=(TextView)findViewById(R.id.text_question);
			text_que.setText(R.string.que3);
			option1=(RadioButton)findViewById(R.id.option1);
			option2=(RadioButton)findViewById(R.id.option2);
			option3=(RadioButton)findViewById(R.id.option3);
			option4=(RadioButton)findViewById(R.id.option4);
			option1.setText(R.string.que3option1);
			option2.setText(R.string.que3option2);
			option3.setText(R.string.que3option3);
			option4.setText(R.string.que3option4);
			break;
		case 4:
			text_que=(TextView)findViewById(R.id.text_question);
			text_que.setText(R.string.que4);
			option1=(RadioButton)findViewById(R.id.option1);
			option2=(RadioButton)findViewById(R.id.option2);
			option3=(RadioButton)findViewById(R.id.option3);
			option4=(RadioButton)findViewById(R.id.option4);
			option1.setText(R.string.que4option1);
			option2.setText(R.string.que4option2);
			option3.setText(R.string.que4option3);
			option4.setText(R.string.que4option4);
			break;
		case 5:
			text_que=(TextView)findViewById(R.id.text_question);
			text_que.setText(R.string.que5);
			option1=(RadioButton)findViewById(R.id.option1);
			option2=(RadioButton)findViewById(R.id.option2);
			option3=(RadioButton)findViewById(R.id.option3);
			option4=(RadioButton)findViewById(R.id.option4);
			option1.setText(R.string.que5option1);
			option2.setText(R.string.que5option2);
			option3.setText(R.string.que5option3);
			option4.setText(R.string.que5option4);
			break;
			
		case 6:
			button_next.setText("Go");
			Intent intent=new Intent(StartQuizActivity.this,DisplayQuizResult.class);
			intent.putExtra("result", result);
			startActivity(intent);
			break;

		default:
			break;
		}
		
	}

}
