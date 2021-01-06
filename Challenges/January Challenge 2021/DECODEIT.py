try:
    t = int(input())

    # To Store the Repeated Values Result.
    item_value = {}

    # To Calculate the Character
    def findCharacter(main_str, temp_str):
        
        for i in temp_str:
            if(i == "0"):
                main_str = main_str[0 : len(main_str)//2]
            else:
                main_str = main_str[len(main_str)//2 : ]

        # print(main_str)

        return main_str

    while t != 0:

        N = int(input())
        string = input()
        
        mainString = 'abcdefghijklmnop'
        
        decoded_stirng = ""
        
        startIndex = 0

        for i in range(0, N, 4):

            temp_str = string[startIndex : startIndex + 4]

            if(temp_str in item_value.keys()):
                decoded_stirng += item_value[temp_str]
            else:
                item_value[temp_str] = findCharacter(mainString, temp_str)
                decoded_stirng += item_value[temp_str]

            startIndex = i + 4

        print(decoded_stirng)

        t -= 1

except :pass