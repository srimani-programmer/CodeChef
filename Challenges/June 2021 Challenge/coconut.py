try:
    t = int(input())

    while t != 0:
        xa, xb, Xa, Xb = [int(x) for x in input().split(" ")]
        xa_total = Xa // xa
        xb_total = Xb // xb

        print(xa_total + xb_total)
        t -= 1
except Exception:
    pass
