package com.example.midterm07590476;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginbuttom =findViewById(R.id.Login);

        loginbuttom.setOnClickListener(new View.OnClickListener() {
            Toast t=Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT);

            @Override
            public void onClick(View view) {
                EditText eamieditText=findViewById(R.id.email_edit);
                EditText paswordeditText=findViewById(R.id.password_edit);


                String inputemail=eamieditText.getText().toString();
                String inputpasword=paswordeditText.getText().toString();
    }
}
