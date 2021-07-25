try:
    t = int(input())

    while t != 0:
        x, m, d = [int(x) for x in input().split(" ")]

        print(min((x * m), (x + d)))
        t -= 1
except Exception:
    pass
