package com.mt.inheritance.interfaces;

import java.util.List;

public class CountData implements ICount<Integer>{

    public Integer count(List<Integer> list) {
        return list.size();
    }
}
