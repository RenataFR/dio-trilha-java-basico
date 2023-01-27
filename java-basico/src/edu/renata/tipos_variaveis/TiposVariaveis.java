package edu.renata.tipos_variaveis;
public class TiposVariaveis {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    
            // declaração de um double
            double salarioMinimo = 2500.05;

            System.out.println(salarioMinimo);

            // declaração de uma variável short
            short numeroCurto = 1;
    
            // declaração de uma variável int sendo atribuida a ela o valor
            // de uma variável short
            int numeroNormal = numeroCurto;
    
            // declaração de uma variável short sendo atribuida a ela o valor
            // de uma variável int, gerando erro
    
            //short numeroCurto2 = numeroNormal;
            
            // para corrigir o erro gerado utilizamos o cast 
            // com o comando (short) no inicio da atribuição
            short numeroCurto2 = (short) numeroNormal;

            System.out.println(numeroCurto2);

            // declaração de variável alterando seu valor logo em seguida
            int numero = 5;

            numero = 10;

            System.out.println(numero);

            // declaração de constantes em Java
            // contantes devem ser declaradas com o nome em caixa alta
            final double VALOR_DE_PI = 3.14;

            System.out.println(VALOR_DE_PI);

            // declaração de string
            String meuNome = "Renata V C Pessanha";

            System.out.println(meuNome);


    }
       
}
