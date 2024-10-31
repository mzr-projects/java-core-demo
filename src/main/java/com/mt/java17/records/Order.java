package com.mt.java17.records;

import java.time.LocalDateTime;

public sealed interface Order permits MarketOrder, LimitOrder {
    int units();

    LocalDateTime sentAt();
}
