package Interfaces.exemplo2.model.services;

import Interfaces.exemplo2.model.entities.Contract;
import Interfaces.exemplo2.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService; //declarando a dependência da Interface

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {

        double basicQuota = contract.getTotalValue() / months;//valor base da parcela
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee; //Valor calculado das parcelas com juros e taxa

            //Para instanciar as "parcelas(installment)" e add a lista contrato installment
            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
