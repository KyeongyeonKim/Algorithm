function solution(a, b) {
    var answer = a.toString()+ b;
    let sum = 2*a*b;
    if(answer >= sum) return Number(answer);
    else return sum;
}
