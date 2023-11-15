package Interfaces.exemplo6.services;

public class BrazilInterestService implements InterestService {

    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public double getInterestRate() {
        return interestRate;
        //Não poderia colocar como default pois, pois este método depende do valor da variável armazenada no serviço,
        // no caso o valor do imposto declarado na classe Program

    }
}
