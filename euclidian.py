nums = list(map(int,input().split(" ")))

mod = nums[1]
n = nums[0]
div = 0
if nums[0] < nums[1]:
    mod = nums[0]
    n = nums[1]

while (mod != 0):
    temp = mod
    mod = n % mod
    n = temp
print(n)
print(nums[0] * nums[1] // n)
