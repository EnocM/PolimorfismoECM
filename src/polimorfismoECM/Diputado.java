/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoECM;

/**
 *
 * @author alumno
 */
public class Diputado extends Legislador{

    public Diputado(String nombre, String tipoDoc, int nroDoc, String sexo, String prov, int vot) {
        super(nombre, tipoDoc, nroDoc, sexo, prov, vot);
    }

       @Override
    public void bailar (Ritmo r){
        System.out.println("Lo siento, no se bailar");
        }
            
        @Override
    public float calcularSueldo() {
        float x = this.getCantVotantes()*100;
        return x;
    }
    
    public boolean equals(Legislador r){
        boolean res = false;
        String n;
        n=this.getNombre();
        res= n.equals(r.getNombre());
                return res;
        
        }
    
    }


