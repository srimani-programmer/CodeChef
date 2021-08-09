try:
    t = int(input())

    while t != 0:
        RA, WA, CA = [int(x) for x in input().split(" ")]
        RB, WB, CB = [int(x) for x in input().split(" ")]

        a_score = 0
        b_score = 0

        if(RA > RB):
            a_score += 1
        else:
            b_score += 1

        if(WA > WB):
            a_score += 1
        else:
            b_score += 1

        if(CA > CB):
            a_score += 1
        else:
            b_score += 1

        if(a_score > b_score):
            print("A")
        else:
            print("B")

        t -= 1

except Exception:
    pass
