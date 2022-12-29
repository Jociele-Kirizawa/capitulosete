import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ArgumentoVariavel {
    static int produto(ArrayList<Integer> itens) {
        int produto = 1;

        for (int i = 0; i < itens.size(); i++) {
            produto *= itens.get(i);
        }
        return produto;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(3);
        lista.add(4);
        int x = produto(lista);
        System.out.println(x);



    }

    }



/*(Lista de argumento de comprimento variável) Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados
para método product utilizando uma lista de argumentos de comprimento variável. Teste seu método com várias chamadas, cada uma
com um número diferente de argumentos.*/
