import java.util.Scanner;

public class Desafio {
        public Desafio() {
        }
        public static void main(String[] args) {
            System.out.println("************************************");
            System.out.print("Dados Iniciais do Cliente");
            Scanner entrada = new Scanner(System.in);
            System.out.println("\nQual é o seu nome: ");
            String nome = entrada.nextLine();
            System.out.println("Tipo de conta: ");
            String tipoConta = entrada.nextLine();
            System.out.println("Saldo Inicial: ");
            double saldo = entrada.nextDouble();
            System.out.println("*************************************");
            System.out.println("Nome: " + nome);
            System.out.println("O tipo de conta é: " + tipoConta);
            System.out.println("Saldo inicial é de: " + saldo);
            System.out.println("************************************");
            System.out.println("Operações\n1- Consultar saldo\n2- Receber valor\n3- Transferir valor\n4- Sair\nDigite a opção desejada: ");
            double Opcoes = entrada.nextDouble();
            double ConsultarSaldo = 1.0;
            double ReceberValor = 2.0;
            double Transferir = 3.0;
            if (Opcoes == ConsultarSaldo) {
                System.out.println("Seu saldo atual é de: " + saldo);
            }

            double ValorTransferir;
            if (Opcoes == ReceberValor) {
                System.out.println("Informe o valor a receber: ");
                ValorTransferir = entrada.nextDouble();
                System.out.println("O saldo total é de: " + (ValorTransferir + saldo));
            }

            if (Opcoes == Transferir) {
                System.out.println("Informe o valor a transferir: ");
                ValorTransferir = entrada.nextDouble();
                System.out.println("Saldo restante é de: " + (saldo - ValorTransferir));
            } else {
                System.out.println("Fim das operações");
            }

        }
    }


