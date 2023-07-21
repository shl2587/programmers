def solution(arr):
    sum = 0
    for i in range(0, len(arr)):
        sum += arr[i]
    answer = sum / len(arr)
    return answer