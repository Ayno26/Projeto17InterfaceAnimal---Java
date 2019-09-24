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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gato objGato = new Gato("Doméstico");
        Leao objLeao = new Leao("Selva");
        Tigre objTigre = new Tigre("Floresta");
        Cao objCao = new Cao("Doméstico");
        Lobo objLobo = new Lobo("Montanhas");
        
        System.out.println("Gato"+"\nComida: "+objGato.comida("Peixe")+
                " Habitat: "+objGato.getHabitat()+
                " Braulho: "+objGato.makeNoise()+
                " Raça: "+objGato.raça());
        System.out.println("\nLeao"+"\nHabitat: "+objLeao.getHabitat()+
                " Braulho: "+objLeao.makeNoise()+
                " Origem: "+objLeao.origem());
        System.out.println("\nTigre"+"\nHabitat: "+objTigre.getHabitat()+
                " Braulho: "+objTigre.makeNoise()+
                " Cor: "+objTigre.cor());
        System.out.println("\nCao"+"\nComida: "+objCao.comida("Ração")+
                " Habitat: "+objCao.getHabitat()+
                " Braulho: "+objCao.makeNoise()+
                " Tamanho: "+objCao.tamanho());
        System.out.println("\nLobo"+"\nHabitat: "+objLobo.getHabitat()+
                " Braulho: "+objLobo.makeNoise()+
                " Peso: "+objLobo.peso());
    }    
}