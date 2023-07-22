package com.example.bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(v -> {
            tv1.setText("Thiệu Nhật Hiếu");
            Intent intent = new Intent(this, Screen2.class);
            startActivity(intent);
        });
    }

}