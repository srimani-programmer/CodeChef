import sys

t = int(sys.stdin.readline())

while t != 0:
    N, K = input().split()
    N = int(N)
    K = int(K)
    priceArray = [int(x) for x in input().split()]
    lossRevenue = 0
    for i in priceArray:
        if K < i:
            lossRevenue += abs(K - i)
    print(lossRevenue)
    t -= 1