/* Uma pousada estipulou o preço da diária em R$ 40,00 e mais uma taxa de serviços diários de:
• R$ 15,00, se o número de dias for menor que 10;
• R$ 8,00, se o número de dias for maior ou igual a 10.
Criar um programa em Java que informe o nome, o valor da conta de cada cliente e ao final o total arrecadado pela pousada.*/


import java.util.Scanner;

public class ComandoWhile07 {

    public static void main(String[] args) {

        var i = 0;
        var diaria = 40;
        var dias = 0;
        var valorDias = 0;
        var contaCliente = 0;
        var nomeCliente = "";
        var totalArrecadado= 0;

        while (i < 5) {
            Scanner leitor1 = new Scanner(System.in);
            System.out.println("Informe seu nome: ");
            nomeCliente = leitor1.nextLine();

            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Informe quantos dias ficará hospedado(a): ");
            dias = leitor2.nextInt();

            if (dias < 10) {
                valorDias = dias * 15;
            } else if (dias >= 10) {
                valorDias = dias * 8;
            }

            contaCliente = diaria + valorDias;
            totalArrecadado += contaCliente;
            System.out.println("A conta do(a) " + nomeCliente + " tem o valor de " + contaCliente);
            i++;
        }

        System.out.println("O total arrecadade nesse período foi de " + totalArrecadado);
    }


}
