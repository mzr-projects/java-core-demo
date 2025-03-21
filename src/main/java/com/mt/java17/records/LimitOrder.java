package com.mt.java17.records;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
public record LimitOrder(int units, double price, LocalDateTime sentAt) implements Order {

    /*
     * Compact constructor in records, there is no need to specify the fields
     * */
    public LimitOrder {
        log.info("We are in compact constructor.");
    }

    public int addToUnit(int add) {
        return this.units + add;
    }
}
