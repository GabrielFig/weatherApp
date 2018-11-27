package com.example.tec.myapplication;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.zetterstrom.com.forecast.ForecastClient;
import android.zetterstrom.com.forecast.ForecastConfiguration;
import android.zetterstrom.com.forecast.models.Forecast;
import android.zetterstrom.com.forecast.models.Language;
import android.zetterstrom.com.forecast.models.Unit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Principal extends AppCompatActivity {
    //private static final Object Language = ;
    public final String DarkSkyApiKey = "e1a47f79f9e9e49d1eabb98929bf5a08";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ForecastConfiguration configuration =
                new ForecastConfiguration.Builder(DarkSkyApiKey)
                        //.setDefaultLanguage(Language.)
                        .setDefaultUnit(Unit.SI)
                        .setCacheDirectory(getCacheDir())
                        .build();

        ForecastClient.create(configuration);
        ObtenerClima();


        }

    public void ObtenerClima() {
        ForecastClient.getInstance()
                .getForecast(25.790466, -108.985886, new Callback<Forecast>() {
                    @Override
                    public void onResponse(Call<Forecast> forecastCall, Response<Forecast> response) {
                        if (response.isSuccessful()) {
                            Forecast forecast = response.body();
                            Log.d("_____clima______", "onResponse: "+forecast);
                            /*lisaclima   = Utils.pronosticoPorHoras(forecast,getApplicationContext());
                            AdaptadorClima adaptadorClima = new AdaptadorClima(getApplicationContext(), lisaclima);
                            lv.setAdapter(adaptadorClima);*/
                        }
                    }
                    @Override
                    public void onFailure(Call<Forecast> forecastCall, Throwable t) {
                        Toast.makeText(getApplicationContext(), "Error de forecast: "+t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

    }

}