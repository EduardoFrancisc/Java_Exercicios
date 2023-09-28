public class CalculadoraDeMedias {
    double calcularMediaAritmetica(Aluno[] turma) {
        double somaNota = 0.0;
        for (int i = 0; i < turma.length; i++) {
            somaNota += turma[i].nota;
        }
        return somaNota / turma.length;
    }
}