function  solution(arr) {
    const min = Math.min(... arr);
    return arr.length === 1 ? [-1] : arr.filter(e => e !== min);
}