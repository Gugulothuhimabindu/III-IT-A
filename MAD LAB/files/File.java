package com.example.savefile;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    TextView tv;
    EditText ed1;
    EditText pwd;
    String uname_;
    String pwd_;
    private String file = "C:\\Users\\harik\\Desktop\\Files.txt";
    String data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        ed1=(EditText)findViewById(R.id.editText);
        pwd=(EditText)findViewById(R.id.pwd);
        tv=(TextView)findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //data=ed1.getText().toString();
                try {
                    FileOutputStream fOut = openFileOutput(file,MODE_PRIVATE);
                    data = "user1 123\nuser2 345\nuser3 456\n";
                    fOut.write(data.getBytes());
                    fOut.close();
                    Toast.makeText(getBaseContext(),"file saved" + getFileStreamPath(file),Toast.LENGTH_SHORT).show();
                }
                catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("Input to load");
                uname_ = ed1.getText().toString();
                pwd_ = pwd.getText().toString();
                try {
                    System.out.println("Before File open");
                    FileInputStream fin = openFileInput(file);
                    System.out.println("After File open");
                    int c;
                    String temp="";
                    while((c = fin.read()) != -1){
                        temp = temp + Character.toString((char)c);
                    }
                    String file_read[] = temp.split("\n");
                    boolean isFound = false;
                    for(String record : file_read) {
                        String uname_pwd[] = record.split(" ");
                        if(uname_pwd[0].equalsIgnoreCase(uname_) && uname_pwd[1].equals(pwd_)) {
                            isFound = true;
                        }
                    }
                    Toast.makeText(getBaseContext(),"" + isFound ,Toast.LENGTH_SHORT).show();
                    if(isFound) {
                        tv.setText("You have Logged in");
                    } else {
                        tv.setText("Invalid credentials");
                    }

                    Toast.makeText(getBaseContext(),"file read",Toast.LENGTH_SHORT).show();
                }
                catch(Exception e){
                }
            }
        });
    }
}
