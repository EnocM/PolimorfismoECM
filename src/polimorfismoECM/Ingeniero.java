/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoECM;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author alumno
 */
public class Ingeniero extends Persona implements IBailarin {

    private int nroHabilitacion;

    public int getNroHabilitacion() {
        return nroHabilitacion;
    }

    public void setNroHabilitacion(int nroHabilitacion) {
        this.nroHabilitacion = nroHabilitacion;
    }
    
    public Ingeniero(String nombre, String tipoDoc, int nroDoc, String sexo, int nroHab) {
        super(nombre, tipoDoc, nroDoc, sexo);
        this.nroHabilitacion = nroHab;
    }

    @Override
    public void presentarse() {
        saludar();
        System.out.println("Soy ingeniero matriculado");
        System.out.println("Mi número de habilitacion es " + this.nroHabilitacion); 
    }
    
    @Override
    public void bailar (Ritmo r){
        ArrayList<String> listaPasos;
        listaPasos = r.getPasos();
        String paso;
        ListIterator it = listaPasos.listIterator(listaPasos.size());
            while (it.hasPrevious()){
                paso = (String) it.previous();
                System.out.print ("Tiro este paso: la ");
                System.out.println(paso);
            }
    }
    
}
