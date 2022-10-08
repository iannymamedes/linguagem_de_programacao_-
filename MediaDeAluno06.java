import java.util.Scanner;

public class MediaDeAluno06 {


    public static void main(String[] args) {

        var i = 0;

        var alunos = 0;
        var nota1 = 0;
        var nota2 = 0;
        var media = 0;

        var alunosAprovados = 0;
        var alunosEmExame = 0;
        var alunosReprovados = 0;
        var mediaClasse = 0;


        for (i = 0; i < 6; i++) {

            Scanner leitor1 = new Scanner(System.in);
            System.out.println("Primeira nota: ");
            nota1 = leitor1.nextInt();

            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Segunda nota: ");
            nota2 = leitor2.nextInt();


            media = (nota1 + nota2) / 2;

            if(media < 3) {
                System.out.println("Reprovado!");
                alunosReprovados++;

            } else if (media >= 3 && media < 7) {
                System.out.println("Exame!");
                alunosEmExame++;

            } else if (media >= 7) {
                System.out.println("Aprovado!");
                alunosAprovados++;
            }

            mediaClasse += media / 6;

        }

        System.out.println("Total de alunos aprovados: " + alunosAprovados);
        System.out.println("Total de alunos para fazer exame: " + alunosEmExame);
        System.out.println("Total de alunos reprovados: " + alunosReprovados);
        System.out.println("Média da classe: " + mediaClasse);

    }
}