import sys

t = int(input())

def duplicates(lst, item):
    myList = list()
    for i,x in enumerate(lst):
        if x == item:
            myList.append(i)
            lst[i] = -1
    return myList

while t != 0:
    M, N = input().split()
    M = int(M)
    N = int(N)
    fruits = [int(x) for x in input().split()]
    prices = [int(x) for x in input().split()]
    myResult = sys.maxsize
    

    for i in range(0,len(fruits)):
        if(fruits.count(fruits[i]) > 1):
            myIndices = duplicates(fruits, fruits[i])
            tempSum = 0
            for j in myIndices:
                tempSum += prices[j]
            if(tempSum < myResult):
                myResult = tempSum
        else:
            if(prices[i] < myResult):
                myResult = prices[i]
    
    print(myResult)
            






    t -= 1