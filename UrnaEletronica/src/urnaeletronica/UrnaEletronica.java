
package urnaeletronica;

import entities.Candidato;

public class UrnaEletronica {

    public static void main(String[] args) {
        Candidato.cadastrarCandidato("5050", "Joaozin Cria", 56);
        Candidato.cadastrarCandidato("6500", "Maria Clara", 50);
        
//        Candidato.exibirCandidatos();
        System.out.println(Candidato.exibirListaDeCandidatos());
        
//        System.out.println(li);
    }
    
}
