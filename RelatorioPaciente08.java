/* Leia uma relação de pacientes de uma clínica, cada um com o nome, o sexo, o peso, a idade e a altura.
Para sinalizar o fim da lista será fornecido “fim” no nome do último paciente. Exiba um relatório contendo:
• a quantidade de pacientes.
• a média de idade dos homens.
• a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
• a quantidade de pessoas com idade entre 18 e 25.
• o nome do paciente mais velho.
• o nome da mulher mais baixa. */


import java.util.List;
import java.util.ArrayList;


public class RelatorioPaciente08 {

    String nome;
    char sexo;
    int idade;
    double peso;
    double altura;

    public RelatorioPaciente08(String _nome, char _sexo, int _idade, double _peso, double _altura) {
        nome = _nome;
        sexo = _sexo;
        idade = _idade;
        peso = _peso;
        altura = _altura;
    }

    public static int media_idade_homens(List<RelatorioPaciente08>pacientes) {
        int media = 0;
        int quantidade = 0;

        for(RelatorioPaciente08 homens: pacientes) {
            if(homens.sexo == 'm') {
                quantidade++;
                media += homens.idade;
            }
        }
        return (media / quantidade);
    }

    public static int quantidade_mulheres_altura_peso(List<RelatorioPaciente08>pacientes) {
        int quantidade = 0;

        for (RelatorioPaciente08 mulheres: pacientes) {
            if(mulheres.sexo == 'f') {
                if(mulheres.altura >= 1.60 && mulheres.altura <= 1.70 && mulheres.peso > 70) {
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    public static int pessoas_idade_entre_18_e_25(List<RelatorioPaciente08>pacientes) {
        int quantidade = 0;

        for(RelatorioPaciente08 pessoa: pacientes) {
            if(pessoa.idade >= 18 && pessoa.idade <= 25) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static String paciente_mais_velho(List<RelatorioPaciente08>pacientes) {
        RelatorioPaciente08 velho = new RelatorioPaciente08("",'m',0,0,0);

        for(RelatorioPaciente08 pessoa: pacientes) {
            if(velho.idade < pessoa.idade) {
                velho = pessoa;
            }
        }
        return velho.nome;
    }

    public static String mulher_mais_baixa(List<RelatorioPaciente08>pacientes) {
        RelatorioPaciente08 baixa = new RelatorioPaciente08("",'f',0,0,2.00);

        for(RelatorioPaciente08 pessoa: pacientes) {
            if(pessoa.sexo == 'f') {
                if(pessoa.altura < baixa.altura) {
                    baixa = pessoa;
                }
            }
        }
        return baixa.nome;
    }

    public static void main(String[] args) {
        /* cria uma lista de pacientes */
        List<RelatorioPaciente08> pacientes = new ArrayList<RelatorioPaciente08>();


        pacientes.add(new RelatorioPaciente08("Maria Socorro",'f',40,67,1.60);
        pacientes.add(new RelatorioPaciente08("João Gomes",'m',55,80,1.87));
        pacientes.add(new RelatorioPaciente08("Antônio da Silva",'m', 60,79F, 1.87));
        pacientes.add(new RelatorioPaciente08("Adriana Lima",'f', 42, 79, 1.68));


        System.out.println("Quantidade de pacientes: " + pacientes.size());
        System.out.println("Média de idade dos homens: " + media_idade_homens(pacientes));
        System.out.println("Quantidade de mulheres com altura entre 1.60 e 1.70 e peso maior que 70kg: " + quantidade_mulheres_altura_peso(pacientes));
        System.out.println("Quantidade de pessoas com idade entre 18 e 25 anos: " + pessoas_idade_entre_18_e_25(pacientes));
        System.out.println("Nome do paciente mais velho: " + paciente_mais_velho(pacientes));
        System.out.println("Nome da mulher mais baixa: " + mulher_mais_baixa(pacientes));

    }

}
