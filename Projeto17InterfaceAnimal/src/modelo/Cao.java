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
public class Cao extends Canino implements IDomestico {
//Construtores
    public Cao() {
    }
    public Cao(String habitat) {
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
        return "Latido.";
    }
//Metodo Exclusivo
    public double tamanho(){
        return 1.30;
    }
//Interface
    @Override
    public String comida(String comida) {
        return "Ração";
    }
}