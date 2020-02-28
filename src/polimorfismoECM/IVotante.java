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
public interface IVotante {
    
    public boolean puedeVotar();
    
    public void votar(Legislador l);
    
    public boolean loVote(Legislador l);
    
}
