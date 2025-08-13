public class Conta {

    private String name;
    private int age;
    private double saldo, cheque_especial;


    public void Cliente(String name, int age, double saldo){
        this.name = name;
        this.age = age;
        this.saldo = saldo;
        Cheque();
    }
    public void Cheque(){
        if(this.saldo <= 500) this.cheque_especial = 50.0;
        else this.cheque_especial = saldo/2;
    }
    public void getInfo(){
        System.out.printf("Cliente : %s\nIdade: %d\nSaldo: %.2f\nCheque especial: %.2f", name, age, saldo, cheque_especial);
    }
    public void getSaldo(){
        System.out.printf("Saldo: %.2f\n", saldo + cheque_especial);
    }
    public void getCheque(){
        System.out.printf("Cheque especial: %.2f\n", cheque_especial);
    }
    public void addMoney(int n){
        saldo += n;
        System.out.println("Saldo atual: " + saldo);
    }
    public void getMoney(int saque){
        if(saque > (saldo+cheque_especial)) System.out.println("Saldo e cheque especial insuficientes");
        else if(saque > saldo){
            saque -= saldo;
            saldo = 0;
            cheque_especial -= saque;
            System.out.println("Saldo restante: " + cheque_especial);

        }else{
            saldo -= saque;
            System.out.println("Saldo restante" + saldo);
        }
    }


}
