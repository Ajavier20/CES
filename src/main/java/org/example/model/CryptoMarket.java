package org.example.model;

import java.util.ArrayList;

public class CryptoMarket {
    private ArrayList<Cryptocurrency> availableCryptocurrencies;

    public CryptoMarket() {
        this.availableCryptocurrencies = new ArrayList<>();
        initializeCryptocurrencies();
    }

    public ArrayList<Cryptocurrency> initializeCryptocurrencies() {
        Cryptocurrency bitcoin = new Cryptocurrency("001", "BTC", "Bitcoin", 1.0);
        Cryptocurrency ethereum = new Cryptocurrency("002", "ETH", "Ethereum", 2.0);
        Cryptocurrency binanceCoin = new Cryptocurrency("003", "BNB", "Binance Coin", 5.0);
        Cryptocurrency cardano = new Cryptocurrency("004", "ADA", "Cardano", 100.0);
        Cryptocurrency solana = new Cryptocurrency("005", "SOL", "Solana", 10.0);

        availableCryptocurrencies.add(bitcoin);
        availableCryptocurrencies.add(ethereum);
        availableCryptocurrencies.add(binanceCoin);
        availableCryptocurrencies.add(cardano);
        availableCryptocurrencies.add(solana);

        return availableCryptocurrencies;
    }
    public void AvailableCrypto(ArrayList<Cryptocurrency> array) {
        for (Cryptocurrency crypto : array) {
            System.out.println(crypto);
        }
    }

    public ArrayList<Cryptocurrency> getAvailableCryptocurrencies() {
        return availableCryptocurrencies;
    }
}
