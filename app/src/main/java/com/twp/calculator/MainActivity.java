package com.twp.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button one = findViewById(R.id.one);
        StringBuffer txt = new StringBuffer();
        Button multiple = findViewById(R.id.multiply);
        Button minus = findViewById(R.id.minus);
        Button add = findViewById(R.id.add);
        Button divide = findViewById(R.id.divide);
        Button percent = findViewById(R.id.percent);
        Button calculate = findViewById(R.id.calculate);
        Button cancel = findViewById(R.id.clear);
        ImageButton back_space = findViewById(R.id.backspace);
        List<String> art = new ArrayList<String>();
        TextView total = findViewById(R.id.total);
        final String x = null;
        art.add("+");
        art.add("-");
        art.add("÷");
        art.add("%");
        art.add("X");


        TextView numbers = findViewById(R.id.numbers);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("1");
                numbers.setText(txt.toString());

            }
        });
        Button two = findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("2");
                numbers.setText(txt.toString());

            }
        });
        Button three = findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("3");
                numbers.setText(txt.toString());

            }
        });
        Button four = findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("4");
                numbers.setText(txt.toString());

            }
        });
        Button five = findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("5");
                numbers.setText(txt.toString());

            }
        });
        Button six = findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("6");
                numbers.setText(txt.toString());

            }
        });
        Button seven = findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("7");
                numbers.setText(txt.toString());

            }
        });
        Button eight = findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("8");
                numbers.setText(txt.toString());

            }
        });
        Button nine = findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("9");
                numbers.setText(txt.toString());

            }
        });
        Button zero = findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("0");
                numbers.setText(txt.toString());

            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("X");
                numbers.setText(txt.toString());

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("+");
                numbers.setText(txt.toString());

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("-");
                numbers.setText(txt.toString());

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("÷");
                numbers.setText(txt.toString());

            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("%");
                numbers.setText(txt.toString());

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.delete(0, numbers.length());
                numbers.setText(txt.toString());

            }
        });
        back_space.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt.length() > 0) {
                    txt.deleteCharAt(txt.length() - 1);
                    numbers.setText(txt.toString());
                }


            }
        });
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                for (int i = 0; i < numbers.length(); i++) {

                    if (txt.charAt(i) == '+') {
                        String[] n = txt.toString().split("\\+");
                        int o = Integer.parseInt(String.valueOf(n[0]));
                        int t = Integer.parseInt(String.valueOf(n[1]));
                        int to = o + t;
                        total.setText(String.valueOf(to));

                    }else if (txt.charAt(i) == '-'){
                        String[] n = txt.toString().split("-");
                        int o = Integer.parseInt(String.valueOf(n[0]));
                        int t = Integer.parseInt(String.valueOf(n[1]));
                        int to = o - t;
                        total.setText(String.valueOf(to));
                    }else if (txt.charAt(i) == '÷'){
                        String[] n = txt.toString().split("÷");
                        int o = Integer.parseInt(String.valueOf(n[0]));
                        int t = Integer.parseInt(String.valueOf(n[1]));
                        int to = o / t;
                        total.setText(String.valueOf(to));
                    }
                    else if (txt.charAt(i) == 'X'){
                        String[] n = txt.toString().split("X");
                        int o = Integer.parseInt(String.valueOf(n[0]));
                        int t = Integer.parseInt(String.valueOf(n[1]));
                        int to = o * t;
                        total.setText(String.valueOf(to));
                    }
                }

            }
        });


    }
}