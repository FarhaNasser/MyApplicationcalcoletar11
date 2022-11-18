package com.example.myapplicationcalcoletar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Num1 = findViewById(R.id.sum1);
        EditText Num2 = findViewById(R.id.sum2);

        Button sum =findViewById(R.id.sum);
        Button sub =findViewById(R.id.sub);
        Button mult =findViewById(R.id.mult);
        Button div =findViewById(R.id.div);

        TextView result = findViewById(R.id.Result);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Numper1 = Integer.parseInt(Num1.getText().toString().trim()) ;
                int Numper2 = Integer.parseInt(Num2.getText().toString().trim()) ;
                int res = Numper1 + Numper2 ;
                result.setText("result is " + res);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int Numper1 = Integer.parseInt(Num1.getText().toString().trim()) ;
                        int Numper2 = Integer.parseInt(Num2.getText().toString().trim()) ;
                        int res = Numper1 - Numper2 ;
                        result.setText("result is " + res);

                    }
                });
                mult.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int Numper1 = Integer.parseInt(Num1.getText().toString().trim()) ;
                        int Numper2 = Integer.parseInt(Num2.getText().toString().trim()) ;
                        int res = Numper1 * Numper2 ;
                        result.setText("result is " + res);

        }
           });
           div.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                int Numper1 = Integer.parseInt(Num1.getText().toString().trim()) ;
               int Numper2 = Integer.parseInt(Num2.getText().toString().trim()) ;
                int res = Numper1 / Numper2 ;
                result.setText("result is " + res);
               }


           });
    }
}