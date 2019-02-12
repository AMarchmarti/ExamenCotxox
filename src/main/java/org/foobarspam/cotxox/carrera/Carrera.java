package org.foobarspam.cotxox.carrera;

import org.foobarspam.cotxox.tarifa.Tarifa;

public class Carrera {

    private int tiempoEsperadoMinutos = 0;
    private int tiempoCarreraMinutos = 0;
    private double costeTotal = 0;
    // private Conductor conductor = null;
    private double distancia = 0;
    private String origen = null;
    private String destino = null;
    private String tarjetaCredito = null;


    public Carrera(String tarjetaCredito){
        this.tarjetaCredito = tarjetaCredito;
    }
    /*-------------------Setters--------------------------------------------*/
    public void setOrigen(String origen){
        this.origen = origen;
    }


    public void setDestino(String destino){
        this.destino = destino;
    }


    public void setDistancia(double distancia){
        this.distancia = distancia;
    }


    public void setTiempoEsperado(int tiempo){
        this.tiempoEsperadoMinutos = tiempo;
    }


    /*--------------------------------Getters----------------------------------------*/

    public String getOrigen(){
        return this.origen;
    }


    public String getDestino(){
        return this.destino;
    }


    public Double getDistancia(){
        return this.distancia;
    }


    public Integer getTiempoEsperado(){
        return this.tiempoEsperadoMinutos;
    }

    public String getTarjetaCredito(){
        return this.tarjetaCredito;
    }

    public Double getCosteEsperado(){
        return Tarifa.getCosteTotalEsperado(this);
    }
}
