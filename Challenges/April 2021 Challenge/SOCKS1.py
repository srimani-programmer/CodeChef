try:
    S1, S2, S3 = [int(x) for x in input().split(" ")]

    if((S1 == S2) or (S1 == S3) or (S2 == S3)):
        print("YES")
    else:
        print("NO")

except Exception:pass