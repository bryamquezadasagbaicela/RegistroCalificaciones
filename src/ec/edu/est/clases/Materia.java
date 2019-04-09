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
public class Materia {

    private int codigo;
    private String nombre;
    private int numeroCreditos;
    private int numeroHoras;
    private int nivel;
    private List<Grupo> grupo;
    private List<Profesor> profesor;

    public Materia(int codigo, String nombre, int numeroCreditos, int numeroHoras, int nivel) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
        this.numeroHoras = numeroHoras;
        this.nivel = nivel;
        grupo = new ArrayList<>();
        profesor = new ArrayList<>();

    }

    public Materia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    @Override
    public String toString() {
        return "Materia{" + "codigo=" + codigo + ", nombre=" + nombre + ", numeroCreditos=" + numeroCreditos + ", numeroHoras=" + numeroHoras + ", nivel=" + nivel + ", grupo=" + grupo + ", profesor=" + profesor + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<Grupo> getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grup) {
        grupo.add(grup);
    }

    public List<Profesor> getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor prof) {
       profesor.add (prof) ;
    }
    
   public void agregarProfesor(Profesor profe){
        profesor.add(profe);
    }

    public void agregarGrupo(Grupo primerGrupo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            

}
