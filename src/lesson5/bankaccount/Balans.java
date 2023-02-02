package lesson5.bankaccount;

public class Balans {
    public static void main(String[] args) {
    BankAccount ba = new BankAccount();
        System.out.println(ba.balans);
        ba.balans = 100;
        ba.popolneniescheta(10);
        System.out.println(ba.balans);





    }
}
