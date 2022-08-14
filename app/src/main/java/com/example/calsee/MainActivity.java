package com.example.calsee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNum1, etNum2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        tvResult = findViewById(R.id.tvResult);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNum1.getText().toString().isEmpty() || etNum2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter both the fields!", Toast.LENGTH_SHORT).show();
                }
                else{
                    float sum = Float.parseFloat(etNum1.getText().toString().trim()) + Float.parseFloat(etNum2.getText().toString().trim());
                    String res = Float.toString(sum);
                    tvResult.setText(res);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNum1.getText().toString().isEmpty() || etNum2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter both the fields!", Toast.LENGTH_SHORT).show();
                }
                else{
                    float diff = Float.parseFloat(etNum1.getText().toString().trim()) - Float.parseFloat(etNum2.getText().toString().trim());
                    String res = Float.toString(diff);
                    tvResult.setText(res);
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNum1.getText().toString().isEmpty() || etNum2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter both the fields!", Toast.LENGTH_SHORT).show();
                }
                else{
                    float product = Float.parseFloat(etNum1.getText().toString().trim()) * Float.parseFloat(etNum2.getText().toString().trim());
                    String res = Float.toString(product);
                    tvResult.setText(res);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNum1.getText().toString().isEmpty() || etNum2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter both the fields!", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(etNum2.getText().toString().trim().equals("0")){
                        tvResult.setText(R.string.error);
                    }
                    else{
                        float quotient = Float.parseFloat(etNum1.getText().toString().trim()) / Float.parseFloat(etNum2.getText().toString().trim());
                        String res = Float.toString(quotient);
                        tvResult.setText(res);
                    }
                }

            }
        });
    }
}