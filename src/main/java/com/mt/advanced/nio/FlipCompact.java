package com.mt.advanced.nio;

import java.nio.ByteBuffer;

public class FlipCompact {

    public static void main(String[] args) {
        ByteBuffer buf = ByteBuffer.allocate(1000);
        buf.put(new byte[300]);
        System.out.println("buf.position() = " + buf.position());
        System.out.println("buf.limit() = " + buf.limit());

        buf.limit(buf.position()).position(0);
        System.out.println("buf.position() = " + buf.position());
        System.out.println("buf.limit() = " + buf.limit());
    }
}
