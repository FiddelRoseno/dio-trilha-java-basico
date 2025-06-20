import java.util.Scanner;
import java.util.regex.Pattern;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numeroConta = getInput(scanner, "Por favor, digite o número da Conta (ex: 14548-4):", "Número da Conta inválido. Formato esperado: XXXXX-X", "\\d{5}-\\d{1}");
        String agencia = getInput(scanner, "Por favor, digite o número da Agência (ex: 1234):", "Número da Agência inválido. Formato esperado: XXXX", "\\d{4}");
        String nomeCliente = getInput(scanner, "Por favor, digite o seu Nome Completo:", "Nome inválido. Tente novamente.", null);

        // Saldo (aceita ponto ou vírgula)
        double saldo = 0;
        while (true) {
            System.out.println("Por favor, digite o valor do Saldo inicial:");
            String saldoStr = scanner.nextLine().trim().replace(",", ".");
            try {
                saldo = Double.parseDouble(saldoStr);
                if (saldo < 0) {
                    System.out.println("O saldo não pode ser negativo. Tente novamente.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido para o saldo. Digite um número válido (ex: 1000,50 ou 1000.50).");
            }
        }

        // Mensagem final
        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco Santander, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numeroConta, saldo
        );

        System.out.println(mensagem);
        scanner.close();
    }

    private static String getInput(Scanner scanner, String prompt, String errorMessage, String regexPattern) {
        String input;
        while (true) {
            System.out.println(prompt);
            input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                if (regexPattern != null && !Pattern.matches(regexPattern, input)) {
                    System.out.println(errorMessage);
                } else {
                    break;
                }
            } else {
                System.out.println(errorMessage);
            }
        }
        return input;
    }
}

