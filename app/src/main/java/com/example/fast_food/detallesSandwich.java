package com.example.fast_food;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class detallesSandwich extends AppCompatActivity {
    LinearLayout contenedor;
    String nombre_sandwich, precio_sandwich, descripcion_sandwich;
    TextView nombreId_sand, precioID_sand, descripcionID_sand;
    Integer imagen_sandwich;
    ImageView imagensandwichID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        contenedor= (LinearLayout) findViewById(R.id.contenedor);
        Intent intent=getIntent();
        nombre_sandwich = intent.getStringExtra("nombre_sandwich");
        precio_sandwich= intent.getStringExtra("precio_sandwich");
        descripcion_sandwich= intent.getStringExtra("descripcion_sandwich");
        imagen_sandwich= intent.getIntExtra("imagen_sandwich",R.id.imagenSandwich);

        nombreId_sand= findViewById(R.id.nombreID_sandwich);
        precioID_sand= findViewById(R.id.precioID_sandwich);
        descripcionID_sand= findViewById(R.id.descripcionID_sandwich);
        imagensandwichID= findViewById(R.id.imagenSandwich);

        nombreId_sand.setText(nombre_sandwich);
        precioID_sand.setText("$"+precio_sandwich);
        descripcionID_sand.setText(descripcion_sandwich);
        imagensandwichID.setImageResource(imagen_sandwich);



    }
}
