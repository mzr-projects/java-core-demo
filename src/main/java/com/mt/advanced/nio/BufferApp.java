package com.mt.advanced.nio;

import com.mt.designPatterns.structural.flyweight.Pen;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

import static java.nio.ByteOrder.nativeOrder;

public class BufferApp {
    public static void main(String[] args) {

        /*
         * Write to a Buffer
         * */
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byte[] hello = "Hello".getBytes();
        byteBuffer.put(hello);

        /*
         * Read from the Buffer
         * */
        System.out.println("==== position method");
        ByteBuffer read = byteBuffer.limit(byteBuffer.position()).position(0);
        while (read.hasRemaining()) {
            System.out.println((char) read.get());
        }

        /*
         * We can use flip instead of limit and position
         * */
        System.out.println("==== flip method");
        byteBuffer.flip();
        while (byteBuffer.hasRemaining()) {
            System.out.println((char) byteBuffer.get());
        }

        System.out.println(STR."The byteOrder in this machine is : \{nativeOrder()}");
    }

    public static void channelCopy(ReadableByteChannel src, WritableByteChannel dst) throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);

        /*
         * read method will put data into the byteBuffer up until there is no data to put (-1)
         * */
        while (src.read(byteBuffer) != -1) {
            byteBuffer.flip();
            dst.write(byteBuffer);
            byteBuffer.compact();
        }

        byteBuffer.flip();
        while (byteBuffer.hasRemaining()) {
            dst.write(byteBuffer);
        }
    }
}
