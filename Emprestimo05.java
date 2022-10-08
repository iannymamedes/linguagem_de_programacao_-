/* A prefeitura de João Pessoa abriu uma linha de crédito para os funcionários municipais.
O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um algoritmo que permita entrar com o
salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido. */


import java.util.Scanner;

public class Emprestimo05 {

    public static void main(String[] args) {

        var salarioBruto = 0;
        var valorPrestacao = 0;
        var valorMaxPrestacao = 0;

        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        salarioBruto = leitor1.nextInt();

        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Quanto você pode pagar por prestação? ");
        valorPrestacao = leitor2.nextInt();


        valorMaxPrestacao = ( 30 * salarioBruto) / 100;

        if(valorPrestacao < valorMaxPrestacao) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo negado!");
        }

    }
}
