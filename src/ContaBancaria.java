import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        String nomeUsuario = "Ewerton";
        String tipoConta = "Corrente";
        double saldo = 2100;
        int opcaoEscolhida = 0;

        System.out.println("********************************************\n" +
                "Dados iniciais do cliente:\n\n" +
                "Nome:                 " + nomeUsuario + "\n" +
                "Tipo de conta:        " + tipoConta + "\n" +
                "Saldo inicial:        " + saldo + "\n" +
                "********************************************\n\n");

        while (opcaoEscolhida != 4) {

            System.out.println("Operações:\n\n" +
                    "1- Consultar Saldos\n" +
                    "2- Receber Valor\n" +
                    "3- Transferir Valor\n" +
                    "4- Sair\n\n" +
                    "Digite a opção desejada: ");

            Scanner leituraOpcaoEscolhida = new Scanner(System.in);
            opcaoEscolhida = leituraOpcaoEscolhida.nextInt();

            if (opcaoEscolhida < 1 || opcaoEscolhida > 4){

                System.out.println("Digite a opção correta.\n");
                System.out.println("-----------------------------");

            } else if (opcaoEscolhida == 1) {

                System.out.println("O saldo atual é: " + saldo + "\n");
                System.out.println("-----------------------------");

            } else if (opcaoEscolhida == 2) {

                System.out.println("Digite o valor a receber: ");
                Scanner leituraValorReceber = new Scanner(System.in);
                double valorReceber = leituraValorReceber.nextDouble();
                saldo += valorReceber;

                System.out.println("Saldo atual atualizado: \n" + (saldo) + "\n");
                System.out.println("-----------------------------");
            } else if (opcaoEscolhida == 3) {

                System.out.println("Informe o valor que deseja transferir: ");
                Scanner leituraValorTransferencia = new Scanner(System.in);
                double valorTransferencia = leituraValorTransferencia.nextDouble();

                if (valorTransferencia > saldo){
                    System.out.println("Não é possível fazer essa transferência. Saldo insuficiente.");
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("Saldo atual atualizado: \n" + (saldo) + "\n");
                }
            } else if (opcaoEscolhida == 4) {
                System.out.println("********************************************\n" +
                        "Dados iniciais do cliente:\n\n" +
                        "Nome:                 " + nomeUsuario + "\n" +
                        "Tipo de conta:        " + tipoConta + "\n" +
                        "Saldo:                " + saldo + "\n" +
                        "********************************************\n\n");

            }
        }
    }
}
