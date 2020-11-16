package com.tallercmovil.appcm1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LOGTAG = "INFORMATION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvSaludo;
        Button btnSaludar;

        int a = 5;
        int b = 10;

        Log.i(LOGTAG, "Hola mundo!");
        //Mensajes que se ven en consola de ayuda para depurar
        Log.i(LOGTAG, "El valor de a es: " + a);
        Log.i(LOGTAG, "El valor de b es: " + b);
        Log.i(LOGTAG, "El valor de a + b es: " + (a+b));

        //Ligamos los atributos con el activity main
        tvSaludo = findViewById(R.id.tvSaludo);
        btnSaludar = findViewById(R.id.btnSaludar);

        //tvSaludo.setText("Cómputo móvil");  //haciendo hard coding
        //tvSaludo.setText(getResources().getString(R.string.app_name)); //sin hard coding

        btnSaludar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                tvSaludo.setText("Hola Amaury");
            }
        });

        tvSaludo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                tvSaludo.setText("Hola mundo!");
            }
        });


    }
}