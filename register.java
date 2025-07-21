package com.example.myapplication;


import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {

    EditText name = findViewById(R.id.name);
    EditText email = findViewById(R.id.email);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        name.setOnKeyListener(new OnKeyListener() {
            @Override
            public boolean onKey(View v, int KeyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && KeyCode == KeyEvent.KEYCODE_ENTER) {
                    checkName();
                    return true;
                }
                return false;
            }
        });
        email.setOnKeyListener(new OnKeyListener() {
            @Override
            public boolean onKey(View v, int KeyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && KeyCode == KeyEvent.KEYCODE_ENTER) {
                    checkEmail();
                    return true;
                }
                return false;
            }
        });


    }


}
