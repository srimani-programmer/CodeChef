
# Approach 01 - Patially Executed.
# try:
#     t = int(input())

#     while t != 0:

#         N,K,D = [int(x) for x in input().split(" ")]
#         arr = [int(x) for x in input().split(" ")]

#         total_sum = sum(arr)

#         if(total_sum < K):
#             print(0)
#             t -= 1
#             continue

#         result_count = 0

#         for i in range(0, D):
#             if(total_sum - K >= 0):
#                 result_count += 1
#                 total_sum = total_sum - K
#             else:
#                 break
        
#         print(result_count)
#         del(arr)

#         t -= 1
# except :pass

# Approach 02

try:
    t = int(input())

    while t != 0:
        N,K,D = [int(x) for x in input().split(" ")]
        arr = [int(x) for x in input().split(" ")]

        total_sum = sum(arr)

        if(total_sum < K):
            print(0)
            t -= 1
            continue

        total_events = total_sum // K

        if(total_events > D):
            print(D)
        else:
            print(total_events)
            
        del(arr)

        t -= 1
except :pass