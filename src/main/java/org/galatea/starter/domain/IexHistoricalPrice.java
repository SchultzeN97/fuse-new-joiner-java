package org.galatea.starter.domain;

import java.util.Date;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class IexHistoricalPrice {
    private String symbol;
    private BigDecimal close;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal open;
    private Long volume;
    private Date date;

    public IexHistoricalPrice() {

    }

    public IexHistoricalPrice(String symbol,
                              BigDecimal close,
                              BigDecimal high,
                              BigDecimal low,
                              BigDecimal open,
                              long volume,
                              Date date) {
        this.symbol = symbol;
        this.close = close;
        this.high = high;
        this.low = low;
        this.open = open;
        this.volume = volume;
        this.date = date;
    }

    public IexHistoricalPrice(BigDecimal close,
                               BigDecimal high,
                               BigDecimal low,
                               BigDecimal open,
                               long volume,
                               Date date) {
        this.close = close;
        this.high = high;
        this.low = low;
        this.open = open;
        this.volume = volume;
        this.date = date;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "IexHistoricalPrices{" +
                "symbol='" + symbol + '\'' +
                ", close=" + close +
                ", high=" + high +
                ", low=" + low +
                ", open=" + open +
                ", volume=" + volume +
                ", date=" + date +
                '}';
    }
}

