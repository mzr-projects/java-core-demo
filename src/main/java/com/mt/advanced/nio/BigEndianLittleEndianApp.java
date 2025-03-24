package com.mt.advanced.nio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class BigEndianLittleEndianApp {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(12);
        buffer.putInt(0x0000003b);
        buffer.putLong(0xfb7126b2d8d5669cL);

        buffer.flip();
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        System.out.printf("0x%08x / %1$d%n",buffer.getInt());
        System.out.printf("0x%016x / %1$d%n",buffer.getInt());

        buffer.rewind();
        buffer.order(ByteOrder.BIG_ENDIAN);
        System.out.printf("0x%08x / %1$d%n",buffer.getInt());
        System.out.printf("0x%016x / %1$d%n",buffer.getInt());


    }
}
