function solution(arr1, arr2) {
    return arr1.reduce((a, c, i) => {
        const tempArr = []
        c.forEach((e, j) => tempArr.push(e + arr2[i][j]))
        return a.push(tempArr) && a
    }, [])
}