package lyn.프로그래머스.코딩테스트.day241024;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;

        for (char c : s.toCharArray()) {
        if (c == 'p' || c == 'P') {
            p++;
        } else if (c == 'y' || c == 'Y') {
            y++;
        }
    }

    // p와 y의 개수가 같거나 둘 다 0이면 true, 그렇지 않으면 false
        return p == y;
}


    //대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
    // s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
    // 다르면 False를 return 하는 solution를 완성하세요.
    // 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
    // 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다. -> IgnoreCase
    //
    //예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

}

//function solution(s) {
//    // 문자열을 소문자로 변환해 'p'와 'y'의 개수를 세기
//    const lowerStr = s.toLowerCase();
//    let pCount = 0;
//    let yCount = 0;
//
//    for (let char of lowerStr) {
//        if (char === 'p') pCount++;
//        else if (char === 'y') yCount++;
//    }
//
//    // p와 y의 개수가 같거나 둘 다 0인 경우 true 반환
//    return pCount === yCount;
//}































