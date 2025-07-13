package com.example.myapplication;

import android.accounts.Account;
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

    public void toggle(View v) {
        v.setEnabled(false);
        Button b = (Button) v; // type casting View into Button
        b.setText("Disabled");
        Log.d("e", "where is error"); // put where you want to find erro

    }


    public void check(View v) {
        EditText passField1 = (EditText) findViewById(R.id.Email);
        String username = String.valueOf(passField1);

        EditText passField2 = (EditText) findViewById(R.id.Password);
        String password = String.valueOf(passField1);

        Account a1 = new Account(username, password);

    }

}
