function solution(a, b) {
    const [start, end] = a < b ? [a, b] : [b, a];
    
    let answer = 0;
    
    for (let i = start; i <= end; i++) {
        answer += i;
    }
    
    return answer;
}