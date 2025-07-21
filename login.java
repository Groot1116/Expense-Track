package com.example.myapplication;

import android.accounts.Account;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    EditText username = findViewById(R.id.username);
    EditText password = findViewById(R.id.password);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);



        username.setOnKeyListener(new OnKeyListener() {
            @Override
            public boolean onKey(View v, int KeyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && KeyCode == KeyEvent.KEYCODE_ENTER) {
                    checkName();
                    return true;
                }
                return false;
            }
        });
        password.setOnKeyListener(new OnKeyListener() {
            @Override
            public boolean onKey(View v, int KeyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && KeyCode == KeyEvent.KEYCODE_ENTER) {
                    checkName();
                    return true;
                }
                return false;
            }
        });
        String passField1 = String.valueOf(username);
        String passField2 = String.valueOf(password);

        Account a1 = new Account(passField1, passField2);
    }


}
