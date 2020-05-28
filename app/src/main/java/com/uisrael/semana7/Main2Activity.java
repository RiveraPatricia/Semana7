package com.uisrael.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ViewAnimator;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



    }

    public void Iniciar (View v) {

        Intent Abrir = new Intent(this, Main2Activity.class);

        Abrir.putExtra("dato1","checkbox");
        Abrir.putExtra("dato2","radiobutton");
        Abrir.putExtra("dato3","text");

        startActivity(Abrir);
    }

}

