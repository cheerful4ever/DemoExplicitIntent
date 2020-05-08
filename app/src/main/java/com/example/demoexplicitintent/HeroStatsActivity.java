package com.example.demoexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class HeroStatsActivity extends AppCompatActivity {

    TextView tvName, tvStrength, tvTechnicalProwess;
    Button btnLike, btnDislike;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_stats);

        // Get the intent
        Intent i = getIntent();
        // Get the Hero object first activity put in Intent
        Hero hero = (Hero) i.getSerializableExtra("hero");

        tvName = (TextView) findViewById(R.id.textViewName);
        tvStrength = (TextView)findViewById(R.id.textViewStrength);
        tvTechnicalProwess = (TextView) 							findViewById(R.id.textViewTechnicalProwess);

        // Use getters of Hero object to get the attributes
        tvName.setText(hero.getName());
        tvStrength.setText("Strength: " + hero.getStrength());
        tvTechnicalProwess.setText("Technical: " +
                hero.getTechnicalProwess());

    }
}
