package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView result;
    Button one,two,three,four,five,six,seven,eight,nine,zero,dot,equal,calcel,add,mul,sub,div,delete;
    boolean addition,substraction,multiplication,division,decimal = false;
    double input1,input2;
    int index;
    Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        dot = findViewById(R.id.dot);
        equal = findViewById(R.id.equal);
        calcel = findViewById(R.id.cancel);
        add = findViewById(R.id.add);
        mul = findViewById(R.id.mul);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        delete = findViewById(R.id.delete);
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);



        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                String dispalytext = result.getText().toString();
                int lenght = dispalytext.length();
                if(lenght>0){
                    dispalytext = dispalytext.substring(0,lenght-1);
                    result.setText(dispalytext);
                }
            }
        });

        calcel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                result.setText(null);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                result.append("0");

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                result.append("1");

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                result.append("9");

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                result.append("2");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                result.append("3");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                result.append("4");

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                result.append("5");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                result.append("6");

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                result.append("7");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                result.append("8");

            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                result.append(".");


            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                String content =result.getText().toString();
                 index = Integer.parseInt(String.valueOf(content.length()+1));
                input1 = Double.parseDouble(content);
                result.append("+");
                addition  = true;

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                String content =result.getText().toString();
                 index = Integer.parseInt(String.valueOf(content.length()+1));
                input1 = Double.parseDouble(content);
                result.append("-");
                substraction  = true;

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                String content =result.getText().toString();
                 index = Integer.parseInt(String.valueOf(content.length()+1));
                input1 = Double.parseDouble(content);
                result.append("*");
                multiplication  = true;

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                String content =result.getText().toString();
                 index = Integer.parseInt(String.valueOf(content.length()+1));
                input1 = Double.parseDouble(content);
                result.append("/");
                division  = true;

            }
        });



        equal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(addition==true){
                    String context = result.getText().toString();
                    input2 = Double.parseDouble(context.substring(index,context.length()));
                    result.setText(String.valueOf (input1+input2));
                    addition = false;
                }
                if(substraction==true){
                    String context = result.getText().toString();
                    input2 = Double.parseDouble(context.substring(index,context.length()));
                    result.setText(String.valueOf (input1-input2));
                    substraction = false;
                }
                if(multiplication==true){
                    String context = result.getText().toString();
                    input2 = Double.parseDouble(context.substring(index,context.length()));
                    result.setText(String.valueOf (input1*input2));
                    multiplication = false;
                }
                if(division==true){
                    String context = result.getText().toString();
                    input2 = Double.parseDouble(context.substring(index,context.length()));
                    String myresult = new DecimalFormat("##.####").format(input1/input2);
                    result.setText(myresult);
                    division = false;
                }

            }
        });







    }
}
