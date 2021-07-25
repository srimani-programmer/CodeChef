try:
    N, H, X = [int(x) for x in input().split(" ")]

    arr = [int(x) for x in input().split(" ")]
    flag = 0
    for i in arr:
        if(X + i >= H):
            flag = 1
            print('YES')
            break
    if(flag == 0):
        print('NO')


except Exception:pass