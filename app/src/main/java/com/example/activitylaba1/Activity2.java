package com.example.activitylaba1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // Получение параметра из Intent
        String parameter = getIntent().getStringExtra("paremeter");

        // Обновление значения TextView
        TextView textView = findViewById(R.id.textView);
        textView.setText("Переданный параметр: " + parameter);
    }
}
