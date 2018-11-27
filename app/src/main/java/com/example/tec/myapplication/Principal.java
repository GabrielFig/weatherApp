package com.example.tec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Principal extends AppCompatActivity {
    public final String DarkSkyApiKey = e1a47f79f9e9e49d1eabb98929bf5a08;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ForecastConfiguration configuration =
                new ForecastConfiguration.Builder(DarkSkyApiKey)
                .setDefaultLanguage(Lenguage.SPANISH)
                .setDefaultUnit(Unit.)
    }
}
