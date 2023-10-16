package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //
    private EditText editText;
    private TextView textView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView2);
        editText=findViewById(R.id.editTextText);
        //
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //
//                Toast.makeText(MainActivity.this, "Button Pressed", Toast.LENGTH_SHORT).show();
//
//                String s= editText.getText().toString();
//                int Kg=Integer.parseInt(s);
//                double pound=2.205*Kg;
//                textView.setText("The Value is "+pound);
//
//            }
//        });
    }

    public void calculate(View view){
        String s= editText.getText().toString();
        int Kg=Integer.parseInt(s);
        double pound=2.205*Kg;
        textView.setText("The Value is "+pound);
    }
}