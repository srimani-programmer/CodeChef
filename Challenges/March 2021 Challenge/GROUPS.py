try:
    t = int(input())

    while t != 0:
        seat = input()
        if(len(seat) == 1):
            if(seat[0] == '1'):
                print('1')
            else:
                print('0')
        else:
            count = 0
            groups = seat.split('0')

            for i in groups:
                if(len(i) >= 1):
                    count += 1

            print(count)

        t -= 1

except Exception:pass