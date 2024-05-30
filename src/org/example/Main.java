package org.example;

import procesadores.procesadores;
import procesadores.procesadores_amd;
import procesadores.procesadores_moviles;
import procesadores.procesadores_intel;


public class Main {
    public static void main(String[] args) {
        //Integrante1
        procesadores_amd proc_1 = new procesadores_amd();
        procesadores_amd proc_2 = new procesadores_amd(4,1.5,7.5, "Ryzen5","AM4",true);
        //Integrante2
        procesadores_moviles proc_3 = new procesadores_moviles();
        procesadores_moviles proc_4 = new procesadores_moviles(3,3.4,5.7,"Raiser08",true);


        //Alisson por favor crear dos instancias de amd con valores
        procesadores_amd proc_5 = new procesadores_amd(2,2.5,5, "Ryzen7","AM2",false);
        procesadores_amd proc_6 = new procesadores_amd(3,3.5,7, "Ryzen3","AM3",true);


        //Mireya por favor crear dos instacias de intel con valores
        procesadores_intel pro_1 = new procesadores_intel(5,5.5,8, "Corei5","LGA1156",true);
        procesadores_intel pro_2 = new procesadores_intel(4,3.5,8, "Corei6","LGA1157",true);


        //Trabajo colaborativo
        //Paul Cabrera Integrante1 Grupo1
        procesadores_moviles pro1= new procesadores_moviles(16,3.0,95,"Helio 895",true);
        procesadores_amd pro2= new procesadores_amd(8,7.5,75, "Ryzen5","AM5",true);
        procesadores pro3 = new procesadores(4,3.5,10, "Intel Pentioum");
        //Adrian Cadena Integrante2 Grupo1
        procesadores_moviles pro4=new procesadores_moviles(6,3.78,96,"Apple 17 pro",true);
        procesadores_amd pro5= new procesadores_amd(6,3.7,75, "Ryzen5 4600","AM4",true);
        procesadores pro6 = new procesadores(2,800 ,65, "Intel Core 2 duo");

        //Elkin Diaz Integrante1 Grupo2

        //Santiago Cumbal Integrante2 Grupo2

        //Mireya García Integrante1 Grupo3

        //Alissom   Integrante1 Grupo3


    }
}