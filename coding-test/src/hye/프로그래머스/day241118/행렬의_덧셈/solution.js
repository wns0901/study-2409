function solution() {
    return arr1.map((row, i) => row.map((e, j) => e + arr2[i][j]));
}