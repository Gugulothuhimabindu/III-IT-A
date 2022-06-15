package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.myapplication.R;
public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    Button Add_button;
    TextView result;
    int ans=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=(EditText) findViewById(R.id.editText_first_no);
        number2=(EditText) findViewById(R.id.editText_second_no);
        Add_button=(Button) findViewById(R.id.add_button);
        result = (TextView) findViewById(R.id.editview_answer);
        Add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 =
                        Double.parseDouble(number1.getText().toString());
                double num2 =
                        Double.parseDouble(number2.getText().toString());
                double sum = num1 + num2;
                result.setText(Double.toString(sum));
            }
        });
    }
}
