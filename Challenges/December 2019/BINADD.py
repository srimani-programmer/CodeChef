try:
    t = int(input())

    while t != 0:
        A = int(input(),2)
        B = int(input(),2)
        U = 0
        V = 0
        countValue = 0
        while B > 0:
            U = A ^ B
            V = A & B
            A = U
            B = V * 2
            countValue += 1

        print(countValue)

        t -= 1
except :
    pass