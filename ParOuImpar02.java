/* Faça um programa que leia 10 números inteiros e exiba na tela a mensagem ‘Par’
se ele for um número par, ou ‘Ímpar’ se ele for um número ímpar. */


import java.util.Scanner;

public class ParOuImpar02 {

    public static void main(String[] args) {

        var contador = 0;

        while (contador < 10) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite um valor: ");


            var numero = leitor.nextInt();
            contador++;

            if (numero % 2 == 0) {
                System.out.println(numero + " é par!");

            } else {
                System.out.println(numero + " é impar!");
            }
        }


    }
}
