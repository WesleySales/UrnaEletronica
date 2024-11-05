package entities;

import java.util.ArrayList;
import java.util.List;

public class Candidato extends Pessoa{
    private String numeroDoCandidato;
    protected static List<Candidato> listaDeCandidatos = new ArrayList<>();
    private String partido;

    public Candidato(String numeroDoCandidato, String nome, int idade) {
        super(nome, idade);
        this.numeroDoCandidato = numeroDoCandidato;
    }

    @Override
    public void votar() {
        System.out.println("Sou candidato e votei");
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
  
    public static void cadastrarCandidato(String numeroDoCandidato, String nome, int idade){
        Candidato candidato = new Candidato(numeroDoCandidato, nome, idade);
        listaDeCandidatos.add(candidato);
    }
    
    

    public String getNumeroDoCandidato() {
        return numeroDoCandidato;
    }

    public void setNumeroDoCandidato(String numeroDoCandidato) {
        this.numeroDoCandidato = numeroDoCandidato;
    }

    @Override
    public String toString() {
        return String.format("\nNumero: %s -  Nome: %s",numeroDoCandidato, getNome());
    }


    public static void exibirCandidatos(){
        if(!listaDeCandidatos.isEmpty()){
          System.out.println(listaDeCandidatos);
        }
    }
    
    
    public static String exibirListaDeCandidatos(){
        if(!listaDeCandidatos.isEmpty()){
            StringBuilder sb = new StringBuilder();
            for(Candidato c: listaDeCandidatos){
                sb.append(c);
            }
          return sb.toString();
        } else{
            return "A lista esta vazia"; 
        }
    }
    
    
    
}
