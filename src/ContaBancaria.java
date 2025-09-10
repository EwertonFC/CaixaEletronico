import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        String nomeUsuario = "Ewerton";
        String tipoConta = "Corrente";
        int saldoInicial = 2100;

        System.out.println("********************************************\n" +
                "Dados iniciais do cliente:\n\n" +
                "Nome:                 " + nomeUsuario + "\n" +
                "Tipo de conta:        " + tipoConta + "\n" +
                "Saldo inicial:        " + saldoInicial + "\n" +
                "********************************************\n\n");

        System.out.println("Operações:\n\n" +
                "1- Consultar Saldos\n" +
                "2- Receber Valor\n" +
                "3- Transferir Valor\n" +
                "4- Sair");

    }
}
