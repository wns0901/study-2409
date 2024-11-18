function solution(s) {
    let c = s.length;

    if (c % 2 === 1) {
        return s.charAt(Math.floor(c / 2));
    } else {
        return s.substring(c / 2 - 1, c / 2 + 1);
    }
}
