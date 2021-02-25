try:
    t = int(input())

    while t != 0:

        n = int(input())
        patient_arr = [int(x) for x in input().split(" ")]

        patient_sorted = sorted(patient_arr, reverse=True)
        time_dict = dict()

        for i in range(0, n):
            if(patient_sorted[i] in time_dict.keys()):
                temp_arr = time_dict[patient_sorted[i]]
                temp_arr.append(i + 1)
                time_dict[patient_sorted[i]] = temp_arr
            else:
                time_dict[patient_sorted[i]] = [i+1]
        
        # print(time_dict)
        for i in range(0, n):
            if(i != n - 1):
                if(len(time_dict[patient_arr[i]]) > 1):
                    print(time_dict[patient_arr[i]][0], end=" ")
                    temp_arr = time_dict[patient_arr[i]]
                    temp_arr.remove(temp_arr[0])
                    time_dict[patient_arr[i]] = temp_arr
                else:
                    print(time_dict[patient_arr[i]][0], end=" ")
            else:
                if(len(time_dict[patient_arr[i]]) > 1):
                    print(time_dict[patient_arr[i]][0])
                    temp_arr = time_dict[patient_arr[i]]
                    temp_arr.remove(temp_arr[0])
                    time_dict[patient_arr[i]] = temp_arr
                else:
                    print(time_dict[patient_arr[i]][0])
        
        del(time_dict)
        t -= 1
except Exception:pass