try:
    t = int(input())

    while t != 0:
        N = int(input())
        inputDict = {}
        for i in range(0,N):
            si,pi = input().split(" ")
            si = int(si)
            pi = int(pi)

            if si not in inputDict.keys():
                inputDict[si] = list()
                inputDict[si].append(pi)
            else:
                inputDict[si].append(pi)
        
        maxSum = 0
        for i in inputDict.keys():
            if(i < 9):
                maxSum += max(inputDict[i])
        print(maxSum)
        t -= 1
except :
    pass