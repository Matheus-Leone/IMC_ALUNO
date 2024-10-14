package utilidades;

import entidades.Aluno;

public class FuncoesUteis {

    // Método para verificar o CPF (validação básica de tamanho)
    public boolean verificarCpf(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    // Método para calcular o IMC
    public double calcularImc(double peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }
        return peso / (altura * altura);
    }

    // Método para avaliar o aluno
    public String avaliarAluno(Aluno aluno) {
        if (aluno.getNota() >= 5 && aluno.getPercentualPresenca() >= 75) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
