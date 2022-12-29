public class exerxicioFixacao {
    public static void main(String[] args) {
        int soma =0;
        final int ARRAY_SIZE= 10;
        double [] fractions = new double[ARRAY_SIZE];
        fractions[4]=0;
        fractions[9]=1.666;
        fractions[6]=3.333;
        for(double numeros: fractions){
            soma += numeros;
        }
        System.out.println(soma);


    }
}






/* Realize as seguintes tarefas para um array chamado fractions:
a) Declare uma constante ARRAY_SIZE que é inicializada como 10.
b) Declare um array com ARRAY_SIZE elementos do tipo double e os inicialize como 0.
c) Referencie o elemento 4 do array.
d) Atribua o valor 1.667 ao elemento 9 do array.
e) Atribua o valor 3.333 ao elemento 6 do array.
f) Some todos os elementos do array, utilizando uma instrução for. Declare a variável inteira x como uma variável de controle para o
loop.*/