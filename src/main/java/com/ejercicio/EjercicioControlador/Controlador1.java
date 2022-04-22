package com.ejercicio.EjercicioControlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController()
@RequestMapping(value = "/controlador1")
public class Controlador1 {


    @Autowired
    ServiceP serviceP;
    //EJERCICIO1///////////
    /*
    @GetMapping("/metodoget")
    public Persona getUser(){
        Persona per = serviceP.getPersona();
        per = new Persona(per.getNombre(), per.getCiudad(), per.getEdad() * 2);
        return per;
    }

    @PostMapping("/metodopost")
    public Persona getUser1(@RequestBody Persona pe){
        serviceP.createP(pe);
        return pe;
    }
    //////////////////EJERCICIO1/////////////
    */
    /*
    //////////////////EJERCICIO2/////////////
    //@PostMapping("/addCiudad")
    //public ArrayList<Ciudad> agregarCiudad(@RequestBody ArrayList<Ciudad> c){
    //    return serviceP.cargarC(c);
    //}
    @PostMapping("/addCiudad")
    public ArrayList<Ciudad> agregarCiudad(@RequestBody Ciudad c){
        return serviceP.cargarC1(c);
    }
    @GetMapping("/getCiudad")
    public ArrayList<Ciudad> getCiudad(){
        return serviceP.getCiudades();
    }
    /////////////////EJERCICIO2//////////////
    */

    @Qualifier("personaBean1")
    @PostMapping("/bean1")
    public Persona cambiarBean1(@RequestBody Persona p){
        return serviceP.personaBean1(p);
    }
    @Qualifier("personaBean2")
    @PostMapping("/bean2")
    public Persona cambiarBean2(@RequestBody Persona p){
        return serviceP.personaBean2(p);
    }
    @Qualifier("personaBean3")
    @PostMapping("/bean3")
    public Persona cambiarBean3(@RequestBody Persona p){
        return serviceP.personaBean3(p);
    }
}
