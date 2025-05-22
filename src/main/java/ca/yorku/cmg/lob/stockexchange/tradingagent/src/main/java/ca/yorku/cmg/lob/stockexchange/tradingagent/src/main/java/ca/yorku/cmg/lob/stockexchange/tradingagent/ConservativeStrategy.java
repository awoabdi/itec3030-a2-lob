package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.events.Event;

public class ConservativeStrategy implements ITradingStrategy {

    @Override
    public void actOnEvent(Event e, int pos, int price) {
        if (e.isGoodNews()) {
            System.out.println("Conservative strategy: BUY a small amount of stock.");
        } else {
            System.out.println("Conservative strategy: SELL a small position due to bad news.");
        }
    }
}
