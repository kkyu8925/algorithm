def fun(n):
    result = n
    while n > 0:
        result += n % 10
        n = n // 10
    return result


not_self_num = set()
for num in range(1, 10001):
    result = fun(num)
    if result < 10001:
        not_self_num.add(result)

for num in range(1, 10001):
    if num not in not_self_num:
        print(num)
