package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.E1);
        btn_convert = findViewById(R.id.btn_convert);

        btn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convert();
            }
        });
    }

    public void convert(){
        String amountDirhams = editText.getText().toString();
        if(amountDirhams.equals("")){
            Toast.makeText(this, "Enter a valid number", Toast.LENGTH_SHORT).show();

        }else {
            Double amountDirhamsdouble = Double.parseDouble(amountDirhams);
            Double amountDollarDouble = amountDirhamsdouble * 0.097;
            String amountDollar = amountDollarDouble.toString();
            Toast.makeText(this, "Amount in USD:"+amountDollar, Toast.LENGTH_SHORT).show();

        }
    }
}