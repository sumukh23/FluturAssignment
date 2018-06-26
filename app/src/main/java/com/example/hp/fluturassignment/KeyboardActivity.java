package com.example.hp.fluturassignment;

import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by hp on 24-06-2018.
 */

public class KeyboardActivity extends AppCompatActivity {

    Keyboard keyboard;
    KeyboardView keyboardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboard);

        keyboard = new Keyboard(this , R.xml.keyboard);

        keyboardView = (KeyboardView) findViewById(R.id.keyboardview);

        keyboardView.setKeyboard(keyboard);

        keyboardView.setOnKeyboardActionListener(new KeyboardView.OnKeyboardActionListener() {
            @Override
            public void onPress(int i) {

            }

            @Override
            public void onRelease(int i) {

            }

            @Override
            public void onKey(int i, int[] ints) {
                Toast.makeText(KeyboardActivity.this , Character.toString((char)i) , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onText(CharSequence charSequence) {

            }

            @Override
            public void swipeLeft() {

            }

            @Override
            public void swipeRight() {

            }

            @Override
            public void swipeDown() {

            }

            @Override
            public void swipeUp() {

            }
        });

        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KeyboardActivity.this , CarouselActivity.class);
                startActivity(i);
            }
        });
    }
}
