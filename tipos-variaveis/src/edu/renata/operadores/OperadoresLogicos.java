package edu.renata.operadores;

public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

        if (condicao1 && ( 7 > 4 )){
            System.out.println("A variável boleana e a expressão relacional são verdadeira");
        }

        if (( 1 == 2 ) || ( "Renata" == "Renata" )){
            System.out.println("Uma das expressões estão corretas");
        }

        System.out.println("Fim");

    }
}
