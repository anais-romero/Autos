package com.example.autos;
import java.time.LocalDate;

public class MyClass {
    private String marca, modelo;
    private Integer anio;

    public MyClass(String mar, String mod, Integer an){
        this.anio = an;
        this.marca = mar;
        this.modelo = mod;
    }

    public MyClass(){
        this.marca = "VW";
        this.modelo = "Sedan";
        this.anio = 1968;
    }

    @Override
    public String toString() {
        String cadena =  "\nMarca: "+ this.marca + "\nModelo: " + this.modelo + "\nAño: " + this.anio;
        return cadena;
    }

    public Boolean isPreowned(){
        LocalDate date = LocalDate.now();
        Integer anio = date.getYear();
        if (this.anio<anio){
            return Boolean.TRUE;
        }
        else {
            return Boolean.FALSE;
        }
    }
}