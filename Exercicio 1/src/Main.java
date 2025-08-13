import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String name = scanner.next();
        System.out.println("Qual sua idade?");
        int age = scanner.nextInt();
        System.out.println("Qual seu saldo inicial?");
        double saldo = scanner.nextDouble();
        var cliente = new Conta();
        cliente.Cliente(name, age, saldo);
        cliente.getInfo();
        int caso = 0;
        do {
            switch (caso) {
                case 0:
                    System.out.println("Digite 1 para consultar saldo\nDigite 2 para consultar cheque especial\nDigite 3 para depositar dinheiro\n" +
                            "Digite 4 para sacar dinheiro\nDigite 5 para pagar um boleto\nDigite 6 para verificar se a conta está utilizando cheque especial\n" +
                            "Digite -1 para sair");
                    caso = scanner.nextInt();
                    break;
                case 1:
                    cliente.getSaldo();
                    caso = scanner.nextInt();
                    break;
                case 2:
                    cliente.getCheque();
                    caso = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Qual sera o valor depositado?");
                    int n = scanner.nextInt();
                    cliente.addMoney(n);
                    caso = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Qual sera o valor sacado?");
                    int saque = scanner.nextInt();
                    cliente.getMoney(saque);
                    caso = scanner.nextInt();
                    break;
            }
        }while(caso != -1);
    }
 }

