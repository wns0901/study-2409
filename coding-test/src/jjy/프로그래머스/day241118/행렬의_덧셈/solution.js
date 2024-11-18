function solution(arr1, arr2) {
    return arr1.reduce((a, c, i) => a.push(c.map((e, j) => e + arr2[i][j])) && a, [])
}