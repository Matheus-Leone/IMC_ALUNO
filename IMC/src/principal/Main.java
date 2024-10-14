package principal;

import entidades.Aluno;
import utilidades.FuncoesUteis;

public class Main {
    public static void main(String[] args) {
        FuncoesUteis funcoes = new FuncoesUteis();

        // Criando um aluno para testar
        Aluno aluno = new Aluno("João Silva", "12345678901", 70.0, 1.75, 6.5, 80);

        // Verificar CPF
        System.out.println("Verificando CPF: " + funcoes.verificarCpf(aluno.getCpf()));

        // Calcular IMC
        double imc = funcoes.calcularImc(aluno.getPeso(), aluno.getAltura());
        System.out.println("IMC do aluno: " + imc);

        // Avaliar aluno
        String resultado = funcoes.avaliarAluno(aluno);
        System.out.println("Resultado da avaliação: " + resultado);
    }
}
