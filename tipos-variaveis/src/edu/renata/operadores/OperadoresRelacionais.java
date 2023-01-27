package edu.renata.operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        String nomeUm = "Renata";
        String nomeDois = "Renata";
        String nomeTres = new String("Renata");


        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm == nomeTres);

        //a equivalencia entre a variavel nomeUm e a new String nomeTres
        //descrita acima gera um resultado falso, porém não é a forma correta
        //sendo a forma correta se utilizando o método equals
        //onde será comparado o conteúdo entre os dois objetos
        System.out.println(nomeUm.equals(nomeTres));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("O número 1 é igual ao número 2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("O número 1 é diferente ao número 2? " + simNao);

        if(numero1 != numero2){
            System.out.print("Numero 1 é diferente de numero 2 ");
        }

	        


    }
}
