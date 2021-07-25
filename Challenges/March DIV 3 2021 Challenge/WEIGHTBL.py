try:
    t = int(input())

    while t != 0:

        w1, w2, x1, x2, M = [int(x) for x in input().split(" ")]

        min_weight = x1 * M
        max_weight = x2 * M
        increased_weight = w2 - w1

        if(increased_weight >= min_weight and increased_weight <= max_weight):
            print("1")
        else:
            print("0")


        t -= 1

except Exception:pass