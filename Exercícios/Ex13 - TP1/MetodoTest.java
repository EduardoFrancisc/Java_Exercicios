import java.util.Scanner;

class MetodoTest {

    // 1 - Crie uma Classe chamada MétodoTest contendo um método main.
    // 2 - Dentro do método main sua classe deverá:
    // 3 - Perguntar ao usuário quantos alunos ele irá inserir.-
    // 4 - Para cada aluno ele deverá perguntar:
    //      a - Digite a nome do X(o) aluno(a);
    //      b - Digite a nota do X(o) aluno(a);
    // 5- Ao final da execução seu programa deverá escrever:
    //      a- A média da turma é {media}:
    //      b- A Maior nota da turma é: {nota}, do aluno {nomeAluno}.

    // Para calcular a média faça:
    
    // 6 - Crie uma classe chamada CalculadoraDeMedias.
    // 7 - Crie um método nessa classe para calcular a média aritmética. Recebendo como parâmetros:
    //      a - O valor total da soma das notas da turma.
    //      b - A quantidade de alunos da turma.
    // 8 - Esse Método deve retornar um Double que é o valor da média.
    // 9 - Seu programa deverá utilizar o método criado para calcular a média.
    // 10 - Em caso de notas iguais entre alunos seu programa deverá imprimir o menor alfabéticamente.

    public static void main(String[] args) {
        int numeroDeAlunos;
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a Quantidade de Alunos:");
        numeroDeAlunos = in.nextInt();

        String[] Nomes = new String[numeroDeAlunos];
        double[] Notas = new double[numeroDeAlunos];
        Aluno[] turma = new Aluno[numeroDeAlunos];

        for (int i = 0; i < numeroDeAlunos; i++) {

            System.out.println("Digite o Nome do " + i + "(o) Aluno:");
            Nomes[i] = in.next();
            System.out.println("Digite a Nota do " + i + "(o) Aluno:");
            Notas[i] = in.nextDouble();
            turma[i] = new Aluno(Nomes[i], Notas[i]);
        }

        CalculadoraDeMedias calculadora = new CalculadoraDeMedias();
        double media = calculadora.calcularMediaAritmetica(turma);

        double maiorNota = turma[0].nota;
        String nomeDaMaiorNota = turma[0].nome;

        for (int i = 0; i < numeroDeAlunos; i++) {
            if (maiorNota < turma[i].nota) {
                maiorNota = turma[i].nota;
                nomeDaMaiorNota = turma[i].nome;
            }
        }

        for (int j = 0; j < numeroDeAlunos; j++) {
            if (maiorNota == turma[j].nota) {
                if (nomeDaMaiorNota.compareTo(turma[j].nome) > turma[j].nome.compareTo(nomeDaMaiorNota)) {
                    nomeDaMaiorNota = turma[j].nome;
                    maiorNota = turma[j].nota;
                }
            }
        }

        System.out.println("Média da turma foi: " + media);
        System.out.println("A Maior nota da turma foi: " + maiorNota + " ,do(a) Aluno(a): " + nomeDaMaiorNota);

        in.close();
    }
}