package com.example.hinakhalid.cart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class content_display_2 extends AppCompatActivity {
    ImageView mImageView;
    TextView mText;
    TextView mContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_display_2);

        mImageView=(ImageView) findViewById(R.id.imageView2);
        mText=(TextView) findViewById(R.id.textView2);
        mContent=(TextView) findViewById(R.id.textView3);
        String Name=getIntent().getStringExtra("Name");

        int Flag=getIntent().getIntExtra("Flag",-1);

        if(Name!=null && Flag!=-1)
        {
            mText.setText(Name);
            mContent.setText(R.string.article_content);
            mImageView.setImageResource(Flag);

        }
    }
}
