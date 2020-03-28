package com.example.fast_food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_sandw= (Button) findViewById(R.id.btn_sandwich);
        btn_sandw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(), segundo_sandwiches.class);
                startActivity(i);
            }
        });
        Button btn_nosotr= (Button) findViewById(R.id.btn_nosotros);
        btn_nosotr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(), tercero_nosotros.class);
                startActivity(i);
            }
        });
    }
}
