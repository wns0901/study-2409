function solution() {
    var answer = -1;
    const countPrice = price*count*(count+1) / 2;
    const change = countPrice - money;
    answer = Math.max(change, 0)
    return answer;
}