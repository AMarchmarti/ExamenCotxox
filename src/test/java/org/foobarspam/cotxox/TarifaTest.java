package org.foobarspam.cotxox;

import org.foobarspam.cotxox.tarifa.Tarifa;
import org.junit.Assert;
import org.junit.Test;

public class TarifaTest {

    @Test
    public void getDistanciaTest(){
        Tarifa tarifa = new Tarifa();
        double distancia = 7.75;
        double distanci = 10.2;
        double delta = 0.01;
        Assert.assertEquals(10.4625, Tarifa.getCosteDistancia(distancia), delta);
        Assert.assertEquals(13.77, Tarifa.getCosteDistancia(distanci), delta);
    }


    @Test
    public void getTiempoTest(){
        Tarifa tarifa = new Tarifa();
        int tiempo = 10;
        int temps = 15;
        double delta = 0.01;
        Assert.assertEquals(3.5, Tarifa.getCosteTiempo(tiempo), delta);
        Assert.assertEquals(5.25, Tarifa.getCosteTiempo(temps), delta);
    }

    @Test
    public void getTotal(){
        Tarifa tarifa = new Tarifa();
        double distancia = 7.75;
        int tiempo = 10;
        double delta = 0.01;
        double distanci = 2;
        int temp = 5;
        Assert.assertEquals(16.755, Tarifa.getCosteTotalEsperado(distancia,tiempo), delta);
        Assert.assertEquals(5, Tarifa.getCosteTotalEsperado(distanci,temp), delta);
    }
}
