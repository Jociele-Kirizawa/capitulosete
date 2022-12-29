import java.util.Scanner;

public class VendasTotais {
    static int [][] totalVendas () {
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        int [][] vendas = new int[4][5];

        while (flag == false) {
            System.out.println("Digite o numero do vendedor de 0 ate 3:");
            int vendedor = scan.nextInt();
            System.out.println("Digite o numero do produto 0 a 4");
            int produto = scan.nextInt();
            System.out.println("Digite o valor da venda");
            int valor = scan.nextInt();
             vendas[vendedor][produto] = valor;
            System.out.println("Deseja sair aperte X");
            System.out.println("Deseja continuar aperte C");
            String sair = scan.next();
            if (sair.equalsIgnoreCase("X")) {
                flag = true;
            }


        }

        return vendas;
    }

    public static void main(String[] args) {
        System.out.println(totalVendas());
    }

}



/*(Vendas totais) Utilize um array bidimensional para resolver o seguinte problema: uma empresa tem quatro equipes de vendas (1 a 4)
que vendem cinco produtos diferentes (1 a 5). Uma vez por dia, cada vendedor passa uma nota de cada tipo de produto diferente vendido.
Cada nota contém o seguinte:
a) O número do vendedor
b) O número do produto
c) O valor total em reais desse produto vendido nesse dia
Portanto, cada vendedor passa entre 0 e 5 notas de vendas por dia. Suponha que as informações a partir de todas as notas durante o
último mês estejam disponíveis. Escreva um aplicativo que leia todas essas informações sobre as vendas do último mês e resuma as vendas
totais por vendedor e por produto. Todos os totais devem ser armazenados no array bidimensional sales. Depois de processar todas as informações do último mês, exiba os resultados em formato tabular, com cada coluna representando um vendedor particular e cada linha representando um produto particular. Some cada linha para obter o total das vendas de cada produto no último mês. Some cada coluna para
obter o total de vendas por vendedor no último mês. Sua saída tabular deve incluir esses totais cruzados à direita das linhas totalizadas e na
parte inferior das colunas totalizadas*/