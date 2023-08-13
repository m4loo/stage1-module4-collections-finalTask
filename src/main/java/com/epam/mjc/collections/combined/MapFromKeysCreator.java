package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();

        for (Map.Entry<String, Integer> obj : sourceMap.entrySet()) {
            Set<String> set = resultMap.getOrDefault(obj.getKey().length(), new HashSet<>());
            set.add(obj.getKey());
            resultMap.put(obj.getKey().length(), set);
        }
        return resultMap;
    }
}
