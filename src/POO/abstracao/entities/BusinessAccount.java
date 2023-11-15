package POO.abstracao.entities;

public class BusinessAccount extends Account {

    private Double loanLimit;
    public BusinessAccount(){
        super(); //Para caso de o construtor padrão da classe Account tenha alguma lógica implementada e eu queira
        // repeti-la na subbclasse
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); //Chamando o construtor da super classe nesse caso Account
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    @Override
    public void withdraw (double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
