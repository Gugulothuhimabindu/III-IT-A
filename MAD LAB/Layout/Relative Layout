package com.example.rlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2,e3;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.text1);
        e2 = findViewById(R.id.text3);
        e3 = findViewById(R.id.text4);
        b = findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = e1.getText().toString();
                String s1 = e2.getText().toString();
                String s2 = e3.getText().toString();
                Toast.makeText(getApplicationContext(), "UserName : " + s + "\nAddress :" + s2 + "\nAge : " + s1, Toast.LENGTH_LONG).show();

            }
        });
    }
}
