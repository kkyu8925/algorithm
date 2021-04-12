package lv2.소수찾기;

import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int solution(String numbers) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        permutation("", numbers, set);

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            int a = it.next();
            set.remove(a);
            if (a == 2) {
                count++;
            }
            if (a % 2 != 0 && isPrime(a)) {
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();

        if (!prefix.equals("")) {
            set.add(Integer.valueOf(prefix));
        }
        for (int i = 0; i < n; i++) {
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), set);
        }

    }

}
