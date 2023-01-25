package bankaccount;

public class BankAccount {
    int balans;


    int popolneniescheta(int dobavka) {
        balans += dobavka;
        return balans;

    }

    int snyatiesoscheta(int otbavka) {
        balans -= otbavka;
        return balans;
    }


}

