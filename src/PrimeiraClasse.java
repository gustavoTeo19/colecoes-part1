import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiraClasse {
    public static void main(String args[]){
        System.out.println("Alô Mundo");
        facaPergunta();
    }

    public static void facaPergunta(){
        List<Pessoas> feminino = new ArrayList<Pessoas>();
        List<Pessoas> masculino = new ArrayList<Pessoas>();
        String perguntar = "Sim";
        while (perguntar.equals("Sim")){
            Scanner nomeScanner = new Scanner(System.in);
            Scanner sexoScanner = new Scanner(System.in);
            System.out.println("Qual o seu nome? ");
            String nome = nomeScanner.next();
            System.out.println("Qual o seu sexo?");
            String sexo = sexoScanner.next();
            System.out.println("Deseja adicionar mais uma pessoa?");
            Pessoas pessoa = new Pessoas(nome, sexo);
            if(sexo.equalsIgnoreCase("Masculino"))
                masculino.add(pessoa);
            if(sexo.equalsIgnoreCase("Feminino"))
                feminino.add(pessoa);
            Scanner perguntaDenovo = new Scanner(System.in);
            perguntar = perguntaDenovo.next();
        }
        Collections.sort(masculino);
        Collections.sort(feminino);
        System.out.println(feminino);
        System.out.println(masculino);
        //        Scanner leitor = new Scanner(System.in);

    }
}
