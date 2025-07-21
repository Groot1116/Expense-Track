package com.example.myapplication;


import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class birth extends AppCompatActivity {

    EditText birth = findViewById(R.id.birth);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.birth);

        birth.setOnKeyListener(new OnKeyListener() {
            @Override
            public boolean onKey(View v, int KeyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && KeyCode == KeyEvent.KEYCODE_ENTER) {
                    checkBirth();
                    return true;
                }
                return false;
            }
        });

    }


}
