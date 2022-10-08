/* Um motorista parou no posto de gasolina, comprou dois refrigerantes e abasteceu o seu carro com gasolina.
Leia a quantidade de litros de gasolina foram necessários para abastecer o veículo e informe o valor total da conta desse cliente,
sabendo-se que cada refrigerante custou R$3,00 e o litro de gasolina está custando R$2,50. */


import java.util.Scanner;

public class estruturaSequencial04 {

    public static void main(String[] args) {

        int litroGasolina = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos litros foram abastecidos: ");
        litroGasolina = leitor.nextInt();


        var valorGasolina = litroGasolina * 2.5;
        var valorRefrigerante = 6;

        var valorTotal = valorGasolina + valorRefrigerante;

        System.out.println("O valor total foi R$" + valorTotal);

    }
}
