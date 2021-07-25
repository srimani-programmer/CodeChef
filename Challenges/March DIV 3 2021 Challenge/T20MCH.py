try:
    R, O, C = [int(x) for x in input().split(" ")]

    if(C + ((20 - O) * 6 * 6) > R):
        print("YES")
    else:
        print("NO")

except Exception:
    pass
