import sys
import psyco

psyco.full()
t = int(sys.stdin.readline())
def getCount(n):
    result = 0
    while n > 0:
        if(n % 2 == 1):
            result += 1
        n = n//2
    return result
        
while t != 0:

    N, Q = map(int, sys.stdin.readline().split())
    questions = [int(x) for x in sys.stdin.readline().split()]
    for i in range(0,Q):
        P = int(input())
        evenCount = 0
        oddCount = 0
        
        for i in questions: 
            result = getCount(P ^ i)     
            if(result % 2 == 0):
                evenCount += 1
            else:
                oddCount += 1

        sys.stdout.write('{} {}\n'.format(evenCount, oddCount))

    t -= 1


