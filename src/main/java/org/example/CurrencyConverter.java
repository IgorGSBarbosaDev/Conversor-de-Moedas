package org.example;

import java.net.http.*;
import java.net.URI;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CurrencyConverter {
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/";

    public double fetchConversionRate(String fromCurrency, String toCurrency){
        String url = API_URL + fromCurrency;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> json = objectMapper.readValue(response.body(), Map.class);
        Map<String, Double> rates = (Map<String, Double>) json.get("rates");

        if (!rates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Moeda de destino inválida ou não encontrada.");
        }
        return rates.get(toCurrency);
    }

    public double convert(double amount, double rate) {
        return amount * rate;
    }
}
