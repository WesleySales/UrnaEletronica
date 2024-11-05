/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.List;

public class Eleitor extends Pessoa {
    private String tituloDeEleitor;
    private static List<Eleitor> listaDeEleitores = new ArrayList<>();

    public Eleitor(String tituloDeEleitor, String nome, int idade) {
        super(nome, idade);
        this.tituloDeEleitor = tituloDeEleitor;
    }

    @Override
    public void votar() {
//        super.votar();
        System.out.println("Sou eleitor e votei");
    }
    
    
    
    public static void cadastrarEleitor(String tituloDeEleitor, String nome, int idade){
        Eleitor eleitor = new Eleitor(tituloDeEleitor, nome, idade);
        listaDeEleitores.add(eleitor);
    }
    
    public boolean verificarEleitor(String tituloDeEleitor){
        if(!listaDeEleitores.isEmpty()){
            for(Eleitor e: listaDeEleitores){
                if(e.getTituloDeEleitor().equalsIgnoreCase(tituloDeEleitor)){
                    return true;
                }
            }
        }
        return false;        
    }

    
    public String getTituloDeEleitor() {
        return tituloDeEleitor;
    }

    public void setTituloDeEleitor(String tituloDeEleitor) {
        this.tituloDeEleitor = tituloDeEleitor;
    }

}
