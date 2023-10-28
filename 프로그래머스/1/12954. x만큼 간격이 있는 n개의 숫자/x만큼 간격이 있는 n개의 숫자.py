def solution(x, n):
    answer = []
    count = 0
    
    for i in range(0, n):
        count += x
        answer.append(count)
        
    
    return answer