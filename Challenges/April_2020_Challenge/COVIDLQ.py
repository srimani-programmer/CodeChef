testcase = int(input())

while testcase != 0:
    n = int(input())
    arr = [int(x) for x in input().split()]
    index_array = list()

    for index,value in enumerate(arr):
        if(value == 1):
            index_array.append(index)

    result = "YES"

    for i in range(0,len(index_array)-1):
        if(index_array[i+1] - index_array[i] < 6):
            result = "NO"
            break
    
    print(result)

    testcase -= 1