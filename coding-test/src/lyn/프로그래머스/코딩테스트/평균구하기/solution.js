function solution(arr) {

    let answer = 0;
    let cnt = 0;

    for (i = 0; i < arr.length; i++) {
        answer += arr[i];
        cnt++;
    }
    answer = answer / cnt;
    return answer;
}


