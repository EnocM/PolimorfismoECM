/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoECM;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * HOLA
 * @author Enoc
 */
public class PolimorfismoECM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                                                                                
        ArrayList<String> pasoscumbia = new ArrayList<String>();
        pasoscumbia.add("Derecha");
        pasoscumbia.add("Derecha");
        pasoscumbia.add("Izquierda");
        pasoscumbia.add("Derecha");
        pasoscumbia.add("Izquierda");
        pasoscumbia.add("Izquierda");
        pasoscumbia.add("Derecha");
        pasoscumbia.add("Izquierda");
                                                                                
        Ritmo cumbia = new Ritmo("cumbia", pasoscumbia);
        
        Ritmo rock = new Ritmo("rock", new ArrayList<String>() {{
            add("izquierda al centroo"); add("izquierda atras");add("derecha al centro");add("dereha al costado");}});
        
        Ritmo reggaeton = new Ritmo("reggaeton", pasoscumbia);
        
        Ritmo zamba = new Ritmo("zamba", new ArrayList<String>());
        zamba.setPasos(pasoscumbia);
        
                
        ArrayList<Persona> profesionales = new ArrayList<Persona>();
        
        Persona Med = new Medico("juan","dni",23523142,"Masculino",568978,"Pediatría");
        profesionales.add(Med);
        Med.setEdad(45);
        
        Persona Ing = new Ingeniero("Carlos","DNI",23522936,"Masc",366581);
        profesionales.add(Ing);
        Ing.setEdad(44);
        
        Persona m = new Ingeniero ("Samanta","DNI",30555869,"Femenino",0123456);
        profesionales.add(m);
        m.setEdad(38);
        
        Persona p = new Medico ("Roberto","DNI",4988227,"Masculino",333762,"Nutrición");
        profesionales.add(p);
        p.setEdad(27);

        Persona al = new Alumno ("Enoc","dni",25497352,"Masculino");
        profesionales.add(al);
        al.setEdad(42);

        System.out.println("Creamos un array de profesionales que extiende de la clase \npersona e implementa las clases que les permiten bailar y votar\n");
        System.out.println("Una vez creado solicitamos a uno de ellos que se presente y demuestre sus dotes de baile\n");
        
        
        m.presentarse();
        al.bailar(rock);
        
        
        System.out.println("Vamos a recorrer y mostrar las personas creadas\n");
        
        
        Iterator it = profesionales.iterator();
        Persona actual;
        while(it.hasNext()){
            actual = (Persona)it.next();
            System.out.println ("================");
            actual.presentarse();
        }    
        
        System.out.println("Creamos una serie de politicos y calculamos su sueldo en base a la cantidad de votantes que tiene\n");    

        Legislador Dip = new Diputado("Jose", "DNI", 14555098, "Masculino", "Santa Fe", 12000);
        System.out.println("El diputador "+ Dip.getNombre() + " tiene un sueldo de" + Dip.calcularSueldo() + " pesos\n");
                
        System.out.println (Dip.calcularSueldo());
        
        Legislador Sen = new Senador("Augusto", "DNI", 24567876, "Masc", "La Rioja", 2000);
        System.out.println("El senador "+ Sen.getNombre() + " tiene un sueldo de" + Sen.calcularSueldo() + " pesos\n");
        
        Legislador Sen2 = new Senador("Carlos", "DNI", 4567875, "Masc", "La Rioja", 500);
        System.out.println("El senador "+ Sen2.getNombre() + " tiene un sueldo de" + Sen2.calcularSueldo() + " pesos\n");
        
        Legislador Sen3 = new Senador("Carlos", "DNI", 4567876, "Masc", "La Rioja", 500);
        System.out.println("El senador "+ Sen3.getNombre() + " tiene un sueldo de" + Sen3.calcularSueldo() + " pesos\n");
        
        
        System.out.println("Comparamos dos senadores que son casi identicos para chequear datos duplicados");
        
        if (Sen3.equals(Sen))
            System.out.println("Son iguales");
        else
            System.out.println("Son diferentes");
    }        
                  
            
}
        
                
        

