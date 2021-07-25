try:
    t = int(input())


    while t != 0:
        input_str = input()
        str_arr = input_str.split('party')
        result = ""

        for i in range(0, len(str_arr)):
            if(i == len(str_arr) - 1):
                result += str_arr[i]
            else:
                result += str_arr[i]
                result += 'pawri'

        print(result)


        t -= 1

except Exception:pass