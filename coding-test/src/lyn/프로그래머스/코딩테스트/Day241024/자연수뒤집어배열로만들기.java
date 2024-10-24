package lyn.프로그래머스.코딩테스트.Day241024;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {

        // 스트링으로 바꿔서 split("")으로 자르고
        // 다시 int 로 바꿔 배열에 푸쉬해서 순서 꺼꾸루 불러올까..
        //
        String str = Long.toString(n);
        int[] answer = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(str.length() - 1 - i) - '0';
        }
            return answer;

    }
}

/*

function solution(n) {
    return String(n) // 숫자를 문자열로 변환
        .split('')    // 각 자리수를 배열로 분리
        .reverse()    // 배열을 뒤집기
        .reduce((acc, cur) => {
            acc.push(Number(cur)); // 각 문자를 숫자로 변환 후 누적
            return acc;
        }, []); // 초기값으로 빈 배열 설정
}
 */