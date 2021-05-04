package p5;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {

        Set<Integer> objects = new HashSet<>();
        objects.add(4);
        objects.add(1);
        objects.add(2);
        System.out.println(objects);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        priorityQueue.add(10);
        priorityQueue.add(1);
        priorityQueue.add(20);
        System.out.println(priorityQueue);

        ArrayDeque<Integer> arrayDeque = new ArrayDeque();
        arrayDeque.add(1);
        arrayDeque.addFirst(10);
        arrayDeque.add(20);
        arrayDeque.addLast(11);
        System.out.println(arrayDeque);


    }
}
