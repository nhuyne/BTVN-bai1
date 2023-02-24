package com.example.btb2_b1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
        TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textview);
        Intent intent = getIntent();
        String temp = intent.getStringExtra("username");
        temp=temp.replace("null","");
        String [] fntest=  temp.split("_");

        textView.setText("Thanks "+fntest[0].toString()+ " Register \n We will contact you soon by phone: "+fntest[1].toString());
    }
}