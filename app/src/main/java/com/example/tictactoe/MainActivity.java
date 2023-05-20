package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,btn10;
    TextView t1;
    int count = 0, flag = 0;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;

    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10=(Button)findViewById(R.id.reset);
        t1=(TextView)findViewById(R.id.textView);
        t1.setText("chance of player x");
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button bnt10= (Button) v;
                newgame();


            }
        });

    }


    public void check(View view) {
        Button btncurrent = (Button) view;
        if (btncurrent.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                t1.setText("chance of player 0");
                btncurrent.setText("x");
                flag = 1;
            } else {
                t1.setText("chance of player x");
                btncurrent.setText("O");
                flag = 0;
            }
            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(this, "winner is" + b1, Toast.LENGTH_SHORT).show();

                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "winner is" + b4, Toast.LENGTH_SHORT).show();

                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this, "winner is" + b7, Toast.LENGTH_SHORT).show();

                } else if (b1.equals(b4) && b4.equals(b7) && !b4.equals("")) {
                    Toast.makeText(this, "winner is" + b1, Toast.LENGTH_SHORT).show();

                } else if (b2.equals(b5) && b5.equals(b8) && !b8.equals("")) {
                    Toast.makeText(this, "winner is" + b2, Toast.LENGTH_SHORT).show();

                } else if (b3.equals(b6) && b6.equals(b9) && !b9.equals("")) {
                    Toast.makeText(this, "winner is" + b3, Toast.LENGTH_SHORT).show();

                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    Toast.makeText(this, "winner is" + b1, Toast.LENGTH_SHORT).show();

                } else if (b3.equals(b5) && b5.equals(b7) && !b7.equals("")) {
                    Toast.makeText(this, "winner is" + b3, Toast.LENGTH_SHORT).show();

                } else if (count>8) {
                    Toast.makeText(this,"Game is drawn",Toast.LENGTH_LONG).show();

                }


            }
        }

        }public void newgame()
        {
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
            t1.setText("chance of player x");
            count=0;flag=0;
        }

    }
