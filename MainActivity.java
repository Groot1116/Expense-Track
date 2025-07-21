package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.util.Log; // to test where error is like println or cout
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    public void button(View v) {
        if (R.id.login == v.getId()) {
            Intent login = new Intent(MainActivity.this, login.class);
            startActivity(login);
        }
        else {
            Intent register = new Intent(MainActivity.this, login.class);
            startActivity(register);
        }


    }





    public void toggle1(View v) {
        v.setEnabled(false);
        Button b = (Button) v; // type casting View into Button
        b.setText("Disabled");
        Log.d("e", "where is error"); // put where you want to find erro
    }




}
