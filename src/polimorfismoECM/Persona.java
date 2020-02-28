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

public abstract class Persona implements IBailarin, IVotante {
    private String nombre;
    private String tipoDoc;
    private int nroDoc;
    private String sexo;
    private int edad;


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**                                                                         //estos cometarios con 2 * sirven para generar info en JavaDoc 
     * Este Metodo sirve para conocer el tipo de documento
     * @return tipoDoc                                                          // Los @ van con palabras que reconoce el JavaDoc y los ordena según su funcion
     */
    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(int nroDoc) {
        this.nroDoc = nroDoc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Persona(String nombre, String tipoDoc, int nroDoc, String sexo) {
        this.nombre = nombre;
        this.tipoDoc = tipoDoc;
        this.nroDoc = nroDoc;
        this.sexo = sexo;
    }
    
    public Persona(String nombre, String tipoDoc, int nroDoc, String sexo,int edad) {
        this.nombre = nombre;
        this.tipoDoc = tipoDoc;
        this.nroDoc = nroDoc;
        this.sexo = sexo;
        this.edad = edad;
    }
    
    public abstract void presentarse();
    
    public void saludar(){
        System.out.println("Buenos días");
    }
    @Override
    public boolean puedeVotar(){
                    //        boolean r=false;
                    //        if (this.edad>=16)
                    //            r=true;
                    //        return r;    todo esto es más facil escribirlo asi
    return this.edad>=16;
    }
    
    @Override
    public void votar(Legislador l){
        l.agregarVotante(this);
    }
    
    /**
     * Metodo para saber si una persona voto a determinado Legislador
     * @param l es el legislador que quiero evaluar
     * @return boolean
     * @see Diputado
     * @see Senador
     */
    @Override
    public boolean loVote(Legislador l){
        return l.teVote(this);
    }
    
        
}
