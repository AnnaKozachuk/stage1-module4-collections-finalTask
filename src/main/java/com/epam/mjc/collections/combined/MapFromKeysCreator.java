package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            int keyLength = entry.getKey().length();
            resultMap.computeIfAbsent(keyLength, k -> new TreeSet<>()).add(entry.getKey());
        }
        return resultMap;
    }
}
