package com.erebos.codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        int MAX = 1000000;
        if (!isNbrOfArrayValid(A)) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int c = 0;
        for (int i : A) {
            c++;
            if (c == MAX){
                break;
            }
            if (map.get(i) != null) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

    private boolean isNbrOfArrayValid(int[] array) {
        int MIN = 1;
        if (array.length < MIN) {
            return false;
        }
        if (array.length % 2 == 0) {
            return false;
        }
        return true;
    }
}
