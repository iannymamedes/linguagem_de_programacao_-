/* Faça um programa que receba o valor dos créditos galácticos de um Star trooper e
o percentual de aumento, calcule e mostre os créditos galácticos com o novo aumento. */


import java.util.Scanner;

public class CreditosGalacticos01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o salário: ");
        float salario = leitor.nextFloat();

        System.out.println("Informe o % de aumento: ");
        float percentual = leitor.nextFloat();

        percentual = (percentual/100);
        float valorAumento = salario * percentual;
        float novoValor = salario + valorAumento;
        System.out.println("Salário: " + salario);
        System.out.println("Aumento: " + valorAumento);
        System.out.println("Novo valor: " + novoValor);
    }
}
