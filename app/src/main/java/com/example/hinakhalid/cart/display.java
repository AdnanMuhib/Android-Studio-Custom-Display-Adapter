package com.example.hinakhalid.cart;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class display extends AppCompatActivity {

    ImageView mImageView;
    TextView mText;
    TextView mContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


       mImageView=(ImageView) findViewById(R.id.imageView2);
        mText=(TextView) findViewById(R.id.textView2);
        mContent=(TextView) findViewById(R.id.textView3);
        mContent.setMovementMethod(new ScrollingMovementMethod());
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
