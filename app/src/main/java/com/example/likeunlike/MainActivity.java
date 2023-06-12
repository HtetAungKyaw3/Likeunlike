package com.example.likeunlike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    Button btnLike, btnUnLike,btnChange;
    int count= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txtResult);
        btnLike = findViewById(R.id.btnLike);
        btnUnLike =findViewById(R.id.btnUnLike);
        btnChange = findViewById(R.id.btnChange);

        btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;//count = count +1
                txtResult.setText("Total Count =>" + count);
            }
        });

        btnUnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;//count = count -１
                txtResult.setText("Total Count =>" + count);
            }
        });

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                 startActivity(intent);
            }
        });
        }

    }
