package com.example.hp.fluturassignment;

import android.content.Intent;
import android.graphics.BlurMaskFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import jp.wasabeef.blurry.Blurry;

public class MainActivity extends AppCompatActivity {

    TextView transtext , textview , textview2;
    ViewGroup viewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        transtext = (TextView) findViewById(R.id.transtext);
        textview = (TextView) findViewById(R.id.textView);
        textview2 = (TextView) findViewById(R.id.textView2);

        viewGroup = (ViewGroup) findViewById(android.R.id.content);

        Button button = (Button) findViewById(R.id.button);
        Button button1 = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transtext.setVisibility(View.VISIBLE);
                BlurMaskFilter filter = new BlurMaskFilter(10 , BlurMaskFilter.Blur.NORMAL);
                textview.setLayerType(View.LAYER_TYPE_SOFTWARE , null);
                textview.getPaint().setMaskFilter(filter);
                textview2.setLayerType(View.LAYER_TYPE_SOFTWARE , null);
                textview2.getPaint().setMaskFilter(filter);
                Blurry.with(MainActivity.this).radius(10).sampling(2).async().capture(findViewById(R.id.iv_image)).into((ImageView) findViewById(R.id.iv_image));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this , KeyboardActivity.class);
                startActivity(i);
            }
        });
    }
}
