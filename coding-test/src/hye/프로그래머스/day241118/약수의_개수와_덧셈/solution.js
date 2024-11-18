function solution() {
    var answer = 0;

    for(let j = left; j <= right; j++) {
        let count = 0;
        for(let i = 1; i <= Math.sqrt(j); i++){
            if(j % i == 0) {
                count++;
                if(i != j / i) {
                    count++;
                }
            }
        }
        if(count % 2 == 0) {
            answer += j;
        } else {
            answer -= j;
        }
    }


    return answer;
}