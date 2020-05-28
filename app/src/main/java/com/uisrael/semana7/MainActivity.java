package com.uisrael.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usu, cla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        usu = findViewById(R.id.etUsuario);
        cla = findViewById(R.id.etClave);

    }
    public void Iniciar (View v) {

        String usuario = usu.getText().toString();
        String clave = cla.getText().toString();

        if (usuario.equals("estudiante") && clave.equals("uisrael2020")){

            Intent Abrir = new Intent(this, Main2Activity.class);
            startActivity(Abrir);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Acceso denegado", Toast.LENGTH_LONG).show();
        }

    }
}
