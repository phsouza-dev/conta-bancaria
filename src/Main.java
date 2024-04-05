import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeUsuario = "Paulo Henrique";
        String tipoDaConta = "Corrente";
        double saldoDaConta = 0;
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        System.out.println("****************************************************************");
        System.out.println("\nNome: " + nomeUsuario);
        System.out.println("Tipo da conta: " + tipoDaConta);
        System.out.println("Saldo: " + saldoDaConta);
        System.out.println("\n****************************************************************");

        String menu = """
                \n** Operações disponíveis: **
                1 - Consultar saldo
                2 - Depositar valor
                3 - Transferir valor
                4 - Sair
                
                Digite uma operação:
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo da conta é R$" + saldoDaConta + ".");
            } else if (opcao == 2) {
                System.out.println("Insira o valor do depósito:");
                double valorDeposito  = leitura.nextDouble();
                if (valorDeposito > 0) {
                    saldoDaConta += valorDeposito;
                    System.out.println("Saldo atualizado. Seu novo saldo é R$ " + saldoDaConta + ".");
                } else {
                    System.out.println("O valor do depósito deve ser maior que 0.");
                }
            } else if (opcao == 3) {
                System.out.println("Insira o valor a ser transferido:");
                double valorTransferencia = leitura.nextDouble();
                if (valorTransferencia > 0) {
                    if (valorTransferencia <= saldoDaConta) {
                        saldoDaConta -= valorTransferencia;
                        System.out.println("Saldo atualizado. Seu novo saldo é R$ " + saldoDaConta + ".");
                    } else {
                        System.out.println("Não há saldo suficiente para realizar essa transferência.");
                    }
                } else {
                    System.out.println("O valor de transferência deve ser maior que 0.");
                }
            } else if (opcao != 4){
                System.out.println("Opcão inválida.");
            }
        }
        System.out.println("Agradecemos a preferência. Volte sempre!");
    }
}