package com.mt.concurrency.buildingBlocks;

import java.util.*;

public class BuildingBlocksApp {

    public static void main(String[] args) {

        /*
         * Collections methods are thread-safe
         * */
        List<String> strings = Collections.emptyList();

        /*
         * All synchronized collections synchronized on "this"
         * */
        List<String> safeList = Collections.synchronizedList(new ArrayList<>());
        List<String> safeLinkedList = Collections.synchronizedList(new LinkedList<>());

        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
    }

    public static <E> boolean addIfAbsent(final Collection<E> list, final E e) {
        synchronized (list) {
            if (!list.contains(e)) {
                return list.add(e);
            }
            return false;
        }
    }
}
