/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoECM;

import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona implements IBailarin{
    
    public Alumno(String nombre, String tipoDoc, int nroDoc, String sexo){
        super(nombre, tipoDoc, nroDoc, sexo);
    }
    
    @Override
    public void presentarse() {
       saludar();
       System.out.println("Soy un alumno");
    }
    
    @Override
    public void bailar (Ritmo r){
        String paso;
        Iterator it = r.getPasos().iterator();
            while (it.hasNext()){
                paso = (String) it.next();
                System.out.print ("Un paso a la ");
                System.out.println(paso);
            }
        
    }
}
