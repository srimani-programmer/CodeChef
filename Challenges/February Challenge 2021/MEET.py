try:
    def clock_converter(start_hour_hand, start_minute_hand, l1_r):

        if(l1_r == 'AM' and int(start_hour_hand) != 12):
            start_hour_hand = int(start_hour_hand)
            start_minute_hand = int(start_minute_hand)
        elif(l1_r == 'PM' and int(start_hour_hand) != 12):
            start_hour_hand = int(start_hour_hand) + 12
            start_minute_hand = int(start_minute_hand)
        elif(l1_r == 'AM' and int(start_hour_hand) == 12):
            start_hour_hand = 0
            start_minute_hand = int(start_minute_hand)
        elif(l1_r == 'PM' and int(start_minute_hand) == 12):
            start_hour_hand = 12
            start_minute_hand = int(start_minute_hand)

        return int(start_hour_hand), int(start_minute_hand)

    t = int(input())

    while t != 0:

        p_time = input()

        n = int(input())
        schedule_array = list()

        for i in range(n):
            schedule_array.append(input())

        # 12:01 AM
        result = ""

        p_time_only, p_hour_rate = p_time.split(' ')
        p_hour_hand, p_minitue_hand = p_time_only.split(':')[0:2]

        p_hour_hand, p_minitue_hand = clock_converter(p_hour_hand, p_minitue_hand, p_hour_rate)

        # 12:00 AM 11:42 PM

        for schedule in schedule_array:
            l1_t, l1_r, r1_t, r1_r = schedule.split(' ')

            start_hour_hand, start_minute_hand = l1_t.split(':')
            end_hour_hand, end_minute_hand = r1_t.split(':')

            start_hour_hand, start_minute_hand = clock_converter(start_hour_hand, start_minute_hand, l1_r)
            end_hour_hand, end_minute_hand = clock_converter(end_hour_hand, end_minute_hand, r1_r)

            start_time = (start_hour_hand * 3600) + (start_minute_hand * 60)
            end_time = (end_hour_hand * 3600) + (end_minute_hand * 60)
            meet_time = (p_hour_hand * 3600) + (p_minitue_hand * 60)
            if((meet_time >= start_time and meet_time <= end_time)):
                result += '1'
            else:
                result += '0'

        print(result)
            
        t -= 1
except Exception:pass