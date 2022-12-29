import java.util.Scanner;

public class EliminacaoDuplicatas {
    public static void main(String[] args) {
        int[] array = new int[5];


        Scanner scan = new Scanner(System.in);

        int i = 0;
        for (int cont = 0; cont < 5; cont++) {
            System.out.printf("Escolha o %d numero de 10-100", cont + 1);
            int var = scan.nextInt();

            boolean repetido = false;
            for (int j = 0; j < i ; j++) {
                if (array[j] == var) {
                    repetido=true;
                }

            }
            if (repetido ==false){
                array[i]=var;
                i++;
            }


        }
        for (int k =0; k < array.length; k++){
            System.out.println(array[k]);
        }
    }
}

















    /*Utilize um array unidimensional para resolver o seguinte problema: escreva um aplicativo que insere cinco
        números, cada um entre 10 e 100, inclusive. Enquanto cada número é lido, exiba-o somente se ele não tiver
        uma duplicata de um número
        já lido. Cuide de tratar o “pior caso”, em que todos os cinco números são diferentes. Utilize o menor
         array possível para resolver
        esse problema. Exiba o conjunto completo de valores únicos inseridos depois que o usuário
        inserir cada valor novo.*/






