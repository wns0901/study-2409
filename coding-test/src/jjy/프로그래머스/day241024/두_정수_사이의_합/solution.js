function solution(a, b) {
    const [min, max] = [a,b].sort((a, b) => a - b)

    return (max * (max + 1) - (min - 1) * min) / 2;
}