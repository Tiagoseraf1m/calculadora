public class Calculadora {
    public static void main(String[] args) {

        Double valorUm;
        Double valorDois;
        String operacao;
        boolean continuar = true;

    }

    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao) {
        switch (operacao) {
            case "+":
                return valorUm + valorDois;
            case "-":
                return valorUm - valorDois;
            case "/":
                if (valorDois == 0) {

                    return null;
                }
                return valorUm / valorDois;
            case "*":
                return valorUm * valorDois;
            default:

                return null;
        }
    }
}