package com.example.android1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private Button butt_1, butt_2, butt_3, butt_4,
                   butt_5, butt_6, butt_7, butt_8,
                   butt_9, butt_0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        butt_1 = findViewById(R.id.butt1);
        butt_2 = findViewById(R.id.butt2);
        butt_3 = findViewById(R.id.butt3);
        butt_4 = findViewById(R.id.butt4);
        butt_5 = findViewById(R.id.butt5);
        butt_6 = findViewById(R.id.butt6);
        butt_7 = findViewById(R.id.butt7);
        butt_8 = findViewById(R.id.butt8);
        butt_9 = findViewById(R.id.butt9);
        butt_0 = findViewById(R.id.butt0);

        View.OnClickListener OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.butt1:
                        text.setText("1");
                        break;
                    case R.id.butt2:
                        text.setText("2");
                        break;
                    case R.id.butt3:
                        text.setText("3");
                        break;
                    case R.id.butt4:
                        text.setText("4");
                        break;
                    case R.id.butt5:
                        text.setText("5");
                        break;
                    case R.id.butt6:
                        text.setText("6");
                        break;
                    case R.id.butt7:
                        text.setText("7");
                        break;
                    case R.id.butt8:
                        text.setText("8");
                        break;
                    case R.id.butt9:
                        text.setText("9");
                        break;
                    case R.id.butt0:
                        text.setText("0");
                        break;
                }
            }
        };

        butt_1.setOnClickListener(OnClickListener);
        butt_2.setOnClickListener(OnClickListener);
        butt_3.setOnClickListener(OnClickListener);
        butt_4.setOnClickListener(OnClickListener);
        butt_5.setOnClickListener(OnClickListener);
        butt_6.setOnClickListener(OnClickListener);
        butt_7.setOnClickListener(OnClickListener);
        butt_8.setOnClickListener(OnClickListener);
        butt_9.setOnClickListener(OnClickListener);
        butt_0.setOnClickListener(OnClickListener);
    }

}