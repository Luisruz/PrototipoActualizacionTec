package com.example.prototipo_actualizacion_tec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.Principal;

public class MainActivity extends AppCompatActivity {
private Button btnContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnContacto= findViewById(R.id.buttonContacto);
        btnContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambio = new  Intent(MainActivity.this, Contactanos.class);
                startActivity(cambio);
            }
        });
    }
}
