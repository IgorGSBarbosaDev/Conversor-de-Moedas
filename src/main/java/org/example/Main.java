package org.example;

import org.example.conversion.ConversionHistory;
import org.example.currency.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CurrencyConverter converter = new CurrencyConverter();
            ConversionHistory history = new ConversionHistory();
            System.out.println("BRL - Real");
            System.out.println("USD - Dólar Americano");
            System.out.println("EUR - Euro");
            System.out.println("JPY - Iene Japonês");

            System.out.print("Insira a moeda de origem(ex: USD): ");
            String fromCurrency = scanner.nextLine();

            System.out.print("Insira a moeda para conversão (por exemplo, BRL): ");
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