package ca.yorku.cmg.lob;

import ca.yorku.cmg.lob.stockexchange.StockExchange;

public class pushTest {
    public static void main(String[] args) {
        StockExchange exc = new StockExchange();

        // Load required data files
        exc.readSecurityListfromFile("data/securities.csv");
        exc.readAccountsListFromFile("data/accounts.csv");

        // Trigger the news board events — this activates the Observer pattern
        exc.getNewsBoard().runEventsList();

        // Optional: Print resulting bids/asks
        System.out.println("== Bid Table ==");
        System.out.println(exc.printBidTable(true));

        System.out.println("== Ask Table ==");
        System.out.println(exc.printAskTable(true));
    }
}
