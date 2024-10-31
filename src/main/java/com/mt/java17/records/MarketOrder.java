package com.mt.java17.records;


import java.time.LocalDateTime;

public record MarketOrder(int units, LocalDateTime sentAt) implements Order {

}
