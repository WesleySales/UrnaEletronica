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

    public String getTituloDeEleitor() {
        return tituloDeEleitor;
    }

    public void setTituloDeEleitor(String tituloDeEleitor) {
        this.tituloDeEleitor = tituloDeEleitor;
    }

}
