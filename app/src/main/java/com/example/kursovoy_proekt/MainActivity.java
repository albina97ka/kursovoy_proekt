package com.example.kursovoy_proekt;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);
        EditText editText = findViewById(R.id.edit1);
        EditText editText1 = findViewById(R.id.edit2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                try {
                    int size = Integer.parseInt(editText.getText().toString());
                    String[] elements = editText1.getText().toString().split(" ");
                    int[] array = new int[size];
                    for (int i = 0; i < elements.length; i++) {
                        array[i] = Integer.parseInt(elements[i]);
                    }
                    for (int i = 1; i < array.length; i++) {
                        int key = array[i];
                        int j = i - 1;
                        while (j >= 0 && array[j] > key) {
                            array[j + 1] = array[j];
                            j = j - 1;
                        }
                        array[j + 1] = key;
                    }
                    intent.putExtra("key", Arrays.toString(array));
                    startActivity(intent);

                }catch (Exception e) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Проверьте введенные данные!", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
