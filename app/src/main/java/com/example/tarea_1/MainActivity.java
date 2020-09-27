package com.example.tarea_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    private Spinner spinner;
    public EditText Name;
    public EditText LastName;
    public EditText editTextDate;
    public RadioButton radioButton3;
    public RadioButton radioButton4;
    public CheckBox checkBox;
    public CheckBox checkBox2;
    public CheckBox checkBox3;
    public CheckBox checkBox4;
    public CheckBox checkBox5;
    public CheckBox checkBox6;

    private static final String[]paths = {"Seleccionar", "Masculino", "Femenino", "Otro"};

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        Name = (EditText) findViewById(R.id.editTextTextPersonName);
        LastName = (EditText) findViewById(R.id.editTextTextPersonName2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) findViewById(R.id.radioButton4);
        checkBox =  (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        editTextDate = (EditText) findViewById(R.id.editTextDate);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        Name.getText().clear();
        LastName.getText().clear();
        editTextDate.getText().clear();
        spinner.setSelection(0);
        radioButton3.setChecked(true);
        checkBox.setChecked(false);
        checkBox2.setChecked(false);
        checkBox3.setChecked(false);
        checkBox4.setChecked(false);
        checkBox5.setChecked(false);
        checkBox6.setChecked(false);

    }


    public void SendInfo(View view) {
        String FullName = Name.getText().toString();
        String Apellido = LastName.getText().toString();
        String Genero = spinner.getSelectedItem().toString();
        String ck1 = "";
        String ck2 = "";
        String ck3 = "";
        String ck4 = "";
        String ck5 = "";
        String ck6 = "";
        String LikeY = radioButton3.getText().toString();
        String LikeN = radioButton4.getText().toString();
        String Date = editTextDate.getText().toString();
        if(checkBox.isChecked()) {  ck1 = checkBox.getText().toString();}
        if(checkBox2.isChecked()){  ck2 = checkBox2.getText().toString();}
        if(checkBox3.isChecked()){  ck3 = checkBox3.getText().toString();}
        if(checkBox4.isChecked()){  ck4 = checkBox4.getText().toString();}
        if(checkBox5.isChecked()){  ck5 = checkBox5.getText().toString();}
        if(checkBox6.isChecked()){  ck6 = checkBox6.getText().toString();}
        Intent intent = new Intent(MainActivity.this , MainActivity2.class);
        intent.putExtra( "Full_Name", FullName);
        intent.putExtra( "Last_Name", Apellido);
        intent.putExtra( "Genero", Genero);
        intent.putExtra( "Date", Date);
        if(ck1 != ""){ intent.putExtra( "ck1", ck1);}
        if(ck2 != ""){ intent.putExtra( "ck2", ck2);}
        if(ck3 != "") { intent.putExtra( "ck3", ck3);}
        if(ck4 != "") { intent.putExtra( "ck4", ck4);}
        if(ck5 != "") { intent.putExtra( "ck5", ck5);}
        if(ck6 != "") { intent.putExtra( "ck6", ck6);}
        if(radioButton3.isChecked()){
            intent.putExtra( "LikeY", LikeY);
        }else{
            intent.putExtra( "LikeN", LikeN);
        }
        startActivity(intent);
    }
}