function solution(price, money, count) {
    let total = 0;
    for (let index = 1; index <= count; index++) {
        total += index * price;
    }
    return money - total > 0 ? 0 : (money - total) * -1;
}