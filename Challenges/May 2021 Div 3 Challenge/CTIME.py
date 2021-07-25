try:
    t = int(input())

    while t != 0:
        N, K, F = [int(x) for x in input().split(" ")]
        time_arr = [[int(x) for x in input().split(" ")] for i in range(N)]
        time_arr.sort()
        if(time_arr[0][0] > 0):
            K = K - time_arr[0][0]

        for i in range(0, N - 1):
            if((time_arr[i + 1][0] >= time_arr[i][0] and time_arr[i+1][0] < time_arr[i][1]) and time_arr[i+1][1] < time_arr[i][1]):
                time_arr[i+1][0] = time_arr[i][0]
                time_arr[i+1][1] = time_arr[i][1]
            elif((time_arr[i + 1][0] >= time_arr[i][0] and time_arr[i+1][0] < time_arr[i][1]) and time_arr[i+1][1] > time_arr[i][1]):
                time_arr[i+1][0] = time_arr[i][0]
            elif(time_arr[i + 1][0] - time_arr[i][1] > 0):
                K = K - (time_arr[i + 1][0] - time_arr[i][1])

        if(time_arr[-1][1] < F):
            K = K - F

        if K <= 0:
            print("YES")
        else:
            print("NO")

        t -= 1

except Exception:
    pass
