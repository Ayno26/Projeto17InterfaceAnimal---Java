/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public abstract class Animal {
//Construtores
    protected String habitat;

    public Animal() {
    }
    public Animal(String habitat) {
        this.habitat = habitat;
    }
//Metodos
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }    
    public String makeNoise() {
        return "Barulho.";
    }
}