package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader;

public class InstitutionalAgentFactory implements TradingAgentFactory {

    @Override
    public TradingAgent createTradingAgent(Trader t, StockExchange e, NewsBoard n) {
        return new InstitutionalTradingAgent(t, e, n);
    }
}
