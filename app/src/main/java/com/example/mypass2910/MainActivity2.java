package com.example.mypass2910;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView name,surname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.text_name);
        surname=findViewById(R.id.text_surname);

        String username=getIntent().getStringExtra("keyname");
        String usersurname=getIntent().getStringExtra("keysurname");
        name.setText(username);
        name.setText(usersurname);
    }
}