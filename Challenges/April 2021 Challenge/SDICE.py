try:
    t = int(input())

    while t != 0:
        N = int(input())
        if(N == 1):
            print(20)
        elif(N == 2):
            print(36)
        elif(N == 3):
            print(51)
        elif(N == 4):
            print(60)
        else:
            remainer = N % 4
            result = ((N - remainer)//4) * 44
            if(remainer == 0):
                result += 16
            elif(remainer == 1):
                result += 32
            elif(remainer == 2):
                result += 44
            elif(remainer == 3):
                result += 55

            print(result)
        t -= 1
except Exception:
    pass
