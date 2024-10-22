function solution(n)
{
     var answer = 0;
    // let str = str.split('');
    // for (let i = 0; i < str.length; i++) {
    //     answer += n[i]
    // }
    // return answer;
    return n.toString().split('').reduce((sum, num) => {
      sum + parseInt(num);
    },0)
}
console.log(solution(123));