import java.util.ArrayList;
import java.util.HashMap;

// Stock class
class Stock {
    // Properties
    String companyName, symbol;
    double currentPrice;
    int[] historicalPrices = new int[10];
    
    // Constructor
    public Stock(String companyName, String symbol, double currentPrice, int[] historicalPrices) {
        this.companyName = companyName;
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        this.historicalPrices = historicalPrices;
    }

    // Getters
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

// StockMarket class
class StockMarket {
    // Properties
    ArrayList<Stock> market;

    // Constructor
    public StockMarket(ArrayList<Stock> market) {
        this.market = market;
    }

    public void updatePrices() {
        for (Stock stock : market) {
            double change = (Math.random() - 0.5) * 10;
            stock.currentPrice += change;
        }
    }

    public void buyStock(String symbol, int shares, User user) {
        for (Stock stock : market) {
            if (stock.getSymbol().equals(symbol)) {
                user.buyShares(stock, shares);
                break;
            }
        }
    }

    public void sellStock(String symbol, int shares, User user) {
        for (Stock stock : market) {
            if (stock.getSymbol().equals(symbol)) {
                user.sellShares(stock, shares);
                break;
            }
        }
    }

    public double calculatePortfolioValue(User user) {
        double totalValue = 0;
        for (Stock stock : market) {
            totalValue += stock.getCurrentPrice() * user.getShares(stock);
        }
        return totalValue;
    }

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

// User class
class User {
    private HashMap<Stock, Integer> holdings = new HashMap<>();

    public void buyShares(Stock stock, int shares) {
        holdings.put(stock, holdings.getOrDefault(stock, 0) + shares);
    }    

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

    public int getShares(Stock stock) {
        return holdings.getOrDefault(stock, 0);
    }
}

public class q9 {
    public static void main(String[] args) {
        // Create some stocks
        Stock apple = new Stock("Apple Inc.", "AAPL", 150.0, new int[]{150, 148, 149, 147, 150, 151, 152, 153, 150, 148});
        Stock google = new Stock("Alphabet Inc.", "GOOGL", 2800.0, new int[]{2800, 2780, 2790, 2805, 2810, 2820, 2830, 2815, 2800, 2795});
        Stock microsoft = new Stock("Microsoft Corp.", "MSFT", 300.0, new int[]{300, 298, 299, 297, 300, 302, 304, 305, 300, 298});

        // Add stocks to the market
        ArrayList<Stock> market = new ArrayList<>();
        market.add(apple);
        market.add(google);
        market.add(microsoft);
        StockMarket stockMarket = new StockMarket(market);

        // Create some users
        User rauf = new User();
        User umar = new User();
        User ahsan = new User();

        // Users buy some stocks
        stockMarket.buyStock("AAPL", 10, rauf);
        stockMarket.buyStock("GOOGL", 5, umar);
        stockMarket.buyStock("MSFT", 15, ahsan);

        // Display portfolio values
        System.out.println("Rauf's portfolio value: $" + stockMarket.calculatePortfolioValue(rauf));
        System.out.println("Umar's portfolio value: $" + stockMarket.calculatePortfolioValue(umar));
        System.out.println("Ahsan's portfolio value: $" + stockMarket.calculatePortfolioValue(ahsan));

        // Update stock prices
        stockMarket.updatePrices();

        // Display portfolio values after price update
        System.out.println("After price update:");
        System.out.println("Rauf's portfolio value: $" + stockMarket.calculatePortfolioValue(rauf));
        System.out.println("Umar's portfolio value: $" + stockMarket.calculatePortfolioValue(umar));
        System.out.println("Ahsan's portfolio value: $" + stockMarket.calculatePortfolioValue(ahsan));

        // Users sell some stocks
        stockMarket.sellStock("AAPL", 5, rauf);
        stockMarket.sellStock("GOOGL", 2, umar);
        stockMarket.sellStock("MSFT", 10, ahsan);

        // Display portfolio values after selling
        System.out.println("After selling stocks:");
        System.out.println("Rauf's portfolio value: $" + stockMarket.calculatePortfolioValue(rauf));
        System.out.println("Umar's portfolio value: $" + stockMarket.calculatePortfolioValue(umar));
        System.out.println("Ahsan's portfolio value: $" + stockMarket.calculatePortfolioValue(ahsan));
    }
}
