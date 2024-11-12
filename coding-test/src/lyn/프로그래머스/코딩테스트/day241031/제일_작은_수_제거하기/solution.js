function solution(arr) {
    if (arr.length === 1) return [-1]; // 길이가 1이면 [-1] 반환
    const min = Math.min(...arr); // 배열의 최소값 찾기
    return arr.filter(num => num !== min); // 최소값 제거 후 반환
}