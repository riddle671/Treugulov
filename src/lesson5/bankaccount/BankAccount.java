package lesson5.bankaccount;

public class BankAccount {
    int balans;


    void popolneniescheta(int dobavka) {
        balans += dobavka;


    }

    int snyatiesoscheta(int otbavka) {
        balans -= otbavka;
        return balans;
    }


}

