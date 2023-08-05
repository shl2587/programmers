def solution(array, height):
    answer = 0
    for other in array:
        if other > height:
            answer+=1
    return answer