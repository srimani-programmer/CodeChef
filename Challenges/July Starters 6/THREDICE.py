try:
    t = int(input())

    while t != 0:
        p1, p2 = [int(x) for x in input().split(" ")]

        if((p1 + p2) >= 6):
            print(0)
        else:
            total = p1 + p2
            print('{0:.6f}'.format((6-total)/6))

        t -= 1

except Exception:
    pass
