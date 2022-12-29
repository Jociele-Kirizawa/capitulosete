import java.util.Random;

public class JogoDados {
    static int lancarDado() {

        Random aleatorio = new Random();
        int x = 1 + aleatorio.nextInt(6);
        return x;
    }

    static int soma(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int cont = 0;
        while (cont != 60) {
            for (int i = 0; i <= 60; i++) {
                System.out.print(soma(lancarDado(), lancarDado()) + "       ");



            }
            System.out.println();
            cont++;
        }
    }
}



/*(Jogo de dados) Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo deve utilizar um objeto de classe Random,
uma vez para lançar o primeiro dado e novamente para lançar o segundo dado. A soma dos dois valores deve então ser calculada. Cada
dado pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de 2 a 12, com 7 sendo a soma mais frequente e 2 e 12,
as somas menos frequentes. A Figura 7.28 mostra as 36 possíveis combinações de dois dados. Seu aplicativo deve lançar o dado 36.00
vezes. Utilize um array unidimensional para contar o número de vezes que cada possível soma aparece. Exiba os resultados em formato
tabular*/