/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.clases;

/**
 *
 * @author 59398
 */
public class Profesor extends Persona {

    private String titulo;
    private double salario;
    private String cargo;

    @Override
    public String toString() {
        return "Profesor{" + "titulo=" + titulo + ", salario=" + salario + ", cargo=" + cargo + '}';
    }

    public Profesor(){
    
    }

    public Profesor(int codigo, String nombre, String cedula, String telefono, String correo) {
        super(codigo, nombre, cedula, telefono, correo);
    }

    public Profesor(int codigo) {
        super(codigo);
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getSalario(int horasTrabajando, double valorPorHora) {
        return salario + horasTrabajando + valorPorHora;
    }

    public double getSalario(int comision){
        return salario = (salario + comision);
        
    }
    
    public String getCargo() {
        return cargo;
    }

 

}
