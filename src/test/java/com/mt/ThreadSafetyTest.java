package com.mt;

import com.mt.concurrency.visibility.Confinement;
import net.jcip.annotations.ThreadSafe;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

public class ThreadSafetyTest {
    public static final int THREADS = 4;
    public static final int UPTO = 1_000_000;

    @Test
    public void testConcurrentAccess() throws Exception {

        //SuperSimpleGCParser.showGCLogSummaryAtExit();
        long time = System.currentTimeMillis();
        Confinement df = new Confinement();
        Collection<Future<String>> futures = new ArrayList<>();

        try (ExecutorService pool = Executors.newCachedThreadPool()) {
            for (int i = 0; i < THREADS; i++) {
                futures.add(pool.submit(() ->
                {
                    String now = "2024-07-15";
                    for (int j = 0; j < UPTO; j++) {
                        String parseFormat = Confinement.formatByDateTimeFormatter(new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                        assertEquals(now, parseFormat);
                    }
                    return "OK";
                }));
            }

            for (Future<String> future : futures) {
                assertEquals("OK", future.get());
            }

            time = System.currentTimeMillis() - time;
            pool.shutdown();
            assertTrue(
                    "pool did not shut down in the expected time",
                    pool.awaitTermination(100, TimeUnit.MILLISECONDS)
            );
        }

        System.out.println(STR."time = \{time}");
    }

    private void assertTrue(String s, boolean b) {
    }

    @Test
    public void testClassStructure() throws InterruptedException {
        boolean found = false;
        for (Field field : Confinement.class.getDeclaredFields()) {
            if (field.getType() == ThreadLocal.class) {
                found = true;
                if (!Modifier.isStatic(field.getModifiers())) {
                    fail("ThreadLocal field should be static");
                }
            }
        }
        assertTrue("Could not find thread local field", found);
    }

    @Test
    public void testAnnotation() throws InterruptedException {
        assertNotNull("Class should be annotated as @ThreadSafe",
                (Supplier<String>) Confinement.class.getAnnotation(ThreadSafe.class));
    }
}
