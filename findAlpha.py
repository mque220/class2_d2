n = list(map(ord, list(input())))
arr = [-1] * 26

for i in range(len(n)):
    if (arr[n[i] - 97] == -1):
        arr[n[i] - 97] = i

for i in arr:
    print(i, end=" ")
print("")