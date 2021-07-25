try:
    t = int(input())

    while t != 0:
        K1, K2, K3, V = [float(x) for x in input().split(" ")]
        time = 100/(K1 * K2 * K3 * V)
        time = round(time, 2)
        if(time < 9.58):
            print("YES")
        else:
            print("NO")
        t -= 1
except Exception:
    pass
