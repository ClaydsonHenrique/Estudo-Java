//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


// Estrutura de repetição FOR

        int numero;
        String log;

        for (numero = 1; numero <= 10; numero +=1) {
            log = "O Número atual é:" + numero + "\n";
            System.out.println(log);
        }

        // caminhando por Arrays

        String[] alunos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA"};
        String newLogs;

        int totalAlunos = alunos.length;

        newLogs = "A lista de chamadas possui" + totalAlunos + "alunos\n";
        System.out.println(newLogs);

        int matricula;

        for( int posicao = 0; posicao < totalAlunos; posicao ++) {
            matricula = posicao + 1;
            newLogs = "matricula:" + matricula + "Aluno:" + alunos[posicao] + "\n";
            System.out.println(newLogs);
        }

// Estrutura repetição WHILE

        String[] inscritos = {"MARCOS", "ALINE", "LUCAS", "PATRICIA", "JOAO", "FELIPE",
        "LUCIA","ANTONIO", "FERNANDA", "MARCELA", "VITOR", "BEATRIZ", "JORGE", "JULIA"};

        final int numerosVagas = 10;

        String[] vagas = new String[numerosVagas];

        int vagaAtual = 0;

        String inscrito = "indefinido";
        String logInscrito;

        while (vagaAtual < numerosVagas) {
            inscrito = inscritos[vagaAtual];
            logInscrito = "Adicnianando a inscrição:" + inscrito + "Na vaga" + (vagaAtual + 1) + "\n";
            vagas[vagaAtual] = inscrito;
            vagaAtual += 1;
            System.out.println(logInscrito);
        }

    }
}