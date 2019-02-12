package org.foobarspam.cotxox.tarifa;

import org.foobarspam.cotxox.carrera.Carrera;

public class Tarifa {
        private final double COSTEMILLA = 1.35;
        private final double COSTEMINUTO = 0.35;
        private final double COSTEMINIMO = 5.0;
        private final double PORCENTAJECOMISION = 0.2;

        public  double getCosteDistancia(double distancia){
            return COSTEMILLA * distancia;
        }


        public double getCosteTiempo(int tiempoEsperadoMinutos){
            return COSTEMINUTO * tiempoEsperadoMinutos;
        }

        //Recordamos que hay que poner la clase carrera pero para comprobar que la clase funciona ponemos distancia y tiempo.

        public double getCosteTotalEsperado(Carrera carrera){
            double total = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
            double comision = total * PORCENTAJECOMISION;
            if (total < COSTEMINIMO){
                return COSTEMINIMO;
            }else{
                return total + comision;
            }
        }
}
