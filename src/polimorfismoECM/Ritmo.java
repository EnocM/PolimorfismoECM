/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoECM;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
class Ritmo {
    private String nombre;
    ArrayList<String> pasos;

    public Ritmo(String nombre, ArrayList<String> pasos) {
        this.nombre = nombre;
        this.pasos = pasos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }
}
