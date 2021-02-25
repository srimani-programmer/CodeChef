try:
    t = int(input())

    while t != 0:

        M, H = [int(x) for x in input().split()]
        bmi = M / (H ** 2)

        if(bmi <= 18):
            print(1)
        elif(bmi >=19 and bmi <= 24):
            print(2)
        elif(bmi >= 25 and bmi <= 29):
            print(3)
        elif(bmi >= 30):
            print(4)

        t -= 1
except Exception:pass