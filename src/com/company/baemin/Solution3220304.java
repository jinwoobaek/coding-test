package com.company.baemin;
/**
 * 배열에서 절대값 같은 숫자중에 제일 큰 숫자 찾는 문제
 * 22.03.04
 * **/
import java.util.Arrays;

public class Solution3220304 {
    public int solution(int[] A) {
        Arrays.sort(A);

        for (int i = A.length - 1; i > 0; i--) {
            if (Arrays.binarySearch(A, A[i] * -1) > -1) {
                return A[i];
            }
        }

        return 0;
    }
}
