package org.example.conversion;
import java.sql.*;

public class ConversionHistory {
    private Connection connection;

    public ConversionHistory() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/currency_converter", "root", "1234");
    }

    public void saveConversion(String fromCurrency, String toCurrency, double amount, double convertedAmount, double rate) throws SQLException {
        String query = "INSERT INTO conversion_history (from_currency, to_currency, amount, converted_amount, conversion_rate) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, fromCurrency);
            statement.setString(2, toCurrency);
            statement.setDouble(3, amount);
            statement.setDouble(4, convertedAmount);
            statement.setDouble(5, rate);
            statement.executeUpdate();
        }
    }
    public void printHistory() throws SQLException {
        String query = "SELECT * FROM conversion_history";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.printf("From: %s, To: %s, Amount: %.2f, Converted: %.2f, Rate: %.6f, Date: %s\n",
                        rs.getString("from_currency"),
                        rs.getString("to_currency"),
                        rs.getDouble("amount"),
                        rs.getDouble("converted_amount"),
                        rs.getDouble("conversion_rate"),
                        rs.getTimestamp("conversion_date"));
            }
        }
    }
}
