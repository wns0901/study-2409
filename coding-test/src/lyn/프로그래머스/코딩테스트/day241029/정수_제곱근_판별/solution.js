function solution(n) {
    return Math.sqrt(n) % 1 == 0 ? Math.pow(Math.sqrt(n)+1,2) : -1
}                                      // 두번째 매개변수에는 몇제곱 할건지 써야함 = 2제곱 할거얌
