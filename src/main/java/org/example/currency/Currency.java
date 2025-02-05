package org.example.currency;

public class Currency {
    private String code; // Código da moeda (ex: USD, EUR)
    private String name;

    public Currency(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
