package lv2.소수찾기;

import java.util.HashSet;
import java.util.Iterator;

class Solution {

    public int solution(String numbers) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        perm("", numbers, set);

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int a = it.next();
            if (a == 2) {
                answer++;
            }
            if (a % 2 != 0 && isPrime(a)) {
                answer++;
            }
        }
        return answer;
    }

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void perm(String prefix, String str, HashSet<Integer> set) {
        if (!prefix.equals("")) {
            set.add(Integer.valueOf(prefix));
        }
        for (int i = 0; i < str.length(); i++) {
            perm(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1), set);
        }

    }

}