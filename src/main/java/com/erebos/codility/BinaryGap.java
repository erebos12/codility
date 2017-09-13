package com.erebos.codility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryGap {

    public int solution(int N) {
        String intAsBin = Integer.toBinaryString(N);
        System.out.println("intAsBin: " + intAsBin);
        return getMaxEnclosedGap(intAsBin);
    }

    private int getMaxEnclosedGap(String s){
        int maxBinGap = 0;
        Pattern pattern = Pattern.compile("1(0+)1");
        Matcher matcher = pattern.matcher(s);
        String result;
        int start = 0;
        while(matcher.find(start)){
            result = matcher.group(1);
            if (result.length() > maxBinGap)
                maxBinGap = result.length();
            start++;
        }
        return maxBinGap;
    }
}
