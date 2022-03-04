package com.company.naver;
/**
 * 이진수로 바꿔서 1의 갯수 리턴
 * 22.03.04
 * **/
public class Solution2220304 {
    public int solution(int A, int B) {

        String binary = Integer.toBinaryString(A * B);
        return binary.length() - binary.replace(String.valueOf('1'), "").length();

    }
}
