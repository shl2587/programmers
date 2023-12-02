def solution(dot):
    answer = 0
    x = dot[0]
    y = dot[1]
    result = x * y
    
    if x < 0:
        if result < 0:
            answer = 2
        if result > 0:
            answer = 3
    if x > 0:
        if result > 0:
            answer = 1
        if result < 0:
            answer = 4
   
    
    
    return answer