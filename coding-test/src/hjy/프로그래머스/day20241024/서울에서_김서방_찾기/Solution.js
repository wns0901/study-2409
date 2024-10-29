function solution(seoul) {
    var answer = '';
    let spot = 0;
    for(e of seoul){
        if(seoul[e] === 'Kim'){
            spot = e;
            break;
        }


    }
    answer = "김서방은" + spot +"에 있다."
    return answer;
}