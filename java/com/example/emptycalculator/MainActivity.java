package com.example.emptycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSumClick(View view){
        try {
            EditText firstSlag = findViewById(R.id.editTextNumber);
            EditText secondSlag = findViewById(R.id.editTextNumber2);
            String result = String.valueOf(Integer.parseInt(String.valueOf(firstSlag.getText())) +
                    Integer.parseInt(String.valueOf(secondSlag.getText())));
            Intent intentInfo = new Intent(MainActivity.this, Second_Activity.class);
            intentInfo.putExtra("choice", result);
            startActivity(intentInfo);
        } catch (Exception e){
            Toast.makeText(this, "Вы ввели неверные данные", Toast.LENGTH_LONG).show();
        }

    }
}