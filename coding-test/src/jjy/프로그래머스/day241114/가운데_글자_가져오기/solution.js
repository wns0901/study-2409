function solution(s) {
    const targetIndex = Math.floor(s.length / 2)
    return s.length % 2 ? s.substr(targetIndex, 1) : s.substr(targetIndex - 1, 2);
}