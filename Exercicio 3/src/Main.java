import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var pet = new Pet("Tuffo");
        var maquina = new Maquina();

        int caso = 0;

        do {
            switch (caso){
                case 0:
                    System.out.println("Digite 1 para dar banho ao pet, 2 para abastecer a agua" +
                        "3 para abastecer shampoo, 4 para verificar nivel de agua, 5 para verificar\n" +
                        "nivel shampoo, 6 para verificar se tem pet no banho, 7 para retirar o pet do banho " +
                        "8 para limpar a maquina, 0 para imprimir o guia novamente e -1 para sair");
                    caso = scanner.nextInt();
                    break;
                case 1:
                    maquina.bath(pet);
                    caso = scanner.nextInt();
                    break;
                case 2:
                    maquina.supplyWater();
                    caso = scanner.nextInt();
                    break;
                case 3:
                    maquina.supplyShampoo();
                    caso = scanner.nextInt();
                    break;
                case 4:
                    System.out.println(maquina.getWater());
                    caso = scanner.nextInt();
                    break;
                case 5:
                    System.out.println(maquina.getShampoo());
                    caso = scanner.nextInt();
                    break;
                case 6:
                    System.out.println(maquina.isOccuped());
                    caso = scanner.nextInt();
                    break;
                case 7:
                    maquina.RemovePet();
                    caso = scanner.nextInt();
                    break;
                case 8:
                    maquina.cleanMaquina();
                    caso = scanner.nextInt();
                    break;
                default:
                    System.out.println("Opção invalida digite novamente algum desses comandos");
                    caso = 0;
                    break;
            }
        } while (caso!=-1);

    }
}