package models;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class EquityHolding {
    @NonNull String symbol;
    @NonNull Integer shares;
    @NonNull BigDecimal sharePrice;
    @NonNull BigDecimal positionValue;
    @NonNull String open;
    @NonNull String openTime;
    @NonNull String openSource;
    @NonNull String close;
    @NonNull String closeTime;
    @NonNull String closeSource;
    @NonNull String high;
    @NonNull String highTime;
    @NonNull String highSource;
    @NonNull String low;
    @NonNull String lowTime;
    @NonNull String lowSource;
    @NonNull String latestPrice;
    @NonNull String latestSource;
    @NonNull String latestTime;
    @NonNull String latestUpdate;
    @NonNull String latestVolume;
    @NonNull String iexRealtimePrice;
    @NonNull String iexRealtimeSize;
    @NonNull String iexLastUpdated;
    @NonNull String delayedPrice;
    @NonNull String delayedPriceTime;
    @NonNull String oddLotDelayedPrice;
    @NonNull String oddLotDelayedPriceTime;
    @NonNull String extendedPrice;
    @NonNull String extendedChange;
    @NonNull String extendedChangePercent;
    @NonNull String extendedPriceTime;
    @NonNull String previousClose;
    @NonNull String previousVolume;
    @NonNull String change;
    @NonNull String changePercent;
    @NonNull String volume;
    @NonNull String iexMarketPercent;
    @NonNull String iexVolume;
    @NonNull String avgTotalVolume;
    @NonNull String iexBidPrice;
    @NonNull String iexBidSize;
    @NonNull String iexAskPrice;
    @NonNull String iexAskSize;
    @NonNull String iexOpen;
    @NonNull String iexOpenTime;
    @NonNull String iexClose;
    @NonNull String iexCloseTime;
    @NonNull String marketCap;
    @NonNull String peRatio;
    @NonNull String week52High;
    @NonNull String week52Low;
    @NonNull String ytdChange;
    @NonNull String lastTradeTime;
    @NonNull String isUSMarketOpen;
    @NonNull String exchange;
    @NonNull String industry;
    @NonNull String website;
    @NonNull String description;
    @NonNull String CEO;
    @NonNull String employees;
    @NonNull String address;
    @NonNull String address2;
    @NonNull String state;
    @NonNull String city;
    @NonNull String zip;
    @NonNull String country;
    @NonNull String phone;
}
