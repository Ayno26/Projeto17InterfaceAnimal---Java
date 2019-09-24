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
public class Leao extends Felino {
//Construtores
    public Leao() {
    }
    public Leao(String habitat) {
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
        return "Rugido";
    }
//Metodo Exclusivo
    public String origem() {
        return "Africana";
    }
}