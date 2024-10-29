function solution(n) {

    const numbers = Array.from({length:n-1},(_,i)=>i+1);

    const valid = numbers.filter(x=>n%x===1);

    return valid[0];
}