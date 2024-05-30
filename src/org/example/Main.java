package org.example;

import procesadores.procesadores;
import procesadores.procesadores_amd;
import procesadores.procesadores_moviles;

public class Main {
    public static void main(String[] args) {
        //Integrante1
        procesadores_amd proc_1 = new procesadores_amd();
        procesadores_amd proc_2 = new procesadores_amd(4,1.5,7.5, "Ryzen5","AM4",true);
        //Integrante2
        procesadores_moviles proc_3 = new procesadores_moviles();
        procesadores_moviles proc_4 = new procesadores_moviles(3,3.4,5.7,"Raiser08",true);
    }
}