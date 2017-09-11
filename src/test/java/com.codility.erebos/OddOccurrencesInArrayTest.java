package com.codility.erebos;

import com.erebos.codility.OddOccurrencesInArray;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OddOccurrencesInArrayTest {

    private OddOccurrencesInArray o = new OddOccurrencesInArray();

    @Test
    public void test() {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        assertEquals(7, o.solution(A));
    }

    @Test
    public void test2() {
        int[] A = {9, 3, 9, 3, 9, 9, 4};
        assertEquals(4, o.solution(A));

    }

    @Test
    public void arrayIsEven() {
        int[] A = {9, 3, 9, 3, 9, 7};
        assertEquals(0, o.solution(A));
    }

    @Test
    public void arrayInvalid() {
        int[] A = {0};
        assertEquals(0, o.solution(A));
    }

    @Test
    public void test3() {
        int[] A = {9, 9, 8};
        assertEquals(8, o.solution(A));

    }
}
