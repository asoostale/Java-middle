package queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("사람1");
        queue.add("사람2");
        queue.add("사람3");
        System.out.println("queue = " + queue);
        String poll = queue.poll();
        System.out.println("poll = " + poll);
        String poll2 = queue.poll();
        System.out.println("poll = " + poll2);
        System.out.println("queue = " + queue);


    }
}
