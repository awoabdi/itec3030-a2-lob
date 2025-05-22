package ca.yorku.cmg.lob.stockexchange.tradingagent;

public class RetailTradingAgentFactory extends AbstractTradingAgentFactory {
    @Override
    public INewsObserver create(String strategyType) {
        ITradingStrategy strategy;
        if ("Aggressive".equalsIgnoreCase(strategyType)) {
            strategy = new AggressiveStrategy();
        } else {
            strategy = new ConservativeStrategy();
        }

        return new TradingAgentRetail(strategy);
    }
}
