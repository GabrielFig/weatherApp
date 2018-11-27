package com.example.tec.myapplication.forecastModels;

public class headerForecast {
    private String fecha,icono,temperatura,pronostico,probabLluvia;

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public String getIcono() {
        return icono;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public String getPronostico() {
        return pronostico;
    }

    public String getProbabLluvia() {
        return probabLluvia;
    }

    public headerForecast(String fecha, String icono, String temperatura, String pronostico, String probabLluvia) {
        this.fecha = fecha;
        this.icono = icono;
        this.temperatura = temperatura;
        this.pronostico = pronostico;
        this.probabLluvia = probabLluvia;
    }

    public headerForecast() {
    }

}
