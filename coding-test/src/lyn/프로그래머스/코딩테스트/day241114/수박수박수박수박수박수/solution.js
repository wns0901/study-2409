function solution(n) {
    return Array.
    from({ length: n }, (_, i)
        => i % 2 === 0 ? '수' : '박').join('');
}