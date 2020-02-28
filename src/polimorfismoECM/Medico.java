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
public class Medico extends Persona{
    private int matricula;
    private String especialidad;
    
    public Medico(String nombre, String tipoDoc, int nroDoc, String sexo, int mat, String esp) {
        super(nombre, tipoDoc, nroDoc, sexo);
        this.matricula = mat;
        this.especialidad = esp;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void presentarse() {
        saludar();
        System.out.println("Soy médico especialista en " + this.especialidad);
        System.out.println("Mi matricula es la número " + this.matricula);
    }
    
       @Override
    public void bailar (Ritmo r){
        System.out.println("Lo siento, no se bailar");
        }
    
    
}
