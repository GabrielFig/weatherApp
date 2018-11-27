package com.example.tec.myapplication.forecastModels;

public class elementForecast {
    String dia,icono,tempMaxMin,pronostico,probLluvia;

    public elementForecast() {
    }

    public elementForecast(String dia, String icono, String tempMaxMin, String pronostico, String probLluvia) {
        this.dia = dia;
        this.icono = icono;
        this.tempMaxMin = tempMaxMin;
        this.pronostico = pronostico;
        this.probLluvia = probLluvia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getTempMaxMin() {
        return tempMaxMin;
    }

    public void setTempMaxMin(String tempMaxMin) {
        this.tempMaxMin = tempMaxMin;
    }

    public String getPronostico() {
        return pronostico;
    }

    public void setPronostico(String pronostico) {
        this.pronostico = pronostico;
    }

    public String getProbLluvia() {
        return probLluvia;
    }

    public void setProbLluvia(String probLluvia) {
        this.probLluvia = probLluvia;
    }
}
