package com.ejercicio.EjercicioControlador;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServiceP {
    /*////////EJERCICIO1//////////
    Persona p2;
    public Persona getPersona(){
        return p2;
    }
    public Persona createP(Persona p){
        p2 = p;
        return p2;
    }
    //////EJERCICIO1/////////////////
     */
    /*
    ///////////EJERCICIO2///////////
    ArrayList<Ciudad> ciudad = new ArrayList<Ciudad>();
    public ArrayList<Ciudad> cargarC(ArrayList<Ciudad> c){
        for (Ciudad ciudad1 : c) {
            ciudad.add(ciudad1);
            //ciudad.add(new Ciudad(ciudad1.getNombre(), ciudad1.getNumHabitantes()));
        }
        ciudad.add(new Ciudad("Vizcaya",25000));
        return ciudad;
    }

    public ArrayList<Ciudad> cargarC1(Ciudad c){
        ciudad.add(new Ciudad(c.getNombre(), c.getNumHabitantes()));
        ciudad.add(new Ciudad("Vizcaya",25000));
        return ciudad;
    }
    public ArrayList<Ciudad> getCiudades(){
        return  ciudad;
    }
    ////////////EJERCICIO2//////////////////////
     */
    @Bean
    public Persona personaBean1(Persona p){
        p.setNombre("bean1");
        return  p;
    }
    @Bean
    public Persona personaBean2(Persona p){
        p.setNombre("bean2");
        return  p;
    }@Bean
    public Persona personaBean3(Persona p){
        p.setNombre("bean3");
        return  p;
    }
}
