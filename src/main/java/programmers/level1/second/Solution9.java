package programmers.level1.second;

import java.util.Arrays;
import java.util.Collections;

public class Solution9 {

    public long solution(long n) {
        // 1. 정수 n을 문자열로 변환
        String str = Long.toString(n);

        // 2. 문자열을 문자 배열로 변환
        Character[] charArray = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        // 3. 문자 배열을 내림차순으로 정렬
        Arrays.sort(charArray, Collections.reverseOrder());

        // 4. 정렬된 문자 배열을 문자열로 다시 합치기
        StringBuilder sortedStr = new StringBuilder();
        for (char c : charArray) {
            sortedStr.append(c);
        }

        // 5. 결과 문자열을 long 타입으로 변환 후 반환
        return Long.parseLong(sortedStr.toString());
    }
}
