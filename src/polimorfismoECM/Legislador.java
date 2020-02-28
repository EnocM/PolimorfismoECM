/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoECM;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public abstract class Legislador extends Persona {
    private String provincia;
    private int cantVotantes;
    private ArrayList<Persona> votantes;
    
    public Legislador(String nombre, String tipoDoc, int nroDoc, String sexo, String prov, int vot) {
        super(nombre, tipoDoc, nroDoc, sexo);
        this.provincia = prov;
        this.cantVotantes = vot;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCantVotantes() {
        return cantVotantes;
    }

    /**
     * @deprecated Este metodo no se usa más, se calcula por el size del array
     * @param cantVotantes 
     */
    
    public void setCantVotantes(int cantVotantes) {
        this.cantVotantes = cantVotantes;
    }

    public abstract float calcularSueldo();
     
    @Override
    public void presentarse() {
       
    }
    
    public void agregarVotante(Persona p){
        this.votantes.add(p);
    }
    
    public boolean teVote(Persona p){
        boolean r = false;
        Persona pers;
        Iterator it = this.votantes.iterator();
        while(it.hasNext()){
            pers = (Persona) it.next();
            if (p.getTipoDoc() == pers.getTipoDoc() && p.getNroDoc() == pers.getNroDoc()){
                r = true;
            }
        }
       return r;
    }
    
        
}
