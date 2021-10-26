n = int(input())

stack = []
answer = []
current = 1
flag = True

for i in range(n):
    num = int(input())

    while current <= num:
        stack.append(current)
        answer.append("+")
        current += 1

    if stack[-1] == num:
        stack.pop()
        answer.append("-")
    else:
        print("NO")
        flag = False
        break

if flag:
    for i in answer:
        print(i)
