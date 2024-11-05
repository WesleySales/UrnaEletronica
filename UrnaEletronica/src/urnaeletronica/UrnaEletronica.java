
package urnaeletronica;

import entities.Candidato;
import entities.Eleitor;

public class UrnaEletronica {

    public static void main(String[] args) {
//        Candidato.cadastrarCandidato("5050", "Joaozin Cria", 56);
//        Candidato.cadastrarCandidato("6500", "Maria Clara", 50);
//        Eleitor.cadastrarEleitor("1234", "Juan Sales", 18);
//        Eleitor.cadastrarEleitor("4444", "Nivaldo Sales", 50);
//        Eleitor.cadastrarEleitor("5556", "Maria Sales", 25);
        
        Eleitor eleitor1 = new Eleitor("1234", "Juan Sales", 18);
        Candidato candidadto1 = new Candidato("5050", "Joaozin Cria", 56);
        
        eleitor1.votar();
        candidadto1.votar();
        
////        Candidato.exibirCandidatos();
//        System.out.println(Candidato.exibirListaDeCandidatos());
        
       
    }
    
}
