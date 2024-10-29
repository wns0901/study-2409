function solution(a, b) {
    const min = Math.min(a, b);
    const max = Math.max(a, b);

    return Array.from(Array(max-min+1).keys()).
    map(num=>num+min).
    reduce((sum, num) => sum + num, 0);


}