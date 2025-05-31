package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.Event;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader;

/**
 * A simple retail trading agent that reacts to positive news by selling a portion of their position.
 */
public class RetailTradingAgent extends TradingAgent {

    public RetailTradingAgent(Trader t, StockExchange e, NewsBoard n) {
        super(t, e, n);
    }

    @Override
    protected void actOnEvent(Event e, int pos, int price) {
        // Retail strategy: sell half of position when positive news comes
        int quantityToSell = pos / 2;
        if (quantityToSell > 0) {
            exc.submitAsk(t, e.getSecrity().getTicker(), price, quantityToSell);
        }
    }
}
