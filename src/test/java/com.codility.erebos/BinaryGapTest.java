package com.codility.erebos;

import com.erebos.codility.BinaryGap;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BinaryGapTest {

    private BinaryGap binaryGap = new BinaryGap();

    @Test
    public void test01(){
        assertThat(binaryGap.solution(125), is(1));
    }

    @Test
    public void test02(){
        assertThat(binaryGap.solution(16757), is(5));
    }

    @Test
    public void test03(){
        assertThat(binaryGap.solution(1041), is(5));
    }

    @Test
    public void test04(){
        assertThat(binaryGap.solution(15), is(0));
    }
}
