function solution(s) {
    return s.toLowerCase().split('').reduce((a, c, i, arr) => {
        (c === 'p' || c === 'y') && (a[c] ? a[c] += 1 : a[c] = 1);

        return i === arr.length - 1 ?  a.p === a.y : a;
    }, {})
}