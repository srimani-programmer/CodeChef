try:
    t = int(input())

    while t != 0:

        N, P = [int(x) for x in input().split()]
        score_arr = [int(x) for x in input().split()]
        participants_list = list()

        for i in range(N):
            participants_list.append(input())

        for solved in participants_list:
            total_score = 0
            for item in range(0, len(solved)):
                if(solved[item] == '1'):
                    total_score += score_arr[item]
            print(total_score)
        t -= 1
except Exception:pass