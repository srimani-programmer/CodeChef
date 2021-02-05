try:
    testcases = int(input())

    while testcases != 0:

        n = int(input())
        arr = [int(x) for x in input().split(" ")]

        arr.sort()

        x = arr[0]
        y = arr[1]
        z = arr[-1]

        print(abs(x - y) + abs(y - z) + abs(z - x))

        testcases -= 1

except Exception:pass

'''
2 3 4 5 6

1 + 3 + 4 = 8

'''