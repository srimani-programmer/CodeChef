try:
    t = int(input())

    while t != 0:
        N, K = [int(x) for x in input().split()]
        language = input()
        count = 0
        for i in language:
            if(i == '*'):
                count += 1
            elif(count == K):
                break
            else:
                count = 0

        if(count == K):
            print("YES")
        else:
            print("NO")
        t -= 1

except Exception:
    pass
