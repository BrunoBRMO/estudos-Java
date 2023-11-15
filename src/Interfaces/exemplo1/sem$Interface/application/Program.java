package Interfaces.exemplo1.sem$Interface.application;

import Interfaces.exemplo1.sem$Interface.model.entities.CarRental;
import Interfaces.exemplo1.sem$Interface.model.entities.Vehicle;
import Interfaces.exemplo1.sem$Interface.model.services.BrazilTaxService;
import Interfaces.exemplo1.sem$Interface.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter with rent data: ");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pick up time (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));//Instancia um novo veiculo que recebe carModel

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("Invoice: ");
        System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f",cr.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f",cr.getInvoice().getTotalPayment()));

        sc.close();
    }
}
