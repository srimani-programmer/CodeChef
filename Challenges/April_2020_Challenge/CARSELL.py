testcase = int(input())

while testcase != 0:
    M = 1000000007
    n = int(input())
    arr = [int(x) for x in input().split()]
    total_profit = 0
    index_count = 0
    arr.sort()

    while index_count <= n - 1:
        if(arr[-1] - index_count <= 0):
            arr.pop()
            index_count += 1
        else:
            total_profit += (arr[-1] - index_count)
            arr.pop() 
            index_count += 1
                

    print(total_profit % M)    
    testcase -= 1