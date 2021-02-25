try:
    testcases = int(input())

    while testcases != 0:

        n = int(input())

        arr = [x for x in input().split(" ")]

        count = 0

        for i in range(0, n - 1):
            for j in range(i+1, n):
                first = arr[j][0] + arr[i][1:]
                second = arr[i][0] + arr[j][1:]
                print(first, second)
                if(first not in arr and second not in arr):
                    count += 2

        print(count)

        testcases -= 1

except Exception:pass