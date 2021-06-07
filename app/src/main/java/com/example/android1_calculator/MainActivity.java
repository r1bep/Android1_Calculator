package com.example.android1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private final int[] numberButtonIds = new int[]{R.id.butt0, R.id.butt1, R.id.butt2, R.id.butt3,
            R.id.butt4, R.id.butt5, R.id.butt6, R.id.butt7, R.id.butt8, R.id.butt9};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);

        Button[] buttons = null;
        buttons[0] = findViewById(numberButtonIds[0]);
        buttons[1] = findViewById(numberButtonIds[1]);
        buttons[2] = findViewById(numberButtonIds[2]);
        buttons[3] = findViewById(numberButtonIds[3]);
        buttons[4] = findViewById(numberButtonIds[4]);
        buttons[5] = findViewById(numberButtonIds[5]);
        buttons[6] = findViewById(numberButtonIds[6]);
        buttons[7] = findViewById(numberButtonIds[7]);
        buttons[8] = findViewById(numberButtonIds[8]);
        buttons[9] = findViewById(numberButtonIds[9]);

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

        for (int id = 0; id < buttons.length; id++) {
            buttons[id].setOnClickListener(OnClickListener);
        }
// Хотел эту простыню упаковать в цикл, но уже все глаза сломал не понимаю как это сделать!!
// сам массив не могу обьявить перед методом OnCreate.


//        butt1.setOnClickListener(OnClickListener);
//        butt2.setOnClickListener(OnClickListener);
//        butt3.setOnClickListener(OnClickListener);
//        butt4.setOnClickListener(OnClickListener);
//        butt5.setOnClickListener(OnClickListener);
//        butt6.setOnClickListener(OnClickListener);
//        butt7.setOnClickListener(OnClickListener);
//        butt8.setOnClickListener(OnClickListener);
//        butt9.setOnClickListener(OnClickListener);
//        butt0.setOnClickListener(OnClickListener);
    }

}