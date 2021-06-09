package com.example.android1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private CalculateLogic calculator;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);

        int[] numberIds = new int[]{
                R.id.butt0,
                R.id.butt1,
                R.id.butt2,
                R.id.butt3,
                R.id.butt4,
                R.id.butt5,
                R.id.butt6,
                R.id.butt7,
                R.id.butt8,
                R.id.butt9,
        };

        int[] actionsIds = new int[]{
                R.id.plus,
                R.id.minus,
                R.id.multiply,
                R.id.division,
                R.id.equals
        };

        calculator = new CalculateLogic();

        View.OnClickListener numberButtonClickListener = view -> {
            calculator.onNumPressed(view.getId());
            text.setText(calculator.getText());
        };

        View.OnClickListener actionButtonOnclickListener = view -> {
            calculator.onActionPressed(view.getId());
            text.setText(calculator.getText());
        };
        for (int numberId : numberIds) {
            findViewById(numberId).setOnClickListener(numberButtonClickListener);
        }

        for (int actionsId : actionsIds) {
            findViewById(actionsId).setOnClickListener(actionButtonOnclickListener);
        }

        findViewById(R.id.butt_C).setOnClickListener(view -> {
            calculator.reset();
            text.setText(calculator.getText());
        });
    }
}
