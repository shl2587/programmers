def solution(money):
    answer = []
    
    buy = money // 5500
    change = money % 5500
    
    answer.append(buy)
    answer.append(change)
    return answer