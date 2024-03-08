import java.util.HashMap;
import java.util.Map;

public class CryptocurrencyPortfolioTracker {
    
    private Map<String, Double> portfolio;
    
    public CryptocurrencyPortfolioTracker() {
        portfolio = new HashMap<>();
    }
    
    public void addCryptocurrency(String name, double amount) {
        if (portfolio.containsKey(name)) {
            double currentAmount = portfolio.get(name);
            portfolio.put(name, currentAmount + amount);
        } else {
            portfolio.put(name, amount);
        }
    }
    
    public void removeCryptocurrency(String name) {
        if (portfolio.containsKey(name)) {
            portfolio.remove(name);
        } else {
            System.out.println("Cryptocurrency not found in portfolio.");
        }
    }
    
    public double getTotalValue() {
        double totalValue = 0;
        for (Map.Entry<String, Double> entry : portfolio.entrySet()) {
            String name = entry.getKey();
            double amount = entry.getValue();
            // Assuming you have a method to get the current price of the cryptocurrency
            double price = getCurrentPrice(name);
            totalValue += amount * price;
        }
        return totalValue;
    }
    
    // Method to get the current price of a cryptocurrency
    private double getCurrentPrice(String name) {
        // Placeholder method - you should implement this according to your requirements
        return 0;
    }
    
    public static void main(String[] args) {
        CryptocurrencyPortfolioTracker tracker = new CryptocurrencyPortfolioTracker();
        
        // Adding cryptocurrencies to the portfolio
        tracker.addCryptocurrency("Bitcoin", 2.5);
        tracker.addCryptocurrency("Ethereum", 5.0);
        
        // Removing a cryptocurrency from the portfolio
        tracker.removeCryptocurrency("Litecoin");
        
        // Getting the total value of the portfolio
        double totalValue = tracker.getTotalValue();
        System.out.println("Total Portfolio Value: $" + totalValue);
    }
}
