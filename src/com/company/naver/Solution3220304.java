package com.company.naver;

public class Solution3220304 {
    public String solution(String S, int[] A) {
        String[] strArr = S.split("");
        String result = strArr[0];
        int nextIndex = A[0];
        for (int i = 0; i < A.length; i++) {
            result += strArr[nextIndex];
            nextIndex = A[nextIndex];
            if (A[nextIndex] == 0) {
                return result;
            }

        }
        return result;
    }

}
