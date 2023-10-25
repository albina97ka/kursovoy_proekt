package com.example.kursovoy_proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        TextView text = findViewById(R.id.text1);
        text.setText(bundle.getString("key"));
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
