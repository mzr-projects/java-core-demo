package com.mt.java17.records;

import java.time.LocalDateTime;

public record LimitOrder(int units, double price, LocalDateTime sentAt) implements Order {

}
