package inflearn.section05.ex08_응급실;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Main {
    private int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> que = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            que.offer(new Person(i, arr[i]));
        }

        while (!que.isEmpty()) {
            Person person = que.poll();

            for (Person nextPerson : que) {
                if (person.priority < nextPerson.priority) {
                    que.offer(person);
                    person = null;
                    break;
                }
            }

            if (person != null) {
                answer++;
                if (person.id == m) {
                    return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
