package com.demo.android.onclicklinstener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找出UI元件
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        imageView = (ImageView)findViewById(R.id.imageView1);

        //委託匿名的監聽器
        button1.setOnClickListener(displayImg);
        button2.setOnClickListener(hideImg);
        button3.setOnClickListener(roomIn);
        button4.setOnClickListener(roomOut);
    }

    //負責顯示圖片的監聽器
    private View.OnClickListener displayImg = new View.OnClickListener(){

        @Override
        public void onClick(View v)
        {
            // TODO Auto-generated method stub
            imageView.setVisibility(View.VISIBLE);

        }
    };

    //負責隱藏圖片的監聽器
    private View.OnClickListener hideImg = new View.OnClickListener(){

        @Override
        public void onClick(View v)
        {
            // TODO Auto-generated method stub
            imageView.setVisibility(View.INVISIBLE);
        }
    };

    int h,w;
    //負責放大圖片的監聽器
    private View.OnClickListener roomIn = new View.OnClickListener(){

        @Override
        public void onClick(View v)
        {
            // TODO Auto-generated method stub
            h = imageView.getHeight();
            w = imageView.getWidth();
            imageView.setLayoutParams(new LinearLayout.LayoutParams(h+=10, w+=10));
        }
    };

    //負責縮小圖片的監聽器
    private View.OnClickListener roomOut = new View.OnClickListener(){

        @Override
        public void onClick(View v)
        {
            // TODO Auto-generated method stub
            // TODO Auto-generated method stub
            h = imageView.getHeight();
            w = imageView.getWidth();
            if(h> 10 & w > 10)
                imageView.setLayoutParams(new LinearLayout.LayoutParams(h-=10, w-=10));
        }
    };
}
