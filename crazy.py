n = int(input())
res = []

for index in range(n):
    k = int(input())
    n = int(input())
    arr = [i for i in range(1,15)]
    i = 0
    while (i != k):
        i = i + 1
        j = 0
        while (j != 13):
            j = j + 1
            arr[j] = arr[j - 1] + arr[j]
    res.append(arr[n - 1])

for element in res:
    print(element)
