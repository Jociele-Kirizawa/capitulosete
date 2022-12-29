import java.util.Scanner;

public class ComissaoVendaTeste {
    static double [] comissao(double x){
        double[]comissao = new double[10];
        for (int i = 0; i < comissao.length; i++) {
            comissao[i] = 200 + (0.09 * (x + i));
            System.out.println(comissao[i]);
        }
        return comissao;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o intervalo que voce quer saber a comissão:");
        System.out.println("(200)(300)(400)(500)(600)(700)(800)(900)");
        double x= scan.nextDouble();
        comissao(x);

}
}
/*Utilize um array unidimensional para resolver o seguinte problema: uma empresa paga seu pessoal de vendas por
comissão. O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante essa semana. Por exemplo, um vendedor
que vende R$ 5.000 brutos em uma semana recebe R$ 200 mais 9% de R$ 5.000 ou um total de R$ 650. Escreva um aplicativo (utilizando
um array de contadores) que determina quanto o pessoal de vendas ganhou em cada um dos seguintes intervalos (suponha que o salário
de cada vendedor foi truncado para uma quantia inteira):
a) $200–299
b) $300–399
c) $400–499
d) $500–599
e) $600–699
f) $700–799
g) $800–899
h) $900–999
i) R$ 1.000 e acima
Resuma os resultados em formato tabular
 */