def solution(n):
    answer = 0
    for i in range(0, n):
        i += 1  
        if (n % i == 0):
            answer += i
    return answer