function solution(numbers) {
    return  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        .filter(n => !numbers.includes(n)) // 받은 넘버스에 만약 0~9 중 없는 놈이 있다면
        .reduce((prev,curr) => prev + curr) // prev 에 넣어서 누적 더하기
}