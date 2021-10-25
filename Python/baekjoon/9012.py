cnt = int(input())
for i in range(cnt):
    stack = []
    row = input()
    for char in row:
        if char == '(':
            stack.append(char)
        elif char == ')':
            if stack:
                stack.pop()
            else:
                print("NO")
                break
    else:
        if not stack:
            print("YES")
        else:
            print("NO")
