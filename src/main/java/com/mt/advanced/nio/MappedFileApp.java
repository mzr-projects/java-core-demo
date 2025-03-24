package com.mt.advanced.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedFileApp {

    public static void main(String[] args) throws IOException {

        /*
         * Bytes we want to write
         * */
        int length = 128 * 1024 * 1024;

        try (
                RandomAccessFile file = new RandomAccessFile("file.out", "rw");
                FileChannel channel = file.getChannel()
        ) {

            /*
             * With this MappedByteBuffer we open a portion of the file, but here we give the whole length of
             * the file to open, so we're opening the whole file.
             * */
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, length);

            for (int i = 0; i < length; i++) {
                buffer.put((byte) 42);
            }

            System.out.println("Forcing out put before closing.");
            buffer.force();
            System.out.println("... DONE!");
        }
    }
}
