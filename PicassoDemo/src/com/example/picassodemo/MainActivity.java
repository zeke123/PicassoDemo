package com.example.picassodemo;

import com.squareup.picasso.Picasso;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private ImageView imageview;
	private Button bt_button;

	//http://square.github.io/picasso/
	
	@Override
	protected void onCreate(Bundle savedInstanceState)

	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		bt_button = (Button) findViewById(R.id.bt_button);
		imageview = (ImageView) findViewById(R.id.imageview);

		bt_button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Picasso.with(getApplicationContext()).load("http://e.hiphotos.bdimg.com/album/h%3D370%3Bq%3D90/sign=3de7849d6d81800a71e58f09810e42c7/279759ee3d6d55fb5e440b346c224f4a20a4dd26.jpg")
				//默认占位图
				.placeholder(R.drawable.ic_launcher)
				//下载错误的时候显示
				.error(R.drawable.ic_launcher).resize(60, 60).centerCrop().rotate(90)			
				.into(imageview);				
			}
		});
	}
}
