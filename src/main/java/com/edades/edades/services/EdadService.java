package com.edades.edades.services;


import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class EdadService {

    public static String calcularEdad(String dia, String mes, String anio){
       return "Tu Edad es: " + Period.between(LocalDate.of(Integer.parseInt(anio),Integer.parseInt(mes),Integer.parseInt(dia)),LocalDate.now()).getYears();
           }
}
