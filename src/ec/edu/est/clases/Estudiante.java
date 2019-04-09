/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59398
 */
public class Estudiante extends Persona {

    private List<Carrera> carrera;
  
    public Estudiante() {
    }

    public Estudiante(int codigo) {
        super(codigo);
    }

    public Estudiante(int cogido, String nombre, String cedula) {
        super(cogido, nombre, cedula);// en vez de los this super()
         carrera = new ArrayList<>();
    }

    public Carrera getCarrera() {
        return (Carrera) carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = (List<Carrera>) carrera;
    }
    
    public void agregarCarrera(Carrera carrer){
        carrera.add(carrer);
    }

}
