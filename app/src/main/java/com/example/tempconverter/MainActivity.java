package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC;
    Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);

        btnConvert = findViewById(R.id.btnConvert);
        btnConvert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String f = txtF.getText().toString();
                Log.i("Info", "String of txtF = " + f);

                double valF = Double.parseDouble(f);
                double valC = (valF - 32) * 5/9;

                String c = Double.toString(valC);

                Log.i("Info", "String of textC = " + c);
                txtC.setText(c);
            }
        });
    }
}
