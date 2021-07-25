try:
    t = int(input())

    while t != 0:
        D, d, P, Q = [int(x) for x in input().split(" ")]
        total_sum = 0
        range_count = 0
        for i in range(0, D+1, d):
            if range_count == 0:
                total_sum = total_sum + (d * P)
                print(total_sum)
            else:
                total_sum = total_sum + (P + (range_count * Q))
                print(total_sum)

            range_count += 1

        print(total_sum)
        t -= 1

except Exception:
    pass
