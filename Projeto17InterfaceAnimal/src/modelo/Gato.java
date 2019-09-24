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
public class Gato extends Felino implements IDomestico {
//Construtores
    public Gato() {
    }
    public Gato(String habitat) {
        super(habitat);
    }
//Metodos
    @Override
    public String getHabitat() {
        return habitat;
    }
    @Override
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }    
    @Override
    public String makeNoise() {
        return "Miado";
    }
//Metodo Exclusivo
    public String raça() {
        return "Siamês";
    }
//Interface
    @Override
    public String comida() {
        return "Peixe";
    }
}