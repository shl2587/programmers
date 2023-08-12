function solution(num_list) {
    var answer = []
    let count1 = 0
    let count2 = 0
    for (let i in num_list) {
        if (num_list[i] % 2 == 0) {
            count1++
        }
        else {
            count2++
        }
    }
    answer[0] = count1
    answer[1] = count2
    return answer;
}