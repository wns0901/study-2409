function solution(seoul) {
    var answer = '';
    let spot = 0;
    for (let i = 0; i < seoul.length; i++) {
        console.log(i)
        console.log(seoul[i] === 'Kim')
        if (seoul[i] === 'Kim') {
            spot = i;
            // break;
        }
        //     seoul.forEach((e, i) => {
        //     if(e === 'Kim') spot = i;
        //
        // });
    }
    answer = "김서방은" + spot + "에 있다.";
    return answer;

}

console.log(
    solution(["Jane", "Kim"])
)
