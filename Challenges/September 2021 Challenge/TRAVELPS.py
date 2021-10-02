try:
    t = int(input())

    while(t != 0):
        N, A, B = [int(x) for x in input().split(" ")]
        journey = input()
        totalTimeCount = 0
        for i in range(0, N):
            if journey[i] == '0':
                totalTimeCount += A
            elif journey[i] == '1':
                totalTimeCount += B

        print(totalTimeCount)

        t -= 1
except Exception:
    pass
