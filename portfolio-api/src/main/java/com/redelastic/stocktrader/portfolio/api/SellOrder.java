package com.redelastic.stocktrader.portfolio.api;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Value;

@Value
@JsonDeserialize
public class SellOrder {

    String portfolioId;

    String stockSymbol;

    int shares;
}
