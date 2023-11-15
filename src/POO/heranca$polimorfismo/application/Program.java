package POO.heranca$polimorfismo.application;

import POO.heranca$polimorfismo.entities.Account;
import POO.heranca$polimorfismo.entities.BusinessAccount;
import POO.heranca$polimorfismo.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING

        Account acc2 = bacc;
        Account acc3 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc4 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING

        BusinessAccount acc5 = (BusinessAccount)acc3;
        //Mesmo acc3 tendo instaciado uma bacc, o tipo da váriavel ainda é Account, então para evitar uma
        // incompatibilidade de tipos um casting manual é necessário
        acc5.loan(100.0);
        //Devido a isso a operação loan é possivel, porém ao tentar com acc3 não pode pois ela continua sendo do tipo
        // Account

        // BusinessAccount acc6 = (BusinessAccount)acc4;
        // acc4 instaciou SavingsAccount por isso gera uma ClassCastException ao tentar rodar o programa

        //Verficação
        if (acc4 instanceof BusinessAccount) {
        BusinessAccount acc6 = (BusinessAccount)acc4;
        acc6.loan(200.0);
        System.out.println("Loan!");
        }
        if (acc4 instanceof SavingsAccount) {
        SavingsAccount acc6 = (SavingsAccount)acc4;
        acc6.updateBalance();
        System.out.println("Update!");
        }

        //SOBREPOSIÇÃO, @Override, super keyword

        System.out.println();
        System.out.println("SOBREPOSIÇÃO, @Override, super keyword");
        Account acc7 = new Account(1007, "Alex", 1000.0);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        Account acc8 = new SavingsAccount(1008, "Carla", 1000.0, 0.01);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());

        Account acc9 = new BusinessAccount(1009, "Bruno", 1000.0, 500.0);
        acc9.withdraw(200.0);
        System.out.println(acc9.getBalance());

        //------------------------------------------------POLIMORFISMO------------------------------------------------//

        System.out.println();
        System.out.println("POLIMORFISMO");
        Account x = new Account(1020,"Pedro", 1000.0);
        Account y = new SavingsAccount(1023,"Raphael", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
