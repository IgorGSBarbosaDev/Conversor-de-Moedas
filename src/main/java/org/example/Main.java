package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CurrencyConverter converter = new CurrencyConverter();
            ConversionHistory history = new ConversionHistory();

            System.out.print("Insira a moeda para conversão (por exemplo, USD): ");
            String fromCurrency = scanner.nextLine();

            System.out.print("Insira a moeda para conversão (por exemplo, EUR): ");
            String toCurrency = scanner.nextLine();

            System.out.print("Digite a quantia: ");
            double amount = scanner.nextDouble();

            double rate = converter.fetchConversionRate(fromCurrency, toCurrency);
            double convertedAmount = converter.convert(amount, rate);

            System.out.printf("Taxa de conversão: %.6f\n", rate);
            System.out.printf("Valor convertido: %.2f %s\n", convertedAmount, toCurrency);

            history.saveConversion(fromCurrency, toCurrency, amount, convertedAmount, rate);

            System.out.println("\nConversion History:");
            history.printHistory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}