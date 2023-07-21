def solution(s):
    cP = s.count('P')
    cp = s.count('p')
    cY = s.count('Y')
    cy = s.count('y')
    
    if ((cp+cP) == (cy+cY)):
        return True
    else:
        return False
    return answer