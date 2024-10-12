package com.example.activitylaba1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);

        // Обработчик нажатия на кнопку
        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(Activity1.this, Activity2.class);
            intent.putExtra("parameter", "Рябых Алёна");
            startActivity(intent);
        });
    }
}
