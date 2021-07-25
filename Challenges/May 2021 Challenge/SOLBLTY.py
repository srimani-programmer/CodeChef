try:
    t = int(input())

    while t != 0:
        X, A, B = [int(x) for x in input().split(" ")]

        initial_degree = (100 - X) * B
        total_degree = A + initial_degree

        print(total_degree * 10)

        t -= 1

except Exception:
    pass
