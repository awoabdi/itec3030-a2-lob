package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.events.Event;

public class AggressiveStrategy implements ITradingStrategy {

    @Override
    public void actOnEvent(Event e, int pos, int price) {
        if (e.isGoodNews()) {
            System.out.println("Aggressive strategy: this should buy more stock due to good news.");
        } else {
            System.out.println("Aggressive strategy: it will sell large position due to bad news.");
        }
    }
}

