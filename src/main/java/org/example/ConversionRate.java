package org.example;

public class ConversionRate {
    private String fromCurrency;
    private String toCurrency;
    private String rate;

    public ConversionRate(String fromCurrency, String toCurrency, String rate) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }
}
