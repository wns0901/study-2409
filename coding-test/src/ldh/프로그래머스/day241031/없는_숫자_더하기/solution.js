function solution(numbers) {
    let answer = 0;
    const found = new Array(10).fill(false);

    for (let number of numbers) {
        found[number] = true;
    }

    for (let i = 0; i < 10; i++) {
        if (!found[i]) {
            answer += i;
        }
    }

    return answer;
}
