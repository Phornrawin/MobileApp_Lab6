package com.example.phornrawin.mobileapp_lab6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    private EditText num1EditText;
    private EditText num2EditText;
    private EditText num3EditText;
    private EditText num4EditText;
    private Button createChartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstance();
    }


    private void initInstance() {
        num1EditText = (EditText) findViewById(R.id.editText1);
        num2EditText = (EditText) findViewById(R.id.editText2);
        num3EditText = (EditText) findViewById(R.id.editText3);
        num4EditText = (EditText) findViewById(R.id.editText4);
        createChartButton = (Button) findViewById(R.id.btn_create);

        createChartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, FullscreenActivity.class);
                intent.putExtra("num", 5);
                intent.putExtra("num1", Double.parseDouble(num1EditText.getText().toString()));
                intent.putExtra("num2", Double.parseDouble(num2EditText.getText().toString()));
                intent.putExtra("num3", Double.parseDouble(num3EditText.getText().toString()));
                intent.putExtra("num4", Double.parseDouble(num4EditText.getText().toString()));
                startActivity(intent);
            }
        });
    }
}
