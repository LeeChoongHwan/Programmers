number = int(input())

answer = 0

for i in range(1,len(str(number))):
    answer += number % 100
    number //= 100

print(answer)