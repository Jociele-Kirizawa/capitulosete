import java.util.ArrayList;
import java.util.Scanner;

public class ForAprimorada {
    public static void main(String[] args) {
        double soma=0;

        ArrayList<Double> lista = new ArrayList<>();


         for (int i = 0; i<args.length;i++){
             lista.add(Double.parseDouble(args[i]));
         }
         for (double numeros: lista){
             soma+=numeros;

         }
        System.out.println(soma);


    }
}





/*Usando a instrução for aprimorada) Escreva um aplicativo que usa uma instrução for aprimorada para somar os valores double
passados pelos argumentos de linha de comando. [Dica: utilize o método static parseDouble da classe Double para converter uma
String em um valor double.]*/