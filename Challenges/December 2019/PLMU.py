try:
    t = int(input())

    while t != 0:
        n= int(input())
        arr = [int(x) for x in input().split(" ")]
        multiplicationRes = []
        AdditionRes = []

        for i in range(0,len(arr)):
            for j in range(i+1,len(arr)):
                multiplicationRes.append(arr[i] * arr[j])
                AdditionRes.append(arr[i] + arr[j])
        resultCount = 0
        for i in multiplicationRes:
            if(i in AdditionRes):
                resultCount += AdditionRes.count(i)
        
        print(resultCount)

        t -= 1
except :
    pass