package net.wawczak.brian.noassemblyrequired;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


ImageButton bicycle;
    ImageButton dresser;
    ImageButton patio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bicycle = findViewById(R.id.idBikeBtn);
        dresser = findViewById(R.id.idDresserBtn);
        patio = findViewById(R.id.idPatioButton);

        bicycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BikeTools.class);
                startActivity(intent);

            }
        });

        dresser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DresserTools.class);
                startActivity(intent);


            }
        });

        patio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PatioTools.class);
                startActivity(intent);
            }
        });
    }
}
