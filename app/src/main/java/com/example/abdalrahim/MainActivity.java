package com.example.abdalrahim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edt1;
    private EditText edt2;
    private EditText edt3;
    private EditText edt4;
    private RadioGroup rg;
    private RadioButton radioButton;

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupViews();
    }

    private void setupViews(){
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.txt1);
        edt2 = findViewById(R.id.txt2);
        edt3 = findViewById(R.id.txt3);
        edt4 = findViewById(R.id.txt4);
        rg= (RadioGroup) findViewById(R.id.radioGroup);
        spinner = findViewById(R.id.spinner);
    }

    public void registerBtn_onclick(View view) {



        String str = spinner.getSelectedItem().toString();

        Toast.makeText(this,"abd",Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, MainActivity2.class);
        String data1 = edt1.getText().toString();
        String data2 = edt2.getText().toString();
        String data3 = edt3.getText().toString();
        String data4 = edt4.getText().toString();

        int checked = rg.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(checked);
        String gender = (String) radioButton.getText();



        intent.putExtra("EDT1",data1);
        intent.putExtra("EDT2",data2);
        intent.putExtra("EDT3",data3);
        intent.putExtra("EDT4",data4);
        intent.putExtra("Gender",gender);
        intent.putExtra("spinner",str);
        startActivity(intent);

    }
}