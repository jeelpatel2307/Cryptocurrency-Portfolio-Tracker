# Cryptocurrency Portfolio Tracker

This project is a simple Java application that allows users to track their cryptocurrency holdings and calculate the total value of their portfolio based on current cryptocurrency prices.

## Features

- **Add Cryptocurrency**: Users can add cryptocurrencies to their portfolio along with the amount they hold.
- **Remove Cryptocurrency**: Users can remove cryptocurrencies from their portfolio.
- **Calculate Total Portfolio Value**: The application calculates the total value of the portfolio based on the current prices of the cryptocurrencies.

## How to Use

1. **Add Cryptocurrency**: Use the `addCryptocurrency` method to add a cryptocurrency to your portfolio. Provide the name of the cryptocurrency and the amount you hold.
    
    ```java
    tracker.addCryptocurrency("Bitcoin", 2.5);
    
    ```
    
2. **Remove Cryptocurrency**: Use the `removeCryptocurrency` method to remove a cryptocurrency from your portfolio. Provide the name of the cryptocurrency.
    
    ```java
    tracker.removeCryptocurrency("Litecoin");
    
    ```
    
3. **Calculate Total Portfolio Value**: Use the `getTotalValue` method to calculate the total value of your portfolio.
    
    ```java
    double totalValue = tracker.getTotalValue();
    
    ```
    

## Usage

1. Clone the repository:
    
    ```bash
    git clone <https://github.com/yourusername/cryptocurrency-portfolio-tracker.git>
    
    ```
    
2. Open the project in your preferred Java IDE.
3. Run the `CryptocurrencyPortfolioTracker.java` file.

## Dependencies

This project does not have any external dependencies.

## Contributing

Contributions are welcome! Feel free to fork the repository and submit a pull request with any improvements or feature additions.

## Acknowledgements

- Special thanks to [OpenAPI](https://openai.com/) for the project inspiration.

Please replace "yourusername" in the repository URL with your actual GitHub username if you decide to host this project on GitHub.
