try:

    t = int(input())

    while t != 0:

        N, M = [int(x) for x in input().split(" ")]
        
        jhon_arr = [int(x) for x in input().split(" ")]
        jack_arr = [int(x) for x in input().split(" ")]


        if(sum(jhon_arr) > sum(jack_arr)):
            print(0)
            t -= 1
            continue

        min_count = 0

        jhon_arr.sort()
        jack_arr.sort(reverse=True)

        if(M > N):
            for i in range(0, N):
                temp = jhon_arr[i]
                jhon_arr[i] = jack_arr[i]
                jack_arr[i] = temp
                min_count += 1

                if(sum(jhon_arr) > sum(jack_arr)):
                    break
        else:
            for i in range(0, M):
                temp = jhon_arr[i]
                jhon_arr[i] = jack_arr[i]
                jack_arr[i] = temp
                min_count += 1

                if(sum(jhon_arr) > sum(jack_arr)):
                    break


        if(sum(jhon_arr) > sum(jack_arr)):
            print(min_count)
        else:
            print(-1)

        t -= 1


except :pass