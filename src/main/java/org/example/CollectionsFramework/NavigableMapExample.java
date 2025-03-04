package org.example.CollectionsFramework;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "One");
        navigableMap.put(5,"Five");
        navigableMap.put(3,"Three");

        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(4));
        System.out.println(navigableMap.ceilingKey(4));
        System.out.println(navigableMap.higherKey(1));
        System.out.println(navigableMap.higherEntry(1));
        System.out.println(navigableMap.descendingMap());
    }
}
