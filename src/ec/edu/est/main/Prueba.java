/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.main;

import ec.edu.est.clases.Carrera;
import ec.edu.est.clases.Estudiante;
import ec.edu.est.clases.Grupo;
import ec.edu.est.clases.Materia;
import ec.edu.est.clases.Profesor;
import ec.edu.est.clases.Sede;



/**
 *
 * @author 59398
 */
public class Prueba {

    public static void main(String[] args) {


        Sede sedeCuenca = new Sede(1, "Cuenca", "calle vieja", "2900797");// sede control espacio y se llama a todos los setter 
        
        Carrera computacion = new Carrera(1, "computacion", 10, 7, "ing. computacion");
        Carrera telematica = new Carrera(2, "telematica", 8, 3, "ing. telematica");
        Carrera mecatronica = new Carrera(3, "mecatronica", 10, 5, "ing. mecatronica");

        Materia etica = new Materia(1, "etica", 2, 50, 1);
        Materia calculo = new Materia(2, "calculo", 3, 200, 2);
        Materia teoria = new Materia(3, "teoria", 4, 60, 1);
        Materia programacion = new Materia(4, "programacion", 5, 240, 3);
        Materia matematica = new Materia(5, "matematica", 6, 240, 1);
        Materia estructura = new Materia(6, "estructura", 7, 180, 1);
        
        Profesor gustavoBravo = new Profesor(7, "juan", "01071366999", "0987928228","bquezdas1@est.ups.edu.ec");
        Profesor berthaTacuri = new Profesor(8, "felipe","01071366699","0987854895","bquezadas@est.ups.edu.ec");
 
        Estudiante bryamQuezada = new Estudiante(1, "Bryam Quezada", "0107136699");
        Estudiante diegoPina = new Estudiante (2, "Diego Pina", "0101415546");
        Estudiante carlosCondor = new Estudiante(2, "Carlos Condor","0121457845");
        Estudiante franklinOrellana = new Estudiante(4, "Franklin Orellana", "0145782569");
        
        Grupo primerGrupo = new Grupo(451, "cumpu 1 ", 45);
        Grupo segundoGrupo= new Grupo(4587,"compu 2", 54);
                
        sedeCuenca.agregarCarrera(computacion);//relacion entre sede y cuenca
        sedeCuenca.agregarCarrera(telematica);
        sedeCuenca.agregarCarrera(mecatronica);
        
        computacion.agregarMateria(etica);
        computacion.agregarMateria(calculo);
        mecatronica.agregarMateria(teoria);
        mecatronica.agregarMateria(programacion);
        telematica.agregarMateria(matematica);
        telematica.agregarMateria(estructura);
        
        estructura.agregarGrupo(primerGrupo);
         estructura.agregarProfesor(berthaTacuri);
        
        programacion.agregarGrupo(primerGrupo);
        programacion.agregarProfesor(berthaTacuri);
        
        calculo.agregarGrupo(primerGrupo);
        calculo.agregarProfesor(gustavoBravo);
        
        etica.agregarGrupo(segundoGrupo);
        etica.agregarProfesor(gustavoBravo);

        matematica.agregarGrupo(segundoGrupo);
        matematica.agregarProfesor(berthaTacuri);
        
        teoria.agregarGrupo(segundoGrupo);
        teoria.agregarProfesor(berthaTacuri);
        
        franklinOrellana.setCarrera(mecatronica);
        carlosCondor.setCarrera(computacion);
        
        System.out.println("sede cuenca:"+ sedeCuenca.toString());
        
    
        
            }
}
