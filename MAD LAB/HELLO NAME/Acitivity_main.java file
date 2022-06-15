package com.example.helloname;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText name;
    Button Add_button;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.editText);
        Add_button = (Button) findViewById(R.id.add_button);
        tv = (TextView) findViewById(R.id.textView_answer);
        Add_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String Name = name.getText().toString();
                tv.setText("Hello "+Name);
            }
        });
    }
}
