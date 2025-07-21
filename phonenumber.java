package com.example.myapplication;


import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class phonenumber extends AppCompatActivity {

    EditText phonenumber = findViewById(R.id.phonenumber);;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phonenumber);


        phonenumber.setOnKeyListener(new OnKeyListener() {
            @Override
            public boolean onKey(View v, int KeyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && KeyCode == KeyEvent.KEYCODE_ENTER) {
                    checkPhone();
                    return true;
                }
                return false;
            }
        });

    }


}

