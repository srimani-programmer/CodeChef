import sys

testCases = sys.stdin.readline()
testCases = int(testCases)

def fib(n):
    Fibarr = list()
    Fibarr.append(0)
    Fibarr.append(1)

    for i in range(2,n):
        Fibarr.append(Fibarr[i-1] + Fibarr[i-2])
    
    return Fibarr

def easyFibvalue(fibresult):
    newList = list()
    for i in range(0,len(fibresult)):
        if((i+1)%2 == 0):
            newList.append(fibresult[i])
    
    #print(newList)
    if(len(newList) == 1):
        print(newList[-1])
    else:
        fibresult = newList
        easyFibvalue(fibresult)
        newList.clear()
        del(newList)

while testCases != 0:
    n = sys.stdin.readline()
    n = int(n)
    FibonacciResult = fib(n)
   # print(FibonacciResult)
    easyFibvalue([x%10 for x in FibonacciResult])
    testCases -= 1


