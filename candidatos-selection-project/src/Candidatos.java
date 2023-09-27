import java.util.concurrent.ThreadLocalRandom;

public class Candidatos {
    public static void main(String[] args) throws Exception {
       
        //testing "analisarCandidato" method
        /*analisarCandidato(1500.0);
        analisarCandidato(2000.0);
        analisarCandidato(3000.0);*/

        //selecionarCandidato();

        imprimirSelecionados();

    }

    static void selecionarCandidato(){

        String candidatos [] = {"Evellyn","Mirella","Girlayne","Thayná","Alane","Evelyn","Maria","Amanda","Karyna","Lorena"};

        double salarioBase = 2000.0;
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
           
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPrentendido();

            System.out.println("O(A) candidato(a) " + candidato + " Solicitou este salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O(A) candidato(a) " + candidato + " foi selecionado(a) para a vaga");
                candidatosSelecionados++;
            }
                candidatoAtual++;
        }
    }

    static double valorPrentendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);

    }

    static void analisarCandidato(double salarioPretendido){
        
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");    
        }
        else if(salarioBase == salarioPretendido){    
            System.out.println("Ligar para o candidato, com contra proposta.");
        }   
        else 
        {
            System.out.println("Aguardando resultado dos demais candidatos.");
        }


    }

    static void imprimirSelecionados(){

        String selecionados [] = {"Evellyn","Mirella","Girlayne","Evellyn","Evelyn"};

        for (int indice = 0; indice < selecionados.length; indice ++){

          System.out.println("O candidato de índice " + (indice+1) + " é: " + selecionados[indice]);
         
        }

        //testing for --> each

        for(String candidato:selecionados){

            System.out.println("Um dos canditatos selecionados foi: " + candidato);
        }
    }
}
