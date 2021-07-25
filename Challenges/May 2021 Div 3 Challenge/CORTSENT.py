try:
    t = int(input())
    lang1 = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm']
    lang2 = ['N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
    while t != 0:
        arr = [x for x in input().split(" ")]
        length = int(arr[0])
        flag = True
        for i in range(1, length+1):
            if arr[i].islower():
                for j in arr[i]:
                    if j not in lang1:
                        flag = False
                        break
            elif arr[i].isupper():
                for j in arr[i]:
                    if j not in lang2:
                        flag = False
                        break
            else:
                flag = False

        if flag:
            print("YES")
        else:
            print("NO")
        del(arr)
        t -= 1
except Exception:
    pass
