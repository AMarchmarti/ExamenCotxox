package org.foobarspam.cotxox;

import org.foobarspam.cotxox.conductores.Conductores;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ConductoresTest {

        @Test
        public void getNombreTest(){
            String nombre = "Carlos";
            Conductores conductor = new Conductores(nombre);
            Assert.assertEquals("Carlos0", conductor.getNombre());
        }


        @Test
        public void getCocheTest(){
            String nombre = "Carlos";
            Conductores conductor = new Conductores(nombre);
            String matricula = "8750JNZ";
            conductor.setMatricula(matricula);
            String modelo = "Hyundai i20";
            conductor.setModelo(modelo);
            Assert.assertEquals("8750JNZ", conductor.getMatricula());
            Assert.assertEquals("Hyundai i20", conductor.getModelo());
        }


        @Test
        public void isOcupadoTest(){
            String nombre = "Carlos";
            Conductores conductor = new Conductores(nombre);
            conductor.setOcupado(true);
            Assert.assertEquals(true, conductor.isOcupado());
        }


        @Test
        public void valoracionMediaTest(){
            String nombre = "Carlos";
            Conductores conductor = new Conductores(nombre);
            ArrayList<Double> media = new ArrayList<>();
            for (double i = 0; i < 5; i++){
                conductor.setValoracion(i + 1);
            }
            double delta = 0.01;
            Assert.assertEquals(3,conductor.getValoracion(), delta);
        }


}
