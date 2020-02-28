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
public class Senador extends Legislador{

    public Senador(String nombre, String tipoDoc, int nroDoc, String sexo, String prov, int vot) {
        super(nombre, tipoDoc, nroDoc, sexo, prov, vot);
    }
    
    @Override
    public void presentarse(){
        saludar();
        System.out.println("Soy Senador por la provincia de "+ this.getProvincia()); 

    }
    
    @Override
    public float calcularSueldo() {
        float x =0;
            if (this.getCantVotantes() > 0 && this.getCantVotantes() <101){
                x = this.getCantVotantes()*100;
            }
            if (this.getCantVotantes() > 100 && this.getCantVotantes() <1001){
                x = this.getCantVotantes()*150;
            }
            if (this.getCantVotantes() > 1000){
                x = this.getCantVotantes()*200;
            }
        return x;
    }
    
       @Override
    public void bailar (Ritmo r){
        System.out.println("Lo siento, no se bailar");
        }
    
}
