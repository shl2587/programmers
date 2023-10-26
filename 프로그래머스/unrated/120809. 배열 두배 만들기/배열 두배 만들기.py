def solution(numbers):
    answer = []
    
    length = len(numbers)
    
    for i in range(length):
        answer.append(numbers[i] * 2)
    return answer