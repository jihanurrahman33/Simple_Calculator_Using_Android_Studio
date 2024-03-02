package com.nishak.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText txt1,txt2;
    private Button add,sub;
    private TextView disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=(EditText) findViewById(R.id.num1);
        txt2=(EditText) findViewById(R.id.num2);
        add=(Button) findViewById(R.id.btn1);
        sub=(Button) findViewById(R.id.btn2);
        disp=(TextView) findViewById(R.id.result);


        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        disp.setOnClickListener(this);

    }




    @Override
    public void onClick(View v) {
        String numb1=txt1.getText().toString();
        String Numb2=txt2.getText().toString();
        Double number1=Double.parseDouble(numb1);
        Double number2=Double.parseDouble(Numb2);
        if (v.getId()==R.id.btn1){
            double sum=number1+number2;
            disp.setText("Result: "+ sum);

        }
        else if (v.getId()==R.id.btn2){
            double subs=number1-number2;
            disp.setText("Result: "+ subs);
        }
    }
}