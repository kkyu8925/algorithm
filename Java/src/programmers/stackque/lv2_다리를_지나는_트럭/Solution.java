package programmers.stackque.lv2_다리를_지나는_트럭;

import java.util.*;

class Truck {
    int weight;
    int move;

    public Truck(int weight) {
        this.weight = weight;
        this.move = 1;
    }

    public void moving() {
        move++;
    }
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Truck> waitQ = new LinkedList<>();
        Queue<Truck> moveQ = new LinkedList<>();

        for (int t : truck_weights) {
            waitQ.offer(new Truck(t));
        }

        int answer = 0;
        int currentWeight = 0;

        while (!waitQ.isEmpty() || !moveQ.isEmpty()) {

            answer++;

            if (moveQ.isEmpty()) {
                Truck truck = waitQ.poll();
                currentWeight += truck.weight;
                moveQ.offer(truck);
                continue;
            }

            for (Truck truck : moveQ) {
                truck.moving();
            }

            if (moveQ.peek().move > bridge_length) {
                Truck truck = moveQ.poll();
                currentWeight -= truck.weight;
            }

            if (!waitQ.isEmpty() && currentWeight + waitQ.peek().weight <= weight) {
                Truck truck = waitQ.poll();
                currentWeight += truck.weight;
                moveQ.offer(truck);
            }
        }

        return answer;
    }
}
