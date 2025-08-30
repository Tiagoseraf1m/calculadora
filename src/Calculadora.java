import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Double valorUm;
        Double valorDois;
        String operacao;
        boolean continuar = true;

        do {
            try {
                System.out.println("Digite o valor um: ");
                valorUm = scanner.nextDouble();

                System.out.println("Digite a operação (+, -, /, *): ");
                operacao = scanner.next();

                System.out.println("Digite o valor dois: ");
                valorDois = scanner.nextDouble();

                Double resultado = realizarCalculo(valorUm, valorDois, operacao);
                if (resultado != null) {
                    System.out.println("Resultado: " + resultado);
                }
            } catch (InputMismatchException ex) {
                System.out.println("Os valores devem ser numéricos!");
                scanner.nextLine();
                continue;
            }

            continuar = verificarNovaOperacao(scanner);
        } while (continuar);

        scanner.close();
    }

    public static boolean verificarNovaOperacao(Scanner sc) {
        System.out.println("Deseja realizar uma nova operação (Sim ou Não): ");
        String resposta = sc.next().trim().toUpperCase(Locale.ROOT);
        return !(resposta.equals("NÃO") || resposta.equals("NAO") || resposta.equals("N"));
    }

    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao) {
        switch (operacao) {
            case "+":
                return valorUm + valorDois;
            case "-":
                return valorUm - valorDois;
            case "/":
                if (valorDois == 0) {
                    System.out.println("Erro: divisão por zero!");
                    return null;
                }
                return valorUm / valorDois;
            case "*":
                return valorUm * valorDois;
            default:
                System.out.println("Operação inválida :(");
                return null;
        }
    }
}