package com.example.fast_food;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class segundo_sandwiches  extends AppCompatActivity {
    LinearLayout contenedor;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwiches);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        contenedor= (LinearLayout) findViewById(R.id.contenedor);
        final ArrayList<sandwich> listasandwich= new ArrayList<sandwich>();
        listasandwich.add(new sandwich(1,"ITALIANO", R.drawable.mechado,"4500","El mejor sandwich italiano 100% ingredientes naturales"));
        listasandwich.add(new sandwich(2,"CHACARERO",R.drawable.chacarero,"4000","El sandwich mas sabroso de su estilo que encontraras"));
        listasandwich.add(new sandwich(3,"BARROS LUCO",R.drawable.barrosluco,"4000","El barros luco que necesitas probar si o si en tu vida"));
        listasandwich.add(new sandwich(4,"BARROS JARPA",R.drawable.barrosjarpa,"3500", "Un barros jarpa que te hara olvidar los demas sabores"));
        listasandwich.add(new sandwich(5,"MECHADO",R.drawable.mechado, "5000","La mechada mas deliciosa y jugosa que encontraras en tu vida"));

        for (sandwich c:listasandwich){
            Button btn= new Button(getApplication());
            btn.setText(c.nombre);
            btn.setId(c.cod);
            btn.setTextColor(Color.BLACK);
            btn.setTextSize(30);
            contenedor.addView(btn);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String nombre_sandwich=listasandwich.get(v.getId()).nombre;
                    String precio_sandwich=listasandwich.get(v.getId()).precio;
                    String descripcion_sandwich=listasandwich.get(v.getId()).descripcion;
                    int imagen_sandwich=listasandwich.get(v.getId()).idImagen;

                    Intent intent= new Intent(v.getContext(), detallesSandwich.class);
                    intent.putExtra("nombre_sandwich",nombre_sandwich);
                    intent.putExtra("precio_sandwich", precio_sandwich);
                    intent.putExtra("descripcion_sandwich", descripcion_sandwich);
                    intent.putExtra("imagen_sandwich", imagen_sandwich);

                    startActivityForResult(intent,0);
                }
            });
        }
    }

    // Modelo sandwich con los paremetros de cada sandwich
   private static class sandwich{
        private int cod;
        private String nombre;
        private int idImagen;
        private String precio;
        private String descripcion;

        public sandwich(int cod, String nombre, int idImagen, String precio, String descripcion) {
        this.cod = cod;
        this.nombre= nombre;
        this.idImagen= idImagen;
        this.precio= precio;
        this.descripcion= descripcion;
        }
}

}
