import java.util.ArrayList;
import java.util.HashMap;

// The Stock class holds the details about a stock: company name, symbol, current price, and past prices.
class Stock {
    String companyName, symbol; // Company name and stock symbol
    double currentPrice; // Current stock price
    int[] historicalPrices = new int[10]; // Array for last 10 prices

    // Constructor to create a new stock
    public Stock(String companyName, String symbol, double currentPrice, int[] historicalPrices) {
        this.companyName = companyName;
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        this.historicalPrices = historicalPrices;
    }

    // Getter methods to access the stock's details
    public String getCompanyName() {
        return companyName;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public int[] getHistoricalPrices() {
        return historicalPrices;
    }
}

// The StockMarket class manages a bunch of stocks and simulates the market.
class StockMarket {
    ArrayList<Stock> market; // List to hold all stocks

    // Constructor to create a stock market with a list of stocks
    public StockMarket(ArrayList<Stock> market) {
        this.market = market;
    }

    // Method to randomly update stock prices
    public void updatePrices() {
        for (Stock stock : market) {
            double change = (Math.random() - 0.5) * 10; // Random change between -5 and +5
            stock.currentPrice += change;
        }
    }

    // Method to let users buy stocks
    public void buyStock(String symbol, int shares, User user) {
        for (Stock stock : market) {
            if (stock.getSymbol().equals(symbol)) {
                user.buyShares(stock, shares);
                break;
            }
        }
    }

    // Method to let users sell stocks
    public void sellStock(String symbol, int shares, User user) {
        for (Stock stock : market) {
            if (stock.getSymbol().equals(symbol)) {
                user.sellShares(stock, shares);
                break;
            }
        }
    }

    // Method to calculate the total value of a user's portfolio
    public double calculatePortfolioValue(User user) {
        double totalValue = 0;
        for (Stock stock : market) {
            totalValue += stock.getCurrentPrice() * user.getShares(stock);
        }
        return totalValue;
    }

    // Method to calculate the moving average of a stock's price
    public double calculateMovingAverage(String symbol, int days) {
        for (Stock stock : market) {
            if (stock.getSymbol().equals(symbol)) {
                int[] historicalPrices = stock.getHistoricalPrices();
                int sum = 0;
                for (int i = 0; i < days && i < historicalPrices.length; i++) {
                    sum += historicalPrices[i];
                }
                return (double) sum / days;
            }
        }
        return 0;
    }
}

// The User class keeps track of a user's stock holdings
class User {
    private HashMap<Stock, Integer> holdings = new HashMap<>(); // Map to store stock and number of shares

    // Method to buy shares of a stock
    public void buyShares(Stock stock, int shares) {
        holdings.put(stock, holdings.getOrDefault(stock, 0) + shares);
    }

    // Method to sell shares of a stock
    public void sellShares(Stock stock, int shares) {
        if (holdings.containsKey(stock)) {
            int currentShares = holdings.get(stock);
            if (currentShares > shares) {
                holdings.put(stock, currentShares - shares);
            } else {
                holdings.remove(stock);
            }
        }
    }

    // Method to get the number of shares of a specific stock
    public int getShares(Stock stock) {
        return holdings.getOrDefault(stock, 0);
    }
}
