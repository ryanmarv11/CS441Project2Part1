package com.example.cs441project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView screen_one_text;
    Button big_text_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen_one_text = (TextView) findViewById(R.id.screen_one_text);
        big_text_button = (Button) findViewById(R.id.big_text_button);

    }

    public void onHelloClick(View view) {

        big_text_button.setTextSize(48);
    }
}