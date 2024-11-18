function solution(s) {
    return s.split('').sort((a,b) =>  b.charCodeAt(0) - a.charCodeAt(0)).join("");
}