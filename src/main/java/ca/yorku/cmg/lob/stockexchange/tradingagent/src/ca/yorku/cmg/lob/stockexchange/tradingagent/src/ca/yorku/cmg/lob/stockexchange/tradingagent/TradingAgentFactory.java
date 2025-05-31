package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader;

public interface TradingAgentFactory {
    TradingAgent createTradingAgent(Trader t, StockExchange e, NewsBoard n);
}
